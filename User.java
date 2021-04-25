package uml_arqui;

abstract class User {
    String userId = "";
    String password = "";
    String loginStatus = "";

    public User(String userId, String password, String loginStatus){
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
    }

    public abstract boolean verifyLogin();
}

