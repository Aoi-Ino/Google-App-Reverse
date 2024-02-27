package u1;

import cm.l;
import java.util.Iterator;
import java.util.List;
import m1.m;
import r1.i;
import r1.j;
import r1.o;
import r1.u;
import r1.x;
import r1.z;

public abstract class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f16883a;

    static {
        String i10 = m.i("DiagnosticsWrkr");
        l.e(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f16883a = i10;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return 10 + uVar.f15477a + "\t " + uVar.f15479c + "\t " + num + "\t " + uVar.f15478b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            i d10 = jVar.d(x.a(uVar));
            sb2.append(c(uVar, y.d0(oVar.b(uVar.f15477a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null), d10 != null ? Integer.valueOf(d10.f15452c) : null, y.d0(zVar.d(uVar.f15477a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null)));
        }
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
