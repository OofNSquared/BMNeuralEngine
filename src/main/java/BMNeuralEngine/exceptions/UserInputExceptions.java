package BMNeuralEngine.exceptions;

public class UserInputExceptions {
    public static class BlankFieldException extends Exception {
        public BlankFieldException(String message) { super(message); }
    }

    public static class EmailAlreadyExistsException extends Exception {
        public EmailAlreadyExistsException(String message) { super(message); }
    }

    public static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) { super(message); }
    }
}
