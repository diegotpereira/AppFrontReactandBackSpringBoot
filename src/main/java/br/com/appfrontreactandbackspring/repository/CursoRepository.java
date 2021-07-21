package br.com.appfrontreactandbackspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.appfrontreactandbackspring.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
