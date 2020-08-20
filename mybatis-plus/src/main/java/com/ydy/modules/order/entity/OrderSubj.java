package com.ydy.modules.order.entity;

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
 * @since 2020-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ORDER_SUBJ")
public class OrderSubj implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_SUBJ_ID")
    private String orSubjId;

    @TableField("BIZ_ORDER_ID")
    private String bizOrderId;

    @TableField("OR_SUBJ_TYPE")
    private String orSubjType;

    @TableField("OR_SUBJ_TYPE_NAME")
    private String orSubjTypeName;


}
