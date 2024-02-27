package bi;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.lifecycle.t0;
import com.nic.mparivahan.Citizen.Models.Vhclass;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Tax.Model.TaxOwnerDetailsPuccPermit;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadNocHomeScreen;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanModel.ApFacelessCheckModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.EgblityStatus;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.FormDetailsSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NocDownload;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.SaveSlotBookingModel;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.ValidateChassinoRes;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentByDateResponse;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentRequest;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotCounterResponseDetails;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotPaymaentStatusResponse;
import id.c;
import j$.util.Base64;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import v9.d;
import wd.f1;

public final class h extends t0 {
    private final androidx.lifecycle.a0 A = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 A0 = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 B = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 B0 = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 C = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 C0 = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 D = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 D0 = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 E = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 F = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 G = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 H = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 I = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 J = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 K = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 L = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 M = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 N = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 O = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 P = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 Q = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 R = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 S = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 T = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 U = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 V = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 W = new androidx.lifecycle.a0();
    private androidx.lifecycle.a0 X = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 Y = new androidx.lifecycle.a0();
    private final androidx.lifecycle.a0 Z = new androidx.lifecycle.a0();

    /* renamed from: a0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19552a0 = new androidx.lifecycle.a0();

    /* renamed from: b0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19553b0 = new androidx.lifecycle.a0();

    /* renamed from: c0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19554c0 = new androidx.lifecycle.a0();

    /* renamed from: d  reason: collision with root package name */
    private final wg.d f19555d;

    /* renamed from: d0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19556d0 = new androidx.lifecycle.a0();

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19557e = new androidx.lifecycle.a0();

    /* renamed from: e0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19558e0 = new androidx.lifecycle.a0();

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19559f = new androidx.lifecycle.a0();

    /* renamed from: f0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19560f0 = new androidx.lifecycle.a0();

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19561g = new androidx.lifecycle.a0();

    /* renamed from: g0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19562g0 = new androidx.lifecycle.a0();

    /* renamed from: h  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19563h = new androidx.lifecycle.a0();

    /* renamed from: h0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19564h0 = new androidx.lifecycle.a0();

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19565i = new androidx.lifecycle.a0();

    /* renamed from: i0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19566i0 = new androidx.lifecycle.a0();

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19567j = new androidx.lifecycle.a0();

    /* renamed from: j0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19568j0 = new androidx.lifecycle.a0();

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19569k = new androidx.lifecycle.a0();

    /* renamed from: k0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19570k0 = new androidx.lifecycle.a0();

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19571l = new androidx.lifecycle.a0();

    /* renamed from: l0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19572l0 = new androidx.lifecycle.a0();

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19573m = new androidx.lifecycle.a0();

    /* renamed from: m0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19574m0 = new androidx.lifecycle.a0();

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19575n = new androidx.lifecycle.a0();

    /* renamed from: n0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19576n0 = new androidx.lifecycle.a0();

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19577o = new androidx.lifecycle.a0();

    /* renamed from: o0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19578o0 = new androidx.lifecycle.a0();

    /* renamed from: p  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19579p = new androidx.lifecycle.a0();

    /* renamed from: p0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19580p0 = new androidx.lifecycle.a0();

    /* renamed from: q  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19581q = new androidx.lifecycle.a0();

    /* renamed from: q0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19582q0 = new androidx.lifecycle.a0();

    /* renamed from: r  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19583r = new androidx.lifecycle.a0();

    /* renamed from: r0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19584r0 = new androidx.lifecycle.a0();

    /* renamed from: s  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19585s = new androidx.lifecycle.a0();

    /* renamed from: s0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19586s0 = new androidx.lifecycle.a0();

    /* renamed from: t  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19587t = new androidx.lifecycle.a0();

    /* renamed from: t0  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19588t0 = new androidx.lifecycle.a0();

    /* renamed from: u  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19589u = new androidx.lifecycle.a0();

    /* renamed from: u0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19590u0 = new androidx.lifecycle.a0();

    /* renamed from: v  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19591v = new androidx.lifecycle.a0();

    /* renamed from: v0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19592v0 = new androidx.lifecycle.a0();

    /* renamed from: w  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19593w = new androidx.lifecycle.a0();

    /* renamed from: w0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19594w0 = new androidx.lifecycle.a0();

    /* renamed from: x  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19595x = new androidx.lifecycle.a0();

    /* renamed from: x0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19596x0 = new androidx.lifecycle.a0();

    /* renamed from: y  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19597y = new androidx.lifecycle.a0();

    /* renamed from: y0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19598y0 = new androidx.lifecycle.a0();

    /* renamed from: z  reason: collision with root package name */
    private final androidx.lifecycle.a0 f19599z = new androidx.lifecycle.a0();

    /* renamed from: z0  reason: collision with root package name */
    private androidx.lifecycle.a0 f19600z0 = new androidx.lifecycle.a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19602b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19603c;

