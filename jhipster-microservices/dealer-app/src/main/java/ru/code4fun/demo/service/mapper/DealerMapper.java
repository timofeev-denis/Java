package ru.code4fun.demo.service.mapper;

import ru.code4fun.demo.domain.*;
import ru.code4fun.demo.service.dto.DealerDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Dealer and its DTO DealerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DealerMapper extends EntityMapper<DealerDTO, Dealer> {



    default Dealer fromId(Long id) {
        if (id == null) {
            return null;
        }
        Dealer dealer = new Dealer();
        dealer.setId(id);
        return dealer;
    }
}
