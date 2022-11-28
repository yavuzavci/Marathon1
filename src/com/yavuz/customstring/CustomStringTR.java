package com.yavuz.customstring;

public class CustomStringTR {
	public String değer;
	
	public int uzunluk() {
		return değer.length();
	}
	
	public String değiştir(String hedef, String kaynak) {
		return değer.replace(hedef, kaynak);
	}
	
	public boolean boşMu() {
		return değer.isEmpty();
	}
	
	public boolean karakterVarMı() {
		return değer.isBlank();
	}
	
	public String dıştakiBoşluklarıAyır() {
		return değer.trim();
	}
	
	public String altİfade(int başlangıç) {
		return değer.substring(başlangıç);
	}
	
	public String altİfade(int başlangıç,int bitiş) {
		return değer.substring(başlangıç, bitiş);
	}
	
	public boolean eşitMi(String ifade) {
		return değer.equals(ifade);
	}
	
	public String harfleriBüyükYap() {
		return değer.toUpperCase();
	}
	public String harfleriKüçükYap() {
		return değer.toLowerCase();
	}
}
