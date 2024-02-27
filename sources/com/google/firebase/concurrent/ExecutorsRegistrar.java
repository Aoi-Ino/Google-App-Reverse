package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import j6.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import k6.d0;
import k6.w;
import l6.b;
import l6.c;
import l6.d;
import l6.e;
import l6.f;
import l6.g;
import l6.h;
import l6.i;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final w f7304a = new w(new b());

    /* renamed from: b  reason: collision with root package name */
    static final w f7305b = new w(new c());

    /* renamed from: c  reason: collision with root package name */
    static final w f7306c = new w(new d());

    /* renamed from: d  reason: collision with root package name */
    static final w f7307d = new w(new e());

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            StrictMode.ThreadPolicy.Builder unused = detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, (StrictMode.ThreadPolicy) null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(k6.d dVar) {
        return (ScheduledExecutorService) f7304a.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(k6.d dVar) {
        return (ScheduledExecutorService) f7306c.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(k6.d dVar) {
        return (ScheduledExecutorService) f7305b.get();
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f7307d.get());
    }

    public List getComponents() {
        Class<a> cls = a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        Class<j6.b> cls5 = j6.b.class;
        Class<j6.c> cls6 = j6.c.class;
        return Arrays.asList(new k6.c[]{k6.c.f(d0.a(cls, cls2), d0.a(cls, cls3), d0.a(cls, cls4)).e(new f()).d(), k6.c.f(d0.a(cls5, cls2), d0.a(cls5, cls3), d0.a(cls5, cls4)).e(new g()).d(), k6.c.f(d0.a(cls6, cls2), d0.a(cls6, cls3), d0.a(cls6, cls4)).e(new h()).d(), k6.c.e(d0.a(j6.d.class, cls4)).e(new i()).d()});
    }
}
