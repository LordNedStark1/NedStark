package repo;

import model.User;

public interface UserRepository {
        int saveUser(User person);

        int countUsers();

        User findById(int id);

    }



