package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.R;
import fa.o;
import fa.p;
import fa.q;
import fa.r;
import java.util.ArrayList;
import ni.x6;
import pl.x;

public final class NoticeSearchList extends androidx.appcompat.app.d {
    private String G = "";
    private String H = "";
    /* access modifiers changed from: private */
    public x6 I;
    public ld.c J;
    private NoticeService K;
    private ga.c L;
    /* access modifiers changed from: private */
    public db.b M;
    /* access modifiers changed from: private */
    public ArrayList N = new ArrayList();
    private ArrayList O = new ArrayList();
    private final String P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /* access modifiers changed from: private */
    public String Q = "";

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearchList f8365e;

        a(NoticeSearchList noticeSearchList) {
            this.f8365e = noticeSearchList;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                x6 k12 = this.f8365e.I;
                if (k12 == null) {
                    l.v("binding");
                    k12 = null;
                }
                k12.f29334e.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearchList f8366e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NoticeSearchList noticeSearchList) {
            super(1);
            this.f8366e = noticeSearchList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ni.x6} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: db.b} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel r10) {
            /*
                r9 = this;
                java.lang.String r0 = "Verify Payment Status"
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r1 = r1.I     // Catch:{ Exception -> 0x0012 }
                java.lang.String r2 = "binding"
                r3 = 0
                if (r1 != 0) goto L_0x0015
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r1 = r3
                goto L_0x0015
            L_0x0012:
                r10 = move-exception
                goto L_0x01e8
            L_0x0015:
                android.widget.ProgressBar r1 = r1.f29335f     // Catch:{ Exception -> 0x0012 }
                r4 = 8
                r1.setVisibility(r4)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r1 = r1.I     // Catch:{ Exception -> 0x0012 }
                if (r1 != 0) goto L_0x0028
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r1 = r3
            L_0x0028:
                androidx.appcompat.widget.AppCompatTextView r1 = r1.f29332c     // Catch:{ Exception -> 0x0012 }
                r1.setVisibility(r4)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r1 = r1.I     // Catch:{ Exception -> 0x0012 }
                if (r1 != 0) goto L_0x0039
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r1 = r3
            L_0x0039:
                androidx.recyclerview.widget.RecyclerView r1 = r1.f29333d     // Catch:{ Exception -> 0x0012 }
                r5 = 0
                r1.setVisibility(r5)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r1 = r1.I     // Catch:{ Exception -> 0x0012 }
                if (r1 != 0) goto L_0x004b
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r1 = r3
            L_0x004b:
                androidx.appcompat.widget.AppCompatTextView r1 = r1.f29339j     // Catch:{ Exception -> 0x0012 }
                r1.setVisibility(r5)     // Catch:{ Exception -> 0x0012 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0012 }
                java.lang.String r1 = r10.getCode()     // Catch:{ Exception -> 0x0012 }
                java.lang.String r6 = "200"
                r7 = 1
                boolean r1 = km.p.o(r1, r6, r7)     // Catch:{ Exception -> 0x0012 }
                if (r1 == 0) goto L_0x01eb
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.lang.String r1 = r1.Q     // Catch:{ Exception -> 0x0012 }
                boolean r1 = cm.l.a(r1, r0)     // Catch:{ Exception -> 0x0012 }
                if (r1 == 0) goto L_0x00b6
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.getData()     // Catch:{ Exception -> 0x0012 }
                r1.y1(r10)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.r1()     // Catch:{ Exception -> 0x0012 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0012 }
                if (r10 <= 0) goto L_0x00bf
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.r1()     // Catch:{ Exception -> 0x0012 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0012 }
                r1 = r5
            L_0x008c:
                if (r1 >= r10) goto L_0x00bf
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r6 = r6.r1()     // Catch:{ Exception -> 0x0012 }
                java.lang.Object r6 = r6.get(r1)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel r6 = (com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel) r6     // Catch:{ Exception -> 0x0012 }
                int r6 = r6.getPayment_eligible()     // Catch:{ Exception -> 0x0012 }
                if (r6 != 0) goto L_0x00b3
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r6 = r6.N     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r8 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r8 = r8.r1()     // Catch:{ Exception -> 0x0012 }
                java.lang.Object r8 = r8.get(r1)     // Catch:{ Exception -> 0x0012 }
                r6.add(r8)     // Catch:{ Exception -> 0x0012 }
            L_0x00b3:
                int r1 = r1 + 1
                goto L_0x008c
            L_0x00b6:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r1 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.getData()     // Catch:{ Exception -> 0x0012 }
                r1.N = r10     // Catch:{ Exception -> 0x0012 }
            L_0x00bf:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.N     // Catch:{ Exception -> 0x0012 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0012 }
                if (r10 <= r7) goto L_0x00ff
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x00d7
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x00d7:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29339j     // Catch:{ Exception -> 0x0012 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0012 }
                r1.<init>()     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                r7 = 2132019273(0x7f140849, float:1.9676876E38)
                java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x0012 }
                r1.append(r6)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r6 = r6.N     // Catch:{ Exception -> 0x0012 }
                int r6 = r6.size()     // Catch:{ Exception -> 0x0012 }
                r1.append(r6)     // Catch:{ Exception -> 0x0012 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0012 }
            L_0x00fb:
                r10.setText(r1)     // Catch:{ Exception -> 0x0012 }
                goto L_0x0135
            L_0x00ff:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x010b
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x010b:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29339j     // Catch:{ Exception -> 0x0012 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0012 }
                r1.<init>()     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                r7 = 2132019272(0x7f140848, float:1.9676874E38)
                java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x0012 }
                r1.append(r6)     // Catch:{ Exception -> 0x0012 }
                java.lang.String r6 = ": "
                r1.append(r6)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r6 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r6 = r6.N     // Catch:{ Exception -> 0x0012 }
                int r6 = r6.size()     // Catch:{ Exception -> 0x0012 }
                r1.append(r6)     // Catch:{ Exception -> 0x0012 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0012 }
                goto L_0x00fb
            L_0x0135:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.N     // Catch:{ Exception -> 0x0012 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0012 }
                if (r10 <= 0) goto L_0x018d
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x014d
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x014d:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29339j     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r5)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x015e
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x015e:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29332c     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r4)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x016f
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x016f:
                androidx.recyclerview.widget.RecyclerView r10 = r10.f29333d     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r5)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                db.b r10 = r10.M     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x0182
                java.lang.String r10 = "adapter"
                cm.l.v(r10)     // Catch:{ Exception -> 0x0012 }
                goto L_0x0183
            L_0x0182:
                r3 = r10
            L_0x0183:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.util.ArrayList r10 = r10.N     // Catch:{ Exception -> 0x0012 }
                r3.B(r10)     // Catch:{ Exception -> 0x0012 }
                goto L_0x01eb
            L_0x018d:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x0199
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x0199:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29339j     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r4)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x01aa
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x01aa:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29332c     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r5)     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                java.lang.String r10 = r10.Q     // Catch:{ Exception -> 0x0012 }
                boolean r10 = cm.l.a(r10, r0)     // Catch:{ Exception -> 0x0012 }
                if (r10 == 0) goto L_0x01d5
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x01c7
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                r10 = r3
            L_0x01c7:
                androidx.appcompat.widget.AppCompatTextView r10 = r10.f29332c     // Catch:{ Exception -> 0x0012 }
                com.nic.mparivahan.DPTNotice.NoticeSearchList r0 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                r1 = 2132018549(0x7f140575, float:1.9675408E38)
                java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0012 }
                r10.setText(r0)     // Catch:{ Exception -> 0x0012 }
            L_0x01d5:
                com.nic.mparivahan.DPTNotice.NoticeSearchList r10 = r9.f8366e     // Catch:{ Exception -> 0x0012 }
                ni.x6 r10 = r10.I     // Catch:{ Exception -> 0x0012 }
                if (r10 != 0) goto L_0x01e1
                cm.l.v(r2)     // Catch:{ Exception -> 0x0012 }
                goto L_0x01e2
            L_0x01e1:
                r3 = r10
            L_0x01e2:
                androidx.recyclerview.widget.RecyclerView r10 = r3.f29333d     // Catch:{ Exception -> 0x0012 }
                r10.setVisibility(r4)     // Catch:{ Exception -> 0x0012 }
                goto L_0x01eb
            L_0x01e8:
                r10.printStackTrace()
            L_0x01eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.NoticeSearchList.b.b(com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((NoticeListModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NoticeSearchList f8367e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NoticeSearchList noticeSearchList) {
            super(1);
            this.f8367e = noticeSearchList;
        }

        public final void b(String str) {
            x6 k12 = this.f8367e.I;
            x6 x6Var = null;
            if (k12 == null) {
                l.v("binding");
                k12 = null;
            }
            k12.f29335f.setVisibility(8);
            x6 k13 = this.f8367e.I;
            if (k13 == null) {
                l.v("binding");
                k13 = null;
            }
            k13.f29332c.setVisibility(0);
            x6 k14 = this.f8367e.I;
            if (k14 == null) {
                l.v("binding");
                k14 = null;
            }
            k14.f29333d.setVisibility(8);
            x6 k15 = this.f8367e.I;
            if (k15 == null) {
                l.v("binding");
            } else {
                x6Var = k15;
            }
            x6Var.f29339j.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8368a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f8368a = lVar;
        }

        public final pl.c a() {
            return this.f8368a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8368a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean C1() {
        /*
            r5 = this;
            ni.x6 r0 = r5.I
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f29334e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r5.H
            java.lang.String r4 = "Notice"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x0071
            int r3 = r0.length()
            r4 = 1
            if (r3 != 0) goto L_0x0051
            ni.x6 r0 = r5.I
            if (r0 != 0) goto L_0x0036
            cm.l.v(r2)
            r0 = r1
        L_0x0036:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f29334e
            r3 = 2132018741(0x7f140635, float:1.9675797E38)
            java.lang.String r3 = r5.getString(r3)
            r0.setError(r3)
            ni.x6 r0 = r5.I
            if (r0 != 0) goto L_0x004a
        L_0x0046:
            cm.l.v(r2)
            goto L_0x004b
        L_0x004a:
            r1 = r0
        L_0x004b:
            androidx.appcompat.widget.AppCompatEditText r0 = r1.f29334e
            r0.requestFocus()
            return r4
        L_0x0051:
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x0071
            ni.x6 r0 = r5.I
            if (r0 != 0) goto L_0x0060
            cm.l.v(r2)
            r0 = r1
        L_0x0060:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.f29334e
            r3 = 2132017851(0x7f1402bb, float:1.9673992E38)
            java.lang.String r3 = r5.getString(r3)
            r0.setError(r3)
            ni.x6 r0 = r5.I
            if (r0 != 0) goto L_0x004a
            goto L_0x0046
        L_0x0071:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DPTNotice.NoticeSearchList.C1():boolean");
    }

    private final void o1() {
        if (!x1()) {
            A1(this, s1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        } else if (l.a(this.H, "Notice")) {
            p1();
        } else if (l.a(this.H, "RC")) {
            q1();
        }
    }

    private final void p1() {
        try {
            x6 x6Var = this.I;
            ga.c cVar = null;
            if (x6Var == null) {
                l.v("binding");
                x6Var = null;
            }
            x6Var.f29335f.setVisibility(0);
            ga.c cVar2 = this.L;
            if (cVar2 == null) {
                l.v("viewModel");
            } else {
                cVar = cVar2;
            }
            cVar.k("Notice", this.G);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void q1() {
        try {
            x6 x6Var = this.I;
            ga.c cVar = null;
            if (x6Var == null) {
                l.v("binding");
                x6Var = null;
            }
            x6Var.f29335f.setVisibility(0);
            ga.c cVar2 = this.L;
            if (cVar2 == null) {
                l.v("viewModel");
            } else {
                cVar = cVar2;
            }
            cVar.l("RC", this.G);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void t1() {
        AppCompatEditText appCompatEditText;
        int i10;
        x6 x6Var = this.I;
        x6 x6Var2 = null;
        if (x6Var == null) {
            l.v("binding");
            x6Var = null;
        }
        x6Var.f29338i.f28305f.setOnClickListener(new o(this));
        NoticeService noticeService = this.K;
        if (noticeService == null) {
            l.v("retrofitService");
            noticeService = null;
        }
        this.L = (ga.c) new u0((x0) this, (u0.b) new ga.b(new ga.a(noticeService))).a(ga.c.class);
        x6 x6Var3 = this.I;
        if (x6Var3 == null) {
            l.v("binding");
            x6Var3 = null;
        }
        x6Var3.f29334e.setKeyListener(DigitsKeyListener.getInstance(this.P));
        x6 x6Var4 = this.I;
        if (x6Var4 == null) {
            l.v("binding");
            x6Var4 = null;
        }
        x6Var4.f29334e.setRawInputType(4096);
        if (this.H.length() > 0) {
            String str = this.H;
            if (l.a(str, "Notice")) {
                x6 x6Var5 = this.I;
                if (x6Var5 == null) {
                    l.v("binding");
                    x6Var5 = null;
                }
                x6Var5.f29334e.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                x6 x6Var6 = this.I;
                if (x6Var6 == null) {
                    l.v("binding");
                    x6Var6 = null;
                }
                appCompatEditText = x6Var6.f29334e;
                i10 = R.string.enter_notice_number;
            } else if (l.a(str, "RC")) {
                x6 x6Var7 = this.I;
                if (x6Var7 == null) {
                    l.v("binding");
                    x6Var7 = null;
                }
                x6Var7.f29334e.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                x6 x6Var8 = this.I;
                if (x6Var8 == null) {
                    l.v("binding");
                    x6Var8 = null;
                }
                appCompatEditText = x6Var8.f29334e;
                i10 = R.string.enter_vehicle_number;
            }
            appCompatEditText.setHint(getString(i10));
        }
        if (this.G.length() > 0) {
            x6 x6Var9 = this.I;
            if (x6Var9 == null) {
                l.v("binding");
                x6Var9 = null;
            }
            x6Var9.f29334e.setText(this.G);
        }
        x6 x6Var10 = this.I;
        if (x6Var10 == null) {
            l.v("binding");
            x6Var10 = null;
        }
        x6Var10.f29336g.setOnClickListener(new p(this));
        x6 x6Var11 = this.I;
        if (x6Var11 == null) {
            l.v("binding");
            x6Var11 = null;
        }
        x6Var11.f29334e.setOnEditorActionListener(new q(this));
        x6 x6Var12 = this.I;
        if (x6Var12 == null) {
            l.v("binding");
        } else {
            x6Var2 = x6Var12;
        }
        x6Var2.f29334e.addTextChangedListener(new a(this));
        o1();
    }

    /* access modifiers changed from: private */
    public static final void u1(NoticeSearchList noticeSearchList, View view) {
        l.f(noticeSearchList, "this$0");
        noticeSearchList.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void v1(NoticeSearchList noticeSearchList, View view) {
        l.f(noticeSearchList, "this$0");
        if (l.a(noticeSearchList.H, "RC")) {
            noticeSearchList.onBackPressed();
            return;
        }
        x6 x6Var = null;
        if (!l.a(noticeSearchList.H, "Notice") || noticeSearchList.C1()) {
            x6 x6Var2 = noticeSearchList.I;
            if (x6Var2 == null) {
                l.v("binding");
                x6Var2 = null;
            }
            x6Var2.f29334e.setError(noticeSearchList.getString(R.string.please_enter_notice_no));
            x6 x6Var3 = noticeSearchList.I;
            if (x6Var3 == null) {
                l.v("binding");
            } else {
                x6Var = x6Var3;
            }
            x6Var.f29334e.requestFocus();
            return;
        }
        x6 x6Var4 = noticeSearchList.I;
        if (x6Var4 == null) {
            l.v("binding");
        } else {
            x6Var = x6Var4;
        }
        noticeSearchList.G = q.B0(String.valueOf(x6Var.f29334e.getText())).toString();
        noticeSearchList.o1();
    }

    /* access modifiers changed from: private */
    public static final boolean w1(NoticeSearchList noticeSearchList, TextView textView, int i10, KeyEvent keyEvent) {
        l.f(noticeSearchList, "this$0");
        if (i10 != 6) {
            return false;
        }
        if (l.a(noticeSearchList.H, "RC")) {
            noticeSearchList.onBackPressed();
        } else {
            x6 x6Var = null;
            if (!l.a(noticeSearchList.H, "Notice") || noticeSearchList.C1()) {
                x6 x6Var2 = noticeSearchList.I;
                if (x6Var2 == null) {
                    l.v("binding");
                    x6Var2 = null;
                }
                x6Var2.f29334e.setError(noticeSearchList.getString(R.string.please_enter_notice_no));
                x6 x6Var3 = noticeSearchList.I;
                if (x6Var3 == null) {
                    l.v("binding");
                } else {
                    x6Var = x6Var3;
                }
                x6Var.f29334e.requestFocus();
                return true;
            }
            x6 x6Var4 = noticeSearchList.I;
            if (x6Var4 == null) {
                l.v("binding");
            } else {
                x6Var = x6Var4;
            }
            noticeSearchList.G = q.B0(String.valueOf(x6Var.f29334e.getText())).toString();
            noticeSearchList.o1();
        }
        return true;
    }

    private final boolean x1() {
        Object systemService = getSystemService("connectivity");
        l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void A1(Context context, String str) {
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
        textView.setText(s1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(s1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new r(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x6 c10 = x6.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.I = c10;
        ga.c cVar = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        z1(new ld.c(this));
        String stringExtra = getIntent().getStringExtra("inputValue");
        l.c(stringExtra);
        this.G = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        l.c(stringExtra2);
        this.H = stringExtra2;
        this.K = NoticeService.f8372a.c(this);
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra3 = getIntent().getStringExtra("serviceName");
            l.c(stringExtra3);
            this.Q = stringExtra3;
            x6 x6Var = this.I;
            if (x6Var == null) {
                l.v("binding");
                x6Var = null;
            }
            x6Var.f29337h.setText(this.Q);
        }
        x6 x6Var2 = this.I;
        if (x6Var2 == null) {
            l.v("binding");
            x6Var2 = null;
        }
        x6Var2.f29333d.setLayoutManager(new LinearLayoutManager(this));
        this.M = new db.b(this, this.N, this.H, s1(), this.Q);
        x6 x6Var3 = this.I;
        if (x6Var3 == null) {
            l.v("binding");
            x6Var3 = null;
        }
        RecyclerView recyclerView = x6Var3.f29333d;
        db.b bVar = this.M;
        if (bVar == null) {
            l.v("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        t1();
        ga.c cVar2 = this.L;
        if (cVar2 == null) {
            l.v("viewModel");
            cVar2 = null;
        }
        cVar2.h().g(this, new d(new b(this)));
        ga.c cVar3 = this.L;
        if (cVar3 == null) {
            l.v("viewModel");
        } else {
            cVar = cVar3;
        }
        cVar.g().g(this, new d(new c(this)));
    }

    public final ArrayList r1() {
        return this.O;
    }

    public final ld.c s1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final void y1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.O = arrayList;
    }

    public final void z1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }
}
