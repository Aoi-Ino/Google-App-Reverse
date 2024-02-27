package s3;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Account f15927a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f15928b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f15929c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f15930d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15931e;

    /* renamed from: f  reason: collision with root package name */
    private final View f15932f;

    /* renamed from: g  reason: collision with root package name */
    private final String f15933g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15934h;

    /* renamed from: i  reason: collision with root package name */
    private final m4.a f15935i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f15936j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f15937a;

        /* renamed from: b  reason: collision with root package name */
        private b f15938b;

        /* renamed from: c  reason: collision with root package name */
        private String f15939c;

        /* renamed from: d  reason: collision with root package name */
        private String f15940d;

        /* renamed from: e  reason: collision with root package name */
        private m4.a f15941e = m4.a.f13734k;

        public e a() {
            return new e(this.f15937a, this.f15938b, (Map) null, 0, (View) null, this.f15939c, this.f15940d, this.f15941e, false);
        }

        public a b(String str) {
            this.f15939c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f15938b == null) {
                this.f15938b = new b();
            }
            this.f15938b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f15937a = account;
            return this;
        }

        public final a e(String str) {
            this.f15940d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, m4.a aVar, boolean z10) {
        this.f15927a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f15928b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f15930d = map;
        this.f15932f = view;
        this.f15931e = i10;
        this.f15933g = str;
        this.f15934h = str2;
        this.f15935i = aVar == null ? m4.a.f13734k : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f15929c = Collections.unmodifiableSet(hashSet);
        } else {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public Account a() {
        return this.f15927a;
    }

    public Account b() {
        Account account = this.f15927a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f15929c;
    }

    public String d() {
        return this.f15933g;
    }

    public Set e() {
        return this.f15928b;
    }

    public final m4.a f() {
        return this.f15935i;
    }

    public final Integer g() {
        return this.f15936j;
    }

    public final String h() {
        return this.f15934h;
    }

    public final void i(Integer num) {
        this.f15936j = num;
    }
}
