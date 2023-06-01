package TESTS.StudentTest;

public class Student {

    private String name;
    private int id;
    private CreditCard creditCard;


    public Student(String name, int id, CreditCard creditCard) {
        this.name = name;
        this.id = id;
        this.creditCard = creditCard;
    }

    public int getCreditCard() {
        return creditCard.getAmount();

    }
}
