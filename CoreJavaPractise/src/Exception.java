import java.util.HashMap;
import java.util.Scanner;

public class Exception extends Throwable {

    static void check(int age) throws ArrayIndexOutOfBoundsException{
        try {
            if (age < 18) {
                throw new ArithmeticException("Access denied");
            } else {
                System.out.println("Access granted");
            }
        }
//        catch (ArithmeticException e){
//            System.out.println(e.toString() + " yewala");
//        }
        finally {
            System.out.println("finally block run");
        }
        System.out.println("This will run");

    }


    public static void main(String[] args) {
//        try {
////            int a = 5;
////            int b = 0;
////            System.out.println(a / b);
//            throw new ArrayIndexOutOfBoundsException("Please solve this");
//        }
//
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString() + " true");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.toString());
//        }
//        finally {
//            System.out.println("finally this code execute");
//        }
//        System.out.println("Exception Handling Done");

//        try {
//            String str = null;
//            int a = str.length();
//            System.out.println(a);
//        }
//        catch (NullPointerException e){
//            System.out.println(e.toString());
//        }

        try{
            check(15);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        

//        HashMap<Character,Integer> map1 = new HashMap<>();
//        String str = "abcdzbcafegabeg";
//        for (int i = 0; i < str.length(); i++) {
//            if (map1.containsKey(str.charAt(i))){
//                map1.put(str.charAt(i),map1.get(str.charAt(i)) +1);
//            }
//            else {
//                map1.put(str.charAt(i),1);
//            }
//        }
//        System.out.println(map1);




    }
}
