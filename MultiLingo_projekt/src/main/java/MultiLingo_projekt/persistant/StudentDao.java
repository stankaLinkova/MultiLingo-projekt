package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.entity.Student;
import MultiLingo_projekt.entity.Test;


public interface StudentDao {

	Student save(Student student);

	void delete(long id);

	List<Object[]> getCompletedTests(long idStudent);

	List<Course> getMyCourses(long idStudent);
	
	void joinTheCourse(Student student, Course course);
 
	
}
