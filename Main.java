import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b,c;
        int k;
        int alan;

        Scanner girdi = new Scanner(System.in);

        System.out.print("A Kenarını Giriniz : ");
        a = girdi.nextInt();

        System.out.print("B Kenarını Giriniz : ");
        b = girdi.nextInt();

        System.out.print("C Kenarını Giriniz : ");
        c = girdi.nextInt();

        k = (a + b + c) / 2;

        alan = (int) Math.sqrt(k * (k-a)* (k-b)*(k-c));
        System.out.println("Üçgenin Alanı : " + alan);




    }
}