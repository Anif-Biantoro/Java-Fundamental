package com.juaracoding;

// Kelas utama untuk menjalankan program
public class Main {

    //tipe data number
    byte age    = 127;
    short stock = 9999;
    float price = 10000.00f;
    double totalprice = 4000000000L;
    int cartproduct = 1000;

    //Challenge Day 2
    // Metode untuk menampilkan profil pengguna
    public static void displayProfile(String name, int age, String email) {
        System.out.println("User Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        // Mendefinisikan informasi pengguna
        String name = "Anif Biantoro";
        int age = 24;
        String email = "anifbiantoro99@gmail.com";

        // Menampilkan profil pengguna
        displayProfile(name, age, email);

        //Menampilkan path image
        String pathImage = "C:\\JuaraCoding\\java-fundamental\\3.jpg";
        System.out.println(pathImage);
    }
}
