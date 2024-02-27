package y0;

import android.content.Context;
import android.content.Intent;
import cm.l;
import d1.h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import y0.u;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18312a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18313b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f18314c;

    /* renamed from: d  reason: collision with root package name */
    public final u.e f18315d;

    /* renamed from: e  reason: collision with root package name */
    public final List f18316e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18317f;

    /* renamed from: g  reason: collision with root package name */
    public final u.d f18318g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f18319h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f18320i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f18321j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18322k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f18323l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f18324m;

    /* renamed from: n  reason: collision with root package name */
    public final String f18325n;

    /* renamed from: o  reason: collision with root package name */
    public final File f18326o;

    /* renamed from: p  reason: collision with root package name */
    public final Callable f18327p;

    /* renamed from: q  reason: collision with root package name */
    public final List f18328q;

    /* renamed from: r  reason: collision with root package name */
    public final List f18329r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f18330s;

    public f(Context context, String str, h.c cVar, u.e eVar, List list, boolean z10, u.d dVar, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, u.f fVar, List list2, List list3) {
        u.d dVar2 = dVar;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List list4 = list2;
        List list5 = list3;
        l.f(context, "context");
        l.f(cVar, "sqliteOpenHelperFactory");
        l.f(eVar, "migrationContainer");
        l.f(dVar2, "journalMode");
        l.f(executor3, "queryExecutor");
        l.f(executor4, "transactionExecutor");
        l.f(list4, "typeConverters");
        l.f(list5, "autoMigrationSpecs");
        this.f18312a = context;
        this.f18313b = str;
        this.f18314c = cVar;
        this.f18315d = eVar;
        this.f18316e = list;
        this.f18317f = z10;
        this.f18318g = dVar2;
        this.f18319h = executor3;
        this.f18320i = executor4;
        this.f18321j = intent2;
        this.f18322k = z11;
        this.f18323l = z12;
        this.f18324m = set;
        this.f18325n = str2;
        this.f18326o = file;
        this.f18327p = callable;
        this.f18328q = list4;
        this.f18329r = list5;
        this.f18330s = intent2 != null;
    }

    public boolean a(int i10, int i11) {
        if ((i10 > i11 && this.f18323l) || !this.f18322k) {
            return false;
        }
        Set set = this.f18324m;
        return set == null || !set.contains(Integer.valueOf(i10));
    }
}
