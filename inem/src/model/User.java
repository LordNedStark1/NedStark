package model;

public class User {
        //    private UUID id;
        private int id;
        private String firstName;
        private String lastName;
        private String password;
        private String address;
        private String phoneNumber;
        private String email;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public UUID getId() {
//        return id;
//    }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


