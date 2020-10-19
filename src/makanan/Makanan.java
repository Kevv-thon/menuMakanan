/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makanan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Nasi Ayam  ", "Nasi Padang", "Jus Jeruk  ", "Es Teh     "};
        int[] harga = {12000, 10000, 11000, 4000, 2000};
        
        System.out.println("Selamat Datang di Rumah Makan");
        System.out.println("Daftar Menu");
        
        for (int i = 0; i < harga.length; i++) {
            System.out.println(i+". " +menu[i]+" : "+harga[i]);   
        }
        System.out.print("Masukkan pilihan anda : ");
            int pilih = input.nextInt();
            
            switch (pilih) {
                case 0 : System.out.print("Masukkan uang anda : ");
                int uang = input.nextInt();
                int jumlah = uang - harga[pilih];
                System.out.println("Kembalian anda " +jumlah);
                break;
                case 1 : System.out.print("Masukkan uang anda : ");
                int uang1 = input.nextInt();
                int jumlah1 = uang1 - harga[pilih];
                System.out.println("Kembalian anda " +jumlah1);
                break;
                case 2 : System.out.print("Masukkan uang anda : ");
                int uang2 = input.nextInt();
                int jumlah2 = uang2 - harga[pilih];
                System.out.println("Kembalian anda " +jumlah2);
                break;
                case 3 : System.out.print("Masukkan uang anda : ");
                int uang3 = input.nextInt();
                int jumlah3 = uang3 - harga[pilih];
                System.out.println("Kembalian anda " +jumlah3);
                break;
                case 4 : System.out.print("Masukkan uang anda : ");
                int uang4 = input.nextInt();
                int jumlah4 = uang4 - harga[pilih];
                System.out.println("Kembalian anda " +jumlah4);
                break;
            }
    }
    
}
