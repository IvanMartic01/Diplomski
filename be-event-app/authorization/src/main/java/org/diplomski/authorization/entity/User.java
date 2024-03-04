package org.diplomski.authorization.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.diplomski.authorization.constants.Role;

@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@Entity
public abstract class User {

    @Id
    private long id;
    private String email;
    private String password;

    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private Role role;

}
