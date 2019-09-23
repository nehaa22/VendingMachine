package com.thoughtworks.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private final List<Note> availableNotes = Collections.unmodifiableList(Arrays.asList(
            CurrencyNotes.NOTE_OF_1,
            CurrencyNotes.NOTE_OF_2,
            CurrencyNotes.NOTE_OF_5,
            CurrencyNotes.NOTE_OF_10,
            CurrencyNotes.NOTE_OF_20,
            CurrencyNotes.NOTE_OF_50,
            CurrencyNotes.NOTE_OF_100,
            CurrencyNotes.NOTE_OF_200,
            CurrencyNotes.NOTE_OF_500,
            CurrencyNotes.NOTE_OF_1000));

    private List<Note> changedNotes = new ArrayList<>();

    @Override
    public List<Note> getChange(int totalAmount) {
        return getChangeThroughRecursion(totalAmount, availableNotes.size() - 1);
    }

    private List<Note> getChangeThroughRecursion(int totalAmount, int noteIndex) {
        if (totalAmount == 0) return changedNotes;

        Note note = availableNotes.get(noteIndex);
        if (totalAmount >= note.value) {
            changedNotes.add(note);
            totalAmount = totalAmount - note.value;
        } else noteIndex--;

        return getChangeThroughRecursion(totalAmount, noteIndex);
    }
}
