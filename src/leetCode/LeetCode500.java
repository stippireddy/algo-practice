package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LeetCode500 {

    public String[] findWords(String[] words) {
        ArrayList<String> output = new ArrayList<String>();
        for (String word : words) {
            if (isMadeOfSingleRow(word)) {
                output.add(word);
            }
        }
        return output.toArray(new String[output.size()]);
    }

    private boolean isMadeOfSingleRow(String s) {
        final HashSet<Character> first = new HashSet<Character>() {

            {
                add('Q');
                add('W');
                add('E');
                add('R');
                add('T');
                add('Y');
                add('U');
                add('I');
                add('O');
                add('P');
                add('q');
                add('w');
                add('e');
                add('r');
                add('t');
                add('y');
                add('u');
                add('i');
                add('o');
                add('p');
            }
        };

        final HashSet<Character> second = new HashSet<Character>() {

            {
                add('A');
                add('S');
                add('D');
                add('F');
                add('G');
                add('H');
                add('J');
                add('K');
                add('L');
                add('a');
                add('s');
                add('d');
                add('f');
                add('g');
                add('h');
                add('j');
                add('k');
                add('l');
            }
        };
        final HashSet<Character> third = new HashSet<Character>() {

            {
                add('Z');
                add('X');
                add('C');
                add('V');
                add('B');
                add('N');
                add('M');
                add('z');
                add('x');
                add('c');
                add('v');
                add('b');
                add('n');
                add('m');
            }
        };
        char[] charArray = s.toCharArray();
        for (char c : charArray) {

        }
        boolean isMadeOfFirst = true;
        for (char c : charArray) {
            if (!first.contains(c)) {
                isMadeOfFirst = false;
            }
        }
        if (isMadeOfFirst) {
            return true;
        }
        boolean isMadeOfSecond = true;
        for (char c : charArray) {
            if (!second.contains(c)) {
                isMadeOfSecond = false;
            }
        }
        if (isMadeOfSecond) {
            return true;
        }
        boolean isMadeOfThird = true;
        for (char c : charArray) {
            if (!third.contains(c)) {
                isMadeOfThird = false;
            }
        }
        if (isMadeOfThird) {
            return true;
        }
        return false;
    }
}
