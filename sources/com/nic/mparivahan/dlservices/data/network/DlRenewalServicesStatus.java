package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust;
import com.nic.mparivahan.dlservices.data.model.DlRenewalInsertDocUpload;
import com.nic.mparivahan.dlservices.data.model.DlRenewalUploadDocFlow;
import com.nic.mparivahan.dlservices.data.model.UploadPhotoSignReqeust;
import com.nic.mparivahan.dlservices.ui.dms.GetCustomRequest;
import com.nic.mparivahan.dlservices.ui.dms.GetDocProofRequest;
import com.nic.mparivahan.dlservices.ui.dms.GetDocRequest;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.DocUploadRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import tl.d;

public interface DlRenewalServicesStatus {
    @POST("sarathi/dmsRules/insertDoc/getCustomDocList")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlCustomUploadDoc(@Body GetCustomRequest getCustomRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/dmsRules/insertDoc/getInsertedDocs")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlInsertedUploadDoc(@Body DlRenewalInsertDocUpload dlRenewalInsertDocUpload, @Header("timestamp") String str, d dVar);

    @POST("sarathi/dmsRules/ruleservices/getProofList")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlListOfDoc(@Body GetDocProofRequest getDocProofRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getDetails")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlStatusPhotoSign(@Body DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust, @Header("timestamp") String str, d dVar);

    @POST("sarathi/dmsRules/ruleservices/documents")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlUploadDoc(@Body GetDocRequest getDocRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getImage")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object getDlUploadPhotoSign(@Body DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust, @Header("timestamp") String str, d dVar);

    @POST("sarathi/applDetails/uploadMicro/updateUploadFlow")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object uploadDlDocFlow(@Body DlRenewalUploadDocFlow dlRenewalUploadDocFlow, @Header("timestamp") String str, d dVar);

    @POST("sarathi/dmsRules/insertDoc/manageDocs")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object uploadDlDocuments(@Body DocUploadRequest docUploadRequest, @Header("timestamp") String str, d dVar);

    @POST("sarathi/sarathiWS/uploadingPhotoAndSignature/saveBiomtrics")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Object uploadDlPhotoSign(@Body UploadPhotoSignReqeust uploadPhotoSignReqeust, @Header("timestamp") String str, d dVar);
}
