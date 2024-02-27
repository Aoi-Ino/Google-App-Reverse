package hk;

import android.graphics.drawable.Drawable;
import cm.l;
import java.util.Date;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Date f24136a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f24137b;

    public e(Date date, Drawable drawable) {
        l.f(date, "date");
        l.f(drawable, "color");
        this.f24136a = date;
        this.f24137b = drawable;
    }

    public final Drawable a() {
        return this.f24137b;
    }

    public final Date b() {
        return this.f24136a;
    }
}
