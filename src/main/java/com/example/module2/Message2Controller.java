package com.example.module2;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public class Message2Controller {

        @RequestMapping("/message2")
        public String getMessage(@RequestHeader(name = "RequestHeader2", required = false) String header2) {
            System.out.printf("Başlık 2: " + header2);
            return "Kiplem 2";
        }
}
