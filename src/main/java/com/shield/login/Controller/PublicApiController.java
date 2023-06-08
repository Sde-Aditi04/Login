package com.shield.login.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloPublic() {

        return ResponseEntity.ok("Hello from Public API!");
    }
}

