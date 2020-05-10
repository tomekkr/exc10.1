class NameUndefinedException extends Exception {
    public NameUndefinedException(String message) {
        super(message);
    }

    public NameUndefinedException() {
        super("Incorrect length");
    }
}
