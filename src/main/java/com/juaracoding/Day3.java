package com.juaracoding;

public class Day3 {
    public static void main(String[] args) {
        String kategori = "Ram 8gb";
        int harga = 0;
        if (kategori == "Ram 2gb") {
            harga = 20000;
        } else if (kategori == "Ram 4gb") {
            harga = 40000;
        } else if (kategori == "Ram 8gb") {
            harga = 800000;
        }
        System.out.println("kategori: "+kategori+ " harga: "+ harga);
    }
}
