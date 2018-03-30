/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author W7
 */
public class TiketKeretaApiAksi {
    public static void main(String[] args) {
        TiketKeretaApi r1 = new TiketKeretaApi();
        r1.harga_tiket = 250000;
        r1.jumlah_tiket = 2;
        
        r1.cetakInfo();
        System.out.println("total   =   "+r1.hitungPembelian());
        r1.cetaktotal();
    }
}
