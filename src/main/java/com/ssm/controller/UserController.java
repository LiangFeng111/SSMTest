package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/u")
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public JSONObject findALl(){
        List<User> users = userService.findAll();
        System.out.println(users.toString());
        JSONObject js= new JSONObject();
        js.put("msg","success");
        js.put("code","0");
        js.put("data",users);
        return js;
    }

    @RequestMapping(value = "/findByName" ,method = RequestMethod.GET)
    @ResponseBody
    public JSONObject findByName(String name){
        JSONObject js = new JSONObject();
        List<User> list = userService.findByName(name);
        System.out.println(list.size());
        js.put("code","0");
        js.put("data",list);
        return js;
    }
}
