import java.util.ArrayList;

public class Main {

    // ===== MODEL: User =====
    static class User {
        public final int id;        // ID bat bien (final)
        public String username;
        public String password;

        public User(int id, String username, String password) {
            this.id = id;           // final bat buoc gan trong constructor
            this.username = username;
            this.password = password;
        }

        @Override
        public String toString() {
            return "User[id=" + id + ", name=" + username + "]";
        }
    }

    // ===== CONTROLLER: UserManager =====
    static class UserManager {

        // Danh sach user dung chung cho toan he thong
        public static ArrayList<User> users = new ArrayList<>();

        public static void addUser(User u) {
            users.add(u);
        }

        public static boolean checkLogin(String username, String password) {
            for (User u : users) {
                if (u.username.equals(username) &&
                    u.password.equals(password)) {
                    return true;
                }
            }
            return false;
        }
    }

    // ===== MAIN: Kiem thu he thong =====
    public static void main(String[] args) {

        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Da them 3 user vao he thong.");
        System.out.println("Danh sach hien tai:");
        int index = 1;
        for (User u : UserManager.users) {
            System.out.println(index++ + ". " + u);
        }

        System.out.println("\n>> Kiem tra dang nhap:");
        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (UserManager.checkLogin("dev_a", "123456")
                ? "Thanh cong!" : "That bai!"));

        System.out.println("- Login (\"dev_b\", \"sai_pass\"): "
                + (UserManager.checkLogin("dev_b", "sai_pass")
                ? "Thanh con
