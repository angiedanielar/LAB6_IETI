package edu.escuelaing.ieti.app.services;

import edu.escuelaing.ieti.app.model.User;
import edu.escuelaing.ieti.app.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserPersistence userPersistence;

    @Override
    public List<User> getAll() {
        return userPersistence.getAll();
    }

    @Override
    public User getById(String userId) {
        return userPersistence.getById(userId);
    }

    @Override
    public User create(User user) {
        return userPersistence.create(user);
    }

    @Override
    public User update(User user) {
        return userPersistence.update(user);
    }

    @Override
    public void remove(String userId) { userPersistence.remove(userId);}
}
