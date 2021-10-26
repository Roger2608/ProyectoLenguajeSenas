package ProyectoLenguajeSenas.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.Categorias.Letra;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaLetraRepository;
import ProyectoLenguajeSenas.Services.LenguaSenaLetraServices;

@Service
public class LenguaSenaLetraServicesImpl implements LenguaSenaLetraServices {
	
	@Autowired
	LenguaSenaLetraRepository repository;
	
	@Override
	public List<Letra> mostrarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardarLetra(Letra letra) {
		repository.save(letra);
	}
	
	@Override
	public void actualizarLetra(Letra letra) {
		repository.save(letra);
	}
	
	@Override
	public void eliminarLetra(Letra letra) {
		repository.delete(letra);
	}
	
}
