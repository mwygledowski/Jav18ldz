package pl.sda.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserEntity {

    private String login;

    private String password;

    private String name;

    private String surname;

    private String email;
}
