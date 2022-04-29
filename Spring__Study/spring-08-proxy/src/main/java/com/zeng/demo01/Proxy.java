package com.zeng.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHost();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seeHost(){
        System.out.println("中介带你看房");
    }
    //合同
    public void hetong(){
        System.out.println("签合同");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
