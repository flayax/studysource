package com.gupao.vip.mic.dubbo.user;

import com.gupao.vip.mic.dubbo.user.dto.DebitRequest;
import com.gupao.vip.mic.dubbo.user.dto.DebitResponse;
import com.gupao.vip.mic.dubbo.user.dto.UserLoginRequest;
import com.gupao.vip.mic.dubbo.user.dto.UserLoginResponse;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public interface IUserService {

    /**
     * 登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);

    /*
     * 更新用户余额
     */
    DebitResponse debit(DebitRequest request);
}
