package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Letra;

public interface LenguaSenaLetra extends JpaRepository<Letra, String> {

}
