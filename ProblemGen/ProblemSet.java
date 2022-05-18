package ProblemGen;
public class ProblemSet {
    /**
     * The ProblemSet object. 
     * Problems[] problems: the set of problems
     * int numProblems: number of problems (length of problems) 
     */
    Problem[] _problems;

    ProblemSet(Problem[] probs) {
        _problems = probs;
    }

    ProblemSet(String[] probs, String[] solns) {
        if (probs.length != solns.length) {
            throw new ProblemException("Number of problems not equal to number of solutions.\n");
        }
        _problems = new Problem[probs.length];
        for (int counter = 0; counter < probs.length; counter += 1) {
            _problems[counter] = new Problem(probs[counter], solns[counter]);
        }

    }

    /** Returns a String containing all the problems in the problem set, numerated and separated by newlines.*/
    String getProblems() {
        String ret = "";
        for (int counter = 0; counter < _problems.length; counter += 1) {
            ret += (counter + 1) + ". " + _problems[counter].getProb() + "\n";
        }
        return ret;
    }

    /** Returns a String containing all the solutions in the problem set, numerated and separated by newlines.*/
    String getSolns() {
        String ret = "";
        for (int counter = 0; counter < _problems.length; counter += 1) {
            ret += (counter + 1) + ". " + _problems[counter].getSoln() + "\n";
        }
        return ret;
    }

    /** Returns a String containing all the problems and solutions in the problem set, numerated and separated by newlines.*/
    String getProbsAndSolns() {
        String ret = "";
        for (int counter = 0; counter < _problems.length; counter += 1) {
            ret += (counter + 1) + ". " + _problems[counter].getProb() + "\n";
            ret += "\t Solution: " + _problems[counter].getSoln() + "\n\n";
        }
        return ret;
    }
}
