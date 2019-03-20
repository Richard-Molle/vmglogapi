package fr.ipme.vmglogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "`SystemEvents`")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Log {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CustomerID")
    private Integer customerid;

    @Column(name = "ReceivedAt")
    private Date receivedat;

    @Column(name = "DeviceReportedTime")
    private Date devicereportedtime;

    @Column(name = "Facility")
    private Integer facility;

    @Column(name = "Priority")
    private Integer priority;

    @Column(name = "FromHost")
    private String fromHost;

    @Column(name = "Message")
    private String message;

    @Column(name = "NTSeverity")
    private Integer ntseverity;

    @Column(name = "Importance")
    private Integer importance;

    @Column(name = "EventSource")
    private String eventsource;

    @Column(name = "EventUser")
    private String eventuser;

    @Column(name = "EventCategory")
    private Integer eventcategory;

    @Column(name = "EventID")
    private Integer eventid;

    @Column(name = "EventBinaryData")
    private String eventbinarydata;

    @Column(name = "MaxAvailable")
    private Integer maxavailable;

    @Column(name = "CurrUsage")
    private Integer currusage;

    @Column(name = "MinUsage")
    private Integer minusage;

    @Column(name = "MaxUsage")
    private Integer maxusage;

    @Column(name = "InfoUnitID")
    private Integer infounitid;

    @Column(name = "SysLogTag")
    private String syslogtag;

    @Column(name = "EventLogType")
    private String eventlogtype;

    @Column(name = "GenericFileName")
    private String genericfilename;

    @Column(name = "SystemID")
    private Integer systemid;

    public Log() {
    }

    public Log(Integer id, Integer customerid, Date receivedat, Date devicereportedtime, Integer facility, Integer priority, String fromHost, String message, Integer ntseverity, Integer importance, String eventsource, String eventuser, Integer eventcategory, Integer eventid, String eventbinarydata, Integer maxavailable, Integer currusage, Integer minusage, Integer maxusage, Integer infounitid, String syslogtag, String eventlogtype, String genericfilename, Integer systemid) {
        this.id = id;
        this.customerid = customerid;
        this.receivedat = receivedat;
        this.devicereportedtime = devicereportedtime;
        this.facility = facility;
        this.priority = priority;
        this.fromHost = fromHost;
        this.message = message;
        this.ntseverity = ntseverity;
        this.importance = importance;
        this.eventsource = eventsource;
        this.eventuser = eventuser;
        this.eventcategory = eventcategory;
        this.eventid = eventid;
        this.eventbinarydata = eventbinarydata;
        this.maxavailable = maxavailable;
        this.currusage = currusage;
        this.minusage = minusage;
        this.maxusage = maxusage;
        this.infounitid = infounitid;
        this.syslogtag = syslogtag;
        this.eventlogtype = eventlogtype;
        this.genericfilename = genericfilename;
        this.systemid = systemid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getReceivedat() {
        return receivedat;
    }

    public void setReceivedat(Date receivedat) {
        this.receivedat = receivedat;
    }

    public Date getDevicereportedtime() {
        return devicereportedtime;
    }

    public void setDevicereportedtime(Date devicereportedtime) {
        this.devicereportedtime = devicereportedtime;
    }

    public Integer getFacility() {
        return facility;
    }

    public void setFacility(Integer facility) {
        this.facility = facility;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getFromHost() {
        return fromHost;
    }

    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getNtseverity() {
        return ntseverity;
    }

    public void setNtseverity(Integer ntseverity) {
        this.ntseverity = ntseverity;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public String getEventsource() {
        return eventsource;
    }

    public void setEventsource(String eventsource) {
        this.eventsource = eventsource;
    }

    public String getEventuser() {
        return eventuser;
    }

    public void setEventuser(String eventuser) {
        this.eventuser = eventuser;
    }

    public Integer getEventcategory() {
        return eventcategory;
    }

    public void setEventcategory(Integer eventcategory) {
        this.eventcategory = eventcategory;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public String getEventbinarydata() {
        return eventbinarydata;
    }

    public void setEventbinarydata(String eventbinarydata) {
        this.eventbinarydata = eventbinarydata;
    }

    public Integer getMaxavailable() {
        return maxavailable;
    }

    public void setMaxavailable(Integer maxavailable) {
        this.maxavailable = maxavailable;
    }

    public Integer getCurrusage() {
        return currusage;
    }

    public void setCurrusage(Integer currusage) {
        this.currusage = currusage;
    }

    public Integer getMinusage() {
        return minusage;
    }

    public void setMinusage(Integer minusage) {
        this.minusage = minusage;
    }

    public Integer getMaxusage() {
        return maxusage;
    }

    public void setMaxusage(Integer maxusage) {
        this.maxusage = maxusage;
    }

    public Integer getInfounitid() {
        return infounitid;
    }

    public void setInfounitid(Integer infounitid) {
        this.infounitid = infounitid;
    }

    public String getSyslogtag() {
        return syslogtag;
    }

    public void setSyslogtag(String syslogtag) {
        this.syslogtag = syslogtag;
    }

    public String getEventlogtype() {
        return eventlogtype;
    }

    public void setEventlogtype(String eventlogtype) {
        this.eventlogtype = eventlogtype;
    }

    public String getGenericfilename() {
        return genericfilename;
    }

    public void setGenericfilename(String genericfilename) {
        this.genericfilename = genericfilename;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }
}
