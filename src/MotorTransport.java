public class MotorTransport extends Vehicle{
    public MotorTransport(String modelName,int wheelsCount){
        super(modelName, wheelsCount);
    }
    void checkEngine(){
        System.out.println("Проверка двигателя");
    }
}
