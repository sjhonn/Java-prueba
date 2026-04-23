package com.sincro.events;

public class InventoryReservedEvent extends BaseEvent {

    private String reservationId;
    private boolean success;

    public InventoryReservedEvent() {
    }

    public InventoryReservedEvent(String reservationId, boolean success) {
        this.reservationId = reservationId;
        this.success = success;
    }

    public String getReservationId() {
        return reservationId;
    }

    public boolean isSuccess() {
        return success;
    }
}
