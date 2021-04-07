package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Bebida;

public interface LenguaSenaBebida extends JpaRepository<Bebida, String> {

}
