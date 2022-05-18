package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico (String origen, String titulo, String autor, int paginas, String fecha,
			String primicia, String interpretacion) {
		
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return 10*this.getPaginas()*palabrasPagina;
	}

	@Override
	String interpretacion() {
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
				"\n" + this.fecha + 
				"\n" + this.primicia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}