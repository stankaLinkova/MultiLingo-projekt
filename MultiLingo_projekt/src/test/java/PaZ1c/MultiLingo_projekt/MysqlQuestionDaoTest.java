package PaZ1c.MultiLingo_projekt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.Question;
import MultiLingo_projekt.persistant.DaoFactory;
import MultiLingo_projekt.persistant.QuestionDao;

class MysqlQuestionDaoTest {

	private QuestionDao questionDao = DaoFactory.INSTANCE.getQuestionDao();
	private Question question = new Question();
	private long id;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testGetAll() {
		assertTrue(questionDao.getAll().size() == 0);
	}

	@Test
	void testSave() {
		int beforeSave = questionDao.getAll().size();
		questionDao.save(question);
		int afterSave = questionDao.getAll().size();
		assertTrue(beforeSave == afterSave - 1);
	}

	@Test
	void testDelete() {
		int beforeDelete = questionDao.getAll().size();
		questionDao.delete(id);
		int afterDelete = questionDao.getAll().size();
		assertTrue(beforeDelete == afterDelete + 1);
	}

}
