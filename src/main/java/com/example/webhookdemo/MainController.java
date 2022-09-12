package com.example.webhookdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class MainController {



    @PostMapping("/webhook")
    public ResponseEntity<String> postjsonObject(@RequestBody String Object){
        System.out.println("============"+Object);
        return new ResponseEntity<String>(Object, HttpStatus.OK);

    }
    @GetMapping("/webhook")
    public ResponseEntity<String> getjsonObject(@RequestBody String Object) {
        System.out.println("============" + Object);
        return new ResponseEntity<String>(Object, HttpStatus.OK);

    }




//

}
