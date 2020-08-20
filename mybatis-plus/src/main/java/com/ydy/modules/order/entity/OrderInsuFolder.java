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
@TableName("ORDER_INSU_FOLDER")
public class OrderInsuFolder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("BIZ_ORDER_ID")
    private String bizOrderId;

    @TableField("ORIF_PROPOSAL_NO")
    private String orifProposalNo;

    @TableField("ORIF_POLICY_NO")
    private String orifPolicyNo;


}
