package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.School;


public interface SchoolDao {

	void add(School school);

	List<School> getAll();
	
	void save(School school);
	
}
