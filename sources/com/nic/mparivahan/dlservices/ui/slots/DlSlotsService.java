package com.nic.mparivahan.dlservices.ui.slots;

import com.nic.mparivahan.dlservices.ui.slots.model.SlotsDetRequest;
import com.nic.mparivahan.dlservices.ui.slots.model.SlotsInstRequest;
import com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;

public interface DlSlotsService {
    @POST("sarathi/slots/rsServices/SlotAckmntServ/dltprovnlreceipt")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAcknowDetails(@Body SlotsRequest slotsRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/slots/rsServices/ApplcntDetails/getApplDtDet")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getApplDtDetSlots(@Body SlotsRequest slotsRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/slots/rsServices/FetchDTSlotDetails/getSlotDet")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getSlotDet(@Body SlotsDetRequest slotsDetRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/slots/rsServices/SaveDTSlotDetServ/insSltDet")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object insSlotDet(@Body SlotsInstRequest slotsInstRequest, @Header("timestamp") String str, d dVar);
}
