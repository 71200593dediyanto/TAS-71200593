package org.example;
import java.util.*;
import java.util.Map.Entry;

public class PointOfSales {
    private ArrayList<Barang> arrBarang = new ArrayList<Barang>();

    public PointOfSales(){}

    public void inputBarang(Barang barang){
        arrBarang.add(barang);
    }

    public void tampilDaftarBarang(){
        System.out.print("Kode Barang \t");
        System.out.print("Nama Barang \t\t\t   ");
        System.out.print("Stok \t");
        System.out.println("Harga");

        for(Barang i : arrBarang){
            System.out.println(i.getKode() + "      \t\t"+i.getNama() + "\t\t" +i.getStok() + "\t\t" +"Rp " + i.getHarga());
        }
    }

    public void checkout(HashMap<Barang,Integer> keranjang,long nominal){
        long totalTagihan = 0;

        for(Entry<Barang,Integer> i : keranjang.entrySet()){
            int totalBeli = i.getValue();
            int totalStock = i.getKey().getStok();
            long pengeluaran = totalBeli * i.getKey().getHarga();
            if(totalBeli<=totalStock && pengeluaran <= nominal){
                i.getKey().setStok(totalStock-totalBeli);
                totalTagihan += pengeluaran;

            }else {
                System.out.println("------Transaksi Untuk Produk " +i.getKey().getNama()+" Gagal !!!-----");
                return;
            }
        }
        long totalKembalian = nominal-totalTagihan;
        System.out.println("-----Transaksi sukses!-----");
        System.out.println("Total Tagihan: Rp "+totalTagihan);
        System.out.println("Total Bayar: Rp "+nominal);
        System.out.println("Total Kembalian: Rp "+totalKembalian);

    }

}
