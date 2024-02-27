package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class v0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f7584a;

    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f7585d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f7586a;

        /* renamed from: b  reason: collision with root package name */
        final String f7587b;

        /* renamed from: c  reason: collision with root package name */
        final long f7588c;

        private a(String str, String str2, long j10) {
            this.f7586a = str;
            this.f7587b = str2;
            this.f7588c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", (Object) str);
                jSONObject.put("appVersion", (Object) str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f7588c + f7585d || !str.equals(this.f7587b);
        }
    }

    public v0(Context context) {
        this.f7584a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.i(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !e()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    c();
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                }
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }

    public synchronized void c() {
        this.f7584a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f7584a.getString(b(str, str2), (String) null));
    }

    public synchronized boolean e() {
        return this.f7584a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 != null) {
            SharedPreferences.Editor edit = this.f7584a.edit();
            edit.putString(b(str, str2), a10);
            edit.commit();
        }
    }
}
