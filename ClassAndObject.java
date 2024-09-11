package loops;

public class ClassAndObject {

    public static void main(String[] args) {
        // here object creation
        Houses house1 = new Houses(4, "Yellow", 6);
        Houses house2 = new Houses(7, "Blue", 11);

        String n = house1.getDetails();
        String n1 = house2.getDetails();
        System.out.println(n);
        System.out.println(n1);

    }

}

class Houses {

    int rooms;
    String color;
    int windows;

    public Houses(int rooms, String color, int windows) {
        this.rooms = rooms;
        this.color = color;
        this.windows = windows;
    }

    public String getDetails() {
        return "Rooms = " + rooms + ", Color = " + color + ", Windows = " + windows;
    }
}

// Create a Java class called House. The class should have the following
// attributes:

// rooms (int)
// color (String)
// windows (int)
// Create a constructor to initialize these attributes, and then create two
// objects of the House class representing two different houses with different
// properties.

// Once you've created the class and objects, display the details of each house.