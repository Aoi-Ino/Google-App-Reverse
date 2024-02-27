package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.dlservices.data.model.DlRequestForSaveRequest;
import kj.b;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;

public interface DlRenewalServices {
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object saveCOA(@Body b bVar, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object saveDlRenewalDetails(@Body DlRequestForSaveRequest dlRequestForSaveRequest, @Header("timestamp") String str, d dVar);
}
