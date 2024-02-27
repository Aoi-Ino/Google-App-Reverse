package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.List;
import m1.b;
import m1.m;
import o1.e;
import r1.u;
import r1.x;

class c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f4142f = m.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4143a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4144b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4145c;

    /* renamed from: d  reason: collision with root package name */
    private final g f4146d;

    /* renamed from: e  reason: collision with root package name */
    private final e f4147e;

    c(Context context, b bVar, int i10, g gVar) {
        this.f4143a = context;
        this.f4144b = bVar;
        this.f4145c = i10;
        this.f4146d = gVar;
        this.f4147e = new e(gVar.g().m());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<u> w10 = this.f4146d.g().n().H().w();
        ConstraintProxy.a(this.f4143a, w10);
        ArrayList<u> arrayList = new ArrayList<>(w10.size());
        long a10 = this.f4144b.a();
        for (u uVar : w10) {
            if (a10 >= uVar.a() && (!uVar.i() || this.f4147e.a(uVar))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str = uVar2.f15477a;
            Intent b10 = b.b(this.f4143a, x.a(uVar2));
            m e10 = m.e();
            String str2 = f4142f;
            e10.a(str2, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f4146d.f().a().execute(new g.b(this.f4146d, b10, this.f4145c));
        }
    }
}
