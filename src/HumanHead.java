public class HumanHead {

    private String Hair;
    private String Eyes;
    private String Mouth;
    private String Cheeks;
    private String Nose;
    private String Ears;
    private String FacialHair;


    public HumanHead(String Hair, String Eyes, String Mouth, String Cheeks, String Nose, String Ears, String FacialHair) {
        this.Hair = Hair;
        this.Eyes = Eyes;
        this.Mouth = Mouth;
        this.Cheeks = Cheeks;
        this.Nose = Nose;
        this.Ears = Ears;
        this.FacialHair = FacialHair;

    }

    @Override
    public String toString() {
        return "This human's hair is "+ Hair +", eyes are "+ Eyes +", mouth is "+ Mouth + ", cheeks are "+ Cheeks +", nose is "
                        + Nose +", ears are " + Ears +" and " + FacialHair + " facial hair.";

    }
}