package com.carpark.pojo;

public class UserTable {
    private Integer userId;

    private String carName;

    private String carStarttime;

    private String carType;

    private String carState;

    private String carEndtime;

    private Long carMoney;

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

    public String getCarEndtime() {
        return carEndtime;
    }

    public void setCarEndtime(String carEndtime) {
        this.carEndtime = carEndtime == null ? null : carEndtime.trim();
    }

    public Long getCarMoney() {
        return carMoney;
    }

    public void setCarMoney(Long carMoney) {
        this.carMoney = carMoney;
    }
}