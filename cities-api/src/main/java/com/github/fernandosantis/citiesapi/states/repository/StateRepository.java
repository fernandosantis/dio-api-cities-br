package com.github.fernandosantis.citiesapi.states.repository;

import com.github.fernandosantis.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
