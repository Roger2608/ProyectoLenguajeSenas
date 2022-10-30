package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ProyectoLenguajeSenas.model.lenguaSordo.SubCategory;
import ProyectoLenguajeSenas.repository.lenguaSordo.SubCategoryRepository;

public class SubCategoryServiceImpl implements SubCategoryService {
	
	@Autowired
	SubCategoryRepository subCategoryRepository;

	@Override
	public Optional<SubCategory> findByName(String name) {
		return subCategoryRepository.findByName(name);
	}

}
