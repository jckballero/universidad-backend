package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
//otros repositorios para la creacion de un crud, Pagin extiende de crud, jparepository extiende de pagin
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepository extends CrudRepository<Carrera, Integer> {
}
