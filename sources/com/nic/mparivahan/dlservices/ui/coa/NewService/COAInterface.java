package com.nic.mparivahan.dlservices.ui.coa.NewService;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;

public interface COAInterface {
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> coaInterface(@Body c0 c0Var, @Header("timestamp") String str);
}
