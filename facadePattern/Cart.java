public class Cart implements HotelService {

    @Override
    public void serve() {
        System.out.println("Cart service is now ready.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart: dispatching " + numberOfCarts + " luggage cart(s).");
    }
}