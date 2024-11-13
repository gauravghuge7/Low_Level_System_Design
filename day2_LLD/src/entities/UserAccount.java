package entities;

public class UserAccount {

    public String username;
    public String password;

    private UserAccount(UserAccountBuilder builder) {

        this.username = builder.username.toLowerCase();
        this.password = builder.password;
    }


    /*
     *
     */



    /**
     *   this is the user account builder class
     *
     */


    public static class UserAccountBuilder {

        private final String username;
        private final String password;

        public  UserAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public UserAccount build() {
            return new UserAccount(this);
        }
    }
}
