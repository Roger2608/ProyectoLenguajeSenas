package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import ProyectoLenguajeSenas.model.lenguaSordo.SubCategory;

public interface SubCategoryService {
	
	public Optional<SubCategory> findByName(String name);

}
