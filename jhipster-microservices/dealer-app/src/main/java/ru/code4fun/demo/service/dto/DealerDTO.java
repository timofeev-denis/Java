package ru.code4fun.demo.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Dealer entity.
 */
public class DealerDTO implements Serializable {

    private Long id;

    private String name;

    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DealerDTO dealerDTO = (DealerDTO) o;
        if (dealerDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dealerDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DealerDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
}
