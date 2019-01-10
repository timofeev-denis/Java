package ru.code4fun.demo.repository;

import ru.code4fun.demo.domain.Dealer;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Dealer entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {

}
