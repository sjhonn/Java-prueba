package com.sincro.events;

public class PaymentFailedEvent extends BaseEvent {

    private String reservationId;
    private String reason;

    public PaymentFailedEvent() {
    }

    public PaymentFailedEvent(String reservationId, String reason) {
        this.reservationId = reservationId;
        this.reason = reason;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getReason() {
        return reason;
    }
}
