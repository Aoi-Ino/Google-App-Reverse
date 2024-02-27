package com.nic.mparivahan.Controller.UserController;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import um.c0;

public interface UserAPI {
    @POST("service/fetchCitizenImage")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> fetchProfileImg(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getBloodDetails(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("service/getCitizenProfile")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getCitizenProfile(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/saveCitizenProfile")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> saveProfileDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/updateCitizenProfile")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> updateCitizenProfile(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/uploadCitizenImage")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> uploadProfileImg(@Body c0 c0Var, @Header("timestamp") String str);
}
