package wanglijun.vip.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc:
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
