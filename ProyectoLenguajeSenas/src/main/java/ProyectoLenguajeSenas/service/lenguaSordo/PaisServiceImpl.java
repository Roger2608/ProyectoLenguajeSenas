package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.model.lenguaSordo.Pais;
import ProyectoLenguajeSenas.repository.lenguaSordo.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{
	
	@Autowired
	PaisRepository paisRepository;

	@Override
	public Optional<Pais> findByName(String name) {
		return paisRepository.findByName(name);
	}
	
}
