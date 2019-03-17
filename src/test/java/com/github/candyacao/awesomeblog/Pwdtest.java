package com.github.candyacao.awesomeblog;

import com.github.candyacao.awesomeblog.model.Vo.UserVo;
import com.github.candyacao.awesomeblog.utils.TaleUtils;

public class Pwdtest {
    public static void main(String args[]){
        UserVo user = new UserVo();
        user.setUsername("admin");
        user.setPassword("J9lew2irojE23");
        String encodePwd = TaleUtils.MD5encode(user.getUsername() + user.getPassword());
        System.out.println(encodePwd);
    }
}
