package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p5.b;

public abstract class AssetPackState {
    public static AssetPackState h(String str, int i10, int i11, long j10, long j11, double d10, int i12, String str2, String str3) {
        return new j0(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10), i12, str2, str3);
    }

    static AssetPackState i(Bundle bundle, String str, h1 h1Var, p2 p2Var, b0 b0Var) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a10 = b0Var.a(bundle2.getInt(b.a("status", str2)), str2);
        int i10 = bundle2.getInt(b.a("error_code", str2));
        long j10 = bundle2.getLong(b.a("bytes_downloaded", str2));
        long j11 = bundle2.getLong(b.a("total_bytes_to_download", str2));
        double a11 = h1Var.a(str2);
        long j12 = bundle2.getLong(b.a("pack_version", str2));
        long j13 = bundle2.getLong(b.a("pack_base_version", str2));
        int i11 = 1;
        int i12 = 4;
        if (a10 != 4) {
            i12 = a10;
        } else if (!(j13 == 0 || j13 == j12)) {
            i11 = 2;
        }
        return h(str, i12, i10, j10, j11, a11, i11, bundle2.getString(b.a("pack_version_tag", str2), String.valueOf(bundle2.getInt("app_version_code"))), p2Var.a(str2));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
