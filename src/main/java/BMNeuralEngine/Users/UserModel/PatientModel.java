package BMNeuralEngine.Users.UserModel;

public class PatientModel implements User {
    private int insuranceId;
    private String firstName;
    private String lastName;
    // private int socialSecurity;
    private String username;
    private String password;
    private String email;
    private boolean isPatient;

    // Constructor
    public PatientModel(int insuranceId, String firstName, String lastName, String username, String password, String email) {
        this.insuranceId = insuranceId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public PatientModel(String firstName, String lastName, String username, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public boolean isPatient() { return isPatient; }

    // Setters
    public void setInsuranceId(int insuranceId) { this.insuranceId = insuranceId; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
    public void isPatient(boolean isPatient) { this.isPatient = isPatient; }
}

