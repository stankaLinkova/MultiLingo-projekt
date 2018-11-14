package MultiLingo_projekt.persistant;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import MultiLingo_projekt.entity.School;


public class MysqlSchoolDao implements SchoolDao {
	
	private JdbcTemplate jdbcTemplate;

//	public MysqlWorkshopDao(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	

	public void add(School school) {
		// TODO Auto-generated method stub
		
	}

	public List<School> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(School school) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		String sql = "DELETE FROM workshop WHERE id = " + id;
		jdbcTemplate.update(sql);
		
	}



}
