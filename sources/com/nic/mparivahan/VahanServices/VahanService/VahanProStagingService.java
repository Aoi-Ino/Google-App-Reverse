package com.nic.mparivahan.VahanServices.VahanService;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;

public interface VahanProStagingService {
    @POST("vahan/vahancapi/common/validateregandchasino")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getValidateregandchasino(@Body c0 c0Var, @Header("timestamp") String str);
}
