import java.util.Scanner;

public class T2ProgramWhileIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) { // Perulangan akan berjalan selama count kurang dari 5
            System.out.print("Masukkan sebuah angka: ");
            int angka = scanner.nextInt();

            if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }

            count++;
        }

        System.out.println("Selesai");
        scanner.close();
    }
}
