package restApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import restApp.domain.Flight;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query(" select f from Flight f " +
            " where f.sursa=:sursa and f.destinatie=:destinatie and f.ziuaPlecarii=:ziDePlecare ")
    List<Flight> getOptimalFlight(String sursa, String destinatie, Integer ziDePlecare);
}
