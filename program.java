package istanbuldakidukkanlar;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dükkanlardan hangisi hakkýnda bilgi almak isterseniz yanýndaki rakamý giriniz");
		System.out.println("1- Kuruyemiþçi ");
		System.out.println("2- Oto Yýkamacý ");
		System.out.println("3-Tesisatçý ");

		Scanner scanner = new Scanner(System.in);
		int istenenDukkanNumarasi = scanner.nextInt();

		if (istenenDukkanNumarasi == 1) {

			kuruyemisci senaKuruyemisci = new kuruyemisci();
			kuruyemisci.adi = "Sena Kuruyemiþçisi";
			kuruyemisci.calisanSayisi = 4;
			kuruyemisci.kuruyemisCesidi = 12;
			kuruyemisci.genelbilgiler();
			kuruyemisci.calistirsaat();
 
		}

		else if (istenenDukkanNumarasi == 2) {
			otoyikamaci.adi = "Ilgýn Oto Yýkama";
			otoyikamaci.calisanSayisi = 5;
			otoyikamaci.kompleYýkamaParasi = 40;
			otoyikamaci.genel();
			otoyikamaci.calistirsaat();
			

		} else
			{tesisatcý.adi = "Sýla Tesisat";
		tesisatcý.calisanSayisi = 2;
		tesisatcý.servisUcreti = 50;
		tesisatcý.genel();
		tesisatcý.calistirsaat();
	}}

}
