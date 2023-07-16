public  class  ServiceStation implements Service {
public void check(Vehicle transport) {
    System.out.println("Обслуживание началось!");

    transport.service();
    System.out.println(" Обслуживание завершено!");
}
}