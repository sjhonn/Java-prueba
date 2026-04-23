package com.sincro.reservation.domain;

import com.sincro.reservation.domain.ReservationStatus;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Reservation {

    @Id
    private String id;

    private String userId;
    private String resourceId;
    private int quantity;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    protected Reservation() {
    }

    public Reservation(String userId, String resourceId, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.userId = userId;
        this.resourceId = resourceId;
        this.quantity = quantity;
        this.status = ReservationStatus.PENDING;
    }

    // 🔹 GETTERS (ESTO FALTABA)
    public String getId() {
        return id;
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

    public ReservationStatus getStatus() {
        return status;
    }

    public void approve() {
        this.status = ReservationStatus.APPROVED;
    }

    public void reject() {
        this.status = ReservationStatus.REJECTED;
    }
}
