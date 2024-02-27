package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest;
import com.nic.mparivahan.dlservices.data.model.idp.GetNatVisaIssbleForNatCodeRequest;
import com.nic.mparivahan.dlservices.data.model.idp.IdpRequestGetNations;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlGetMobileRequest;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobileRequest;
import com.nic.mparivahan.dlservices.data.model.savelog.SaveLogReq;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.DlExRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.DlExRequestGen;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;
import um.c0;

public interface DlExtraService {
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDetForGivenDLNumber(@Body DuplicateDlRequest duplicateDlRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDetForGivenDLNumberIdp(@Body c0 c0Var, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDetForGivenDLNumberRenewal(@Body c0 c0Var, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDetForGivenDLNumberReplacment(@Body ReplacementDlRequest replacementDlRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDlExtract(@Body DlExRequest dlExRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getAckDlExtractGen(@Body DlExRequestGen dlExRequestGen, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getIdpCovGrades")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getIdpCovGrades(@Body IdpRequestGetNations idpRequestGetNations, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServiceOnMobNoUpd/getMobileNumUpd")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getMobileDetails(@Body DlGetMobileRequest dlGetMobileRequest, @Header("timestamp") String str, d dVar);

    @POST("/sarathiWS/rsServices/ServicesOnDL/getNatVisaIssbleForNatCode")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getNatVisaIssbleForNatCode(@Body GetNatVisaIssbleForNatCodeRequest getNatVisaIssbleForNatCodeRequest, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getNationsToApplyFor")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getNationsToApplyFor(@Body IdpRequestGetNations idpRequestGetNations, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getReasonsTransWise")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getReasonsTransWise(@Body GetReasonsTransWiseRequest getReasonsTransWiseRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServiceOnMobNoUpd/updateMobileNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getUpdateMobile(@Body DlUpdateMobileRequest dlUpdateMobileRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object hillRequest(@Body HillRequest hillRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object nameRequest(@Body ChangeOfNameRequest changeOfNameRequest, @Header("timestamp") String str, d dVar);

    @POST("audit/apis/saveSarathiLogDetails/v1.0")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object saveLogRequest(@Body SaveLogReq saveLogReq, d dVar);

    @POST("")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object updateLogRequest(@Body SaveLogReq saveLogReq, d dVar);
}
