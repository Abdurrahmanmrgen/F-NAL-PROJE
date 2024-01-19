import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class proje14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("İlk tarihi girin (GG/AA/YYYY): ");
        String ilkTarihStr = scanner.nextLine();
        LocalDate ilkTarih = parseTarih(ilkTarihStr);


        System.out.print("İkinci tarihi girin (GG/AA/YYYY): ");
        String ikinciTarihStr = scanner.nextLine();
        LocalDate ikinciTarih = parseTarih(ikinciTarihStr);


        Duration fark = hesaplaTarihFarki(ilkTarih, ikinciTarih);


        System.out.println("tarih Farkı: " + fark.toDays() + " gün, " +
                fark.toHoursPart() + " saat, " +
                fark.toMinutesPart() + " dakika, " +
                fark.toSecondsPart() + " saniye.");
    }

    private static LocalDate parseTarih(String tarihStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(tarihStr, formatter);
    }

    private static Duration hesaplaTarihFarki(LocalDate ilkTarih, LocalDate ikinciTarih) {
        LocalDateTime ilkDateTime = ilkTarih.atStartOfDay();
        LocalDateTime ikinciDateTime = ikinciTarih.atStartOfDay();
        return Duration.between(ilkDateTime, ikinciDateTime);
    }
}