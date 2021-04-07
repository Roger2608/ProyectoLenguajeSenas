package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Naturaleza;

public interface LenguaSenaNaturaleza extends JpaRepository<Naturaleza, String> {

}
