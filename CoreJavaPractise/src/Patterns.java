import java.util.*;

public class Patterns {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        int[] arr = {2,3,4,5};
//        System.out.println(Arrays.toString(arr));

//        int[] arr1 = new int[5];
//        int[][] arr2 = new int[2][3];
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//        String y = sc.nextLine();
//        System.out.println(y);

//        String str = "abcd";
//        for (int i = 0;i<str.length();i++){
//            for (int j = i+1; j <=str.length() ; j++) {
//                System.out.println(str.substring(i,j));
//            }
//        }
//        String s1 = "dlf";
//        String s2 = "dlf";
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//
//        String s3 = new String("ipl");
//        String s4 = new String("ipl");
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//        for (int i = n; i >=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" \t");
//            }
//            for (int k = 1; k <=i ; k++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        for (int i = n; i >= 1 ; i--) {
//            for (int j = 1; j <= n-i ; j++) {
//                System.out.print(" \t");
//            }
//            for (int k = 1; k <= i ; k++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }


//        int space = n/2;
//        int star = 1;
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" \t");
//            }
//            for (int k = 1; k <= star; k++) {
//                System.out.print("*\t");
//            }
//            if (i < (n/2)+1){
//                space--;
//                star = star +2;
//            }
//            else {
//                space++;
//                star = star -2;
//            }
//            System.out.println();
//        }

//        int star = (n/2) +1;
//        int space = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=star; j++) {
//                System.out.print("*\t");
//            }
//            for (int k = 1; k <=space; k++) {
//                System.out.print(" \t");
//            }
//            for (int l = 1; l <=star; l++) {
//                System.out.print("*\t");
//            }
//            if (i <= n/2){
//                star--;
//                space = space +2;
//            }
//            else {
//                star++;
//                space = space -2;
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" \t");
            }
            System.out.println("*");
        }

        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" \t");
            }
            System.out.println("*");
        }

        String str = "abhiub";
        System.out.println(str.indexOf('b',2));












    }
}