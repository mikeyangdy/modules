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
@TableName("BIZ_CONTACT_FOLDER")
public class BizContactFolder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BIZ_CON_FOLDER_ID")
    private String bizConFolderId;

    @TableField("BIZ_CONTACT_APP_ID")
    private String bizContactAppId;

    /**
     * Y.有效
            N.无效
     */
    @TableField("VALID")
    private String valid;


}
