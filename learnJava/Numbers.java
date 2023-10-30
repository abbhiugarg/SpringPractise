import java.util.*;

public class Numbers {

    public static void fibonacci(int n){
        int a= 0;
        int b=1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        recurfibo(n-2,a,b);

    }
    public static void recurfibo(int n,int a,int b){
        if (n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c + " ");
        recurfibo(n-1,b,c);
    }

    public static void loop(int num){
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    private static int fibo(int i) {
        if (i==0 || i==1) return i;
        return fibo(i-1) + fibo(i-2);
    }


    public static void main(String[] args) {
        //System.out.println(palindrome(1521));

//        System.out.println(isStrong(148));
        //System.out.println(factorial(5));
//        System.out.println(recuFactorial(5));
       // System.out.print(fibo(10)+" ");
        //fibonacci(10);
        //loop(10);
        //isArmstrong(154);
        //isPerfectNumber(28);

//        int[] arr1 = {3,2,4};
//        int target = 6;
//        int[] result = twoSum(arr1,target);
//        System.out.println(Arrays.toString(result));

//        int[] arr2 = {10,0,0,20,40,50,60};
//        System.out.println(Arrays.toString(arr2));
//        int[] result = moveZeros(arr2);
//        System.out.println(Arrays.toString(result));

//        String str = "sandeep";
//        HashSet<Character> hashSet = new HashSet<>();
//        hashSet.add('a');
//        hashSet.add('b');
//        System.out.println(hashSet);
//        System.out.println(hashSet.contains('a'));

//        String result = removeDuplicates("abhitanshu");
//        System.out.println(result);

//        String result = reverseWord("Welcome to Java World");
//        System.out.println(result);

       // checkWordPalindrome("xyyx");

//        String str = "abhiu";
//        System.out.println(str + 'v');

          Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        boolean result = checkStringAnagram(str1,str2);
//        System.out.println(result);

//        String str = sc.next();
//        Character result = nonRepeated(str);
//        System.out.println(result);

//        String str = sc.nextLine();
//        checkEvenLengthString(str);

//        int[] arr1 = {3,1,2};
//       // System.out.println(arr1);
//        Arrays.sort(arr1);
//        //System.out.println(arr1);
//        System.out.println(Arrays.toString(arr1));

//        int[] arr1 = new int[]{2,4,2,4,4};
//        int result = majority(arr1);
//        System.out.println(result);

//        String[] arr1 = {"Banana","Zebra","Grapes","Apple"};
//        System.out.println(Arrays.toString(arr1));
////        Arrays.sort(arr1);
////        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1,1,3);
//        System.out.println(Arrays.toString(arr1));

//        int[] arr1 = new int[]{4,1,2,3};
//        int[] arr2 = new int[]{5,7,8,1};
//        pointOfIntersection(arr1,arr2);

//        String str1 = "The quick brown fox jumps over the dog";
//        boolean result = isPangram(str1);
//        System.out.println(result);
        //System.out.println('b'+1);

//        String str = "GGBHAI";
//        String result ="";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if ((ch + 0) >= 97 && (ch +0) <=122){
//                result = result + ch;
//            }
//            else {
//                char newAsciiChar = (char)(ch + 32);
//                result = result + newAsciiChar;
//            }
//        }
//        System.out.println(result);


//        String str = "Learn Code with Durgesh";
//        String resultStr = fetchFirstLetter(str);
//        System.out.println(resultStr);

//        String str = "abcd";
//        printSubstrings(str);

//        String str = sc.nextLine();
//        String result = reverseWordString(str);
//        System.out.println(result);

//        int[] arr1 = {10,11,5,4,7};
//        LinkedHashMap<Integer,Integer> result = findNextGreater(arr1);
//        System.out.println(result);

//        int[] arr1 = {1,2,3,4};
//        System.out.println(Arrays.toString(arr1));
//        int[] result = reverseArray(arr1);
//        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(arr1));

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

//        String str = "roor";
//        boolean result = isPalindrome(str);
//        System.out.println(result);

//        int[] arr1 = {4,2,3,5,1,2,4,2};
//        repeatingElement(arr1);

//        int[] arr1 = {10,11,5,4,7};
//        int result = maximumDifference(arr1);
//        System.out.println(result);

//        String str = "AABBC";
//        vowelConsonent(str);

//        int[] arr1 = {2,0,4,7,9,0,0};
//        System.out.println(Arrays.toString(arr1));
//        int[] result = moveToZeros(arr1);
//        System.out.println(Arrays.toString(result));

        int[] arr1 = {-1,-20,30,40,50,-8};
        System.out.println(Arrays.toString(arr1));
        int[] result = moveNegatives(arr1);
        System.out.println(Arrays.toString(result));
       // int i = 2147483647 +3;
        //System.out.println('c'/0);
    }

    private static int[] moveNegatives(int[] arr1) {
        int[] result = new int[arr1.length];
        int index = 0;
        int noOfNegatives = 0;
        for (Integer val: arr1) {
            if (val < 0){
                result[index] = val;
                index = index+1;
                noOfNegatives = noOfNegatives+1;
            }
        }
        for (Integer val: arr1) {

        }
        return result;
    }

    private static int[] moveToZeros(int[] arr1) {
        int[] result = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0){
                result[index] = arr1[i];
                index++;
            }
        }
        for (int i = index; i < arr1.length; i++) {
            result[i] = 0;
        }
        return result;
    }

    private static void vowelConsonent(String str) {
        String check = "aeiouAEIOU";
        int vowel = 0;
        int consonent = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check.contains(str.charAt(i) + "")){
                vowel++;
            }
            else {
                consonent++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonent);
    }

    private static int maximumDifference(int[] arr1) {
        int result =0;
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                int difference = arr1[j] - arr1[i];
                if (difference < 0){
                    difference = -difference;
                }
                if (difference > result){
                    result = difference;
                }
            }
        }
        return result;
    }

    private static void repeatingElement(int[] arr1) {
        LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<>();
        for (Integer val: arr1) {
            if (map1.containsKey(val)){
                map1.put(val,map1.get(val)+1);
            }
            else {
                map1.put(val,1);
            }
        }
        for (Integer key: map1.keySet()) {
            if (map1.get(key) > 1){
                System.out.println("Element " + key + " occurs " + map1.get(key) + " times");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        if (str.equals(result)){
            return true;
        }
        else {
            return false;
        }
    }

    private static int[] reverseArray(int[] arr1) {
        Stack<Integer> stack1 = new Stack<>();
        for (Integer val: arr1) {
            stack1.push(val);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = stack1.pop();
        }
        return arr1;
    }

    private static LinkedHashMap<Integer, Integer> findNextGreater(int[] arr1) {
        LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<>();
        for (int i = 0; i < arr1.length-1; i++) {
            int nextMax = arr1[i];
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[j] > arr1[i]){
                    nextMax = arr1[j];
                }
            }
            if (nextMax == arr1[i]){
                System.out.println("There is no next greater element of " + arr1[i]);
                map1.put(arr1[i],-1);
            }
            else {
                System.out.println("Next greater element of " + arr1[i] + " is " + nextMax);
                map1.put(arr1[i],nextMax);
            }

        }
        map1.put(arr1[arr1.length-1],-1);
        return map1;
    }

    private static String reverseWordString(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        String[] arr1 = str.split(" ");
        for (String s1: arr1) {
            for (int i = 0; i < s1.length(); i++) {
                stack.push(s1.charAt(i));
            }
            while (!stack.isEmpty()){
                result = result + stack.pop();
            }
            result = result + " ";
        }
        return result;
    }

    private static void printSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j) + "\t");
            }
            System.out.println();
        }
    }

    private static String fetchFirstLetter(String str) {
        String result = "";
        String[] strArray = str.split(" ");
        for (String val: strArray) {
            result = result + val.charAt(0);
        }
        return result;
    }

    private static boolean isPangram(String str1) {
        String str = str1.toLowerCase();
        for (char ch = 'a';ch <= 'z';ch++){
            if (!str.contains(ch + "")){
                return false;
            }
        }
        return true;
    }

    private static void pointOfIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer val1: arr1) {
            set1.add(val1);
        }
        for (Integer val2: arr2) {
            if (set1.contains(val2)){
                System.out.println("Point of Intersection is " + val2);
            }
            else {
                set1.add(val2);
            }
        }
    }

    private static int majority(int[] arr1) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (Integer val: arr1) {
            if (map1.containsKey(val)){
                map1.put(val,map1.get(val)+1);
            }
            else {
                map1.put(val,1);
            }
        }
        System.out.println(map1);

        int element = 0;
        int frequency = 0;
        for (Integer keyValue: map1.keySet()) {
            if (map1.get(keyValue) > frequency){
                element = keyValue;
                frequency = map1.get(keyValue);
            }
        }
        System.out.println("Element " + element + " occurs " + frequency + " times");
        return element;
    }

    private static void checkEvenLengthString(String str) {
        String[] strArr = str.split(" ");
        for (String val: strArr) {
            if (val.length()%2 == 0){
                System.out.println(val);
            }
        }
    }

    private static Character nonRepeated(String str) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character cha = str.charAt(i);
            if (map.containsKey(cha)){
                map.put(cha,map.get(cha)+1);
            }
            else {
                map.put(cha,1);
            }
        }
        System.out.println(map);
        for (Character val: map.keySet()) {
            if (map.get(val) ==1){
                return val;
            }

        }
        return null;

    }

    private static boolean checkStringAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        System.out.println(arr1);
        char[] arr2 = str2.toCharArray();
        System.out.println(arr2);

        if (arr1.length != arr2.length){
            return false;
        }

        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);
        System.out.println(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    private static void checkWordPalindrome(String str) {
        String result = "";
        for (int i = str.length() -1; i >= 0; i--) {
            result= result + str.charAt(i);
        }
        if (str.equals(result)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    private static String removeDuplicates(String str) {
        String result = "";
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashSet.contains(str.charAt(i))){
                hashSet.add(str.charAt(i));
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    private static int[] moveZeros(int[] arr2) {
        int index = 0;
        int[] result = new int[arr2.length];
        for (int val: arr2) {
            if (val != 0){
                result[index] = val;
                index++;
            }
        }
        return result;
    }

    private static int[] twoSum(int[] arr1, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] < target){
                for (int j = i+1; j < arr1.length; j++) {
                    if (arr1[i] + arr1[j] == target){
                        result[0] = i;
                        result[1] = j;
                    }
//                   break;
                }
            }
//           break;
        }
        return result;
    }


    public static String palindrome(int num) {
//        int a =noOfCounts(num)-1;
        int temp = num;
        double sum = 0;
        while (num > 0){
            int remainder = num%10;
//            sum = sum + remainder*Math.pow(10,a);
//            a--;
            sum = sum * 10 + remainder;
            num = num/10;
        }
        if (sum == temp){
            return "Yes";
        }
        else {
            return "No";
        }
    }

    private static int noOfCounts(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    public static void isArmstrong(int num){
        int temp = num;
        double sum = 0;
        int base = noOfCounts(num);
        while (num > 0){
            int remainder = num%10;
            sum = sum + Math.pow(remainder,base);
            num = num/10;
        }
        if (sum == temp){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

    public static void isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }



//    public static int factorial(int num){
//        int fact = 1;
//        while (num>0){
//            fact = fact * num;
//            num--;
//        }
//        return fact;
//    }

    public static int recuFactorial(int num){
        if(num == 1) return 1;
        return num * recuFactorial(num-1);
    }

    public static String isStrong(int num){
        int temp = num;
        int sum = 0;
        while (num > 0){
            int remainder = num%10;
            sum = sum + recuFactorial(remainder);
            num = num/10;
        }
        if (temp == sum){
            return "Yes";
        }
        else {
            return "No";
        }
    }





}
