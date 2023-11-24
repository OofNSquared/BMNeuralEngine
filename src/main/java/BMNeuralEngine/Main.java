package BMNeuralEngine;

import BMNeuralEngine.Users.UserModel.PatientModel;
import BMNeuralEngine.Workflows.NewPatientWorkflow;
import BMNeuralEngine.exceptions.UserInputExceptions;

public class Main {
    public static void main(String[] args) {
        boolean workflowRequest = true;

        if (workflowRequest) {
            PatientModel patient = new PatientModel(
                    123456789,
                    "Chris",
                    "Sison",
                    "OofNSquared",
                    "qwerty123456",
                    "chris.a.sison@gmail.com"
            );

            try {
                NewPatientWorkflow newUser = new NewPatientWorkflow();
                System.out.println(newUser.initiateWorkflow(patient));
//                System.out.println(patient.getPatientId());
                System.out.println(patient.getOptInAIStatus());
            } catch (UserInputExceptions.BlankFieldException e) {
                throw new RuntimeException(e);
            } catch (UserInputExceptions.InvalidPasswordException e) {
                throw new RuntimeException(e);
            } catch (UserInputExceptions.EmailAlreadyExistsException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Nothing to do.");
        }
    }
}