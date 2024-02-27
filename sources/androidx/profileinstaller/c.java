package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f3447a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3448b;

    /* renamed from: c  reason: collision with root package name */
    private final i.c f3449c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f3450d;

    /* renamed from: e  reason: collision with root package name */
    private final File f3451e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3452f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3453g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3454h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3455i = false;

    /* renamed from: j  reason: collision with root package name */
    private d[] f3456j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f3457k;

    public c(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f3447a = assetManager;
        this.f3448b = executor;
        this.f3449c = cVar;
        this.f3452f = str;
        this.f3453g = str2;
        this.f3454h = str3;
        this.f3451e = file;
        this.f3450d = d();
    }

    private c b(d[] dVarArr, byte[] bArr) {
        i.c cVar;
        int i10;
        InputStream h10;
        try {
            h10 = h(this.f3447a, this.f3454h);
            if (h10 != null) {
                this.f3456j = n.q(h10, n.o(h10, n.f3485b), bArr, dVarArr);
                h10.close();
                return this;
            }
            if (h10 != null) {
                h10.close();
            }
            return null;
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f3449c;
            i10 = 9;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f3449c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f3456j = null;
            cVar = this.f3449c;
            i10 = 8;
            cVar.b(i10, e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private void c() {
        if (!this.f3455i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return p.f3500e;
            case 26:
                return p.f3499d;
            case 27:
                return p.f3498c;
            case 28:
            case 29:
            case 30:
                return p.f3497b;
            case 31:
            case 32:
            case 33:
                return p.f3496a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        int i10;
        i.c cVar;
        try {
            return h(assetManager, this.f3453g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f3449c;
            i10 = 6;
            cVar.b(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f3449c;
            i10 = 7;
            cVar.b(i10, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f3449c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3449c.a(5, (Object) null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            d[] w10 = n.w(inputStream, n.o(inputStream, n.f3484a), this.f3452f);
            try {
                inputStream.close();
                return w10;
            } catch (IOException e10) {
                this.f3449c.b(7, e10);
                return w10;
            }
        } catch (IOException e11) {
            this.f3449c.b(7, e11);
            inputStream.close();
            return null;
        } catch (IllegalStateException e12) {
            this.f3449c.b(8, e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f3449c.b(7, e13);
            }
            return null;
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f3449c.b(7, e14);
            }
            throw th2;
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return false;
        }
        if (!(i10 == 24 || i10 == 25)) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(int i10, Object obj) {
        this.f3448b.execute(new b(this, i10, obj));
    }

    public boolean e() {
        if (this.f3450d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f3451e.canWrite()) {
            l(4, (Object) null);
            return false;
        } else {
            this.f3455i = true;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f3450d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.c i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f3450d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f3447a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            androidx.profileinstaller.d[] r0 = r2.j(r0)
            r2.f3456j = r0
        L_0x0016:
            androidx.profileinstaller.d[] r0 = r2.f3456j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f3450d
            androidx.profileinstaller.c r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.i():androidx.profileinstaller.c");
    }

    public c m() {
        int i10;
        i.c cVar;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f3456j;
        byte[] bArr = this.f3450d;
        if (!(dVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                n.E(byteArrayOutputStream, bArr);
                if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f3449c.b(5, (Object) null);
                    this.f3456j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f3457k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f3456j = null;
            } catch (IOException e10) {
                e = e10;
                cVar = this.f3449c;
                i10 = 7;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f3449c;
                i10 = 8;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this;
        cVar.b(i10, e);
        this.f3456j = null;
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f3457k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            fileOutputStream = new FileOutputStream(this.f3451e);
            e.l(byteArrayInputStream, fileOutputStream);
            l(1, (Object) null);
            fileOutputStream.close();
            byteArrayInputStream.close();
            this.f3457k = null;
            this.f3456j = null;
            return true;
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f3457k = null;
            this.f3456j = null;
            return false;
        } catch (IOException e11) {
            l(7, e11);
            this.f3457k = null;
            this.f3456j = null;
            return false;
        } catch (Throwable th2) {
            this.f3457k = null;
            this.f3456j = null;
            throw th2;
        }
        throw th;
        throw th;
    }
}
