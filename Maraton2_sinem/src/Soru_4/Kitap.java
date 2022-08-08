package Soru_4;

import java.util.List;

public class Kitap {
	private StaticValues uuid;
	private String kitapAdi;
	private String yazarAdi;
	boolean kiralandiMi = false;
	List<Musteri> musteri;

	public Kitap(StaticValues uuid, String kitapAdi, String yazarAdi, boolean kiralandiMi) {
		super();
		this.uuid = uuid;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kiralandiMi = kiralandiMi;
	}

	public List<Musteri> getMusteri() {
		return musteri;
	}

	public void setMusteri(List<Musteri> musteri) {
		this.musteri = musteri;
	}

	public StaticValues getUuid() {
		return uuid;
	}

	public void setUuid(StaticValues uuid) {
		this.uuid = uuid;
	}

	public boolean isKiralandiMi() {
		return kiralandiMi;
	}

	public void setKiralandiMi(boolean kiralandiMi) {
		this.kiralandiMi = kiralandiMi;
	}

	public StaticValues getId() {
		return uuid;
	}

	public void setId(StaticValues id) {
		this.uuid = id;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + uuid + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + "]";
	}

}
