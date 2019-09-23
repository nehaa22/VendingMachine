package com.thoughtworks.bootcamp;

public final class Note {

    public final int value;

    public Note(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Note value :" + value;
    }
}