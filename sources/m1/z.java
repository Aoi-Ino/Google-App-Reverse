package m1;

import cm.g;
import cm.l;
import java.util.Set;
import java.util.UUID;
import r1.u;

public abstract class z {

    /* renamed from: d  reason: collision with root package name */
    public static final b f13720d = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final UUID f13721a;

    /* renamed from: b  reason: collision with root package name */
    private final u f13722b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f13723c;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f13724a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13725b;

        /* renamed from: c  reason: collision with root package name */
        private UUID f13726c;

        /* renamed from: d  reason: collision with root package name */
        private u f13727d;

        /* renamed from: e  reason: collision with root package name */
        private final Set f13728e;

        public a(Class cls) {
            l.f(cls, "workerClass");
            this.f13724a = cls;
            UUID randomUUID = UUID.randomUUID();
            l.e(randomUUID, "randomUUID()");
            this.f13726c = randomUUID;
            String uuid = this.f13726c.toString();
            l.e(uuid, "id.toString()");
            String name = cls.getName();
            l.e(name, "workerClass.name");
            this.f13727d = new u(uuid, name);
            String name2 = cls.getName();
            l.e(name2, "workerClass.name");
            this.f13728e = q0.e(name2);
        }

        public final z a() {
            z b10 = b();
            d dVar = this.f13727d.f15486j;
            boolean z10 = dVar.e() || dVar.f() || dVar.g() || dVar.h();
            u uVar = this.f13727d;
            if (uVar.f15493q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                } else if (uVar.f15483g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            l.e(randomUUID, "randomUUID()");
            i(randomUUID);
            return b10;
        }

        public abstract z b();

        public final boolean c() {
            return this.f13725b;
        }

        public final UUID d() {
            return this.f13726c;
        }

        public final Set e() {
            return this.f13728e;
        }

        public abstract a f();

        public final u g() {
            return this.f13727d;
        }

        public final a h(d dVar) {
            l.f(dVar, "constraints");
            this.f13727d.f15486j = dVar;
            return f();
        }

        public final a i(UUID uuid) {
            l.f(uuid, "id");
            this.f13726c = uuid;
            String uuid2 = uuid.toString();
            l.e(uuid2, "id.toString()");
            this.f13727d = new u(uuid2, this.f13727d);
            return f();
        }

        public final a j(androidx.work.b bVar) {
            l.f(bVar, "inputData");
            this.f13727d.f15481e = bVar;
            return f();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public z(UUID uuid, u uVar, Set set) {
        l.f(uuid, "id");
        l.f(uVar, "workSpec");
        l.f(set, "tags");
        this.f13721a = uuid;
        this.f13722b = uVar;
        this.f13723c = set;
    }

    public UUID a() {
        return this.f13721a;
    }

    public final String b() {
        String uuid = a().toString();
        l.e(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f13723c;
    }

    public final u d() {
        return this.f13722b;
    }
}
