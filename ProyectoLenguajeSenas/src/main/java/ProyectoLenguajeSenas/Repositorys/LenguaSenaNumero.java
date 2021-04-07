package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Numero;

public interface LenguaSenaNumero extends JpaRepository<Numero, String> {

}
