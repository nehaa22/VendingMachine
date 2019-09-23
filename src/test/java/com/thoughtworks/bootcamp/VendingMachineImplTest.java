package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineImplTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachineImpl();
    }

    @Test
    void get_zero_change_if_total_amount_is_zero() {
        List<Note> changedNotes = vendingMachine.getChange(0);
        assertEquals(0, changedNotes.size());
    }

    @Test
    void get_one_change_if_total_amount_is_1000() {
        List<Note> changedNotes = vendingMachine.getChange(1000);
        assertEquals(1, changedNotes.size());
    }
}
