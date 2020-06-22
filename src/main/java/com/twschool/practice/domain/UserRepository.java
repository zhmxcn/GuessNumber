package com.twschool.practice.domain;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<UserInfo> userList = new ArrayList<>();

    public UserInfo create(String userId) {
        UserInfo user = new UserInfo(userId);
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
