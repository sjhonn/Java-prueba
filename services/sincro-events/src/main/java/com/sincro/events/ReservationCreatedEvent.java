package com.sincro.events;

public class ReservationCreatedEvent {

    private String reservationId;
    private String userId;
    private String resourceId;
    private int quantity;

    public ReservationCreatedEvent() {
    }

    public ReservationCreatedEvent(
            String reservationId,
            String userId,
            String resourceId,
            int quantity) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.resourceId = resourceId;
        this.quantity = quantity;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public int getQuantity() {
        return quantity;
    }
}
