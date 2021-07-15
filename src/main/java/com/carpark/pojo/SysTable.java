package com.carpark.pojo;

public class SysTable {
    private Integer sysId;

    private Integer sysHourmoney;

    private String sysFreetime;

    private Integer sysState;

    private Long sysMonth;

    private Long sysJika;

    private Long sysYear;

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public Integer getSysHourmoney() {
        return sysHourmoney;
    }

    public void setSysHourmoney(Integer sysHourmoney) {
        this.sysHourmoney = sysHourmoney;
    }

    public String getSysFreetime() {
        return sysFreetime;
    }

    public void setSysFreetime(String sysFreetime) {
        this.sysFreetime = sysFreetime == null ? null : sysFreetime.trim();
    }

    public Integer getSysState() {
        return sysState;
    }

    public void setSysState(Integer sysState) {
        this.sysState = sysState;
    }

    public Long getSysMonth() {
        return sysMonth;
    }

    public void setSysMonth(Long sysMonth) {
        this.sysMonth = sysMonth;
    }

    public Long getSysJika() {
        return sysJika;
    }

    public void setSysJika(Long sysJika) {
        this.sysJika = sysJika;
    }

    public Long getSysYear() {
        return sysYear;
    }

    public void setSysYear(Long sysYear) {
        this.sysYear = sysYear;
    }
}