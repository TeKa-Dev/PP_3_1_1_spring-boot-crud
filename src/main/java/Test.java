import com.example.springbootcrud.entity.User;
import com.example.springbootcrud.service.UserServiceImpl;

public class Test {
    public static void mai(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setId(1L);
        user1.setFirstname("user");
        user1.setLastname("use");
        user1.setAge(10);
        user1.setEmail("user.mail");

        user2.setId(1L);
        user2.setFirstname("user");
        user2.setLastname("use");
        user2.setAge(10);
        user2.setEmail("user.mail");

//        System.out.println(user1.equals(user2));
//        System.out.println(user1.hashCode() == user2.hashCode());
//        System.out.println(user1);
//        System.out.println(user2);

//        UserServiceImpl service = new UserServiceImpl();
//        System.out.println(service.findUser(1L));
    }

}
