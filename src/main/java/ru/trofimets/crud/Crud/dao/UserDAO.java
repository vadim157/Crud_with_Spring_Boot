package ru.trofimets.crud.Crud.dao;

import ru.trofimets.crud.Crud.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User show(int id);

    void save(User user);

    void update(int id, User user);

    void delete(int id);
}
