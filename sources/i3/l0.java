package i3;

import android.database.sqlite.SQLiteDatabase;
import d3.c;
import i3.m0;

public final /* synthetic */ class l0 implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12282a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.b f12283b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f12284c;

    public /* synthetic */ l0(String str, c.b bVar, long j10) {
        this.f12282a = str;
        this.f12283b = bVar;
        this.f12284c = j10;
    }

    public final Object apply(Object obj) {
        return m0.r1(this.f12282a, this.f12283b, this.f12284c, (SQLiteDatabase) obj);
    }
}
