package y3;

import android.content.Context;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f18489b = new d();

    /* renamed from: a  reason: collision with root package name */
    private c f18490a = null;

    public static c a(Context context) {
        return f18489b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f18490a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f18490a = new c(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18490a;
    }
}
