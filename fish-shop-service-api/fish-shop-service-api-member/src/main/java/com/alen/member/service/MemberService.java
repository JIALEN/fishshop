package com.alen.member.service;

import com.alen.weixin.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员接口
 *
 * @author alen
 * @create 2019-09-13 17:27
 **/
public interface MemberService {

    @GetMapping("/memberInvokWeixin")
    public AppEntity memberInvokWeixin();

}