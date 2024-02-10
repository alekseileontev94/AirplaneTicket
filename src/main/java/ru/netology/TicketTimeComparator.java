package ru.netology;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<ru.netology.Ticket> {

    @Override
    public int compare(ru.netology.Ticket t1, ru.netology.Ticket t2) {
        if (t1.flightTime() < t2.flightTime()) {
            return -1;
        } else if (t1.flightTime() > t2.flightTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}