package worldOfObjects;
 
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");

        double newPrice = nissan.getPrice() / 2;
        nissan.setPrice(newPrice);

        System.out.println("This "+nissan.getMake()+" is worth $"+nissan.getPrice()+
        ". It was built in "+nissan.getYear()+". It is "+nissan.getColor()+".\n");

        Car dodge = new Car("Dodge",11000,2019,"blue");

        dodge.setColor("jetBlack");

        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("This "+dodge.getMake()+" is worth $"+dodge.getPrice()+
        ". It was built in "+dodge.getYear()+". It is "+dodge.getColor()+".\n");
    }
}

/*
 * 
 * Big three -:
 *      1.Constructor
 *      2.Getters
 *      3.Setters
 */