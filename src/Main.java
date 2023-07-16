
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        Car car2 = new Car("Nissan");

        Truck truck = new Truck("КамАЗ", 12);
        Truck truck2 = new Truck("Hyundai Mighty", 8);


        Bicycle bicycle = new Bicycle("Stels", 2);
        Bicycle bicycle2 = new Bicycle("Merida Big", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(null);
        station.check(null);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(null);
        station.check(truck2);
    }
}