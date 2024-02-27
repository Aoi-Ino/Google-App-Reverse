package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import m1.a0;
import m1.h;
import m1.s;
import t1.b;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4058a;

    /* renamed from: b  reason: collision with root package name */
    private b f4059b;

    /* renamed from: c  reason: collision with root package name */
    private Set f4060c;

    /* renamed from: d  reason: collision with root package name */
    private a f4061d;

    /* renamed from: e  reason: collision with root package name */
    private int f4062e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f4063f;

    /* renamed from: g  reason: collision with root package name */
    private b f4064g;

    /* renamed from: h  reason: collision with root package name */
    private a0 f4065h;

    /* renamed from: i  reason: collision with root package name */
    private s f4066i;

    /* renamed from: j  reason: collision with root package name */
    private h f4067j;

    /* renamed from: k  reason: collision with root package name */
    private int f4068k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List f4069a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List f4070b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f4071c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, int i11, Executor executor, b bVar2, a0 a0Var, s sVar, h hVar) {
        this.f4058a = uuid;
        this.f4059b = bVar;
        this.f4060c = new HashSet(collection);
        this.f4061d = aVar;
        this.f4062e = i10;
        this.f4068k = i11;
        this.f4063f = executor;
        this.f4064g = bVar2;
        this.f4065h = a0Var;
        this.f4066i = sVar;
        this.f4067j = hVar;
    }

    public Executor a() {
        return this.f4063f;
    }

    public h b() {
        return this.f4067j;
    }

    public UUID c() {
        return this.f4058a;
    }

    public b d() {
        return this.f4059b;
    }

    public b e() {
        return this.f4064g;
    }

    public a0 f() {
        return this.f4065h;
    }
}
