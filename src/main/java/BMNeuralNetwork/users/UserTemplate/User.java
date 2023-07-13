package BMNeuralNetwork.users.UserTemplate;

import BMNeuralNetwork.exceptions.UserInputExceptions;

public class User {
    private int insuranceId;
    private String firstName;
    private String lastName;

    // private int socialSecurity;

    private String username;
    private String password; // please remember this is not a secure way to store passwords
    private String email;
    private boolean isPatient;

    // Constructor
    public User(int insuranceId, String firstName, String lastName, String username, String password, String email, boolean isPatient) {
        this.insuranceId = insuranceId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isPatient = isPatient;
    }

    public User(String firstName, String lastName, String username, String password, String email, boolean isPatient) throws UserInputExceptions.EmailAlreadyExistsException, UserInputExceptions.BlankFieldException, UserInputExceptions.InvalidPasswordException {
        if (firstName == null || firstName.isEmpty()) {
            throw new UserInputExceptions.BlankFieldException("First name cannot be left blank.");
        }

        if (lastName == null || lastName.isEmpty()) {
            throw new UserInputExceptions.BlankFieldException("Last name cannot be left blank.");
        }

        if (username == null || username.isEmpty()) {
            throw new UserInputExceptions.BlankFieldException("Username cannot be left blank.");
        }

        // Here we are checking if the password contains at least 6 characters as an example.
        // Replace this with your actual password validation logic.
        if (password == null || password.length() < 6) {
            throw new UserInputExceptions.InvalidPasswordException("Password must contain at least 6 characters.");
        }

        // Here we're just throwing an exception if the email contains "alreadyexists.com" as a placeholder.
        // Replace this with your actual email uniqueness check logic.
        if (email == null || email.isEmpty()) {
            throw new UserInputExceptions.BlankFieldException("Email cannot be left blank.");
        } else if (email.contains("alreadyexists.com")) {
            throw new UserInputExceptions.EmailAlreadyExistsException("This email already exists.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isPatient = isPatient;
    }
    // Getters
    public int getInsuranceId() {
        return insuranceId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isPatient() {
        return isPatient;
    }

    // Setters
    public void setInsuranceId(int insuranceId) { this.insuranceId = insuranceId; }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void isPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }
}

