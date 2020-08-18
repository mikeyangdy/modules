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
@TableName("ORDER_INSU_TAX")
public class OrderInsuTax implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_INSU_TAX_ID")
    private String orInsuTaxId;

    @TableField("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("ORIT_TAX_FLAG")
    private String oritTaxFlag;

    @TableField("ORIT_TAXPAYER")
    private String oritTaxpayer;

    @TableField("ORIT_TAX_CERTIFICATE")
    private String oritTaxCertificate;

    @TableField("ORIT_TAX_CERTIFICATENO")
    private String oritTaxCertificateno;

    @TableField("ORIT_TAX_SUM")
    private Float oritTaxSum;


}
