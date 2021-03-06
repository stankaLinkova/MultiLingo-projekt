package MultiLingo_projekt.persistant;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.entity.Student;

public class SingIn {

	private String login;
	private String password;
	private long idSchool;
	private long idStudent;

	private JdbcTemplate jdbcTemplate;

	public SingIn(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// metody
	public Object signIn(String log, String passwd) {
		String sql = "SELECT Student_idStudent, School_idSchool FROM Sign_in WHERE login = ? AND password = ?";

		return jdbcTemplate.query(sql, new Object[] { log, passwd }, new RowMapper<Object>() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Object[] values = new Object[2];
				values[0] = rs.getString("Student_idStudent");
				values[1] = rs.getString("School_idSchool");

				if (values[0] != null || values[0] != (Integer) 0) {
					Student result = new Student();
					result.setId((Long) values[0]);
					return result;
				}

				if (values[1] != null || values[1] != (Integer) 0) {
					School result = new School();
					result.setId((Long) values[0]);
					return result;
				}

				return null;

			}
		});

	}

	// gettre settre
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getIdSchool() {
		return idSchool;
	}

	public void setIdSchool(long idSchool) {
		this.idSchool = idSchool;
	}

	public long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(long idStudent) {
		this.idStudent = idStudent;
	}

}
