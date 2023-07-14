package BMNeuralEngine;

import BMNeuralEngine.Workflows.NewPatientWorkflow;
import BMNeuralEngine.exceptions.UserInputExceptions;

public class Main {
    public static void main(String[] args) {
        boolean workflowRequest = false;

        if (workflowRequest) {
            try {
                NewPatientWorkflow.initiateWorkflow(
                        "Chris",
                        "Sison",
                        "OofNSquared",
                        "qwerty123456",
                        "chris.a.sison@gmail.com"
                );
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