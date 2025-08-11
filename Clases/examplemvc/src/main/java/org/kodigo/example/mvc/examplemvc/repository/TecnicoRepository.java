package org.kodigo.example.mvc.examplemvc.repository;

import org.kodigo.example.mvc.examplemvc.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
