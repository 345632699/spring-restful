package com.resetful.model;

import lombok.Data;

import java.util.Date;

@Data
public class Resend {
    public String devicePin;
    public String deviceSn;
    public String vendor;
    public String model;
    public String deviceMac;
    public String firmwareVer;
    public String deviceStatus;
    public String reportTime;
    public Long onlineTime;
    public Resend() {
    }

    public Resend(
            String devicePin,
            String deviceSn,
            String vendor,
            String model,
            String deviceMac,
            String firmwareVer,
            String deviceStatus,
            String reportTime,
            Long onlineTime
    ) {
        this.devicePin = devicePin;
        this.deviceSn = deviceSn;
        this.vendor = vendor;
        this.model = model;
        this.deviceMac = deviceMac;
        this.firmwareVer = firmwareVer;
        this.deviceStatus = deviceStatus;
        this.reportTime = reportTime;
        this.onlineTime = onlineTime;
    }
}

