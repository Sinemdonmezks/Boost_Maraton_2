package Soru_3;

public class CostumString {
	String ifadem = "bugün hava çok güzel    ";

	public int uzunluk() {

		return ifadem.length();

	}

	public String buyukyap() {
		return ifadem.toUpperCase();
	}

	public String kucukyap() {
		return ifadem.toLowerCase();
	}

	public String boslukAt() {
		return ifadem.trim();
	}

	public String kesilecek(int i, int j) {

		return ifadem.substring(i, j);

	}

	public boolean esitmi(String yeniifade) {
		return ifadem.equals("yeniifade");

	}

	public boolean baslıyormu(String karakter) {
		return ifadem.startsWith("karakter");

	}

	public boolean bitiyormu(String karakter) {
		return ifadem.endsWith("karakter");

	}

	public boolean varmı(String ifade) {
		return ifadem.contains("ifade");

	}

	public int gectigiIlkYer(String n) {
		return ifadem.indexOf("n");

	}

	public String degerDegiştirme(String eskideger, String yeniDeger) {
		ifadem = ifadem.replace(eskideger, yeniDeger);
		return ifadem;
	}
}
