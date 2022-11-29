/**
 * Linear search for a basic Arraylist.
 */
import java.util.*;

public class LinearS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(9);
        arr.add(7);
        arr.add(6);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        arr.add(0);

        System.out.println("What number are you looking for from current arraylist?");
        for (int number : arr) {
            System.out.print(number);
        }
        System.out.println("\n");
        int searchInt = scan.nextInt();

        System.out.println("\nYou're searching for: " + searchInt);
        int index = linearSearch(arr, searchInt);
        if (index == -1) {
            System.out.println("\nNot found\n");
        } else {
            System.out.print("\nFound at index " + linearSearch(arr, searchInt) + "\n");
        }
        scan.close();

}

public static int linearSearch (ArrayList<Integer> arr, int searchInt){
    for (int q = 0; q < arr.size(); q++) {
        if (arr.get(q) == searchInt) {
            return q;
        }
    }
    return -1;
}
}