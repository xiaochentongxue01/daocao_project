package com.daocao.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("ums_sys_user")
public class UmsSysUser implements Serializable {
    @TableId
    private Long id;
    private String username;
    private String nickname;
    private String email;
    private String mobile;
    private Integer sex;
    private String avater;
    private String password;
    private String status;
    private String creator;
    private String updater;
    private String createTime;
    private String updateTime;
    private String remark;
    // 逻辑删除, 0-未删除, 1-已删除
    @TableLogic
    private Integer deleted;

}
