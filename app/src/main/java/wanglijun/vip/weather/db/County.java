package wanglijun.vip.weather.db;

import org.litepal.crud.DataSupport;

/**
 * @author： wlj
 * @Date: 2017-08-12
 * @email: wanglijundev@gmail.com
 * @desc: 县
 */

public class County extends DataSupport {
    private int id;
    //记录县的名字
    private String countyName;
    //记录县所对应的天气ID
    private String weatherId;
    //记录当前县所对应市的ID
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
