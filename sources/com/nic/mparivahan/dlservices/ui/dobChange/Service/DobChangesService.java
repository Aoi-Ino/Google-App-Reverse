package com.nic.mparivahan.dlservices.ui.dobChange.Service;

import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;

public interface DobChangesService {
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object changeDobForGivenDLNumber(@Body ChangeDobRequest changeDobRequest, @Header("timestamp") String str, d dVar);
}
