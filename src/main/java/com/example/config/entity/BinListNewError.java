package com.example.config.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author YBY
 * @since 2023-05-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
//@ApiModel(value="BinListNewError对象", description="")
public class BinListNewError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgid;

      @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    private BigDecimal ennetroadid;

    private String ensectionid;

    private BigDecimal enroadno;

    private String enstationid;

    private BigDecimal enstationno;

    private String entolllaneid;

    private BigDecimal entolllaneno;

    private String entolllanehex;

    private BigDecimal entolllanetype;

    private String loadgantryid;

    private String enoperatorid;

    private String enoperatorname;

    private Date squaddate;

    private Date naturaldate;

    private BigDecimal squadno;

    private Date squadon;

    private Date entime;

    private String envehicleplate;

    private BigDecimal envehicleplatecolor;

    private String enidentifyvehicleplate;

    private BigDecimal enidentifyvehicleplatecolor;

    private String encardvehplate;

    private BigDecimal envehicletype;

    private BigDecimal envehicleclass;

    private BigDecimal mediatype;

    private BigDecimal obusign;

    private String terminaltransno;

    private String obuid;

    private String cardid;

    private BigDecimal transfee;

    private String transtype;

    private String terminalno;

    private BigDecimal enweight;

    private BigDecimal enaxlecount;

    private BigDecimal electricalpercentage;

    private BigDecimal signstatus;

    private String specialtype;

    private BigDecimal specialstatus;

    private BigDecimal prospecialstatus;

    private String vehiclesignid;

    private String passid;

    private BigDecimal enopcardid;

    private BigDecimal enshiftid;

    private BigDecimal cardboxno;

    private BigDecimal cardtrunkno;

    private String appver;

    private BigDecimal vehcount;

    private BigDecimal istest;

    private String vehiclesign;

    private BigDecimal spare1;

    private BigDecimal spare2;

    private BigDecimal spare3;

    private String spare4;

    private String spare5;

    private String spare6;

    private BigDecimal operationmedia;

    private BigDecimal etccardtype;

    private BigDecimal hgseq;

    private Date hginserttabletime;

    private BigDecimal pvehtype;

    private BigDecimal pvehclass;

    private String seq;

    private String errortype;

    private String errordetail;

    private String haddeal;

    private String dealtime;

    private String errortotal;

    private String jsonname;

    private String dealdesc;

    private String updateuser;

    private String qreceivetime;

    private String tac;

    private String enopcardno;


}
