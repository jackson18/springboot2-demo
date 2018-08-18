package com.qijiabin.dao;

import com.qijiabin.entity.User;

import java.util.List;

/**
 * ========================================================
 * 日 期：2018/8/18 21:44
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：
 * ========================================================
 * 修订日期     修订人    描述
 */
public interface UserDao {

    int insert(User record);

    List<User> selectUsers();

}
