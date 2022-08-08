package Soru_4;

import java.util.List;

public class Musteri extends Kisi {

	private boolean kitapciyaUyeMi;
	private String cinsiyeti;
	List<Kitap> kitap;

	public Musteri(StaticValues uuid, String ad, String soyad, String adres, String telefon, boolean kitapciyaUyeMi,
			String cinsiyeti, List<Kitap> kitap) {
		super(uuid, ad, soyad, adres, telefon);
		this.kitapciyaUyeMi = kitapciyaUyeMi;
		this.cinsiyeti = cinsiyeti;
		this.kitap = kitap;
	}

	public List<Kitap> getKitap() {
		return kitap;
	}

	public void setKitap(List<Kitap> kitap) {
		this.kitap = kitap;
	}

	public boolean isKitapciyaUyeMi() {
		return kitapciyaUyeMi;
	}

	public void setKitapciyaUyeMi(boolean kitapciyaUyeMi) {
		this.kitapciyaUyeMi = kitapciyaUyeMi;
	}

	public String getCinsiyeti() {
		return cinsiyeti;
	}

	public void setCinsiyeti(String cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}

	@Override
	public String toString() {
		return "Musteri [kitapciyaUyeMi=" + kitapciyaUyeMi + ", cinsiyeti=" + cinsiyeti + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getAdres()=" + getAdres() + ", getTelefon()=" + getTelefon() + "]";
	}

}
