package com.company;

import java.util.Scanner;

public class Main {

    static int index;
    static String jumlah;

    public static void main(String[] args) {
        DetailHewan hewan1 = new DetailHewan();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah: ");
        jumlah = scanner.nextLine();
        System.out.print("Masukkan angka 1-4 : ");
        index = scanner.nextInt();

        hewan1.pilihanHewan(index,jumlah);

    }
}
