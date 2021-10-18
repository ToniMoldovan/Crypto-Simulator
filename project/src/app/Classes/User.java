package app.Classes;

public class User {
    final int USER_ID = 1;
    private int _initialUsdtAmount = 10000;
    public String userName = "";

    //Constructor
    public User(String name) {
        this.userName = name;
    }

    public String getUserName() {
        return "Username: " + this.userName;
    }
}