        a(Context context, cm.u uVar, h hVar) {
            this.f19601a = context;
            this.f19602b = uVar;
            this.f19603c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19601a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "coadraft", aVar2.v(), aVar2.w());
            this.f19603c.x().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19601a, v9.d.f17494a.z(), "coadraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19602b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    cm.l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19602b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    cm.l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), ChaangeOfAddressStatus.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19603c.w().k((ChaangeOfAddressStatus) j10);
            } catch (Exception unused) {
                this.f19603c.x().k("error");
            }
        }
    }

    public static final class a0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19606c;

        a0(Context context, cm.u uVar, h hVar) {
            this.f19604a = context;
            this.f19605b = uVar;
            this.f19606c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19604a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getavailabledataforbookappt", aVar2.v(), aVar2.w());
            this.f19606c.M0().k("Network Issue");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19604a, v9.d.f17494a.z(), "getavailabledataforbookappt", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19605b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19605b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SlotAppointmentByDateResponse.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19606c.L0().k((SlotAppointmentByDateResponse) j10);
            } catch (Exception e10) {
                this.f19606c.M0().k("Error");
                Log.d("SlotAppointmentError", e10.getLocalizedMessage());
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19609c;

        b(Context context, cm.u uVar, h hVar) {
            this.f19607a = context;
            this.f19608b = uVar;
            this.f19609c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19607a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "fillvmonlineservicechecksdata", aVar2.v(), aVar2.w());
            this.f19609c.a1().k("Internet Issue");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19607a, v9.d.f17494a.z(), "fillvmonlineservicechecksdata", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19608b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19608b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), vahanOnlineCheck.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19609c.Z0().k((vahanOnlineCheck) j10);
            } catch (Exception e10) {
                this.f19609c.a1().k("error");
                e10.printStackTrace();
            }
        }
    }

    public static final class b0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19611b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19612c;

        b0(Context context, cm.u uVar, h hVar) {
            this.f19610a = context;
            this.f19611b = uVar;
            this.f19612c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19610a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getstates", aVar2.v(), aVar2.w());
            this.f19612c.W0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19610a, v9.d.f17494a.z(), "getstates", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19611b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19611b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), VahanStateModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19612c.U0().k((VahanStateModle) j10);
            } catch (Exception e10) {
                Log.d("StateMaster_error+", e10.getLocalizedMessage());
                e10.printStackTrace();
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19614b;

        c(Context context, h hVar) {
            this.f19613a = context;
            this.f19614b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19613a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "checkhold", aVar2.v(), aVar2.w());
            this.f19614b.z().k("error");
        }

        public void onResponse(Call call, Response response) {
            try {
                ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
                Context context = this.f19613a;
                String z10 = v9.d.f17494a.z();
                String str = null;
                String valueOf = String.valueOf(response != null ? Integer.valueOf(response.code()) : null);
                if (response != null) {
                    str = response.message();
                }
                aVar.a(context, z10, "checkhold", valueOf, String.valueOf(str));
                this.f19614b.y().k("Success");
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19614b.z().k("error");
            }
        }
    }

    public static final class c0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19617c;

        c0(Context context, cm.u uVar, h hVar) {
            this.f19615a = context;
            this.f19616b = uVar;
            this.f19617c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19615a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "validateaadhaardatabyregno", aVar2.v(), aVar2.w());
            this.f19617c.c1().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19615a, v9.d.f17494a.z(), "validateaadhaardatabyregno", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19616b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19616b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                if (p.o(valueOf, "true", true)) {
                    this.f19617c.b1().k(Boolean.TRUE);
                } else {
                    this.f19617c.c1().k(valueOf);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19617c.c1().k("Error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19620c;

        d(Context context, cm.u uVar, h hVar) {
            this.f19618a = context;
            this.f19619b = uVar;
            this.f19620c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19618a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "checkSucessfulPaymentorNot", aVar2.v(), aVar2.w());
            this.f19620c.M().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19618a, v9.d.f17494a.z(), "checkSucessfulPaymentorNot", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19619b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19619b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SlotPaymaentStatusResponse.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19620c.A().k((SlotPaymaentStatusResponse) j10);
            } catch (Exception e10) {
                Log.d("saveSlotBookingError", e10.getLocalizedMessage());
            }
        }
    }

    public static final class d0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19623c;

        d0(Context context, cm.u uVar, h hVar) {
            this.f19621a = context;
            this.f19622b = uVar;
            this.f19623c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19621a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "fillvmonlineconfigurationdata", aVar2.v(), aVar2.w());
            this.f19623c.h0().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19621a, v9.d.f17494a.z(), "fillvmonlineconfigurationdata", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19622b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19622b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("FinalRequest", valueOf);
                Object j10 = new i7.d().j(valueOf, StateCostForDms.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19623c.g0().k((StateCostForDms) j10);
            } catch (Exception e10) {
                this.f19623c.h0().k("error");
                Log.d("FinalRequest-ERROR", e10.getLocalizedMessage());
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19625b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19626c;

        e(Context context, cm.u uVar, h hVar) {
            this.f19624a = context;
            this.f19625b = uVar;
            this.f19626c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19624a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getuserdetailsdobjdata", aVar2.v(), aVar2.w());
            this.f19626c.S0().k("Internet Issue");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c5, code lost:
            if (ka.c.f13158a.m(" ") == false) goto L_0x00c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
            r10 = new org.json.JSONObject(" ");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
            if (r10.has("errorDesc") != false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
            r8.f19626c.S0().k(r10.getString("errorDesc"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
            r8.f19626c.S0().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
            r8.f19626c.S0().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00bf */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r9, retrofit2.Response r10) {
            /*
                r8 = this;
                java.lang.String r0 = "error"
                java.lang.String r1 = "errorDesc"
                java.lang.String r2 = "call"
                cm.l.f(r9, r2)
                java.lang.String r9 = "response"
                cm.l.f(r10, r9)
                java.lang.String r9 = " "
                com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00bf }
                android.content.Context r3 = r8.f19624a     // Catch:{ Exception -> 0x00bf }
                v9.d$a r4 = v9.d.f17494a     // Catch:{ Exception -> 0x00bf }
                java.lang.String r4 = r4.z()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r5 = "getuserdetailsdobjdata"
                int r6 = r10.code()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r7 = r10.message()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00bf }
                r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00bf }
                java.lang.Object r10 = r10.body()     // Catch:{ Exception -> 0x00bf }
                com.nic.mparivahan.Security.SecModle.SecurityModle r10 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r10     // Catch:{ Exception -> 0x00bf }
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00bf }
                r3 = 26
                java.lang.String r4 = "decode(...)"
                r5 = 0
                if (r2 < r3) goto L_0x0067
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00bf }
                cm.u r3 = r8.f19625b     // Catch:{ Exception -> 0x00bf }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bf }
                j$.util.Base64$Decoder r6 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00bf }
                if (r10 == 0) goto L_0x0050
                java.lang.String r5 = r10.getData()     // Catch:{ Exception -> 0x00bf }
            L_0x0050:
                byte[] r10 = r6.decode((java.lang.String) r5)     // Catch:{ Exception -> 0x00bf }
                cm.l.e(r10, r4)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00bf }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00bf }
                r4.<init>(r10, r5)     // Catch:{ Exception -> 0x00bf }
            L_0x005e:
                java.lang.String r10 = r2.a(r3, r4)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x00bf }
                goto L_0x0085
            L_0x0067:
                id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00bf }
                cm.u r3 = r8.f19625b     // Catch:{ Exception -> 0x00bf }
                java.lang.Object r3 = r3.f20234e     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bf }
                if (r10 == 0) goto L_0x0075
                java.lang.String r5 = r10.getData()     // Catch:{ Exception -> 0x00bf }
            L_0x0075:
                r10 = 0
                byte[] r10 = android.util.Base64.decode(r5, r10)     // Catch:{ Exception -> 0x00bf }
                cm.l.e(r10, r4)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x00bf }
                java.nio.charset.Charset r5 = km.d.f24740b     // Catch:{ Exception -> 0x00bf }
                r4.<init>(r10, r5)     // Catch:{ Exception -> 0x00bf }
                goto L_0x005e
            L_0x0085:
                ka.c$a r10 = ka.c.f13158a     // Catch:{ Exception -> 0x00bf }
                boolean r10 = r10.m(r9)     // Catch:{ Exception -> 0x00bf }
                if (r10 != 0) goto L_0x00f3
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bf }
                r10.<init>((java.lang.String) r9)     // Catch:{ Exception -> 0x00bf }
                boolean r2 = r10.has(r1)     // Catch:{ Exception -> 0x00bf }
                if (r2 == 0) goto L_0x00a6
                bi.h r2 = r8.f19626c     // Catch:{ Exception -> 0x00bf }
                androidx.lifecycle.a0 r2 = r2.S0()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r10 = r10.getString(r1)     // Catch:{ Exception -> 0x00bf }
            L_0x00a2:
                r2.k(r10)     // Catch:{ Exception -> 0x00bf }
                goto L_0x00f3
            L_0x00a6:
                i7.d r10 = new i7.d     // Catch:{ Exception -> 0x00bf }
                r10.<init>()     // Catch:{ Exception -> 0x00bf }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel> r2 = com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel.class
                java.lang.Object r10 = r10.j(r9, r2)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r2 = "fromJson(...)"
                cm.l.e(r10, r2)     // Catch:{ Exception -> 0x00bf }
                com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel r10 = (com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel) r10     // Catch:{ Exception -> 0x00bf }
                bi.h r2 = r8.f19626c     // Catch:{ Exception -> 0x00bf }
                androidx.lifecycle.a0 r2 = r2.T0()     // Catch:{ Exception -> 0x00bf }
                goto L_0x00a2
            L_0x00bf:
                ka.c$a r10 = ka.c.f13158a     // Catch:{ Exception -> 0x00ea }
                boolean r10 = r10.m(r9)     // Catch:{ Exception -> 0x00ea }
                if (r10 != 0) goto L_0x00e0
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ea }
                r10.<init>((java.lang.String) r9)     // Catch:{ Exception -> 0x00ea }
                boolean r9 = r10.has(r1)     // Catch:{ Exception -> 0x00ea }
                if (r9 == 0) goto L_0x00f3
                bi.h r9 = r8.f19626c     // Catch:{ Exception -> 0x00ea }
                androidx.lifecycle.a0 r9 = r9.S0()     // Catch:{ Exception -> 0x00ea }
                java.lang.String r10 = r10.getString(r1)     // Catch:{ Exception -> 0x00ea }
                r9.k(r10)     // Catch:{ Exception -> 0x00ea }
                goto L_0x00f3
            L_0x00e0:
                bi.h r9 = r8.f19626c     // Catch:{ Exception -> 0x00ea }
                androidx.lifecycle.a0 r9 = r9.S0()     // Catch:{ Exception -> 0x00ea }
                r9.k(r0)     // Catch:{ Exception -> 0x00ea }
                goto L_0x00f3
            L_0x00ea:
                bi.h r9 = r8.f19626c
                androidx.lifecycle.a0 r9 = r9.S0()
                r9.k(r0)
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.h.e.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class e0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19629c;

        e0(Context context, cm.u uVar, h hVar) {
            this.f19627a = context;
            this.f19628b = uVar;
            this.f19629c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19627a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getdistrictlistbyStateCode", aVar2.v(), aVar2.w());
            this.f19629c.E().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19627a, v9.d.f17494a.z(), "getdistrictlistbyStateCode", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19628b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19628b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DistictModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19629c.D().k((DistictModle) j10);
            } catch (Exception e10) {
                Log.d("OtpVerify_error+", e10.getLocalizedMessage());
                e10.printStackTrace();
            }
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19632c;

        f(Context context, cm.u uVar, h hVar) {
            this.f19630a = context;
            this.f19631b = uVar;
            this.f19632c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19630a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "fillvmauthenticationdata", aVar2.v(), aVar2.w());
            this.f19632c.r().k("error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19630a, v9.d.f17494a.z(), "fillvmauthenticationdata", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19631b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    cm.l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19631b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    cm.l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf = String.valueOf(aVar.a(str, str2));
                Log.d("checkSlotEligility", valueOf);
                Object j10 = new i7.d().j(valueOf, ApFacelessCheckModel.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19632c.q().k((ApFacelessCheckModel) j10);
            } catch (Exception unused) {
                this.f19632c.r().k("error");
            }
        }
    }

    public static final class f0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19633a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19635c;

        f0(Context context, cm.u uVar, h hVar) {
            this.f19633a = context;
            this.f19634b = uVar;
            this.f19635c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19633a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getdistrictlistbyStateCode", aVar2.v(), aVar2.w());
            this.f19635c.G().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19633a, v9.d.f17494a.z(), "getdistrictlistbyStateCode", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19634b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19634b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DistictModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19635c.F().k((DistictModle) j10);
            } catch (Exception e10) {
                Log.d("vhn_disLiveData+", e10.getLocalizedMessage());
                e10.printStackTrace();
            }
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19637b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19638c;

        g(Context context, cm.u uVar, h hVar) {
            this.f19636a = context;
            this.f19637b = uVar;
            this.f19638c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            this.f19638c.f0().k("Error");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19636a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getstate_cdOffcd", aVar2.v(), aVar2.w());
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            androidx.lifecycle.a0 f02;
            Object valueOf;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19636a, v9.d.f17494a.z(), "getstate_cdOffcd", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                String str3 = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19637b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    cm.l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19637b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    cm.l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                String valueOf2 = String.valueOf(aVar.a(str, str2));
                i7.d b10 = new i7.e().b();
                try {
                    Class<GetStateCode> cls = GetStateCode.class;
                    if (response.isSuccessful()) {
                        if (response.code() == 200) {
                            JSONObject jSONObject = new JSONObject(valueOf2);
                            if (jSONObject.has("errorDesc")) {
                                this.f19638c.f0().k(jSONObject.getString("errorDesc"));
                                return;
                            }
                            valueOf = (GetStateCode) b10.j(valueOf2, cls);
                            f02 = this.f19638c.e0();
                            f02.k(valueOf);
                        }
                    }
                    if (response.code() == 400) {
                        f02 = this.f19638c.f0();
                        valueOf = String.valueOf(((GetStateCode) b10.j(valueOf2, cls)).getErrorDesc());
                        f02.k(valueOf);
                    }
                } catch (Exception unused) {
                    Log.e("Print ---", "22");
                    this.f19638c.f0().k("Error");
                }
            } catch (Exception unused2) {
                this.f19638c.f0().k("Error");
            }
        }
    }

    public static final class g0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19641c;

        g0(Context context, cm.u uVar, h hVar) {
            this.f19639a = context;
            this.f19640b = uVar;
            this.f19641c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19639a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getfeedetails", aVar2.v(), aVar2.w());
            this.f19641c.P().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19639a, v9.d.f17494a.z(), "getfeedetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19640b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19640b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), FeesModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19641c.O().k((FeesModle) j10);
            } catch (Exception e10) {
                this.f19641c.P().k("Error");
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: bi.h$h  reason: collision with other inner class name */
    public static final class C0262h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19642a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f19645d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DownloadNocHomeScreen f19646e;

        C0262h(Context context, cm.u uVar, String str, h hVar, DownloadNocHomeScreen downloadNocHomeScreen) {
            this.f19642a = context;
            this.f19643b = uVar;
            this.f19644c = str;
            this.f19645d = hVar;
            this.f19646e = downloadNocHomeScreen;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19642a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getNOCCertificate", aVar2.v(), aVar2.w());
            this.f19645d.o0().k("Error");
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19642a, v9.d.f17494a.z(), "getNOCCertificate", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19643b.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    cm.l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19643b.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    cm.l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), NocDownload.class);
                cm.l.e(j10, "fromJson(...)");
                NocDownload nocDownload = (NocDownload) j10;
                ApiMessage apiMessage = nocDownload.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200 || ka.c.f13158a.m(nocDownload.getData())) {
                    androidx.lifecycle.a0 o02 = this.f19645d.o0();
                    ApiMessage apiMessage2 = nocDownload.getApiMessage();
                    if (apiMessage2 != null) {
                        str3 = apiMessage2.getDeveloperMessage();
                    }
                    o02.k(String.valueOf(str3));
                    return;
                }
                byte[] decode3 = Base64.getDecoder().decode(nocDownload.getData());
                cm.l.e(decode3, "decode(...)");
                if (i10 >= 26) {
                    String str4 = this.f19644c;
                    if (this.f19645d.r1(decode3, str4, this.f19646e)) {
                        this.f19645d.n0().k(str4.toString());
                        return;
                    }
                    return;
                }
                throw new pl.n("An operation is not implemented: " + "VERSION.SDK_INT < O");
            } catch (Exception unused) {
                this.f19645d.o0().k("Error");
            }
        }
    }

    public static final class h0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19649c;

        h0(Context context, cm.u uVar, h hVar) {
            this.f19647a = context;
            this.f19648b = uVar;
            this.f19649c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19647a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "savebookapptdetails", aVar2.v(), aVar2.w());
            this.f19649c.O0().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19647a, v9.d.f17494a.z(), "savebookapptdetails", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19648b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19648b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SaveSlotBookingModel.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19649c.P0().k((SaveSlotBookingModel) j10);
            } catch (Exception e10) {
                Log.d("saveSlotBookingError", e10.getLocalizedMessage());
            }
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19651b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19652c;

        i(Context context, cm.u uVar, h hVar) {
            this.f19650a = context;
            this.f19651b = uVar;
            this.f19652c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19650a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "afterpayment", aVar2.v(), aVar2.w());
            this.f19652c.x0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19650a, v9.d.f17494a.z(), "afterpayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19651b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19651b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                JSONObject jSONObject = new JSONObject(valueOf);
                if (jSONObject.has("errorcode")) {
                    this.f19652c.x0().k(jSONObject.getString("errorDesc").toString());
                    return;
                }
                Object j10 = new i7.d().j(valueOf, AfterPaymentResponse.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19652c.w0().k((AfterPaymentResponse) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19652c.x0().k("Error");
            }
        }
    }

    public static final class i0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19655c;

        i0(Context context, cm.u uVar, h hVar) {
            this.f19653a = context;
            this.f19654b = uVar;
            this.f19655c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19653a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "duprcappl", aVar2.v(), aVar2.w());
            this.f19655c.K().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19653a, v9.d.f17494a.z(), "duprcappl", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19654b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19654b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), dulicateRcResponseModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19655c.J().k((dulicateRcResponseModle) j10);
            } catch (Exception e10) {
                this.f19655c.K().k("Error");
                Log.d("duplicateRcSubmiterror", e10.getLocalizedMessage());
            }
        }
    }

    public static final class j implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19658c;

        j(Context context, cm.u uVar, h hVar) {
            this.f19656a = context;
            this.f19657b = uVar;
            this.f19658c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19656a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getdatafrofinlsubmit", aVar2.v(), aVar2.w());
            this.f19658c.W().k("Error");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:4|5|6|(4:8|9|(1:11)|12)(3:14|(1:16)|17)|13|18|19|20|21|22|23|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00af */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r9, retrofit2.Response r10) {
            /*
                r8 = this;
                java.lang.String r0 = "call"
                cm.l.f(r9, r0)
                java.lang.String r9 = "response"
                cm.l.f(r10, r9)
                boolean r9 = r10.isSuccessful()
                java.lang.String r0 = "Error"
                if (r9 == 0) goto L_0x00b9
                int r9 = r10.code()
                r1 = 200(0xc8, float:2.8E-43)
                if (r9 != r1) goto L_0x00b9
                com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00c2 }
                android.content.Context r3 = r8.f19656a     // Catch:{ Exception -> 0x00c2 }
                v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r4 = r9.z()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r5 = "getdatafrofinlsubmit"
                int r9 = r10.code()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r9 = r10.message()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x00c2 }
                r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c2 }
                java.lang.Object r9 = r10.body()     // Catch:{ Exception -> 0x00c2 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00c2 }
                int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c2 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                r3 = 0
                if (r10 < r1) goto L_0x0071
                id.c$a r10 = id.c.f12675a     // Catch:{ Exception -> 0x00c2 }
                cm.u r1 = r8.f19657b     // Catch:{ Exception -> 0x00c2 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00c2 }
                j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00c2 }
                if (r9 == 0) goto L_0x005a
                java.lang.String r3 = r9.getData()     // Catch:{ Exception -> 0x00c2 }
            L_0x005a:
                byte[] r9 = r4.decode((java.lang.String) r3)     // Catch:{ Exception -> 0x00c2 }
                cm.l.e(r9, r2)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00c2 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x00c2 }
                r2.<init>(r9, r3)     // Catch:{ Exception -> 0x00c2 }
            L_0x0068:
                java.lang.String r9 = r10.a(r1, r2)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x008f
            L_0x0071:
                id.c$a r10 = id.c.f12675a     // Catch:{ Exception -> 0x00c2 }
                cm.u r1 = r8.f19657b     // Catch:{ Exception -> 0x00c2 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00c2 }
                if (r9 == 0) goto L_0x007f
                java.lang.String r3 = r9.getData()     // Catch:{ Exception -> 0x00c2 }
            L_0x007f:
                r9 = 0
                byte[] r9 = android.util.Base64.decode(r3, r9)     // Catch:{ Exception -> 0x00c2 }
                cm.l.e(r9, r2)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00c2 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x00c2 }
                r2.<init>(r9, r3)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x0068
            L_0x008f:
                i7.e r10 = new i7.e     // Catch:{ Exception -> 0x00c2 }
                r10.<init>()     // Catch:{ Exception -> 0x00c2 }
                i7.d r10 = r10.b()     // Catch:{ Exception -> 0x00c2 }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet> r1 = com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet.class
                java.lang.Object r9 = r10.j(r9, r1)     // Catch:{ Exception -> 0x00af }
                java.lang.String r10 = "fromJson(...)"
                cm.l.e(r9, r10)     // Catch:{ Exception -> 0x00af }
                com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet r9 = (com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet) r9     // Catch:{ Exception -> 0x00af }
                bi.h r10 = r8.f19658c     // Catch:{ Exception -> 0x00af }
                androidx.lifecycle.a0 r10 = r10.T()     // Catch:{ Exception -> 0x00af }
                r10.k(r9)     // Catch:{ Exception -> 0x00af }
                goto L_0x00c2
            L_0x00af:
                bi.h r9 = r8.f19658c     // Catch:{ Exception -> 0x00c2 }
                androidx.lifecycle.a0 r9 = r9.W()     // Catch:{ Exception -> 0x00c2 }
                r9.k(r0)     // Catch:{ Exception -> 0x00c2 }
                goto L_0x00c2
            L_0x00b9:
                bi.h r9 = r8.f19658c
                androidx.lifecycle.a0 r9 = r9.W()
                r9.k(r0)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.h.j.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class j0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19660b;

        j0(cm.u uVar, h hVar) {
            this.f19659a = uVar;
            this.f19660b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19660b.r0().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f19660b.r0().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = id.c.f12675a;
                str = (String) this.f19659a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                cm.l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = id.c.f12675a;
                str = (String) this.f19659a.f20234e;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                cm.l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            String valueOf = String.valueOf(aVar.a(str, str2));
            Log.d("ForNocDraft", valueOf);
            Object j10 = new i7.d().j(valueOf, NocDraftResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f19660b.q0().k((NocDraftResponse) j10);
        }
    }

    public static final class k implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19663c;

        k(Context context, cm.u uVar, h hVar) {
            this.f19661a = context;
            this.f19662b = uVar;
            this.f19663c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19661a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getdatafrofinlsubmit", aVar2.v(), aVar2.w());
            this.f19663c.W().k("Error");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:4|5|6|(4:8|9|(1:11)|12)(3:14|(1:16)|17)|13|18|19|20|21|22|23|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r7, retrofit2.Response r8) {
            /*
                r6 = this;
                java.lang.String r0 = "call"
                cm.l.f(r7, r0)
                java.lang.String r7 = "response"
                cm.l.f(r8, r7)
                com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r0 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
                android.content.Context r1 = r6.f19661a
                v9.d$a r7 = v9.d.f17494a
                java.lang.String r2 = r7.z()
                java.lang.String r3 = "getdatafrofinlsubmit"
                int r7 = r8.code()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r4 = java.lang.String.valueOf(r7)
                java.lang.String r7 = r8.message()
                java.lang.String r5 = java.lang.String.valueOf(r7)
                r0.a(r1, r2, r3, r4, r5)
                boolean r7 = r8.isSuccessful()
                java.lang.String r0 = "Error"
                if (r7 == 0) goto L_0x00bd
                int r7 = r8.code()
                r1 = 200(0xc8, float:2.8E-43)
                if (r7 != r1) goto L_0x00bd
                java.lang.Object r7 = r8.body()     // Catch:{ Exception -> 0x00c6 }
                com.nic.mparivahan.Security.SecModle.SecurityModle r7 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r7     // Catch:{ Exception -> 0x00c6 }
                int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c6 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                r3 = 0
                if (r8 < r1) goto L_0x0075
                id.c$a r8 = id.c.f12675a     // Catch:{ Exception -> 0x00c6 }
                cm.u r1 = r6.f19662b     // Catch:{ Exception -> 0x00c6 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00c6 }
                j$.util.Base64$Decoder r4 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00c6 }
                if (r7 == 0) goto L_0x005e
                java.lang.String r3 = r7.getData()     // Catch:{ Exception -> 0x00c6 }
            L_0x005e:
                byte[] r7 = r4.decode((java.lang.String) r3)     // Catch:{ Exception -> 0x00c6 }
                cm.l.e(r7, r2)     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00c6 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x00c6 }
                r2.<init>(r7, r3)     // Catch:{ Exception -> 0x00c6 }
            L_0x006c:
                java.lang.String r7 = r8.a(r1, r2)     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x0093
            L_0x0075:
                id.c$a r8 = id.c.f12675a     // Catch:{ Exception -> 0x00c6 }
                cm.u r1 = r6.f19662b     // Catch:{ Exception -> 0x00c6 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00c6 }
                if (r7 == 0) goto L_0x0083
                java.lang.String r3 = r7.getData()     // Catch:{ Exception -> 0x00c6 }
            L_0x0083:
                r7 = 0
                byte[] r7 = android.util.Base64.decode(r3, r7)     // Catch:{ Exception -> 0x00c6 }
                cm.l.e(r7, r2)     // Catch:{ Exception -> 0x00c6 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00c6 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x00c6 }
                r2.<init>(r7, r3)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x006c
            L_0x0093:
                i7.e r8 = new i7.e     // Catch:{ Exception -> 0x00c6 }
                r8.<init>()     // Catch:{ Exception -> 0x00c6 }
                i7.d r8 = r8.b()     // Catch:{ Exception -> 0x00c6 }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet> r1 = com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet.class
                java.lang.Object r7 = r8.j(r7, r1)     // Catch:{ Exception -> 0x00b3 }
                java.lang.String r8 = "fromJson(...)"
                cm.l.e(r7, r8)     // Catch:{ Exception -> 0x00b3 }
                com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet r7 = (com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet) r7     // Catch:{ Exception -> 0x00b3 }
                bi.h r8 = r6.f19663c     // Catch:{ Exception -> 0x00b3 }
                androidx.lifecycle.a0 r8 = r8.U()     // Catch:{ Exception -> 0x00b3 }
                r8.k(r7)     // Catch:{ Exception -> 0x00b3 }
                goto L_0x00c6
            L_0x00b3:
                bi.h r7 = r6.f19663c     // Catch:{ Exception -> 0x00c6 }
                androidx.lifecycle.a0 r7 = r7.V()     // Catch:{ Exception -> 0x00c6 }
                r7.k(r0)     // Catch:{ Exception -> 0x00c6 }
                goto L_0x00c6
            L_0x00bd:
                bi.h r7 = r6.f19663c
                androidx.lifecycle.a0 r7 = r7.W()
                r7.k(r0)
            L_0x00c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.h.k.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class k0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19666c;

        k0(Context context, cm.u uVar, h hVar) {
            this.f19664a = context;
            this.f19665b = uVar;
            this.f19666c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19664a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "hptdraft", aVar2.v(), aVar2.w());
            this.f19666c.m0().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            c.a aVar;
            String str;
            String str2;
            try {
                String str3 = null;
                ApiMonitorLog.f20957k.a(this.f19664a, v9.d.f17494a.z(), "hptdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    aVar = id.c.f12675a;
                    str = (String) this.f19665b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str3);
                    cm.l.e(decode, "decode(...)");
                    str2 = new String(decode, km.d.f24740b);
                } else {
                    aVar = id.c.f12675a;
                    str = (String) this.f19665b.f20234e;
                    if (securityModle != null) {
                        str3 = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str3, 0);
                    cm.l.e(decode2, "decode(...)");
                    str2 = new String(decode2, km.d.f24740b);
                }
                Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), HptTerResponse.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19666c.l0().k((HptTerResponse) j10);
            } catch (Exception unused) {
                this.f19666c.m0().k("Error");
            }
        }
    }

    public static final class l implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19669c;

        l(Context context, cm.u uVar, h hVar) {
            this.f19667a = context;
            this.f19668b = uVar;
            this.f19669c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19667a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "beforepayment", aVar2.v(), aVar2.w());
            this.f19669c.z0().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19667a, v9.d.f17494a.z(), "beforepayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19668b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19668b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("BeforePayment", valueOf);
                JSONObject jSONObject = new JSONObject(valueOf);
                if (jSONObject.has("returnUrl")) {
                    Object j10 = new i7.d().j(valueOf, PaymentBeforeUrlResponse.class);
                    cm.l.e(j10, "fromJson(...)");
                    this.f19669c.y0().k((PaymentBeforeUrlResponse) j10);
                } else if (jSONObject.has("errorDesc")) {
                    this.f19669c.z0().k(jSONObject.getString("errorDesc"));
                } else {
                    this.f19669c.z0().k("Error");
                }
            } catch (Exception e10) {
                this.f19669c.z0().k("Error");
                Log.e("BeforePayment_ERROR", e10.getStackTrace().toString());
            }
        }
    }

    public static final class l0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19670a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19671b;

        l0(cm.u uVar, h hVar) {
            this.f19670a = uVar;
            this.f19671b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19671b.R().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f19671b.R().k("error");
                    Log.d("FinalRequest-ERROR", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19670a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19670a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.d("FinalRequest", valueOf);
            Object j10 = new i7.d().j(valueOf, FinalRequestSubmitResponse.class);
            cm.l.e(j10, "fromJson(...)");
            this.f19671b.Q().k((FinalRequestSubmitResponse) j10);
        }
    }

    public static final class m implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19674c;

        m(Context context, cm.u uVar, h hVar) {
            this.f19672a = context;
            this.f19673b = uVar;
            this.f19674c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19672a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "beforepayment", aVar2.v(), aVar2.w());
            this.f19674c.z0().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19672a, v9.d.f17494a.z(), "beforepayment", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19673b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19673b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                JSONObject jSONObject = new JSONObject(valueOf);
                if (jSONObject.has("returnUrl")) {
                    Object j10 = new i7.d().j(valueOf, PaymentBeforeUrlResponse.class);
                    cm.l.e(j10, "fromJson(...)");
                    this.f19674c.y0().k((PaymentBeforeUrlResponse) j10);
                } else if (jSONObject.has("errorDesc")) {
                    this.f19674c.z0().k(jSONObject.getString("errorDesc"));
                } else {
                    this.f19674c.z0().k("Error");
                }
            } catch (Exception e10) {
                this.f19674c.z0().k("Error");
                Log.e("BeforePayment_ERROR", e10.getStackTrace().toString());
            }
        }
    }

    public static final class m0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19675a;

        m0(cm.u uVar) {
            this.f19675a = uVar;
        }

        public void onFailure(Call call, Throwable th2) {
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    Log.d("FinalRequest-ERROR", e10.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19675a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19675a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), FinalRequestSubmitResponse.class);
            cm.l.e(j10, "fromJson(...)");
            FinalRequestSubmitResponse finalRequestSubmitResponse = (FinalRequestSubmitResponse) j10;
        }
    }

    public static final class n implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19677b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19678c;

        n(Context context, cm.u uVar, h hVar) {
            this.f19676a = context;
            this.f19677b = uVar;
            this.f19678c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19676a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformationforinsurancepuccpermit", aVar2.v(), "Connection time out");
            this.f19678c.H0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            Object obj;
            androidx.lifecycle.a0 G0;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19676a, v9.d.f17494a.z(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19677b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19677b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Class<Vhclass> cls = Vhclass.class;
                if (response != null) {
                    if (response.code() == 200) {
                        JSONObject jSONObject = new JSONObject(valueOf);
                        if (jSONObject.has("errorDesc")) {
                            G0 = this.f19678c.H0();
                            obj = jSONObject.getString("errorDesc").toString();
                        } else {
                            Object j10 = new i7.e().b().j(valueOf, cls);
                            cm.l.e(j10, "fromJson(...)");
                            obj = (Vhclass) j10;
                            G0 = this.f19678c.G0();
                        }
                        G0.k(obj);
                        return;
                    }
                }
                if (response == null || response.code() != 400) {
                    Object j11 = new i7.e().b().j(valueOf, cls);
                    cm.l.e(j11, "fromJson(...)");
                    obj = (Vhclass) j11;
                    G0 = this.f19678c.G0();
                    G0.k(obj);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(valueOf);
                if (jSONObject2.has("errorDesc")) {
                    G0 = this.f19678c.H0();
                    obj = jSONObject2.getString("errorDesc").toString();
                    G0.k(obj);
                    return;
                }
                this.f19678c.H0().k("error");
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19678c.H0().k("error");
            }
        }
    }

    public static final class n0 implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19680b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19681c;

        n0(Context context, cm.u uVar, h hVar) {
            this.f19679a = context;
            this.f19680b = uVar;
            this.f19681c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19679a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "validateregandchasino", aVar2.v(), aVar2.w());
            this.f19681c.f1().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                ApiMonitorLog.f20957k.a(this.f19679a, v9.d.f17494a.z(), "validateregandchasino", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str = (String) this.f19680b.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str2 = (String) this.f19680b.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                try {
                    ValidateChassinoRes validateChassinoRes = (ValidateChassinoRes) new i7.e().b().j(String.valueOf(a10), ValidateChassinoRes.class);
                    String chasi_no = validateChassinoRes.getChasi_no();
                    if (chasi_no != null) {
                        if (chasi_no.length() != 0) {
                            this.f19681c.e1().k("200");
                            return;
                        }
                    }
                    if (p.p(validateChassinoRes.getErrorcode(), "400", false, 2, (Object) null)) {
                        this.f19681c.f1().k(String.valueOf(validateChassinoRes.getErrorDesc()));
                    } else {
                        this.f19681c.f1().k("Service temporarily unavailable, Please try again later.");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f19681c.f1().k("Service temporarily unavailable, Please try again later.");
                }
            } catch (Exception e11) {
                Log.d("validateRcNumber++", e11.getLocalizedMessage());
                this.f19681c.f1().k("Service temporarily unavailable, Please try again later.");
            }
        }
    }

    public static final class o implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19683b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19684c;

        o(Context context, cm.u uVar, h hVar) {
            this.f19682a = context;
            this.f19683b = uVar;
            this.f19684c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19682a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getcounterbyservicesalloted", aVar2.v(), aVar2.w());
            this.f19684c.R0().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19682a, v9.d.f17494a.z(), "getcounterbyservicesalloted", String.valueOf(Integer.valueOf(response.code())), String.valueOf(response.message()));
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19683b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19683b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SlotCounterResponseDetails.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19684c.Q0().k((SlotCounterResponseDetails) j10);
            } catch (Exception e10) {
                Log.d("checkSlotError", e10.getLocalizedMessage());
                this.f19684c.R0().k("Error");
            }
        }
    }

    public static final class p implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19687c;

        p(Context context, cm.u uVar, h hVar) {
            this.f19685a = context;
            this.f19686b = uVar;
            this.f19687c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19685a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getallowedservicesbyregnno", aVar2.v(), aVar2.w());
            this.f19687c.E().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19685a, v9.d.f17494a.z(), "getallowedservicesbyregnno", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19686b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19686b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), EgblityStatus.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19687c.X().k((EgblityStatus) j10);
            } catch (Exception e10) {
                Log.d("getEgblity-ERROR", e10.getLocalizedMessage());
                this.f19687c.Y().k("ERROR");
            }
        }
    }

    public static final class q implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19688a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19689b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19690c;

        q(Context context, cm.u uVar, h hVar) {
            this.f19688a = context;
            this.f19689b = uVar;
            this.f19690c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            cm.l.f(th2, "t");
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19688a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getprefilledforms", aVar2.v(), aVar2.w());
            this.f19690c.Z().k("Error");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            androidx.lifecycle.a0 Z;
            Object obj;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                ApiMonitorLog.f20957k.a(this.f19688a, v9.d.f17494a.z(), "getprefilledforms", String.valueOf(response.code()), response.message().toString());
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str = (String) this.f19689b.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str2 = (String) this.f19689b.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Log.d("validateRcNumber", valueOf);
                try {
                    FormDetailsSuccessModel formDetailsSuccessModel = (FormDetailsSuccessModel) new i7.e().b().j(valueOf, FormDetailsSuccessModel.class);
                    if (response.isSuccessful() && response.code() == 200) {
                        Z = this.f19690c.a0();
                        obj = formDetailsSuccessModel;
                    } else if (p.p(formDetailsSuccessModel.getErrorcode(), "400", false, 2, (Object) null)) {
                        Z = this.f19690c.Z();
                        obj = String.valueOf(formDetailsSuccessModel.getErrorDesc());
                    } else {
                        this.f19690c.Z().k("Service temporarily unavailable, Please try again later.");
                        return;
                    }
                    Z.k(obj);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f19690c.Z().k("Service temporarily unavailable, Please try again later.");
                }
            } catch (Exception e11) {
                Log.d("validateRcNumber++", e11.getLocalizedMessage());
                this.f19690c.Z().k("Service temporarily unavailable, Please try again later.");
            }
        }
    }

    public static final class r implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19693c;

        r(Context context, cm.u uVar, h hVar) {
            this.f19691a = context;
            this.f19692b = uVar;
            this.f19693c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19691a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "gethptdetails", aVar2.v(), aVar2.w());
            this.f19693c.k0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19691a, v9.d.f17494a.z(), "gethptdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19692b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19692b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), HptDetailsModle.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19693c.j0().k((HptDetailsModle) j10);
            } catch (Exception e10) {
                Log.d("gethptdet-err", e10.getLocalizedMessage());
                e10.printStackTrace();
            }
        }
    }

    public static final class s implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19695b;

        s(cm.u uVar, h hVar) {
            this.f19694a = uVar;
            this.f19695b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19695b.c0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19694a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19694a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), NocReasonModle.class);
            cm.l.e(j10, "fromJson(...)");
            this.f19695b.b0().k((NocReasonModle) j10);
        }
    }

    public static final class t implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19696a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19697b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f19698c;

        t(cm.u uVar, h hVar, Context context) {
            this.f19696a = uVar;
            this.f19697b = hVar;
            this.f19698c = context;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19698c;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformation", aVar2.v(), aVar2.w());
            this.f19697b.t0().k("Error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            androidx.lifecycle.a0 t02;
            String string;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f19697b.t0().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19696a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19696a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            JSONObject jSONObject = new JSONObject(String.valueOf(a10));
            JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
            if (jSONObject2.getInt("statusCode") == 200) {
                string = jSONObject.getJSONObject("data").getString("mobileNo");
                t02 = this.f19697b.s0();
            } else {
                t02 = this.f19697b.t0();
                string = jSONObject2.getString("developerMessage");
            }
            t02.k(string);
        }
    }

    public static final class u implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19701c;

        u(Context context, cm.u uVar, h hVar) {
            this.f19699a = context;
            this.f19700b = uVar;
            this.f19701c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19699a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformationforinsurancepuccpermit", aVar2.v(), aVar2.w());
            this.f19701c.X0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19699a, v9.d.f17494a.z(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19700b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19700b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.e().b().j(new JSONObject(String.valueOf(a10)).getString("data").toString(), TaxOwnerDetailsPuccPermit.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19701c.Y0().k((TaxOwnerDetailsPuccPermit) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19701c.X0().k("error");
            }
        }
    }

    public static final class v implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19704c;

        v(Context context, cm.u uVar, h hVar) {
            this.f19702a = context;
            this.f19703b = uVar;
            this.f19704c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19702a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformationforinsurancepuccpermit", aVar2.v(), "Connection time out");
            this.f19704c.C0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            Object obj;
            androidx.lifecycle.a0 D0;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19702a, v9.d.f17494a.z(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19703b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19703b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                String valueOf = String.valueOf(a10);
                Class<OwnerDetailPuccPermit> cls = OwnerDetailPuccPermit.class;
                if (response != null) {
                    if (response.code() == 200) {
                        JSONObject jSONObject = new JSONObject(valueOf);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                        if (jSONObject2.getInt("statusCode") == 400) {
                            this.f19704c.C0().k(jSONObject2.getString("developerMessage").toString());
                            return;
                        }
                        Object j10 = new i7.e().b().j(jSONObject.getJSONObject("data").toString(), cls);
                        cm.l.e(j10, "fromJson(...)");
                        obj = (OwnerDetailPuccPermit) j10;
                        D0 = this.f19704c.D0();
                        D0.k(obj);
                        return;
                    }
                }
                if (response == null || response.code() != 400) {
                    Object j11 = new i7.e().b().j(valueOf, cls);
                    cm.l.e(j11, "fromJson(...)");
                    obj = (OwnerDetailPuccPermit) j11;
                    D0 = this.f19704c.D0();
                    D0.k(obj);
                    return;
                }
                JSONObject jSONObject3 = new JSONObject(valueOf).getJSONObject("apiMessage");
                if (jSONObject3.has("developerMessage")) {
                    D0 = this.f19704c.C0();
                    obj = jSONObject3.getString("developerMessage").toString();
                    D0.k(obj);
                    return;
                }
                this.f19704c.C0().k("error");
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19704c.C0().k("error");
            }
        }
    }

    public static final class w implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19706b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19707c;

        w(Context context, cm.u uVar, h hVar) {
            this.f19705a = context;
            this.f19706b = uVar;
            this.f19707c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19705a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "ownerinformationforinsurancepuccpermit", aVar2.v(), aVar2.w());
            this.f19707c.F0().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19705a, v9.d.f17494a.z(), "ownerinformationforinsurancepuccpermit", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19706b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19706b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.e().b().j(new JSONObject(String.valueOf(a10)).getJSONObject("data").toString(), OwnerDetailPuccPermit.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19707c.E0().k((OwnerDetailPuccPermit) j10);
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f19707c.F0().k("error");
            }
        }
    }

    public static final class x implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ cm.u f19709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f19710c;

        x(Context context, cm.u uVar, h hVar) {
            this.f19708a = context;
            this.f19709b = uVar;
            this.f19710c = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f19708a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getdupreason", aVar2.v(), aVar2.w());
            this.f19710c.I().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            try {
                String str = null;
                ApiMonitorLog.f20957k.a(this.f19708a, v9.d.f17494a.z(), "getdupreason", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = id.c.f12675a;
                    String str2 = (String) this.f19709b.f20234e;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = id.c.f12675a;
                    String str3 = (String) this.f19709b.f20234e;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DReasonResponse.class);
                cm.l.e(j10, "fromJson(...)");
                this.f19710c.H().k((DReasonResponse) j10);
            } catch (Exception e10) {
                Log.d("getReson_error+", e10.getLocalizedMessage());
                e10.printStackTrace();
                this.f19710c.I().k("Error");
            }
        }
    }

    public static final class y implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19712b;

        y(cm.u uVar, h hVar) {
            this.f19711a = uVar;
            this.f19712b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19712b.E().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19711a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19711a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            this.f19712b.d0().k(VContant.Companion.i(String.valueOf(a10)));
        }
    }

    public static final class z implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f19713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19714b;

        z(cm.u uVar, h hVar) {
            this.f19713a = uVar;
            this.f19714b = hVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19714b.E().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f19714b.E().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = id.c.f12675a;
                String str2 = (String) this.f19713a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                cm.l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = id.c.f12675a;
                String str3 = (String) this.f19713a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                cm.l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            new i7.d();
            this.f19714b.d0().k(VContant.Companion.g(valueOf));
        }
    }

    public h(wg.d dVar) {
        cm.l.f(dVar, "repository");
        this.f19555d = dVar;
    }

    /* access modifiers changed from: private */
    public final boolean r1(byte[] bArr, String str, DownloadNocHomeScreen downloadNocHomeScreen) {
        try {
            System.currentTimeMillis();
            File filesDir = downloadNocHomeScreen.getFilesDir();
            File file = new File(filesDir, "fitness_pdf_file.pdf");
            Log.e("filepath", filesDir.getPath().toString());
            if (file.exists()) {
                file.delete();
            }
            s1(bArr, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s1(byte[] r3, java.io.File r4) {
        /*
            r2 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0018 }
            r1.<init>(r4)     // Catch:{ all -> 0x0018 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0018 }
            r4.<init>(r1)     // Catch:{ all -> 0x0018 }
            r4.write(r3)     // Catch:{ all -> 0x0015 }
            r4.flush()     // Catch:{ Exception -> 0x0014 }
            r4.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            r3 = move-exception
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x0021
            r0.flush()     // Catch:{ Exception -> 0x0021 }
            r0.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.h.s1(byte[], java.io.File):void");
    }

    public final androidx.lifecycle.a0 A() {
        return this.F;
    }

    public final void A0(Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        cm.l.f(context, "context");
        String str5 = str;
        cm.l.f(str5, "rc");
        String str6 = str2;
        cm.l.f(str6, "state_code");
        cm.l.f(str3, "pcode");
        String str7 = str4;
        cm.l.f(str7, "chassi_no");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        VUtility.a aVar2 = VUtility.Companion;
        String k10 = gVar.k();
        cm.l.c(string);
        String jSONObject = aVar2.T(str5, str6, k10, string, gVar.l(), gVar.e(), str7).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.o(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new v(context, uVar, this));
    }

    public final void B(Context context, String str, String str2) {
        cm.l.f(context, "context");
        cm.l.f(str, "rc");
        cm.l.f(str2, "state_code");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("regnNo", (Object) str);
        jSONObject.put("stateCode", (Object) str2);
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        cm.l.e(jSONObject2, "toString(...)");
        this.f19555d.w(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new n(context, uVar, this));
    }

    public final void B0(Context context, String str, String str2, String str3) {
        Context context2 = context;
        cm.l.f(context, "context");
        String str4 = str;
        cm.l.f(str4, "rc");
        String str5 = str2;
        cm.l.f(str5, "state_code");
        String str6 = str3;
        cm.l.f(str6, "chassi_no");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        VUtility.a aVar2 = VUtility.Companion;
        String k10 = gVar.k();
        cm.l.c(string);
        String jSONObject = aVar2.T(str4, str5, k10, string, gVar.l(), gVar.e(), str6).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.o(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new w(context, uVar, this));
    }

    public final void C(Context context, String str, String str2, String str3) {
        cm.l.f(context, "context");
        cm.l.f(str, "stateCode");
        cm.l.f(str2, "offCd");
        cm.l.f(str3, "purCd");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.p(str, str2, str3).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.j(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new o(context, uVar, this));
    }

    public final androidx.lifecycle.a0 C0() {
        return this.f19576n0;
    }

    public final androidx.lifecycle.a0 D() {
        return this.f19565i;
    }

    public final androidx.lifecycle.a0 D0() {
        return this.f19574m0;
    }

    public final androidx.lifecycle.a0 E() {
        return this.f19567j;
    }

    public final androidx.lifecycle.a0 E0() {
        return this.f19590u0;
    }

    public final androidx.lifecycle.a0 F() {
        return this.f19569k;
    }

    public final androidx.lifecycle.a0 F0() {
        return this.f19592v0;
    }

    public final androidx.lifecycle.a0 G() {
        return this.f19571l;
    }

    public final androidx.lifecycle.a0 G0() {
        return this.f19578o0;
    }

    public final androidx.lifecycle.a0 H() {
        return this.f19597y;
    }

    public final androidx.lifecycle.a0 H0() {
        return this.f19580p0;
    }

    public final androidx.lifecycle.a0 I() {
        return this.f19599z;
    }

    public final void I0(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "getResonForDuplicate");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.e0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.p(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new x(context, uVar, this));
    }

    public final androidx.lifecycle.a0 J() {
        return this.A;
    }

    public final void J0(String str) {
        cm.l.f(str, "state_code");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.b0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.q(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new y(uVar, this));
    }

    public final androidx.lifecycle.a0 K() {
        return this.B;
    }

    public final void K0(String str) {
        cm.l.f(str, "state_code");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.b0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.q(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new z(uVar, this));
    }

    public final void L(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "regNo");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.j(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.v(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new p(context, uVar, this));
    }

    public final androidx.lifecycle.a0 L0() {
        return this.C;
    }

    public final androidx.lifecycle.a0 M() {
        return this.G;
    }

    public final androidx.lifecycle.a0 M0() {
        return this.H;
    }

    public final androidx.lifecycle.a0 N() {
        return this.A0;
    }

    public final void N0(Context context, SlotAppointmentRequest slotAppointmentRequest) {
        cm.l.f(context, "context");
        cm.l.f(slotAppointmentRequest, "requestBody");
        String t10 = new i7.d().t(slotAppointmentRequest);
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        cm.l.c(t10);
        this.f19555d.r(aVar.f(b10, t10), (String) uVar.f20234e).enqueue(new a0(context, uVar, this));
    }

    public final androidx.lifecycle.a0 O() {
        return this.f19577o;
    }

    public final androidx.lifecycle.a0 O0() {
        return this.T;
    }

    public final androidx.lifecycle.a0 P() {
        return this.f19579p;
    }

    public final androidx.lifecycle.a0 P0() {
        return this.S;
    }

    public final androidx.lifecycle.a0 Q() {
        return this.W;
    }

    public final androidx.lifecycle.a0 Q0() {
        return this.D;
    }

    public final androidx.lifecycle.a0 R() {
        return this.X;
    }

    public final androidx.lifecycle.a0 R0() {
        return this.E;
    }

    public final void S(Context context, String str, String str2, String str3, String str4) {
        cm.l.f(context, "context");
        cm.l.f(str, "state_code");
        cm.l.f(str2, "offCd");
        cm.l.f(str3, "applnNo");
        cm.l.f(str4, "regn_no");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.o0(str4, str, str2, str3).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.l(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new q(context, uVar, this));
    }

    public final androidx.lifecycle.a0 S0() {
        return this.Z;
    }

    public final androidx.lifecycle.a0 T() {
        return this.f19566i0;
    }

    public final androidx.lifecycle.a0 T0() {
        return this.Y;
    }

    public final androidx.lifecycle.a0 U() {
        return this.f19586s0;
    }

    public final androidx.lifecycle.a0 U0() {
        return this.f19561g;
    }

    public final androidx.lifecycle.a0 V() {
        return this.f19588t0;
    }

    public final void V0(Context context) {
        cm.l.f(context, "context");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.X().toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.t(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b0(context, uVar, this));
    }

    public final androidx.lifecycle.a0 W() {
        return this.f19568j0;
    }

    public final androidx.lifecycle.a0 W0() {
        return this.f19563h;
    }

    public final androidx.lifecycle.a0 X() {
        return this.f19557e;
    }

    public final androidx.lifecycle.a0 X0() {
        return this.f19600z0;
    }

    public final androidx.lifecycle.a0 Y() {
        return this.f19559f;
    }

    public final androidx.lifecycle.a0 Y0() {
        return this.f19598y0;
    }

    public final androidx.lifecycle.a0 Z() {
        return this.f19564h0;
    }

    public final androidx.lifecycle.a0 Z0() {
        return this.f19552a0;
    }

    public final androidx.lifecycle.a0 a0() {
        return this.f19562g0;
    }

    public final androidx.lifecycle.a0 a1() {
        return this.f19553b0;
    }

    public final androidx.lifecycle.a0 b0() {
        return this.M;
    }

    public final androidx.lifecycle.a0 b1() {
        return this.f19594w0;
    }

    public final androidx.lifecycle.a0 c0() {
        return this.N;
    }

    public final androidx.lifecycle.a0 c1() {
        return this.f19596x0;
    }

    public final androidx.lifecycle.a0 d0() {
        return this.O;
    }

    public final void d1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "request");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.G(um.c0.Companion.f(um.x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new c0(context, uVar, this));
    }

    public final androidx.lifecycle.a0 e0() {
        return this.f19570k0;
    }

    public final androidx.lifecycle.a0 e1() {
        return this.f19558e0;
    }

    public final androidx.lifecycle.a0 f0() {
        return this.f19572l0;
    }

    public final androidx.lifecycle.a0 f1() {
        return this.f19560f0;
    }

    public final void g(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        cm.l.f(context, "context");
        cm.l.f(str, "c_add1");
        cm.l.f(str2, "c_add2");
        cm.l.f(str3, "c_add3");
        cm.l.f(str4, "c_dist");
        cm.l.f(str5, "c_pincode");
        cm.l.f(str6, "c_state");
        cm.l.f(str7, "from_dt");
        cm.l.f(str8, "p_add1");
        cm.l.f(str9, "p_add2");
        cm.l.f(str10, "p_add3");
        cm.l.f(str11, "p_district");
        cm.l.f(str12, "p_pincode");
        cm.l.f(str13, "p_state");
        cm.l.f(str14, "regn_no");
        cm.l.f(str15, "state_code");
        cm.l.f(str16, "off_code");
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = f1.f32517a.a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16).toString();
        cm.l.e(jSONObject, "toString(...)");
        um.c0 f10 = aVar.f(b10, jSONObject);
        cm.u uVar = new cm.u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar.f20234e = valueOf;
        this.f19555d.D(f10, valueOf).enqueue(new a(context, uVar, this));
    }

    public final androidx.lifecycle.a0 g0() {
        return this.U;
    }

    public final void g1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "state_code");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.p0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.e(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d0(context, uVar, this));
    }

    public final androidx.lifecycle.a0 h0() {
        return this.V;
    }

    public final void h1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "state_code");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.b0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.x(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e0(context, uVar, this));
    }

    public final void i(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "statecode");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.p0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.g(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(context, uVar, this));
    }

    public final void i0(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rc_number");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.f0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.y(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new r(context, uVar, this));
    }

    public final void i1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "state_code");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.b0(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.x(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f0(context, uVar, this));
    }

    public final void j(Context context, String str, String str2) {
        cm.l.f(context, "context");
        cm.l.f(str, "application");
        cm.l.f(str2, "state_code");
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.H(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.b(aVar.f(b10, jSONObject), valueOf).enqueue(new c(context, this));
    }

    public final androidx.lifecycle.a0 j0() {
        return this.f19589u;
    }

    public final void j1(Context context, String str, String str2, String str3) {
        cm.l.f(context, "context");
        cm.l.f(str, "regn_no");
        cm.l.f(str2, "state_code");
        cm.l.f(str3, "purCode");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.B(str, str2, str3).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.k(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g0(context, uVar, this));
    }

    public final void k(Context context, String str, String str2) {
        cm.l.f(context, "context");
        cm.l.f(str, "applNo");
        cm.l.f(str2, "purCd");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.l(str, str2).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(context, uVar, this));
    }

    public final androidx.lifecycle.a0 k0() {
        return this.f19591v;
    }

    public final void k1(Context context, JSONArray jSONArray) {
        cm.l.f(context, "context");
        cm.l.f(jSONArray, "request");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONArray2 = jSONArray.toString();
        cm.l.e(jSONArray2, "toString(...)");
        this.f19555d.C(aVar.f(b10, jSONArray2), (String) uVar.f20234e).enqueue(new h0(context, uVar, this));
    }

    public final void l(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "applNo");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.k(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(context, uVar, this));
    }

    public final androidx.lifecycle.a0 l0() {
        return this.f19593w;
    }

    public final void l1(Context context, duprcDtoRequestModle duprcdtorequestmodle) {
        cm.l.f(context, "context");
        cm.l.f(duprcdtorequestmodle, "duplicate_Rc_request");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.A(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.n0(duprcdtorequestmodle).toString()), (String) uVar.f20234e).enqueue(new i0(context, uVar, this));
    }

    public final void m(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "statecode");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.C(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.h(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(context, uVar, this));
    }

    public final androidx.lifecycle.a0 m0() {
        return this.f19595x;
    }

    public final void m1(NocDraftRequestParam nocDraftRequestParam) {
        cm.l.f(nocDraftRequestParam, "noc");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.F(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.l0(nocDraftRequestParam).toString()), (String) uVar.f20234e).enqueue(new j0(uVar, this));
    }

    public final void n(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rc");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.W(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.s(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new g(context, uVar, this));
    }

    public final androidx.lifecycle.a0 n0() {
        return this.C0;
    }

    public final void n1(Context context, HPTRequestParamModle hPTRequestParamModle) {
        cm.l.f(context, "context");
        cm.l.f(hPTRequestParamModle, "hpt_request");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.B(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.k0(hPTRequestParamModle).toString()), (String) uVar.f20234e).enqueue(new k0(context, uVar, this));
    }

    public final void o(Context context, String str, DownloadNocHomeScreen downloadNocHomeScreen) {
        cm.l.f(context, "context");
        cm.l.f(str, "application_no");
        cm.l.f(downloadNocHomeScreen, "noc");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("applNo", (Object) str);
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        cm.l.e(jSONObject2, "toString(...)");
        this.f19555d.f(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0262h(context, uVar, str, this, downloadNocHomeScreen));
    }

    public final androidx.lifecycle.a0 o0() {
        return this.D0;
    }

    public final void o1(BeforePaymentRequestfinal beforePaymentRequestfinal) {
        cm.l.f(beforePaymentRequestfinal, "finalSubmit");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.E(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.m0(beforePaymentRequestfinal).toString()), (String) uVar.f20234e).enqueue(new l0(uVar, this));
    }

    public final void p(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "enc_string");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.E(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new i(context, uVar, this));
    }

    public final void p0() {
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.L().toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.m(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new s(uVar, this));
    }

    public final void p1(BeforePaymentRequestfinal beforePaymentRequestfinal) {
        cm.l.f(beforePaymentRequestfinal, "finalSubmit");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.E(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.m0(beforePaymentRequestfinal).toString()), (String) uVar.f20234e).enqueue(new m0(uVar));
    }

    public final androidx.lifecycle.a0 q() {
        return this.f19554c0;
    }

    public final androidx.lifecycle.a0 q0() {
        return this.Q;
    }

    public final void q1(Context context, String str, String str2, String str3, String str4) {
        cm.l.f(context, "context");
        cm.l.f(str, "reg_number");
        cm.l.f(str2, "chassi_no");
        cm.l.f(str3, "state_code");
        cm.l.f(str4, VContant.PURPOSE_CODE);
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.s0(str, str2, str3, str4).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.u(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new n0(context, uVar, this));
    }

    public final androidx.lifecycle.a0 r() {
        return this.f19556d0;
    }

    public final androidx.lifecycle.a0 r0() {
        return this.R;
    }

    public final void s(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "applnNo");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.F(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.z(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new j(context, uVar, this));
    }

    public final androidx.lifecycle.a0 s0() {
        return this.K;
    }

    public final void t(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "applnNo");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.F(str).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.z(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new k(context, uVar, this));
    }

    public final androidx.lifecycle.a0 t0() {
        return this.L;
    }

    public final void u(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "param");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.i(um.c0.Companion.f(um.x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new l(context, uVar, this));
    }

    public final void u0(Context context, String str, String str2, String str3, String str4) {
        cm.l.f(context, "context");
        cm.l.f(str, "rc");
        cm.l.f(str2, "state_code");
        cm.l.f(str3, "chassi_no");
        cm.l.f(str4, "offCd");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.i0(str, str2, str3, str4).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.n(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new t(uVar, this, context));
    }

    public final void v(Context context, BeforePaymentRequest beforePaymentRequest) {
        cm.l.f(context, "context");
        cm.l.f(beforePaymentRequest, "param");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f19555d.i(um.c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.h0(beforePaymentRequest)), (String) uVar.f20234e).enqueue(new m(context, uVar, this));
    }

    public final void v0(Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        cm.l.f(context, "context");
        String str5 = str;
        cm.l.f(str5, "rc");
        String str6 = str2;
        cm.l.f(str6, "state_code");
        cm.l.f(str3, "pcode");
        String str7 = str4;
        cm.l.f(str7, "chass_no");
        cm.u uVar = new cm.u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        c0.a aVar = um.c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        VUtility.a aVar2 = VUtility.Companion;
        String k10 = gVar.k();
        cm.l.c(string);
        String jSONObject = aVar2.T(str5, str6, k10, string, gVar.l(), gVar.e(), str7).toString();
        cm.l.e(jSONObject, "toString(...)");
        this.f19555d.o(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new u(context, uVar, this));
    }

    public final androidx.lifecycle.a0 w() {
        return this.f19573m;
    }

    public final androidx.lifecycle.a0 w0() {
        return this.f19585s;
    }

    public final androidx.lifecycle.a0 x() {
        return this.f19575n;
    }

    public final androidx.lifecycle.a0 x0() {
        return this.f19587t;
    }

    public final androidx.lifecycle.a0 y() {
        return this.f19582q0;
    }

    public final androidx.lifecycle.a0 y0() {
        return this.f19581q;
    }

    public final androidx.lifecycle.a0 z() {
        return this.f19584r0;
    }

    public final androidx.lifecycle.a0 z0() {
        return this.f19583r;
    }
}
