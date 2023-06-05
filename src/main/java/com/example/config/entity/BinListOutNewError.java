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
//@ApiModel(value="BinListOutNewError对象", description="")
public class BinListOutNewError implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgid;

    private String id;

    private BigDecimal ennetroadid;

    private String ensectionid;

    private BigDecimal enroadno;

    private String enstationid;

    private BigDecimal enstationno;

    private String entollstationname;

    private String entolllaneid;

    private BigDecimal entolllaneno;

    private String entolllanehex;

    private BigDecimal entolllanetype;

    private String enoperatorid;

    private String enoperatorname;

    private Date entime;

    private BigDecimal enshiftid;

    private String envehicleid;

    private BigDecimal envehicleclass;

    private BigDecimal envehicletype;

    private BigDecimal enweight;

    private BigDecimal enaxlecount;

    private BigDecimal exnetroadid;

    private String exsectionid;

    private BigDecimal exroadno;

    private String exstationid;

    private BigDecimal exstationno;

    private String extollstationname;

    private String extolllaneid;

    private BigDecimal extolllaneno;

    private String extolllanehex;

    private BigDecimal extolllanetype;

    private String loadgantryid;

    private Date extime;

    private String exoperatorid;

    private String exoperatorname;

    private String exopcardno;

    private BigDecimal exopcardid;

    private Date squaddate;

    private BigDecimal exshiftid;

    private Date naturaldate;

    private BigDecimal squadno;

    private Date squadon;

    private String exvehicleid;

    private String exidentifyvehicleid;

    private BigDecimal exvehicleclass;

    private BigDecimal exvehicletype;

    private BigDecimal obusign;

    private String terminaltransno;

    private String obuid;

    private String cardid;

    private String tac;

    private BigDecimal transfee;

    private BigDecimal etccardtype;

    private String transtype;

    private BigDecimal exweight;

    private BigDecimal exaxlecount;

    private BigDecimal passspeed;

    private BigDecimal electricalpercentage;

    private BigDecimal signstatus;

    private String description;

    private String specialtype;

    private BigDecimal specialstatus;

    private BigDecimal prospecialstatus;

    private String vehiclesignid;

    private String passid;

    private String terminalno;

    private BigDecimal vehcount;

    private BigDecimal istest;

    private String vehiclesign;

    private BigDecimal spare1;

    private BigDecimal spare2;

    private BigDecimal spare3;

    private String spare4;

    private String spare5;

    private String spare6;

    private BigDecimal mediatype;

    private String obusn;

    private BigDecimal transpaytype;

    private BigDecimal fee;

    private BigDecimal shortfee;

    private BigDecimal feerate;

    private BigDecimal actualfeeclass;

    private BigDecimal totalamount;

    private BigDecimal obutotalcount;

    private BigDecimal nocardcount;

    private BigDecimal etctotalamount;

    private BigDecimal provfee;

    private BigDecimal provtranscount;

    private BigDecimal provincecount;

    private BigDecimal feeboardplay;

    private BigDecimal payfee;

    private BigDecimal discountfee;

    private BigDecimal feemileage;

    private String spcrateversion;

    private String splitprovince;

    private BigDecimal shortfeemileage;

    private String mediano;

    private BigDecimal prebalance;

    private BigDecimal postbalance;

    private BigDecimal exitfeetype;

    private BigDecimal obutotalamount;

    private BigDecimal obutotaldiscountamount;

    private BigDecimal identification;

    private BigDecimal totalcount;

    private String appver;

    private BigDecimal provincediscountfee;

    private BigDecimal originfee;

    private BigDecimal obuprovincefee;

    private BigDecimal discounttype;

    private BigDecimal cardtotalamount;

    private BigDecimal isopenstation;

    private BigDecimal cardboxno;

    private String cardtrunkno;

    private String roadspecialtype;

    private String appointid;

    private BigDecimal apointdatatype;

    private BigDecimal appointvehicleidentifytype;

    private BigDecimal appointdiscount;

    private BigDecimal appointdiscounttype;

    private BigDecimal pvehtype;

    private BigDecimal pvehclass;

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


}
