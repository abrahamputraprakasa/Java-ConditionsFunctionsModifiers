package site.abrahamprakasa;

import java.util.Scanner;

public class Main {

    static boolean masih = true;
    static final String NAMA_PIZZA = "Meat Loversss";
    public static void main(String[] args) {
	// write your code here
        tampilkanMenu();

//        Mobil mobil = new Mobil();
//        mobil.tipeMobil();
    }



    private static void tampilkanMenu(){
        do {
            System.out.println("---- Makanan hari ini ----");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Cookies");
            System.out.print("Pilihan anda (masukkan angka): ");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            String hasil;
            switch (input){
                case "1":
                case "10":
                    hasil = NAMA_PIZZA;
                    break;
                case "2":
                    hasil = "Chisburger";
                    break;
                case "3":
                    hasil = "Good Time";
                    break;
                default:
                    hasil = "nothing to eat";
                    masih = false;
                    break;
//                    return;
            }

            System.out.println(hasil);
            System.out.println();
            System.out.println();
        } while (masih);
    }
}
