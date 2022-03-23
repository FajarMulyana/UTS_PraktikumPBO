package Application;
import data.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner masukan = new Scanner(System.in);
        
        Asus ROG = new Asus();
        Acer Predator = new Acer();
        
        /* Untuk test ASUS ROG */
        ROG.AsusSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        ROG.setNama(Nama);
        ROG.setProsesor(Prosesor);
        ROG.setCore(Core);
        ROG.setOs(Os);
        ROG.setRam(Ram);
        ROG.setStorage(Storage);
        ROG.setStok(Stok);
        ROG.getAllLaptopData();
        System.out.println("Store Position " + ROG.getNama() + 
                " adalah " + ROG.getStorePositionLaptop());
        System.out.println("==========================================");
                
        // ============================================================== //
        
        /* Untuk test Acer Predator */
        Predator.AcerSlogan();
        System.out.print("Nama : "); Nama = masukan.nextLine();
        System.out.print("Prosesor : "); Prosesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); Core = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); Os = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); Storage = masukan.nextLine();
        System.out.print("Stok : "); Stok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        Predator.setNama(Nama);
        Predator.setProsesor(Prosesor);
        Predator.setCore(Core);
        Predator.setOs(Os);
        Predator.setRam(Ram);
        Predator.setStorage(Storage);
        Predator.setStok(Stok);
        Predator.getAllLaptopData();
        System.out.println("Store Position " + Predator.getNama() + 
                " adalah " + Predator.getStorePositionLaptop());
        System.out.println("==========================================");       
    }
}