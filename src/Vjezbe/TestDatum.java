package Vjezbe;

public class TestDatum {
	public static void main(String[] args) {

		// Datum prviDatum = new Datum (10, 12, 2014);

		// Datum drugiDatum = new Datum(10, 12 ,2014);

		// System.out.println(prviDatum.toString());
		//
		// System.out.println(prviDatum.getDan());
		// int a = prviDatum.getDan();
		// a = a+10;
		// System.out.println("a:" + a);
		//
		// prviDatum.setDan(18);
		// System.out.println(prviDatum.getDan());

		// prviDatum.setMjesec(3);
		// System.out.println(prviDatum.getMjesec());

		// if(prviDatum.equals(drugiDatum)== true){
		// System.out.println("Jednaki!");
		// }else{
		// System.out.println("Nejednaki!");
		// }
		//
		// System.out.println(prviDatum.compare(drugiDatum));
		//
		Datum datum1 = new Datum();
		System.out.println(datum1.toString());

		Datum[] dani = napraviNiz(50);
		Datum.bubbleSortStudenti(dani);
		
		for (int i = 0; i < dani.length; i++) {
            if ( i!=0){
           	 System.out.println("Razlika: " + (dani[i].IntDatum() - dani[i-1].IntDatum()) );
            }
             System.out.println("Dan je: " + dani[i]);

            
		}
	}

	private static Datum[] napraviNiz(int brojDatuma) {
		Datum[] nizDana = new Datum[50];
		for (int i = 0; i < nizDana.length; i++) {
			nizDana[i] = new Datum().RandomDatum();

		}
		return nizDana;
	}
}
