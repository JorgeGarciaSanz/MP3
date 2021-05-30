package MP3;

import java.util.ArrayList;
import java.util.Calendar;

public class Reproductor {
	
	/**
	 * @author Jorge
	 * @version 1.o
	 */
	
	private String nombre;
	private String marca;
	private String modelo;
	private Calendar fecha;
	private ArrayList<Lista>miLista= new ArrayList<Lista>();
	
	/**
	 * Constructor vacio
	 */
	
	public Reproductor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor 
	 * @param nombre
	 * @param marca
	 * @param modelo
	 * @param fecha
	 */

	public Reproductor(String nombre, String marca, String modelo, Calendar fecha) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.fecha = fecha;
	}

	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Lista> getMiLista() {
		return miLista;
	}

	public void setMiLista(ArrayList<Lista> miLista) {
		this.miLista = miLista;
	}

	/**
	 * Método toString
	 */
	
	@Override
	public String toString() {
		return "Reproductor [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", fecha=" + fecha
				+ ", miLista=" + miLista + "]";
	}
	
	/**
	 * añade una lista
	 * @param nuevaLista
	 */
	
	public void  addLista(Lista nuevaLista) {
		miLista.add(nuevaLista);
		
	}
	
	/**
	 * Método que saca el numero de listas que hay en el reproductor 
	 * @return numero de listas
	 */
	
	public int numeroLista() {
		
		return miLista.size();
	}
	/**
	 * Reproduce todas la canciones del reproductor
	 */
	
	public void playTodas() {
		
		System.out.println("Reproduciendo todas las listas");
		
	}
	
	/**
	 * Devuelve la el nombre de las listas que hay en el reproductor
	 * 
	 * @return nombre de la lista 
	 */
	
	public String nombreListas() {
		
		String nombreLista="";
		for(int i=0; i<miLista.size();i++) {
			nombreLista=miLista.get(i).getNombre();
		}
		
		return nombreLista;
	}
	
	
	

}
