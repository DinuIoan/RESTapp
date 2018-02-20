package restApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restApp.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
