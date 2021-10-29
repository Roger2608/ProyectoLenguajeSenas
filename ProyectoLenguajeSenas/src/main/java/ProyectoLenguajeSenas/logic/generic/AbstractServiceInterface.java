package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;

public interface AbstractServiceInterface<T extends LenguaSordo> {
	
	public abstract List<T> mostrarTodos();
	
	public abstract void guardar(T t);
	
	public abstract void update(T t);
	
	public abstract void delete(T t);
	

}
