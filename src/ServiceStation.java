public class ServiceStation implements Service {
    @Override
    public void check(Vehicle transport) {
        if (transport != null) {
            System.out.println("Начинаем обслуживание " + transport.getModelName());
            transport.service();
            System.out.println("Обслуживаие завершено! Приятной поездки!!!");
        } else {
            System.out.println("Ожидание...");
            System.out.println();
        }
}
}



