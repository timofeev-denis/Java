package ru.code4fun.demo.service.impl;

import ru.code4fun.demo.service.DealerService;
import ru.code4fun.demo.domain.Dealer;
import ru.code4fun.demo.repository.DealerRepository;
import ru.code4fun.demo.service.dto.DealerDTO;
import ru.code4fun.demo.service.mapper.DealerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Dealer.
 */
@Service
@Transactional
public class DealerServiceImpl implements DealerService {

    private final Logger log = LoggerFactory.getLogger(DealerServiceImpl.class);

    private final DealerRepository dealerRepository;

    private final DealerMapper dealerMapper;

    public DealerServiceImpl(DealerRepository dealerRepository, DealerMapper dealerMapper) {
        this.dealerRepository = dealerRepository;
        this.dealerMapper = dealerMapper;
    }

    /**
     * Save a dealer.
     *
     * @param dealerDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public DealerDTO save(DealerDTO dealerDTO) {
        log.debug("Request to save Dealer : {}", dealerDTO);

        Dealer dealer = dealerMapper.toEntity(dealerDTO);
        dealer = dealerRepository.save(dealer);
        return dealerMapper.toDto(dealer);
    }

    /**
     * Get all the dealers.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<DealerDTO> findAll() {
        log.debug("Request to get all Dealers");
        return dealerRepository.findAll().stream()
            .map(dealerMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    /**
     * Get one dealer by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<DealerDTO> findOne(Long id) {
        log.debug("Request to get Dealer : {}", id);
        return dealerRepository.findById(id)
            .map(dealerMapper::toDto);
    }

    /**
     * Delete the dealer by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Dealer : {}", id);
        dealerRepository.deleteById(id);
    }
}
