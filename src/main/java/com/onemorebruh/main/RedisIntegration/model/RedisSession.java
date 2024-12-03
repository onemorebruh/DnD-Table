package com.onemorebruh.main.RedisIntegration.model;

import java.io.Serializable;


//@RedisHash
public class RedisSession implements Serializable {

    private static final long serialVersionUID = 1L;
    private String key;
    private String value;

    public RedisSession(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue( String value){
        this.value = value;
    }


    @Override
    public String toString(){
        return "Session: {" + this.key + ": " + this.value + "}";
    }
}
