package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.Student;


public interface CourseDao {

	List<Course> getAll();
	
	Course save(Course course);
	
	List<Student> getStudentsTakenTheCourse(long idCourse);
	
	void delete(long id);
}
