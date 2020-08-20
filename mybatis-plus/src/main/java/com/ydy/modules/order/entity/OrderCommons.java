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
@TableName("ORDER_COMMONS")
public class OrderCommons implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_COMMONS_ID")
    private String orCommonsId;

    @TableField("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("ORC_COM_CODE")
    private String orcComCode;

    @TableField("ORC_HANDLER_CODE")
    private String orcHandlerCode;

    @TableField("ORC_HANDLER_NAME")
    private String orcHandlerName;

    @TableField("ORC_AGENT_CODE")
    private String orcAgentCode;

    @TableField("ORC_AGENT_NAME")
    private String orcAgentName;

    @TableField("ORC_BUSINESS_TYPE")
    private String orcBusinessType;

    @TableField("ORC_SERVICE_CODE")
    private String orcServiceCode;


}
