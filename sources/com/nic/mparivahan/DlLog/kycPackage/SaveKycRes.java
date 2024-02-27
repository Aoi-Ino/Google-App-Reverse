package com.nic.mparivahan.DlLog.kycPackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.DlLog.DlLogInterface;
import id.c;
import j$.util.Base64;
import km.d;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class SaveKycRes extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8717k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8718j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8719a;

        b(String str) {
            this.f8719a = str;
        }

        public void onFailure(Call call, Throwable th2) {
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
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f8719a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f8719a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, d.f24740b);
            }
            Log.d("valiii", String.valueOf(aVar.a(str, str2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveKycRes(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8718j = context;
    }

    private final void r(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        DlLogInterface b10 = DlLogInterface.f21658a.b(this.f8718j);
        c0.a aVar = c0.Companion;
        x b11 = x.f32156g.b("application/json");
        String jSONObject = s(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b11, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        b10.saveKycReq(f10, valueOf).enqueue(new b(valueOf));
    }

    private final JSONObject s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str17 = str;
            jSONObject2.put("appUid", (Object) str);
            String str18 = str2;
            jSONObject2.put("appName", (Object) str2);
            String str19 = str3;
            jSONObject2.put("appDob", (Object) str3);
            String str20 = str4;
            jSONObject2.put("appGender", (Object) str4);
            String str21 = str5;
            jSONObject2.put("appRelation", (Object) str5);
            String str22 = str6;
            jSONObject2.put("appRelName", (Object) str6);
            String str23 = str7;
            jSONObject2.put("appHouse", (Object) str7);
            String str24 = str8;
            jSONObject2.put("appStreet", (Object) str8);
            String str25 = str9;
            jSONObject2.put("appLm", (Object) str9);
            String str26 = str10;
            jSONObject2.put("appLoc", (Object) str10);
            String str27 = str11;
            jSONObject2.put("appVtc", (Object) str11);
            jSONObject2.put("appDist", (Object) str12);
            jSONObject2.put("appState", (Object) str13);
            jSONObject2.put("appPc", (Object) str14);
            jSONObject2.put("appPhoto", (Object) str15);
            jSONObject2.put("appMobileNum", (Object) str16);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("applAadhaar", (Object) jSONObject2);
            return jSONObject3;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public c.a p() {
        try {
            r(String.valueOf(f().m("appUid")), String.valueOf(f().m("appName")), String.valueOf(f().m("appDob")), String.valueOf(f().m("appGender")), String.valueOf(f().m("appRelation")), String.valueOf(f().m("appRelName")), String.valueOf(f().m("appHouse")), String.valueOf(f().m("appStreet")), String.valueOf(f().m("appLm")), String.valueOf(f().m("appLoc")), String.valueOf(f().m("appVtc")), String.valueOf(f().m("appDist")), String.valueOf(f().m("appState")), String.valueOf(f().m("appPc")), String.valueOf(f().m("appPhoto")), String.valueOf(f().m("appMobileNum")));
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }
}
