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
@TableName("ORDER_INSURED")
public class OrderInsured implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_INSURED_ID")
    private String orInsuredId;

    @TableField("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("ORI_INSURED_TYPE")
    private String oriInsuredType;

    @TableField("ORI_CERTF_CLS")
    private String oriCertfCls;

    @TableField("ORI_CERTF_CDE")
    private String oriCertfCde;

    @TableField("ORI_MOBILE")
    private String oriMobile;


}
