package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2842a;

    public /* synthetic */ a(String str) {
        this.f2842a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return b.c(this.f2842a, runnable);
    }
}
