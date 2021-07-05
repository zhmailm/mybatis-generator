package com.zhm.model;

import java.io.Serializable;
import java.util.Date;

public class student implements Serializable {
    private Integer sid;

    private String sname;

    private Date sbrith;

    private String sadress;

    private String ssex;

    private String slikes;

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Date getSbrith() {
        return sbrith;
    }

    public void setSbrith(Date sbrith) {
        this.sbrith = sbrith;
    }

    public String getSadress() {
        return sadress;
    }

    public void setSadress(String sadress) {
        this.sadress = sadress == null ? null : sadress.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getSlikes() {
        return slikes;
    }

    public void setSlikes(String slikes) {
        this.slikes = slikes == null ? null : slikes.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        student other = (student) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getSbrith() == null ? other.getSbrith() == null : this.getSbrith().equals(other.getSbrith()))
            && (this.getSadress() == null ? other.getSadress() == null : this.getSadress().equals(other.getSadress()))
            && (this.getSsex() == null ? other.getSsex() == null : this.getSsex().equals(other.getSsex()))
            && (this.getSlikes() == null ? other.getSlikes() == null : this.getSlikes().equals(other.getSlikes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getSbrith() == null) ? 0 : getSbrith().hashCode());
        result = prime * result + ((getSadress() == null) ? 0 : getSadress().hashCode());
        result = prime * result + ((getSsex() == null) ? 0 : getSsex().hashCode());
        result = prime * result + ((getSlikes() == null) ? 0 : getSlikes().hashCode());
        return result;
    }
}