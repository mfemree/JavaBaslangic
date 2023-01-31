package Gun31._02_Enum_FarkliYontem;

public class User {

    String username;
    Role role;
    Statu statu;

    public User (String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }

    public static void UserSil ( User user ){

        if ( user.role == Role.ADMIN )
            System.out.println(user.username + " Admin silinemez");
    }
}
