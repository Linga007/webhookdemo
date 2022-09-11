package com.example.webhookdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/webhook")
public class MainController {
    @RequestMapping(value="data", method = RequestMethod.POST)
    public @ResponseBody WebhookDto getdata(@RequestBody WebhookDto webhookDto){
        webhookDto.setHubMode(webhookDto.getHubMode());
        webhookDto.setHubchallenge(webhookDto.getHubchallenge());
        webhookDto.setHubverify_token(webhookDto.getHubverify_token());
        return webhookDto;
    }
}
