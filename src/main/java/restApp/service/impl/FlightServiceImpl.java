package restApp.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restApp.domain.Flight;
import restApp.repository.FlightRepository;
import restApp.service.FlightService;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight getOptimalFlight(String sursa, String destinatie, Integer ziDePlecare) {
        List<Flight> flights = flightRepository.getOptimalFlight(sursa, destinatie, ziDePlecare);
        Flight optimalFlight = new Flight();

        if (flights.size() != 0) {
            for (Flight flight : flights) {
                //Primul zbor
                if (optimalFlight == null) {
                    optimalFlight = flight;
                } else if (optimalFlight.getOraDePlecare() + optimalFlight.getDurataZborului() >
                        flight.getDurataZborului() + flight.getOraDePlecare()) {
                    optimalFlight = flight;
                }
            }
        }
        return optimalFlight;
    }
}
