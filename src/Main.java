
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",4);
        Car car2 = new Car("Lexus",4);
        car.getModelName();
        car2.getModelName();
        car.getWheelsCount();
        car2.getWheelsCount();

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.getModelName() ;
        truck2.getWheelsCount();
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;


        car.check(car, null, null);
        car2.check(car2, null, null);
        truck.check(null, bicycle, null);
        truck2.check(null, bicycle2, null);
        bicycle.check(null, null, truck);
        bicycle2.check(null, null, truck2);
    }
}