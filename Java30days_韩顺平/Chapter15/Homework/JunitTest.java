package Java30days_韩顺平.Chapter15.Homework;

import org.junit.jupiter.api.Test;

import java.util.List;

public class JunitTest {
    public static void main(String[] args) {
    }
    @Test
    public void testList(){
        User user1 = new User(1,30,"jelly");
        User user2 = new User(2,25,"marry");
        User user3 = new User(3,45,"amy");
        DAO<User> userDAO = new DAO<User>();
        userDAO.save("1",user1);
        userDAO.save("2",user2);
        userDAO.save("3",user3);


        userDAO.update("3",new User(3,23,"milan"));
        List<User> list = userDAO.list();
        System.out.println(list);
        System.out.println(userDAO.get("2"));



    }



}
