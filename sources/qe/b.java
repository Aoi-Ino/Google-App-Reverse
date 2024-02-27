package qe;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DupFitnessModle.DuplicateFitessDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicateList;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel.RCReleaseResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RCSurrenderModle.RcSurrenderResModel;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.CancellationModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCCancellationResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle.RCSurrenderModle;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.PermitFee;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.TempSubmitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import v9.d;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final pe.a f30543d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f30544e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f30545f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f30546g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f30547h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f30548i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f30549j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f30550k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f30551l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f30552m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f30553n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f30554o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f30555p = new a0();

    /* renamed from: q  reason: collision with root package name */
    private final a0 f30556q = new a0();

    /* renamed from: r  reason: collision with root package name */
    private final a0 f30557r = new a0();

    /* renamed from: s  reason: collision with root package name */
    private final a0 f30558s = new a0();

    /* renamed from: t  reason: collision with root package name */
    private final a0 f30559t = new a0();

    /* renamed from: u  reason: collision with root package name */
    private final a0 f30560u = new a0();

    /* renamed from: v  reason: collision with root package name */
    private final a0 f30561v = new a0();

    /* renamed from: w  reason: collision with root package name */
    private final a0 f30562w = new a0();

    /* renamed from: x  reason: collision with root package name */
    private final a0 f30563x = new a0();

    /* renamed from: y  reason: collision with root package name */
    private final a0 f30564y = new a0();

    /* renamed from: z  reason: collision with root package name */
    private final a0 f30565z = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30568c;

        a(Context context, u uVar, b bVar) {
            this.f30566a = context;
            this.f30567b = uVar;
            this.f30568c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30566a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "calculatevalidupto", aVar2.v(), aVar2.w());
            this.f30568c.k().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30566a, v9.d.f17494a.z(), "calculatevalidupto", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30567b.f20234e, data), CalValidity.class);
                l.e(j10, "fromJson(...)");
                this.f30568c.j().k((CalValidity) j10);
            } catch (Exception e10) {
                this.f30568c.k().k("Error");
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: qe.b$b  reason: collision with other inner class name */
    public static final class C0338b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30571c;

        C0338b(Context context, u uVar, b bVar) {
            this.f30569a = context;
            this.f30570b = uVar;
            this.f30571c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30569a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "searchgoodstype", aVar2.v(), aVar2.w());
            this.f30571c.s().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30569a, v9.d.f17494a.z(), "searchgoodstype", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30570b.f20234e, data), CalValidity.class);
                l.e(j10, "fromJson(...)");
                this.f30571c.r().k((CalValidity) j10);
            } catch (Exception e10) {
                this.f30571c.s().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30573b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30574c;

        c(Context context, u uVar, b bVar) {
            this.f30572a = context;
            this.f30573b = uVar;
            this.f30574c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30572a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "savetempdraftappl", aVar2.v(), aVar2.w());
            this.f30574c.G().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30572a, v9.d.f17494a.z(), "savetempdraftappl", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30573b.f20234e, data), TempSubmitResponse.class);
                l.e(j10, "fromJson(...)");
                this.f30574c.F().k((TempSubmitResponse) j10);
            } catch (Exception e10) {
                this.f30574c.G().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30575a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30576b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30577c;

        d(Context context, u uVar, b bVar) {
            this.f30575a = context;
            this.f30576b = uVar;
            this.f30577c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30575a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getPermitDocumentList", aVar2.v(), aVar2.w());
            this.f30577c.q().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30575a, v9.d.f17494a.z(), "getPermitDocumentList", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30576b.f20234e, data), DuplicateList.class);
                l.e(j10, "fromJson(...)");
                this.f30577c.p().k((DuplicateList) j10);
            } catch (Exception e10) {
                this.f30577c.q().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30580c;

        e(Context context, u uVar, b bVar) {
            this.f30578a = context;
            this.f30579b = uVar;
            this.f30580c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30578a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "getPermitFeeDetails", aVar2.v(), aVar2.w());
            this.f30580c.w().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30578a, v9.d.f17494a.z(), "getPermitFeeDetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30579b.f20234e, data), PermitFee.class);
                l.e(j10, "fromJson(...)");
                this.f30580c.v().k((PermitFee) j10);
            } catch (Exception e10) {
                this.f30580c.w().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class f implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30582b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30583c;

        f(Context context, u uVar, b bVar) {
            this.f30581a = context;
            this.f30582b = uVar;
            this.f30583c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30581a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "temppermitdetails", aVar2.v(), aVar2.w());
            this.f30583c.E().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30581a, v9.d.f17494a.z(), "temppermitdetails", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30582b.f20234e, data), TempDetailsModel.class);
                l.e(j10, "fromJson(...)");
                this.f30583c.D().k((TempDetailsModel) j10);
            } catch (Exception e10) {
                this.f30583c.E().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class g implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30584a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30585b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30586c;

        g(Context context, u uVar, b bVar) {
            this.f30584a = context;
            this.f30585b = uVar;
            this.f30586c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30584a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "saveduplicatefitnessdraft", aVar2.v(), aVar2.w());
            this.f30586c.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30584a, v9.d.f17494a.z(), "saveduplicatefitnessdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30585b.f20234e, data), DuplicateFitessDraft.class);
                l.e(j10, "fromJson(...)");
                this.f30586c.l().k((DuplicateFitessDraft) j10);
            } catch (Exception e10) {
                this.f30586c.m().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class h implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30588b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30589c;

        h(Context context, u uVar, b bVar) {
            this.f30587a = context;
            this.f30588b = uVar;
            this.f30589c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30587a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "duppermitdraft", aVar2.v(), aVar2.w());
            this.f30589c.o().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30587a, v9.d.f17494a.z(), "duppermitdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30588b.f20234e, data), DuplicatePermitResponse.class);
                l.e(j10, "fromJson(...)");
                this.f30589c.n().k((DuplicatePermitResponse) j10);
            } catch (Exception e10) {
                this.f30589c.o().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class i implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30590a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30591b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30592c;

        i(Context context, u uVar, b bVar) {
            this.f30590a = context;
            this.f30591b = uVar;
            this.f30592c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30590a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "rccanceldraft", aVar2.v(), aVar2.w());
            this.f30592c.y().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30590a, v9.d.f17494a.z(), "rccanceldraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30591b.f20234e, data), RCCancellationResponse.class);
                l.e(j10, "fromJson(...)");
                this.f30592c.x().k((RCCancellationResponse) j10);
            } catch (Exception e10) {
                this.f30592c.y().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class j implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30595c;

        j(Context context, u uVar, b bVar) {
            this.f30593a = context;
            this.f30594b = uVar;
            this.f30595c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30593a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "rcreleasedraft", aVar2.v(), aVar2.w());
            this.f30595c.A().k(th2 != null ? th2.getMessage() : null);
            Log.e("myrequest", "something went wrong working");
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30593a, v9.d.f17494a.z(), "rcreleasedraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30594b.f20234e, data), RCReleaseResponse.class);
                l.e(j10, "fromJson(...)");
                this.f30595c.z().k((RCReleaseResponse) j10);
            } catch (Exception e10) {
                this.f30595c.A().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public static final class k implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f30596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f30597b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f30598c;

        k(Context context, u uVar, b bVar) {
            this.f30596a = context;
            this.f30597b = uVar;
            this.f30598c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f30596a;
            d.a aVar2 = v9.d.f17494a;
            aVar.a(context, aVar2.z(), "rcsurrenderdraft", aVar2.v(), aVar2.w());
            this.f30598c.C().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f30596a, v9.d.f17494a.z(), "rcsurrenderdraft", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f30597b.f20234e, data), RcSurrenderResModel.class);
                l.e(j10, "fromJson(...)");
                this.f30598c.B().k((RcSurrenderResModel) j10);
            } catch (Exception e10) {
                this.f30598c.C().k("Error");
                e10.printStackTrace();
            }
        }
    }

    public b(pe.a aVar) {
        l.f(aVar, "repository");
        this.f30543d = aVar;
    }

    public final a0 A() {
        return this.f30555p;
    }

    public final a0 B() {
        return this.f30548i;
    }

    public final a0 C() {
        return this.f30549j;
    }

    public final a0 D() {
        return this.f30556q;
    }

    public final a0 E() {
        return this.f30557r;
    }

    public final a0 F() {
        return this.f30562w;
    }

    public final a0 G() {
        return this.f30563x;
    }

    public final void H(Context context, String str, String str2, String str3) {
        l.f(context, "context");
        l.f(str, "rc");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.Z(str, String.valueOf(str2), String.valueOf(str3)).toString();
        l.e(jSONObject, "toString(...)");
        this.f30543d.k(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new f(context, uVar, this));
    }

    public final void I(Context context, DuplicateFitessDraft duplicateFitessDraft) {
        l.f(context, "context");
        l.f(duplicateFitessDraft, "dfcObject");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.e(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.N(duplicateFitessDraft)), (String) uVar.f20234e).enqueue(new g(context, uVar, this));
    }

    public final void J(Context context, DuplicatePermitRe duplicatePermitRe) {
        l.f(context, "context");
        l.f(duplicatePermitRe, "dfcObject");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.f(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.O(duplicatePermitRe)), (String) uVar.f20234e).enqueue(new h(context, uVar, this));
    }

    public final void K(Context context, CancellationModle cancellationModle) {
        l.f(context, "context");
        l.f(cancellationModle, "canObject");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.g(c0.Companion.f(x.f32156g.b("application/json"), new i7.d().t(cancellationModle).toString()), (String) uVar.f20234e).enqueue(new i(context, uVar, this));
    }

    public final void L(Context context, RCReleaseModle rCReleaseModle) {
        l.f(context, "context");
        l.f(rCReleaseModle, "canObject");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.h(c0.Companion.f(x.f32156g.b("application/json"), new i7.d().t(rCReleaseModle).toString()), (String) uVar.f20234e).enqueue(new j(context, uVar, this));
    }

    public final void M(Context context, RCSurrenderModle rCSurrenderModle) {
        l.f(context, "context");
        l.f(rCSurrenderModle, "rcSurrenderObject");
        i7.d dVar = new i7.d();
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.i(c0.Companion.f(x.f32156g.b("application/json"), dVar.t(rCSurrenderModle).toString()), (String) uVar.f20234e).enqueue(new k(context, uVar, this));
    }

    public final void g(Context context, String str, String str2, String str3, String str4) {
        l.f(context, "context");
        l.f(str, "statecd");
        l.f(str2, "validFrom");
        l.f(str3, "perMode");
        l.f(str4, "period");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.G(str, str2, str3, str4).toString();
        l.e(jSONObject, "toString(...)");
        this.f30543d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(context, uVar, this));
    }

    public final void h(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "googdsNature");
        l.f(str2, "statecd");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.J(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f30543d.c(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0338b(context, uVar, this));
    }

    public final void i(Context context, String str) {
        l.f(context, "context");
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.j(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new c(context, uVar, this));
    }

    public final a0 j() {
        return this.f30558s;
    }

    public final a0 k() {
        return this.f30559t;
    }

    public final a0 l() {
        return this.f30544e;
    }

    public final a0 m() {
        return this.f30545f;
    }

    public final a0 n() {
        return this.f30550k;
    }

    public final a0 o() {
        return this.f30551l;
    }

    public final a0 p() {
        return this.f30552m;
    }

    public final a0 q() {
        return this.f30553n;
    }

    public final a0 r() {
        return this.f30560u;
    }

    public final a0 s() {
        return this.f30561v;
    }

    public final void t(Context context, String str, String str2) {
        l.f(context, "context");
        l.f(str, "rc");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.d0(str, String.valueOf(str2)).toString();
        l.e(jSONObject, "toString(...)");
        this.f30543d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new d(context, uVar, this));
    }

    public final void u(Context context, String str) {
        l.f(context, "context");
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f30543d.b(c0.Companion.f(x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new e(context, uVar, this));
    }

    public final a0 v() {
        return this.f30564y;
    }

    public final a0 w() {
        return this.f30565z;
    }

    public final a0 x() {
        return this.f30546g;
    }

    public final a0 y() {
        return this.f30547h;
    }

    public final a0 z() {
        return this.f30554o;
    }
}
