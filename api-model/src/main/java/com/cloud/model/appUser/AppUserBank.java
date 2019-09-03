package com.cloud.model.appUser;

import lombok.Data;

import java.util.Date;

@Data
public class AppUserBank {

    /**
     * 主键ID
     */
    Integer  id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 账户名称(开户名)
     */
    private String accountName;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行账号
     */
    private String bankAccount;
    /**
     * ifsc码
     */
    private String ifscCode;
    /**
     * 绑卡状态
     * 0:未使用 1:已使用(已放款入账号)
     */
    private int status;
    //绑定时间
    private Date bindingTime;
}
