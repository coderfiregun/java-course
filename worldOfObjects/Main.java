package worldOfObjects;
 
public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",5000,2020,"red");
        Car dodge = new Car("Dodge",11000,2019,"blue");
        Car nissan2 = nissan;

        nissan2.setColor("yellow");
        

        System.out.println("This "+nissan.getMake()+" is worth $"+nissan.getPrice()+
        ". It was built in "+nissan.getYear()+". It is "+nissan.getColor()+".\n");

        System.out.println("This "+dodge.getMake()+" is worth $"+dodge.getPrice()+
        ". It was built in "+dodge.getYear()+". It is "+dodge.getColor()+".\n");

        System.out.println("This "+nissan2.getMake()+" is worth $"+nissan2.getPrice()+
        ". It was built in "+nissan2.getYear()+". It is "+nissan2.getColor()+".\n");

        /*  
            OUTPUT
            This Nissan is worth $5000.0. It was built in 2020. It is yellow.
            This Dodge is worth $11000.0. It was built in 2019. It is blue.
            This Nissan is worth $5000.0. It was built in 2020. It is yellow.
             
            The color of first nissan also changes on changing color of second
            nissan.
            so we must not use assignment operator for copying class as both
            are given same reference
            Car nissan2 = nissan   ( X )
         */



    }
}

/*
 * 
 * Big three -:
 *      1.Constructor
 *      2.Getters
 *      3.Setters
 */