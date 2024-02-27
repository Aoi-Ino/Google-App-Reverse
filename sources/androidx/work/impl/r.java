package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f4274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4275b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4276c;

    public /* synthetic */ r(u uVar, ArrayList arrayList, String str) {
        this.f4274a = uVar;
        this.f4275b = arrayList;
        this.f4276c = str;
    }

    public final Object call() {
        return this.f4274a.m(this.f4275b, this.f4276c);
    }
}
