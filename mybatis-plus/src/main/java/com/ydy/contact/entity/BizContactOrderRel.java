package com.ydy.contact.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("BIZ_CONTACT_ORDER_REL")
public class BizContactOrderRel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BIZ_CO_REL_ID")
    private String bizCoRelId;

    @TableField("BIZ_CONTACT_APP_ID")
    private String bizContactAppId;

    @TableField("ORDER_NO")
    private String orderNo;


}
