package com.bridgelabz;

public class Address {
    private String city;
    private String State;
    private String Zip;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Zip='" + Zip + '\'' +
                '}';
    }
}
