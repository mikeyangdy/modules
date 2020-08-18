package com.ydy.contact.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("BIZ_CONTACT_RESULT")
public class BizContactResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BIZ_CON_FOLDER_ID")
    private String bizConFolderId;

    @TableField("BIZ_CR_RESULTS")
    private String bizCrResults;

    @TableField("BIZ_CR_RESULTS_CODE")
    private String bizCrResultsCode;

    @TableField("BIZ_CR_REASONS")
    private String bizCrReasons;

    @TableField("BIZ_CR_FAILURE")
    private String bizCrFailure;

    @TableField("BIZ_CR_ATTACHMENT")
    private String bizCrAttachment;

    @TableField("BIZ_CR_APPOINTMENT_TIME")
    private LocalDate bizCrAppointmentTime;


}
