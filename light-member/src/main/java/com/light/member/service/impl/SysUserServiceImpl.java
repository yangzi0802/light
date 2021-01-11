package com.light.member.service.impl;

import com.light.member.dao.SysUserDao;
import com.light.member.entity.SysUser;
import com.light.member.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUser> listUsers() {
        return sysUserDao.listUsers();
    }
}
