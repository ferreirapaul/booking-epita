package dev.xdbe.booking.model.booking;

import java.time.LocalDate;

public class BookingDTO {

    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int nightStays;
    private String name;
    private String creditCardNumber;

    // Getters and Setters
    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNightStays() {
        return nightStays;
    }

    public void setNightStays(int nightStays) {
        this.nightStays = nightStays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}