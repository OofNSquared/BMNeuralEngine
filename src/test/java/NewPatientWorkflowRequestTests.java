import BMNeuralEngine.Users.UserModel.PatientModel;
import org.junit.Test;

import static BMNeuralEngine.exceptions.UserInputExceptions.*;
import static org.junit.Assert.*;

public class NewPatientWorkflowRequestTests {

    @Test
    public void testBlankFieldException() {
        Exception exception = assertThrows(BlankFieldException.class, () -> {
            PatientModel patient = new PatientModel(
                    "",
                    "Sison",
                    "OofNSquared",
                    "qwerty123456",
                    "chris.a.sison@gmail.com"
            );
        });

        assertEquals("First name cannot be left blank.", exception.getMessage());
    }

    @Test
    public void testEmailAlreadyExistsException() {
        Exception exception = assertThrows(EmailAlreadyExistsException.class, () -> {
            PatientModel patient = new PatientModel(
                    "Chris",
                    "Sison",
                    "OofNSquared",
                    "qwerty123456",
                    "myemail.com"
            );
        });

        assertEquals("This email already exists.", exception.getMessage());
    }

    @Test
    public void testInvalidPasswordException() {
        Exception exception = assertThrows(InvalidPasswordException.class, () -> {
            PatientModel patient = new PatientModel(
                    "Chris",
                    "Sison",
                    "OofNSquared",
                    "qwerty",
                    "myemail.com"
            );
        });

        assertEquals("Password must contain at least 6 characters.", exception.getMessage());
    }
}

