package com.misiontic.p65.c4.g3.HotelReservaJava.models;

import org.springframework.data.annotation.Id;

import java.util.Date;


public class ReservaT {
    @Id
    private String id;
    private String reservationUsername;
    private String reservationHabitation;
    private String reservationDetail;
    private Date   horusIn;
    private Date   horusOut;

    public ReservaT(String id, String reservationUsername, String reservationHabitation, String reservationDetail, Date horusIn, Date horusOut){
        this.id                    = id;
        this.reservationUsername   = reservationUsername;
        this.reservationHabitation = reservationHabitation;
        this.reservationDetail     = reservationDetail;
        this.horusIn               = horusIn;
        this.horusOut              = horusOut;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReservationUsername() {
        return reservationUsername;
    }

    public void setReservationUsername(String reservationUsername) {
        this.reservationUsername = reservationUsername;
    }

    public String getReservationHabitation() {
        return reservationHabitation;
    }

    public void setReservationHabitation(String reservationHabitation) {
        this.reservationHabitation = reservationHabitation;
    }

    public String getReservationDetail() {
        return reservationDetail;
    }

    public void setReservationDetail(String reservationDetail) {
        this.reservationDetail = reservationDetail;
    }

    public Date getHorusIn() {
        return horusIn;
    }

    public void setHorusIn(Date horusIn) {
        this.horusIn = horusIn;
    }

    public Date getHorusOut() {
        return horusOut;
    }

    public void setHorusOut(Date horusOut) {
        this.horusOut = horusOut;
    }
}
