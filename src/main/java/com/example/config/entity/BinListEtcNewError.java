package com.example.config.entity;

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
//@ApiModel(value="BinListEtcNewError对象", description="")
public class BinListEtcNewError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgid;

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

    private String envehicleid;

    private String enidentifyvehicleid;

    private String encardvehplate;

    private BigDecimal envehicletype;

    private BigDecimal envehicleclass;

    private BigDecimal mediatype;

    private BigDecimal obusign;

    private String terminaltransno;

    private String obuid;

    private String cardid;

    private String tac;

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

    private String enopcardno;

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

    private String hglistid;

    private Date hginserttime;

    private BigDecimal hgsendflagprov;

    private String hgsenderrmsgprov;

    private Date hgsendtimeprov;

    private BigDecimal hgsendtimesprov;

    private BigDecimal hgsendflagcenter;

    private String hgsenderrmsgcenter;

    private Date hgsendtimecenter;

    private BigDecimal hgsendtimescenter;

    private BigDecimal hgsendflagmain;

    private String hgsenderrmsgmain;

    private Date hgsendtimemain;

    private BigDecimal hgsendtimesmain;

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


}
