package com.mycompany.backtracking;

/**
 *
 * @author mujtaba
 */
public class App {

    public static void main(String[] args) {
        int n = 4; // number of queens

        NQueens problem = new NQueens(n);
        if (problem.solve()) {
            problem.print();
        } else {
            System.out.println("No solution found.");
        }
    }
}
