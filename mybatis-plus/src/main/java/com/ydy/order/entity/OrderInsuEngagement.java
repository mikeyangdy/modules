package com.ydy.order.entity;

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
@TableName("ORDER_INSU_ENGAGEMENT")
public class OrderInsuEngagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_INSU_ENGAGEMENT_ID")
    private String orInsuEngagementId;

    @TableField("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("ORIE_CODE")
    private String orieCode;

    @TableField("ORIE_CONTENT")
    private String orieContent;


}
