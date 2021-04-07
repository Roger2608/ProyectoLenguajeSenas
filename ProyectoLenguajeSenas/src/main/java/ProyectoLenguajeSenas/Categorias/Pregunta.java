package ProyectoLenguajeSenas.Categorias;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ProyectoLenguajeSenas.Util.CategoriaLenguaSena;

@Entity
@Table(name = "Pregunta", catalog = "proyectosordo")
public class Pregunta extends LenguaSordo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Pregunta() {
		super();
		super.setCategoria(CategoriaLenguaSena.PREGUNTA.name());
		// TODO Auto-generated constructor stub
	}

	public Pregunta(String id, String nombre, String imagen) {
		super(id, nombre, imagen, CategoriaLenguaSena.PREGUNTA.name());
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_pregunta", length = 3)
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	@Column(name = "imagen_pregunta", length = 50)
	@Override
	public String getImagen() {
		// TODO Auto-generated method stub
		return super.getImagen();
	}
	
	@Column(name = "nombre_pregunta", length = 50)
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
