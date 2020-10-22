import java.time.LocalDate;

public class Human {

    public static void main(String[] args) {

        HumanHead Head1 = new HumanHead("Curly", "Brown", "Small", "Big", "Big", "Medium","No");
        HumanBody Body1 = new HumanBody("Thick", "Muscular", "Tiny", "Short");
        HumanDetails Details1 = new HumanDetails("Bob", LocalDate.of(1995,10,24), "Male");

        System.out.println(Details1);
        System.out.println(Head1);
        System.out.println(Body1);
    }
}
