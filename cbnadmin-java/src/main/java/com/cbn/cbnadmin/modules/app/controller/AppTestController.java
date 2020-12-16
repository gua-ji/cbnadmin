 package com.cbn.cbnadmin.modules.app.controller;


import com.cbn.cbnadmin.modules.app.annotation.Login;
import com.cbn.cbnadmin.common.utils.R;
import com.cbn.cbnadmin.modules.app.annotation.LoginUser;
import com.cbn.cbnadmin.modules.app.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP测试接口
 *

 */
@RestController
@RequestMapping("/app")
public class AppTestController {

    @Login
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    @Login
    @GetMapping("userId")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

}
