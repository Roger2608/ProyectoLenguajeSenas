package ProyectoLenguajeSenas.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoLenguajeSenas.Categorias.Verdura;

public interface LenguaSenaVerdura extends JpaRepository<Verdura, String> {

}
