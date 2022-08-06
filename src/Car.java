public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void updateTyre() {
        System.out.println("Чистим диски");
    }

    public void checkEngine() {
        System.out.println("Перебираем двигатель");
    }
}
