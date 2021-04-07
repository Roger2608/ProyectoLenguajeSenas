package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.Categorias.Animal;

@Repository
public interface LenguaSenaAnimal extends JpaRepository<Animal, String> {
	
}
