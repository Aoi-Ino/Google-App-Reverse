package wd;

import android.graphics.drawable.Drawable;
import cm.l;
import java.util.Date;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Date f32497a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f32498b;

    public a(Date date, Drawable drawable) {
        l.f(date, "date");
        l.f(drawable, "color");
        this.f32497a = date;
        this.f32498b = drawable;
    }

    public final Drawable a() {
        return this.f32498b;
    }

    public final Date b() {
        return this.f32497a;
    }
}
