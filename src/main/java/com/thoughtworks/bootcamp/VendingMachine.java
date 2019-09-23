package com.thoughtworks.bootcamp;

import java.util.List;

public interface VendingMachine {
    List<Note> getChange(int totalAmount);
}