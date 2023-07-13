package BMNeuralNetwork;

import BMNeuralNetwork.exceptions.UserInputExceptions;
import BMNeuralNetwork.users.UserTemplate.User;

public class Main {
    public static void main(String[] args) {
        User Chris_S  = null;

        try {
            Chris_S = new User(
                    "",
                    "Sison",
                    "OofNSquared",
                    "qwerty123456",
                    "chris.a.sison@gmail.com",
                    true
            );
        } catch (UserInputExceptions.EmailAlreadyExistsException e) {
            throw new RuntimeException(e);
        } catch (UserInputExceptions.BlankFieldException e) {
            throw new RuntimeException(e);
        } catch (UserInputExceptions.InvalidPasswordException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Chris_S.getLastName());
    }
}