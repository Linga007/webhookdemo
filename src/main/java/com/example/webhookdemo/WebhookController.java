package com.example.webhookdemo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

//    @PostMapping // http://localhost:8080/api/webhook
//    public ResponseEntity<String> print(@RequestBody String requestBody) {
//        System.out.println("###### Webhook #####" + requestBody);
//        return new ResponseEntity<String >(requestBody, HttpStatus.OK);
//    }

    @RequestMapping(value="/welcome",method= RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }

    @RequestMapping(value="/webhook",method= RequestMethod.GET)
    public String web(@RequestParam String name, @RequestParam Long age){

        return "welcome to webhook My Name is"+name+".I am "+age+"year's old";
    }
    @RequestMapping(value="/webhook",method= RequestMethod.POST)
    public String web1(@RequestParam String name,@RequestParam Long age){

        return "welcome to webhook My Name is"+name+".I am "+age+"year's old";
    }


}
