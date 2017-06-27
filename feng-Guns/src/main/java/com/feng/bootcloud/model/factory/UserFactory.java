package com.feng.bootcloud.model.factory;

import org.springframework.beans.BeanUtils;

import com.feng.bootcloud.common.persistence.model.User;
import com.feng.bootcloud.model.transfer.UserDto;

/**
 * 用户创建工厂
 *
 * @author fengshuonan
 * @date 2017-05-05 22:43
 */
public class UserFactory {

    public static User createUser(UserDto userDto){
        if(userDto == null){
            return null;
        }else{
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            return user;
        }
    }
}
