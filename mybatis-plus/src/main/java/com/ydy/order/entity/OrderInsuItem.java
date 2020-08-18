package com.ydy.order.entity;

import java.math.BigDecimal;
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
@TableName("ORDER_INSU_ITEM")
public class OrderInsuItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ORDER_INSU_ITEM_ID")
    private String orderInsuItemId;

    @TableField("OR_INSU_FOLDER_ID")
    private String orInsuFolderId;

    @TableField("ORII_ITEMCODE")
    private String oriiItemcode;

    @TableField("ORII_AMOUNT")
    private Float oriiAmount;

    @TableField("ORII_QUANTITY")
    private BigDecimal oriiQuantity;

    @TableField("ORII_PREMIUM")
    private Float oriiPremium;


}
