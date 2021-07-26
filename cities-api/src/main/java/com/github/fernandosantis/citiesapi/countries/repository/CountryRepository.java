package com.github.fernandosantis.citiesapi.countries.repository;

import com.github.fernandosantis.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
