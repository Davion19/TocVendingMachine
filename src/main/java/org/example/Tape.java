package org.example;

import java.util.Stack;

public class Tape {

    private Stack <Character> leftTape;
    private Stack <Character> rightTape;

    private char currentCharacter;

    public Tape(Stack<Character> leftTape, Stack<Character> rightTape, char currentCharacter) {
        this.leftTape = leftTape;
        this.rightTape = rightTape;
        this.currentCharacter = currentCharacter;
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

    public char getCurrentCharacter() {
        return currentCharacter;
    }

    public void setCurrentCharacter(char currentCharacter) {
        this.currentCharacter = currentCharacter;
    }
}
