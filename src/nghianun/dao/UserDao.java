package nghianun.dao;

import nghianun.model.Login;
import nghianun.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1= new User();
        u1.setAge(10);
        u1.setName("nghia");
        u1.setAccount("nghia-nun");
        u1.setEmail("nghia.lahm123@gmail.com");
        u1.setPassword("123");
        users.add(u1);

    }

    public static User checkLogin(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount())
                &&u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
