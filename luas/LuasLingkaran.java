import java.util.Scanner;

public class Luas {
	public static void main(String[] args){
		Double luas, pi;
		int r;
		pi = 3.14;

		Scanner baca = new Scanner(System.in);
		System.out.println("== Program hitung luas Lingkaran ==");
        System.out.print("Input jari-jari : ");
        r = baca.nextInt();
        luas = Double.valueOf(pi * r * r);
        System.out.print("Luas lingkaran = " + luas);
	}
}
