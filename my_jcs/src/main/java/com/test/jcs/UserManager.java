package com.test.jcs;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;

public class UserManager{
    private JCS jcscache;
    private final String NAME_SPACE="userinfo";
     
    private static class UserManagerContainer{
        public static UserManager instance = new UserManager(); 
    }

    public static UserManager getInstance(){
        return UserManagerContainer.instance;
    }

    private UserManager(){
        try{           

            jcscache= JCS.getInstance(NAME_SPACE);

           }
           catch(CacheException e){
           }
    }

    public UserInfo get(String key){
        return (UserInfo) jcscache.get(key);
    }

    public void put(String key,UserInfo info,boolean isoverride){
        try{
            if(isoverride){
               jcscache.put(key,info);
            }
            else{
               jcscache.putSafe(key,info);
            }
          }
          catch(CacheException e){

          }
    }
}