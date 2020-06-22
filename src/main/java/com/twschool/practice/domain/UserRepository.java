package com.twschool.practice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserRepository {

    @Autowired
    private GameRepository gameRepository;
    private List<UserInfo> userList = new ArrayList<>();

    public UserInfo create(String userId) {
        UserInfo user = new UserInfo(userId);
        user.setGame(gameRepository.create());
        userList.add(user);
        return user;
    }

    public UserInfo find(String userId) {
        for (UserInfo user: userList) {
            if (user.getUserId()==userId){
                return user;
            }
        }
        return create(userId);
    }
}
