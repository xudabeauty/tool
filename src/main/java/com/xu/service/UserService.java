package com.xu.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.xu.dao.UserMapper;
import com.xu.model.ResultMsg;
import com.xu.model.User;

@Service("userService")
public class UserService {
    @Resource 
    UserMapper userMapper;
    public ResultMsg loginValidate(User user){
        if(user!=null&&user.getName()!=null&&user.getPassword()!=null){
           List<User> list = userMapper.selectByNameAndPass(user);
           if(CollectionUtils.isNotEmpty(list)){
               return new ResultMsg(true,"操作成功",list.get(0));
           }
        } 
        return new ResultMsg(false,"操作失败",null);
    }
}
