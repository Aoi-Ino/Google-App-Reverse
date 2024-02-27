package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import t5.a;

final class f3 {

    /* renamed from: b  reason: collision with root package name */
    private static final a f6701b = new a("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6702a;

    f3(e0 e0Var) {
        this.f6702a = e0Var;
    }

    private final void b(e3 e3Var, File file) {
        try {
            File B = this.f6702a.B(e3Var.f6999b, e3Var.f6680c, e3Var.f6681d, e3Var.f6682e);
            if (B.exists()) {
                try {
                    if (f2.a(d3.a(file, B)).equals(e3Var.f6683f)) {
                        f6701b.d("Verification of slice %s of pack %s successful.", e3Var.f6682e, e3Var.f6999b);
                        return;
                    }
                    throw new d1(String.format("Verification failed for slice %s.", new Object[]{e3Var.f6682e}), e3Var.f6998a);
                } catch (NoSuchAlgorithmException e10) {
                    throw new d1("SHA256 algorithm not supported.", e10, e3Var.f6998a);
                } catch (IOException e11) {
                    throw new d1(String.format("Could not digest file during verification for slice %s.", new Object[]{e3Var.f6682e}), e11, e3Var.f6998a);
                }
            } else {
                throw new d1(String.format("Cannot find metadata files for slice %s.", new Object[]{e3Var.f6682e}), e3Var.f6998a);
            }
        } catch (IOException e12) {
            throw new d1(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{e3Var.f6682e}), e12, e3Var.f6998a);
        }
    }

    public final void a(e3 e3Var) {
        File C = this.f6702a.C(e3Var.f6999b, e3Var.f6680c, e3Var.f6681d, e3Var.f6682e);
        if (C.exists()) {
            b(e3Var, C);
            File D = this.f6702a.D(e3Var.f6999b, e3Var.f6680c, e3Var.f6681d, e3Var.f6682e);
            if (!D.exists()) {
                D.mkdirs();
            }
            if (!C.renameTo(D)) {
                throw new d1(String.format("Failed to move slice %s after verification.", new Object[]{e3Var.f6682e}), e3Var.f6998a);
            }
            return;
        }
        throw new d1(String.format("Cannot find unverified files for slice %s.", new Object[]{e3Var.f6682e}), e3Var.f6998a);
    }
}
