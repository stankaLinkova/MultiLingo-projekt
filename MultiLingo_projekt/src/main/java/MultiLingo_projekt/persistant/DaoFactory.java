package MultiLingo_projekt.persistant;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;


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
	
	private JdbcTemplate getJdbcTemplate() {
		if (jdbcTemplate == null) {
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("registracia_itat");
			dataSource.setPassword("paz1c");
//			dataSource.setDatabaseName("registracia_itat");
			dataSource.setUrl("jdbc:mysql://localhost/registracia_itat?serverTimezone=Europe/Bratislava");
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
		return jdbcTemplate;
	}
	
}
