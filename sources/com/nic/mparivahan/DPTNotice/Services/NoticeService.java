package com.nic.mparivahan.DPTNotice.Services;

import android.content.Context;
import android.os.Build;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.b;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.d;
import v9.k;

public interface NoticeService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8372a = a.f8373a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8373a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static NoticeService f8374b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean d(String str, SSLSession sSLSession) {
            return true;
        }

        /* access modifiers changed from: private */
        public static final boolean e(String str, SSLSession sSLSession) {
            return true;
        }

        public final NoticeService c(Context context) {
            z.a L;
            HostnameVerifier hostnameVerifier;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().b(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                z.a a11 = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d());
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                L = a11.L((SSLSocketFactory) obj, (X509TrustManager) obj2);
                new ha.a
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: CONSTRUCTOR  (r0v26 ? I:ha.a) =  call: ha.a.<init>():void type: CONSTRUCTOR in method: com.nic.mparivahan.DPTNotice.Services.NoticeService.a.c(android.content.Context):com.nic.mparivahan.DPTNotice.Services.NoticeService, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v26 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 49 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "context"
                    cm.l.f(r9, r0)
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 26
                    java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
                    java.lang.String r3 = "trustAllCerts"
                    java.lang.String r4 = "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory"
                    java.lang.String r5 = "sslSocketFactory"
                    r6 = 60
                    if (r0 < r1) goto L_0x0070
                    um.z$a r0 = new um.z$a
                    r0.<init>()
                    id.b r1 = new id.b
                    r1.<init>(r9)
                    um.z$a r0 = r0.b(r1)
                    m8.a r1 = new m8.a
                    r1.<init>(r9)
                    um.z$a r9 = r0.a(r1)
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                    um.z$a r9 = r9.d(r6, r0)
                    um.z$a r9 = r9.J(r6, r0)
                    um.z$a r9 = r9.M(r6, r0)
                    v9.d$a r0 = v9.d.f17494a
                    um.w r0 = r0.d()
                    um.z$a r9 = r9.a(r0)
                    java.util.HashMap r0 = v9.k.a()
                    java.lang.Object r0 = r0.get(r5)
                    cm.l.d(r0, r4)
                    javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
                    java.util.HashMap r1 = v9.k.a()
                    java.lang.Object r1 = r1.get(r3)
                    cm.l.d(r1, r2)
                    javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
                    um.z$a r9 = r9.L(r0, r1)
                    ha.a r0 = new ha.a
                    r0.<init>()
                L_0x0067:
                    um.z$a r9 = r9.I(r0)
                    um.z r9 = r9.c()
                    goto L_0x00c3
                L_0x0070:
                    um.z$a r0 = new um.z$a
                    r0.<init>()
                    id.b r1 = new id.b
                    r1.<init>(r9)
                    um.z$a r0 = r0.b(r1)
                    m8.a r1 = new m8.a
                    r1.<init>(r9)
                    um.z$a r9 = r0.a(r1)
                    java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                    um.z$a r9 = r9.d(r6, r0)
                    um.z$a r9 = r9.J(r6, r0)
                    um.z$a r9 = r9.M(r6, r0)
                    v9.d$a r0 = v9.d.f17494a
                    um.w r0 = r0.d()
                    um.z$a r9 = r9.a(r0)
                    java.util.HashMap r0 = v9.k.a()
                    java.lang.Object r0 = r0.get(r5)
                    cm.l.d(r0, r4)
                    javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
                    java.util.HashMap r1 = v9.k.a()
                    java.lang.Object r1 = r1.get(r3)
                    cm.l.d(r1, r2)
                    javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
                    um.z$a r9 = r9.L(r0, r1)
                    ha.b r0 = new ha.b
                    r0.<init>()
                    goto L_0x0067
                L_0x00c3:
                    com.nic.mparivahan.DPTNotice.Services.NoticeService r0 = f8374b
                    if (r0 != 0) goto L_0x00f8
                    retrofit2.Retrofit$Builder r0 = new retrofit2.Retrofit$Builder
                    r0.<init>()
                    hc.a$a r1 = hc.a.f12073a
                    java.lang.String r1 = r1.b()
                    retrofit2.Retrofit$Builder r0 = r0.baseUrl((java.lang.String) r1)
                    retrofit2.converter.gson.GsonConverterFactory r1 = retrofit2.converter.gson.GsonConverterFactory.create()
                    retrofit2.Retrofit$Builder r0 = r0.addConverterFactory(r1)
                    retrofit2.converter.scalars.ScalarsConverterFactory r1 = retrofit2.converter.scalars.ScalarsConverterFactory.create()
                    retrofit2.Retrofit$Builder r0 = r0.addConverterFactory(r1)
                    retrofit2.Retrofit$Builder r9 = r0.client(r9)
                    retrofit2.Retrofit r9 = r9.build()
                    java.lang.Class<com.nic.mparivahan.DPTNotice.Services.NoticeService> r0 = com.nic.mparivahan.DPTNotice.Services.NoticeService.class
                    java.lang.Object r9 = r9.create(r0)
                    com.nic.mparivahan.DPTNotice.Services.NoticeService r9 = (com.nic.mparivahan.DPTNotice.Services.NoticeService) r9
                    f8374b = r9
                L_0x00f8:
                    com.nic.mparivahan.DPTNotice.Services.NoticeService r9 = f8374b
                    cm.l.c(r9)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.Services.NoticeService.a.c(android.content.Context):com.nic.mparivahan.DPTNotice.Services.NoticeService");
            }
        }

        @POST("get-notice-details")
        @Headers({"Content-Type: application/json", "Accept: application/json"})
        Call<SecurityModle> getNoticeListUsingNoticeNo(@Body c0 c0Var, @Header("timestamp") String str);

        @POST("get-notice-detail")
        @Headers({"Content-Type: application/json", "Accept: application/json"})
        Call<SecurityModle> getNoticeListUsingVehicleNo(@Body c0 c0Var, @Header("timestamp") String str);

        @POST("get-vcourt-notice-details")
        @Headers({"Content-Type: application/json", "Accept: application/json"})
        Call<SecurityModle> getVirtualCourt(@Body c0 c0Var, @Header("timestamp") String str);

        @POST("notice-payment-verify")
        @Headers({"Content-Type: application/json", "Accept: application/json"})
        Call<SecurityModle> verifyPaymentStatus(@Body c0 c0Var, @Header("timestamp") String str);
    }
