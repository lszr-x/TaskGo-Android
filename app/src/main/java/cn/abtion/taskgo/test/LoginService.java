package cn.abtion.taskgo.test;

import cn.abtion.taskgo.mvp.LoginModel;
import cn.abtion.taskgo.network.response.ApiResponse;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author FanHongyu.
 * @since 18/1/19 17:29.
 * email fanhongyu@hrsoft.net.
 */

public interface LoginService {

    @POST("login")
    Observable<ApiResponse> rxLogin(@Query("phone") String phone, @Query("password") String password);
}