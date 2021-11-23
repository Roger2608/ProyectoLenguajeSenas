package ProyectoLenguajeSenas.Repositorys;

import org.springframework.stereotype.Repository;

import ProyectoLenguajeSenas.Categorias.Letra;
import ProyectoLenguajeSenas.logic.generic.AbstractRepositoryInterface;

@Repository
public interface LenguaSenaLetraRepository extends AbstractRepositoryInterface<Letra, String> {

}
