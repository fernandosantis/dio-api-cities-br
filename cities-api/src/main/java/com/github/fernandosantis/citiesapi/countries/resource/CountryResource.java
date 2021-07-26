package com.github.fernandosantis.citiesapi.countries.resource;

import com.github.fernandosantis.citiesapi.countries.Country;
import com.github.fernandosantis.citiesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id ) {
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }
            return ResponseEntity.notFound().build();

    }
}
