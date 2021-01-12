package com.light.member.controller.sys;

import com.light.member.entity.sys.SysUser;
import com.light.member.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/listUsers")
    public List<SysUser> listUsers() {
        return sysUserService.listUsers();
    }

}
