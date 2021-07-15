package com.carpark.baidu.api;

/**
 * 车牌识别 的源代码可复制粘贴拿走    百度云的接口最后操作截取的是车牌号
 * 重要工具类直接是下载路径，  放在同一个包下。直接调用
 *
 * Token 是需要在百度云申请服务之后，创建应用 使用文字识别功能，个人  点击确定。
 * 查看应用详情，APIk   和  隐藏的密码
 * https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials&client_id=官网获取的AK&client_secret=官网获取的SK
 * 复制在浏览器打开，acc Token  在第一行的后面   粘贴过来
 */

import java.net.URLEncoder;

public class LicensePlate {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public  String licensePlate(String path) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/license_plate";
        try {
            // 本地文件路径
            String filePath = path;
            // String filePath = "D:\\image\\test01.png";
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = "24.0ec92ac4f740801b365e9c06beb4c150.2592000.1628663575.282335-24533493";

            String result = HttpUtil.post(url, accessToken, param);
            System.out.println(result);
            return result.substring(27, 34);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
    }
}


