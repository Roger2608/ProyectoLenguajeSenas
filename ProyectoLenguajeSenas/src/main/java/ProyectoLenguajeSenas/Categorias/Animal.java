package ProyectoLenguajeSenas.Categorias;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "")
public class Animal extends LenguaSordo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Animal() {
		super();
	}
	@Override
	public String getId() {
		return super.getId();
	}
	
	@Override
	public String getImagen() {
		return super.getImagen();
	}
	
	@Override
	public String getNombre() {
		return super.getNombre();
	}
	
	@Override
	public String getCategoria() {
		return super.getCategoria();
	}
	
	@Id
	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	@Field(name = "name_image")
	@Override
	public void setImagen(String imagen) {
		// TODO Auto-generated method stub
		super.setImagen(imagen);
	}
	@Field(name = "name")
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	
	@Field(name = "category")
	@Override
	public void setCategoria(String category) {
		// TODO Auto-generated method stub
		super.setCategoria(category);
	}
		
}
