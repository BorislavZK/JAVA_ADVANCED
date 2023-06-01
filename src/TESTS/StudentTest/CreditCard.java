package TESTS.StudentTest;

public class CreditCard {

    private String number;
    private int amount;


    public CreditCard(String number, int amount) {
        this.number = number;
        setAmount(amount);
    }


    public void setAmount(int amount) {
        if (amount < 10){
            System.out.println("Amount is less then 10");
        } else {
            this.amount = amount;
        }
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }
}

