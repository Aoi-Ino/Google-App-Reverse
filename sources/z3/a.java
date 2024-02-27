package z3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;
import p3.i;
import s3.a0;

public abstract class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f18872a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Bundle f18873b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public LinkedList f18874c;

    /* renamed from: d  reason: collision with root package name */
    private final e f18875d = new f(this);

    public static void d(FrameLayout frameLayout) {
        i l10 = i.l();
        Context context = frameLayout.getContext();
        int f10 = l10.f(context);
        String d10 = a0.d(context, f10);
        String c10 = a0.c(context, f10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d10);
        linearLayout.addView(textView);
        Intent a10 = l10.a(context, f10, (String) null);
        if (a10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, a10));
        }
    }

    private final void i(Bundle bundle, i iVar) {
        c cVar = this.f18872a;
        if (cVar != null) {
            iVar.a(cVar);
            return;
        }
        if (this.f18874c == null) {
            this.f18874c = new LinkedList();
        }
        this.f18874c.add(iVar);
        if (bundle != null) {
            Bundle bundle2 = this.f18873b;
            if (bundle2 == null) {
                this.f18873b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f18875d);
    }

    /* access modifiers changed from: protected */
    public abstract void a(e eVar);

    public c b() {
        return this.f18872a;
    }

    public void c(Bundle bundle) {
        i(bundle, new g(this, bundle));
    }
}
