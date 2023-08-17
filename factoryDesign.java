package abstractFactoryPattern;

import java.util.Scanner;

public class factoryDesign {
    public static void main(String[] args){
        bankFactory bf = new bankFactory();
        System.out.println("Enter the account name you want to be created : \n 1. Saving \n 2. Current \n 3. Loan");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        switch (a){
            case 1 :
                str = "saving";
                break;
            case 2 :
                str = "current";
                break;
            case 3 :
                str = "loan";
                break;
            default:
                str = null;
                System.out.println("please enter a valid account");
        }
        bankAccount ba = bf.getInstance(str);
        ba.createAccount();
        System.out.println("Please enter Initial amount");
        int p = sc.nextInt();
        System.out.println("Please enter time for the interest in years");
        int t = sc.nextInt();
        ba.interestRate(p, t);
    }
}
