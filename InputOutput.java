import java.util.Scanner;

public class InputOutput{
    public static void main(String [] args ){
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahSks;
        double IPK;

        System.out.print("Masukkan Nama Anda : ");
        nama = scanner.nextLine();
        
        System.out.print("Masukkan jumlah SKS yang sudah anda tempuh: ");
        jumlahSks = scanner.nextInt();

        System.out.print("Masukkan IPK sementara anda: ");
        IPK = scanner.nextDouble();

        double jumlah = IPK * jumlahSks;
        System.out.print("Hai, " + nama + ". Total Nilai = " + jumlah);
    }
}