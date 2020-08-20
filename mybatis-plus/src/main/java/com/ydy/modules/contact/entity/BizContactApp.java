package com.ydy.modules.contact.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author ydy
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("BIZ_CONTACT_APP")
public class BizContactApp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BIZ_CONTACT_APP_ID")
    private String bizContactAppId;

    @TableField("USER_ACNT_ID")
    private String userAcntId;

    @TableField("BIZ_TASK_NO")
    private String bizTaskNo;

    @TableField("DATE_CREATE")
    private LocalDateTime dateCreate;

    @TableField("DATE_MODIFY")
    private LocalDateTime dateModify;

    @TableField("DATE_DELETE")
    private LocalDateTime dateDelete;

    /**
     * 账号类型与账号形成唯一标识符，帮助准确定位用户。
     */
    @TableField("CREATE_ACCOUNT_TYPE")
    private String createAccountType;

    /**
     * 账号类型名称的标准代码
     */
    @TableField("CREATE_ACCOUNT_TYPE_CODE")
    private String createAccountTypeCode;

    /**
     * 产生者账号，用于记录产生该信息的时间，使用的具体账号。
     */
    @TableField("CREATOR_ACCOUNT")
    private String creatorAccount;

    /**
     * 产生者名称，是该账号对应的用户的简称名称。
     */
    @TableField("CREATOR_NAME")
    private String creatorName;

    /**
     * 组织账号类型与组织账号形成唯一标识符。准确定位组织。
     */
    @TableField("CREATOR_GROUP_ACNT_TYPE")
    private String creatorGroupAcntType;

    /**
     * 组织账号类型名称的标准代码
     */
    @TableField("CREATOR_GROUP_ACNT_TYPE_CODE")
    private String creatorGroupAcntTypeCode;

    /**
     * 产生记录时所在用户账号对应的组织账号。
     */
    @TableField("CREATOR_GROUP_ACCOUNT")
    private String creatorGroupAccount;

    /**
     * 产生记录时用户对应组织的名称。
     */
    @TableField("CREATOR_GROUP_NAME")
    private String creatorGroupName;

    /**
     * 非本人，组织其他人数据访问标志位。
            R：读。
            W：写。
            X：删（将删除单独划分出来，便于不受删除的破坏）。
            标识占三位，分为三组。
            第一组是针对创建者。第二组针对组织。第三组针对所有用户。
            例如：
            RWXRWXRWX

            由于权限不存在批量查询和过滤，所以无需索引。
     */
    @TableField("DATA_ACCESS_FLAG")
    private String dataAccessFlag;


}
