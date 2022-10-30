package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.List;

import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;

public interface LenguaSordoService {
	
	public abstract List<LenguaSordo> findAllBySubCategory(String subCategory);
	public void save(LenguaSordo lenguaSordo);

}
