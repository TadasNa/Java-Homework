import java.time.*;

public class HumanDetails {

    private String Name;
    private LocalDate Birthday;
    private String Sex;

    public HumanDetails(String Name, LocalDate Birthday, String Sex) {

        this.Name = Name;
        this.Birthday = Birthday;
        this.Sex = Sex;
    }

    @Override
    public String toString() {
        return "We created a human. It's name is " + Name + " ,his/her birthday is on " + Birthday + ", it was born as a " + Sex + " human.";
    }
}
