
package room;

import java.util.Scanner;


public class Room {

    public static void main(String[] args) {
        int sewa,kamar,harga;
        System.out.println("Silahkan Pilih Kamar Anda");
        System.out.println("Kamar Basic     (1)          Rp: 200.000,00/Malam");
        System.out.println("Kamar Elite     (2)          Rp: 500.000,00/Malam");
        System.out.println("kamar Special   (5)          Rp: 700.000,00/Malam");
        System.out.println("Kamar Epic      (4)          Rp: 1.000.000,00/Malam");
        Scanner input = new Scanner(System.in);
        System.out.println("Kamar Manakah Yang Anda Pilih : ");
        kamar = input.nextInt();
        System.out.println("Berapa Malam Anda Ingin Menginap : ");
        sewa = input.nextInt();
        if (kamar == 1)
        {
            harga = sewa * 200;
            System.out.println(harga + ".000 Adalah Total Harga Yang Anda Bayar");
        }
        else if (kamar == 2)
        {
            harga = sewa * 500;
            System.out.println(harga + ".000 Adalah Total Harga Yang Anda Bayar");
        }
        else if (kamar == 3)
        {
            harga=sewa * 700;
            System.out.println(harga + ".000 Adalah Total Harga Yang Anda Bayar");
        }
        else if (kamar == 4)
        { 
            harga = sewa * 1;
            System.out.println( harga + ".ooo.ooo Adalah Total Harga Yang Anda Harus Bayar");
        }
        else 
        {
            System.out.println("maaf inputan anda salah");
        }
    }
    
}
