package tr.edu.medipol.yazilim;

import org.apache.commons.lang3.StringUtils; // k�t�phane eklenip tan�mland�

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hataliMetin= "M   e  d i p                  o           l        ";
		// hatal� metin
		System.out.println("Hatal� Metin: " + hataliMetin);
		
		String duzgunMetin = StringUtils.deleteWhitespace(hataliMetin);
		// hatal� metinin d�zeltilmesi i�in k�t�phanedeki method u kulland�k ve bunu de�i�kene atay�p ekrana yazd�rd�k. 
		System.out.println("D�zg�n Metin:" + duzgunMetin);
	
	}

}
