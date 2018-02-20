package restApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restApp.domain.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
