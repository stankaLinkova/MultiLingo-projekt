package PaZ1c.MultiLingo_projekt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.persistant.DaoFactory;
import MultiLingo_projekt.persistant.SchoolDao;

class MysqlSchoolDaoTest {

	private SchoolDao schoolDao = DaoFactory.INSTANCE.getSchoolDao();
	private School school = new School();
	private long id;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

//	@Test
//	void testSave() {
//		int beforeSave = schoolDao.getAll().size();
//		schoolDao.save(school);
//		int afterSave = schoolDao.getAll().size();
//		assertTrue(beforeSave == afterSave - 1);
//	}

	
	// nemame metodu GETALL..taze zatial neviem
	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllMyCourses() {
		assertTrue(schoolDao.getAllMyCourses(id).size() == 0);
	}

	@Test
	void testGetAllMyTests() {
		assertTrue(schoolDao.getAllMyTests(id).size() == 0);
	}

}
