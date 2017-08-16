package wanglijun.vip.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc:
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
