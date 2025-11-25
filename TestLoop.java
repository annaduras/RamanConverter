public class TestLoop {

    public static void main(String[] args) {

        NumberToRoman toRoman = new NumberToRoman();
        RomanToNumber toNumber = new RomanToNumber();

        for (int num = 1; num <= 4000; num++) {

            String roman = toRoman.intToRoman(num);
            int back = toNumber.romanToInt(roman);

            System.out.println(num + "  ->  " + roman + "  ->  " + back);

            // Check for any mismatch
            if (num != back) {
                System.out.println("ERROR at: " + num + " (Converted back: " + back + ")");
                break;
            }
        }

        System.out.println("Finished up to 4000!");
    }
}
