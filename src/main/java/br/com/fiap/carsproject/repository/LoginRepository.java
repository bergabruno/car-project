package br.com.fiap.carsproject.repository;

import br.com.fiap.carsproject.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

    boolean existsByUsername(String username);

    Login findByUsername(String username);
}
