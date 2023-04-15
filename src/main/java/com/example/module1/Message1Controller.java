package com.example.module1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public class Message1Controller {

        @RequestMapping("/message1")
        public String getMessage() {
            return "Kiplem 1";
        }
}
