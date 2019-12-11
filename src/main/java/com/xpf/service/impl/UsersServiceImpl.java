package com.xpf.service.impl;

import com.xpf.dao.UsersMapper;
import com.xpf.entity.Users;
import com.xpf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 查询所有用户的名字
     * @return
     */
    @Override
    public List<String> getAllUsersName() {
        return usersMapper.selectAllUsersName();
    }


    /**
     * 添加用户
     * 用户名不能重复
     */
    @Override
    public Boolean addUsers(Users users) {
        if (!nameIsRepeat(users.getName())){
            usersMapper.insert(users);
            return true;
        }
        return false;
    }

    /**
     *查询是否重名
     */
    @Override
    public Boolean checkUser(String name) {
        Users users = usersMapper.findByName(name);
        if (users != null){//有此用户
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Users userLogin(String name, String password) {
        //根据用户名查询此用户
        Users users = usersMapper.findUser(name,password);
        if (users != null){
            return users;
        }else {
            return null;
        }
    }

    /**
     * 通过id删除用户
     * @param id
     */
    @Override
    public Boolean deleteUsersById(Integer id) {
        if(usersMapper.deleteByPrimaryKey(id) == 1) return true;
        return false;
    }

    //判断用户名是否重复
    public Boolean nameIsRepeat(String name){
        List<String> nameList = this.getAllUsersName();
        for (String n : nameList) {
            if (n.equals(name)) return true;
        }
        return false;
    }
}
