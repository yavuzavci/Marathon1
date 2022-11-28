package com.yavuz.aritmetik;

import java.util.Scanner;

public class Runner {
	
	private static final Aritmetik aritmetik = new Aritmetik();
	private static final Scanner sc = new Scanner(System.in);
	private static int secim = 0;
	
	public static void main(String[] args) {
		
		do {
			secim = menu();
			sc.nextLine();
			switch(secim) {
				case 1: 
					toplamaYap();
					break;
				case 2: 
					cikarmaYap();
					break;
				case 3: 
					carpmaYap();
					break;
				case 4: 
					bolmeYap();
					break;
				case 5: 
					kareninAlaniniHesapla();
					break;
				case 6: 
					dikdortgeninAlaniniHesapla();
					break;
				case 7: 
					eskenarUcgeninAlaniniHesapla();
					break;
				case 8: 
					cemberinAlaniniHesapla();
					break;
				case 0:
					sc.close();
					System.out.println("Çıkış yapıldı.");
					break;
				default:
					System.err.println("HATA: Geçersiz seçim yaptınız.");
					break;
			}
		} while (secim != 0);
		
	}
	
	private static int menu() {
		System.out.println("######## Aritmetik İşlemler ########");
		System.out.println("1- Toplama İşlemi");
		System.out.println("2- Çıkarma İşlemi");
		System.out.println("3- Çarpma İşlemi");
		System.out.println("4- Bölme İşlemi");
		System.out.println("5- Karenin alanını hesapla");
		System.out.println("6- Dikdörtgenin alanını hesapla");
		System.out.println("7- Eşkenar üçgenin alanını hesapla");
		System.out.println("8- Çemberin alanını hesapla");
		System.out.println("0- ÇIKIŞ");
		System.out.print("Lütfen seçiminizi yapın..: ");
		secim = sc.nextInt();
		return secim;
	}
	
	private static double[] sayilariAl() {
		System.out.print("Kaç sayı gireceksiniz? -> ");
		int sayiAdedi = sc.nextInt();
		int index = 0;
		if(sayiAdedi <= 1)
			return null;
		else {
			double[] sayilar = new double[sayiAdedi];
			
			while(index != sayiAdedi) {
				System.out.print((index + 1) + ". sayınızı girin..: ");
				sayilar[index] = sc.nextDouble();
				index++;
			}
			
			return sayilar;
		}
	}
	
	private static boolean bolmeYapilabilirMi(double... sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			if(i == 0) 
				continue;
			
			if(sayilar[i] == 0)
				return false;
		}		
		return true;
	}
	
	private static void toplamaYap() {
		System.out.println("++++++++ Toplama İşlemi ++++++++");
		double[] sayilar = sayilariAl();
		
		if(sayilar == null) {
			System.err.println("Toplama yapabilmek için en az 2 sayı girmelisiniz.");
		}		
		else {
			double sonuc = aritmetik.topla(sayilar);
			System.out.println("Toplama işleminin sonucu..: " + sonuc);
		}
		
	}		
	
	private static void cikarmaYap() {
		System.out.println("-------- Çıkarma İşlemi --------");
		double[] sayilar = sayilariAl();
		
		if(sayilar == null) 
			System.err.println("Toplama yapabilmek için en az 2 sayı girmelisiniz.");
		else {	
			double sonuc = aritmetik.cikar(sayilar);
			System.out.println("Çıkarma işleminin sonucu..: " + sonuc);
		}
	}
	
	private static void carpmaYap() {
		System.out.println("******** Çarpma İşlemi ********");
		double[] sayilar = sayilariAl();
		
		if(sayilar == null)
			System.err.println("Çarpma yapabilmek için en az 2 sayı girmelisiniz.");
		else {
			double sonuc = aritmetik.carp(sayilar);
			System.out.println("Çarpma işleminizin sonucu..: " + sonuc);
		}
	}
	
	private static void bolmeYap() {
		System.out.println("//////// Bölme İşlemi ////////");
		double[] sayilar = sayilariAl();
		
		if(sayilar == null) {
			System.err.println("Bölme yapabilmek için en az 2 sayı girmelisiniz.");
		}
		else {
			if(!bolmeYapilabilirMi(sayilar))
				System.err.println("HATA: Sıfıra bölme yapılamaz.");
			else {
				double sonuc = aritmetik.carp(sayilar);
				System.out.println("Bölme işleminizin sonucu..: " + sonuc);
			}			
		}
	}	
	
	private static void kareninAlaniniHesapla() {
		System.out.println("###### Karenin Alanı ######");
		System.out.print("Karenin kenar uzunluğunu girin..:  ");
		double kenar = sc.nextDouble();
		
		if(kenar <= 0)
			System.err.println("Karenin kenarı sıfırdan büyük olmak zorundadır.");
		else {
			double alan = aritmetik.kareninAlaniniHesapla(kenar);
			System.out.println("Karenin alanı..: " + alan);
		}
	}
	
	private static void dikdortgeninAlaniniHesapla() {
		System.out.println("###### Dikdörtgenin Alanı ######");
		System.out.print("Karenin kenar uzunluğunu girin..:  ");
		double kisaKenar = sc.nextDouble();
		System.out.print("Karenin kenar uzunluğunu girin..:  ");
		double uzunKenar = sc.nextDouble();
		double alan = 0;
		if(kisaKenar <= 0 || uzunKenar <= 0)
			System.err.println("Dikdörtgenin kenarları sıfırdan büyük olmak zorundadır.");
		else {
			if(kisaKenar == uzunKenar) 
				System.out.println("Bilgi: Bu dikdörtgen aynı zamanda bir karedir.");
				
			alan = aritmetik.dikdortgeninAlaniniHesapla(kisaKenar,uzunKenar);
			System.out.println("Dikdörtgenin alanı..: " + alan);
		}
	}
	
	private static void eskenarUcgeninAlaniniHesapla() {
		System.out.println("###### Eşkenar Üçgenin Alanı ######");
		System.out.print("Eşkenar üçgenin kenar uzunluğunu girin..:  ");
		double kenar = sc.nextDouble();
		
		if(kenar <= 0)
			System.err.println("Eşkenar üçgenin kenarı sıfırdan büyük olmak zorundadır.");
		else {
			double alan = aritmetik.eskenarUcgeninAlaniniHesapla(kenar);
			System.out.println("Eşkenar üçgenin alanı..: " + alan);
		}
	}
	
	private static void cemberinAlaniniHesapla() {
		System.out.println("###### Çemberin Alanı ######");
		
		System.out.print("Eşkenar üçgenin kenar uzunluğunu girin..:  ");
		double yariCap = sc.nextDouble();
		
		if(yariCap <= 0)
			System.err.println("Çemberin yarıçapı sıfırdan büyük olmak zorundadır.");
		else {
			double alan = aritmetik.cemberinAlaniniHesapla(yariCap);
			System.out.println("Çemberin alanı..: " + alan);
		}
	}	

}
