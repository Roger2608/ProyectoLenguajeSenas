package ProyectoLenguajeSenas.Services;

import java.util.List;

import ProyectoLenguajeSenas.Categorias.Letra;

public interface LenguaSenaLetraServices {
	
	public List<Letra> mostrarTodos();
	public void guardarLetra(Letra letra); 
	public void actualizarLetra(Letra letra);
	public void eliminarLetra(Letra letra);
}
