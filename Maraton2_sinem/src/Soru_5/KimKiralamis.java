package Soru_5;

import java.util.UUID;
import java.util.stream.Collectors;

import Soru_4.Kiralama;

public class KimKiralamis {
	Kiralama kiralama = new Kiralama();

	public void kiralayanKim(UUID id) {
		kiralama.kiralananKitapList.stream().filter(t -> t.getUuid().equals(id))
				.forEach(t -> System.out.println("Kitabı" + t.getMusteri() + "kiralamıstır."));
	}

	public void musteriBul() {
		kiralama.musteriList.stream().filter(a -> a.getAd().startsWith("ahm")).collect(Collectors.toList());
	}

	public void oncedenKiralayanlarıBul(String ad) {
		kiralama.kiralananKitapList.stream().map(x -> x.getMusteri()).collect(Collectors.toList());

	}

	public void musterininKiraladigiKitapListesiniBul(UUID id) {
		kiralama.musteriList.stream().filter(s -> s.getUuid().equals(id))
				.forEach(k -> System.out.println(k.getKitap()));
	}

}
