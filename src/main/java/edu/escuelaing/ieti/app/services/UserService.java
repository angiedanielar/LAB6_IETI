package edu.escuelaing.ieti.app.services;

import edu.escuelaing.ieti.app.model.User;
import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
