 package com.cbn.cbnadmin.modules.app.controller;


import com.cbn.cbnadmin.common.utils.R;
import com.cbn.cbnadmin.common.validator.ValidatorUtils;
import com.cbn.cbnadmin.modules.app.entity.UserEntity;
import com.cbn.cbnadmin.modules.app.form.RegisterForm;
import com.cbn.cbnadmin.modules.app.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册
 *

 */
@RestController
@RequestMapping("/app")
public class AppRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public R register(@RequestBody RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setCreateTime(new Date());
        userService.save(user);

        return R.ok();
    }
}
