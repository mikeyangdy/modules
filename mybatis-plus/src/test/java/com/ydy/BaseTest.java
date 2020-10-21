package com.ydy;

import com.ydy.commons.entity.UserInfo;
import com.ydy.modules.user.mapper.UserInfoMapper;
import com.ydy.utils.WrapperUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatisPlusApp.class)
public class BaseTest {





    @Test
    public void ttt(){
        List<UserInfo> listOne = new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("admin");
        listOne.add(userInfo);

        List<UserInfo> listTwo = new ArrayList<>();
        BeanUtils.copyProperties(listOne,listTwo);

        listTwo.forEach(System.out::println);
    }

    @Test
    public void t123(){
        WrapperUtil.class.getClassLoader().getResource("/").getPath();
    }
}
