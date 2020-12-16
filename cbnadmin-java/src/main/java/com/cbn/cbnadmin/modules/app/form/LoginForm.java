package com.cbn.cbnadmin.modules.app.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录表单
 *
 */
@Data
public class LoginForm {
    @NotBlank(message="手机号不能为空")
    private String mobile;

    @NotBlank(message="密码不能为空")
    private String password;

}
