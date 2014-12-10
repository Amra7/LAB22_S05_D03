
public class KrugToolbox {
	
	public static double MOJ_PI = Math.PI;
	
    public static double izracunajObim( double poluprecnik){
	return 2*poluprecnik *Math.PI;
    }
    
    public static double izracunajPovrsinu ( double poluprecnik){
    	return poluprecnik*poluprecnik*Math.PI;
    }
    
    public static void ispisiKrug (Krug krug){
    	System.out.println("Poluprecnik: " + krug.poluprecnik);
    	System.out.println("Obim: " + krug.obim);
    	System.out.println("Povrsina: " + krug.povrsina);
    }
}
