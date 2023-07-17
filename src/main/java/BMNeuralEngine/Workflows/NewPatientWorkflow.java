package BMNeuralEngine.Workflows;

import BMNeuralEngine.Users.UserModel.PatientModel;
import BMNeuralEngine.exceptions.UserInputExceptions;
import BMNeuralEngine.util.PatientWorkflowHelpers;

import java.util.HashMap;

public class NewPatientWorkflow {
    public static String initiateWorkflow(PatientModel patient) throws UserInputExceptions.EmailAlreadyExistsException, UserInputExceptions.BlankFieldException, UserInputExceptions.InvalidPasswordException {
        if (patient.getFirstName() == null || patient.getFirstName().isEmpty()) throw new UserInputExceptions.BlankFieldException("First name cannot be left blank.");
        if (patient.getLastName() == null || patient.getLastName().isEmpty()) throw new UserInputExceptions.BlankFieldException("Last name cannot be left blank.");
        if (patient.getUsername() == null || patient.getUsername().isEmpty()) throw new UserInputExceptions.BlankFieldException("Username cannot be left blank.");
        if (patient.getEmail() == null || patient.getEmail().isEmpty()) throw new UserInputExceptions.BlankFieldException("Email cannot be left blank.");
        if (patient.getEmail().contains("myemail.com")) throw new UserInputExceptions.EmailAlreadyExistsException("This email already exists.");
        if (patient.getPassword() == null || patient.getPassword().length() < 6) throw new UserInputExceptions.InvalidPasswordException("Password must contain at least 6 characters.");

        return PatientWorkflowHelpers.validateUserInsurance(patient);
    }


}
