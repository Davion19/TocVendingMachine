package org.example;

import java.util.ArrayList;

public class TuringMachine {

    private String input;
    private Tape tape;
    private ArrayList <Transition> transitions;
    private char startState;
    private char currentState;

    public TuringMachine(String input, Tape tape, ArrayList<Transition> transitions, char startState, char currentState) {
        this.input = input;
        this.tape = tape;
        this.transitions = transitions;
        this.startState = startState;
        this.currentState = currentState;
    }

    public TuringMachine(char startState, String inputString){
        tape = new Tape(inputString);

    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Tape getTape() {
        return tape;
    }

    public void setTape(Tape tape) {
        this.tape = tape;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public char getStartState() {
        return startState;
    }

    public void setStartState(char startState) {
        this.startState = startState;
    }

    public char getCurrentState() {
        return currentState;
    }

    public void setCurrentState(char currentState) {
        this.currentState = currentState;
    }
}
