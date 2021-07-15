package com.carpark.pojo;

public class UseTable {
    private Integer useId;

    private String useMail;

    private String usePhone;

    private String usePwd;

    private String usecarName;

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public String getUseMail() {
        return useMail;
    }

    public void setUseMail(String useMail) {
        this.useMail = useMail == null ? null : useMail.trim();
    }

    public String getUsePhone() {
        return usePhone;
    }

    public void setUsePhone(String usePhone) {
        this.usePhone = usePhone == null ? null : usePhone.trim();
    }

    public String getUsePwd() {
        return usePwd;
    }

    public void setUsePwd(String usePwd) {
        this.usePwd = usePwd == null ? null : usePwd.trim();
    }

    public String getUsecarName() {
        return usecarName;
    }

    public void setUsecarName(String usecarName) {
        this.usecarName = usecarName == null ? null : usecarName.trim();
    }
}