package abstractFactoryPattern;

public class loan extends bankAccount{
    int p;
    int t;
    int i = 10;
    public void createAccount(){
        System.out.println("Your Loan account has been created");
    }
    public void interestRate(int p, int t){
        this.p = p;
        this.t = t;
        double si;
        si = (p*t*i)/100;
        System.out.println("The interested amount is : "+si);
    }
}
