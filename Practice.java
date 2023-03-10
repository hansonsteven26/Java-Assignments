import java.util.*;

public class Practice {
    public static void main(String[] args) {
        
        /*int[] numArray = {1, 2, 3, 4, 5, 6};
        String myName;
        myName.concat(myName)

        int[] anotherOne = new int[numArray.length];

        System.arraycopy(numArray, 0, anotherOne, 0, numArray.length);

        for (int i = 0; i < numArray.length; i ++) {
            System.out.println(anotherOne[i]);
        }
        secondLargest(functionArray);
        int[] functionArray = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(functionArray));
        */

        /*int[] intArray = new int[10];

        ArrayList<//data type, or object i think//Integer> intList = new ArrayList<//don't technically need this//Integer>();

        intList.size(); // use .size instead of .length for ArrayList ... and .get instead of .charAt
        intList.add(3); // there is no size to a non-primitive list
        intList.remove(1);
        */

        Stack stacky = new Stack<>();
        stacky.
        
    }

    public static void secondLargest(Integer[] intArray) {

        // Write a Java program to find the second largest number in an array

        // compare each number by size to find the largest
        // take largest number out
        // find largest number again
        int greatestNum = intArray[0];
        int greatestNumIndex = 0;
        int secondGreatest = intArray[0];

        for (int i = 1; i < intArray.length; i++) {

            if (greatestNum < intArray[i]) {
                greatestNum = intArray[i];
                greatestNumIndex = i;
            }

        }

        intArray[greatestNumIndex] = 0;

        for (int i = 1; i < intArray.length; i++) {

            if (secondGreatest < intArray[i]) {
                secondGreatest = intArray[i];
            }

        }

        System.out.println("The second greatest number is " + secondGreatest);

    }


    public static int[] twoSum(int[] nums, int target) {

        int iIndex = 0, jIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {

                    iIndex = i;
                    jIndex = j;

                }

            }

        }

        return new int[]{iIndex, jIndex};

    }


    public static int maxArea(int[] height) {

        // area of rectangle is Base * Height
        // base is greaterIndex - smallerIndex
        // height is the numbers in the height array
        // compare each area against each other

        int maximumArea = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int iHeight = height[i], jHeight = height[j], lowerHeight = 0, base = j - i;

                if (iHeight < jHeight) {
                    lowerHeight = iHeight;
                } else {
                    lowerHeight = jHeight;
                }

                if (lowerHeight * base > maximumArea) {

                    maximumArea = lowerHeight * base;

                }

            }
            
        }

        return maximumArea;

    }

}

/* Palindrome
 * String reverseString = "";
 * 
 * for (int i = reverseString.length() - 1; i >= 0; i--) {
 *  reverseString = reverseString.concat(Character.toString(inputString.charAt(i)));
 * }
 * if (reverseString.equals(inputString)) {
 *  System.out.println("It is a palindrome");
 * }
 */