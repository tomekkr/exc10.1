class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(String message) {
        super(message);
    }

    public NameUndefinedException() {
        super("Incorrect length");
    }
}
