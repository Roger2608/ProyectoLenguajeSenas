package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Fruta;

public interface LenguaSenaFruta extends JpaRepository<Fruta, String> {

}
