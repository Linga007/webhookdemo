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
    public String web(@RequestParam String  hubmode, @RequestParam String  hubchallenge,@RequestParam String hubverifytoken){

        return "welcome to webhook "+hubmode+" "+hubchallenge+" "+ hubverifytoken+" ";
    }
//    @RequestMapping(value="/webhook",method= RequestMethod.POST)
//    public String web1(@RequestParam String  hub.mode, @RequestParam String  hub.challenge,@RequestParam hub.verify_token){
//
//        return "welcome to webhook My Name is"+hub.mode+" "+hub.challenge+" "+ hub.verify_token+"";
//    }


}
