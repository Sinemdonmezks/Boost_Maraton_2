package Soru_1;

public class Hesaplamalar {

	public static void main(String[] args) {

		Topla(1, 2, 3);
		Fark(2, 10);
		Carp(0, 3, 4);
		Bol(10, 3);
		Mod(2, 7);
		AlanDikdortgen(10, 2);
		AlanUcgen(7, 5);

	}

	public static void Topla(int... sayilar) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("sayıların toplamı...=  " + toplam);
	}

	public static void Fark(int sayi1, int sayi2) {

		int fark = sayi1 - sayi2;
		System.out.println("sayıların farkı...=  " + fark);
	}

	public static void Carp(int... numbers) {
		int carpım = 1;
		for (int i = 0; i < numbers.length; i++) {
			carpım *= numbers[i];
		}
		System.out.println("sayıların çarpımı...=  " + carpım);
	}

	public static void Bol(int s1, int s2) {
		if (s2 == 0) {
			System.out.println("ikinci sayı 0 olamaz.Sonuç Tanımsız olur...! ");
		} else {
			double bolum = (double) s1 / s2;
			System.out.println("sayıların bölümü...=  " + bolum);
		}
	}

	public static void Mod(int num1, int num2) {
		int remain = num1 % num2;
		System.out.println("sayıların bölümünden kalan...=  " + remain);
	}

	public static void AlanUcgen(int a, int b) {
		double ucgenAlan = (double) a * b / 2;

		System.out.println("üçgenin alanı...=  " + ucgenAlan);
	}

	public static void AlanDikdortgen(int a, int b) {
		int dikdortgenAlan = a * b;

		System.out.println("dikdörtgenin alanı...=  " + dikdortgenAlan);
	}

}
