package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ReceivedDoc;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.util.ArrayList;
import java.util.List;
import ni.j7;
import pl.x;
import v9.e;
import v9.f;
import vc.a0;
import vc.c0;
import vc.d0;
import vc.e0;
import vc.t;
import vc.v;
import vc.w;
import vc.y;
import vc.z;
import wc.b0;
import wc.o;
import wc.u;
import zc.g;

public final class RCDashBoard extends androidx.appcompat.app.d implements zc.c, zc.b, g {
    public cd.c G;
    public RcService H;
    public DatabaseHelper I;
    public ArrayList J;
    private j7 K;
    public ld.g L;
    public ProgressDialog M;
    public b0 N;
    private int O;
    private int P;
    public o Q;
    public String R;
    public ld.c S;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RCDashBoard f9477e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RCDashBoard rCDashBoard) {
            super(1);
            this.f9477e = rCDashBoard;
        }

        public final void b(String str) {
            Toast.makeText(this.f9477e.getApplicationContext(), this.f9477e.y1().b(f.f17510a.H0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RCDashBoard f9478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RCDashBoard rCDashBoard) {
            super(1);
            this.f9478e = rCDashBoard;
        }

        public final void b(String str) {
            this.f9478e.w1().dismiss();
            Toast.makeText(this.f9478e.getApplicationContext(), this.f9478e.y1().b(f.f17510a.F0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RCDashBoard f9479e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RCDashBoard rCDashBoard) {
            super(1);
            this.f9479e = rCDashBoard;
        }

        public final void b(String str) {
            this.f9479e.w1().dismiss();
            Toast.makeText(this.f9479e.getApplicationContext(), this.f9479e.y1().b(f.f17510a.D(), "Unable to get the details, Plese try after sometimes!"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements androidx.lifecycle.b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9480a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f9480a = lVar;
        }

        public final pl.c a() {
            return this.f9480a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9480a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(RCDashBoard rCDashBoard, View view) {
        cm.l.f(rCDashBoard, "this$0");
        rCDashBoard.finish();
    }

    /* access modifiers changed from: private */
    public static final void C1(RCDashBoard rCDashBoard, View view) {
        cm.l.f(rCDashBoard, "this$0");
        try {
            j7 j7Var = rCDashBoard.K;
            j7 j7Var2 = null;
            if (j7Var == null) {
                cm.l.v("binding");
                j7Var = null;
            }
            j7Var.f26966e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            j7 j7Var3 = rCDashBoard.K;
            if (j7Var3 == null) {
                cm.l.v("binding");
                j7Var3 = null;
            }
            j7Var3.f26974m.setBackgroundResource(R.drawable.dashboard);
            j7 j7Var4 = rCDashBoard.K;
            if (j7Var4 == null) {
                cm.l.v("binding");
                j7Var4 = null;
            }
            j7Var4.f26963b.setBackgroundResource(R.drawable.dashboard);
            j7 j7Var5 = rCDashBoard.K;
            if (j7Var5 == null) {
                cm.l.v("binding");
                j7Var5 = null;
            }
            j7Var5.f26968g.setImageResource(R.drawable.white_myrc);
            j7 j7Var6 = rCDashBoard.K;
            if (j7Var6 == null) {
                cm.l.v("binding");
                j7Var6 = null;
            }
            j7Var6.f26964c.setImageResource(R.drawable.black_shareicon);
            j7 j7Var7 = rCDashBoard.K;
            if (j7Var7 == null) {
                cm.l.v("binding");
                j7Var7 = null;
            }
            j7Var7.f26971j.setImageResource(R.drawable.black_recived);
            j7 j7Var8 = rCDashBoard.K;
            if (j7Var8 == null) {
                cm.l.v("binding");
                j7Var8 = null;
            }
            j7Var8.f26965d.setTextColor(Color.parseColor("#FFFFFF"));
            j7 j7Var9 = rCDashBoard.K;
            if (j7Var9 == null) {
                cm.l.v("binding");
                j7Var9 = null;
            }
            j7Var9.f26975n.setTextColor(Color.parseColor("#000000"));
            j7 j7Var10 = rCDashBoard.K;
            if (j7Var10 == null) {
                cm.l.v("binding");
                j7Var10 = null;
            }
            j7Var10.f26972k.setTextColor(Color.parseColor("#000000"));
            ArrayList D0 = rCDashBoard.s1().D0();
            cm.l.d(D0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails> }");
            rCDashBoard.M1(D0);
            if (rCDashBoard.r1().size() > 0) {
                j7 j7Var11 = rCDashBoard.K;
                if (j7Var11 == null) {
                    cm.l.v("binding");
                    j7Var11 = null;
                }
                j7Var11.f26976o.setVisibility(8);
                j7 j7Var12 = rCDashBoard.K;
                if (j7Var12 == null) {
                    cm.l.v("binding");
                    j7Var12 = null;
                }
                j7Var12.f26973l.setAdapter((RecyclerView.h) null);
                rCDashBoard.Q1(new o(rCDashBoard.r1(), rCDashBoard, rCDashBoard));
                j7 j7Var13 = rCDashBoard.K;
                if (j7Var13 == null) {
                    cm.l.v("binding");
                } else {
                    j7Var2 = j7Var13;
                }
                j7Var2.f26973l.setAdapter(rCDashBoard.v1());
                return;
            }
            j7 j7Var14 = rCDashBoard.K;
            if (j7Var14 == null) {
                cm.l.v("binding");
                j7Var14 = null;
            }
            j7Var14.f26973l.setAdapter((RecyclerView.h) null);
            j7 j7Var15 = rCDashBoard.K;
            if (j7Var15 == null) {
                cm.l.v("binding");
                j7Var15 = null;
            }
            j7Var15.f26976o.setVisibility(0);
            j7 j7Var16 = rCDashBoard.K;
            if (j7Var16 == null) {
                cm.l.v("binding");
            } else {
                j7Var2 = j7Var16;
            }
            j7Var2.f26976o.setText(rCDashBoard.y1().b(f.f17510a.Z(), "No Virtual RC Found"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(RCDashBoard rCDashBoard, String str) {
        cm.l.f(rCDashBoard, "this$0");
        rCDashBoard.w1().dismiss();
        try {
            rCDashBoard.V1(rCDashBoard, rCDashBoard.y1().b(f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(RCDashBoard rCDashBoard, View view) {
        cm.l.f(rCDashBoard, "this$0");
        j7 j7Var = rCDashBoard.K;
        j7 j7Var2 = null;
        if (j7Var == null) {
            cm.l.v("binding");
            j7Var = null;
        }
        j7Var.f26966e.setBackgroundResource(R.drawable.dashboard);
        j7 j7Var3 = rCDashBoard.K;
        if (j7Var3 == null) {
            cm.l.v("binding");
            j7Var3 = null;
        }
        j7Var3.f26974m.setBackgroundResource(R.drawable.sign_in_new);
        j7 j7Var4 = rCDashBoard.K;
        if (j7Var4 == null) {
            cm.l.v("binding");
            j7Var4 = null;
        }
        j7Var4.f26963b.setBackgroundResource(R.drawable.dashboard);
        j7 j7Var5 = rCDashBoard.K;
        if (j7Var5 == null) {
            cm.l.v("binding");
            j7Var5 = null;
        }
        j7Var5.f26968g.setImageResource(R.drawable.myrcicon);
        j7 j7Var6 = rCDashBoard.K;
        if (j7Var6 == null) {
            cm.l.v("binding");
            j7Var6 = null;
        }
        j7Var6.f26964c.setImageResource(R.drawable.white_shared);
        j7 j7Var7 = rCDashBoard.K;
        if (j7Var7 == null) {
            cm.l.v("binding");
            j7Var7 = null;
        }
        j7Var7.f26971j.setImageResource(R.drawable.black_recived);
        j7 j7Var8 = rCDashBoard.K;
        if (j7Var8 == null) {
            cm.l.v("binding");
            j7Var8 = null;
        }
        j7Var8.f26965d.setTextColor(Color.parseColor("#000000"));
        j7 j7Var9 = rCDashBoard.K;
        if (j7Var9 == null) {
            cm.l.v("binding");
            j7Var9 = null;
        }
        j7Var9.f26975n.setTextColor(Color.parseColor("#FFFFFF"));
        j7 j7Var10 = rCDashBoard.K;
        if (j7Var10 == null) {
            cm.l.v("binding");
        } else {
            j7Var2 = j7Var10;
        }
        j7Var2.f26972k.setTextColor(Color.parseColor("#000000"));
        rCDashBoard.w1().show();
        rCDashBoard.u1().Q(rCDashBoard.z1().k(), rCDashBoard);
    }

    /* access modifiers changed from: private */
    public static final void F1(RCDashBoard rCDashBoard, View view) {
        cm.l.f(rCDashBoard, "this$0");
        j7 j7Var = rCDashBoard.K;
        j7 j7Var2 = null;
        if (j7Var == null) {
            cm.l.v("binding");
            j7Var = null;
        }
        j7Var.f26966e.setBackgroundResource(R.drawable.dashboard);
        j7 j7Var3 = rCDashBoard.K;
        if (j7Var3 == null) {
            cm.l.v("binding");
            j7Var3 = null;
        }
        j7Var3.f26974m.setBackgroundResource(R.drawable.dashboard);
        j7 j7Var4 = rCDashBoard.K;
        if (j7Var4 == null) {
            cm.l.v("binding");
            j7Var4 = null;
        }
        j7Var4.f26963b.setBackgroundResource(R.drawable.sign_in_new);
        j7 j7Var5 = rCDashBoard.K;
        if (j7Var5 == null) {
            cm.l.v("binding");
            j7Var5 = null;
        }
        j7Var5.f26968g.setImageResource(R.drawable.myrcicon);
        j7 j7Var6 = rCDashBoard.K;
        if (j7Var6 == null) {
            cm.l.v("binding");
            j7Var6 = null;
        }
        j7Var6.f26964c.setImageResource(R.drawable.black_shareicon);
        j7 j7Var7 = rCDashBoard.K;
        if (j7Var7 == null) {
            cm.l.v("binding");
            j7Var7 = null;
        }
        j7Var7.f26971j.setImageResource(R.drawable.white_reciced);
        j7 j7Var8 = rCDashBoard.K;
        if (j7Var8 == null) {
            cm.l.v("binding");
            j7Var8 = null;
        }
        j7Var8.f26965d.setTextColor(Color.parseColor("#000000"));
        j7 j7Var9 = rCDashBoard.K;
        if (j7Var9 == null) {
            cm.l.v("binding");
            j7Var9 = null;
        }
        j7Var9.f26975n.setTextColor(Color.parseColor("#000000"));
        j7 j7Var10 = rCDashBoard.K;
        if (j7Var10 == null) {
            cm.l.v("binding");
        } else {
            j7Var2 = j7Var10;
        }
        j7Var2.f26972k.setTextColor(Color.parseColor("#FFFFFF"));
        rCDashBoard.w1().show();
        rCDashBoard.u1().P(rCDashBoard.z1().k(), rCDashBoard);
    }

    /* access modifiers changed from: private */
    public static final void G1(RCDashBoard rCDashBoard, GetSharedRecivedDoc getSharedRecivedDoc) {
        TextView textView;
        String b10;
        cm.l.f(rCDashBoard, "this$0");
        try {
            rCDashBoard.w1().dismiss();
            j7 j7Var = null;
            if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                if (getSharedRecivedDoc.getSharedDocs().size() > 0) {
                    j7 j7Var2 = rCDashBoard.K;
                    if (j7Var2 == null) {
                        cm.l.v("binding");
                        j7Var2 = null;
                    }
                    j7Var2.f26976o.setVisibility(8);
                    j7 j7Var3 = rCDashBoard.K;
                    if (j7Var3 == null) {
                        cm.l.v("binding");
                        j7Var3 = null;
                    }
                    j7Var3.f26973l.setAdapter((RecyclerView.h) null);
                    List<SharedDoc> sharedDocs = getSharedRecivedDoc.getSharedDocs();
                    cm.l.d(sharedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc> }");
                    rCDashBoard.U1(new b0((ArrayList) sharedDocs, rCDashBoard, rCDashBoard));
                    j7 j7Var4 = rCDashBoard.K;
                    if (j7Var4 == null) {
                        cm.l.v("binding");
                    } else {
                        j7Var = j7Var4;
                    }
                    j7Var.f26973l.setAdapter(rCDashBoard.A1());
                    return;
                }
                j7 j7Var5 = rCDashBoard.K;
                if (j7Var5 == null) {
                    cm.l.v("binding");
                    j7Var5 = null;
                }
                j7Var5.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var6 = rCDashBoard.K;
                if (j7Var6 == null) {
                    cm.l.v("binding");
                    j7Var6 = null;
                }
                j7Var6.f26976o.setVisibility(0);
                j7 j7Var7 = rCDashBoard.K;
                if (j7Var7 == null) {
                    cm.l.v("binding");
                } else {
                    j7Var = j7Var7;
                }
                textView = j7Var.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.U(), "No Shared RC found");
            } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                j7 j7Var8 = rCDashBoard.K;
                if (j7Var8 == null) {
                    cm.l.v("binding");
                    j7Var8 = null;
                }
                j7Var8.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var9 = rCDashBoard.K;
                if (j7Var9 == null) {
                    cm.l.v("binding");
                    j7Var9 = null;
                }
                j7Var9.f26976o.setVisibility(0);
                j7 j7Var10 = rCDashBoard.K;
                if (j7Var10 == null) {
                    cm.l.v("binding");
                } else {
                    j7Var = j7Var10;
                }
                textView = j7Var.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.U(), "No Shared RC found");
            } else {
                j7 j7Var11 = rCDashBoard.K;
                if (j7Var11 == null) {
                    cm.l.v("binding");
                    j7Var11 = null;
                }
                j7Var11.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var12 = rCDashBoard.K;
                if (j7Var12 == null) {
                    cm.l.v("binding");
                    j7Var12 = null;
                }
                j7Var12.f26976o.setVisibility(0);
                j7 j7Var13 = rCDashBoard.K;
                if (j7Var13 == null) {
                    cm.l.v("binding");
                } else {
                    j7Var = j7Var13;
                }
                textView = j7Var.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.U(), "No Shared RC found");
            }
            textView.setText(b10);
        } catch (Exception e10) {
            rCDashBoard.w1().dismiss();
            e10.printStackTrace();
            Toast.makeText(rCDashBoard.getApplicationContext(), rCDashBoard.y1().b(f.f17510a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(RCDashBoard rCDashBoard, String str) {
        cm.l.f(rCDashBoard, "this$0");
        rCDashBoard.w1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I1(RCDashBoard rCDashBoard, GetSharedRecivedDoc getSharedRecivedDoc) {
        TextView textView;
        String b10;
        cm.l.f(rCDashBoard, "this$0");
        j7 j7Var = null;
        try {
            rCDashBoard.w1().dismiss();
            if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                if (getSharedRecivedDoc.getReceivedDocs().size() > 0) {
                    j7 j7Var2 = rCDashBoard.K;
                    if (j7Var2 == null) {
                        cm.l.v("binding");
                        j7Var2 = null;
                    }
                    j7Var2.f26976o.setVisibility(8);
                    j7 j7Var3 = rCDashBoard.K;
                    if (j7Var3 == null) {
                        cm.l.v("binding");
                        j7Var3 = null;
                    }
                    j7Var3.f26973l.setAdapter((RecyclerView.h) null);
                    List<ReceivedDoc> receivedDocs = getSharedRecivedDoc.getReceivedDocs();
                    cm.l.d(receivedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc> }");
                    u uVar = new u((ArrayList) receivedDocs, rCDashBoard, rCDashBoard);
                    j7 j7Var4 = rCDashBoard.K;
                    if (j7Var4 == null) {
                        cm.l.v("binding");
                        j7Var4 = null;
                    }
                    j7Var4.f26973l.setAdapter(uVar);
                    return;
                }
                j7 j7Var5 = rCDashBoard.K;
                if (j7Var5 == null) {
                    cm.l.v("binding");
                    j7Var5 = null;
                }
                j7Var5.f26976o.setVisibility(0);
                j7 j7Var6 = rCDashBoard.K;
                if (j7Var6 == null) {
                    cm.l.v("binding");
                    j7Var6 = null;
                }
                j7Var6.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var7 = rCDashBoard.K;
                if (j7Var7 == null) {
                    cm.l.v("binding");
                    j7Var7 = null;
                }
                textView = j7Var7.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.S(), "No Received RC Found");
            } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                j7 j7Var8 = rCDashBoard.K;
                if (j7Var8 == null) {
                    cm.l.v("binding");
                    j7Var8 = null;
                }
                j7Var8.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var9 = rCDashBoard.K;
                if (j7Var9 == null) {
                    cm.l.v("binding");
                    j7Var9 = null;
                }
                j7Var9.f26976o.setVisibility(0);
                j7 j7Var10 = rCDashBoard.K;
                if (j7Var10 == null) {
                    cm.l.v("binding");
                    j7Var10 = null;
                }
                j7Var10.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var11 = rCDashBoard.K;
                if (j7Var11 == null) {
                    cm.l.v("binding");
                    j7Var11 = null;
                }
                textView = j7Var11.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.S(), "No Received RC Found");
            } else if (p.o(getSharedRecivedDoc.getStatusCode(), "VTLD099", true)) {
                j7 j7Var12 = rCDashBoard.K;
                if (j7Var12 == null) {
                    cm.l.v("binding");
                    j7Var12 = null;
                }
                j7Var12.f26976o.setVisibility(0);
                j7 j7Var13 = rCDashBoard.K;
                if (j7Var13 == null) {
                    cm.l.v("binding");
                    j7Var13 = null;
                }
                j7Var13.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var14 = rCDashBoard.K;
                if (j7Var14 == null) {
                    cm.l.v("binding");
                    j7Var14 = null;
                }
                textView = j7Var14.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.S(), "No Received RC Found");
            } else {
                j7 j7Var15 = rCDashBoard.K;
                if (j7Var15 == null) {
                    cm.l.v("binding");
                    j7Var15 = null;
                }
                j7Var15.f26976o.setVisibility(0);
                j7 j7Var16 = rCDashBoard.K;
                if (j7Var16 == null) {
                    cm.l.v("binding");
                    j7Var16 = null;
                }
                j7Var16.f26973l.setAdapter((RecyclerView.h) null);
                j7 j7Var17 = rCDashBoard.K;
                if (j7Var17 == null) {
                    cm.l.v("binding");
                    j7Var17 = null;
                }
                textView = j7Var17.f26976o;
                b10 = rCDashBoard.y1().b(f.f17510a.S(), "No Received RC Found");
            }
            textView.setText(b10);
        } catch (Exception e10) {
            rCDashBoard.w1().dismiss();
            e10.printStackTrace();
            j7 j7Var18 = rCDashBoard.K;
            if (j7Var18 == null) {
                cm.l.v("binding");
                j7Var18 = null;
            }
            j7Var18.f26976o.setVisibility(0);
            j7 j7Var19 = rCDashBoard.K;
            if (j7Var19 == null) {
                cm.l.v("binding");
                j7Var19 = null;
            }
            j7Var19.f26973l.setAdapter((RecyclerView.h) null);
            j7 j7Var20 = rCDashBoard.K;
            if (j7Var20 == null) {
                cm.l.v("binding");
            } else {
                j7Var = j7Var20;
            }
            j7Var.f26976o.setText(rCDashBoard.y1().b(f.f17510a.S(), "No Received RC Found"));
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(RCDashBoard rCDashBoard, SharedRcDeletResponse sharedRcDeletResponse) {
        Context applicationContext;
        String b10;
        cm.l.f(rCDashBoard, "this$0");
        try {
            rCDashBoard.w1().dismiss();
            if (p.o(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                try {
                    rCDashBoard.A1().Q(rCDashBoard.O);
                    rCDashBoard.V1(rCDashBoard, rCDashBoard.y1().b(f.f17510a.t0(), "Shared RC Successfully Deleted!"));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                if (p.o(sharedRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    applicationContext = rCDashBoard.getApplicationContext();
                    b10 = rCDashBoard.y1().b(f.f17510a.H0(), "Unable to delete the shared RC, Please try after some times");
                } else {
                    applicationContext = rCDashBoard.getApplicationContext();
                    b10 = rCDashBoard.y1().b(f.f17510a.H0(), "Unable to delete the shared RC, Please try after some times");
                }
                Toast.makeText(applicationContext, b10, 1).show();
            }
        } catch (Exception unused) {
            rCDashBoard.w1().dismiss();
            Toast.makeText(rCDashBoard.getApplicationContext(), rCDashBoard.y1().b(f.f17510a.H0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(RCDashBoard rCDashBoard, MyRcDeletResponse myRcDeletResponse) {
        Context applicationContext;
        String b10;
        cm.l.f(rCDashBoard, "this$0");
        try {
            rCDashBoard.w1().dismiss();
            if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                try {
                    rCDashBoard.v1().O(rCDashBoard.P);
                    rCDashBoard.s1().X(rCDashBoard.x1());
                    rCDashBoard.V1(rCDashBoard, rCDashBoard.y1().b(f.f17510a.h0(), "Virtual RC successfully deleted!"));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    applicationContext = rCDashBoard.getApplicationContext();
                    b10 = rCDashBoard.y1().b(f.f17510a.F0(), "Unable to delete the Virtual RC, Please try after some time");
                }
            } else {
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    applicationContext = rCDashBoard.getApplicationContext();
                    b10 = rCDashBoard.y1().b(f.f17510a.F0(), "Unable to delete the Virtual RC, Please try after some time");
                } else {
                    applicationContext = rCDashBoard.getApplicationContext();
                    b10 = rCDashBoard.y1().b(f.f17510a.F0(), "Unable to delete the Virtual RC, Please try after some time");
                }
                Toast.makeText(applicationContext, b10, 1).show();
            }
        } catch (Exception unused) {
            rCDashBoard.w1().dismiss();
            Toast.makeText(rCDashBoard.getApplicationContext(), rCDashBoard.y1().b(f.f17510a.F0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(RCDashBoard rCDashBoard, RcModelsDet rcModelsDet) {
        cm.l.f(rCDashBoard, "this$0");
        rCDashBoard.w1().dismiss();
        try {
            rCDashBoard.V1(rCDashBoard, p.o(rcModelsDet.getStatusCode().toString(), "NP001", true) ? "Virtual RC successfully updated!" : rCDashBoard.y1().b(f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
        } catch (Exception unused) {
            rCDashBoard.w1().dismiss();
            rCDashBoard.V1(rCDashBoard, rCDashBoard.y1().b(f.f17510a.O0(), "Unable to Update the Virtual RC, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final b0 A1() {
        b0 b0Var = this.N;
        if (b0Var != null) {
            return b0Var;
        }
        cm.l.v("shared_adapter");
        return null;
    }

    public final void M1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.J = arrayList;
    }

    public void N(String str, int i10) {
        this.O = i10;
        w1().show();
        u1().k(String.valueOf(str), z1().k(), this);
    }

    public final void N1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.I = databaseHelper;
    }

    public final void O1(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.H = rcService;
    }

    public void P(String str, int i10) {
        String s02 = s1().s0(str);
        w1().show();
        cd.c u12 = u1();
        String k10 = z1().k();
        cm.l.c(s02);
        u12.o(k10, s02, this);
    }

    public final void P1(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.G = cVar;
    }

    public final void Q1(o oVar) {
        cm.l.f(oVar, "<set-?>");
        this.Q = oVar;
    }

    public final void R1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.M = progressDialog;
    }

    public final void S1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void T1(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final void U1(b0 b0Var) {
        cm.l.f(b0Var, "<set-?>");
        this.N = b0Var;
    }

    public final void V1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new v(dialog));
        dialog.show();
    }

    public void Y(String str, int i10) {
    }

    public void n(String str, int i10) {
        this.P = i10;
        S1(String.valueOf(str));
        if (s1().s0(str) != null) {
            w1().show();
            String s02 = s1().s0(str);
            cd.c u12 = u1();
            cm.l.c(s02);
            u12.i(s02, this);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j7 c10 = j7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.K = c10;
        j7 j7Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        j7 j7Var2 = this.K;
        if (j7Var2 == null) {
            cm.l.v("binding");
            j7Var2 = null;
        }
        aVar.C1(this, j7Var2);
        T1(new ld.g(this));
        O1(RcService.f9484a.c(this));
        R1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        j7 j7Var3 = this.K;
        if (j7Var3 == null) {
            cm.l.v("binding");
            j7Var3 = null;
        }
        j7Var3.f26969h.setOnClickListener(new t(this));
        j7 j7Var4 = this.K;
        if (j7Var4 == null) {
            cm.l.v("binding");
            j7Var4 = null;
        }
        j7Var4.f26973l.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        N1(A0);
        P1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(t1()))).a(cd.c.class));
        try {
            ArrayList D0 = s1().D0();
            cm.l.d(D0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails> }");
            M1(D0);
            if (r1().size() > 0) {
                j7 j7Var5 = this.K;
                if (j7Var5 == null) {
                    cm.l.v("binding");
                    j7Var5 = null;
                }
                j7Var5.f26966e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
                j7 j7Var6 = this.K;
                if (j7Var6 == null) {
                    cm.l.v("binding");
                    j7Var6 = null;
                }
                j7Var6.f26965d.setTextColor(Color.parseColor("#FFFFFF"));
                j7 j7Var7 = this.K;
                if (j7Var7 == null) {
                    cm.l.v("binding");
                    j7Var7 = null;
                }
                j7Var7.f26968g.setImageResource(R.drawable.white_myrc);
                j7 j7Var8 = this.K;
                if (j7Var8 == null) {
                    cm.l.v("binding");
                    j7Var8 = null;
                }
                j7Var8.f26976o.setVisibility(8);
                Q1(new o(r1(), this, this));
                j7 j7Var9 = this.K;
                if (j7Var9 == null) {
                    cm.l.v("binding");
                    j7Var9 = null;
                }
                j7Var9.f26973l.setAdapter(v1());
            } else {
                j7 j7Var10 = this.K;
                if (j7Var10 == null) {
                    cm.l.v("binding");
                    j7Var10 = null;
                }
                j7Var10.f26966e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
                j7 j7Var11 = this.K;
                if (j7Var11 == null) {
                    cm.l.v("binding");
                    j7Var11 = null;
                }
                j7Var11.f26965d.setTextColor(Color.parseColor("#FFFFFF"));
                j7 j7Var12 = this.K;
                if (j7Var12 == null) {
                    cm.l.v("binding");
                    j7Var12 = null;
                }
                j7Var12.f26976o.setVisibility(0);
                j7 j7Var13 = this.K;
                if (j7Var13 == null) {
                    cm.l.v("binding");
                    j7Var13 = null;
                }
                j7Var13.f26976o.setText(y1().b(f.f17510a.Z(), "No Virtual RC Found"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        j7 j7Var14 = this.K;
        if (j7Var14 == null) {
            cm.l.v("binding");
            j7Var14 = null;
        }
        j7Var14.f26966e.setOnClickListener(new vc.x(this));
        j7 j7Var15 = this.K;
        if (j7Var15 == null) {
            cm.l.v("binding");
            j7Var15 = null;
        }
        j7Var15.f26974m.setOnClickListener(new y(this));
        j7 j7Var16 = this.K;
        if (j7Var16 == null) {
            cm.l.v("binding");
        } else {
            j7Var = j7Var16;
        }
        j7Var.f26963b.setOnClickListener(new z(this));
        u1().F().g(this, new a0(this));
        u1().G().g(this, new vc.b0(this));
        u1().D().g(this, new c0(this));
        u1().E().g(this, new d(new c(this)));
        u1().J().g(this, new d0(this));
        u1().K().g(this, new d(new a(this)));
        u1().z().g(this, new e0(this));
        u1().A().g(this, new d(new b(this)));
        u1().R().g(this, new vc.u(this));
        u1().S().g(this, new w(this));
    }

    public final ArrayList r1() {
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final DatabaseHelper s1() {
        DatabaseHelper databaseHelper = this.I;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final RcService t1() {
        RcService rcService = this.H;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c u1() {
        cd.c cVar = this.G;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final o v1() {
        o oVar = this.Q;
        if (oVar != null) {
            return oVar;
        }
        cm.l.v("myRcAdapter");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.M;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("selectedRcNumber");
        return null;
    }

    public final ld.c y1() {
        ld.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g z1() {
        ld.g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }
}
