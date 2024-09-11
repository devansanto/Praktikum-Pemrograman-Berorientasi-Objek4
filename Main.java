/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author asus1
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Budi", 30, "Programmer", 90000);

        // Tampilkan informasi pekerja dengan toString()
        System.out.println(pekerja.toString());

        // Ubah nama pekerja menggunakan setter dan tampilkan ulang informasi pekerja
        pekerja.setNama("Mill West");
        System.out.println(pekerja.toString());

        // Coba akses langsung atribut nama, usia, dan gaji dari objek pekerja
        // System.out.println(pekerja.nama); // Error: nama bersifat private
        // System.out.println(pekerja.usia); // Bisa diakses karena protected (dalam package yang sama atau subclass)
        // System.out.println(pekerja.gaji); // Error: gaji bersifat private
    }
}
