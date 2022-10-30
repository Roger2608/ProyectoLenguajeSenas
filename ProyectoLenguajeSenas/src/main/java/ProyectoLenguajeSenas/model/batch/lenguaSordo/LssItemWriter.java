package ProyectoLenguajeSenas.model.batch.lenguaSordo;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;
import ProyectoLenguajeSenas.service.lenguaSordo.LenguaSordoService;

public class LssItemWriter implements ItemWriter<LenguaSordo> {
	
	@Autowired
	LenguaSordoService lenguaSordoService; 

	@Override
	public void write(List<? extends LenguaSordo> items) throws Exception {
		items.stream().forEach(lenguaSordoService::save);
	}
	
}
