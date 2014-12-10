
public class KrugTest {
public static void main(String[] args) {
	Krug maliKrug = new Krug();
	maliKrug.poluprecnik=1.0;
	maliKrug.povrsina =KrugToolbox.izracunajPovrsinu(maliKrug.poluprecnik);
	maliKrug.obim = KrugToolbox.izracunajObim(maliKrug.poluprecnik);
	
//	System.out.println("Poluprecnik: " + maliKrug.poluprecnik);
//	System.out.println("Obim: " + maliKrug.obim);
//	System.out.println("Povrsina: " + maliKrug.povrsina);
	
	KrugToolbox.ispisiKrug(maliKrug);
	}
}
