package edu.escuelaing.ieti.app.persistence;

import edu.escuelaing.ieti.app.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserPersistenceImpl implements UserPersistence{

    private ArrayList<User> users;

    public UserPersistenceImpl() {
        this.users = new ArrayList<>();
        User user1= new User( "1", "daniela@gmail.com", "hola123", "Daniela");
        User user2= new User( "2", "angie@gmail.com", "hola123", "Angie");
        User user3= new User( "3", "oscar@gmail.com", "hola123", "Oscar");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public List<User> getAll() {
        System.out.println(users.toString());
        return users;
    }

    @Override
    public User getById(String userId) {
        User answer = users.stream().filter(u -> userId.equals(u.getId())).findFirst().orElse(null);
        return answer;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        User newUser = getById(user.getId());
        if (user.getEmail()!= null) newUser.setEmail(user.getEmail());
        if (user.getName()!= null) newUser.setName(user.getName());
        if (user.getPassword()!= null) newUser.setPassword(user.getPassword());
        return newUser;
    }

    @Override
    public void remove(String userId) {
        users.removeIf(u -> userId.equals(u.getId()));
    }
}
