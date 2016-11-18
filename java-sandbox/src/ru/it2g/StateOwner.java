package ru.it2g;

/**
 * Author: timofeevdv
 * Date: 23.06.2016
 */
public class StateOwner {

    public LambdaTester tester;

    public StateOwner(LambdaTester tester) {
        this.tester = tester;
    }

    public void runTest(String name) {
        tester.go(name);
    }

}
