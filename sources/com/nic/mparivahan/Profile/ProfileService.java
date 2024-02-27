package com.nic.mparivahan.Profile;

import com.nic.mparivahan.Account.Model.ResendOtp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;

public interface ProfileService {
    @POST("alerts/apis/reSendSMSAlerts/v1.0")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<ResendOtp> getResendOtp(@Body c0 c0Var);
}
