import Models.AdultTicketStrategy;
import Models.ChildTicketStrategy;
import Models.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket childTicket = new Ticket(new ChildTicketStrategy());
        double childTicketPrice = childTicket.getTicketPrice(10.0);
        System.out.println("Child Ticket Price " + childTicketPrice);

        Ticket adultTicket = new Ticket(new AdultTicketStrategy());
        double adultTicketPrice = adultTicket.getTicketPrice(20.0);
        System.out.println("Adult Ticket Price " + adultTicketPrice);

        Ticket seniorTicket = new Ticket(new AdultTicketStrategy());
        double seniorTicketPrice = seniorTicket.getTicketPrice(20.0);
        System.out.println("Senior Ticket Price " + seniorTicketPrice);


    }
}
