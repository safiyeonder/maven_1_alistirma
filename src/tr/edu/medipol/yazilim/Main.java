package tr.edu.medipol.yazilim;

import org.apache.commons.lang3.StringUtils; // kütüphane eklenip tanýmlandý

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hataliMetin= "M   e  d i p                  o           l        ";
		// hatalý metin
		System.out.println("Hatalý Metin: " + hataliMetin);
		
		String duzgunMetin = StringUtils.deleteWhitespace(hataliMetin);
		// hatalý metinin düzeltilmesi için kütüphanedeki method u kullandýk ve bunu deðiþkene atayýp ekrana yazdýrdýk. 
		System.out.println("Düzgün Metin:" + duzgunMetin);
	
	}

}
