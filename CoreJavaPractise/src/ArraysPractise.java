import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractise {
    static int span(int[] arr1){
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max){
                max = arr1[i];
            }
            if (arr1[i] < min){
                min = arr1[i];
            }
        }
        return max - min;
    }

    static int findIndex(int[] arr1, int findNum){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == findNum){
                return i;
            }
        }
        return -1;
    }

    static int maxElement(int[] arr1){
        int max = arr1[0];
        for (int value: arr1) {
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    static void printBarChart(int[] arr1){
        int max = maxElement(arr1);
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= i){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    static int[] sumArrays(int[] arr1, int[] arr2){
        int maxSize = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] arr3 = new int[maxSize];

        int firstArrIndex = arr1.length - 1;
        int secondArrIndex = arr2.length -1;
        int carry = 0;
        for (int i = arr3.length -1; i >= 0; i--) {
            if (firstArrIndex >= 0){
                carry = carry + arr1[firstArrIndex];
            }
            if (secondArrIndex >= 0){
                carry = carry + arr2[secondArrIndex];
            }
            arr3[i] = carry % 10;
            carry = carry/10;
            firstArrIndex--;
            secondArrIndex--;
        }
        if (carry > 0){
            System.out.println("carry is : " + carry);
        }
        return arr3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Please enter first array elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

//        int result = span(arr1);
//        System.out.println(result);
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(arr1[arr1.length-1] - arr1[0]);

//        System.out.println("Please enter the element which you find in array");
//        int findNum = sc.nextInt();
//        int result = findIndex(arr1,findNum);
//        System.out.println(result);

//        printBarChart(arr1);

        System.out.println("Enter size of second array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Please enter second array elements");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = sumArrays(arr1,arr2);
        System.out.println(Arrays.toString(result));


    }
}
