package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f2425a;

    k(Object obj) {
        this.f2425a = (LocaleList) obj;
    }

    public String a() {
        return this.f2425a.toLanguageTags();
    }

    public Object b() {
        return this.f2425a;
    }

    public boolean equals(Object obj) {
        return this.f2425a.equals(((j) obj).b());
    }

    public Locale get(int i10) {
        return this.f2425a.get(i10);
    }

    public int hashCode() {
        return this.f2425a.hashCode();
    }

    public boolean isEmpty() {
        return this.f2425a.isEmpty();
    }

    public int size() {
        return this.f2425a.size();
    }

    public String toString() {
        return this.f2425a.toString();
    }
}
