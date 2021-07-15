package com.carpark.pojo;

public class Indexview {
    private Integer userId;

    private String carName;

    private String carStarttime;

    private String carType;

    private String carState;

    private Integer carMoney;

    private String carEndtime;

    private Integer puserId;

    private Integer portId;

    private String portName;

    private String portState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public String getCarStarttime() {
        return carStarttime;
    }

    public void setCarStarttime(String carStarttime) {
        this.carStarttime = carStarttime == null ? null : carStarttime.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarState() {
        return carState;
    }

    public void setCarState(String carState) {
        this.carState = carState == null ? null : carState.trim();
    }

    public Integer getCarMoney() {
        return carMoney;
    }

    public void setCarMoney(Integer carMoney) {
        this.carMoney = carMoney;
    }

    public String getCarEndtime() {
        return carEndtime;
    }

    public void setCarEndtime(String carEndtime) {
        this.carEndtime = carEndtime == null ? null : carEndtime.trim();
    }

    public Integer getPuserId() {
        return puserId;
    }

    public void setPuserId(Integer puserId) {
        this.puserId = puserId;
    }

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
}