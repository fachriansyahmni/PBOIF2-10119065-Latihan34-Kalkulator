package pboif2.pkg10119065.latihan34.kalkulator;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program kalkulator 
                          dengan objek
 */
public class PBOIF210119065Latihan34Kalkulator {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double usAngka1, usAngka2;
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        usAngka1 = sc.nextInt();
        System.out.print("Masukkan Angka ke-2 : ");
        usAngka2 = sc.nextInt();
        
        Calculate calculate = new Calculate(usAngka1, usAngka2);
        System.out.println("Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
