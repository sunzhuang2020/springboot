package com.offcn.controller;

import com.offcn.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private List<User> userList =new ArrayList<>();

    @PostMapping("/")
    public List<User> add(@RequestBody User user){
        userList.add(user);
        return userList;
    }
    @GetMapping("/")
    public List<User> findAll(){
        return userList;
    }

    @ApiOperation(value="新增用户", notes="新增用户信息")
    @ApiImplicitParam(name = "user", value = "用户信息实体user", required = true, dataType = "User")
    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Long id){
        for (User user : userList) {
            if (user.getId().longValue()==id.longValue()){
               return user;
            }
        }
        return null;
    }

    @PutMapping("/")
    public User update(@RequestBody User user){
        for (User temp : userList) {
            if (temp.getId().longValue()==user.getId().longValue()){
                temp.setName(user.getName());
                temp.setAge(user.getAge());
                return user;

            }
        }
              return null;
    }
    @ApiOperation(value="用户信息", notes="根据id删除用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "User")
    @DeleteMapping("/{id}")
    public User delete(@PathVariable("id") Long id){
        for (User user : userList) {
            if (user.getId().longValue()==id.longValue()){
                userList.remove(user);
                return user;
            }
        }
        return null;
    }
}
