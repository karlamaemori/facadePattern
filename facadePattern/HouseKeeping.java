public class HouseKeeping implements HotelService {

    @Override
    public void serve() {
        System.out.println("Housekeeping service is now ready.");
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Housekeeping: cleaning room " + roomNumber + ".");
    }
}