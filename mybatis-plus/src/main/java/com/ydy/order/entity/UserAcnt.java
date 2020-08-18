package com.ydy.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户账号。
该账号是用户在本系统使用的账号信息。
在一个系统中，账号存在唯一性。
内
 * </p>
 *
 * @author ydy
 * @since 2020-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("USER_ACNT")
public class UserAcnt implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ACNT_ID")
    private String userAcntId;

    /**
     * 对全称的简称。
            例如：人民保险股份有限公司杭州市分公司第一营业部：省国际。
            在相同的公司维度下，用户可以使用该标志来快速查询或表示公司的名称。
     */
    @TableField("ABBR_NAME")
    private String abbrName;

    /**
     * 根据NAME的首字母，组合成名称的拼音。
            例如：人民财产保险股份有限公司：RMCCBXGFYXGS。
     */
    @TableField("PHONETIC")
    private String phonetic;

    /**
     * 根据简称的拼音组成的简称（昵称）的拼音。
            例如：省国际：shengguoji。
            使用全部的拼音，可以有效区分不同的昵称。
     */
    @TableField("ABBR_PHONETIC")
    private String abbrPhonetic;

    /**
     * 根据昵称拼音首字母组成的拼音。
            例如：省国际：SGJ。
            方便查询，但是重复率可能比较高。
     */
    @TableField("ABBR_PHONETIC_SHORT")
    private String abbrPhoneticShort;

    /**
     * 将代码导致以后形成的代码。
            可以让没有倒置检索的数据库建立索引。
            例如：浙A12345 倒置为 54321A浙。用户录入：12345，导致以后，按照"54321%"进行检索。
            
     */
    @TableField("INVERSE_CODE")
    private String inverseCode;

    /**
     * Y.有效
            N.无效
     */
    @TableField("VALID")
    private String valid;

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

    /**
     * 客观世界事务命名。
            例如：对车辆的命名为车牌号，人的名称为姓名等等。
     */
    @TableField("NAME")
    private String name;

    /**
     * 客观世界对事物的唯一编号。
            例如：人的编号为身份证，家轿的编号为十七码等。
            
     */
    @TableField("CODE")
    private String code;

    /**
     * 客观世界的代码经过规范后，便于查询和代码比照。
            例如：
            企业的组织编号打印格式为：712343-r。在国家网站上的查询是：712343R。去掉了助识符号“-”，大小写统一为大写。
            再如：车牌号为浙A·12345。规范化以后，改为：浙A12345。去掉了帮助识别的中点。
            
            规范代码在录入的时候，需要根据业务情况，进行特殊的格式化。便于规范查询和比对。
     */
    @TableField("STANDARD_CODE")
    private String standardCode;

    @TableField("UACNT_SYSTEM_CODE")
    private String uacntSystemCode;

    @TableField("UACNT_SYSTEM")
    private String uacntSystem;

    /**
     * 可用：Y
            不可用：N
     */
    @TableField("UACNT_STATE")
    private String uacntState;

    @TableField("UACNT_FLAG")
    private String uacntFlag;

    @TableField("UACNT_MOBILE")
    private String uacntMobile;


}
