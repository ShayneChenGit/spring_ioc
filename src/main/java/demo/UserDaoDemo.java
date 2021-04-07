package demo;

import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = app.getBean(UserDao.class);

        UserDao userDao = (UserDao) app.getBean("userDao3");


        userDao.save();
    }
}
