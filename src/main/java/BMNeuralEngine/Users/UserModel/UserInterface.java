package BMNeuralEngine.Users.UserModel;

interface User {
    String firstName = null;
    String lastName = null;
    String username = null;
    String password = null;
    String email = null;

    // Getters
    String getFirstName();
    String getLastName();
    String getUsername();
    String getPassword();
    String getEmail();

    // Setters
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setUsername(String username);
    void setPassword(String password);
    void setEmail(String email);
}


