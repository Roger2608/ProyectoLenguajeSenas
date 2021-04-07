package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Informatica;

public interface LenguaSenaInformatica extends JpaRepository<Informatica, String> {

}
