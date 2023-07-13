package BMNeuralNetwork.exceptions;

public class UserInputExceptions {
    // This exception will be used if a required field is left blank.
    public static class BlankFieldException extends Exception {
        public BlankFieldException(String message) {
            super(message);
        }
    }

    // This exception will be used if the email provided already exists.
    public static class EmailAlreadyExistsException extends Exception {
        public EmailAlreadyExistsException(String message) {
            super(message);
        }
    }

    // This exception will be used if the password provided does not meet the required criteria.
    public static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

}
