package Models;

public class AdultTicketStrategy implements TicketStrategy{
    @Override
    public double calculatePrice(double basePrice) {
        double taxrate = 0.1;
        return basePrice + (basePrice * taxrate);
    }
}
