package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class c extends r implements DialogInterface {

    /* renamed from: j  reason: collision with root package name */
    final AlertController f623j = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final AlertController.b f624a;

        /* renamed from: b  reason: collision with root package name */
        private final int f625b;

        public a(Context context) {
            this(context, c.m(context, 0));
        }

        public c a() {
            c cVar = new c(this.f624a.f573a, this.f625b);
            this.f624a.a(cVar.f623j);
            cVar.setCancelable(this.f624a.f590r);
            if (this.f624a.f590r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f624a.f591s);
            cVar.setOnDismissListener(this.f624a.f592t);
            DialogInterface.OnKeyListener onKeyListener = this.f624a.f593u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f624a.f573a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f595w = listAdapter;
            bVar.f596x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f624a.f579g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f624a.f576d = drawable;
            return this;
        }

        public a f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f594v = charSequenceArr;
            bVar.f596x = onClickListener;
            return this;
        }

        public a g(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f584l = bVar.f573a.getText(i10);
            this.f624a.f586n = onClickListener;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f584l = charSequence;
            bVar.f586n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnCancelListener onCancelListener) {
            this.f624a.f591s = onCancelListener;
            return this;
        }

        public a j(DialogInterface.OnDismissListener onDismissListener) {
            this.f624a.f592t = onDismissListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f624a.f593u = onKeyListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f581i = charSequence;
            bVar.f583k = onClickListener;
            return this;
        }

        public a m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f624a;
            bVar.f595w = listAdapter;
            bVar.f596x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a n(int i10) {
            AlertController.b bVar = this.f624a;
            bVar.f578f = bVar.f573a.getText(i10);
            return this;
        }

        public a o(CharSequence charSequence) {
            this.f624a.f578f = charSequence;
            return this;
        }

        public a p(View view) {
            AlertController.b bVar = this.f624a;
            bVar.f598z = view;
            bVar.f597y = 0;
            bVar.E = false;
            return this;
        }

        public c q() {
            c a10 = a();
            a10.show();
            return a10;
        }

        public a(Context context, int i10) {
            this.f624a = new AlertController.b(new ContextThemeWrapper(context, c.m(context, i10)));
            this.f625b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, m(context, i10));
    }

    static int m(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i10) {
        return this.f623j.c(i10);
    }

    public ListView j() {
        return this.f623j.e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f623j.f();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f623j.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f623j.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f623j.q(charSequence);
    }
}
