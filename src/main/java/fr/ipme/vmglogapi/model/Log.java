package fr.ipme.vmglogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "`_all`")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Log {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "datetime")
    private String datetime;

    @Column(name = "host")
    private String host;

    @Column(name = "facility")
    private String facility;

    @Column(name = "level")
    private String level;

    @Column(name = "tag")
    private String tag;

    @Column(name = "program")
    private String program;

    @Column(name = "msg")
    private String msg;

    public Log() {
    }
    public Log(Integer id, String datetime, String host, String facility, String level, String tag, String program, String msg) {
        this.id = id;
        this.datetime = datetime;
        this.host = host;
        this.facility = facility;
        this.level = level;
        this.tag = tag;
        this.program = program;
        this.msg = msg;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    public String getFacility() {
        return facility;
    }
    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
