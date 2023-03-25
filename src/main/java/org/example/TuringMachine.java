package org.example;

import java.util.ArrayList;

public class TuringMachine {

    private String input;
    private Tape tape;
    private ArrayList <Transition> stateRules;
    private char startState;
    private char currentState;

    public TuringMachine(String input, Tape tape, ArrayList<Transition> stateRule, char startState, char currentState) {
        this.input = input;
        this.tape = tape;
        this.stateRules = stateRule;
        this.startState = startState;
        this.currentState = currentState;
    }

    public TuringMachine(char startState, String inputString){
        tape = new Tape(inputString);
        stateRules = new ArrayList<>();
        this.startState = startState;
        this.input = inputString;
    }

    public void addStateRule(Transition transition){
        stateRules.add(transition);
    }

    //Getters and Setters

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

    public ArrayList<Transition> getStateRules() {
        return stateRules;
    }

    public void setStateRules(ArrayList<Transition> stateRules) {
        this.stateRules = stateRules;
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
