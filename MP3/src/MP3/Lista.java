package MP3;

import java.util.ArrayList;

import Canciones;

public class Lista {

	/**
	 * @author Jorge
	 * @version 1.0
	 */

	private ArrayList<Canciones> misCanciones = new ArrayList<Canciones>();
	private String nombre;
	private String categoria;

	public Lista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lista(String nombre, String categoria) {

		this.nombre = nombre;
		this.categoria = categoria;
	}

	public ArrayList<Canciones> getMisCanciones() {
		return misCanciones;
	}

	public void setMisCanciones(ArrayList<Canciones> misCanciones) {
		this.misCanciones = misCanciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Lista [misCanciones=" + misCanciones + ", nombre=" + nombre + ", categoria=" + categoria + "]";
	}
	/**
	 * Añade una cancion
	 * @param nueCancion
	 */
	
	public void addCancion(Canciones nueCancion){
		misCanciones.add(nueCancion);
	}

	/**
	 *<h1> Devuelve el numero total de canciones de la lista</h1>
	 * 
	 * @return total de canciones 
	 */
	public int numeroCanciones() {

		return misCanciones.size();
	}
	
	/**
	 * <h1>Devuelve la duracion total de la lista</h1>
	 * @return duracion total del las canciones
	 */

	public int tiempoTotal() {

		int duracionTotal = 0;
		for (int i = 0; i < misCanciones.size(); i++) {
			duracionTotal = duracionTotal + misCanciones.get(i).getDuracionS();
		}
		
		return duracionTotal;

	}
	/**
	 * <h1>Reproduce la lista</h1>
	 */
	
	public void playListas() {
		
		System.out.println("Reproducciendo..." + nombre);
		
	}
	/**
	 *  <h1>Metodo que saca las canciones de la lista </h1>
	 * @return canciones 
	 * @deprecated
	 */
	
	public String nombreCanciones() {
		
		String titulo="";
		for(int i=0; i<misCanciones.size();i++) {
			titulo=misCanciones.get(i).getTitulo();
		}
		
		return titulo;
		
	}
	
	
}
