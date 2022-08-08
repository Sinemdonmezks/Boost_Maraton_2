package Soru_4;

import java.util.ArrayList;
import java.util.List;

public class Kiralama implements IKiralama {
	public static List<Musteri> musteriList = new ArrayList<Musteri>();

	public static List<Kitap> kitapList = new ArrayList<Kitap>();
	public static List<Kitap> kiralananKitapList = new ArrayList<Kitap>();

	@Override
	public void kiralamaYap(Kitap kitap, Musteri musteri) {
		if (musteriList.contains(musteri)) {
			if (kitapList.contains(kitap)) {
				kitap.kiralandiMi = true;
				kitap.musteri.add(musteri);
				kiralananKitapList.add(kitap);
			} else {
				System.err.println("kitap bulunamadı!!");
			}
		} else {
			System.err.println("sistemde böyle bir müsteri olmadığından kiralama yapılamaz!!");
		}
	}

	@Override
	public void KiralananKitapListesi() {
		kiralananKitapList.forEach(System.out::println);
	}

	@Override
	public void ara(Musteri musteri) {
		if (musteriList.contains(musteri)) {
			System.out.println(musteri.getAd() + "isimli müsteri bulundu.");
		} else {
			System.out.println("böyle bir müsteri bulunamadı!!");
		}
	}

	@Override
	public void ara(Kitap kitap) {
		if (kitapList.contains(kitap)) {
			System.out.println(kitap.getKitapAdi() + "adlı kitap bulundu");
		} else {
			System.out.println("aranılan kitap bulunamadı!!");
		}
	}

}
