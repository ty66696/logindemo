package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.dto.LoginFormDTO;
import com.demo.dto.Result;
import com.demo.entity.User;

import javax.servlet.http.HttpSession;

public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
