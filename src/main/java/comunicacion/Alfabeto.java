package comunicacion;

public class Alfabeto extends Pictograma {
	public static String [] letras;
	public String interpretacion;
	
	public Alfabeto(String origen, String [] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return this.interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A" + ", " + "B" + ", " +"C" + ", " +"D" + ", " +"E" + ", " +"F" + ", " +"G" + ", " +
				"H" + ", " + "I" + ", " +"J" + ", " +"K" + ", " +"L" + ", " +"M" + ", " +"N" + ", " +
				"O" + ", " +"P" + ", " +"Q" + ", " + "R" + ", " +"S" + ", " +"T" + ", " +"U" + ", " +
				"V" + ", " +"W" + ", " +"X" + ", " +"Y" + ", " +"Z" ;
		
	}


	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}



	public static String[] getLetras() {
		return letras;
	}



	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
