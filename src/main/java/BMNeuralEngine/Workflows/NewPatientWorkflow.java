package BMNeuralEngine.Workflows;

import BMNeuralEngine.Users.UserModel.PatientModel;
import BMNeuralEngine.exceptions.UserInputExceptions;

import java.util.HashMap;

public class NewPatientWorkflow {
    public static void initiateWorkflow(String firstName, String lastName, String username, String password, String email) throws UserInputExceptions.EmailAlreadyExistsException, UserInputExceptions.BlankFieldException, UserInputExceptions.InvalidPasswordException {
        if (firstName == null || firstName.isEmpty()) throw new UserInputExceptions.BlankFieldException("First name cannot be left blank.");
        if (lastName == null || lastName.isEmpty()) throw new UserInputExceptions.BlankFieldException("Last name cannot be left blank.");
        if (username == null || username.isEmpty()) throw new UserInputExceptions.BlankFieldException("Username cannot be left blank.");
        if (email == null || email.isEmpty()) throw new UserInputExceptions.BlankFieldException("Email cannot be left blank.");
        if (email.contains("myemail.com")) throw new UserInputExceptions.EmailAlreadyExistsException("This email already exists.");
        if (password == null || password.length() < 6) throw new UserInputExceptions.InvalidPasswordException("Password must contain at least 6 characters.");





        PatientModel newPatient = new PatientModel(
                firstName,
                lastName,
                username,
                password,
                email
        );

        System.out.println(newPatient.getFirstName());
    }
}
