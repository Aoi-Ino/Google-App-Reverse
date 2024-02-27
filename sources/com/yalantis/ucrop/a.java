package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Intent f22656a = new Intent();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f22657b;

    /* renamed from: com.yalantis.ucrop.a$a  reason: collision with other inner class name */
    public static class C0279a {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f22658a = new Bundle();

        public Bundle a() {
            return this.f22658a;
        }

        public void b(Bitmap.CompressFormat compressFormat) {
            this.f22658a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }
    }

    private a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f22657b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f22657b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static a b(Uri uri, Uri uri2) {
        return new a(uri, uri2);
    }

    public Intent a(Context context) {
        this.f22656a.setClass(context, UCropActivity.class);
        this.f22656a.putExtras(this.f22657b);
        return this.f22656a;
    }

    public void c(Activity activity, int i10) {
        activity.startActivityForResult(a(activity), i10);
    }

    public a d(float f10, float f11) {
        this.f22657b.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
        this.f22657b.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        return this;
    }

    public a e(int i10, int i11) {
        if (i10 < 10) {
            i10 = 10;
        }
        if (i11 < 10) {
            i11 = 10;
        }
        this.f22657b.putInt("com.yalantis.ucrop.MaxSizeX", i10);
        this.f22657b.putInt("com.yalantis.ucrop.MaxSizeY", i11);
        return this;
    }

    public a f(C0279a aVar) {
        this.f22657b.putAll(aVar.a());
        return this;
    }
}
