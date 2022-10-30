package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@Column(name="lengua_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="lengua_nombre", nullable = false)
	private String nombre;
	@Column(name="lengua_short_description", nullable = false)
	private String shortDescription;
	@Column(name="lengua_long_description", nullable = false)
	private String longDescription;
	@Column(name="lengua_path_image", nullable = false)
	private String imagen;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "category_id", nullable = false)
	private CategoriaLenguaSordo categoria;

	public LenguaSordo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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
}
