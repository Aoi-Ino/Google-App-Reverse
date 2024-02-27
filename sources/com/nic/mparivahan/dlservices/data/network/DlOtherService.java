package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.dlservices.data.model.DlDist;
import com.nic.mparivahan.dlservices.data.model.DlImageVerification;
import com.nic.mparivahan.dlservices.data.model.DlLastRtoRequest;
import com.nic.mparivahan.dlservices.data.model.DlRto;
import com.nic.mparivahan.dlservices.data.model.DlState;
import com.nic.mparivahan.dlservices.data.model.DlTaluka;
import com.nic.mparivahan.dlservices.data.model.DlVillageOrTown;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import tl.d;

public interface DlOtherService {
    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getCustomState(@Url String str, @Body DlRto dlRto, d dVar);

    @POST("sarathi/sarathiWS/getDistricts/distmast")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDistricts(@Body DlDist dlDist, @Header("timestamp") String str, d dVar);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getImageVerification(@Url String str, @Body DlImageVerification dlImageVerification, d dVar);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getLastRto(@Url String str, @Body DlLastRtoRequest dlLastRtoRequest, d dVar);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getRto(@Url String str, @Body DlRto dlRto, d dVar);

    @POST("sarathi/sarathiWS/getSeStatesList/stateMast")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getState(@Body DlState dlState, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/getSubDistricts/subDistmast")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getSubDistricts(@Body DlTaluka dlTaluka, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/getVillageAndTown/villageOrTownMast")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getVillageOrTown(@Body DlVillageOrTown dlVillageOrTown, @Header("timestamp") String str, d dVar);
}
