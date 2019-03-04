package com.github.slawku10.simpleaopspring.components;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    private void singBeforeQuest(){
        stream.println("Idzie rycerz wykonać zadanie: ");
    }

    private void singAfterQuest(){
        stream.println("Rycerz wrócił bo wykonał zadanie: ");
    }
}
