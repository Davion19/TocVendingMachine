package org.example.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.example.Model.Tape.BLANK;


public class TuringMachine {

    private String input;
    private Tape tape = new Tape();
    private ArrayList <Transition> stateRules;
    private String startState;
    private String currentState;
    private Register  totalMoney;
    private ItemRegister items;

    public TuringMachine(String input) {

        try {
            tape.input(input);
        }catch (Tape.InvalidInputException e){
            System.out.println(e);
        }



        setStateRules();
    }

    public void welcomeText(){
        System.out.println("[0] Items available");

        //TODO each item in the register and for each unique item give the count and the item name
        System.out.println("[0]");
    }

    public void setStateRules(){

        //acceptable String Transitions
        stateRules = new ArrayList<>();
        startState = "q0";
        stateRules.add(new Transition("q0","q1",'a','a',"R"));
        stateRules.add(new Transition("q0","q1",'b','b',"R"));
        stateRules.add(new Transition("q0","q1",'c','c',"R"));


        stateRules.add(new Transition("q1","q1",'a','a',"R"));
        stateRules.add(new Transition("q1","q1",'b','b',"R"));
        stateRules.add(new Transition("q1","q1",'c','C',"R"));
        stateRules.add(new Transition("q1","q2",'N','N',"R"));
        stateRules.add(new Transition("q1","q2",'F','F',"R"));
        stateRules.add(new Transition("q1","q2",'S','S',"R"));
        stateRules.add(new Transition("q1","q2",'K','K',"R"));


        stateRules.add(new Transition("q2","q2",'N','N',"R"));
        stateRules.add(new Transition("q2","q2",'S','S',"R"));
        stateRules.add(new Transition("q2","q2",'K','K',"R"));
        stateRules.add(new Transition("q2","q2",'F','F',"R"));

        //Accept input from user
        stateRules.add(new Transition("q2","qa",BLANK,BLANK,"R"));


        //Restock String
        stateRules.add(new Transition("q0","q5",'N','N',"R"));
        stateRules.add(new Transition("q5","q6",'K','K',"R"));
        stateRules.add(new Transition("q6","q7",'S','S',"R"));
        stateRules.add(new Transition("q7","q8",'F','F',"R"));
        stateRules.add(new Transition("q8","q9",'F','F',"R"));
        stateRules.add(new Transition("q9","q10",'S','S',"R"));
        stateRules.add(new Transition("q10","q11",'K','K',"R"));
        stateRules.add(new Transition("q11","q12",'S','S',"R"));

        //Accept restock input
        stateRules.add(new Transition("q12","qa2",BLANK,BLANK,"R"));

        //Error Transitions
        stateRules.add(new Transition("q0","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q1","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q5","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q6","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q7","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q8","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q9","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q10","qr",BLANK,BLANK,"R"));
        stateRules.add(new Transition("q11","qr",BLANK,BLANK,"R"));

    }

    public void validateInput(String input) throws Tape.InvalidInputException {

        //Reading through the String, checking if it is a valid input
        for(int i = input.length() -1 ; i>=0 ; i--){
            char c = input.charAt(i);
            if(!Arrays.asList(Tape.TAPEALPHABET).contains(input.charAt(i))) {
                throw new Tape.InvalidInputException("String is not Present is the Tape Alphabet");
            }
        }
    }

    public void addStateRule(Transition transition){
        stateRules.add(transition);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ArrayList<Transition> getStateRules() {
        return stateRules;
    }

    public void setStateRules(ArrayList<Transition> stateRules) {
        this.stateRules = stateRules;
    }

    @Override
    public String toString() {
        return "TuringMachine{" +
                "input='" + input + '\'' +
                ", stateRules=" + stateRules +
                ", startState=" + startState +
                ", currentState=" + currentState +
                '}';
    }
}
