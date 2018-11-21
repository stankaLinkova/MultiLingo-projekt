package MultiLingo_projekt.persistant;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import MultiLingo_projekt.entity.Course;

class MysqlCourseDaoTest {

	private CourseDao courseDao = DaoFactory.INSTANCE.getCourseDao();
	
	@Test
	void testGetAll() {
		assertTrue(courseDao.getAll().size() == 0);
	}

	@Test
	void testSave() {
		Course course = new Course();
		
		int beforeSave = courseDao.getAll().size();
		courseDao.save(course);
		int afterSave = courseDao.getAll().size();
		assertTrue(beforeSave == afterSave - 1);
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStudentsTakenTheCourse() {
		fail("Not yet implemented");
	}

}
