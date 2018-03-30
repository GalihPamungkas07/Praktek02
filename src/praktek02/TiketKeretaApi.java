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
public class TiketKeretaApi {
    Integer harga_tiket;
    Integer jumlah_tiket;

    public TiketKeretaApi() {
     harga_tiket=150000;
     jumlah_tiket=2;
    }

    public TiketKeretaApi(Integer harga_tiket, Integer jumlah_tiket) {
        this.harga_tiket = harga_tiket;
        this.jumlah_tiket = jumlah_tiket;
    }
    
    
    
    void cetakInfo(){
    System.out.println("==================================");
    System.out.println("harga_tiket :"+harga_tiket);
    System.out.println("jumlah_tiket :"+jumlah_tiket);
    System.out.println("==================================");
    }
        Integer hitungPembelian(){
            Integer total;
            total=harga_tiket*jumlah_tiket;
            return total;    
    }
        void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPembelian());
    }
}
