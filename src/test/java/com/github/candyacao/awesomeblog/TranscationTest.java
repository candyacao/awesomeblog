package com.github.candyacao.awesomeblog;

import com.github.candyacao.awesomeblog.exception.TipException;
import com.github.candyacao.awesomeblog.model.Vo.UserVo;
import com.github.candyacao.awesomeblog.service.IUserService;
import com.github.candyacao.awesomeblog.service.IOptionService;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 测试数据库事务
 */
@MapperScan("com.github.candyacao.awesomeblog.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional(rollbackFor = TipException.class)
public class TranscationTest {

    @Resource
    private IUserService userService;

    @Resource
    private IOptionService optionService;

    @org.junit.Test
    @Ignore
    public void test() {
        UserVo user = new UserVo();
        user.setUsername("wangqiang111");
        user.setPassword("123456");
        user.setEmail("8888");
        userService.insertUser(user);
        optionService.insertOption("site_keywords", "qwqwq");
    }
}
