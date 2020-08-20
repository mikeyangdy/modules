package com.ydy.modules.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("ORDER_SUBJ_VEHICLE")
public class OrderSubjVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("OR_SUBJ_ID")
    private String orSubjId;

    private String carLicenseNo;

    private String carVin;

    private String carframeNo;

    private String carModel;

    private String carModelCode;

    private String carSpecifications;

    private String carSpecificationsCode;

    private String carStructure;

    private String carStructureCode;

    private String carSs;

    private String carSsCode;

    private String carLicenseColor;

    private String carLicenseColorCode;

    private String carBodyColor;

    private String carBodyColorCode;

    private String carEngineNo;

    private LocalDateTime carRegistDate;

    private String carManufactureYear;

    private String carBrandCode;

    private String carBrand;

    private String carSeries;

    private String carSeriesCode;

    private String carYear;


}
