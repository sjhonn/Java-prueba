package com.sincro.reservation.api;

import com.sincro.events.ReservationCreatedEvent;
import com.sincro.reservation.domain.Reservation;
import com.sincro.reservation.messaging.ReservationEventPublisher;
import com.sincro.reservation.repository.ReservationRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationRepository repository;
    private final ReservationEventPublisher publisher;

    public ReservationController(ReservationRepository repository,
            ReservationEventPublisher publisher) {
        this.repository = repository;
        this.publisher = publisher;
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation request) {
        Reservation reservation = new Reservation(request.getUserId(),
                request.getResourceId(),
                request.getQuantity());

        repository.save(reservation);

        publisher.publishReservationCreated(
                new ReservationCreatedEvent(
                        reservation.getId(),
                        reservation.getUserId(),
                        reservation.getResourceId(),
                        reservation.getQuantity()));

        return reservation;
    }
}
