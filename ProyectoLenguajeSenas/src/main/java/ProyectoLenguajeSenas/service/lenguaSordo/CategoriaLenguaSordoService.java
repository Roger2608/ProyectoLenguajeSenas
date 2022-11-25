package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.Pais;

public interface CategoriaLenguaSordoService {
	
	public Optional<CategoriaLenguaSordo> findByName(String name);
	public Optional<CategoriaLenguaSordo> findByName(String name, Pais pais);

}
