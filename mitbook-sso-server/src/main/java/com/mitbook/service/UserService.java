package com.mitbook.service;
import com.mitbook.core.model.UserInfo;
import com.mitbook.core.result.ReturnT;
/**
 * @author pengzhengfa
 */
public interface UserService {

    public ReturnT<UserInfo> findUser(String username, String password);

}
