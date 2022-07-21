package ss11_dsa_stack_queue.exercise.check_brackets.service;

import java.util.Stack;

public class Brackets {
    public static boolean checkBrackets(String characters) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < characters.length(); i++) {
            if (characters.charAt(i) == '(') {
                characterStack.push(characters.charAt(i));
            } else if (characters.charAt(i) == ')') {
                if (characterStack.isEmpty()) {
                    return false;
                }
                characterStack.pop();
            }
        }
        return characterStack.isEmpty();
    }
}
