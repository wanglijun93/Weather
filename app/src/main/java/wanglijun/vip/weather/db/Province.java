package wanglijun.vip.weather.db;

import org.litepal.crud.DataSupport;

/**
 * @author： wlj
 * @Date: 2017-08-12
 * @email: wanglijundev@gmail.com
 * @desc: 省
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
