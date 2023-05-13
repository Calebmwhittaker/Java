// public class Main {
// public static void main(String[] args) {
// byte age = 30;
// int herAge = age - 10;
// long viewsCount = 3_123_456_789L;
// float price = 10.99F;
// double percent = 11.1;
// char letter = 'A';
// String word = "Cat";
// boolean isEligible = true;
// System.out.println(word);
// }
// }

// import java.util.Date;

// public class Main {
// public static void main(String[] args) {
// byte age = 30;
// Date now = new Date();
// System.out.println(now);
// }
// }

// public class Main {
// public static void main(String[] args) {
// String message = "Hello World!";
// System.out.println(message.endsWith("!"));
// System.out.println(message.replace("World", "Caleb"));
// System.out.println(message);
// }
// }

// public class Main {
// public static void main(String[] args) {
// String message = "Welcome to \\103";
// System.out.println(message);
// }
// }

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// // OLD Syntax
// // int[] numbers = new int[5];
// // numbers[0] = 1;
// // numbers[1] = 2;
// // numbers[2] = 3;
// // numbers[3] = 4;
// // numbers[4] = 5;

// // NEW Syntax
// int[] numbers = { 1, 2, 3, 4, 5 };
// System.out.println(Arrays.toString(numbers));
// }
// }

// public class Main {
// public static void main(String[] args) {
// final float PI = 3.14F;
// }
// }

// public class Main {
// public static void main(String[] args) {
// double result = (double) 10 / (double) 3;
// System.out.println(result);
// }
// }

// public class Main {
// public static void main(String[] args) {
// short x = 1;
// int y = x + 2;
// System.out.println(y);
// }
// }

// public class Main {
// public static void main(String[] args) {
// byte result = (byte) Math.round(Math.random() * 100);
// System.out.println(result);
// }
// }

// import java.text.NumberFormat;

// public class Main {
// public static void main(String[] args) {
// NumberFormat currency = NumberFormat.getCurrencyInstance();
// String result = currency.format(1234567.891);
// System.out.println(result);
// String result = NumberFormat.getPercentInstance().format(0.2);
// System.out.println(result);
// }
// }

// public class Main {
//     public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Age: ");
// short age = scanner.nextShort();
// System.out.println("You are " + age);
// Scanner scanner = new Scanner(System.in);
// System.out.print("Name: ");
// String name = scanner.next();
// System.out.println("You are " + name);
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Name: ");
//         String fullName = scanner.nextLine().trim();
//         System.out.println("You are " + fullName);
//     }
// }

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principalCurrencyInput = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRateInput = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int loanTerm = scanner.nextInt();
        int loanTermMonths = loanTerm * 12;

        double calculation = principalCurrencyInput
                * ((annualInterestRateInput / 100 / 12) * (Math.pow((1 + (annualInterestRateInput / 100 / 12)), loanTermMonths)))
                / (Math.pow((1 + (annualInterestRateInput / 100 / 12)), loanTermMonths) - 1);
        String mortgage = NumberFormat.getCurrencyInstance().format(calculation);
        System.out.println("Mortgage: " + mortgage);
    }
}