package com.nic.mparivahan.dlservices.ui.acknow;

import com.nic.mparivahan.dlservices.data.model.DlStatusDoc;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;

public interface DlApplStatusService {
    @POST("sarathi/applDetails/uploadMicro/getApplicationInfo")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getApplicationStatus(@Body DlApplStatusRequest dlApplStatusRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/applicationStatus/applStatus")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlStatus(@Body DlStatusRequest dlStatusRequest, @Header("timestamp") String str, d dVar);

    @POST("/application/api/uploadMicro/validateAppl/v1")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlStatusDoc(@Body DlStatusDoc dlStatusDoc, d dVar);
}
