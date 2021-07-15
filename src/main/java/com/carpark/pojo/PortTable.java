package com.carpark.pojo;

import java.util.Date;

public class PortTable {
    private Integer portId;

    private String portName;

    private String portState;

    private Date addTime;

    private Integer puserId;

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName == null ? null : portName.trim();
    }

    public String getPortState() {
        return portState;
    }

    public void setPortState(String portState) {
        this.portState = portState == null ? null : portState.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getPuserId() {
        return puserId;
    }

    public void setPuserId(Integer puserId) {
        this.puserId = puserId;
    }
}