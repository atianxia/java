package com.test.jcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.control.CompositeCacheManager;

public class WintimCache {
    private JCS jcs;
    private CompositeCacheManager ccm;

    public WintimCache() {
        try {
            ccm = CompositeCacheManager.getUnconfiguredInstance();
            Properties props = new Properties();     
            props.load(new FileInputStream(new File("E:\\sts-bundle\\sts-3.6.0.RELEASE\\1.0.7\\my_jcs\\src\\main\\java\\cache.ccf")));
            ccm.configure(props);
            jcs = JCS.getInstance("proxyCache");
        } catch (CacheException e) {
        }catch (FileNotFoundException e) {
        } catch (IOException e) {
            
        }
    }

    public byte[] getResponse(String request) {
        return (byte[]) jcs.get(request);
    }

    public void addCacheItem(String request, byte[] response) {
        try {
            jcs.put(request, response);
        } catch (CacheException e) {
        }
    }
}