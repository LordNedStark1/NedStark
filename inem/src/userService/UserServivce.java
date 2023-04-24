package userService;

import dto.SignUpRequest;
import model.User;
import repo.Repository;
import repo.UserRepository;

public class UserServivce {


        private final UserRepository person ;
        public UserServivce(UserRepository person) {
            this.person = person;
        }


        public int signUp(SignUpRequest signUpDetails) {
            User user = new User();
            user.setEmail(signUpDetails.getEmail());
            user.setPassword(signUpDetails.getPassword());

            return person.saveUser(user);
        }

//        public int signUpNed(SignUpRequest signUpDetails) {
//            User user = new User();
//            user.setEmail(signUpDetails.getEmail());
//            user.setPassword(signUpDetails.getPassword());
//
//            return person.saveUser(user);
//        }

        @Override
        public String toString() {
            return "UserServiceImpl{" +
                    "person=" + person +
                    '}';
        }


    }


