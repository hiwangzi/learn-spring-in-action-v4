package com.hiwangzi;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight did embark on a quest!");
    }
}
