package Models;

public class ChildTicketStrategy implements TicketStrategy{
    @Override
    public double calculatePrice(double basePrice) {
        double taxrate = 0.05;
        return basePrice + (basePrice * taxrate);
    }
}
