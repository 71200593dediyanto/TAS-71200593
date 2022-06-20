package org.example;

public class Barang {
    private String kode;
    private int stok;
    private static int nextNum = 1;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        String jenis = nama.split("\\s")[0];
        if (jenis.equalsIgnoreCase("keyboard")){
            this.kode = "KB00"+ Integer.toString(nextNum);
            nextNum ++;
        }else if(jenis.equalsIgnoreCase("mouse")){
            this.kode = "MS00"+ Integer.toString(nextNum);
            nextNum ++;
        }else if(jenis.equalsIgnoreCase("headset")){
            this.kode = "HS00"+ Integer.toString(nextNum);
            nextNum ++;
        }
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getNextNum() {
        return nextNum;
    }


    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }

}
