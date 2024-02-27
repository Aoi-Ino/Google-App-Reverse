package com.nic.mparivahan.Dashboard.RCDownloadService;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import i7.d;
import id.c;
import j$.util.Base64;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ka.c;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import xa.a;

public final class SaveVirtualRCService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8394k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8395j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, GetVirtualDocDetails getVirtualDocDetails) {
            l.f(context, "context");
            l.f(getVirtualDocDetails, "list");
            try {
                androidx.work.b a10 = new b.a().b("RC", new d().t(getVirtualDocDetails)).a();
                l.e(a10, "build(...)");
                m1.d a11 = new d.a().b(n.CONNECTED).a();
                y.c(context).b((p) ((p.a) ((p.a) new p.a(SaveVirtualRCService.class).j(a10)).h(a11)).a());
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f8396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f8397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f8399d;

        b(u uVar, Context context, String str, String str2) {
            this.f8396a = uVar;
            this.f8397b = context;
            this.f8398c = str;
            this.f8399d = str2;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            new DatabaseHelper(this.f8397b).N0(this.f8399d, (DldetobjX) null, this.f8398c, (String) null);
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str = (String) this.f8396a.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str2 = (String) this.f8396a.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DLWithoutdobModel.class);
                l.e(j10, "fromJson(...)");
                DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) j10;
                if (!ka.c.f13158a.m(dLWithoutdobModel.getDlobj().getDlLicno())) {
                    DatabaseHelper databaseHelper = new DatabaseHelper(this.f8397b);
                    String obj = q.B0(dLWithoutdobModel.getDlobj().getDlLicno()).toString();
                    String str3 = this.f8398c;
                    BioObj bioObj = dLWithoutdobModel.getBioObj();
                    databaseHelper.N0(obj, (DldetobjX) null, str3, bioObj != null ? bioObj.getBioDob() : null);
                    return;
                }
                new DatabaseHelper(this.f8397b).N0(this.f8399d, (DldetobjX) null, this.f8398c, (String) null);
            } catch (Exception e10) {
                e10.printStackTrace();
                new DatabaseHelper(this.f8397b).N0(this.f8399d, (DldetobjX) null, this.f8398c, (String) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveVirtualRCService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8395j = context;
    }

    public c.a p() {
        try {
            GetVirtualDocDetails getVirtualDocDetails = (GetVirtualDocDetails) new i7.d().j(String.valueOf(f().m("RC")), GetVirtualDocDetails.class);
            l.c(getVirtualDocDetails);
            s(getVirtualDocDetails);
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(String str, String str2, Context context) {
        l.f(str, "dl");
        l.f(str2, "doc");
        l.f(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ld.g gVar = new ld.g(context);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        DlService c10 = DlService.f8615a.c(context);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        l.c(string);
        String jSONObject = aVar2.c(str, (String) null, context, string, gVar.l()).toString();
        l.e(jSONObject, "toString(...)");
        c10.getDlDetailsWitoutDOB(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, context, str2, str));
    }

    public final void s(GetVirtualDocDetails getVirtualDocDetails) {
        l.f(getVirtualDocDetails, "virtualdetails");
        ld.a aVar = new ld.a(this.f8395j);
        String format = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        l.c(format);
        aVar.h(format);
        DatabaseHelper databaseHelper = new DatabaseHelper(this.f8395j);
        ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = getVirtualDocDetails.getMparCitizenDocInfo();
        if (mparCitizenDocInfo.size() > 0) {
            DatabaseHelper A0 = DatabaseHelper.A0(this.f8395j);
            l.e(A0, "getInstance(...)");
            A0.H();
            A0.close();
        }
        int size = mparCitizenDocInfo.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p.o(q.B0(mparCitizenDocInfo.get(i10).getDocType()).toString(), "RC", true)) {
                databaseHelper.O0(mparCitizenDocInfo.get(i10).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), (NrvDetails) null, 0);
                RCDownloads.f8390k.a(this.f8395j, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()));
            }
            if (p.o(q.B0(mparCitizenDocInfo.get(i10).getDocType()).toString(), "DL", true)) {
                c.a aVar2 = ka.c.f13158a;
                if (!aVar2.m(mparCitizenDocInfo.get(i10).getDocDob())) {
                    String docNumber = mparCitizenDocInfo.get(i10).getDocNumber();
                    if (aVar2.m(mparCitizenDocInfo.get(i10).getDocDob()) || p.o(mparCitizenDocInfo.get(i10).getDocDob(), "null", true)) {
                        r(docNumber, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), this.f8395j);
                    } else {
                        databaseHelper.L0(docNumber, (DldetobjX) null, String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), mparCitizenDocInfo.get(i10).getDocDob());
                    }
                } else {
                    r(mparCitizenDocInfo.get(i10).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i10).getDocId()), this.f8395j);
                }
            }
        }
    }
}
