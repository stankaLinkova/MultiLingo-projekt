package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.School;
import MultiLingo_projekt.entity.Test;

public interface SchoolDao {

	School save(School school);

	void delete(long id);

	List<School> getAllMyCourses();
	
	List<Test> getAllMyTests();

	Boolean isRegistrated(String login);

	Boolean correctPassword(String passsword);

}
