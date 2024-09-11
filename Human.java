package loops;

/**
 * Human
 */
public class Human {
    String name;
    int age;
    char gender = 'M';
    double height;

    public Human(int age, String name, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;

    }

    public static void main(String[] args) {
        Human humans = new Human(22, "lokesh", 'M', 5.8);
        Human humans1 = new Human(21, "mukesh", 'M', 5.3);

        System.out.println(humans.age + " " + humans.name + " " + humans.gender + " " + humans.height);
        System.out.println(humans1.age + " " + humans1.name + " " + humans1.gender + " " + humans1.height);

    }
}