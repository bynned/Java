//PALINDROM PROGRAM USING QUEUES AND STACKS

package jsjf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class palindrome {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String:: ");
        String real = input.nextLine();

        Queue<Character> q = new LinkedList<>();
        Stack<Character> st = new Stack<>();


        for(int i=0; i<=real.length()-1; i++) {
            q.add(real.charAt(i));
        }

        for(int i=0; i<real.length(); i++) {
            st.push(real.charAt(i));
        }

        if(q.remove().equals(st.pop())) {
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");
        }

    }

}