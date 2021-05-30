



import java.util.Calendar;

public class Canciones {
	/**
	 * @author Jorge
	 * @version 1.0
	 * 
	 * 
	 */
	
	
	private int duracionS;
	private String titulo;
	private String artista;
	private Calendar fecha;
	
	
	

	public Canciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Canciones(int duracionS, String titulo, String artista, Calendar fecha) {
		super();
		this.duracionS = duracionS;
		this.titulo = titulo;
		this.artista = artista;
		this.fecha = fecha;
	}
	

	public int getDuracionS() {
		return duracionS;
	}


	public void setDuracionS(int duracionS) {
		this.duracionS = duracionS;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public Calendar getFecha() {
		return fecha;
	}


	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	
	@Override
	public String toString() {
		return "Canciones [duracionS=" + duracionS + ", titulo=" + titulo + ", artista=" + artista + ", fecha=" + fecha
				+ "]";
	}
	/**
	 * <h1>Método para reproducir la cancion</h1> 
	 * @return titulo de la canción
	 */

	public String play() {
		System.out.println("Reproduciendo cancion..."+titulo);
		return titulo;
	}
	/**
	 * Método para para la canción
	 */
	public void stop(){
		System.out.println("Parando");
	}
	/**
	 * 
	 * Método para ir al segundo determinado de la cancion
	 * @param duracionS
	 */
	public void irA(int duracionS) {
		
		
		
	}
}
