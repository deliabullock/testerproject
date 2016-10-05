package hello;

import java.util.List;

//import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChoiceRepository {//extends MongoRepository<ChoiceCounter, String> {

    public ChoiceCounter findByChoice(String choice);

}
