/*
 **NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan bilangan terkecil dan terbesar
 * clas Nilai.java ini nanti di panggil di clas utama
 */
package pbo2.pkg10117043.latihan39.nilai.terbesar.dan.terkecil;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Nilai {

    int i, nBanyak, nilai[];
    float rata = 0;
    String Nama;

    public void NilaiBesarKecil(int i, int parBanyak, int parNilai[]) {
        Scanner input = new Scanner(System.in);

        parNilai = new int[20];

        for (i = 1; i <= parBanyak; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + i + " : ");
            parNilai[i] = input.nextInt();
        }

        System.out.println("");
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= parBanyak; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + parNilai[i]);
        }

        System.out.println("");
        int max = parNilai[1];
        int min = parNilai[1];
        for (i = 1; i <= parBanyak; i++) {
            if (parNilai[i] > max) {
                max = parNilai[i];
                System.out.println("Nilai terbesar adalah " + max);
            } else if (parNilai[i] < min) {
                min = parNilai[i];
                System.out.println("Nilai terkecil adalah " + min);
            }
        }

    }
}
