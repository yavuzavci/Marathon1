package com.yavuz.aritmetik;

public class Aritmetik {
	
	public double topla(double... sayilar) {
		double toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}		
		return toplam;
	}
	
	/**
	 * Hesap makinesinde olduğu gibi ilk sayı girildikten
	 * sonra diğer sayılar sırayla sonuçtan çıkarılır.
	 * @param sayilar
	 * @return sonuç
	 */
	public double cikar(double... sayilar) {
		double sonuc = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if(i == 0) 
				sonuc = sayilar[i];
			else 
				sonuc -= sayilar[i];
		}		
		return sonuc;
	}
	/**
	 * Hesap makinesinde olduğu gibi ilk sayı girildikten
	 * sonra diğer sayılar sırayla çarpma işlemine tabi tutulur.
	 * @param sayilar
	 * @return sonuç
	 */
	public double carp(double... sayilar) {
		double sonuc = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if(i == 0) 
				sonuc = sayilar[i];
			else 
				sonuc *= sayilar[i];
		}		
		return sonuc;
	}
	
	/**
	 * Hesap makinesinde olduğu gibi ilk sayı girildikten
	 * sonra diğer sayılar sırayla bölme işlemine tabi tutulur.
	 * Sadece ilk sayı 0 olabilir. İlk sayıdan sonraki sayılardan
	 * herhangi biri 0 olursa sonuç double veri tipinin alabileceği
	 * en küçük sayı olur.
	 * @param sayilar
	 * @return sonuç
	 */
	public double bol(double... sayilar) {
		double sonuc = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if(i == 0)
				sonuc = sayilar[i];
			else {
				if(sayilar[i] != 0)
					sonuc /= sayilar[i];
				else {
					System.err.println("HATA: SIFIRA BÖLME YAPILAMAZ.");
					return Double.MIN_VALUE;
				}					
			}
		}		
		return sonuc;
	}
		
	public double kareninAlaniniHesapla(double kenar) {
		return kenar * kenar;
	}
	
	public double dikdortgeninAlaniniHesapla(double kisaKenar, double uzunKenar) {
		return kisaKenar * uzunKenar;
	}
		
	public double eskenarUcgeninAlaniniHesapla(double kenar) {
		return kenar * kenar * Math.sqrt(3) / 4;
	}
		
	public double cemberinAlaniniHesapla(double yaricap) {
		return Math.PI * yaricap * yaricap;
	}
	
	

}
