package com.jsp.qualitlabs;

public class ArrayEqualityCheck 
{
	public static boolean checkSameElements(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        // Iterate through arr1 and remove matching elements from arr2
        for (String element : arr1)
        {
            //boolean found = false;
            for (int j = 0; j < arr2.length; j++) 
            {
                if (element.equals(arr2[j]))
                {
                    //found = true;
                    arr2[j] = null;
                    break;
                }
            }
//            if (found==false) 
//            {
//                return false;
//            }
            
        }

        // Check if all elements in arr2 are null (indicating they were present in arr1)
        for (String element : arr2)
        {
            if (element != null)
            {
                return false;
            }
        }

        return true; // Both arrays contain the same elements
    }

    public static void main(String[] args) {
        String[] arr1 = {"red", "green", "yellow", "blue"};
        String[] arr2 = {"green", "blue", "red", "yellow"};

        if (checkSameElements(arr1, arr2)) {
            System.out.println("Both arrays contain the same elements");
        } else {
            System.out.println("Arrays do not contain the same elements");
        }
    }
    
}