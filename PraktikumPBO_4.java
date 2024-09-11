/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author asus1
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja dan inisialisasi dengan nama, usia, pekerjaan, dan gaji
        Pekerja pekerja = new Pekerja("Devan", 20, "Programmer", 999999);

        // Tampilkan informasi pekerja dengan menggunakan metode toString()
        System.out.println(pekerja.toString());

        // Ubah nama pekerja menggunakan metode setter dan tampilkan ulang informasi pekerja
        pekerja.setNama("Mill West");
        System.out.println(pekerja.toString());

        // Coba akses langsung atribut nama, usia, dan gaji dari objek pekerja
        // System.out.println(pekerja.nama); // Error: nama bersifat private
        // System.out.println(pekerja.usia); // Bisa diakses karena protected (dalam package yang sama atau subclass)
        // System.out.println(pekerja.gaji); // Error: gaji bersifat private

        // Penjelasan:
        // 1. Atribut `nama` tidak bisa diakses langsung karena private.
        // 2. Atribut `usia` bisa diakses langsung karena protected.
        // 3. Atribut `gaji` tidak bisa diakses langsung karena private.
    }
}