package com.hendisantika.springbootsweetalert2.controller;

import com.hendisantika.springbootsweetalert2.entity.EmailContainer;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-sweetalert2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/11/20
 * Time: 11.42
 */
@RestController
@RequestMapping("email")
public class EmailRestController {

    @PostMapping
    public ResponseEntity<String> validateEmail(EmailContainer emailContainer) {
        String email = emailContainer.getEmail();
        boolean valid = EmailValidator.getInstance()
                .isValid(email);
        return valid ? ResponseEntity.ok(email) : ResponseEntity.badRequest()
                .body(email);
    }
}
