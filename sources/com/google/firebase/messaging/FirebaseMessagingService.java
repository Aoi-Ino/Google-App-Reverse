package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import o3.a;
import o3.c;

public class FirebaseMessagingService extends i {

    /* renamed from: k  reason: collision with root package name */
    private static final Queue f7420k = new ArrayDeque(10);

    /* renamed from: j  reason: collision with root package name */
    private c f7421j;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f7420k;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (g0.t(extras)) {
            g0 g0Var = new g0(extras);
            ExecutorService e10 = o.e();
            try {
                if (!new f(this, g0Var, e10).a()) {
                    if (e0.A(intent)) {
                        e0.t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e10.shutdown();
            }
        }
        r(new n0(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private c o(Context context) {
        if (this.f7421j == null) {
            this.f7421j = new c(context.getApplicationContext());
        }
        return this.f7421j;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).a(new a(intent));
    }

    private void v(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                q();
                return;
            case 1:
                e0.v(intent);
                m(intent);
                return;
            case 2:
                u(n(intent), new r0(intent.getStringExtra("error")));
                return;
            case 3:
                s(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public Intent e(Intent intent) {
        return s0.b().c();
    }

    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public void q() {
    }

    public void r(n0 n0Var) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }
}
