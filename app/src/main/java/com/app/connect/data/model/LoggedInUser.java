package com.app.connect.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private int userAge;

    public LoggedInUser(String userId, String displayName, int userAge) {
        this.userId = userId;
        this.displayName = displayName;
        this.userAge = userAge;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getUserAge() { return userAge; }

    public void setUserAge(int age) {
        this.userAge = age;
    }
}