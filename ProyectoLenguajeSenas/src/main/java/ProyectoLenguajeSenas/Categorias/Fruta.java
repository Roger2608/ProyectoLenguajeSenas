package ProyectoLenguajeSenas.Categorias;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ProyectoLenguajeSenas.Util.CategoriaLenguaSena;

@Entity
@Table(name = "Fruta", catalog = "proyectosordo")
public class Fruta extends LenguaSordo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Fruta(String id, String nombre, String imagen) {
		super(id, nombre, imagen, CategoriaLenguaSena.FRUTA.name());
		// TODO Auto-generated constructor stub
	}
	
	public Fruta() {
		super();
		super.setCategoria(CategoriaLenguaSena.FRUTA.name());
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_fruta", length = 3)
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	@Column(name = "imagen_fruta", length = 50)
	@Override
	public String getImagen() {
		// TODO Auto-generated method stub
		return super.getImagen();
	}
	
	@Column(name = "nombre_fruta", length = 50)
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	@Column(name = "categoria", length = 30)
	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return super.getCategoria();
	}
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	@Override
	public void setImagen(String imagen) {
		// TODO Auto-generated method stub
		super.setImagen(imagen);
	}
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	

}
