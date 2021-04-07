package dao.impl;

import dao.UserDao;
import lombok.Getter;
import lombok.Setter;
import pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
public class UserDaoImpl implements UserDao {

    private String username;

    private int age;

    private List<String> strList;

    private Map<String, User> userMap;

    private Properties properties;

    @Override
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");
    }
}
