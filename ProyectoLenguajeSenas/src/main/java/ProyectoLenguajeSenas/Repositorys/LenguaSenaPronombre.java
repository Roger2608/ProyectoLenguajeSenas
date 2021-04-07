package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Pronombre;

public interface LenguaSenaPronombre extends JpaRepository<Pronombre, String> {

}
