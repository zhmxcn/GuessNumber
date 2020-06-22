package com.twschool.practice.api;

import com.twschool.practice.domain.UserInfo;
import com.twschool.practice.service.GuessNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GuessNumberController {

    @Autowired
    private GuessNumberService guessNumberService;

    @PostMapping("/games/guess-numbers")
    public Map<String, String> guess(@RequestBody Map<String, String> requestBody) {
        Map<String, String> responseBody = new HashMap<>();
        UserInfo user = guessNumberService.login(requestBody.get("userId"));
        responseBody.put("input", requestBody.get("number"));
        responseBody.put("result", guessNumberService.guess(requestBody.get("number")));
        responseBody.put("rate",guessNumberService.getRate());
        responseBody.put("status",guessNumberService.getStatus());
        return responseBody;
    }
}
