package ProyectoLenguajeSenas.logic.generic;

import java.util.List;

import ProyectoLenguajeSenas.Categorias.LenguaSordo;

public interface AbstractServiceInterface<T extends LenguaSordo> {
	
	public abstract List<T> mostrarTodos(String categoria);
	
	public abstract void guardar(T t, String categoria);
	
	public abstract void update(T t, String categoria);
	
	public abstract void delete(T t, String categoria);
	
	public abstract List<T> buscarPorCategoria(String categoria);

}
