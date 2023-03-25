package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Tape {

    public char BLANK = 'Ø';

    public ArrayList TAPEALPHABET = new ArrayList<>(Arrays.asList("a", "b", "c","N","K","F","S"));
    private Stack <Character> leftTape;
    private Stack <Character> rightTape;
    private char head;

    public Tape(Stack<Character> leftTape, Stack<Character> rightTape, char currentCharacter) {
        this.leftTape = leftTape;
        this.rightTape = rightTape;
        this.head = currentCharacter;
    }

    public Tape(String input){

        try {
            validateInput(input);
        }catch (InvalidInputException e){
            System.out.println(e);
        }
        leftTape = new Stack<>();
        rightTape = new Stack<>();

        // Adding an End for the input String
        rightTape.push(BLANK);

        // Pushing the Input to the Stack
        for(int i= input.length() -1; i>=0; i-- ){
            rightTape.push(input.charAt(i));
        }

        // Getting the character at the top of the string,
        // the head is over head
        head = rightTape.pop();
    }

    public void validateInput(String input) throws InvalidInputException{

        //Reading through the String, checking if it is a valid input
        for(int i = input.length() -1 ; i>=0 ; i--){
            if(!TAPEALPHABET.contains(input.charAt(i))) {
                throw new InvalidInputException("String is not Present is the Tape Alphabet");
            }
        }
    }

    class InvalidInputException extends Exception{

        public InvalidInputException(String str){
            super(str);
        }
    }


    public void moveHeadLeft(){
        rightTape.push(head);
        if(leftTape.isEmpty()){
            leftTape.push(BLANK);
        }

        head = leftTape.pop();
    }

    public void moveHeadRight(){
        leftTape.push(head);
        if(leftTape.isEmpty()){
            rightTape.push(BLANK);
        }

        head = rightTape.pop();
    }

    public Stack<Character> getLeftTape() {
        return leftTape;
    }

    public void setLeftTape(Stack<Character> leftTape) {
        this.leftTape = leftTape;
    }

    public Stack<Character> getRightTape() {
        return rightTape;
    }

    public void setRightTape(Stack<Character> rightTape) {
        this.rightTape = rightTape;
    }

    public char getHead() {
        return head;
    }

    public void setHead(char head) {
        this.head = head;
    }
}
