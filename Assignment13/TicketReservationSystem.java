public class TicketReservationSystem {
    public static void main(String[] args) {
        Ticket head = null;
        head = Ticket.addTicket(101,"Arush","kabir singh", 1, "subhe 10 bje", head);
        head = Ticket.addTicket(102, "Ayush", "iron man", 2, " dophr 12 bje", head);
        head = Ticket.addTicket(103, "Kunal", "meri zindgi", 3, "dophr 2 bje", head);
        Ticket.displayTickets(head);
        System.out.println();
        head = Ticket.removeTicket(102, head);
        Ticket.displayTickets(head);
    }
}
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;
    
    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = this;
    }
    public static Ticket addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime, Ticket head) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            return newTicket;
        }
        Ticket temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newTicket;
        newTicket.next = head;
        return head;
    }
    public static Ticket removeTicket(int ticketId, Ticket head) {
        if (head == null) return null;
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = temp.next;
                    last.next = head;
                }
                return head;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        return head;
    }
    public static void displayTickets(Ticket head) {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
}
