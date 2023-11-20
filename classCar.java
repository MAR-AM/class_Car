import javax.xml.namespace.QName;

public class Car {
    String name;
    short speed;
    String color;
    boolean nitroSpeed;
    String model;

    void start(){
        System.out.println("The start of the race...!");
    }

    void turn(){
        System.out.println("this car "+name+" turn left ");
    }

    void accelerate(){
        System.out.println(name+" accelerates with speed :"+speed+"Km/h");
    }

    void brake(){
        System.out.println("this car "+name+" brakes .");
    }

    void boost(){
        System.out.println("This car "+name+"boosts with nitro speed .");

    }

    void info(){
        System.out.println("Name Car : "+name);
        System.out.println("The model of car : "+model);
        System.out.println("The color of the Car : "+color);
        System.out.println("Speed Car : "+speed);
        System.out.println("The nitroSpeed : "+nitroSpeed );
        System.out.println("\n");
        start();
        turn();
        accelerate();
        brake();
        boost();
    }

}
