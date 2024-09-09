// Singleton class to manage User Login State
class UserSession {
    private static UserSession instance;
    private boolean loggedIn;
    private String username;

    // Private constructor to prevent direct instantiation
    private UserSession() {
        this.loggedIn = false;
        this.username = "";
    }

    // Method to get the single instance of UserSession
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String username) {
        if (!loggedIn) {
            this.username = username;
            this.loggedIn = true;
            System.out.println("User " + username + " successfully logged in.");
        } else {
            System.out.println("User is already logged in as " + this.username);
        }
    }

    // Method to log out the user
    public void logout() {
        if (loggedIn) {
            System.out.println("User " + username + " successfully logged out.");
            this.loggedIn = false;
            this.username = "";
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Method to check login status
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the logged-in username
    public String getUsername() {
        return username;
    }
}

// Banking operations class using UserSession Singleton
class BankingOperations {
    private double balance;

    public BankingOperations() {
        balance = 1000.0; // Initial balance
    }

    // View balance
    public void viewBalance() {
        if (UserSession.getInstance().isLoggedIn()) {
            System.out.println("Balance for " + UserSession.getInstance().getUsername() + ": $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (UserSession.getInstance().isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}

// Main class to demonstrate the Singleton pattern in the banking process
public class BankingSystemSingletonExample {

    public static void main(String[] args) {
        // Get the UserSession singleton instance
        UserSession userSession = UserSession.getInstance();

        // Banking operations
        BankingOperations banking = new BankingOperations();

        // Trying to perform operations without login
        banking.viewBalance();
        banking.deposit(500);
        banking.withdraw(300);

        // Logging in the user
        userSession.login("JohnDoe");

        // Performing operations after login
        banking.viewBalance();
        banking.deposit(500);
        banking.withdraw(300);

        // Attempting to log in again (should prevent re-login)
        userSession.login("JohnDoe");

        // Logging out the user
        userSession.logout();

        // Trying operations after logout
        banking.viewBalance();
    }
}
