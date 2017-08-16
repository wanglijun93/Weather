package wanglijun.vip.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc:
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;

    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;

    }
}
