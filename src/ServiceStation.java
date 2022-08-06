public class ServiceStation  {

    public void checkTransport (Transport transport) {
        if (transport.getWheelsCount() == 4) {
            Car car = new Car(transport.getModelName(), transport.getWheelsCount());
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (transport.getWheelsCount() == 6 || transport.getWheelsCount() == 8) {
            Truck truck = new Truck(transport.getModelName(), transport.getWheelsCount());
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (transport.getWheelsCount() == 2) {
            Bicycle bicycle = new Bicycle(transport.getModelName(), transport.getWheelsCount());
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
