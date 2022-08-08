package Soru_6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class HataYakalama {

	static String[] aileUyeleri;
	static int sayi;

	public static void main(String[] args) {

		hatalariYaz();
		try {

			File file = new File("deneme.txt");
			if (file.exists()) {
				BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
				bf.append("deneme");
				bf.newLine();
				bf.close();
			} else {
				throw new FileNotFoundException();
			}

			int aileUyesi = Integer.parseInt("ışıl");
			System.out.println("3.aile üyesi " + aileUyeleri[3]);
		} catch (NullPointerException e) {
			System.out.println("aileUyeleri dizisi Boş olarak kullanılmaktadır.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Geçersiz değer girdiniz. [1-3] arası bir değer giriniz");
		} catch (NumberFormatException e) {
			System.out.println("Sayı değeri beklenirken sözel bir ifade girilmiştir. lütfen sayısal değer giriniz.");
		} catch (FileNotFoundException e) {
			System.out.println("işlem yapılan dosya bulunamadı");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void hatalariYaz() {
		String[] aileUyeleri = { "sinem", "kemal", "ışıl" };

	}
}
