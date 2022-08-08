package Soru_4;

/**
 * 
 * @author sinemdonmez
 *
 */
public abstract class Kisi {
	private StaticValues uuid;
	private String ad;
	private String soyad;
	private String adres;
	private String telefon;

	public Kisi(StaticValues uuid, String ad, String soyad, String adres, String telefon) {
		super();
		this.uuid = uuid;
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.telefon = telefon;
	}

	public StaticValues getUuid() {
		return uuid;
	}

	public void setUuid(StaticValues uuid) {
		this.uuid = uuid;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Kisi [id=" + uuid + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", telefon=" + telefon
				+ "]";
	}

}
