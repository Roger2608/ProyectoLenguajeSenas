package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.NocionTemporal;

public interface LenguaSenaNocionTemporal extends JpaRepository<NocionTemporal, String> {

}
