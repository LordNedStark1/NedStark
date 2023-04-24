package repo;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class Repository implements UserRepository{


        private int count;
        List<User> allUsers = new ArrayList<>();

        @Override
        public int saveUser(User user) {
            boolean savedUser = user.getId() != 0;
            if (savedUser) update(user);

            else saveNewUser(user);
            return user.getId();
        }
        private void saveNewUser(User user) {
            int id = generateId();
            user.setId(id);
            allUsers.add(user);
//        count++;
        }

        private void update(User user) {
            User savedUser = findById(user.getId());
            int indexOfSavedUser = allUsers.indexOf(savedUser);
            allUsers.set(indexOfSavedUser, user);
//                     OR
//        allUsers.remove(savedUser);
//        allUsers.add(user);
        }

        private int generateId(){
            count++;
            return count;
        }

        @Override
        public int countUsers() {
            return allUsers.size();
        }

        @Override
        public User findById(int id) {
            for (User user: allUsers) {
                if (user.getId() == id){
                    return user;
                }
            }
            return null;
        }


        @Override
        public String toString() {
            return "UserRepositoryImpl{" +
                    "count=" + count +
                    ", allUsers=" + allUsers +
                    '}';
        }
    }



