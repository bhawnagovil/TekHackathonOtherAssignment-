package Day2JavaAssignment;
/*Create the student class with id name phonenumber country
        create constructors
        read the data from user
        store 5 student object
        and print the details in the */
public class Student {
        private int id;
        private String name;
        private String phoneNumber;
        private String country;

        public Student(int id, String name, String phoneNumber, String country) {
            this.id = id;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.country = country;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getCountry() {
            return country;
        }

    }


