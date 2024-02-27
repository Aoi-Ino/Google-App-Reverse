package m;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.h;
import androidx.lifecycle.b0;

public class w extends h {
    private int A0;
    private int B0;
    private ImageView C0;
    TextView D0;

    /* renamed from: x0  reason: collision with root package name */
    final Handler f13640x0 = new Handler(Looper.getMainLooper());

    /* renamed from: y0  reason: collision with root package name */
    final Runnable f13641y0 = new a();

    /* renamed from: z0  reason: collision with root package name */
    r f13642z0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            w.this.q2();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            w.this.f13642z0.c0(true);
        }
    }

    class c implements b0 {
        c() {
        }

        /* renamed from: a */
        public void b(Integer num) {
            w wVar = w.this;
            wVar.f13640x0.removeCallbacks(wVar.f13641y0);
            w.this.s2(num.intValue());
            w.this.t2(num.intValue());
            w wVar2 = w.this;
            wVar2.f13640x0.postDelayed(wVar2.f13641y0, 2000);
        }
    }

    class d implements b0 {
        d() {
        }

        /* renamed from: a */
        public void b(CharSequence charSequence) {
            w wVar = w.this;
            wVar.f13640x0.removeCallbacks(wVar.f13641y0);
            w.this.u2(charSequence);
            w wVar2 = w.this;
            wVar2.f13640x0.postDelayed(wVar2.f13641y0, 2000);
        }
    }

    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class f {
        static int a() {
            return f.a.f11176v;
        }
    }

    private w() {
    }

    private void l2() {
        r e10 = q.e(this, o2());
        this.f13642z0 = e10;
        e10.t().g(this, new c());
        this.f13642z0.r().g(this, new d());
    }

    private Drawable m2(int i10, int i11) {
        int i12;
        Context w10 = w();
        if (w10 == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (!(i10 == 0 && i11 == 1)) {
            if (i10 == 1 && i11 == 2) {
                i12 = b0.fingerprint_dialog_error;
                return androidx.core.content.a.e(w10, i12);
            } else if (!((i10 == 2 && i11 == 1) || (i10 == 1 && i11 == 3))) {
                return null;
            }
        }
        i12 = b0.fingerprint_dialog_fp_icon;
        return androidx.core.content.a.e(w10, i12);
    }

    private int n2(int i10) {
        Context w10 = w();
        if (w10 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        w10.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = w10.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    private boolean o2() {
        return u().getBoolean("host_activity", true);
    }

    static w p2(boolean z10) {
        w wVar = new w();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z10);
        wVar.K1(bundle);
        return wVar;
    }

    private boolean r2(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    public void C0(Bundle bundle) {
        int c10;
        super.C0(bundle);
        l2();
        if (Build.VERSION.SDK_INT >= 26) {
            c10 = n2(f.a());
        } else {
            Context w10 = w();
            c10 = w10 != null ? androidx.core.content.a.c(w10, a0.biometric_error_color) : 0;
        }
        this.A0 = c10;
        this.B0 = n2(16842808);
    }

    public void S0() {
        super.S0();
        this.f13640x0.removeCallbacksAndMessages((Object) null);
    }

    public void X0() {
        super.X0();
        this.f13642z0.Z(0);
        this.f13642z0.a0(1);
        this.f13642z0.Y(e0(e0.fingerprint_dialog_touch_sensor));
    }

    public Dialog d2(Bundle bundle) {
        c.a aVar = new c.a(E1());
        aVar.o(this.f13642z0.y());
        View inflate = LayoutInflater.from(aVar.b()).inflate(d0.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(c0.fingerprint_subtitle);
        if (textView != null) {
            CharSequence x10 = this.f13642z0.x();
            if (TextUtils.isEmpty(x10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(x10);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(c0.fingerprint_description);
        if (textView2 != null) {
            CharSequence q10 = this.f13642z0.q();
            if (TextUtils.isEmpty(q10)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(q10);
            }
        }
        this.C0 = (ImageView) inflate.findViewById(c0.fingerprint_icon);
        this.D0 = (TextView) inflate.findViewById(c0.fingerprint_error);
        aVar.h(b.d(this.f13642z0.g()) ? e0(e0.confirm_device_credential_password) : this.f13642z0.w(), new b());
        aVar.p(inflate);
        androidx.appcompat.app.c a10 = aVar.a();
        a10.setCanceledOnTouchOutside(false);
        return a10;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f13642z0.W(true);
    }

    /* access modifiers changed from: package-private */
    public void q2() {
        Context w10 = w();
        if (w10 == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        this.f13642z0.a0(1);
        this.f13642z0.Y(w10.getString(e0.fingerprint_dialog_touch_sensor));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = r3.f13642z0.s();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s2(int r4) {
        /*
            r3 = this;
            android.widget.ImageView r0 = r3.C0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            m.r r0 = r3.f13642z0
            int r0 = r0.s()
            android.graphics.drawable.Drawable r1 = r3.m2(r0, r4)
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            android.widget.ImageView r2 = r3.C0
            r2.setImageDrawable(r1)
            boolean r0 = r3.r2(r0, r4)
            if (r0 == 0) goto L_0x0020
            m.w.e.a(r1)
        L_0x0020:
            m.r r0 = r3.f13642z0
            r0.Z(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.w.s2(int):void");
    }

    /* access modifiers changed from: package-private */
    public void t2(int i10) {
        TextView textView = this.D0;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.A0 : this.B0);
        }
    }

    /* access modifiers changed from: package-private */
    public void u2(CharSequence charSequence) {
        TextView textView = this.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
