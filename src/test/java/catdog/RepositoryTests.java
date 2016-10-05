package hello;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {

//    @Autowired
    ChoiceRepository repository;

    Choice cat, dog;

// TODO: add in a setup method and a method to test deleteAll, getByChoice, and incrementing a choice's voteCount.    
}
