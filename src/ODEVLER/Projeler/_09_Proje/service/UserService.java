package ODEVLER.Projeler._09_Proje.service;

import ODEVLER.Projeler._09_Proje.entity.User;
import ODEVLER.Projeler._09_Proje.exception.UserNotFoundException;

import java.util.List;
import java.util.Scanner;

public interface UserService {  // CRUD

    List<User> getAllUser();

    User getUserById(int id) throws UserNotFoundException;

    User addUser();

    void deleteUserById(int id) throws UserNotFoundException;

    void updateUser(User user);
}
