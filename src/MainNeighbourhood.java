
public class MainNeighbourhood {
    public static void main(String[] args) {
        Furniture Chair = new Furniture("Chair", 0.69f,0.69f, 1);
        Furniture Table = new Furniture("Table", 1.69f,1.10f, 1);
        Furniture Couch = new Furniture("Couch", 1.69f,1.20f, 0.69f);
        Furniture ChestOfDrawers = new Furniture("Chest Of Drawers", 2.69f,0.69f, 1.10f);
        Furniture Bookcase = new Furniture("Bookcase", 1.69f,0.69f, 2.20f);
        Furniture Sink = new Furniture("Sink", 0.69f,1.35f, 1);
        Furniture Dresser = new Furniture("Dresser", 0.69f,0.99f, 1);
        Furniture Bed = new Furniture("Bed", 2.20f,1.69f, 0.75f);
        Furniture Wardrobe = new Furniture("Wardrobe", 3.69f,1.10f, 2.49f);
        Furniture OfficeChair = new Furniture("Office Chair", 0.69f,0.69f, 1.55f);
        Furniture TableTop = new Furniture("Table Top", 1.10f,1.10f, 1);
        Furniture Bath = new Furniture("Bath", 1.80f,0.60f, 0.69f);


        Furniture [] LivingRoomFurn = {Couch, OfficeChair, Table, ChestOfDrawers, Bookcase};
        Furniture [] KitchenFurn = {Chair, Chair, Table, Sink, Dresser, Dresser, Dresser, TableTop, TableTop};
        Furniture [] BathroomFurn = {Sink, Bath};
        Furniture [] BedroomFurn = {Bed, Wardrobe, ChestOfDrawers};
        Furniture [] KidsRoomFurn = {Bed, Dresser, Bookcase};
        Furniture [] AtticFurn = {Dresser, Dresser, Bookcase, Sink, ChestOfDrawers};

        Room LivingRoom = new Room("Living Room", 7.40f,3.90f,2.80f,LivingRoomFurn);
        Room Kitchen = new Room("Kitchen", 3.40f,3.70f,2.80f,KitchenFurn);
        Room Bathroom = new Room("Bathroom", 3.40f,3.90f,2.80f,BathroomFurn);
        Room Bedroom = new Room("Bedroom", 7.40f,3.40f,2.80f,BedroomFurn);
        Room KidsRoom = new Room("Kids Room", 6.40f,4.90f,2.80f,KidsRoomFurn);
        Room Attic = new Room("Attic", 7.40f,1.90f,1.60f,AtticFurn);

        Room [] RoomSet1 = {LivingRoom, Kitchen, Bathroom, Bedroom};
        Room [] RoomSet2 = {LivingRoom, Kitchen, Bathroom, Bedroom, KidsRoom};
        Room [] RoomSet3 = {LivingRoom, Kitchen, Bathroom, Bedroom, KidsRoom, Attic};
        Room [] RoomSet4 = {LivingRoom, Kitchen, Bathroom, Bathroom, KidsRoom, KidsRoom, Bedroom};
        Room [] RoomSet5 = {LivingRoom, Kitchen, KidsRoom, Kitchen, Bathroom, Bathroom, Bedroom, Bedroom, Bedroom};

        House house1 = new House(RoomSet1);
        House house2 = new House(RoomSet2);
        House house3 = new House(RoomSet3);
        House house4 = new House(RoomSet4);
        House house5 = new House(RoomSet5);
        House house6 = new House(RoomSet4);
        House house7 = new House(RoomSet2);
        House house8 = new House(RoomSet1);
        House house9 = new House(RoomSet3);

        House [] HouseSet1 = {house1, house2, house3, house4, house5, house6, house7};
        House [] HouseSet2 = {house3, house4, house3, house4, house2, house8, house9, house1, house2, house5};
        House [] HouseSet3 = {house8, house7, house6, house5, house8, house2, house3, house4, house5, house2, house3, house6, house7};

        Street Zamenhofo = new Street("Kaunas", "Zamenhofo gatve", HouseSet1);
        Street BrukniuTakas = new Street("Kaunas", "Brukniu takas", HouseSet2);
        Street GelezinioVilko = new Street("Kaunas", "Gelezinio vilko gatve", HouseSet3);

        System.out.println(Zamenhofo.toString());
        System.out.println("--------------------------------------------------------------");
        System.out.println(BrukniuTakas.toString());
        System.out.println("--------------------------------------------------------------");
        System.out.println(GelezinioVilko.toString());


    }
}
