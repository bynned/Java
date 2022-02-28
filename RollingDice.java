// Exercise 4
// Author: Benny Cascarino
class die {
    private final int MAX = 6;

    private int faceValue;

    public die() {
        faceValue = 1;
    }

    public int roll () {
        faceValue = (int)(Math.random() * MAX) +1;

        return faceValue;
    }

    public void setFaceValue(int value) {
        faceValue = value;
    }
    public int getFaceValue() {
        return faceValue;
    }

    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

class RollingDice {
    public static void main(String[] args) {
        die die1, die2;
        int sum;

        die1 = new die();
        die2 = new die();

        die1.roll();
        die2.roll();
        System.out.println("Die one: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();

        System.out.println("Sum of die's: " + sum);
    }

}