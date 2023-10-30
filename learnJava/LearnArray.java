import java.util.Scanner;

public class LearnArray {

    public static int largestElement(int[] arr1){
        int largest = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largest){
                largest = arr1[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int larEle = largestElement(arr1);
        System.out.println(larEle);
    }
}
