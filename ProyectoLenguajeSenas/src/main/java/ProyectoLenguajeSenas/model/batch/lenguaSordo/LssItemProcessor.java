package ProyectoLenguajeSenas.model.batch.lenguaSordo;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.Pais;
import ProyectoLenguajeSenas.service.lenguaSordo.CategoriaLenguaSordoService;
import ProyectoLenguajeSenas.service.lenguaSordo.PaisService;

public class LssItemProcessor implements ItemProcessor<LenguaSordoRecipient, LenguaSordo> {

	@Value("${isos.base.path.image}")
	private String basePathImage;

	@Autowired
	CategoriaLenguaSordoService categoriaService;

	@Autowired
	PaisService paisService;

	@Override
	public LenguaSordo process(LenguaSordoRecipient item) throws Exception {

		LenguaSordo lenguaSordo = new LenguaSordo();
		lenguaSordo.setNombre(item.getName());
		lenguaSordo.setShortDescription(item.getShort_description());
		lenguaSordo.setLongDescription(item.getLong_description());
		lenguaSordo.setImagen(basePathImage.concat(item.getName()));

		Pais pais = paisService.findByName(item.getPais().trim()).orElseGet(() -> new Pais(item.getPais().trim()));

		CategoriaLenguaSordo categoria = categoriaService.findByName(item.getCategory(),pais).orElseGet(() -> {
					CategoriaLenguaSordo categoriaLS = new CategoriaLenguaSordo();
					categoriaLS.setNombre(item.getCategory());
					categoriaLS.setPais(pais);
					return categoriaLS;
				});

		lenguaSordo.setCategoria(categoria);

		return lenguaSordo;
	}

}
