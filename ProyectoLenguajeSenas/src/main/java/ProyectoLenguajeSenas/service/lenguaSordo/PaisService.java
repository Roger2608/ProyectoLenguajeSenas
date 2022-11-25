
package ProyectoLenguajeSenas.service.lenguaSordo;

import java.util.Optional;

import ProyectoLenguajeSenas.model.lenguaSordo.Pais;


public interface PaisService {

	Optional<Pais> findByName(String name);

}
