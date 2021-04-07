package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Pregunta;

public interface LenguaSenaPregunta extends JpaRepository<Pregunta, String> {

}
