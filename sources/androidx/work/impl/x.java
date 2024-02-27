package androidx.work.impl;

import androidx.work.a;
import java.util.List;
import java.util.concurrent.Executor;
import r1.m;

public final /* synthetic */ class x implements f {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Executor f4372e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f4373f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f4374g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f4375h;

    public /* synthetic */ x(Executor executor, List list, a aVar, WorkDatabase workDatabase) {
        this.f4372e = executor;
        this.f4373f = list;
        this.f4374g = aVar;
        this.f4375h = workDatabase;
    }

    public final void e(m mVar, boolean z10) {
        this.f4372e.execute(new y(this.f4373f, mVar, this.f4374g, this.f4375h));
    }
}
