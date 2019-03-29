package at.nacs.todos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodosRepository extends MongoRepository<ToDo, String> {
}
