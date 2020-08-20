package com.ydy.modules.contact.entity;

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
@TableName("BIZ_CONTACT_OVERVIEW")
public class BizContactOverview implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BIZ_CON_FOLDER_ID")
    private String bizConFolderId;

    @TableField("BIZ_CO_WILLINGNESS")
    private String bizCoWillingness;

    @TableField("BIZ_CO_PREFERENCE")
    private String bizCoPreference;

    @TableField("BIZ_CO_HABITS")
    private String bizCoHabits;

    @TableField("BIZ_CO_PEERINFLUENCE")
    private String bizCoPeerinfluence;

    @TableField("BIZ_CO_RELATIONSHIP")
    private String bizCoRelationship;

    @TableField("BIZ_CO_RESHIP_CUST")
    private String bizCoReshipCust;

    @TableField("BIZ_CO_NOTES")
    private String bizCoNotes;


}
