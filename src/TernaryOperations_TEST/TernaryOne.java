package TernaryOperations_TEST;

public class TernaryOne {
    public static void main(String[] args) {

        int grade = 75;
        String result = (grade >= 60) ? "pass" : "fail";
        System.out.println("The student has " + result + "ed the exam.");


        int num = 5;
        String sign = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        System.out.println(num + " is " + sign);


        int year = 2024;
        String isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "a leap year" : "not a leap year";
        System.out.println(year + " is " + isLeapYear);


    }
}
