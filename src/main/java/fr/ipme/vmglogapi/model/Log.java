package fr.ipme.vmglogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "`log`")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String contentLog;

    public Log() {
    }
    public Log(int id, String contentLog) {
        this.id = id;
        this.contentLog = contentLog;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getContentLog() {
        return contentLog;
    }
    public void setContentLog(String contentLog) {
        this.contentLog = contentLog;
    }
}
