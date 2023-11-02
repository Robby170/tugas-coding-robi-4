import java.util.Scanner;

public class T3YourZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir (contoh: 25): ");
        int tanggal = input.nextInt();

        System.out.print("Masukkan bulan lahir (contoh: 4 untuk April): ");
        int bulan = input.nextInt();

        if (isValidDate(tanggal, bulan)) {
            String zodiacSign = findZodiacSign(tanggal, bulan);
            System.out.println("Zodiak Anda adalah: " + zodiacSign);
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }

        input.close();
    }

    public static boolean isValidDate(int day, int month) {
        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (day < 1 || day > daysInMonth[month]) {
            return false;
        }

        return true;
    }

    public static String findZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
}
