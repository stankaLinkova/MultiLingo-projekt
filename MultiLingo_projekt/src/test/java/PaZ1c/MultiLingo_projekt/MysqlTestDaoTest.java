package MultiLingo_projekt.persistant;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import MultiLingo_projekt.entity.Test;

class MysqlTestDaoTest {
	
	
	//TODO aj @test aj entita sa volaju ROVNAKO, eclipse ma PROBLEM!!!
	private TestDao testDao = DaoFactory.INSTANCE.getTestDao();
	private Test test = new Test();
	private long id;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testGetAll() {
		assertTrue(testDao.getAll().size() == 0);
	}

	@Test
	void testSave() {
		int beforeSave = testDao.getAll().size();
		testDao.save(test);
		int afterSave = testDao.getAll().size();
		assertTrue(beforeSave == afterSave - 1);
	}

	@Test
	void testDelete() {
		int beforeDelete = testDao.getAll().size();
		testDao.delete(id);
		int afterDelete = testDao.getAll().size();
		assertTrue(beforeDelete == afterDelete + 1);
	}

}
