// Exercise 3
/*
3.	Write class Flight that models a real life flight from some source to some destination.
The class should have following data members: airline company, origin, destination and flight number. 
Also getters and setters for these must be developed and toString-method. Make also a FlightTest class for creating many flights, 
updating and retrieving their information and finally it prints out all information of all flights to termina.
*/
// Author: Benny Cascarino
class flight {
    // Airline company
    // Origin
    // Destination
    private String company;
    private String origin;
    private String destination;

    public String getCompany() {
        return company;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setCompany(String C) {
        this.company = C;
    }

    public void setOrigin(String O) {
        this.origin = O;

    }

    public void setDestination(String D) {
        this.destination = D;
    }

    public String toString() {
        return company + " " + origin + " " + destination;
    }
}

class FlightTest {
    public static void main(String[] args) {
        flight obj = new flight();

        System.out.println("----Leaving flights: ----");

        obj.setCompany("Finnair");
        obj.setOrigin("Helsinki");
        obj.setDestination("London");
        System.out.println(obj);

        obj.setCompany("SAS");
        obj.setOrigin("Stockholm");
        obj.setDestination("Paris");
        System.out.println(obj);

        obj.setCompany("Ryanair");
        obj.setOrigin("Oslo");
        obj.setDestination("Madrid");
        System.out.println(obj);
    }
}