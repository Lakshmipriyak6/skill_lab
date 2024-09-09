// Singleton class for managing user authentication
class UserAuthentication {
    private static UserAuthentication instance;
    private boolean loggedIn;
    private String username;

    private UserAuthentication() {
        this.loggedIn = false;
        this.username = "";
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String username) {
        if (!loggedIn) {
            this.username = username;
            this.loggedIn = true;
            System.out.println("User " + username + " logged in successfully.");
        } else {
            System.out.println("User is already logged in.");
        }
    }

    public void logout() {
        if (loggedIn) {
            System.out.println("User " + username + " logged out successfully.");
            this.loggedIn = false;
            this.username = "";
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return username;
    }
}
