package MultiLingo_projekt.persistant;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public enum DaoFactory {
	
	INSTANCE;

	private JdbcTemplate jdbcTemplate;
	private CourseDao courseDao;
	private SchoolDao schoolDao;
	private QuestionDao questionDao;
	private StudentDao studentDao;
	private TestDao testDao;
	
	public CourseDao getCourseDao() {
		if (courseDao == null)
			courseDao = new MysqlCourseDao();
		return courseDao;
	}
	
	public SchoolDao getSchoolDao() {
		if (schoolDao == null)
			schoolDao = new MysqlSchoolDao();
		return schoolDao;
	}
	
	public QuestionDao getQuestionDao() {
		if (questionDao == null)
			questionDao = new MysqlQuestionDao();
		return questionDao;
	}
	
	public StudentDao getStudentDao() {
		if (studentDao == null)
			studentDao = new MysqlStudentDao();
		return studentDao;
	}
	
	
	public TestDao getTestDao() {
		if (testDao == null)
			testDao = new MysqlTestDao();
		return testDao;
	}
	
	
}
