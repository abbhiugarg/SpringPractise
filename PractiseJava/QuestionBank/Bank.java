package QuestionBank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    public static List<Account> accountList = new ArrayList<>();

    static void addAccount(){
        //accountList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account No.");
        long accountNo = sc.nextLong();
        System.out.println("Enter customer name");
        String custName = sc.next();
        System.out.println("Enter customer address");
        String custAddress = sc.next();
        System.out.println("Enter customer contact No.");
        long contactNo = sc.nextLong();
        System.out.println("Enter initially account Balance");
        long accountBalance = sc.nextLong();

        Account acc = new Account(accountNo,custName,custAddress,contactNo,accountBalance);
        accountList.add(acc);
    }

    static long removeAccount(long accId){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNo() == accId){
                accountList.remove(i);
                return accId;
            }
        }
        System.out.println("Required account with accountNo " + accId + " is not found");
        return -1;
    }

    static long addMoney(long accNo,long depositAmount){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNo() == accNo){
                long newAmount = accountList.get(i).getAccountBalance() + depositAmount;
                accountList.get(i).setAccountBalance(newAmount);
                System.out.println("Required Amount is added successfully");
                return accNo;
            }
        }
        System.out.println("AccountNo " + accNo + " is not found");
        return -1;
    }

    static long withdrawMoney(long accNo,long withdrawAmount){
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNo() == accNo){
                if (accountList.get(i).getAccountBalance() - withdrawAmount >= 0) {
                    long newAmount = accountList.get(i).getAccountBalance() - withdrawAmount;
                    accountList.get(i).setAccountBalance(newAmount);
                    System.out.println("Required Amount is deducted successfully");
                    return accNo;
                }
                else {
                    System.out.println("Account have insufficient balance so you can't withdraw required amount of money");
                    return -1;
                }
            }
        }
        System.out.println("AccountNo " + accNo + " is not found");
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        addAccount();
//        addAccount();
//        addAccount();
//        addAccount();
//        System.out.println(accountList);

        Account acc1 = new Account(100,"Abhiu","Bharatpur",6557576784L,1000);
        Account acc2 = new Account(101,"Akash","Ranchi",86787638723L,1550);
        Account acc3 = new Account(102,"Vishal","Mathura",72386227278L,2500);
        Account acc4 = new Account(103,"Ayesha","Pune",87398762372L,0);
        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);
        accountList.add(acc4);
        System.out.println(accountList);


//        System.out.println("Please enter accountNo which you want remove");
//        long accountNo = sc.nextLong();
//        long removeResult = removeAccount(accountNo);
//        System.out.println(removeResult);
//        System.out.println(accountList);

//        System.out.println("Please enter accountNo in which you want add money");
//        long accountNo = sc.nextInt();
//        System.out.println("Please enter amount to add");
//        long depositAmount = sc.nextInt();
//        long result = addMoney(accountNo,depositAmount);
//        System.out.println(result);
//        System.out.println(accountList);

//        System.out.println("Please enter accountNo in which you want withdraw money");
//        long accountNo = sc.nextInt();
//        System.out.println("Please enter withdraw");
//        long withdrawAmount = sc.nextInt();
//        long result = withdrawMoney(accountNo,withdrawAmount);
//        System.out.println(result);
//        System.out.println(accountList);

    }
}
