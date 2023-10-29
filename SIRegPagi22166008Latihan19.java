package pkgLatihan19;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan saldo tabungan selama 6 bulan dengan bunga 15℅ perbulan menggunakan perulangan for
*/
public class SIRegPagi22166008Latihan19 {

  public static void main(String[] args) {
    //saldo awal
    double saldoAwal = 2500000; 
    //Tingkat bunga perbulan 
    double tingkatBunga = 0.15; 
    //Perulangan for  
    for (int bulan = 1; bulan <= 6; bulan++) {
        double saldo = saldoAwal * (1 + tingkatBunga); 
    // Menghitung saldo baru
    System.out.printf("Saldo bulan ke-%d = %.2f%n", bulan, saldo);
    //update saldo awal untuk bulan berikutnya
    saldoAwal = saldo; 
    }
  }
}
