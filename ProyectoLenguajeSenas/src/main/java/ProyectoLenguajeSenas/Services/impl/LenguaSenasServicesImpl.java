package ProyectoLenguajeSenas.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProyectoLenguajeSenas.Services.LenguaSenaServices;

//@SuppressWarnings("unchecked")
@Service
public class LenguaSenasServicesImpl<T> implements LenguaSenaServices<T> {
	
	@Autowired
//	LenguaSenaAnimal animal;
	
	@Override
	public List<T> findAll() {
//		return (List<T>) animal.findAll();
		return null;
	}

	
	@Override
	public Optional<T> finByID(String id) {
		// TODO Auto-generated method stub
//		return (Optional<T>) animal.findById(id);
		return null;
	}

}
