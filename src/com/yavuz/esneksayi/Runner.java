package com.yavuz.esneksayi;

import java.util.Scanner;

public class Runner {
	private static Sayı sayilar = new Sayı();
	private static final Scanner sc = new Scanner(System.in);
	private static int secim = 0;
	
	public static void main(String[] args) {
		
		do {
			secim = menu();
			sc.nextLine();
			switch(secim) {
				case 1: 
					diziyeEkle();
					break;
				case 2: 
					dizidenSil();
					break;
				case 3: 
					dizininArayaEkle();
					break;
				case 4: 
					diziyiGöster();
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
		System.out.println("######## Esnek Sayı Dizisi ########");
		System.out.println("1- Diziye Ekle");
		System.out.println("2- Diziden Sil");
		System.out.println("3- Dizinin Arasına Ekle");
		System.out.println("4- Diziyi Listele");
		System.out.println("0- ÇIKIŞ");
		System.out.print("Lütfen seçiminizi yapın..: ");
		secim = sc.nextInt();
		return secim;
	}
	
	private static void diziyeEkle() {
		System.out.print("Eklemek istediğiniz sayıyı girin..: ");
		int sayi = sc.nextInt();
		sayilar.Ekle(sayi);
	}
	private static void dizidenSil() {
		if(sayilar.değerler == null || sayilar.uzunluk == 0)
			System.err.println("HATA: Boş diziden eleman silinemez.");
		else {
			diziyiDizinlerleGöster();
			System.out.print("Silmek istediğiniz sayının dizinini seçin..: ");
			int dizin = sc.nextInt();
			if(dizin < 0 || dizin >= sayilar.uzunluk)
				System.err.println("HATA: Dizinin dışında bir yerde sayı silmeye çalıştınız.");
			else
				sayilar.Sil(dizin);
		}		
	}
	private static void dizininArayaEkle() {
		int[] dizi = sayilar.Listele();
		if(dizi == null || sayilar.uzunluk == 0) {
			System.out.println("Bilgi: Boş diziye ekleme yapacaksınız.");
			diziyeEkle();
		}			
		else {
			diziyiDizinlerleGöster();
			System.out.print("Eklemek istediğiniz sayıyı girin..: ");
			int sayi = sc.nextInt();
			System.out.print(sayi + " sayısını dizide nereye ekleyeceksiniz? ");
			int dizin = sc.nextInt();
			if(dizin < 0 || dizin > sayilar.uzunluk + 1)
				System.err.println("HATA: Dizinin dışında bir yere sayı eklemeye çalıştınız.");
			else
				sayilar.ArayaEkle(sayi, dizin);
		}
		
	}
	
	private static void diziyiGöster() {
		int[] dizi = sayilar.Listele();
		if(dizi == null || sayilar.uzunluk == 0)
			System.out.println("Dizi boş.");
		else {
			for (int i = 0; i < dizi.length; i++) {
				if(i == dizi.length - 1)
					System.out.print(sayilar.değerler[i] + "\n");
				else
					System.out.print(sayilar.değerler[i] + " ");				
			}
		}
		
	}
	
	private static void diziyiDizinlerleGöster() {
		int[] dizi = sayilar.Listele();
		if(dizi == null || sayilar.uzunluk == 0)
			System.out.println("Dizi boş.");
		else {
			System.out.print("Sayılar-> ");
			for (int i = 0; i < dizi.length; i++) {
				if(i == dizi.length - 1)
					System.out.print(dizi[i] + "\n");
				else
					System.out.print(dizi[i] + " ");				
			}
			System.out.print("Dizinler-> ");
			for (int i = 0; i < dizi.length; i++) {
				if(i == dizi.length - 1)
					System.out.print(i + "\n");
				else
					System.out.print(i + " ");				
			}
		}
		
	}
	
	
}
