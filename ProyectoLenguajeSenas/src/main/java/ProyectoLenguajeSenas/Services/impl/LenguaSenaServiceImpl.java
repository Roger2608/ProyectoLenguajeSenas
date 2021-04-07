package ProyectoLenguajeSenas.Services.impl;

import ProyectoLenguajeSenas.Categorias.Animal;
import ProyectoLenguajeSenas.Categorias.LenguaSordo;
import ProyectoLenguajeSenas.Services.LenguaSenaCategoriaService;

public class LenguaSenaServiceImpl implements LenguaSenaCategoriaService {
	
	public LenguaSordo lengua;
	
	@Override
	public LenguaSordo encontrarCategoria(String categoria) {
		switch (categoria) {
		case "animal":
			lengua = new Animal();
			break;

		default:
			break;
		}
		return lengua;
	}

}
