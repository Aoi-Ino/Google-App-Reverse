package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f7310e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f7311a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f7312b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7313c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f7314d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f7312b = str;
        this.f7313c = i10;
        this.f7314d = threadPolicy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f7313c);
        StrictMode.ThreadPolicy threadPolicy = this.f7314d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f7310e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f7312b, Long.valueOf(this.f7311a.getAndIncrement())}));
        return newThread;
    }
}
