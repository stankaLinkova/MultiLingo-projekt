package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Test;

public interface TestDao {

	List<Test> getAll();

	Test save(Test test);

	void delete(long id);
}
