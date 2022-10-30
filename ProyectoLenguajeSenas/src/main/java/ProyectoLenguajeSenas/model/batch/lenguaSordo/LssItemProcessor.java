package ProyectoLenguajeSenas.model.batch.lenguaSordo;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import ProyectoLenguajeSenas.model.lenguaSordo.CategoriaLenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.LenguaSordo;
import ProyectoLenguajeSenas.model.lenguaSordo.SubCategory;
import ProyectoLenguajeSenas.service.lenguaSordo.CategoriaLenguaSordoService;
import ProyectoLenguajeSenas.service.lenguaSordo.SubCategoryService;

public class LssItemProcessor implements ItemProcessor<LenguaSordoRecipient, LenguaSordo> {
	
	@Value("${isos.base.path.image}")
	private String basePathImage;
	
	@Autowired
	CategoriaLenguaSordoService categoriaService;
	
//	@Autowired
//	SubCategoryService subcategoryService;

	@Override
	public LenguaSordo process(LenguaSordoRecipient item) throws Exception {
		
		LenguaSordo lenguaSordo = new LenguaSordo();
		lenguaSordo.setNombre(item.getName());
		lenguaSordo.setShortDescription(item.getShort_description());
		lenguaSordo.setLongDescription(item.getLong_description());
		lenguaSordo.setImagen(basePathImage.concat(item.getName()));
		
		CategoriaLenguaSordo categoria;
		Optional<CategoriaLenguaSordo> optCategoria = categoriaService.findByName(item.getCategory());
		
		Stream<String> stream = Arrays.stream(item.getSub_category().split(","));
//		Set<SubCategory> subCategories1 = stream
//				.map(name -> subcategoryService.findByName(name).get())
//				.collect(Collectors.toSet());
		Set<SubCategory> subCategories2= stream
				.map(name ->  {
					SubCategory subcategory = new SubCategory();
					subcategory.setNombre(name);
					return subcategory;
				})
				.collect(Collectors.toSet());
		
		if(!optCategoria.isPresent()) {
			categoria = new CategoriaLenguaSordo();
			categoria.setNombre(item.getCategory());
			categoria.setListSubCategory(subCategories2);
		}else {
			categoria = optCategoria.get();
		}
		
		
		lenguaSordo.setCategoria(categoria);
		
		
		return lenguaSordo;
	}

}
