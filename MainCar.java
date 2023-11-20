import java.security.KeyStore;

public class mainCar {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.name = "Audi";
        firstCar.model = "Audi Q8 e-tron";
        firstCar.color = "Black";
        firstCar.speed = 325;
        firstCar.nitroSpeed = true;
        firstCar.info();

    }
}
