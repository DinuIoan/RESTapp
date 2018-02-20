package restApp.service;

import org.springframework.stereotype.Service;
import restApp.domain.Flight;


public interface FlightService {
    Flight getOptimalFlight(String sursa, String destinatie, Integer ziDePlecare);
}
