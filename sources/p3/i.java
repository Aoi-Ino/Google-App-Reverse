package p3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.j;
import androidx.fragment.app.j;
import b4.g;
import b4.h;
import com.google.android.gms.common.api.GoogleApiActivity;
import n3.a;
import n3.b;
import r3.f;
import r3.p;
import r3.q;
import s3.a0;
import s3.d0;
import s3.o;

public class i extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final int f14641d = j.f14645a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f14642e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final i f14643f = new i();

    /* renamed from: c  reason: collision with root package name */
    private String f14644c;

    public static i l() {
        return f14643f;
    }

    public Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    public PendingIntent b(Context context, int i10, int i11) {
        return super.b(context, i10, i11);
    }

    public final String d(int i10) {
        return super.d(i10);
    }

    public int f(Context context) {
        return super.f(context);
    }

    public int g(Context context, int i10) {
        return super.g(context, i10);
    }

    public final boolean i(int i10) {
        return super.i(i10);
    }

    public Dialog j(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return o(activity, i10, d0.b(activity, a(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent k(Context context, a aVar) {
        return aVar.f() ? aVar.e() : b(context, aVar.c(), 0);
    }

    public boolean m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog j10 = j(activity, i10, i11, onCancelListener);
        if (j10 == null) {
            return false;
        }
        r(activity, j10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(Context context, int i10) {
        s(context, i10, (String) null, c(context, i10, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final Dialog o(Context context, int i10, d0 d0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(a0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = a0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, d0Var);
        }
        String g10 = a0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog p(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(a0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        r(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final q q(Context context, p pVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q qVar = new q(pVar);
        g.o(context, qVar, intentFilter);
        qVar.a(context);
        if (h(context, "com.google.android.gms")) {
            return qVar;
        }
        pVar.a();
        qVar.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof j) {
                p.l2(dialog, onCancelListener).k2(((j) activity).F0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    public final void s(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            t(context);
        } else if (pendingIntent != null) {
            String f10 = a0.f(context, i10);
            String e10 = a0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) o.i(context.getSystemService("notification"));
            j.e x10 = new j.e(context).q(true).e(true).k(f10).x(new j.c().h(e10));
            if (w3.g.b(context)) {
                o.k(w3.j.d());
                x10.v(context.getApplicationInfo().icon).t(2);
                if (w3.g.c(context)) {
                    x10.a(a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    x10.i(pendingIntent);
                }
            } else {
                x10.v(17301642).y(resources.getString(b.common_google_play_services_notification_ticker)).B(System.currentTimeMillis()).i(pendingIntent).j(e10);
            }
            if (w3.j.g()) {
                o.k(w3.j.g());
                synchronized (f14642e) {
                    str2 = this.f14644c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a10 = notificationManager.getNotificationChannel(str2);
                    String b10 = a0.b(context);
                    if (a10 == null) {
                        notificationManager.createNotificationChannel(h.a(str2, b10, 4));
                    } else if (!b10.contentEquals(a10.getName())) {
                        a10.setName(b10);
                        notificationManager.createNotificationChannel(a10);
                    }
                }
                x10.f(str2);
            }
            Notification b11 = x10.b();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                m.f14650b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, b11);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(Context context) {
        new q(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean u(Activity activity, f fVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o10 = o(activity, i10, d0.c(fVar, a(activity, i10, "d"), 2), onCancelListener);
        if (o10 == null) {
            return false;
        }
        r(activity, o10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean v(Context context, a aVar, int i10) {
        PendingIntent k10;
        if (y3.b.a(context) || (k10 = k(context, aVar)) == null) {
            return false;
        }
        s(context, aVar.c(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, k10, i10, true), h.f4442a | 134217728));
        return true;
    }
}
