import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz : ");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + vki);



    }
}
