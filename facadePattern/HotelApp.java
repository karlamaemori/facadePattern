public class HotelApp {
    public static void main(String[] args) {
        FrontDesk fd = new FrontDesk();

        System.out.println("\n--- Guest check-in request ---");
        fd.pickUpVehicle("KMI-6185");
        fd.cleanRoom("618");
        fd.requestCart(3);
    }
}