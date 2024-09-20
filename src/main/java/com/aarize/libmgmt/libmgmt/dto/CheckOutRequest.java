package com.aarize.libmgmt.libmgmt.dto;

public class CheckOutRequest {

    private int roll;
    private int bookId;

    // Getters and Setters
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
