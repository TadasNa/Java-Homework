public class HumanBody {

    private final String Neck;
    private final String Torso;
    private final String Legs;
    private final String Arms;

    public HumanBody(String Neck, String Torso, String Legs, String Arms){

        this.Neck = Neck;
        this.Torso = Torso;
        this.Legs = Legs;
        this.Arms = Arms;


        }
        @Override
        public String toString(){
            return "Human's body description: neck is "+ Neck +", torso "+ Torso +", legs " + Legs +" and arms " + Arms;
    }


}
