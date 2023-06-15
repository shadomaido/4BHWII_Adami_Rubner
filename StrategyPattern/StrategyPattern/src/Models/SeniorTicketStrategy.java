package Models;

public class SeniorTicketStrategy implements TicketStrategy{
    @Override
    public double calculatePrice(double basePrice) {
        double taxrate = 0.07;
        return basePrice + (basePrice * taxrate);
    }
}
