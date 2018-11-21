package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Course;
import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.entity.Test;

public interface SchoolDao {

	School save(School school);

	void delete(long id);

	List<Course> getAllMyCourses(long idSchool);
	
	List<Test> getAllMyTests(long idSchool);

}
