
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Kendaraan {
    //method static tampil//
    static void tampil(){
        //membuat objek scan dari class library scanner//
        Scanner masukan = new Scanner(System.in);    
        //deklarasi variable//
        String jenis, cc, brand, warna, no_plat;
        
        System.out.println("========== PENDATAAN KENDARAAN MOBIL ==========");
        System.out.println("");
        //membuat inputan user dari tipe data string (nextLine)//
        System.out.print("Masukan Jenis Mobil      : ");
        jenis = masukan.nextLine();
        System.out.print("Masukan CC Mobil         : ");
        cc = masukan.nextLine();
        System.out.print("Masukan Brand Mobil      : ");
        brand = masukan.nextLine();
        System.out.print("Masukan Warna Mobil      : ");
        warna = masukan.nextLine();
        System.out.print("Masukan Plat Nomer Mobil : ");
        no_plat = masukan.nextLine();
        System.out.println("");
        //output//
        System.out.println("------------ DATA KENDARAAN ANDA ------------");
        System.out.println("");
        System.out.println("Jenis Mobil      : "+jenis);
        System.out.println("CC Mobil         : "+cc);
        System.out.println("Brand Mobil      : "+brand);
        System.out.println("Warna Mobil      : "+warna);
        System.out.println("Plat Nomer Mobil : "+no_plat);
        System.out.println("---------------------------------------------");
    }     
}

     
     