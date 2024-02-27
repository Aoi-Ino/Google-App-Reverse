package androidx.work.impl;

import androidx.work.a;
import java.util.List;
import r1.m;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f4376e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f4377f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f4378g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f4379h;

    public /* synthetic */ y(List list, m mVar, a aVar, WorkDatabase workDatabase) {
        this.f4376e = list;
        this.f4377f = mVar;
        this.f4378g = aVar;
        this.f4379h = workDatabase;
    }

    public final void run() {
        z.d(this.f4376e, this.f4377f, this.f4378g, this.f4379h);
    }
}
