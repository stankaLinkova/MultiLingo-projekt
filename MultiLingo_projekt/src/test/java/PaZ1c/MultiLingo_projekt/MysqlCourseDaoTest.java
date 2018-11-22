package PaZ1c.MultiLingo_projekt;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.persistant.CourseDao;
import MultiLingo_projekt.persistant.DaoFactory;

class MysqlCourseDaoTest {

	private CourseDao courseDao = DaoFactory.INSTANCE.getCourseDao();
	private Course course = new Course();
	private long id;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAll() {
		assertTrue(courseDao.getAll().size() == 1);
	}

	@Test
	void testSave() {
		Course course = new Course();
		course.setLanguageTaught("English");
		course.setTaughtIn("Slovak");
		course.setLevel("B2");
		course.setStartOfCourse(LocalDate.of(2018, 11, 5));
		course.setEndOfCourse(LocalDate.of(2018, 12, 5));
		course.setTimeOfLectures("16:30");
		course.setSchoolId(1L);
		int beforeSave = courseDao.getAll().size();
		courseDao.save(course);
		int afterSave = courseDao.getAll().size();
		assertTrue(beforeSave == afterSave - 1);
	}

	@Test
	void testDelete() {
		int beforeDelete = courseDao.getAll().size();
		courseDao.delete(id);
		int afterDelete = courseDao.getAll().size();
		assertTrue(beforeDelete == afterDelete + 1);
	}

	@Test
	void testGetStudentsTakenTheCourse() {
		fail("Not yet implemented");
	}

}
