package com.light.member.service.sys.impl;

import com.light.member.dao.SysUserDao;
import com.light.member.entity.sys.SysUser;
import com.light.member.service.sys.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> listUsers() {
        return this.sysUserDao.listUsers();
    }
}
