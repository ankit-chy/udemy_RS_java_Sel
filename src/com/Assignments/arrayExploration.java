package com.Assignments;

import java.util.ArrayList;

public class arrayExploration {

    public static void main(String[] args) {
        

// Create an Array:

// Create a new array called numbers to store 5 numerical values of your choice (they can be whole numbers or decimals).

// Access and Print:

// Print the following:

// The first element of the numbers array.

// The last element of the numbers array.

// Reverse Order:

// Using a loop, print the elements of the numbers array in reverse order.

// Bonus: Element Count:

// Calculate the total number of elements within the numbers array.

int [] numbers = { 10, 20, 30, 40, 50 };

System.out.println("First element: " + numbers[0]);
System.out.println("Last element: " + numbers[numbers.length - 1]);

for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println("Element in reverse order: " + numbers[i]);

}

ArrayList<String> a  = new ArrayList<String>();

a.add("Ankit");
a.add("Choudhary");
System.out.println(a.get(0));
System.out.println(a.get(1));

}
}