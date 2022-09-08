package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

    public static final List<User> userList = new ArrayList<>();

    public static void main(String[] args) {

        boolean value = true;
        do {
            Menu menu = new Menu();
            menu.createMenu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            MenuOption item = menu.convert(option);
            switch (item) {
                case REGISTER -> {
                    System.out.println("Register");
                }
                case LOGIN -> {
                    System.out.println("Login");
                }
                case SHOW -> {
                }
                case ADD -> {
                    System.out.println("Add user");
                }
                case ERROR -> {
                    System.out.println("Incorrect option, try again");
                }
                case QUIT -> {
                    System.out.println("Exit");
                    value = false;
                }
            }
        } while (value);

    }
}
