package ru.code4fun.demo.service;

import ru.code4fun.demo.service.dto.DealerDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Dealer.
 */
public interface DealerService {

    /**
     * Save a dealer.
     *
     * @param dealerDTO the entity to save
     * @return the persisted entity
     */
    DealerDTO save(DealerDTO dealerDTO);

    /**
     * Get all the dealers.
     *
     * @return the list of entities
     */
    List<DealerDTO> findAll();


    /**
     * Get the "id" dealer.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DealerDTO> findOne(Long id);

    /**
     * Delete the "id" dealer.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
