package com.github.dhaval2404.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.d;
import cm.g;
import cm.l;
import pl.x;
import w2.b;
import w2.c;
import w2.e;

public final class ImagePickerActivity extends d {
    public static final a K = new a((g) null);
    private e G;
    private b H;
    private w2.d I;
    private c J;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(Context context) {
            l.f(context, "context");
            Intent intent = new Intent();
            String string = context.getString(t2.e.error_task_cancelled);
            l.e(string, "context.getString(R.string.error_task_cancelled)");
            intent.putExtra("extra.error", string);
            return intent;
        }
    }

    private final void f1(Bundle bundle) {
        b bVar;
        w2.d dVar = new w2.d(this);
        this.I = dVar;
        dVar.l(bundle);
        this.J = new c(this);
        Intent intent = getIntent();
        u2.a aVar = (u2.a) (intent != null ? intent.getSerializableExtra("extra.image_provider") : null);
        if (aVar != null) {
            int i10 = t2.b.f16519a[aVar.ordinal()];
            if (i10 == 1) {
                e eVar = new e(this);
                this.G = eVar;
                if (bundle == null) {
                    eVar.j();
                } else {
                    return;
                }
            } else if (i10 == 2) {
                b bVar2 = new b(this);
                this.H = bVar2;
                bVar2.n(bundle);
                if (bundle == null && (bVar = this.H) != null) {
                    bVar.r();
                } else {
                    return;
                }
            }
            x xVar = x.f30437a;
            return;
        }
        Log.e("image_picker", "Image provider can not be null");
        String string = getString(t2.e.error_task_cancelled);
        l.e(string, "getString(R.string.error_task_cancelled)");
        i1(string);
    }

    private final void k1(Uri uri) {
        Intent intent = new Intent();
        intent.setData(uri);
        intent.putExtra("extra.file_path", x2.c.f18193a.g(this, uri));
        setResult(-1, intent);
        finish();
    }

    public final void g1(Uri uri) {
        l.f(uri, "uri");
        b bVar = this.H;
        if (bVar != null) {
            bVar.h();
        }
        w2.d dVar = this.I;
        if (dVar == null) {
            l.v("mCropProvider");
        }
        dVar.h();
        k1(uri);
    }

    public final void h1(Uri uri) {
        l.f(uri, "uri");
        b bVar = this.H;
        if (bVar != null) {
            bVar.h();
        }
        c cVar = this.J;
        if (cVar == null) {
            l.v("mCompressionProvider");
        }
        if (cVar.o(uri)) {
            c cVar2 = this.J;
            if (cVar2 == null) {
                l.v("mCompressionProvider");
            }
            cVar2.j(uri);
            return;
        }
        k1(uri);
    }

    public final void i1(String str) {
        l.f(str, "message");
        Intent intent = new Intent();
        intent.putExtra("extra.error", str);
        setResult(64, intent);
        finish();
    }

    public final void j1(Uri uri) {
        l.f(uri, "uri");
        w2.d dVar = this.I;
        if (dVar == null) {
            l.v("mCropProvider");
        }
        if (dVar.j()) {
            w2.d dVar2 = this.I;
            if (dVar2 == null) {
                l.v("mCropProvider");
            }
            dVar2.n(uri);
            return;
        }
        c cVar = this.J;
        if (cVar == null) {
            l.v("mCompressionProvider");
        }
        if (cVar.o(uri)) {
            c cVar2 = this.J;
            if (cVar2 == null) {
                l.v("mCompressionProvider");
            }
            cVar2.j(uri);
            return;
        }
        k1(uri);
    }

    public final void l1() {
        setResult(0, K.a(this));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        b bVar = this.H;
        if (bVar != null) {
            bVar.l(i10, i11, intent);
        }
        e eVar = this.G;
        if (eVar != null) {
            eVar.h(i10, i11, intent);
        }
        w2.d dVar = this.I;
        if (dVar == null) {
            l.v("mCropProvider");
        }
        dVar.k(i10, i11, intent);
    }

    public void onBackPressed() {
        l1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1(bundle);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        b bVar = this.H;
        if (bVar != null) {
            bVar.m(i10);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        l.f(bundle, "outState");
        b bVar = this.H;
        if (bVar != null) {
            bVar.o(bundle);
        }
        w2.d dVar = this.I;
        if (dVar == null) {
            l.v("mCropProvider");
        }
        dVar.m(bundle);
        super.onSaveInstanceState(bundle);
    }
}
