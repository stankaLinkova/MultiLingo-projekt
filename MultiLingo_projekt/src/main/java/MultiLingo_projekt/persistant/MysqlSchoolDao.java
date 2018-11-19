package MultiLingo_projekt.persistant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.entity.Test;


public class MysqlSchoolDao implements SchoolDao {
	
	private JdbcTemplate jdbcTemplate;

	public MysqlSchoolDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public School save(School school) {
		if (school == null)
			return null;
		if (school.getId() == null) { 
			SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
			simpleJdbcInsert.withTableName("School");
			simpleJdbcInsert.usingGeneratedKeyColumns("idSchool");
			simpleJdbcInsert.usingColumns("Name", "Address", "Email", "login",
					"password");
			Map<String,Object> values = new HashMap<String, Object>();
			values.put("Name",school.getName());
			values.put("Address",school.getAddress());
			values.put("Email", school.getEmail());
			values.put("Login", school.getLogin());
			values.put("Password", school.getPassword());
			Long id = simpleJdbcInsert.executeAndReturnKey(values).longValue();
			school.setId(id);
		} else { 
			String sql = "UPDATE School SET "
					+ "Name = ?, Address = ?, Email = ?, login = ?, "
					+ "password = ? "
					+ "WHERE idSchool = ?";
			jdbcTemplate.update(sql,school.getName(),school.getAddress(),
					school.getEmail(), school.getLogin(),
					school.getPassword(),school.getId());
		}
		return school;
	}
		
	

	public void delete(long id) {
		String sql = "DELETE FROM School WHERE id = " + id;
		jdbcTemplate.update(sql);
		
	}


	public List<School> getAllMyCourses() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Test> getAllMyTests() {
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean isRegistrated(String login) {
		// TODO Auto-generated method stub
		return null;
	}


	public Boolean correctPassword(String passsword) {
		// TODO Auto-generated method stub
		return null;
	}



}
