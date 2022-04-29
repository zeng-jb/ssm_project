package com.zeng.demo01;


public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        //房东租房子
        Host host = new Host();
        //代理，中介帮房东租房，代理角色，会有附属操作
        Proxy proxy  = new Proxy(host);
        //去找中介
        proxy.rent();
    }
}
