package restApp.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_bilete")
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "info_card_credit")
    private String infoCardCredit;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="t_rezervari_id")
    private Reservation reservation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoCardCredit() {
        return infoCardCredit;
    }

    public void setInfoCardCredit(String infoCardCredit) {
        this.infoCardCredit = infoCardCredit;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
