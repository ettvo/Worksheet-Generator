package ProblemGen;
public class Problem {
    /**
     * The Problem object. 
     * String problem: the problem
     * String solution: the solutions to the problem
     */

    String _problem;
    String _solution;

    Problem (String prob, String soln) {
        _problem = prob;
        _solution = soln;
    }

    String getProb() {
        return _problem;
    }
    
    String getSoln() {
        return _solution;
    }
}
