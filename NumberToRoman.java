import java.util.Scanner;

public class NumberToRoman {

    String intToRoman(int num) {
        StringBuilder r = new StringBuilder();

        while (num >= 1000) { r.append("M"); num -= 1000; }
        if (num >= 900) { r.append("CM"); num -= 900; }
        if (num >= 500) { r.append("D"); num -= 500; }
        if (num >= 400) { r.append("CD"); num -= 400; }
        while (num >= 100) { r.append("C"); num -= 100; }

        if (num >= 90) { r.append("XC"); num -= 90; }
        if (num >= 50) { r.append("L"); num -= 50; }
        if (num >= 40) { r.append("XL"); num -= 40; }
        while (num >= 10) { r.append("X"); num -= 10; }

        if (num == 9) { r.append("IX"); return r.toString(); }
        if (num >= 5) { r.append("V"); num -= 5; }
        if (num == 4) { r.append("IV"); return r.toString(); }
        while (num >= 1) { r.append("I"); num -= 1; }

        return r.toString();
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    NumberToRoman ob = new NumberToRoman();

    System.out.print("Enter a decimal number: ");
    String input = sc.next();   

    try {
        int num = Integer.parseInt(input);

        if (num < 0) {
            System.out.println("Please enter a positive number!");
            return;
        }

        if (num > 3999) {
            System.out.println("The conventional system only goes up to 3999!");
            return;
        }

    } catch (NumberFormatException e) {
        System.out.println("Please input real numbers!");
    }

    int num = Integer.parseInt(input);
    System.out.println("Roman numeral: " + ob.intToRoman(num));
}

}
