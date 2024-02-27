package yk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import zk.b;
import zk.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private al.a f33054a;

    /* renamed from: b  reason: collision with root package name */
    private b f33055b;

    /* renamed from: c  reason: collision with root package name */
    private c f33056c = new c();

    /* renamed from: d  reason: collision with root package name */
    private zk.a f33057d = new zk.a(this.f33054a);

    public a() {
        al.a aVar = new al.a();
        this.f33054a = aVar;
        this.f33055b = new b(aVar);
    }

    public void a(Canvas canvas) {
        this.f33055b.a(canvas);
    }

    public al.a b() {
        if (this.f33054a == null) {
            this.f33054a = new al.a();
        }
        return this.f33054a;
    }

    public void c(Context context, AttributeSet attributeSet) {
        this.f33057d.c(context, attributeSet);
    }

    public Pair d(int i10, int i11) {
        return this.f33056c.a(this.f33054a, i10, i11);
    }

    public void e(b.C0389b bVar) {
        this.f33055b.e(bVar);
    }

    public void f(MotionEvent motionEvent) {
        this.f33055b.f(motionEvent);
    }

    public void g(vk.a aVar) {
        this.f33055b.g(aVar);
    }
}
