package com.sincro.events;

public class PaymentApprovedEvent extends BaseEvent {

    private String reservationId;

    public PaymentApprovedEvent() {
    }

    public PaymentApprovedEvent(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationId() {
        return reservationId;
    }
}
