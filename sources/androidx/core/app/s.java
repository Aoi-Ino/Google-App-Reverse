package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class s implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f2292e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Context f2293f;

    public interface a {
        Intent T();
    }

    private s(Context context) {
        this.f2293f = context;
    }

    public static s s(Context context) {
        return new s(context);
    }

    public void B() {
        E((Bundle) null);
    }

    public void E(Bundle bundle) {
        if (!this.f2292e.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2292e.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.l(this.f2293f, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2293f.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public Iterator iterator() {
        return this.f2292e.iterator();
    }

    public s l(Intent intent) {
        this.f2292e.add(intent);
        return this;
    }

    public s n(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2293f.getPackageManager());
        }
        if (component != null) {
            r(component);
        }
        l(intent);
        return this;
    }

    public s o(Activity activity) {
        Intent T = activity instanceof a ? ((a) activity).T() : null;
        if (T == null) {
            T = h.a(activity);
        }
        if (T != null) {
            ComponentName component = T.getComponent();
            if (component == null) {
                component = T.resolveActivity(this.f2293f.getPackageManager());
            }
            r(component);
            l(T);
        }
        return this;
    }

    public s r(ComponentName componentName) {
        int size = this.f2292e.size();
        try {
            Context context = this.f2293f;
            while (true) {
                Intent b10 = h.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f2292e.add(size, b10);
                context = this.f2293f;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public Intent v(int i10) {
        return (Intent) this.f2292e.get(i10);
    }

    public int y() {
        return this.f2292e.size();
    }
}
