package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;


public class LenguaSordo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String nombre;
	private String imagen;
	private String categoria;
	
	public LenguaSordo(String id, String nombre, String imagen, String categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.imagen = imagen;
		this.categoria = categoria;
	}

	public LenguaSordo() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "LenguaSordo [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getImagen()=" + getImagen()
		+ ", getCategoria()=" + getCategoria() + "]";
	}
	
}
