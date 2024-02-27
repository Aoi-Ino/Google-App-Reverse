package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import androidx.profileinstaller.g;
import h6.e;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import o3.c;
import p4.i;
import p4.l;
import y6.b;

class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f7443a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f7444b;

    /* renamed from: c  reason: collision with root package name */
    private final c f7445c;

    /* renamed from: d  reason: collision with root package name */
    private final b f7446d;

    /* renamed from: e  reason: collision with root package name */
    private final b f7447e;

    /* renamed from: f  reason: collision with root package name */
    private final z6.e f7448f;

    a0(e eVar, f0 f0Var, c cVar, b bVar, b bVar2, z6.e eVar2) {
        this.f7443a = eVar;
        this.f7444b = f0Var;
        this.f7445c = cVar;
        this.f7446d = bVar;
        this.f7447e = bVar2;
        this.f7448f = eVar2;
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private i c(i iVar) {
        return iVar.f(new g(), new z(this));
    }

    private String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f7443a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String h(i iVar) {
        return f((Bundle) iVar.j(IOException.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            h6.e r3 = r2.f7443a
            h6.k r3 = r3.m()
            java.lang.String r3 = r3.c()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.f0 r3 = r2.f7444b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.f0 r3 = r2.f7444b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.f0 r3 = r2.f7444b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.d()
            r5.putString(r3, r4)
            z6.e r3 = r2.f7448f     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            r4 = 0
            p4.i r3 = r3.a(r4)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.Object r3 = p4.l.a(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            com.google.firebase.installations.g r3 = (com.google.firebase.installations.g) r3     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            java.lang.String r3 = r3.b()     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            if (r4 != 0) goto L_0x007a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0076:
            r3 = move-exception
            goto L_0x0080
        L_0x0078:
            r3 = move-exception
            goto L_0x0080
        L_0x007a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch:{ ExecutionException -> 0x0078, InterruptedException -> 0x0076 }
            goto L_0x0085
        L_0x0080:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L_0x0085:
            z6.e r3 = r2.f7448f
            p4.i r3 = r3.c()
            java.lang.Object r3 = p4.l.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "23.4.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            y6.b r3 = r2.f7447e
            java.lang.Object r3 = r3.get()
            w6.j r3 = (w6.j) r3
            y6.b r4 = r2.f7446d
            java.lang.Object r4 = r4.get()
            g7.i r4 = (g7.i) r4
            if (r3 == 0) goto L_0x00e2
            if (r4 == 0) goto L_0x00e2
            java.lang.String r0 = "fire-iid"
            w6.j$a r3 = r3.b(r0)
            w6.j$a r0 = w6.j.a.NONE
            if (r3 == r0) goto L_0x00e2
            int r3 = r3.a()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private i j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f7445c.b(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return l.d(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public i e() {
        return c(j(f0.c(this.f7443a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public i k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    /* access modifiers changed from: package-private */
    public i l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    a0(e eVar, f0 f0Var, b bVar, b bVar2, z6.e eVar2) {
        this(eVar, f0Var, new c(eVar.j()), bVar, bVar2, eVar2);
    }
}
