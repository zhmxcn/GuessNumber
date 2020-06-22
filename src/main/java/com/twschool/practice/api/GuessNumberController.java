package com.twschool.practice.api;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.service.GuessNumberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GuessNumberController {

    @PostMapping("/games/guess-numbers")
    public Map<String, String> guess(@RequestBody Map<String, String> requestBody) {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("input", requestBody.get("number"));
        GuessNumberService guessNumberService = new GuessNumberService();
        responseBody.put("result", guessNumberService.guess(requestBody.get("number")));

        return responseBody;
    }
}