package menu;

import java.util.Arrays;
import java.util.Objects;

public class Menu {

    public void createMenu() {
        System.out.println("1.Register user");
        System.out.println("2.Login");
        System.out.println("3.Add user");
        System.out.println("4.Show all users");
        System.out.println("5.Quit");
    }

    public MenuOption convert(Integer integer) {
        return Arrays.stream(MenuOption.values())
                .filter(m -> Objects.equals(m.getValue(), integer))
                .findFirst().orElse(MenuOption.ERROR);
    }

}
