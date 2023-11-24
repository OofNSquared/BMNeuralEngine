package BMNeuralEngine;

import BMNeuralEngine.Users.UserModel.PatientModel;
import BMNeuralEngine.Workflows.NewPatientWorkflow;
import BMNeuralEngine.exceptions.UserInputExceptions;

public class Main {
    public static void main(String[] args) {
        boolean workflowRequest = true;

        // TODO: Pull workflows from a workflow request queue.
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
                NewPatientWorkflow newUserWorkflow = new NewPatientWorkflow();
                newUserWorkflow.initiateWorkflow(patient);
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