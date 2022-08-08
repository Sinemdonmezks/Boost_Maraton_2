package Soru_4;

public class Kasiyer extends Kisi {
	private int kasaNo;
	private ECalismaTuru calismaTuru;// parttime-fulltime

	public Kasiyer(StaticValues uuid, String ad, String soyad, String adres, String telefon, int kasaNo,
			ECalismaTuru calismaTuru) {
		super(uuid, ad, soyad, adres, telefon);
		this.kasaNo = kasaNo;
		this.calismaTuru = calismaTuru;
	}

	public int getKasaNo() {
		return kasaNo;
	}

	public void setKasaNo(int kasaNo) {
		this.kasaNo = kasaNo;
	}

	public ECalismaTuru getCalismaTuru() {
		return calismaTuru;
	}

	public void setCalismaTuru(ECalismaTuru calismaTuru) {
		this.calismaTuru = calismaTuru;
	}

	@Override
	public String toString() {
		return "Kasiyer [kasaNo=" + kasaNo + ", calismaTuru=" + calismaTuru + ", getAd()=" + getAd() + ", getSoyad()="
				+ getSoyad() + ", getAdres()=" + getAdres() + ", getTelefon()=" + getTelefon() + "]";
	}

}
