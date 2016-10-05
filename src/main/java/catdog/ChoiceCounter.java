package hello;

//import org.springframework.data.annotation.Id;


public class ChoiceCounter {

   //@Id
    public String id;

    public String choice;
    public int voteCount;

    public ChoiceCounter() {}

    public ChoiceCounter(String choice, int voteCount) {
        this.choice = choice;
        this.voteCount = voteCount;
    }

   // @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, choice='%s', voteCount='%s']",
                id, choice, voteCount);
    }

}
