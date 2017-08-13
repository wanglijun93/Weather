package wanglijun.vip.weather.util;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 * @author： wlj
 * @Date: 2017-08-12
 * @email: wanglijundev@gmail.com
 * @desc: 发起okhttp的忘了请求
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address, Callback callback) {
        final OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
