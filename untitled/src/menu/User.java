package menu;

import java.math.BigDecimal;

public class User {

    private String name;

    private String lastname;

    private Integer age;

    private String username;

    private String password;

    private BigDecimal money;

    public User(String name, String lastname, Integer age, String username, String password, BigDecimal money) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
