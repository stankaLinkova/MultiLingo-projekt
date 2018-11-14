package MultiLingo_projekt.persistant;

import java.util.List;

import MultiLingo_projekt.entity.Question;


public interface QuestionDao {

	List<Question> getAll();
	
	Question save(Question question);
	
	void delete(long id);
}
