import java.util.Arrays;

public class Room {

    private String Name;
    private float Length;
    private float Width;
    private float Height;
    private  Furniture [] FurnitureArray;

    public Room(String name, float length, float width, float height, Furniture [] furnitureArray) {

        Name = name;
        Length = length;
        Width = width;
        Height = height;
        FurnitureArray = furnitureArray;
    }

    @Override
    public String toString() {
        return  "\n\t"+ Name + ":\t" +
                " Height = " + Height +
                ", Width = " + Width +
                ", Length = " + Length +
                "\n\t\tFurniture:" + Arrays.toString(FurnitureArray) + "\n";
    }
}
