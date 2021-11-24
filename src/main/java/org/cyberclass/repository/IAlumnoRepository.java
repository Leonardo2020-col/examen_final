package org.cyberclass.repository;

import org.cyberclass.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno , String>{
	//CRUD...
}
