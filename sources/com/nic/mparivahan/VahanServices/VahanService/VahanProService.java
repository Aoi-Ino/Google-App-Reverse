package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import android.os.Build;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.FancyRto;
import hn.a;
import id.b;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import um.c0;
import um.e0;
import um.z;
import v9.k;
import xg.f;

public interface VahanProService extends ApplicationService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21196b = a.f21197a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21197a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static VahanProService f21198b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final VahanProService b(Context context) {
            z.a I;
            l.f(context, "context");
            hn.a d10 = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(40, timeUnit).J(40, timeUnit).M(40, timeUnit).a(d10);
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a a12 = a11.d(40, timeUnit2).J(40, timeUnit2).M(40, timeUnit2).a(d10);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new f());
            }
            z c10 = I.c();
            if (f21198b == null) {
                f21198b = (VahanProService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(VahanProService.class);
            }
            VahanProService vahanProService = f21198b;
            l.c(vahanProService);
            return vahanProService;
        }
    }

    @POST("vahan/vahancapi/common/afterpayment")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> afterPayment(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/bookappointment/checkSucessfulPaymentorNot")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> checkPaymentStatusForSlot(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/bookappointment/getuserdetailsdobjdata")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> checkSlotEligibility(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/fillvmonlineconfigurationdata")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> checkStateCoustomization(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/checkhold")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> checkhold(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("VahanAadhaarService/aadhaar/authekyc/generateResponse")
    @Headers({"Content-Type: application/xml"})
    Call<e0> doAadhaarRequest(@Body c0 c0Var);

    @POST("vahan/vahancapi/common/getNOCCertificate")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> downloadNoc(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/esign/getEsignUrl")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> eSign(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/fillvmonlineservicechecksdata")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAadMobCheck(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/fillvmauthenticationdata")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAadharFacelessAppCheck(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/beforepayment")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getBeforPaymentUrl(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/bookappointment/getcounterbyservicesalloted")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getCounterIdForSlot(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getfeedetails")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getFeesDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getprefilledforms")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getFormDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/noccancel/fillvmnocreasondata")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getNocReasonData(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/updatemobile/getMobileNo")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getOwnerDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getownerDetailsInurancePuccPermit")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getRcValues(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getdupreason")
    @Headers({"Content-Type: application/xml"})
    Call<SecurityModle> getReson(@Body c0 c0Var, @Header("timestamp") String str);

    @GET
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<FancyRto> getRtoNameForFancy(@Url String str);

    @POST("vahan/vahancapi/common/getOfficeListByStateCode")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getRtoNameForNoc(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/bookappointment/getavailabledataforbookappt")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getSlotAppointmentByDate(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/getstate_cdOffcd")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getStateCode(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getstates")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getStateMasterList(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/validateregandchasino")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getValidateregandchasino(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/getallowedservicesbyregnno")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getallowedservices(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/updatemobile/getclassanddescription")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getclassDes(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/getdistrictlistbyStateCode")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getdistict(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/hpt/gethptdetails")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> gethptDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/masterconfig/getdatafrofinlsubmit")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> requestForBefoPayment(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/duprcappl")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> requestForduplicateRc(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/hpt/hptdraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> requestHptService(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/bookappointment/savebookapptdetails")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> saveSlotAppointmentDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/coa/coadraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendChangeOfAddress(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/finalsubmitduprc")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> submitFinalRequest(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/noc/savenocdraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> submitRequestForNocDraft(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/validateaadhaardatabyregno")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> validateAadhaar(@Body c0 c0Var, @Header("timestamp") String str);
}
