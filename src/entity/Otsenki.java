/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 * 3 лаба
 * @author 18749
 */
public class Otsenki implements java.io.Serializable {
    private long id;
    private String nazvanie_predmeta;
    private int ball;
    private Date statusDate;
    
    public Otsenki() {
    }
    
    public Otsenki(long id, String nazvanie_predmeta, int ball, Date statusDate) {
       this.ball = ball;
       this.id = id;
       this.nazvanie_predmeta = nazvanie_predmeta;
       this.statusDate = statusDate;
    }
    
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
    
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getNazvanie_predmeta() {
        return this.nazvanie_predmeta;
    }
    
    public void setNazvanie_predmeta(String nazvanie_predmeta) {
        this.nazvanie_predmeta = nazvanie_predmeta;
    }
    
    public int getBall() {
        return this.ball;
    }
    
    public void setBall(int ball) {
        this.ball = ball;
    }
}
