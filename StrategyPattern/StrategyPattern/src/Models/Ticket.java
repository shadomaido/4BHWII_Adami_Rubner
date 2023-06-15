package Models;

public class Ticket {
    private TicketStrategy ticketStrategy;

    public Ticket(TicketStrategy ticketStrategy){
        this.ticketStrategy = ticketStrategy;
    }

    public void setTicketStrategy(TicketStrategy ticketStrategy){
        this.ticketStrategy = ticketStrategy;
    }

    public double getTicketPrice(double basePrice){
        return ticketStrategy.calculatePrice(basePrice);
    }

}
