package abstractFactoryPattern;

public class saving extends bankAccount{
    int p;
    int i = 6;
    int t;
    public void createAccount(){
        System.out.println("Your saving account has been created");
    }
    public void interestRate(int p, int t){
        this.p = p;
        this.t = t;
        double si;
        si = (p*t*i)/100;
        System.out.println("Your interest amount is : "+ si);
        System.out.println("The total amount is : " +(p+si));
    }
}
