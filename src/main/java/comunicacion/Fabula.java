package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza,
			String interpretacion) {
		
		super(origen, titulo, autor, paginas);
		this.ensenanza= ensenanza;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return 1*this.getPaginas()*palabrasPagina;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return this.interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getOrigen() +  
				"\n" + this.getTitulo() +
				"\n" + this.getAutor() + 
				"\n" + this.getPaginas() + 
				"\n" + this.ensenanza;
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
}
