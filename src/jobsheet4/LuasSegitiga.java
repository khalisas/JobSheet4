
package jobsheet4;

import java.util.Scanner;

public class LuasSegitiga {
    
    public static void main (String[] ar){
        // Deklarasi
       Double luas;
       int alas , tinggi;
       
       //membuat scanner baru
       Scanner baca = new Scanner(System.in);
       
       // Input
       System.out.println ("== program hitung luas segitiga ==");
       System.out.print("Input alas: ");
       alas= baca.nextInt();
       
       System.out.print ("Input tnggi: ");
       tinggi= baca.nextInt();
       
       // Proses
       luas = Double.valueOf((alas * tinggi) / 2);
       System.out.print ("luas: "+ luas);
    }
    
    
}
