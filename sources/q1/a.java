package q1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cm.l;
import m1.m;
import t1.b;

public final class a extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar) {
        super(context, bVar);
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
    }

    private final boolean l(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        r5 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        g(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(android.content.Intent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "intent"
            cm.l.f(r5, r0)
            java.lang.String r5 = r5.getAction()
            if (r5 != 0) goto L_0x000c
            return
        L_0x000c:
            m1.m r0 = m1.m.e()
            java.lang.String r1 = q1.b.f14914a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Received "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.a(r1, r2)
            int r0 = r5.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0054;
                case -54942926: goto L_0x0048;
                case 948344062: goto L_0x003f;
                case 1019184907: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x005c
        L_0x0030:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x005c
        L_0x0039:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x003b:
            r4.g(r5)
            goto L_0x005c
        L_0x003f:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x005c
        L_0x0048:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0051
            goto L_0x005c
        L_0x0051:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x003b
        L_0x0054:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0051
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.a.k(android.content.Intent):void");
    }

    /* renamed from: m */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(l(registerReceiver));
        }
        m.e().c(b.f14914a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
