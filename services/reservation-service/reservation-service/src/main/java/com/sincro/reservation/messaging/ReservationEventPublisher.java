package com.sincro.reservation.messaging;

import com.sincro.events.ReservationCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventPublisher {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public ReservationEventPublisher(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publishReservationCreated(ReservationCreatedEvent event) {
        kafkaTemplate.send("reservation.created", event.getReservationId(), event);
    }
}
