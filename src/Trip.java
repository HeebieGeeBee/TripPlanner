import java.util.Scanner;

public class Trip {

    public static void main(String[] args) {
        // Greeting
        greeting();
        // Trip Details
        details();
        // Location Details
        location();
        // Land Area
        landArea();
    }

    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your Name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("************");
        System.out.println();
    }

    public static void details() {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String moneyCode = input.next().toUpperCase();
        System.out.print("How many " + moneyCode + " are there in 1 USD? ");
        System.out.println();
        double rate = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        double dayBudget = money / (double) days;
        dayBudget = round(dayBudget);
        double moneyConverted = money * rate;
        moneyConverted = round(moneyConverted);
        System.out.println("If you are traveling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + dayBudget + " USD");
        System.out.println("Your total budget in " + moneyCode + " is " + moneyConverted + " " + moneyCode + ", which per day is " + round(moneyConverted / days) + " " + moneyCode);
        System.out.println("************");
        System.out.println();
    }

    public static void location() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time = input.nextInt();
        int midnightTime = time + 12 > 24  ? (time + 12) % 24 : time + 12;
        System.out.println("That means that when it is midnight at home it will be " + time + ":00 in your travel destination and when it is noon at home it will be " + midnightTime + ":00");
        System.out.println("************");
        System.out.println();
    }

    public static void landArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of you destination country in km2? ");
        double area = input.nextDouble();
        double areaMiles = area * 0.621371;
        System.out.println("In miles2 that is " + round(areaMiles));
    }

    public static double round(double num) {
        double numX = num * 100;
        numX = (int) numX;
        return (double) numX / 100.0;
    }
}
