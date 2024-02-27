package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import t5.a;

final class i2 {

    /* renamed from: b  reason: collision with root package name */
    private static final a f6747b = new a("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6748a;

    i2(e0 e0Var) {
        this.f6748a = e0Var;
    }

    private static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new d1("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new d1("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new d1("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    public final void a(h2 h2Var) {
        File D = this.f6748a.D(h2Var.f6999b, h2Var.f6734c, h2Var.f6735d, h2Var.f6736e);
        if (D.exists()) {
            File w10 = this.f6748a.w(h2Var.f6999b, h2Var.f6734c, h2Var.f6735d);
            if (!w10.exists()) {
                w10.mkdirs();
            }
            b(D, w10);
            try {
                this.f6748a.a(h2Var.f6999b, h2Var.f6734c, h2Var.f6735d, this.f6748a.q(h2Var.f6999b, h2Var.f6734c, h2Var.f6735d) + 1);
            } catch (IOException e10) {
                f6747b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new d1("Writing merge checkpoint failed.", e10, h2Var.f6998a);
            }
        } else {
            throw new d1(String.format("Cannot find verified files for slice %s.", new Object[]{h2Var.f6736e}), h2Var.f6998a);
        }
    }
}
