class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(String message) {
        super(message);
    }

    public IncorrectAgeException() {
        super("Age must be greater than 0");
    }
}
