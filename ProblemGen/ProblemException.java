class ProblemException extends RuntimeException {

    /** A ProblemException with no message. */
    ProblemException() {
    }

    /** A ProblemException for which .getMessage() is MSG. */
    ProblemException(String msg) {
        super(msg);
    }

    /** Returns an exception containing an error message formatted according
     *  to FORMAT and ARGS, as for printf or String.format. Typically, one uses
     *  this by throwing the result in a context where there is a 'try' block
     *  that handles it by printing the message (esp. via reportError). */
    static ProblemException error(String format, Object... args) {
        return new ProblemException(String.format(format, args));
    }

}
