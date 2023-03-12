package com.finalproject.bmap;

public class model_stops {

    String BusNo,Time,Type, purl;

    public model_stops() {
    }

    public model_stops(String busNo, String time, String type, String purl) {
        BusNo = busNo;
        Time = time;
        Type = type;
        this.purl = purl;
    }

    public String getBusNo() {
        return BusNo;
    }

    public void setBusNo(String busNo) {
        BusNo = busNo;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
