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

public final class SaveKycReq extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8714k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8715j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8716a;

        b(String str) {
            this.f8716a = str;
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
                str = this.f8716a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f8716a;
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
    public SaveKycReq(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8715j = context;
    }

    private final void r(String str, String str2, String str3, String str4, String str5, int i10) {
        DlLogInterface b10 = DlLogInterface.f21658a.b(this.f8715j);
        c0.a aVar = c0.Companion;
        x b11 = x.f32156g.b("application/json");
        String jSONObject = s(str, str2, str3, str4, str5, i10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b11, jSONObject);
        String valueOf = String.valueOf(System.currentTimeMillis());
        b10.saveKycRes(f10, valueOf).enqueue(new b(valueOf));
    }

    private final JSONObject s(String str, String str2, String str3, String str4, String str5, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("avAadharno", (Object) str);
            jSONObject2.put("avRtoCode", (Object) str2);
            jSONObject2.put("avTxn", (Object) str3);
            jSONObject2.put("avExt1", (Object) str4);
            jSONObject2.put("avExt2", (Object) str5);
            jSONObject2.put("avAccd", i10);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("applAadharVerify", (Object) jSONObject2);
            return jSONObject3;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public c.a p() {
        try {
            r(String.valueOf(f().m("avAadharno")), String.valueOf(f().m("avRtoCode")), String.valueOf(f().m("avTxn")), String.valueOf(f().m("avExt1")), String.valueOf(f().m("avExt2")), f().j("avAccd", 0));
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }
}
