package tech.haonan.server.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.haonan.server.entity.Admin;
import tech.haonan.server.entity.AdminLoginParam;
import tech.haonan.server.entity.CommonResponse;
import tech.haonan.server.service.impl.IAdminService;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.security.Principal;

@Api(tags = "登录接口")
@RestController
public class LoginController {


    @Autowired
    private IAdminService adminService;

    @ApiOperation(value = "登录获取token")
    @PostMapping("/login")
    public CommonResponse login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public CommonResponse logout(){
        return CommonResponse.success("注销成功");
    }

    @ApiOperation("获取用户信息")
    @GetMapping("/admin/info")
    public CommonResponse getAdminInfo(Principal principal){
        if (principal==null) {
            return null;
        }
        String username = principal.getName();
        Admin admin =  adminService.getAdminByUsername(username);
        admin.setPassword(null);
        return CommonResponse.success("获取用户信息成功",admin);

    }

}
