class User {
    private final int id;   // final: khong the thay doi sau khi tao

    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equalsIgnoreCase(password);
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", username=" + username + "]";
    }
}

class UserManager {
    static User[] users = new User[10];
    static int count = 0;

    public static void addUser(User user) {
        if (count < users.length) {
            users[count] = user;
            count++;
            System.out.println("Them thanh cong user: " + user.getUsername());
        } else {
            System.out.println("Danh sach user da day");
        }
    }

    public static boolean checkLogin(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equalsIgnoreCase(username)
                    && users[i].checkPassword(password)) {
                return true;
            }
        }
        return false;
    }

    public static void showAllUsers() {
        System.out.println("Danh sach nguoi dung:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + users[i]);
        }
    }
}

public class B6 {
    public static void main(String[] args) {

        User u1 = new User(1, "hieu", "123456");
        User u2 = new User(2, "admin", "admin123");
        User u3 = new User(3, "student", "sv2024");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("\nDa them 3 user");
        UserManager.showAllUsers();

        System.out.println("\nKiem tra dang nhap:");
        System.out.println("Login (hieu, 123456): "
                + (UserManager.checkLogin("hieu", "123456") ? "Thanh cong" : "That bai"));
        System.out.println("Login (student, 123): "
                + (UserManager.checkLogin("student", "123") ? "Thanh cong" : "That bai"));
    }
}
