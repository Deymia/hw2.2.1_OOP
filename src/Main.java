public class Main {

    public static void main(String[] args) {

        Car audiQ7 = new Car("Audi Q7", 4);
        Car kiaRio = new Car("Kia Rio", 4);

        Truck renaultMagnum = new Truck("Renault Magnum", 6);
        Truck scaniaR = new Truck("Scania R", 8);

        Bicycle merida = new Bicycle("Merida", 2);
        Bicycle stels = new Bicycle("STELS",2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.checkTransport(audiQ7);
        serviceStation.checkTransport(kiaRio);
        serviceStation.checkTransport(renaultMagnum);
        serviceStation.checkTransport(scaniaR);
        serviceStation.checkTransport(merida);
        serviceStation.checkTransport(stels);
    }
}