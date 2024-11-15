package com.daocao.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("ums_menu")
public class UmsMenu implements Serializable {
    @TableId
    private Long id;
    private Long parentId;
    private String menuName;
    private String path;
    private String componentPath;
    private String perms;
    private String icon;
    private Integer menuType;
    private Integer sort;
    private Integer status;

    private String creator;
    private String updater;
    private String createTime;
    private String updateTime;
    private String remark;
    @TableLogic
    private Integer deleted;
}
