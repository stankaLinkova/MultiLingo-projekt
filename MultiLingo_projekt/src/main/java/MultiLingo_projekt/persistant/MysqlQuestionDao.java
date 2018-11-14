package MultiLingo_projekt.persistant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import MultiLingo_projekt.entity.Question;



public class MysqlQuestionDao implements QuestionDao {
	
	private JdbcTemplate jdbcTemplate;

//	public MysqlWorkshopDao(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//}

	public List<Question> getAll() {
		
		String sql = "SELECT id, name, start, end, price_full, price_student, "
				+ "price_full_late, price_student_late "
				+ "FROM workshop";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(WorkShop.class));
//		return jdbcTemplate.query(sql, new RowMapper<Question>())
				

		return null;
	}

	public Question save(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Question question = new Question();
//		question.setId(rs.getLong("idQuestion"));
//		question.setTask(rs.getString("task"));
//		question.setRightAnswer(rs.getString("right_answer"));
//		question.setWrongAnswer1(rs.getString("wrong_answer_1"));
//		question.setWrongAnswer2(rs.getString("wrong_answer_2"));
//		question.setWrongAnswer3(rs.getString("wrong_answer_3"));
//		question.setWrongAnswer4(rs.getString("wrong_answer_4"));
//		question.setIdTest(rs.getLong("Test_idTest"));
//		
//	
//		return question;
//	return null;
//}
//
//	
	

}
