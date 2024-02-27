package com.nic.mparivahan.PushNoti.NotViews;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.PushNoti.NotInterface;
import com.nic.mparivahan.R;
import ld.g;
import pl.x;

public final class NotificationView extends d {
    public Context G;
    public RecyclerView H;
    public rc.c I;
    public NotInterface J;
    public g K;
    public ImageView L;
    private int M;
    public sc.a N;
    public LinearLayout O;
    public ProgressDialog P;
    public ld.c Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NotificationView f9419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NotificationView notificationView) {
            super(1);
            this.f9419e = notificationView;
        }

        public final void b(tc.a aVar) {
            try {
                this.f9419e.q1().dismiss();
                throw null;
            } catch (Exception unused) {
                this.f9419e.o1().setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((tc.a) null);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NotificationView f9420e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NotificationView notificationView) {
            super(1);
            this.f9420e = notificationView;
        }

        public final void b(DltVhnTransaction dltVhnTransaction) {
            try {
                this.f9420e.q1().dismiss();
                if (cm.l.a(dltVhnTransaction.getStatusCode(), "AL001")) {
                    this.f9420e.k1().A(this.f9420e.g1());
                    if (this.f9420e.k1().e() > 0) {
                        this.f9420e.o1().setVisibility(8);
                    } else {
                        this.f9420e.o1().setVisibility(0);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DltVhnTransaction) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9421a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9421a = lVar;
        }

        public final pl.c a() {
            return this.f9421a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9421a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void t1(NotificationView notificationView, View view) {
        cm.l.f(notificationView, "this$0");
        notificationView.finish();
    }

    public final void A1(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.O = linearLayout;
    }

    public final void B1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void C1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.T = textView;
    }

    public final void D1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.P = progressDialog;
    }

    public final void E1(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.H = recyclerView;
    }

    public final void F1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.U = textView;
    }

    public final void G1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final int g1() {
        return this.M;
    }

    public final Context h1() {
        Context context = this.G;
        if (context != null) {
            return context;
        }
        cm.l.v("context");
        return null;
    }

    public final NotInterface i1() {
        NotInterface notInterface = this.J;
        if (notInterface != null) {
            return notInterface;
        }
        cm.l.v("mNotInterface");
        return null;
    }

    public final rc.c j1() {
        rc.c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mNotVM");
        return null;
    }

    public final sc.a k1() {
        cm.l.v("mNotadapter");
        return null;
    }

    public final g l1() {
        g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSession");
        return null;
    }

    public final ImageView m1() {
        ImageView imageView = this.L;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("mvvm_back");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("noNotificationTv");
        return null;
    }

    public final LinearLayout o1() {
        LinearLayout linearLayout = this.O;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("no_noti_linear");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_notification_view);
        u1(this);
        x1(new g(this));
        v1(NotInterface.f9415a.a(h1()));
        View findViewById = findViewById(R.id.rec_not);
        cm.l.e(findViewById, "findViewById(...)");
        E1((RecyclerView) findViewById);
        View findViewById2 = findViewById(R.id.mvvm_Back);
        cm.l.e(findViewById2, "findViewById(...)");
        y1((ImageView) findViewById2);
        View findViewById3 = findViewById(R.id.no_noti_linear);
        cm.l.e(findViewById3, "findViewById(...)");
        A1((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.notificationTitle);
        cm.l.e(findViewById4, "findViewById(...)");
        B1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.noNotificationTv);
        cm.l.e(findViewById5, "findViewById(...)");
        z1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.service_label);
        cm.l.e(findViewById6, "findViewById(...)");
        F1((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.notifyTv);
        cm.l.e(findViewById7, "findViewById(...)");
        C1((TextView) findViewById7);
        G1(new ld.c(this));
        D1(new ProgressDialog(this));
        q1().setMessage(s1().b("label_challan_please_wait", "Please wait..."));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        r1().setText(s1().b("label_notifications", "Notifications"));
        n1().setText(s1().b("label_no_notification", "No Notification"));
        p1().setText(s1().b("label_notify_user", "We'll notify you when something arrives."));
        m1().setOnClickListener(new sc.b(this));
        w1((rc.c) new u0((x0) this, (u0.b) new rc.a(new rc.b(i1()))).a(rc.c.class));
        q1().show();
        j1().j(Long.parseLong(l1().k()));
        j1().i().g(this, new c(new a(this)));
        j1().g().g(this, new c(new b(this)));
    }

    public final TextView p1() {
        TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        cm.l.v("notifyTv");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.P;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        cm.l.v("service_label");
        return null;
    }

    public final ld.c s1() {
        ld.c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void u1(Context context) {
        cm.l.f(context, "<set-?>");
        this.G = context;
    }

    public final void v1(NotInterface notInterface) {
        cm.l.f(notInterface, "<set-?>");
        this.J = notInterface;
    }

    public final void w1(rc.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void x1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.K = gVar;
    }

    public final void y1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.L = imageView;
    }

    public final void z1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }
}
