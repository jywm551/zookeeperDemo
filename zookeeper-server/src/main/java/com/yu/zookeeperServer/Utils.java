package com.yu.zookeeperServer;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName Utils
 * @Author TheodoreYU
 * @Date 2018-09-18
 * @Description TODO
 **/
public class Utils {

    public static <T> T convertJsonByteArrToAssignedObj(byte[] object, String key, Class<T> clazz) {
        JSONObject jsonObject = JSONObject.parseObject(new String(object));
        return jsonObject.getObject(key, clazz);
    }

    public static <T> byte[] convertObjToJsonByteArr(T o, String key) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, o);
        return jsonObject.toJSONString().getBytes();
    }
}
