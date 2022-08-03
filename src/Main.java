public class Main {
    public static void main(String[] args) {
        Car [] car = {
                new Car ("car", 4 ),
                new Car("car2", 4)};



        Truck [] trucks = {
                new Truck("truck", 6),
                new Truck("truck2", 8)};


        Bicycle [] bicycles ={
                new Bicycle("bicycle", 2),
                new Bicycle("bicycle2", 2)};




        ServiceStation serviceStation = new ServiceStation();
        serviceStation.checkTransport(car[0], null, null);
        serviceStation.checkTransport(car [1], null, null);
        serviceStation.checkTransport(null, bicycles [0], null);
        serviceStation.checkTransport(null, bicycles [1], null);
        serviceStation.checkTransport(null, null, trucks [0]);
        serviceStation.checkTransport(null, null, trucks [1]);
    }

}