// Exercise 2
/*Write a class called Car that contains instance data that represents the make, model, and year of the car.
Define the Car constructor to initialize these values. Include getter and setter methods for all instance data,
and a toString method that returns a oneline description of the car. Add a method called isAntique that
returns a boolean indicating if the car is an antique (if it is more than 45 years old).
*/
// Author: Benny Cascarino
class car {

    private String make; // Car make
    private String model; // Car model
    private int year; // Car year

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String M) {
        this.make = M;
    }

    public void setModel(String Mo) {
        this.model = Mo;
    }

    public void setYear(int Y) {
        this.year = Y;
    }

    public String toString() {
        return make + " " + model + " " + year;
    }

}

class CarTest {
    public static void main(String[] args) {
        car obj = new car();
        boolean oldcar = true;
        boolean newcar = false;

        obj.setMake("Renault");
        obj.setModel("Megane");
        obj.setYear(2002);

        System.out.println(obj);

        if (obj.getYear() > 1945) {
            System.out.println("Antique = " + oldcar);
        } else {
            System.out.println("Antique = " + newcar);
        }
    }

}