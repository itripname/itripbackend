package cn.itrip.trade.config;

public class WxConfig {
    private String appid;
    private String mchid;
    private String key ;

    public String getMchid() {
        return mchid;
    }

    public String getKey() {
        return key;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAppid() {
        return appid;
    }
}
