package wanglijun.vip.weather.gson;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc:
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
