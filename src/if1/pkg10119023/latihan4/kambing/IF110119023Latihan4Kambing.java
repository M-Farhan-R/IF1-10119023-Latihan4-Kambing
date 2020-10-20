/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program : latihan membuat variabel lokal
 */
public class IF110119023Latihan4Kambing {
    
    /**
     * @param args the command line arguments
     */
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing= 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambahkan : "
                            + jumlahKambing);
    }
    
    public static void main(String[] args) {
       IF110119023Latihan4Kambing kambingJantan = new IF110119023Latihan4Kambing();
       kambingJantan.tambahKambing();
    }
    
}
