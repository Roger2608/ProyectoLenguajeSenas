package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.CuerpoHumano;

public interface LenguaSenaCuerpoHumano extends JpaRepository<CuerpoHumano, String> {

}
