package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(catalog = "Isos_lenguaje_sena", name = "ls_sub_category")
public class SubCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "sub_category_id",nullable = false, unique = true, length = 7)
	private String id;
	@Column(name = "sub_category_name",nullable = false)
	private String name;
	
	public SubCategory() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
