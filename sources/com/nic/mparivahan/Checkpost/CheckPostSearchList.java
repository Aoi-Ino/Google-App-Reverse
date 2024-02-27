package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import ni.k0;
import pl.x;
import v9.e;
import z8.i;

public final class CheckPostSearchList extends androidx.appcompat.app.d {
    private String G = "";
    private String H = "";
    private String I = "";
    /* access modifiers changed from: private */
    public k0 J;
    public ld.c K;
    private CheckPostService L;
    private c9.a M;
    private a9.b N;
    private ArrayList O = new ArrayList();
    private final String P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private ArrayList Q = new ArrayList();

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostSearchList f7746e;

        a(CheckPostSearchList checkPostSearchList) {
            this.f7746e = checkPostSearchList;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                k0 j12 = this.f7746e.J;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f27060e.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostSearchList f7747e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CheckPostSearchList checkPostSearchList) {
            super(1);
            this.f7747e = checkPostSearchList;
        }

        public final void b(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            try {
                k0 j12 = this.f7747e.J;
                k0 k0Var = null;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f27061f.setVisibility(8);
                k0 j13 = this.f7747e.J;
                if (j13 == null) {
                    l.v("binding");
                    j13 = null;
                }
                j13.f27058c.setVisibility(8);
                k0 j14 = this.f7747e.J;
                if (j14 == null) {
                    l.v("binding");
                    j14 = null;
                }
                j14.f27059d.setVisibility(0);
                k0 j15 = this.f7747e.J;
                if (j15 == null) {
                    l.v("binding");
                } else {
                    k0Var = j15;
                }
                k0Var.f27066k.setVisibility(0);
                CheckPostSearchList checkPostSearchList = this.f7747e;
                l.d(checkPostReceiptDetailNew, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem> }");
                checkPostSearchList.x1(checkPostReceiptDetailNew);
                CheckPostSearchList checkPostSearchList2 = this.f7747e;
                checkPostSearchList2.v1(checkPostSearchList2.p1());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckPostReceiptDetailNew) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostSearchList f7748e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CheckPostSearchList checkPostSearchList) {
            super(1);
            this.f7748e = checkPostSearchList;
        }

        public final void b(String str) {
            k0 j12 = this.f7748e.J;
            k0 k0Var = null;
            if (j12 == null) {
                l.v("binding");
                j12 = null;
            }
            j12.f27061f.setVisibility(8);
            k0 j13 = this.f7748e.J;
            if (j13 == null) {
                l.v("binding");
                j13 = null;
            }
            j13.f27058c.setVisibility(0);
            k0 j14 = this.f7748e.J;
            if (j14 == null) {
                l.v("binding");
                j14 = null;
            }
            j14.f27059d.setVisibility(8);
            k0 j15 = this.f7748e.J;
            if (j15 == null) {
                l.v("binding");
            } else {
                k0Var = j15;
            }
            k0Var.f27066k.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostSearchList f7749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CheckPostSearchList checkPostSearchList) {
            super(1);
            this.f7749e = checkPostSearchList;
        }

        public final void b(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            try {
                k0 j12 = this.f7749e.J;
                k0 k0Var = null;
                if (j12 == null) {
                    l.v("binding");
                    j12 = null;
                }
                j12.f27061f.setVisibility(8);
                k0 j13 = this.f7749e.J;
                if (j13 == null) {
                    l.v("binding");
                    j13 = null;
                }
                j13.f27058c.setVisibility(8);
                k0 j14 = this.f7749e.J;
                if (j14 == null) {
                    l.v("binding");
                    j14 = null;
                }
                j14.f27059d.setVisibility(0);
                k0 j15 = this.f7749e.J;
                if (j15 == null) {
                    l.v("binding");
                } else {
                    k0Var = j15;
                }
                k0Var.f27066k.setVisibility(0);
                CheckPostSearchList checkPostSearchList = this.f7749e;
                l.d(checkPostReceiptDetailNew, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem> }");
                checkPostSearchList.x1(checkPostReceiptDetailNew);
                CheckPostSearchList checkPostSearchList2 = this.f7749e;
                checkPostSearchList2.v1(checkPostSearchList2.p1());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckPostReceiptDetailNew) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostSearchList f7750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CheckPostSearchList checkPostSearchList) {
            super(1);
            this.f7750e = checkPostSearchList;
        }

