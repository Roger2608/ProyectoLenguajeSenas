package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.Pais;
import ProyectoLenguajeSenas.repository.lenguaSordo.CategoriaLenguaSordoRepository;

@Service
public class CategoriaLenguaSordoServiceImpl implements CategoriaLenguaSordoService {
	
	@Autowired
	CategoriaLenguaSordoRepository categoriaLenguaSordo;

	@Override
	public Optional<CategoriaLenguaSordo> findByName(String name) {
		return categoriaLenguaSordo.findByName(name);
	}

	@Override
	public Optional<CategoriaLenguaSordo> findByName(String name, Pais pais) {
		return categoriaLenguaSordo.findByName(name, pais.getNombre());
	}

}
