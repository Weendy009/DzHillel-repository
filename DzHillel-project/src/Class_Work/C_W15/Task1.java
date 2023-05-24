package Class_Work.C_W15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Matvey"));
        users.add(new User(2, "Inna"));
        users.add(new User(3, "Oleg"));
        users.add(new User(4, "Ivan"));
        users.add(new User(5, "Donald"));

        System.out.println(users);
//        Collections.sort(users, new User());
        System.out.println(users);
    }

    private static class User implements Comparable<User> {
        private Integer id;
        private String name;

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public User() {
        }

        @Override
        public int compareTo(User other) {
            return this.id.compareTo(other.id);
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}' + "\n";
        }
    }
}
