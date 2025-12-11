package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean9")
public class Employee {
    @Value("101")
    private int eid;
    @Value("Ramesh Kumar")
    private String ename;
    @Value("123, MG Road, Mumbai")
    private String address;
    public Employee() {
    }
    public Employee(int eid, String ename, String address) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public  void display() {
        System.out.println(eid+" | "+ename+" | "+address);
    }
}
