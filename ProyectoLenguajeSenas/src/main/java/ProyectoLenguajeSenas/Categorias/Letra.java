package ProyectoLenguajeSenas.Categorias;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ProyectoLenguajeSenas.Util.CategoriaLenguaSena;

@Entity
@Table(name = "Letra", catalog = "proyectosordo")
public class Letra extends LenguaSordo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Letra() {
		super();
		super.setCategoria(CategoriaLenguaSena.LETRA.name());
		// TODO Auto-generated constructor stub
	}

	public Letra(String id, String nombre, String imagen) {
		super(id, nombre, imagen, CategoriaLenguaSena.LETRA.name());
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_letra", length = 3)
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	@Column(name = "imagen_letra", length = 50)
	@Override
	public String getImagen() {
		// TODO Auto-generated method stub
		return super.getImagen();
	}
	
	@Column(name = "nombre_letra", length = 50)
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
