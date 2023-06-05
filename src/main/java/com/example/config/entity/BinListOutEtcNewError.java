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
//@ApiModel(value="BinListOutEtcNewError对象", description="")
public class BinListOutEtcNewError implements Serializable {

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

    private BigDecimal entolllanetype;

    private String enoperatorid;

    private String enoperatorname;

    private Date entime;

    private BigDecimal enshiftid;

    private String envehicleid;

    private BigDecimal envehicleclass;

    private BigDecimal envehicletype;

    private BigDecimal envehicleflag;

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

    private String terminaltransno;

    private String tac;

    private BigDecimal exweight;

    private BigDecimal passspeed;

    private String description;

    private String specialtype;

    private BigDecimal specialstatus;

    private BigDecimal prospecialstatus;

    private String vehiclesignid;

    private String passid;

    private String invoiceid;

    private BigDecimal identification;

    private BigDecimal mediatype;

    private String mediano;

    private BigDecimal paytype;

    private String terminalno;

    private BigDecimal algorithmidentifier;

    private BigDecimal multiprovince;

    private BigDecimal detailcnt;

    private BigDecimal vehcount;

    private BigDecimal payfee;

    private BigDecimal fee;

    private BigDecimal discountfee;

    private BigDecimal cardboxno;

    private BigDecimal cardtrunkno;

    private String appver;

    private String excpucardsnno;

    private String payorderlistno;

    private String paytac;

    private BigDecimal manualflag;

    private String chargingin;

    private Date sectionrequesttime;

    private Date sectionresponsetime;

    private Date prorequesttime;

    private Date proresponsetime;

    private String proreturncode;

    private String proreturnmemo;

    private String prochargingversion;

    private String priceversiongroup;

    private String prochargingsn;

    private String minchargingsn;

    private Date minrequesttime;

    private Date minresponsetime;

    private String shortestpathversion;

    private String disputeflag;

    private String disputeresult;

    private String delpassgantrys;

    private String delvehinfoids;

    private String delgantrypassids;

    private String deltollintervals;

    private String addpassgantrys;

    private String addtollintervals;

    private BigDecimal tollsupportdetails;

    private String chargingmac;

    private String passgantrys;

    private String splitprovince;

    private BigDecimal istest;

    private BigDecimal spare1;

    private BigDecimal spare2;

    private BigDecimal spare3;

    private String spare4;

    private String spare5;

    private String spare6;

    private BigDecimal obusign;

    private BigDecimal transpaytype;

    private BigDecimal exitfeetype;

    private String rateversion;

    private String spcrateversion;

    private BigDecimal etctotalamount;

    private BigDecimal provincecount;

    private String etccardid;

    private BigDecimal etccardtype;

    private BigDecimal exaxlecount;

    private String entolllanehex;

    private String vehiclesign;

    private BigDecimal nocardcount;

    private BigDecimal feemileage;

    private BigDecimal shortfee;

    private BigDecimal shortfeemileage;

    private BigDecimal feerate;

    private BigDecimal cardtotalamount;

    private BigDecimal obutotalamount;

    private BigDecimal obutotaldiscountamount;

    private BigDecimal obuprovincefee;

    private BigDecimal totalcount;

    private BigDecimal provtranscount;

    private BigDecimal provincediscountfee;

    private BigDecimal originfee;

    private BigDecimal discounttype;

    private String tollprovinceid;

    private BigDecimal isopenstation;

    private String roadspecialtype;

    private String appointid;

    private BigDecimal apointdatatype;

    private BigDecimal appointvehicleidentifytype;

    private BigDecimal appointdiscount;

    private BigDecimal appointdiscounttype;

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
