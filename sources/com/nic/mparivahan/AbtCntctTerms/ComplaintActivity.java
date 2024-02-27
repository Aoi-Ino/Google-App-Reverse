package com.nic.mparivahan.AbtCntctTerms;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import cm.l;
import com.nic.mparivahan.R;
import ld.g;
import n8.e;
import ni.i1;
import v9.e;
import v9.f;

public final class ComplaintActivity extends androidx.appcompat.app.d {

    public static final class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r2 == null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
            if (r2 == null) goto L_0x0040;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
            /*
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r2 = r2.length()
                n8.e.f14214f = r2
                int r2 = n8.e.f14214f
                r3 = 221(0xdd, float:3.1E-43)
                r4 = 0
                java.lang.String r5 = "binding"
                if (r3 > r2) goto L_0x0030
                r3 = 271(0x10f, float:3.8E-43)
                if (r2 >= r3) goto L_0x0030
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0024
                cm.l.v(r5)
                r2 = r4
            L_0x0024:
                android.widget.TextView r2 = r2.f26795m
                java.lang.String r3 = "#ff931f"
            L_0x0028:
                int r3 = android.graphics.Color.parseColor(r3)
            L_0x002c:
                r2.setTextColor(r3)
                goto L_0x0071
            L_0x0030:
                int r2 = n8.e.f14214f
                r3 = 270(0x10e, float:3.78E-43)
                java.lang.String r0 = "#ff0000"
                if (r2 <= r3) goto L_0x004b
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0044
            L_0x0040:
                cm.l.v(r5)
                r2 = r4
            L_0x0044:
                android.widget.TextView r2 = r2.f26795m
                int r3 = android.graphics.Color.parseColor(r0)
                goto L_0x002c
            L_0x004b:
                int r2 = n8.e.f14214f
                r3 = 30
                if (r2 >= r3) goto L_0x005a
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0044
                goto L_0x0040
            L_0x005a:
                int r2 = n8.e.f14214f
                r3 = 220(0xdc, float:3.08E-43)
                if (r2 > r3) goto L_0x0071
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x006c
                cm.l.v(r5)
                r2 = r4
            L_0x006c:
                android.widget.TextView r2 = r2.f26795m
                java.lang.String r3 = "#16cc4d"
                goto L_0x0028
            L_0x0071:
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x007b
                cm.l.v(r5)
                goto L_0x007c
            L_0x007b:
                r4 = r2
            L_0x007c:
                android.widget.TextView r2 = r4.f26795m
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int r4 = n8.e.f14214f
                r3.append(r4)
                java.lang.String r4 = "/300"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.setText(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AbtCntctTerms.ComplaintActivity.a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComplaintActivity f7638e;

        b(ComplaintActivity complaintActivity) {
            this.f7638e = complaintActivity;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
            if (r4 == null) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
            r6 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
            if (r4 == null) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
            if (r4 == null) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
            if (r4 == null) goto L_0x007c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemSelected(android.widget.AdapterView r3, android.view.View r4, int r5, long r6) {
            /*
                r2 = this;
                r4 = 0
                r6 = 0
                if (r3 == 0) goto L_0x0009
                android.view.View r3 = r3.getChildAt(r4)
                goto L_0x000a
            L_0x0009:
                r3 = r6
            L_0x000a:
                java.lang.String r7 = "null cannot be cast to non-null type android.widget.TextView"
                cm.l.d(r3, r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r7 = -1
                r3.setTextColor(r7)
                ni.i1 r3 = n8.e.f14213e
                java.lang.String r7 = "binding"
                if (r3 != 0) goto L_0x0021
                cm.l.v(r7)
                r3 = r6
            L_0x0021:
                com.google.android.material.textfield.TextInputEditText r3 = r3.f26789g
                r3.setText(r6)
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x0030
                cm.l.v(r7)
                r3 = r6
            L_0x0030:
                com.google.android.material.textfield.TextInputEditText r3 = r3.f26788f
                r3.setText(r6)
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x003f
                cm.l.v(r7)
                r3 = r6
            L_0x003f:
                com.google.android.material.textfield.TextInputEditText r3 = r3.f26787e
                r3.setText(r6)
                r3 = 1
                r0 = 2131558717(0x7f0d013d, float:1.8742758E38)
                if (r5 == r3) goto L_0x00e2
                r3 = 2
                if (r5 == r3) goto L_0x00b5
                r3 = 3
                if (r5 == r3) goto L_0x0088
                java.lang.String r3 = "Select"
                n8.e.f14210b = r3
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x005f
                cm.l.v(r7)
                r3 = r6
            L_0x005f:
                android.widget.Spinner r3 = r3.f26792j
                r3.setVisibility(r4)
                android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r4 = r2.f7638e
                android.content.res.Resources r5 = r4.getResources()
                r1 = 2130903068(0x7f03001c, float:1.7412944E38)
                java.lang.String[] r5 = r5.getStringArray(r1)
                r3.<init>(r4, r0, r5)
                ni.i1 r4 = n8.e.f14213e
                if (r4 != 0) goto L_0x0080
            L_0x007c:
                cm.l.v(r7)
                goto L_0x0081
            L_0x0080:
                r6 = r4
            L_0x0081:
                android.widget.Spinner r4 = r6.f26792j
                r4.setAdapter(r3)
                goto L_0x0110
            L_0x0088:
                java.lang.String r3 = "transport"
                n8.e.f14210b = r3
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x0097
                cm.l.v(r7)
                r3 = r6
            L_0x0097:
                android.widget.Spinner r3 = r3.f26792j
                r3.setVisibility(r4)
                android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r4 = r2.f7638e
                android.content.res.Resources r5 = r4.getResources()
                r1 = 2130903074(0x7f030022, float:1.7412956E38)
                java.lang.String[] r5 = r5.getStringArray(r1)
                r3.<init>(r4, r0, r5)
                ni.i1 r4 = n8.e.f14213e
                if (r4 != 0) goto L_0x0080
                goto L_0x007c
            L_0x00b5:
                java.lang.String r3 = "virtual"
                n8.e.f14210b = r3
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x00c4
                cm.l.v(r7)
                r3 = r6
            L_0x00c4:
                android.widget.Spinner r3 = r3.f26792j
                r3.setVisibility(r4)
                android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r4 = r2.f7638e
                android.content.res.Resources r5 = r4.getResources()
                r1 = 2130903077(0x7f030025, float:1.7412962E38)
                java.lang.String[] r5 = r5.getStringArray(r1)
                r3.<init>(r4, r0, r5)
                ni.i1 r4 = n8.e.f14213e
                if (r4 != 0) goto L_0x0080
                goto L_0x007c
            L_0x00e2:
                java.lang.String r3 = "search"
                n8.e.f14210b = r3
                ni.i1 r3 = n8.e.f14213e
                if (r3 != 0) goto L_0x00f1
                cm.l.v(r7)
                r3 = r6
            L_0x00f1:
                android.widget.Spinner r3 = r3.f26792j
                r3.setVisibility(r4)
                android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r4 = r2.f7638e
                android.content.res.Resources r5 = r4.getResources()
                r1 = 2130903067(0x7f03001b, float:1.7412942E38)
                java.lang.String[] r5 = r5.getStringArray(r1)
                r3.<init>(r4, r0, r5)
                ni.i1 r4 = n8.e.f14213e
                if (r4 != 0) goto L_0x0080
                goto L_0x007c
            L_0x0110:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AbtCntctTerms.ComplaintActivity.b.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
        c() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            i1 a10 = e.f14213e;
            if (a10 == null) {
                l.v("binding");
                a10 = null;
            }
            a10.f26789g.setText((CharSequence) null);
            i1 a11 = e.f14213e;
            if (a11 == null) {
                l.v("binding");
                a11 = null;
            }
            a11.f26788f.setText((CharSequence) null);
            i1 a12 = e.f14213e;
            if (a12 == null) {
                l.v("binding");
                a12 = null;
            }
            a12.f26787e.setText((CharSequence) null);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ComplaintActivity f7639e;

        d(ComplaintActivity complaintActivity) {
            this.f7639e = complaintActivity;
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:118:0x02dc, code lost:
            if (r1 == null) goto L_0x0255;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0357, code lost:
            if (r2 == null) goto L_0x0359;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x035e, code lost:
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0393, code lost:
            if (r2 == null) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0395, code lost:
            cm.l.v("session");
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x039a, code lost:
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x039b, code lost:
            r2 = r4.b("enter_vehicle_no", "Enter Vehicle No.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x03cd, code lost:
            if (r2 == null) goto L_0x0359;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f7, code lost:
            if (r2 == null) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
            if (r2 == null) goto L_0x013a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c3, code lost:
            if (r2 == null) goto L_0x013a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0253, code lost:
            if (r1 == null) goto L_0x0255;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
            r4 = r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemSelected(android.widget.AdapterView r17, android.view.View r18, int r19, long r20) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                r3 = 0
                r4 = 0
                if (r1 == 0) goto L_0x000f
                android.view.View r1 = r1.getChildAt(r3)
                goto L_0x0010
            L_0x000f:
                r1 = r4
            L_0x0010:
                java.lang.String r5 = "null cannot be cast to non-null type android.widget.TextView"
                cm.l.d(r1, r5)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5 = -1
                r1.setTextColor(r5)
                ni.i1 r1 = n8.e.f14213e
                java.lang.String r5 = "binding"
                if (r1 != 0) goto L_0x0027
                cm.l.v(r5)
                r1 = r4
            L_0x0027:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                r1.setText(r4)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0036
                cm.l.v(r5)
                r1 = r4
            L_0x0036:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26788f
                r1.setText(r4)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0045
                cm.l.v(r5)
                r1 = r4
            L_0x0045:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26787e
                r1.setText(r4)
                java.lang.String r1 = n8.e.f14210b
                java.lang.String r6 = "transport"
                r7 = 1
                boolean r1 = km.p.o(r1, r6, r7)
                java.lang.String r6 = "Enter Driving Licence No."
                java.lang.String r8 = "label_challan_enter_dl_no"
                java.lang.String r9 = "Enter Vehicle No."
                java.lang.String r10 = "enter_vehicle_no"
                r11 = 10
                r12 = 18
                r13 = 2
                java.lang.String r14 = "session"
                if (r1 == 0) goto L_0x02e0
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0070
                cm.l.v(r5)
                r1 = r4
            L_0x0070:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                r1.setVisibility(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x007f
                cm.l.v(r5)
                r1 = r4
            L_0x007f:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                r1.setVisibility(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x008e
                cm.l.v(r5)
                r1 = r4
            L_0x008e:
                com.google.android.material.button.MaterialButton r1 = r1.f26786d
                r1.setVisibility(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x009d
                cm.l.v(r5)
                r1 = r4
            L_0x009d:
                android.widget.Spinner r1 = r1.f26793k
                r1.setVisibility(r3)
                r1 = 2130903076(0x7f030024, float:1.741296E38)
                java.lang.String r15 = "Enter Application No."
                r4 = 2131558717(0x7f0d013d, float:1.8742758E38)
                if (r2 == 0) goto L_0x0262
                if (r2 == r7) goto L_0x01c7
                ni.i1 r1 = n8.e.f14213e
                if (r2 == r13) goto L_0x0147
                if (r1 != 0) goto L_0x00ba
                cm.l.v(r5)
                r1 = 0
            L_0x00ba:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r6 = new android.text.InputFilter$LengthFilter
                r6.<init>(r12)
                r2[r3] = r6
                r1.setFilters(r2)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x00d2
                cm.l.v(r5)
                r1 = 0
            L_0x00d2:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x00de
                cm.l.v(r14)
                r2 = 0
            L_0x00de:
                v9.f$a r6 = v9.f.f17510a
                java.lang.String r7 = r6.T0()
                java.lang.String r8 = "Enter Vehicle No. or Driving Licence No."
                java.lang.String r2 = r2.b(r7, r8)
                r1.setHint((java.lang.CharSequence) r2)
                n8.e.q(r13)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x00fa
                cm.l.v(r5)
                r1 = 0
            L_0x00fa:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x0106
                cm.l.v(r14)
                r2 = 0
            L_0x0106:
                java.lang.String r6 = r6.o()
                java.lang.String r7 = "Enter Challan No."
                java.lang.String r2 = r2.b(r6, r7)
                r1.setHint((java.lang.CharSequence) r2)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x011d
                cm.l.v(r5)
                r1 = 0
            L_0x011d:
                android.widget.Spinner r1 = r1.f26793k
                r1.setVisibility(r3)
                android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r2 = r0.f7639e
                android.content.res.Resources r3 = r2.getResources()
                r6 = 2130903043(0x7f030003, float:1.7412893E38)
                java.lang.String[] r3 = r3.getStringArray(r6)
                r1.<init>(r2, r4, r3)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x013f
            L_0x013a:
                cm.l.v(r5)
                r4 = 0
                goto L_0x0140
            L_0x013f:
                r4 = r2
            L_0x0140:
                android.widget.Spinner r2 = r4.f26793k
                r2.setAdapter(r1)
                goto L_0x03fa
            L_0x0147:
                if (r1 != 0) goto L_0x014d
                cm.l.v(r5)
                r1 = 0
            L_0x014d:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
                r7.<init>(r12)
                r2[r3] = r7
                r1.setFilters(r2)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0165
                cm.l.v(r5)
                r1 = 0
            L_0x0165:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x0171
                cm.l.v(r14)
                r2 = 0
            L_0x0171:
                java.lang.String r2 = r2.b(r8, r6)
                r1.setHint((java.lang.CharSequence) r2)
                n8.e.q(r13)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0185
                cm.l.v(r5)
                r1 = 0
            L_0x0185:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x0191
                cm.l.v(r14)
                r2 = 0
            L_0x0191:
                v9.f$a r6 = v9.f.f17510a
                java.lang.String r6 = r6.E()
                java.lang.String r2 = r2.b(r6, r15)
                r1.setHint((java.lang.CharSequence) r2)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x01a8
                cm.l.v(r5)
                r1 = 0
            L_0x01a8:
                android.widget.Spinner r1 = r1.f26793k
                r1.setVisibility(r3)
                android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r2 = r0.f7639e
                android.content.res.Resources r3 = r2.getResources()
                r6 = 2130903051(0x7f03000b, float:1.741291E38)
                java.lang.String[] r3 = r3.getStringArray(r6)
                r1.<init>(r2, r4, r3)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x013f
                goto L_0x013a
            L_0x01c7:
                n8.e.q(r7)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x01d4
                cm.l.v(r5)
                r2 = 0
            L_0x01d4:
                com.google.android.material.textfield.TextInputEditText r2 = r2.f26789g
                android.text.InputFilter[] r6 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
                r7.<init>(r11)
                r6[r3] = r7
                r2.setFilters(r6)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x01ec
                cm.l.v(r5)
                r2 = 0
            L_0x01ec:
                com.google.android.material.textfield.TextInputLayout r2 = r2.f26798p
                ld.c r6 = n8.e.f14217i
                if (r6 != 0) goto L_0x01f8
                cm.l.v(r14)
                r6 = 0
            L_0x01f8:
                java.lang.String r6 = r6.b(r10, r9)
                r2.setHint((java.lang.CharSequence) r6)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0209
                cm.l.v(r5)
                r2 = 0
            L_0x0209:
                android.widget.Spinner r2 = r2.f26793k
                r2.setVisibility(r3)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0218
                cm.l.v(r5)
                r2 = 0
            L_0x0218:
                android.widget.Spinner r2 = r2.f26793k
                r2.setVisibility(r3)
                android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r3 = r0.f7639e
                android.content.res.Resources r6 = r3.getResources()
                java.lang.String[] r1 = r6.getStringArray(r1)
                r2.<init>(r3, r4, r1)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0236
                cm.l.v(r5)
                r1 = 0
            L_0x0236:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                ld.c r3 = n8.e.f14217i
                if (r3 != 0) goto L_0x0242
                cm.l.v(r14)
                r3 = 0
            L_0x0242:
                v9.f$a r4 = v9.f.f17510a
                java.lang.String r4 = r4.E()
                java.lang.String r3 = r3.b(r4, r15)
                r1.setHint((java.lang.CharSequence) r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x025a
            L_0x0255:
                cm.l.v(r5)
                r4 = 0
                goto L_0x025b
            L_0x025a:
                r4 = r1
            L_0x025b:
                android.widget.Spinner r1 = r4.f26793k
                r1.setAdapter(r2)
                goto L_0x03fa
            L_0x0262:
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x026c
                cm.l.v(r5)
                r2 = 0
            L_0x026c:
                com.google.android.material.textfield.TextInputEditText r2 = r2.f26789g
                android.text.InputFilter[] r6 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r7 = new android.text.InputFilter$LengthFilter
                r7.<init>(r11)
                r6[r3] = r7
                r2.setFilters(r6)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x0284
                cm.l.v(r5)
                r2 = 0
            L_0x0284:
                com.google.android.material.textfield.TextInputLayout r2 = r2.f26798p
                ld.c r6 = n8.e.f14217i
                if (r6 != 0) goto L_0x0290
                cm.l.v(r14)
                r6 = 0
            L_0x0290:
                java.lang.String r6 = r6.b(r10, r9)
                r2.setHint((java.lang.CharSequence) r6)
                ni.i1 r2 = n8.e.f14213e
                if (r2 != 0) goto L_0x02a1
                cm.l.v(r5)
                r2 = 0
            L_0x02a1:
                android.widget.Spinner r2 = r2.f26793k
                r2.setVisibility(r3)
                android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
                com.nic.mparivahan.AbtCntctTerms.ComplaintActivity r3 = r0.f7639e
                android.content.res.Resources r6 = r3.getResources()
                java.lang.String[] r1 = r6.getStringArray(r1)
                r2.<init>(r3, r4, r1)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x02bf
                cm.l.v(r5)
                r1 = 0
            L_0x02bf:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                ld.c r3 = n8.e.f14217i
                if (r3 != 0) goto L_0x02cb
                cm.l.v(r14)
                r3 = 0
            L_0x02cb:
                v9.f$a r4 = v9.f.f17510a
                java.lang.String r4 = r4.E()
                java.lang.String r3 = r3.b(r4, r15)
                r1.setHint((java.lang.CharSequence) r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x025a
                goto L_0x0255
            L_0x02e0:
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x02ea
                cm.l.v(r5)
                r1 = 0
            L_0x02ea:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                r1.setVisibility(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x02f9
                cm.l.v(r5)
                r1 = 0
            L_0x02f9:
                com.google.android.material.button.MaterialButton r1 = r1.f26786d
                r1.setVisibility(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0308
                cm.l.v(r5)
                r1 = 0
            L_0x0308:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26784b
                r4 = 8
                r1.setVisibility(r4)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0319
                cm.l.v(r5)
                r1 = 0
            L_0x0319:
                android.widget.Spinner r1 = r1.f26793k
                r1.setVisibility(r4)
                java.lang.String r1 = n8.e.f14210b
                java.lang.String r4 = "Search"
                boolean r1 = km.p.o(r1, r4, r7)
                if (r1 == 0) goto L_0x03a0
                if (r2 != r13) goto L_0x0368
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0336
                cm.l.v(r5)
                r1 = 0
            L_0x0336:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
                r4.<init>(r12)
                r2[r3] = r4
                r1.setFilters(r2)
                n8.e.q(r7)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0351
                cm.l.v(r5)
                r1 = 0
            L_0x0351:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x035e
            L_0x0359:
                cm.l.v(r14)
                r4 = 0
                goto L_0x035f
            L_0x035e:
                r4 = r2
            L_0x035f:
                java.lang.String r2 = r4.b(r8, r6)
            L_0x0363:
                r1.setHint((java.lang.CharSequence) r2)
                goto L_0x03fa
            L_0x0368:
                n8.e.q(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x0375
                cm.l.v(r5)
                r1 = 0
            L_0x0375:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
                r4.<init>(r11)
                r2[r3] = r4
                r1.setFilters(r2)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x038d
                cm.l.v(r5)
                r1 = 0
            L_0x038d:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x039a
            L_0x0395:
                cm.l.v(r14)
                r4 = 0
                goto L_0x039b
            L_0x039a:
                r4 = r2
            L_0x039b:
                java.lang.String r2 = r4.b(r10, r9)
                goto L_0x0363
            L_0x03a0:
                ni.i1 r1 = n8.e.f14213e
                if (r2 != r13) goto L_0x03d0
                if (r1 != 0) goto L_0x03ac
                cm.l.v(r5)
                r1 = 0
            L_0x03ac:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
                r4.<init>(r12)
                r2[r3] = r4
                r1.setFilters(r2)
                n8.e.q(r7)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x03c7
                cm.l.v(r5)
                r1 = 0
            L_0x03c7:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x035e
                goto L_0x0359
            L_0x03d0:
                if (r1 != 0) goto L_0x03d6
                cm.l.v(r5)
                r1 = 0
            L_0x03d6:
                com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
                android.text.InputFilter[] r2 = new android.text.InputFilter[r7]
                android.text.InputFilter$LengthFilter r4 = new android.text.InputFilter$LengthFilter
                r4.<init>(r11)
                r2[r3] = r4
                r1.setFilters(r2)
                n8.e.q(r3)
                ni.i1 r1 = n8.e.f14213e
                if (r1 != 0) goto L_0x03f1
                cm.l.v(r5)
                r1 = 0
            L_0x03f1:
                com.google.android.material.textfield.TextInputLayout r1 = r1.f26798p
                ld.c r2 = n8.e.f14217i
                if (r2 != 0) goto L_0x039a
                goto L_0x0395
            L_0x03fa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AbtCntctTerms.ComplaintActivity.d.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final boolean i1(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '-') {
                i10++;
            }
        }
        return i10 <= 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean j1() {
        /*
            r9 = this;
            ni.i1 r0 = n8.e.f14213e
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto L_0x000d
            cm.l.v(r1)
            r0 = r2
        L_0x000d:
            com.google.android.material.textfield.TextInputLayout r0 = r0.f26798p
            java.lang.CharSequence r0 = r0.getHint()
            cm.l.c(r0)
            ld.c r3 = n8.e.f14217i
            java.lang.String r4 = "session"
            if (r3 != 0) goto L_0x0022
            cm.l.v(r4)
            r3 = r2
        L_0x0022:
            java.lang.String r5 = "enter_vehicle_no"
            java.lang.String r6 = "Enter Vehicle No."
            java.lang.String r3 = r3.b(r5, r6)
            boolean r0 = r0.equals(r3)
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L_0x007b
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x003c
            cm.l.v(r1)
            r0 = r2
        L_0x003c:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r9.l1(r0)
            if (r0 == 0) goto L_0x004e
            goto L_0x015d
        L_0x004e:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x0058
            cm.l.v(r1)
            r0 = r2
        L_0x0058:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            java.lang.String r3 = "Please enter a valid Vehicle No."
            r0.setError(r3)
            ld.c r0 = n8.e.f14217i
            if (r0 != 0) goto L_0x0069
            cm.l.v(r4)
            r0 = r2
        L_0x0069:
            java.lang.String r3 = "label_challan_rc_validation"
            java.lang.String r6 = "Please enter Vehicle No. minimum 4 & maximum 10 characters with no special character"
        L_0x006d:
            java.lang.String r0 = r0.b(r3, r6)
        L_0x0071:
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r5)
            r0.show()
            r3 = r5
            goto L_0x015d
        L_0x007b:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x0085
            cm.l.v(r1)
            r0 = r2
        L_0x0085:
            com.google.android.material.textfield.TextInputLayout r0 = r0.f26798p
            java.lang.CharSequence r0 = r0.getHint()
            cm.l.c(r0)
            ld.c r6 = n8.e.f14217i
            if (r6 != 0) goto L_0x0098
            cm.l.v(r4)
            r6 = r2
        L_0x0098:
            java.lang.String r7 = "label_challan_enter_dl_no"
            java.lang.String r8 = "Enter Driving Licence No."
            java.lang.String r6 = r6.b(r7, r8)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00ef
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x00b0
            cm.l.v(r1)
            r0 = r2
        L_0x00b0:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r9.o1(r0)
            if (r0 == 0) goto L_0x00c2
            goto L_0x015d
        L_0x00c2:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x00cc
            cm.l.v(r1)
            r0 = r2
        L_0x00cc:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            ld.c r3 = n8.e.f14217i
            if (r3 != 0) goto L_0x00d8
            cm.l.v(r4)
            r3 = r2
        L_0x00d8:
            java.lang.String r3 = r3.b(r7, r8)
            r0.setError(r3)
            ld.c r0 = n8.e.f14217i
            if (r0 != 0) goto L_0x00e9
            cm.l.v(r4)
            r0 = r2
        L_0x00e9:
            java.lang.String r3 = "dl_validation_msg"
            java.lang.String r6 = "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"
            goto L_0x006d
        L_0x00ef:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x00f9
            cm.l.v(r1)
            r0 = r2
        L_0x00f9:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r9.o1(r0)
            if (r0 != 0) goto L_0x015d
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x0113
            cm.l.v(r1)
            r0 = r2
        L_0x0113:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r9.l1(r0)
            if (r0 == 0) goto L_0x0124
            goto L_0x015d
        L_0x0124:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x012e
            cm.l.v(r1)
            r0 = r2
        L_0x012e:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26789g
            ld.c r3 = n8.e.f14217i
            if (r3 != 0) goto L_0x013a
            cm.l.v(r4)
            r3 = r2
        L_0x013a:
            v9.f$a r6 = v9.f.f17510a
            java.lang.String r7 = r6.T0()
            java.lang.String r8 = "Enter Vehicle No. or Driving Licence No."
            java.lang.String r3 = r3.b(r7, r8)
            r0.setError(r3)
            ld.c r0 = n8.e.f14217i
            if (r0 != 0) goto L_0x0153
            cm.l.v(r4)
            r0 = r2
        L_0x0153:
            java.lang.String r3 = r6.T0()
            java.lang.String r0 = r0.b(r3, r8)
            goto L_0x0071
        L_0x015d:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x0167
            cm.l.v(r1)
            r0 = r2
        L_0x0167:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26788f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x01ba
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0176
            goto L_0x01ba
        L_0x0176:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x0180
            cm.l.v(r1)
            r0 = r2
        L_0x0180:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26788f
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            r6 = 30
            if (r0 >= r6) goto L_0x01b8
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x019b
            cm.l.v(r1)
            r0 = r2
        L_0x019b:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26788f
            ld.c r1 = n8.e.f14217i
            if (r1 != 0) goto L_0x01a7
            cm.l.v(r4)
            goto L_0x01a8
        L_0x01a7:
            r2 = r1
        L_0x01a8:
            v9.f$a r1 = v9.f.f17510a
            java.lang.String r1 = r1.H()
            java.lang.String r3 = "Please write minimum 30 words."
        L_0x01b0:
            java.lang.String r1 = r2.b(r1, r3)
            r0.setError(r1)
            goto L_0x01da
        L_0x01b8:
            r5 = r3
            goto L_0x01da
        L_0x01ba:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x01c4
            cm.l.v(r1)
            r0 = r2
        L_0x01c4:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26788f
            ld.c r1 = n8.e.f14217i
            if (r1 != 0) goto L_0x01d0
            cm.l.v(r4)
            goto L_0x01d1
        L_0x01d0:
            r2 = r1
        L_0x01d1:
            v9.f$a r1 = v9.f.f17510a
            java.lang.String r1 = r1.x()
            java.lang.String r3 = "Please give a description of your complaint"
            goto L_0x01b0
        L_0x01da:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AbtCntctTerms.ComplaintActivity.j1():boolean");
    }

    private final boolean k1() {
        String r02;
        String str;
        i1 a10 = e.f14213e;
        ld.c cVar = null;
        if (a10 == null) {
            l.v("binding");
            a10 = null;
        }
        if (a10.f26791i.getSelectedItemPosition() == 0) {
            ld.c f10 = e.f14217i;
            if (f10 == null) {
                l.v("session");
            } else {
                cVar = f10;
            }
            r02 = f.f17510a.p0();
            str = "Please select the complaint type.";
        } else {
            i1 a11 = e.f14213e;
            if (a11 == null) {
                l.v("binding");
                a11 = null;
            }
            if (a11.f26792j.getSelectedItemPosition() == 0) {
                ld.c f11 = e.f14217i;
                if (f11 == null) {
                    l.v("session");
                } else {
                    cVar = f11;
                }
                r02 = f.f17510a.s0();
                str = "Please select the sub complaint type.";
            } else {
                i1 a12 = e.f14213e;
                if (a12 == null) {
                    l.v("binding");
                    a12 = null;
                }
                Spinner spinner = a12.f26793k;
                l.e(spinner, "spinnerSubSubComplaint");
                if (spinner.getVisibility() != 0) {
                    return true;
                }
                i1 a13 = e.f14213e;
                if (a13 == null) {
                    l.v("binding");
                    a13 = null;
                }
                if (a13.f26793k.getSelectedItemPosition() != 0) {
                    return true;
                }
                ld.c f12 = e.f14217i;
                if (f12 == null) {
                    l.v("session");
                } else {
                    cVar = f12;
                }
                r02 = f.f17510a.r0();
                str = "Please select the service.";
            }
        }
        Toast.makeText(this, cVar.b(r02, str), 0).show();
        return false;
    }

    private final boolean l1(CharSequence charSequence) {
        return charSequence.length() != 0 && charSequence.length() >= 4 && new km.f("[a-zA-Z0-9]*").a(charSequence) && charSequence.length() >= 4 && !new km.f("^[0-9]*$").a(charSequence) && !new km.f("[a-zA-Z]+").a(charSequence);
    }

    private final String m1(Uri uri) {
        String str = null;
        if (l.a(uri.getScheme(), "content")) {
            Cursor query = getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                    }
                } catch (Throwable th2) {
                    l.c(query);
                    query.close();
                    throw th2;
                }
            }
            l.c(query);
            query.close();
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        l.c(path);
        int U = q.U(path, '/', 0, false, 6, (Object) null);
        if (U == -1) {
            return path;
        }
        String substring = path.substring(U + 1);
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    private final boolean o1(CharSequence charSequence) {
        if (charSequence.length() >= 10 && charSequence.toString().length() >= 10) {
            int length = charSequence.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = l.h(charSequence.charAt(!z10 ? i10 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i10++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            CharSequence subSequence = charSequence.subSequence(i10, length + 1);
            l.d(subSequence, "null cannot be cast to non-null type kotlin.String");
            if (i1((String) subSequence)) {
                int length2 = charSequence.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = l.h(charSequence.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i11, length2 + 1);
                l.d(subSequence2, "null cannot be cast to non-null type kotlin.String");
                if (!n1((String) subSequence2)) {
                    if (!q.F(charSequence.subSequence(2, 3).toString(), "-", false, 2, (Object) null) && !q.F(charSequence.subSequence(2, 3).toString(), " ", false, 2, (Object) null)) {
                        return true;
                    }
                    new km.f(" ").c(new km.f("-").c(charSequence, ""), "");
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String p1() {
        /*
            r7 = this;
            java.lang.String r0 = n8.e.f14210b
            java.lang.String r1 = "search"
            r2 = 1
            boolean r0 = km.p.o(r0, r1, r2)
            r1 = 2132017338(0x7f1400ba, float:1.9672952E38)
            java.lang.String r3 = " | "
            r4 = 0
            java.lang.String r5 = "binding"
            if (r0 == 0) goto L_0x006f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "NextGen- "
            r0.append(r2)
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x0033
            cm.l.v(r5)
            r1 = r4
        L_0x0033:
            android.widget.Spinner r1 = r1.f26791i
            java.lang.Object r1 = r1.getSelectedItem()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x0049
            cm.l.v(r5)
            r1 = r4
        L_0x0049:
            android.widget.Spinner r1 = r1.f26792j
            java.lang.Object r1 = r1.getSelectedItem()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x005f
        L_0x005b:
            cm.l.v(r5)
            goto L_0x0060
        L_0x005f:
            r4 = r1
        L_0x0060:
            com.google.android.material.textfield.TextInputEditText r1 = r4.f26789g
        L_0x0062:
            android.text.Editable r1 = r1.getText()
            r0.append(r1)
        L_0x0069:
            java.lang.String r0 = r0.toString()
            goto L_0x0155
        L_0x006f:
            java.lang.String r0 = n8.e.f14210b
            java.lang.String r6 = "virtual"
            boolean r0 = km.p.o(r0, r6, r2)
            java.lang.String r2 = "NextGen-"
            if (r0 == 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x0099
            cm.l.v(r5)
            r1 = r4
        L_0x0099:
            android.widget.Spinner r1 = r1.f26792j
            java.lang.Object r1 = r1.getSelectedItem()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x005f
            goto L_0x005b
        L_0x00ac:
            ni.i1 r0 = n8.e.f14213e
            if (r0 != 0) goto L_0x00b6
            cm.l.v(r5)
            r0 = r4
        L_0x00b6:
            com.google.android.material.textfield.TextInputEditText r0 = r0.f26787e
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0112
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c5
            goto L_0x0112
        L_0x00c5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x00e1
            cm.l.v(r5)
            r1 = r4
        L_0x00e1:
            android.widget.Spinner r1 = r1.f26793k
            java.lang.Object r1 = r1.getSelectedItem()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x00f7
            cm.l.v(r5)
            r1 = r4
        L_0x00f7:
            com.google.android.material.textfield.TextInputEditText r1 = r1.f26789g
            android.text.Editable r1 = r1.getText()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x010d
            cm.l.v(r5)
            goto L_0x010e
        L_0x010d:
            r4 = r1
        L_0x010e:
            com.google.android.material.textfield.TextInputEditText r1 = r4.f26787e
            goto L_0x0062
        L_0x0112:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x012e
            cm.l.v(r5)
            r1 = r4
        L_0x012e:
            android.widget.Spinner r1 = r1.f26793k
            java.lang.Object r1 = r1.getSelectedItem()
            r0.append(r1)
            r0.append(r3)
            ni.i1 r1 = n8.e.f14213e
            if (r1 != 0) goto L_0x0144
            cm.l.v(r5)
            goto L_0x0145
        L_0x0144:
            r4 = r1
        L_0x0145:
            com.google.android.material.textfield.TextInputEditText r1 = r4.f26789g
            android.text.Editable r1 = r1.getText()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            goto L_0x0069
        L_0x0155:
            n8.e.f14209a = r0
            java.lang.String r0 = n8.e.f14209a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.AbtCntctTerms.ComplaintActivity.p1():java.lang.String");
    }

    /* access modifiers changed from: private */
    public static final void q1(ComplaintActivity complaintActivity, View view) {
        l.f(complaintActivity, "this$0");
        if (complaintActivity.k1() && complaintActivity.j1()) {
            complaintActivity.t1();
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(ComplaintActivity complaintActivity, View view) {
        l.f(complaintActivity, "this$0");
        complaintActivity.startActivityForResult(new Intent().setAction("android.intent.action.GET_CONTENT").setType("image/*"), 1);
    }

    /* access modifiers changed from: private */
    public static final void s1(ComplaintActivity complaintActivity, View view) {
        l.f(complaintActivity, "this$0");
        complaintActivity.finish();
    }

    private final void t1() {
        String p12 = p1();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        if (e.f14215g != null) {
            intent.putExtra("android.intent.extra.STREAM", e.f14215g);
        }
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"helpdesk-mparivahan@gov.in"});
        intent.putExtra("android.intent.extra.SUBJECT", p12);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dear Team,\n \n \n \n");
        i1 a10 = e.f14213e;
        g gVar = null;
        if (a10 == null) {
            l.v("binding");
            a10 = null;
        }
        sb2.append(a10.f26788f.getText());
        sb2.append(" \n \n \n \n Thanks and regards \n");
        g g10 = e.f14216h;
        if (g10 == null) {
            l.v("sessionManager");
            g10 = null;
        }
        sb2.append(g10.n());
        sb2.append(" \n");
        g g11 = e.f14216h;
        if (g11 == null) {
            l.v("sessionManager");
        } else {
            gVar = g11;
        }
        sb2.append(gVar.l());
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, ""));
    }

    private final void u1() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.custom_spinner_complaints, getResources().getStringArray(R.array.complaints_type));
        i1 a10 = e.f14213e;
        i1 i1Var = null;
        if (a10 == null) {
            l.v("binding");
            a10 = null;
        }
        a10.f26791i.setAdapter(arrayAdapter);
        i1 a11 = e.f14213e;
        if (a11 == null) {
            l.v("binding");
            a11 = null;
        }
        a11.f26791i.setOnItemSelectedListener(new b(this));
        i1 a12 = e.f14213e;
        if (a12 == null) {
            l.v("binding");
            a12 = null;
        }
        a12.f26793k.setOnItemSelectedListener(new c());
        i1 a13 = e.f14213e;
        if (a13 == null) {
            l.v("binding");
        } else {
            i1Var = a13;
        }
        i1Var.f26792j.setOnItemSelectedListener(new d(this));
    }

    public final boolean n1(String str) {
        l.f(str, "str");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            iArr[charAt] = iArr[charAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = str.charAt(i11);
            if (i11 >= 0) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (str.charAt(i11) == cArr[i12]) {
                        i13++;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
                if (i13 > 12) {
                    ld.c f10 = e.f14217i;
                    if (f10 == null) {
                        l.v("session");
                        f10 = null;
                    }
                    Toast.makeText(this, f10.b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"), 0).show();
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1 && i11 == -1) {
            l.c(intent);
            Uri data = intent.getData();
            l.c(data);
            e.f14215g = data;
            Uri e10 = e.f14215g;
            l.c(e10);
            String m12 = m1(e10);
            l.c(m12);
            e.f14212d = m12;
            Log.e("imageGallery Uri", e.f14215g + "   " + e.f14212d);
            i1 a10 = e.f14213e;
            if (a10 == null) {
                l.v("binding");
                a10 = null;
            }
            a10.f26796n.setText(e.f14212d);
            Toast.makeText(this, "File uploaded successfully.", 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i1 c10 = i1.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        e.f14213e = c10;
        i1 a10 = e.f14213e;
        i1 i1Var = null;
        if (a10 == null) {
            l.v("binding");
            a10 = null;
        }
        setContentView((View) a10.b());
        u1();
        e.f14217i = new ld.c(this);
        e.a aVar = v9.e.f17509a;
        i1 a11 = n8.e.f14213e;
        if (a11 == null) {
            l.v("binding");
            a11 = null;
        }
        aVar.g0(this, a11);
        n8.e.f14216h = new g(this);
        i1 a12 = n8.e.f14213e;
        if (a12 == null) {
            l.v("binding");
            a12 = null;
        }
        a12.f26786d.setOnClickListener(new n8.b(this));
        i1 a13 = n8.e.f14213e;
        if (a13 == null) {
            l.v("binding");
            a13 = null;
        }
        a13.f26785c.setOnClickListener(new n8.c(this));
        i1 a14 = n8.e.f14213e;
        if (a14 == null) {
            l.v("binding");
            a14 = null;
        }
        a14.f26790h.f25959e.setOnClickListener(new n8.d(this));
        i1 a15 = n8.e.f14213e;
        if (a15 == null) {
            l.v("binding");
        } else {
            i1Var = a15;
        }
        i1Var.f26788f.addTextChangedListener(new a());
    }
}
