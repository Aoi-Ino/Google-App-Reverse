package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import h6.e;
import h6.l;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.o;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: e  reason: collision with root package name */
    private static l f7612e = l.e();

    /* renamed from: f  reason: collision with root package name */
    private static AtomicBoolean f7613f = new AtomicBoolean(false);

    private static void a(ProviderInfo providerInfo) {
        o.j(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static l b() {
        return f7612e;
    }

    public static boolean c() {
        return f7613f.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            f7613f.set(true);
            Log.i("FirebaseInitProvider", e.p(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
            return false;
        } finally {
            f7613f.set(false);
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
