package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Student;


public interface StudentDao {

	void add(Student student);

	List<Student> getAll();
	
	void save(Student student);
}
