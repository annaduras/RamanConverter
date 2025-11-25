import java.util.Scanner;

public class RomanToNumber {

    int romanToInt(String s) {
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (i + 1 < s.length()) {
                String pair = "" + c + s.charAt(i + 1);

                switch (pair) {
                    case "CM": total += 900; i += 2; continue;
                    case "CD": total += 400; i += 2; continue;
                    case "XC": total += 90;  i += 2; continue;
                    case "XL": total += 40;  i += 2; continue;
                    case "IX": total += 9;   i += 2; continue;
                    case "IV": total += 4;   i += 2; continue;
                }
            }

            switch (c) {
                case 'M': total += 1000; break;
                case 'D': total += 500;  break;
                case 'C': total += 100;  break;
                case 'L': total += 50;   break;
                case 'X': total += 10;   break;
                case 'V': total += 5;    break;
                case 'I': total += 1;    break;
                default:
                    // invalid Roman character
                    return -1;
            }
            i++;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RomanToNumber ob = new RomanToNumber();

        System.out.print("Enter a Roman numeral: ");
        String input = sc.next().toUpperCase();

        if (!input.matches("[MDCLXVI]+")) {
            System.out.println("Please input valid Roman numerals!");
            return;
        }

        int num = ob.romanToInt(input);

        if (num == -1) {
            System.out.println("Invalid Roman numeral!");
        } else {
            System.out.println("Decimal number: " + num);
        }
    }
}
