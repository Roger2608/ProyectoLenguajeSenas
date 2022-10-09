package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(catalog = "Isos_lenguaje_sena", name = "ls_lengua_sordo")
public class LenguaSordo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="lengua_id", unique = true, nullable = false, length = 7)
	private String id;
	@Column(name="lengua_nombre", nullable = false)
	private String nombre;
	@Column(name="lengua_path_image", nullable = false)
	private String imagen;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	private CategoriaLenguaSordo categoria;

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

	public CategoriaLenguaSordo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaLenguaSordo categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "LenguaSordo [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getImagen()=" + getImagen()
		+ ", getCategoria()=" + getCategoria() + "]";
	}
	
}
