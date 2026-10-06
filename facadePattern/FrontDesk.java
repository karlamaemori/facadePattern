public class FrontDesk {
    private Valet v;
    private HouseKeeping hk;
    private Cart c;

    public FrontDesk() {
        this.v = new Valet();
        this.hk = new HouseKeeping();
        this.c = new Cart();

        v.serve();
        hk.serve();
        c.serve();
        
    }

    public void pickUpVehicle(String plateNumber) {
        v.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(String roomNumber) {
        hk.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        c.requestCart(numberOfCarts);
    }
}