package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(catalog = "Isos_lenguaje_sena", name = "ls_category")
public class CategoriaLenguaSordo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "category_id",nullable = false, unique = true, length = 7)
	private String id;
	@Column(name = "caterogy_name", nullable = false)
	private String nombre;
	
	public CategoriaLenguaSordo() {
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

	@Override
	public String toString() {
		return "CategoriaLenguaSordo [getId()=" + getId() + ", getNombre()=" + getNombre() + "]";
	}
	
}
