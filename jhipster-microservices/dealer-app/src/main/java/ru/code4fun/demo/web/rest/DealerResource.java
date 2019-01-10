package ru.code4fun.demo.web.rest;

import com.codahale.metrics.annotation.Timed;
import ru.code4fun.demo.service.DealerService;
import ru.code4fun.demo.web.rest.errors.BadRequestAlertException;
import ru.code4fun.demo.web.rest.util.HeaderUtil;
import ru.code4fun.demo.service.dto.DealerDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Dealer.
 */
@RestController
@RequestMapping("/api")
public class DealerResource {

    private final Logger log = LoggerFactory.getLogger(DealerResource.class);

    private static final String ENTITY_NAME = "dealerappDealer";

    private final DealerService dealerService;

    public DealerResource(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    /**
     * POST  /dealers : Create a new dealer.
     *
     * @param dealerDTO the dealerDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new dealerDTO, or with status 400 (Bad Request) if the dealer has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/dealers")
    @Timed
    public ResponseEntity<DealerDTO> createDealer(@RequestBody DealerDTO dealerDTO) throws URISyntaxException {
        log.debug("REST request to save Dealer : {}", dealerDTO);
        if (dealerDTO.getId() != null) {
            throw new BadRequestAlertException("A new dealer cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DealerDTO result = dealerService.save(dealerDTO);
        return ResponseEntity.created(new URI("/api/dealers/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /dealers : Updates an existing dealer.
     *
     * @param dealerDTO the dealerDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated dealerDTO,
     * or with status 400 (Bad Request) if the dealerDTO is not valid,
     * or with status 500 (Internal Server Error) if the dealerDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/dealers")
    @Timed
    public ResponseEntity<DealerDTO> updateDealer(@RequestBody DealerDTO dealerDTO) throws URISyntaxException {
        log.debug("REST request to update Dealer : {}", dealerDTO);
        if (dealerDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        DealerDTO result = dealerService.save(dealerDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, dealerDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /dealers : get all the dealers.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of dealers in body
     */
    @GetMapping("/dealers")
    @Timed
    public List<DealerDTO> getAllDealers() {
        log.debug("REST request to get all Dealers");
        return dealerService.findAll();
    }

    /**
     * GET  /dealers/:id : get the "id" dealer.
     *
     * @param id the id of the dealerDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the dealerDTO, or with status 404 (Not Found)
     */
    @GetMapping("/dealers/{id}")
    @Timed
    public ResponseEntity<DealerDTO> getDealer(@PathVariable Long id) {
        log.debug("REST request to get Dealer : {}", id);
        Optional<DealerDTO> dealerDTO = dealerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(dealerDTO);
    }

    /**
     * DELETE  /dealers/:id : delete the "id" dealer.
     *
     * @param id the id of the dealerDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/dealers/{id}")
    @Timed
    public ResponseEntity<Void> deleteDealer(@PathVariable Long id) {
        log.debug("REST request to delete Dealer : {}", id);
        dealerService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }
}
