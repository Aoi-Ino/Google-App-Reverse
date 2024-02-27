package com.nic.mparivahan.Dl.DlInterface;

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
import retrofit2.http.Url;
import um.c0;
import um.z;
import v9.d;
import v9.k;

public interface DlService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8615a = a.f8616a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8616a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static DlService f8617b;

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

        public final DlService c(Context context) {
            z.a L;
            HostnameVerifier hostnameVerifier;
            l.f(context, "context");
            if (f8617b == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    z.a a10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d());
                    Object obj = k.a().get("sslSocketFactory");
                    l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                    Object obj2 = k.a().get("trustAllCerts");
                    l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    L = a10.L((SSLSocketFactory) obj, (X509TrustManager) obj2);
                    new wa.a
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR  (r0v27 ? I:wa.a) =  call: wa.a.<init>():void type: CONSTRUCTOR in method: com.nic.mparivahan.Dl.DlInterface.DlService.a.c(android.content.Context):com.nic.mparivahan.Dl.DlInterface.DlService, dex: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v27 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 54 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "context"
                        cm.l.f(r11, r0)
                        com.nic.mparivahan.Dl.DlInterface.DlService r0 = f8617b
                        if (r0 != 0) goto L_0x00f6
                        int r0 = android.os.Build.VERSION.SDK_INT
                        r1 = 26
                        java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
                        java.lang.String r3 = "trustAllCerts"
                        java.lang.String r4 = "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory"
                        java.lang.String r5 = "sslSocketFactory"
                        r6 = 2
                        r8 = 60
                        if (r0 < r1) goto L_0x0078
                        um.z$a r0 = new um.z$a
                        r0.<init>()
                        id.b r1 = new id.b
                        r1.<init>(r11)
                        um.z$a r0 = r0.a(r1)
                        m8.a r1 = new m8.a
                        r1.<init>(r11)
                        um.z$a r11 = r0.a(r1)
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
                        um.z$a r11 = r11.d(r6, r0)
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                        um.z$a r11 = r11.J(r8, r0)
                        um.z$a r11 = r11.M(r8, r0)
                        v9.d$a r0 = v9.d.f17494a
                        um.w r0 = r0.d()
                        um.z$a r11 = r11.a(r0)
                        java.util.HashMap r0 = v9.k.a()
                        java.lang.Object r0 = r0.get(r5)
                        cm.l.d(r0, r4)
                        javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
                        java.util.HashMap r1 = v9.k.a()
                        java.lang.Object r1 = r1.get(r3)
                        cm.l.d(r1, r2)
                        javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
                        um.z$a r11 = r11.L(r0, r1)
                        wa.a r0 = new wa.a
                        r0.<init>()
                    L_0x006f:
                        um.z$a r11 = r11.I(r0)
                        um.z r11 = r11.c()
                        goto L_0x00cd
                    L_0x0078:
                        um.z$a r0 = new um.z$a
                        r0.<init>()
                        id.b r1 = new id.b
                        r1.<init>(r11)
                        um.z$a r0 = r0.a(r1)
                        m8.a r1 = new m8.a
                        r1.<init>(r11)
                        um.z$a r11 = r0.a(r1)
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
                        um.z$a r11 = r11.d(r6, r0)
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                        um.z$a r11 = r11.J(r8, r0)
                        um.z$a r11 = r11.M(r8, r0)
                        v9.d$a r0 = v9.d.f17494a
                        um.w r0 = r0.d()
                        um.z$a r11 = r11.a(r0)
                        java.util.HashMap r0 = v9.k.a()
                        java.lang.Object r0 = r0.get(r5)
                        cm.l.d(r0, r4)
                        javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
                        java.util.HashMap r1 = v9.k.a()
                        java.lang.Object r1 = r1.get(r3)
                        cm.l.d(r1, r2)
                        javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
                        um.z$a r11 = r11.L(r0, r1)
                        wa.b r0 = new wa.b
                        r0.<init>()
                        goto L_0x006f
                    L_0x00cd:
                        retrofit2.Retrofit$Builder r0 = new retrofit2.Retrofit$Builder
                        r0.<init>()
                        hc.a$a r1 = hc.a.f12073a
                        java.lang.String r1 = r1.t()
                        retrofit2.Retrofit$Builder r0 = r0.baseUrl((java.lang.String) r1)
                        retrofit2.converter.gson.GsonConverterFactory r1 = retrofit2.converter.gson.GsonConverterFactory.create()
                        retrofit2.Retrofit$Builder r0 = r0.addConverterFactory(r1)
                        retrofit2.Retrofit$Builder r11 = r0.client(r11)
                        retrofit2.Retrofit r11 = r11.build()
                        java.lang.Class<com.nic.mparivahan.Dl.DlInterface.DlService> r0 = com.nic.mparivahan.Dl.DlInterface.DlService.class
                        java.lang.Object r11 = r11.create(r0)
                        com.nic.mparivahan.Dl.DlInterface.DlService r11 = (com.nic.mparivahan.Dl.DlInterface.DlService) r11
                        f8617b = r11
                    L_0x00f6:
                        com.nic.mparivahan.Dl.DlInterface.DlService r11 = f8617b
                        cm.l.c(r11)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DlInterface.DlService.a.c(android.content.Context):com.nic.mparivahan.Dl.DlInterface.DlService");
                }
            }

            @POST
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> createVirtualDoc(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

            @POST("service/getDLLicence")
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> dldetailWithOutDob(@Body c0 c0Var, @Header("timestamp") String str);

            @POST("service/getDLLicence")
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> getDlDetailsForRecentSearch(@Body c0 c0Var, @Header("timestamp") String str);

            @POST("service/getDLLicence")
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> getDlDetailsWitoutDOB(@Body c0 c0Var, @Header("timestamp") String str);

            @POST("service/getDLLicence")
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> getDlDetails_new(@Body c0 c0Var, @Header("timestamp") String str);

            @POST
            @Headers({"Content-Type: application/json", "Accept: application/json"})
            Call<SecurityModle> updateVirtualDl(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);
        }
