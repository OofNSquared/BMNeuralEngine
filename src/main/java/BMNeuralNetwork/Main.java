package BMNeuralNetwork;

import BMNeuralNetwork.Users.UserModel.PatientModel;
import BMNeuralNetwork.exceptions.UserInputExceptions;

public class Main {
    public static void main(String[] args) {
        PatientModel Chris_S  = null;

        try {
            Chris_S = new PatientModel(
                    "Chris",
                    "Sison",
                    "OofNSquared",
                    "qwerty123456",
                    "chris.a.sison@gmail.com"
            );
        } catch (UserInputExceptions.EmailAlreadyExistsException e) {
            throw new RuntimeException(e);
        } catch (UserInputExceptions.BlankFieldException e) {
            throw new RuntimeException(e);
        } catch (UserInputExceptions.InvalidPasswordException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Chris_S.getFirstName());
    }
}