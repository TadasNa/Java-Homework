import java.time.LocalDate;

public class Furniture {
    private String Name;
    private float Length;
    private float Width;
    private float Height;

    public Furniture(String name, float length, float width, float height) {

        Name = name;
        Length = length;
        Width = width;
        Height = height;
    }
    @Override
    public String toString() {
        return "\n\t\t" + Name +"\t Height = " + Height + ", Width = " + Width + ", Length = " + Length;
    }
}
