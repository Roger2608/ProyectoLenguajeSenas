package ProyectoLenguajeSenas.model.lenguaSordo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(catalog = "Isos_lenguaje_sena", name = "ls_category")
public class CategoriaLenguaSordo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "caterogy_name", nullable = false)
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = SubCategory.class)
	@JoinColumn(name = "fk_category_id", referencedColumnName = "category_id")
	@OrderBy( "sub_category_id ASC")
	private Set<SubCategory> listSubCategory;
	
	public CategoriaLenguaSordo() {
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
	
	public Set<SubCategory> getListSubCategory() {
		return listSubCategory;
	}

	public void setListSubCategory(Set<SubCategory> listSubCategory) {
		this.listSubCategory = listSubCategory;
	}
}
