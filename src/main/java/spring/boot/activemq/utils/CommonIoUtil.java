package spring.boot.activemq.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author 武海升
 * @date 2018/8/17 19:11
 */
public class CommonIoUtil {

    /**
     * 获取文件内容
     * @param file
     * @return
     */
    public static String getContent(File file){
        String fileContent = null;
        try {
            fileContent = FileUtils.readFileToString(file, "GBK");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    /**
     * 转换为 JSONObject
     * @param fileContent
     * @return
     */
    public static JSONObject getJSONObject(String fileContent){
        JSONObject jsonObject = new JSONObject();
        if(StringUtils.isBlank(fileContent)) return jsonObject;
        try {
            jsonObject = JSONObject.parseObject(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     *  处理数据
     * @param dataArray
     * @param device
     * @param list
     */
    public static CopyOnWriteArrayList dataList(JSONArray dataArray, String  device , CopyOnWriteArrayList list){
        long time = new Date().getTime();
        for (Object datum : dataArray) {
            JSONObject data_obj = (JSONObject)datum;
            data_obj.put("device",device);
            data_obj.put("time",time);
            list.add(data_obj);
        }
        return list;
    }

}
