package istanbuldakidukkanlar;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("d�kkanlardan hangisi hakk�nda bilgi almak isterseniz yan�ndaki rakam� giriniz");
		System.out.println("1- Kuruyemi��i ");
		System.out.println("2- Oto Y�kamac� ");
		System.out.println("3-Tesisat�� ");

		Scanner scanner = new Scanner(System.in);
		int istenenDukkanNumarasi = scanner.nextInt();

		if (istenenDukkanNumarasi == 1) {

			kuruyemisci senaKuruyemisci = new kuruyemisci();
			kuruyemisci.adi = "Sena Kuruyemi��isi";
			kuruyemisci.calisanSayisi = 4;
			kuruyemisci.kuruyemisCesidi = 12;
			kuruyemisci.genelbilgiler();
			kuruyemisci.calistirsaat();
 
		}

		else if (istenenDukkanNumarasi == 2) {
			otoyikamaci.adi = "Ilg�n Oto Y�kama";
			otoyikamaci.calisanSayisi = 5;
			otoyikamaci.kompleY�kamaParasi = 40;
			otoyikamaci.genel();
			otoyikamaci.calistirsaat();
			

		} else
			{tesisatc�.adi = "S�la Tesisat";
		tesisatc�.calisanSayisi = 2;
		tesisatc�.servisUcreti = 50;
		tesisatc�.genel();
		tesisatc�.calistirsaat();
	}}

}
