package MultiLingo_projekt.persistant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.Student;



public class MysqlCourseDao implements CourseDao {
	
	private JdbcTemplate jdbcTemplate;

	public MysqlCourseDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Course> getAll() {
		String sql = "SELECT idCourse, language_taught, taught_in, level, start_of_course, end_of_course, "
				+ "time_of_lecture, information, School_id_School "
			+ "FROM Course";

		return jdbcTemplate.query(sql, new RowMapper<Course>() {

				public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
					Course course = new Course();
					course.setId(rs.getLong("id"));
					course.setLanguageTaught(rs.getString("tanguage_tought"));
					course.setTaughtIn(rs.getString("taught_in"));
					course.setLevel(rs.getString("level"));
					
					
					Timestamp timestamp = rs.getTimestamp("start_of_course");
					if (timestamp != null) {
						course.setStartOfCourse(timestamp.toLocalDateTime().toLocalDate());
					}
					
					timestamp = rs.getTimestamp("end_of_course");
					if (timestamp != null) {
						course.setEndOfCourse(timestamp.toLocalDateTime().toLocalDate());
					}
					
					course.setTimeOfLectures(rs.getString("time_of_lecture"));
					course.setInformation(rs.getString("information"));
					course.setSchoolId(rs.getLong("School_idSchool"));
					return course;
			
			}			
		});
		
	}

	public Course save(Course course) {
		if (course == null)
			return null;
		if (course.getId() == null) { 
			SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
			simpleJdbcInsert.withTableName("Course");
			simpleJdbcInsert.usingGeneratedKeyColumns("idCourse");
			simpleJdbcInsert.usingColumns("language_taught", "taught_in", "level", "start_of_course",
					"end_of_course", "time_of_lectures", "information", "School_idSchool");
			Map<String,Object> values = new HashMap<String, Object>();
			values.put("language_taught",course.getLanguageTaught());
			values.put("taught_in",course.getTaughtIn());
			values.put("level", course.getLevel());
			values.put("start_of_course", course.getStartOfCourse());
			values.put("end_of_course", course.getEndOfCourse());
			values.put("time_of_lectures", course.getTimeOfLectures());
			values.put("information", course.getInformation());
			values.put("School_idSchool", course.getSchoolId());
			
			Long id = simpleJdbcInsert.executeAndReturnKey(values).longValue();
			course.setId(id);
		} else { 
			String sql = "UPDATE Course SET "
					+ "language_taught = ?, taught_in = ?, level = ?, start_of_course = ?, "
					+ "end_of_course = ?, time_of_lectures = ?, information = ?, School_idSchool = ? "
					+ "WHERE id = ?";
			jdbcTemplate.update(sql,
					course.getLanguageTaught(), course.getTaughtIn(), course.getLevel(),
					course.getStartOfCourse(), course.getEndOfCourse(), course.getTimeOfLectures(), 
					course.getInformation(), course.getSchoolId(), course.getId());
		}
		return course;
	}

	public void delete(long id) {
		String sql = "DELETE FROM Course WHERE id = " + id;
		jdbcTemplate.update(sql);
		
	}

	public List<Student> getStudentsTakenTheCourse(long idStudent) {
		//TODO find out if necessary
		return null;
	}


}
