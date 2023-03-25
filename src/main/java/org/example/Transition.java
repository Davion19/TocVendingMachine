package org.example;

public class Transition {
    private char currentState;
    private char nextState;
    private char readState;
    private char writeState;

    public Transition(char currentState, char nextState, char readState, char writeState) {
        this.currentState = currentState;
        this.nextState = nextState;
        this.readState = readState;
        this.writeState = writeState;
    }

    public char getCurrentState() {
        return currentState;
    }

    public void setCurrentState(char currentState) {
        this.currentState = currentState;
    }

    public char getNextState() {
        return nextState;
    }

    public void setNextState(char nextState) {
        this.nextState = nextState;
    }

    public char getReadState() {
        return readState;
    }

    public void setReadState(char readState) {
        this.readState = readState;
    }

    public char getWriteState() {
        return writeState;
    }

    public void setWriteState(char writeState) {
        this.writeState = writeState;
    }
}
