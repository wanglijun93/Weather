package wanglijun.vip.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc:
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
