package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();

        userService.createUsersTable();

        userService.saveUser("Maxim", "Kulikov", (byte)32);
        userService.saveUser("Artem", "Popov", (byte)45);
        userService.saveUser("Roman", "Kulikov", (byte)30);
        userService.saveUser("Vladislav", "Savelyev", (byte)33);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
