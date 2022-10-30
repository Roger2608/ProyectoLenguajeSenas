package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;

public interface CategoriaLenguaSordoService {
	
	public Optional<CategoriaLenguaSordo> findByName(String name);

}
