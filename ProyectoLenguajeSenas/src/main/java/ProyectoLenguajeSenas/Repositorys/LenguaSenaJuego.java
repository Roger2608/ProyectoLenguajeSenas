package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Juego;

public interface LenguaSenaJuego extends JpaRepository<Juego, String> {

}
