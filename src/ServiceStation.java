public class ServiceStation implements Service {
    @Override
    public void check(Vehicle transport) {
        if (transport != null) {
            System.out.println("Начинаем обслуживание " + transport.getModelName());
            transport.service();
        } else {
            System.out.println("Ожидание...");
            System.out.println();
        }
    }
}



