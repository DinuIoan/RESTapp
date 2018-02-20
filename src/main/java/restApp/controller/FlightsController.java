package restApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restApp.domain.Flight;
import restApp.repository.FlightRepository;
import restApp.repository.ReservationRepository;
import restApp.repository.TicketRepository;
import restApp.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightsController {

    private FlightService flightService;

    @Autowired
    public FlightsController(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping(path = "/optimalFlight",
                    method = RequestMethod.GET,
                    produces = "application/json")
    public Flight getOptimalFlight(@RequestParam(value = "sursa", defaultValue = "") String sursa,
                                   @RequestParam(value = "destinatie", defaultValue = "") String destinatie,
                                   @RequestParam(value = "ziDePlecare", defaultValue = "1") Integer ziDePlecare) {
        return flightService.getOptimalFlight(sursa, destinatie, ziDePlecare);
    }
}
