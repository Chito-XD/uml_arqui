package uml_arqui;

public class Administrator extends User {
    private String adminName;
    private String email;

    public Administrator(String userId, String password, String loginStatus, String adminName, String email){
        super(userId, password, loginStatus);
        this.adminName = adminName;
        this.email = email;
    }

    public boolean updateCatalog(){
        return true;
    }

    @Override
    public boolean verifyLogin() {
        return true;
    }
}
