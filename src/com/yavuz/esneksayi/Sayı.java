package com.yavuz.esneksayi;

public class Sayı {
	
	int uzunluk = 0;
	int[] değerler;
	
	public void Ekle(int sayi) {		
		uzunluk++;
		int[] tmp = değerler;
		değerler = new int[uzunluk];
		for (int i = 0; i < değerler.length; i++) {
			if(i == değerler.length - 1) {
				değerler[i] = sayi;
			}
			else {
				değerler[i] = tmp[i];
			}
		}
			
		
	}
	/**
	 * Silme işlemi dizine(index) göre 
	 * yapılacaktır.
	 */
	public void Sil(int dizin) {
		int[] tmp = değerler;
		if(uzunluk > 0) 
			uzunluk--;
		
		değerler = new int[uzunluk];
		for (int i = 0; i < tmp.length; i++) {
			if (i == dizin) continue;
			if(i < dizin) değerler[i] = tmp[i];
			else değerler[i-1] = tmp[i];
		}
	}
	
	public void ArayaEkle(int sayi, int dizin) {
		if(dizin == uzunluk)
			Ekle(sayi);
		else {
			int[] tmp = değerler;
			uzunluk++;
			değerler = new int[uzunluk];
			
			for (int i = 0; i < tmp.length; i++) {
				if(i == dizin) {
					değerler[i] = sayi;
					değerler[i+1] = tmp[i];
				}				
				else if(i > dizin) 
					değerler[i+1] = tmp[i];
				else 
					değerler[i] = tmp[i];
			}
		}
	}
	public int[] Listele() {
		return değerler;
	}
	
}
