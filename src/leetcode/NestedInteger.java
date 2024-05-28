package leetcode;

import java.util.List;

public interface NestedInteger {
    // Constructor initializes an empty nested list.

    // Constructor initializes a single integer.

    // @return true if this main.NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger();

    // @return the single integer that this main.NestedInteger holds, if it holds a single integer
    // Return null if this main.NestedInteger holds a nested list
    Integer getInteger();

    // Set this main.NestedInteger to hold a single integer.
    void setInteger(int value);

    // Set this main.NestedInteger to hold a nested list and adds a nested integer to it.
    void add(NestedInteger ni);

    // @return the nested list that this main.NestedInteger holds, if it holds a nested list
    // Return empty list if this main.NestedInteger holds a single integer
    List<NestedInteger> getList();
}
