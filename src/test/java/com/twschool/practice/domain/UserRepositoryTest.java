package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class UserRepositoryTest {
    @Test
    public void should_return_same_when_guess_game_create_and_find(){
        //given
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        UserInfo user = userRepository.create("1");

        //when
        UserInfo user1 = userRepository.find("1");
        //then
        Assert.assertEquals(user,user1);
    }
}