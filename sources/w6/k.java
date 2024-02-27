package w6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f17927a;

    public k(Context context, String str) {
        this.f17927a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j10 = this.f17927a.getLong("fire-count", 0);
            String str = "";
            String str2 = null;
            for (Map.Entry next : this.f17927a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    for (String str3 : (Set) next.getValue()) {
                        if (str2 != null) {
                            if (str2.compareTo(str3) > 0) {
                            }
                        }
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f17927a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f17927a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
        } finally {
        }
    }

    private synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DesugarDate.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized String e(String str) {
        for (Map.Entry next : this.f17927a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        try {
            String e10 = e(str);
            if (e10 != null) {
                HashSet hashSet = new HashSet(this.f17927a.getStringSet(e10, new HashSet()));
                hashSet.remove(str);
                (hashSet.isEmpty() ? this.f17927a.edit().remove(e10) : this.f17927a.edit().putStringSet(e10, hashSet)).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f17927a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f17927a.edit().putStringSet(str, hashSet).commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f17927a.edit();
            int i10 = 0;
            for (Map.Entry next : this.f17927a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    String d10 = d(System.currentTimeMillis());
                    String str = (String) next.getKey();
                    if (((Set) next.getValue()).contains(d10)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d10);
                        i10++;
                        edit.putStringSet(str, hashSet);
                    } else {
                        edit.remove(str);
                    }
                }
            }
            if (i10 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", (long) i10);
            }
            edit.commit();
        } finally {
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry next : this.f17927a.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) next.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(l.a((String) next.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } finally {
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    /* access modifiers changed from: package-private */
    public synchronized void g() {
        String d10 = d(System.currentTimeMillis());
        this.f17927a.edit().putString("last-used-date", d10).commit();
        h(d10);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean i(long j10) {
        return j("fire-global", j10);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean j(String str, long j10) {
        if (!this.f17927a.contains(str)) {
            this.f17927a.edit().putLong(str, j10).commit();
            return true;
        } else if (f(this.f17927a.getLong(str, -1), j10)) {
            return false;
        } else {
            this.f17927a.edit().putLong(str, j10).commit();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(long j10, String str) {
        String d10 = d(j10);
        if (this.f17927a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 != null) {
                if (!e10.equals(str)) {
                    m(str, d10);
                    return;
                }
                return;
            }
            return;
        }
        long j11 = this.f17927a.getLong("fire-count", 0);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f17927a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f17927a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f17927a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void l(long j10) {
        this.f17927a.edit().putLong("fire-global", j10).commit();
    }
}
