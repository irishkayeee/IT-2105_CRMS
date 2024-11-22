package GUI;

/**
 * Manages the user session in the application.
 * 
 * @author prince dran
 */
public class SessionManager {
    // Store the current user (e.g., username or user ID)
    private static String currentUser = null;

    /**
     * Set the current logged-in user.
     * 
     * @param user The username or ID of the logged-in user.
     */
    public static void setCurrentUser(String user) {
        currentUser = user;
    }

    /**
     * Get the current logged-in user.
     * 
     * @return The username or ID of the logged-in user, or null if no user is logged in.
     */
    public static String getCurrentUser() {
        return currentUser;
    }

    /**
     * Clear the current session by removing the logged-in user.
     */
    public static void clearSession() {
        currentUser = null;
    }

    /**
     * Check if a user is currently logged in.
     * 
     * @return True if a user is logged in; otherwise, false.
     */
    public static boolean isLoggedIn() {
        return currentUser != null;
    }
}

