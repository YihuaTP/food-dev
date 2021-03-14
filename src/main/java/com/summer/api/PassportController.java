package com.summer.api;


import com.summer.bo.UserBO;
import com.summer.model.Users;
import com.summer.service.UserService;
import com.summer.utils.JsonResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("passport")
public class PassportController {

    private final UserService userService;

    public PassportController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 判断用户名是否已经被注册
     *
     * @param userName
     * @return
     */
    @GetMapping("usernameIsExit")
    @Transactional(propagation = Propagation.REQUIRED)
    public JsonResult usernameIsExit(@RequestParam String userName) {

        // 判断用户名是否为空
        if (StringUtils.isBlank(userName)) {
            return JsonResult.errorMsg("用户名不能为空");
        }


        boolean isExit = userService.queryUserNameIsExit(userName);

        if (isExit) {
            return JsonResult.errorMsg("用户名已经存在");
        }

        return JsonResult.ok();
    }


    /**
     * 用户注册
     *
     * @param userBO
     * @return
     */
    @PostMapping("register")
    @Transactional(propagation = Propagation.REQUIRED)
    public JsonResult register(@RequestBody UserBO userBO) {

        String password = userBO.getPassword();
        String userName = userBO.getUserName();
        String confirmPassword = userBO.getConfirmPassword();

        // 1.判断用户名&密码&确认密码是否为空
        if (userName.equals("")) {
            return JsonResult.errorMsg("用户名不能为空");
        }

        if (password.equals("")) {
            return JsonResult.errorMsg("密码不能为空");
        }

        if (confirmPassword.equals("")) {
            return JsonResult.errorMsg("确认密码不能为空");
        }


        // 2.判断用户名是否被使用
        boolean isExit = userService.queryUserNameIsExit(userName);

        if (isExit) {
            return JsonResult.errorMsg("用户名已经存在");
        }

        // 3.判断密码长度是否大于6
        if (password.length() < 6) {
            return JsonResult.errorMsg("密码长度低，具有安全隐患");
        }

        // 4.判断两次输入密码是否相等
        if (!password.equals(confirmPassword)) {
            return JsonResult.errorMsg("两次输入的密码不相等");
        }

        // 5.实现注册
        Users user = userService.register(userBO);

        return JsonResult.ok(user);
    }
}


