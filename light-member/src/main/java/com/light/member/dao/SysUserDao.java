package com.light.member.dao;

import com.light.member.entity.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserDao {

    List<SysUser> listUsers();

}