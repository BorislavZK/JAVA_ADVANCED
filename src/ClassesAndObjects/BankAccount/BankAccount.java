package ClassesAndObjects.BankAccount;

public class BankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    public BankAccount() {
        id = bankAccountCount;
        bankAccountCount ++;
    }

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years){
        return BankAccount.interestRate * years * this.balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public int getId(){
        return this.id;
    }
}
