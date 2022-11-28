package com.yavuz.customstring;

public class Runner {

	public static void main(String[] args) {
		CustomStringTR ifade = new CustomStringTR();
		ifade.değer = " Merhaba. Bu bir deneme metnidir. ";
		System.out.println("İfade -> " + ifade.değer);
		System.out.println("İfadenin uzunluğu -> " + ifade.uzunluk());
		ifade.değer = ifade.dıştakiBoşluklarıAyır();
		System.out.println("Dışındaki boşluklar olmadan ifade -> " + ifade.değer);
		System.out.println("Tamamı büyük harflerle ifade -> " + ifade.harfleriBüyükYap());
		System.out.println("Tamamı küçük harflerle ifade -> " + ifade.harfleriKüçükYap());
		System.out.println("İfadenin ilk 7 karakteri -> " + ifade.altİfade(0, 7));
		System.out.println("İfadenin 10. karakterden sonrası -> " + ifade.altİfade(10));
		ifade.değer = "";
		if(ifade.boşMu())
			System.out.println("İfade boş.");
		
		ifade.değer = " ";
		if(ifade.karakterVarMı())
			System.out.println("ifadede en az 1 karakter var.");
		
		ifade.değer = "Merhaba. Bu bir deneme metnidir.";
		System.out.println("Değişmeden önce ifade..\n" + ifade.değer);
		ifade.değer = ifade.değiştir("Bu bir deneme metnidir.", "Yaşamak güzel şey.");
		System.out.println("Değiştikten sonra önce ifade..\n" + ifade.değer);
		
		
	}

}
