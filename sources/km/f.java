package km;

import cm.g;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f24758f = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final Pattern f24759e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            cm.l.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            cm.l.e(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km.f.<init>(java.lang.String):void");
    }

    public final boolean a(CharSequence charSequence) {
        l.f(charSequence, "input");
        return this.f24759e.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        l.f(charSequence, "input");
        l.f(str, "replacement");
        String replaceAll = this.f24759e.matcher(charSequence).replaceAll(str);
        l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String c(CharSequence charSequence, String str) {
        l.f(charSequence, "input");
        l.f(str, "replacement");
        String replaceFirst = this.f24759e.matcher(charSequence).replaceFirst(str);
        l.e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List d(CharSequence charSequence, int i10) {
        l.f(charSequence, "input");
        q.g0(i10);
        Matcher matcher = this.f24759e.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return p.d(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = f.d(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if ((i12 >= 0 && arrayList.size() == i12) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f24759e.toString();
        l.e(pattern, "nativePattern.toString()");
        return pattern;
    }

    public f(Pattern pattern) {
        l.f(pattern, "nativePattern");
        this.f24759e = pattern;
    }
}
