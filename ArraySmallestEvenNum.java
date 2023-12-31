package com.jsp.qualitlabs;

public class ArraySmallestEvenNum 
{
	public static int findSmallestEven(int[] arr) {
        int smallestEven = Integer.MAX_VALUE;
        System.out.println(smallestEven);
        for (int num : arr) {
            if (num % 2 == 0 && num < smallestEven) {
                smallestEven = num;
            }
        }

        return smallestEven;
    }
    public static void main(String[] args) {
        int[] arr = {10, 40, 50, 6, 2, 100, 5, 200};
        int smallestEven = findSmallestEven(arr);
        System.out.println(smallestEven + " is the smallest even number in the array.");
        
//        if(smallestEven != Integer.MAX_VALUE) {
//            System.out.println(smallestEven + " is the smallest even number in the array.");
//        } else {
//            System.out.println("There are no even numbers in the array.");
//        }
    }

    
}