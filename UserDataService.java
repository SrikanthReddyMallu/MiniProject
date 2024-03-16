package com.example.MiniProject.Service;

import com.example.MiniProject.Entity.UserData;

import java.util.List;

public interface UserDataService
{
    public UserData saveUserData(UserData userData);

    public List<UserData> findAll();


}
