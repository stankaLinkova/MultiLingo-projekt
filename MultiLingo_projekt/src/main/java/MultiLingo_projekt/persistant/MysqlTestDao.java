package MultiLingo_projekt.persistant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import MultiLingo_projekt.entity.Test;


public class MysqlTestDao implements TestDao {
	
	private JdbcTemplate jdbcTemplate;

//	public MysqlWorkshopDao(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	

	public List<Test> getAll() {
		String sql = "SELECT id, name, start, end, price_full, price_student, "
				+ "price_full_late, price_student_late "
				+ "FROM workshop";
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(WorkShop.class));
//		return jdbcTemplate.query(sql, new RowMapper<Test>() {
//
//			public Test mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Test workShop = new Test();
//				workShop.setId(rs.getLong("id"));
//				workShop.setName(rs.getString("name"));
//				Timestamp timestamp = rs.getTimestamp("start");
//				if (timestamp != null) {
//					workShop.setStart(timestamp.toLocalDateTime().toLocalDate());
//				}
//				timestamp = rs.getTimestamp("end");
//				if (timestamp != null) {
//					workShop.setEnd(timestamp.toLocalDateTime().toLocalDate());
//				}
//				workShop.setPriceFull(rs.getDouble("price_full"));
//				workShop.setPriceStudent(rs.getDouble("price_student"));
//				workShop.setPriceFullLate(rs.getDouble("price_full_late"));
//				workShop.setPriceStudentLate(rs.getDouble("price_student_late"));
//				return workShop;
//			}
//			
//		});
		return null;
	}

	public Test save(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}


}
