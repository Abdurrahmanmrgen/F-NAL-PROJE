import java.util.Random;
import java.util.Scanner;

public class proje11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.print("Taş, kağıt ya da makas? (Çıkış için 'q' girin): ");
            String kullaniciSecimi = scanner.nextLine().toLowerCase();


            if (kullaniciSecimi.equals("q")) {
                System.out.println("Oyunu sonlandırdınız. İyi günler!");
                break;
            }


            String[] secenekler = {"taş", "kağıt", "makas"};
            int bilgisayarSecimiIndex = random.nextInt(secenekler.length);
            String bilgisayarSecimi = secenekler[bilgisayarSecimiIndex];


            System.out.println("Siz: " + kullaniciSecimi);
            System.out.println("Bilgisayar: " + bilgisayarSecimi);


            if (kullaniciSecimi.equals(bilgisayarSecimi)) {
                System.out.println("Berabere!");
            } else if ((kullaniciSecimi.equals("taş") && bilgisayarSecimi.equals("makas"))
                    || (kullaniciSecimi.equals("kağıt") && bilgisayarSecimi.equals("taş"))
                    || (kullaniciSecimi.equals("makas") && bilgisayarSecimi.equals("kağıt"))) {
                System.out.println("Tebrikler! Kazandınız!");
            } else {
                System.out.println("Maalesef kaybettiniz. Başka bir seferde tekrar deneyin!");
            }
        }
    }
}
