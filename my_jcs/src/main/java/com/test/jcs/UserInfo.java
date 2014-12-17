package com.test.jcs;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private String username;
    private String domain;

    public UserInfo(String name){
      this.username = name;
    }

    public UserInfo(String name,String domain){
      this.username= name;
      this.domain =domain;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    
 }