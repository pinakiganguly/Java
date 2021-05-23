//Main.java file code

import java.util.Scanner;
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket obj=new Ticket();
        
        System.out.println("Enter no of bookings:");
        int no_bookings=sc.nextInt();
        
        System.out.println("Enter the available tickets:");
        obj.setAvailableTickets(sc.nextInt());
        
        while(no_bookings>0)
        {
        System.out.println("Enter the ticketid:");
        obj.setTicketid(sc.nextInt());
        
        System.out.println("Enter the price:");
        obj.setPrice(sc.nextInt());
        
        System.out.println("Enter the no of tickets:");
        int no_tickets=sc.nextInt();
        if(obj.calculateTicketCost(no_tickets)==-1)
        {
            continue;
        }
        
        System.out.println("Available tickets: "+obj.getAvailableTickets());
        
        System.out.println("Total amount:"+obj.calculateTicketCost(no_tickets));
        
        System.out.println("Available ticket after booking:"+obj.getAvailableTickets());
        
            no_bookings--;
        }
    }
}

//---------------------------------------------------------------------------------------------------------------

//Ticket.java code file


public class Ticket
{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public void setTicketid(int ticketid)
    {
        this.ticketid=ticketid;
    }
    
    public int getTicketid()
    {
        return this.ticketid;
    }
    
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public static void setAvailableTickets(int availableTickets1)
    {   if(availableTickets1>=0)
        {
            availableTickets=availableTickets1;
        }
    }
    
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {   
        if(availableTickets>=nooftickets)
        {   
            availableTickets-=nooftickets;
            return nooftickets*this.price;
        }
        else
        {
            return -1;
        }
    }
}
