package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Pais;

public interface LenguaSenaPais extends JpaRepository<Pais, String> {

}
