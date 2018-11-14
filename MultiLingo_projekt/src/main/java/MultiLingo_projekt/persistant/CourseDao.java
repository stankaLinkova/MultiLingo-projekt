package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Course;


public interface CourseDao {

	List<Course> getAll();
	
	Course save(Course course);
	
	void delete(long id);
}