        public final void b(String str) {
            str.equals("SUCCESS");
            k0 j12 = this.f7750e.J;
            k0 k0Var = null;
            if (j12 == null) {
                l.v("binding");
                j12 = null;
            }
            j12.f27061f.setVisibility(8);
            k0 j13 = this.f7750e.J;
            if (j13 == null) {
                l.v("binding");
                j13 = null;
            }
            j13.f27058c.setVisibility(0);
            k0 j14 = this.f7750e.J;
            if (j14 == null) {
                l.v("binding");
                j14 = null;
            }
            j14.f27059d.setVisibility(8);
            k0 j15 = this.f7750e.J;
            if (j15 == null) {
                l.v("binding");
            } else {
                k0Var = j15;
            }
            k0Var.f27066k.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7751a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f7751a = lVar;
        }

        public final pl.c a() {
            return this.f7751a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7751a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        cm.l.v("binding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r1.f27060e.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00de, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A1() {
        /*
            r7 = this;
            ni.k0 r0 = r7.J
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r7.I
            java.lang.String r4 = "Receipt"
            boolean r3 = cm.l.a(r3, r4)
            r4 = 5
            r5 = 1
            if (r3 == 0) goto L_0x0085
            int r3 = r0.length()
            if (r3 != 0) goto L_0x005c
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x0037
            cm.l.v(r2)
            r0 = r1
        L_0x0037:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            ld.c r3 = r7.o1()
            r4 = 2132018750(0x7f14063e, float:1.9675815E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r6 = "pls_enter_FancyRecpNo"
            java.lang.String r3 = r3.b(r6, r4)
            r0.setError(r3)
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x0055
        L_0x0051:
            cm.l.v(r2)
            goto L_0x0056
        L_0x0055:
            r1 = r0
        L_0x0056:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f27060e
            r0.requestFocus()
            return r5
        L_0x005c:
            int r3 = r0.length()
            if (r3 >= r4) goto L_0x0085
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x006a
            cm.l.v(r2)
            r0 = r1
        L_0x006a:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            ld.c r3 = r7.o1()
            r4 = 2132018717(0x7f14061d, float:1.9675749E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r6 = "please_enter_rcpt_no5_char"
            java.lang.String r3 = r3.b(r6, r4)
            r0.setError(r3)
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x0055
            goto L_0x0051
        L_0x0085:
            java.lang.String r3 = r7.I
            java.lang.String r6 = "Vehicle"
            boolean r3 = cm.l.a(r3, r6)
            if (r3 == 0) goto L_0x00e2
            int r3 = r0.length()
            if (r3 != 0) goto L_0x00b8
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x009d
            cm.l.v(r2)
            r0 = r1
        L_0x009d:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            ld.c r3 = r7.o1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r6 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r6, r4)
            r0.setError(r3)
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x0055
            goto L_0x0051
        L_0x00b8:
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x00e2
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x00c6
            cm.l.v(r2)
            r0 = r1
        L_0x00c6:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            ld.c r3 = r7.o1()
            r4 = 2132018718(0x7f14061e, float:1.967575E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r6 = "please_enter_vehicle_no5_char"
            java.lang.String r3 = r3.b(r6, r4)
            r0.setError(r3)
            ni.k0 r0 = r7.J
            if (r0 != 0) goto L_0x0055
            goto L_0x0051
        L_0x00e2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Checkpost.CheckPostSearchList.A1():boolean");
    }

    private final void l1() {
        if (!t1()) {
            y1(this, o1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        } else if (l.a(this.I, "Receipt")) {
            m1();
        } else if (l.a(this.I, "Vehicle")) {
            n1();
        }
    }

    private final void m1() {
        try {
            k0 k0Var = this.J;
            c9.a aVar = null;
            if (k0Var == null) {
                l.v("binding");
                k0Var = null;
            }
            k0Var.f27061f.setVisibility(0);
            c9.a aVar2 = this.M;
            if (aVar2 == null) {
                l.v("viewModel");
            } else {
                aVar = aVar2;
            }
            aVar.k(this.G);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void n1() {
        try {
            k0 k0Var = this.J;
            c9.a aVar = null;
            if (k0Var == null) {
                l.v("binding");
                k0Var = null;
            }
            k0Var.f27061f.setVisibility(0);
            c9.a aVar2 = this.M;
            if (aVar2 == null) {
                l.v("viewModel");
            } else {
                aVar = aVar2;
            }
            aVar.l(this.H, this.G);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r0 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        if (r0 == null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q1() {
        /*
            r8 = this;
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            b9.c r1 = new b9.c
            b9.a r2 = new b9.a
            com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService r3 = r8.L
            r4 = 0
            if (r3 != 0) goto L_0x0011
            java.lang.String r3 = "retrofitService"
            cm.l.v(r3)
            r3 = r4
        L_0x0011:
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r8, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<c9.a> r1 = c9.a.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            c9.a r0 = (c9.a) r0
            r8.M = r0
            ni.k0 r0 = r8.J
            java.lang.String r1 = "binding"
            if (r0 != 0) goto L_0x002e
            cm.l.v(r1)
            r0 = r4
        L_0x002e:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            java.lang.String r2 = r8.P
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r2)
            r0.setKeyListener(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x0041
            cm.l.v(r1)
            r0 = r4
        L_0x0041:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            r2 = 4096(0x1000, float:5.74E-42)
            r0.setRawInputType(r2)
            java.lang.String r0 = r8.I
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00dd
            java.lang.String r0 = r8.I
            java.lang.String r2 = "Receipt"
            boolean r2 = cm.l.a(r0, r2)
            r3 = 8
            r5 = 15
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x00a4
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x0068
            cm.l.v(r1)
            r0 = r4
        L_0x0068:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            android.text.InputFilter$LengthFilter[] r2 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            r7.<init>(r5)
            r2[r6] = r7
            android.text.InputFilter[] r2 = (android.text.InputFilter[]) r2
            r0.setFilters(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x0080
            cm.l.v(r1)
            r0 = r4
        L_0x0080:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            ld.c r2 = r8.o1()
            r5 = 2132017906(0x7f1402f2, float:1.9674104E38)
            java.lang.String r5 = r8.getString(r5)
            java.lang.String r6 = "enter_FancyRecpNo"
            java.lang.String r2 = r2.b(r6, r5)
            r0.setHint(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x009e
        L_0x009a:
            cm.l.v(r1)
            r0 = r4
        L_0x009e:
            android.widget.LinearLayout r0 = r0.f27063h
            r0.setVisibility(r3)
            goto L_0x00dd
        L_0x00a4:
            java.lang.String r2 = "Vehicle"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x00dd
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x00b4
            cm.l.v(r1)
            r0 = r4
        L_0x00b4:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            android.text.InputFilter$LengthFilter[] r2 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
            r7.<init>(r5)
            r2[r6] = r7
            android.text.InputFilter[] r2 = (android.text.InputFilter[]) r2
            r0.setFilters(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x00cc
            cm.l.v(r1)
            r0 = r4
        L_0x00cc:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            r2 = 2132017941(0x7f140315, float:1.9674175E38)
            java.lang.String r2 = r8.getString(r2)
            r0.setHint(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x009e
            goto L_0x009a
        L_0x00dd:
            java.lang.String r0 = r8.G
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00f4
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x00ed
            cm.l.v(r1)
            r0 = r4
        L_0x00ed:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            java.lang.String r2 = r8.G
            r0.setText(r2)
        L_0x00f4:
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x00fc
            cm.l.v(r1)
            r0 = r4
        L_0x00fc:
            com.nic.mparivahan.MyTextView r0 = r0.f27062g
            z8.j r2 = new z8.j
            r2.<init>(r8)
            r0.setOnClickListener(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x010e
            cm.l.v(r1)
            r0 = r4
        L_0x010e:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f27060e
            z8.k r2 = new z8.k
            r2.<init>(r8)
            r0.setOnEditorActionListener(r2)
            ni.k0 r0 = r8.J
            if (r0 != 0) goto L_0x0120
            cm.l.v(r1)
            goto L_0x0121
        L_0x0120:
            r4 = r0
        L_0x0121:
            androidx.appcompat.widget.AppCompatEditText r0 = r4.f27060e
            com.nic.mparivahan.Checkpost.CheckPostSearchList$a r1 = new com.nic.mparivahan.Checkpost.CheckPostSearchList$a
            r1.<init>(r8)
            r0.addTextChangedListener(r1)
            r8.l1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Checkpost.CheckPostSearchList.q1():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r6 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r5 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r5 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r6 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r1(com.nic.mparivahan.Checkpost.CheckPostSearchList r5, android.view.View r6) {
        /*
            java.lang.String r6 = "this$0"
            cm.l.f(r5, r6)
            java.lang.String r6 = r5.I
            java.lang.String r0 = "Vehicle"
            boolean r6 = cm.l.a(r6, r0)
            r0 = 0
            java.lang.String r1 = "binding"
            if (r6 == 0) goto L_0x0039
            boolean r6 = r5.A1()
            if (r6 != 0) goto L_0x0039
            ni.k0 r6 = r5.J
            if (r6 != 0) goto L_0x0020
        L_0x001c:
            cm.l.v(r1)
            goto L_0x0021
        L_0x0020:
            r0 = r6
        L_0x0021:
            androidx.appcompat.widget.AppCompatEditText r6 = r0.f27060e
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.CharSequence r6 = km.q.B0(r6)
            java.lang.String r6 = r6.toString()
            r5.G = r6
            r5.l1()
            goto L_0x004e
        L_0x0039:
            java.lang.String r6 = r5.I
            java.lang.String r2 = "Receipt"
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.A1()
            if (r6 != 0) goto L_0x004f
            ni.k0 r6 = r5.J
            if (r6 != 0) goto L_0x0020
            goto L_0x001c
        L_0x004e:
            return
        L_0x004f:
            java.lang.String r6 = r5.I
            boolean r6 = cm.l.a(r6, r2)
            if (r6 == 0) goto L_0x0084
            ni.k0 r6 = r5.J
            if (r6 != 0) goto L_0x005f
            cm.l.v(r1)
            r6 = r0
        L_0x005f:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f27060e
            ld.c r2 = r5.o1()
            r3 = 2132018750(0x7f14063e, float:1.9675815E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "pls_enter_FancyRecpNo"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            ni.k0 r5 = r5.J
            if (r5 != 0) goto L_0x007d
        L_0x0079:
            cm.l.v(r1)
            goto L_0x007e
        L_0x007d:
            r0 = r5
        L_0x007e:
            androidx.appcompat.widget.AppCompatEditText r5 = r0.f27060e
            r5.requestFocus()
            return
        L_0x0084:
            ni.k0 r6 = r5.J
            if (r6 != 0) goto L_0x008c
            cm.l.v(r1)
            r6 = r0
        L_0x008c:
            androidx.appcompat.widget.AppCompatEditText r6 = r6.f27060e
            ld.c r2 = r5.o1()
            r3 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r4 = "label_challan_please_enter_vehicle_no"
            java.lang.String r2 = r2.b(r4, r3)
            r6.setError(r2)
            ni.k0 r5 = r5.J
            if (r5 != 0) goto L_0x007d
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Checkpost.CheckPostSearchList.r1(com.nic.mparivahan.Checkpost.CheckPostSearchList, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final boolean s1(CheckPostSearchList checkPostSearchList, TextView textView, int i10, KeyEvent keyEvent) {
        l.f(checkPostSearchList, "this$0");
        if (i10 != 6) {
            return false;
        }
        if (l.a(checkPostSearchList.I, "Vehicle")) {
            checkPostSearchList.onBackPressed();
        } else {
            k0 k0Var = null;
            if (!l.a(checkPostSearchList.I, "Receipt") || checkPostSearchList.A1()) {
                k0 k0Var2 = checkPostSearchList.J;
                if (k0Var2 == null) {
                    l.v("binding");
                    k0Var2 = null;
                }
                k0Var2.f27060e.setError(checkPostSearchList.o1().b("pls_enter_FancyRecpNo", checkPostSearchList.getString(R.string.please_enter_rcpt_no)));
                k0 k0Var3 = checkPostSearchList.J;
                if (k0Var3 == null) {
                    l.v("binding");
                } else {
                    k0Var = k0Var3;
                }
                k0Var.f27060e.requestFocus();
                return true;
            }
            k0 k0Var4 = checkPostSearchList.J;
            if (k0Var4 == null) {
                l.v("binding");
            } else {
                k0Var = k0Var4;
            }
            checkPostSearchList.G = q.B0(String.valueOf(k0Var.f27060e.getText())).toString();
            checkPostSearchList.l1();
        }
        return true;
    }

    private final boolean t1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* access modifiers changed from: private */
    public static final void u1(CheckPostSearchList checkPostSearchList, View view) {
        l.f(checkPostSearchList, "this$0");
        checkPostSearchList.finish();
    }

    /* access modifiers changed from: private */
    public final void v1(List list) {
        a9.b bVar = this.N;
        if (bVar == null) {
            l.v("adapter");
            bVar = null;
        }
        bVar.B(list);
        bVar.j();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final ld.c o1() {
        ld.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0 c10 = k0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.J = c10;
        c9.a aVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar2 = v9.e.f17509a;
        k0 k0Var = this.J;
        if (k0Var == null) {
            l.v("binding");
            k0Var = null;
        }
        aVar2.X(this, k0Var);
        w1(new ld.c(this));
        String stringExtra = getIntent().getStringExtra("vehReciptNo");
        l.c(stringExtra);
        this.G = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("stateCode");
        l.c(stringExtra2);
        this.H = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("inputType");
        l.c(stringExtra3);
        this.I = stringExtra3;
        Log.e("input1", stringExtra3);
        Log.e("input12", this.H);
        Log.e("input123", this.G);
        this.L = CheckPostService.f7743a.b(this);
        k0 k0Var2 = this.J;
        if (k0Var2 == null) {
            l.v("binding");
            k0Var2 = null;
        }
        k0Var2.f27065j.f28305f.setOnClickListener(new i(this));
        k0 k0Var3 = this.J;
        if (k0Var3 == null) {
            l.v("binding");
            k0Var3 = null;
        }
        k0Var3.f27059d.setLayoutManager(new LinearLayoutManager(this));
        this.N = new a9.b(this, this.O, this.I, o1());
        k0 k0Var4 = this.J;
        if (k0Var4 == null) {
            l.v("binding");
            k0Var4 = null;
        }
        RecyclerView recyclerView = k0Var4.f27059d;
        a9.b bVar = this.N;
        if (bVar == null) {
            l.v("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        q1();
        c9.a aVar3 = this.M;
        if (aVar3 == null) {
            l.v("viewModel");
            aVar3 = null;
        }
        aVar3.g().g(this, new f(new b(this)));
        c9.a aVar4 = this.M;
        if (aVar4 == null) {
            l.v("viewModel");
            aVar4 = null;
        }
        aVar4.h().g(this, new f(new c(this)));
        c9.a aVar5 = this.M;
        if (aVar5 == null) {
            l.v("viewModel");
            aVar5 = null;
        }
        aVar5.i().g(this, new f(new d(this)));
        c9.a aVar6 = this.M;
        if (aVar6 == null) {
            l.v("viewModel");
        } else {
            aVar = aVar6;
        }
        aVar.j().g(this, new f(new e(this)));
    }

    public final ArrayList p1() {
        return this.Q;
    }

    public final void w1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void x1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.Q = arrayList;
    }

    public final void y1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(o1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(o1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new z8.l(dialog));
        dialog.show();
    }
}
