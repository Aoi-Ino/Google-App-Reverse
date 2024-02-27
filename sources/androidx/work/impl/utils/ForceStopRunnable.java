package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.f0;
import androidx.work.impl.p0;
import androidx.work.impl.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.m;
import m1.x;
import r1.r;
import r1.u;
import r1.v;
import s1.f;
import s1.q;

public class ForceStopRunnable implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    private static final String f4330i = m.i("ForceStopRunnable");

    /* renamed from: j  reason: collision with root package name */
    private static final long f4331j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: e  reason: collision with root package name */
    private final Context f4332e;

    /* renamed from: f  reason: collision with root package name */
    private final p0 f4333f;

    /* renamed from: g  reason: collision with root package name */
    private final q f4334g;

    /* renamed from: h  reason: collision with root package name */
    private int f4335h = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f4336a = m.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                m.e().j(f4336a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, p0 p0Var) {
        this.f4332e = context.getApplicationContext();
        this.f4333f = p0Var;
        this.f4334g = p0Var.j();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4331j;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = g.i(this.f4332e, this.f4333f.n());
        WorkDatabase n10 = this.f4333f.n();
        v H = n10.H();
        r G = n10.G();
        n10.e();
        try {
            List<u> c10 = H.c();
            boolean z10 = c10 != null && !c10.isEmpty();
            if (z10) {
                for (u uVar : c10) {
                    H.p(x.ENQUEUED, uVar.f15477a);
                    H.n(uVar.f15477a, -512);
                    H.f(uVar.f15477a, -1);
                }
            }
            G.b();
            n10.A();
            n10.i();
            return z10 || i10;
        } catch (Throwable th2) {
            n10.i();
            throw th2;
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            m.e().a(f4330i, "Rescheduling Workers.");
            this.f4333f.q();
            this.f4333f.j().e(false);
        } else if (e()) {
            m.e().a(f4330i, "Application was force-stopped, rescheduling.");
            this.f4333f.q();
            this.f4334g.d(this.f4333f.g().a().a());
        } else if (a10) {
            m.e().a(f4330i, "Found unfinished work, scheduling it.");
            z.h(this.f4333f.g(), this.f4333f.n(), this.f4333f.l());
        }
    }

    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f4332e, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List a10 = ((ActivityManager) this.f4332e.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a10 != null && !a10.isEmpty()) {
                    long a11 = this.f4334g.a();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        ApplicationExitInfo a12 = f.a(a10.get(i11));
                        if (a12.getReason() == 10 && a12.getTimestamp() >= a11) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f4332e);
                return true;
            }
            return false;
        } catch (SecurityException e10) {
            e = e10;
            m.e().l(f4330i, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e11) {
            e = e11;
            m.e().l(f4330i, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a g10 = this.f4333f.g();
        if (TextUtils.isEmpty(g10.c())) {
            m.e().a(f4330i, "The default process name was not specified.");
            return true;
        }
        boolean b10 = s1.r.b(this.f4332e, g10);
        m e10 = m.e();
        String str = f4330i;
        e10.a(str, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f4333f.j().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        IllegalStateException illegalStateException;
        androidx.core.util.a e10;
        try {
            if (!f()) {
                this.f4333f.p();
                return;
            }
            while (true) {
                f0.d(this.f4332e);
                m.e().a(f4330i, "Performing cleanup operations.");
                b();
                break;
            }
            e10.a(illegalStateException);
            this.f4333f.p();
        } catch (SQLiteException e11) {
            m.e().c(f4330i, "Unexpected SQLite exception during migrations");
            illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
            e10 = this.f4333f.g().e();
            if (e10 == null) {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e12) {
            int i10 = this.f4335h + 1;
            this.f4335h = i10;
            if (i10 >= 3) {
                String str = androidx.core.os.m.a(this.f4332e) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                m e13 = m.e();
                String str2 = f4330i;
                e13.d(str2, str, e12);
                illegalStateException = new IllegalStateException(str, e12);
                e10 = this.f4333f.g().e();
                if (e10 != null) {
                    m.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                m e14 = m.e();
                String str3 = f4330i;
                e14.b(str3, "Retrying after " + (((long) i10) * 300), e12);
                i(((long) this.f4335h) * 300);
            }
        } catch (Throwable th2) {
            this.f4333f.p();
            throw th2;
        }
    }
}
