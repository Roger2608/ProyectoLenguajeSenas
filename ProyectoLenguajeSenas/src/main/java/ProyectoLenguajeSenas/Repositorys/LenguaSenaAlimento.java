package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Alimento;

public interface LenguaSenaAlimento extends JpaRepository<Alimento, String> {

}
