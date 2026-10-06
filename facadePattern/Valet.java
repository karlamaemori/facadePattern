public class Valet implements HotelService {

    @Override
    public void serve() {
        System.out.println("Valet service is now ready.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: picking up vehicle with plate number " + plateNumber + ".");
    }
}