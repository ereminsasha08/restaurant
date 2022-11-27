package com.restorans.restorans.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User extends AbstractNamedEntity{


    String login;

    String password;

    String role;
}
