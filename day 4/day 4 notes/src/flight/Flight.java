package flight;

public class Flight {
    // Properties of class Flights
    int seats; //CALLED INSTANCE VARIABLE
    int  passengers;

    Flight() {
        seats = 10;
        passengers = 0;
    }

    //TODO validate if there are available seats left. If not, display "Full"
    public void addPassenger() {
        if(passengers < seats) {
            passengers++;
        } else {
            System.out.println("Full");
        }
    }

    //TODO set new value of seat so addPassenger is allowed again
    public void setNumberOfSeats(int seats) {
        this.seats = seats; //GLOBAL this.seats
    }
}
