package org.diplomski.authorization.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
public class AuthController {

    @PostMapping("/login")
    public void login() {}

    @PostMapping("/register/visitor")
    public void registerVisitor() {}

    @PostMapping("/register/organizer")
    public void registerOrganizer() {}

    @PostMapping("/block/organizer")
    public void blockOrganize() {}
}
