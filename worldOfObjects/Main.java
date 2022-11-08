package worldOfObjects;
 
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car();
        // System.out.println(nissan.make);
        // System.out.println(nissan.price);
        // System.out.println(nissan.year);
        // System.out.println(nissan.color);

        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "red";

        // System.out.println(nissan.make);
        // System.out.println(nissan.price);
        // System.out.println(nissan.year);
        // System.out.println(nissan.color);

        System.out.println("This "+nissan.make+" is worth $"+nissan.price+
        ". It was built in "+nissan.year+". It is "+nissan.color+".\n");

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 11000;
        dodge.year = 2019;
        dodge.color = "blue";

        System.out.println("This "+dodge.make+" is worth $"+dodge.price+
        ". It was built in "+dodge.year+". It is "+dodge.color+".\n");
    }
}

/*
 * 
 * Big three -:
 *      1.Constructor
 *      2.Getters
 *      3.Setters
 */