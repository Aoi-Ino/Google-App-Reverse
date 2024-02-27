package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cb.t0;
import cm.h;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import gd.a0;
import gd.s;
import gd.t;
import gd.u;
import gd.v;
import gd.w;
import gd.y;
import gd.z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import ld.f;
import ni.q;
import oi.g;
import org.json.JSONObject;
import pl.x;

public final class ApplicationStatusActivity extends g {
    public q J;
    private Calendar K;
    private String L;
    /* access modifiers changed from: private */
    public String M;
    /* access modifiers changed from: private */
    public String N;
    private hd.a O;
    public GetApplStatusService P;
    public f Q;
    /* access modifiers changed from: private */
    public String R;
    public x9.d S;
    public FormsInterface T;
    /* access modifiers changed from: private */
    public fj.q U;
    public Context V;
    public ld.c W;
    private t0 X;
    public f Y;
    public ResponseBody Z;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationStatusActivity f9575e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplicationStatusActivity applicationStatusActivity) {
            super(1);
            this.f9575e = applicationStatusActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:46|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:87|88) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r3 = r0.f9575e;
            r4 = r3.S1();
            r5 = r0.f9575e.Q1();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            r3 = r0.f9575e;
            r4 = r3.S1();
            r5 = r0.f9575e.Q1();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            r3 = r0.f9575e;
            r4 = r3.S1();
            r5 = r0.f9575e.Q1();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01fb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0268 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x0165=Splitter:B:52:0x0165, B:73:0x021b=Splitter:B:73:0x021b, B:28:0x009f=Splitter:B:28:0x009f} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "Record not found"
                java.lang.String r2 = "record_error_msg"
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e
                r4 = 0
                r3.r2(r4)
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r18.getResponseBody()     // Catch:{ Exception -> 0x02c4 }
                cm.l.c(r5)     // Catch:{ Exception -> 0x02c4 }
                r3.s2(r5)     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage r3 = r18.getResponseMessage()     // Catch:{ Exception -> 0x02c4 }
                if (r3 == 0) goto L_0x02af
                java.lang.Integer r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x02c4 }
                if (r3 != 0) goto L_0x0026
                goto L_0x02af
            L_0x0026:
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x02c4 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r3 != r6) goto L_0x02af
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r3 = r3.R     // Catch:{ Exception -> 0x02c4 }
                if (r3 != 0) goto L_0x003c
                java.lang.String r3 = "title_name"
                cm.l.v(r3)     // Catch:{ Exception -> 0x02c4 }
                r3 = 0
            L_0x003c:
                java.lang.String r6 = "Withdraw Services"
                boolean r3 = cm.l.a(r3, r6)     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r6 = "app_no"
                java.lang.String r7 = "appNo"
                java.lang.String r8 = "dob"
                if (r3 == 0) goto L_0x007d
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x02c4 }
                r3.<init>()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.Class<com.nic.mparivahan.Sarathithreeservices.view.WithdrawDetailsActivity> r9 = com.nic.mparivahan.Sarathithreeservices.view.WithdrawDetailsActivity.class
                r3.setClass(r4, r9)     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = r4.M     // Catch:{ Exception -> 0x02c4 }
                if (r4 != 0) goto L_0x0062
                cm.l.v(r7)     // Catch:{ Exception -> 0x02c4 }
                r4 = 0
            L_0x0062:
                r3.putExtra(r6, r4)     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = r4.N     // Catch:{ Exception -> 0x02c4 }
                if (r4 != 0) goto L_0x0072
                cm.l.v(r8)     // Catch:{ Exception -> 0x02c4 }
                r5 = 0
                goto L_0x0073
            L_0x0072:
                r5 = r4
            L_0x0073:
                r3.putExtra(r8, r5)     // Catch:{ Exception -> 0x02c4 }
            L_0x0076:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                r4.startActivity(r3)     // Catch:{ Exception -> 0x02c4 }
                goto L_0x02d7
            L_0x007d:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.f r3 = r3.W1()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r9 = "1002"
                r10 = 1
                boolean r3 = km.p.o(r3, r9, r10)     // Catch:{ Exception -> 0x02c4 }
                r9 = 2132018237(0x7f14043d, float:1.9674775E38)
                java.lang.String r11 = "label_log_check_internet"
                r12 = 45
                java.lang.String r13 = "android.util.Base64"
                java.lang.String r14 = "this as java.lang.String).getBytes(charset)"
                java.lang.String r15 = "forName(charsetName)"
                java.lang.String r16 = "UTF-8"
                if (r3 == 0) goto L_0x0153
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013e }
                r3.<init>()     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r6 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                java.lang.String r6 = r6.M     // Catch:{ Exception -> 0x013e }
                if (r6 != 0) goto L_0x00b0
                cm.l.v(r7)     // Catch:{ Exception -> 0x013e }
                r6 = 0
            L_0x00b0:
                r3.append(r6)     // Catch:{ Exception -> 0x013e }
                r3.append(r12)     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r6 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                java.lang.String r6 = r6.N     // Catch:{ Exception -> 0x013e }
                if (r6 != 0) goto L_0x00c2
                cm.l.v(r8)     // Catch:{ Exception -> 0x013e }
                r6 = 0
            L_0x00c2:
                r3.append(r6)     // Catch:{ Exception -> 0x013e }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x013e }
                android.util.Log.d(r13, r3)     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                java.lang.String r3 = r3.M     // Catch:{ Exception -> 0x013e }
                if (r3 != 0) goto L_0x00d8
                cm.l.v(r7)     // Catch:{ Exception -> 0x013e }
                r3 = 0
            L_0x00d8:
                java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r16)     // Catch:{ Exception -> 0x013e }
                cm.l.e(r6, r15)     // Catch:{ Exception -> 0x013e }
                byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x013e }
                cm.l.e(r3, r14)     // Catch:{ Exception -> 0x013e }
                java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r6 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                java.lang.String r6 = r6.N     // Catch:{ Exception -> 0x013e }
                if (r6 != 0) goto L_0x00f7
                cm.l.v(r8)     // Catch:{ Exception -> 0x013e }
                r5 = 0
                goto L_0x00f8
            L_0x00f7:
                r5 = r6
            L_0x00f8:
                java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r16)     // Catch:{ Exception -> 0x013e }
                cm.l.e(r6, r15)     // Catch:{ Exception -> 0x013e }
                byte[] r5 = r5.getBytes(r6)     // Catch:{ Exception -> 0x013e }
                cm.l.e(r5, r14)     // Catch:{ Exception -> 0x013e }
                java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)     // Catch:{ Exception -> 0x013e }
                dd.a$a r5 = dd.a.f9964a     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r6 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                boolean r5 = r5.a(r6)     // Catch:{ Exception -> 0x013e }
                if (r5 == 0) goto L_0x0125
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                x9.d r5 = r5.U1()     // Catch:{ Exception -> 0x013e }
                cm.l.c(r3)     // Catch:{ Exception -> 0x013e }
                cm.l.c(r4)     // Catch:{ Exception -> 0x013e }
                r5.h(r3, r4)     // Catch:{ Exception -> 0x013e }
                goto L_0x02d7
            L_0x0125:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                ld.c r4 = r3.Q1()     // Catch:{ Exception -> 0x013e }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x013e }
                java.lang.String r5 = r5.getString(r9)     // Catch:{ Exception -> 0x013e }
                java.lang.String r4 = r4.b(r11, r5)     // Catch:{ Exception -> 0x013e }
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r10)     // Catch:{ Exception -> 0x013e }
                r3.show()     // Catch:{ Exception -> 0x013e }
                goto L_0x02d7
            L_0x013e:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                android.content.Context r4 = r3.S1()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.c r5 = r5.Q1()     // Catch:{ Exception -> 0x02c4 }
            L_0x014a:
                java.lang.String r5 = r5.b(r2, r1)     // Catch:{ Exception -> 0x02c4 }
            L_0x014e:
                r3.d2(r4, r5)     // Catch:{ Exception -> 0x02c4 }
                goto L_0x02d7
            L_0x0153:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.f r3 = r3.W1()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r5 = "1000"
                boolean r3 = km.p.o(r3, r5, r10)     // Catch:{ Exception -> 0x02c4 }
                if (r3 == 0) goto L_0x0209
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fb }
                r3.<init>()     // Catch:{ Exception -> 0x01fb }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                java.lang.String r5 = r5.M     // Catch:{ Exception -> 0x01fb }
                if (r5 != 0) goto L_0x0176
                cm.l.v(r7)     // Catch:{ Exception -> 0x01fb }
                r5 = 0
            L_0x0176:
                r3.append(r5)     // Catch:{ Exception -> 0x01fb }
                r3.append(r12)     // Catch:{ Exception -> 0x01fb }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                java.lang.String r5 = r5.N     // Catch:{ Exception -> 0x01fb }
                if (r5 != 0) goto L_0x0188
                cm.l.v(r8)     // Catch:{ Exception -> 0x01fb }
                r5 = 0
            L_0x0188:
                r3.append(r5)     // Catch:{ Exception -> 0x01fb }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01fb }
                android.util.Log.d(r13, r3)     // Catch:{ Exception -> 0x01fb }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                java.lang.String r3 = r3.M     // Catch:{ Exception -> 0x01fb }
                if (r3 != 0) goto L_0x019e
                cm.l.v(r7)     // Catch:{ Exception -> 0x01fb }
                r3 = 0
            L_0x019e:
                java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r16)     // Catch:{ Exception -> 0x01fb }
                cm.l.e(r5, r15)     // Catch:{ Exception -> 0x01fb }
                byte[] r3 = r3.getBytes(r5)     // Catch:{ Exception -> 0x01fb }
                cm.l.e(r3, r14)     // Catch:{ Exception -> 0x01fb }
                java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{ Exception -> 0x01fb }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                java.lang.String r5 = r5.N     // Catch:{ Exception -> 0x01fb }
                if (r5 != 0) goto L_0x01bc
                cm.l.v(r8)     // Catch:{ Exception -> 0x01fb }
                r5 = 0
            L_0x01bc:
                java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r16)     // Catch:{ Exception -> 0x01fb }
                cm.l.e(r6, r15)     // Catch:{ Exception -> 0x01fb }
                byte[] r5 = r5.getBytes(r6)     // Catch:{ Exception -> 0x01fb }
                cm.l.e(r5, r14)     // Catch:{ Exception -> 0x01fb }
                java.lang.String r4 = android.util.Base64.encodeToString(r5, r4)     // Catch:{ Exception -> 0x01fb }
                dd.a$a r5 = dd.a.f9964a     // Catch:{ Exception -> 0x01fb }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r6 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                boolean r5 = r5.a(r6)     // Catch:{ Exception -> 0x01fb }
                if (r5 == 0) goto L_0x01e9
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                x9.d r5 = r5.U1()     // Catch:{ Exception -> 0x01fb }
                cm.l.c(r3)     // Catch:{ Exception -> 0x01fb }
                cm.l.c(r4)     // Catch:{ Exception -> 0x01fb }
                r5.g(r3, r4)     // Catch:{ Exception -> 0x01fb }
                goto L_0x02d7
            L_0x01e9:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x01fb }
                r4 = 2132018535(0x7f140567, float:1.967538E38)
                java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x01fb }
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r10)     // Catch:{ Exception -> 0x01fb }
                r3.show()     // Catch:{ Exception -> 0x01fb }
                goto L_0x02d7
            L_0x01fb:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                android.content.Context r4 = r3.S1()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.c r5 = r5.Q1()     // Catch:{ Exception -> 0x02c4 }
                goto L_0x014a
            L_0x0209:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.f r3 = r3.W1()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = "902"
                boolean r3 = km.p.o(r3, r4, r10)     // Catch:{ Exception -> 0x02c4 }
                if (r3 == 0) goto L_0x0276
                dd.a$a r3 = dd.a.f9964a     // Catch:{ Exception -> 0x0268 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                boolean r3 = r3.a(r4)     // Catch:{ Exception -> 0x0268 }
                if (r3 == 0) goto L_0x0250
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                fj.q r3 = r3.U     // Catch:{ Exception -> 0x0268 }
                if (r3 != 0) goto L_0x0233
                java.lang.String r3 = "viewModel"
                cm.l.v(r3)     // Catch:{ Exception -> 0x0268 }
                r3 = 0
            L_0x0233:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                java.lang.String r4 = r4.M     // Catch:{ Exception -> 0x0268 }
                if (r4 != 0) goto L_0x023f
                cm.l.v(r7)     // Catch:{ Exception -> 0x0268 }
                r4 = 0
            L_0x023f:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                java.lang.String r5 = r5.N     // Catch:{ Exception -> 0x0268 }
                if (r5 != 0) goto L_0x024b
                cm.l.v(r8)     // Catch:{ Exception -> 0x0268 }
                r5 = 0
            L_0x024b:
                r3.g(r4, r5)     // Catch:{ Exception -> 0x0268 }
                goto L_0x02d7
            L_0x0250:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                ld.c r4 = r3.Q1()     // Catch:{ Exception -> 0x0268 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x0268 }
                java.lang.String r5 = r5.getString(r9)     // Catch:{ Exception -> 0x0268 }
                java.lang.String r4 = r4.b(r11, r5)     // Catch:{ Exception -> 0x0268 }
                android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r10)     // Catch:{ Exception -> 0x0268 }
                r3.show()     // Catch:{ Exception -> 0x0268 }
                goto L_0x02d7
            L_0x0268:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                android.content.Context r4 = r3.S1()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                ld.c r5 = r5.Q1()     // Catch:{ Exception -> 0x02c4 }
                goto L_0x014a
            L_0x0276:
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x02c4 }
                r3.<init>()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.Class<com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity> r5 = com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.class
                r3.setClass(r4, r5)     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = r4.M     // Catch:{ Exception -> 0x02c4 }
                if (r4 != 0) goto L_0x028e
                cm.l.v(r7)     // Catch:{ Exception -> 0x02c4 }
                r4 = 0
            L_0x028e:
                r3.putExtra(r6, r4)     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r4 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = r4.N     // Catch:{ Exception -> 0x02c4 }
                if (r4 != 0) goto L_0x029e
                cm.l.v(r8)     // Catch:{ Exception -> 0x02c4 }
                r5 = 0
                goto L_0x029f
            L_0x029e:
                r5 = r4
            L_0x029f:
                r3.putExtra(r8, r5)     // Catch:{ Exception -> 0x02c4 }
                java.lang.String r4 = "respBody"
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r5.V1()     // Catch:{ Exception -> 0x02c4 }
                r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x02c4 }
                goto L_0x0076
            L_0x02af:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e     // Catch:{ Exception -> 0x02c4 }
                android.content.Context r4 = r3.S1()     // Catch:{ Exception -> 0x02c4 }
                com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage r5 = r18.getResponseMessage()     // Catch:{ Exception -> 0x02c4 }
                if (r5 == 0) goto L_0x02c1
                java.lang.String r5 = r5.getDeveloperMessage()     // Catch:{ Exception -> 0x02c4 }
                goto L_0x014e
            L_0x02c1:
                r5 = 0
                goto L_0x014e
            L_0x02c4:
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r3 = r0.f9575e
                android.content.Context r4 = r3.S1()
                com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity r5 = r0.f9575e
                ld.c r5 = r5.Q1()
                java.lang.String r1 = r5.b(r2, r1)
                r3.d2(r4, r1)
            L_0x02d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity.a.b(com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetApplInfoResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationStatusActivity f9576e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ApplicationStatusActivity applicationStatusActivity) {
            super(1);
            this.f9576e = applicationStatusActivity;
        }

        public final void b(FormsPojo formsPojo) {
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                ApplicationStatusActivity applicationStatusActivity = this.f9576e;
                applicationStatusActivity.h2(applicationStatusActivity.Q1().b("label_form2_download", this.f9576e.getString(R.string.form2_download)), formsPojo.getForm_report());
                return;
            }
            ApplicationStatusActivity applicationStatusActivity2 = this.f9576e;
            applicationStatusActivity2.d2(applicationStatusActivity2.S1(), formsPojo.getStatus_desc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationStatusActivity f9577e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ApplicationStatusActivity applicationStatusActivity) {
            super(1);
            this.f9577e = applicationStatusActivity;
        }

        public final void b(FormsPojo formsPojo) {
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                ApplicationStatusActivity applicationStatusActivity = this.f9577e;
                applicationStatusActivity.f2(applicationStatusActivity.Q1().b("label_form1_download", this.f9577e.getString(R.string.form1a_download)), formsPojo.getForm_report());
                return;
            }
            ApplicationStatusActivity applicationStatusActivity2 = this.f9577e;
            applicationStatusActivity2.d2(applicationStatusActivity2.S1(), formsPojo.getStatus_desc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationStatusActivity f9578e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ApplicationStatusActivity applicationStatusActivity) {
            super(1);
            this.f9578e = applicationStatusActivity;
        }

        public final void b(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("Reportdets")) {
                        String string = jSONObject.getString("Reportdets");
                        ApplicationStatusActivity applicationStatusActivity = this.f9578e;
                        String b10 = applicationStatusActivity.Q1().b("app_slip_saved", "Appointment Receipt is saved successfully in storage");
                        cm.l.c(string);
                        applicationStatusActivity.j2(b10, string);
                    }
                } catch (Exception e10) {
                    ApplicationStatusActivity applicationStatusActivity2 = this.f9578e;
                    applicationStatusActivity2.d2(applicationStatusActivity2.S1(), this.f9578e.Q1().b("record_error_msg", this.f9578e.getString(R.string.unable_to_get_details)));
                    e10.printStackTrace();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9579a;

        e(l lVar) {
            cm.l.f(lVar, "function");
            this.f9579a = lVar;
        }

        public final pl.c a() {
            return this.f9579a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9579a.invoke(obj);
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

    public ApplicationStatusActivity() {
        Calendar instance = Calendar.getInstance();
        cm.l.e(instance, "getInstance(...)");
        this.K = instance;
    }

    private final void M1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new y(this), this.K.get(1), this.K.get(2), this.K.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void N1(ApplicationStatusActivity applicationStatusActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(applicationStatusActivity, "this$0");
        applicationStatusActivity.K.set(1, i10);
        applicationStatusActivity.K.set(2, i11);
        applicationStatusActivity.K.set(5, i12);
        CharSequence format = DateFormat.format("dd", applicationStatusActivity.K.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", applicationStatusActivity.K.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", applicationStatusActivity.K.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) format) + '-' + ((String) format2) + '-' + ((String) format3);
        applicationStatusActivity.L = str;
        String str2 = null;
        if (str == null) {
            cm.l.v("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = applicationStatusActivity.R1().f28099b;
        String str3 = applicationStatusActivity.L;
        if (str3 == null) {
            cm.l.v("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void P1() {
        hd.a aVar = this.O;
        if (aVar == null) {
            cm.l.v("appStatusVM");
            aVar = null;
        }
        aVar.j().g(this, new e(new a(this)));
    }

    private final void X1() {
        R1().f28104g.f28448b.setOnClickListener(new v(this));
        this.O = (hd.a) new u0((x0) this, (u0.b) new hd.b(new ed.a(O1()))).a(hd.a.class);
        u2(new f(this));
        this.R = W1().i();
        AppCompatTextView appCompatTextView = R1().f28110m;
        String str = this.R;
        fj.q qVar = null;
        if (str == null) {
            cm.l.v("title_name");
            str = null;
        }
        appCompatTextView.setText(str);
        R1().f28104g.f28452f.setText(W1().i());
        String str2 = this.R;
        if (str2 == null) {
            cm.l.v("title_name");
            str2 = null;
        }
        if (cm.l.a(str2, "Dispose Application")) {
            R1().f28108k.setVisibility(0);
            R1().f28107j.setVisibility(0);
            R1().f28100c.setHint(Q1().b("label_dl_serv_appl_no", ""));
            R1().f28099b.setHint(getString(R.string.enter_date));
        } else {
            R1().f28108k.setVisibility(8);
            R1().f28107j.setVisibility(8);
        }
        P1();
        U1().k().g(this, new e(new b(this)));
        U1().j().g(this, new e(new c(this)));
        fj.q qVar2 = this.U;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new e(new d(this)));
    }

    /* access modifiers changed from: private */
    public static final void Y1(ApplicationStatusActivity applicationStatusActivity, View view) {
        cm.l.f(applicationStatusActivity, "this$0");
        VUtility.Companion.v(applicationStatusActivity, applicationStatusActivity.Q1().b("are_you_sure_you_want_to_leave", applicationStatusActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    private final void Z1() {
        R1().f28102e.setOnClickListener(new s(this));
        R1().f28109l.setOnClickListener(new t(this));
        R1().f28101d.setOnClickListener(new u(this));
    }

    /* access modifiers changed from: private */
    public static final void a2(ApplicationStatusActivity applicationStatusActivity, View view) {
        cm.l.f(applicationStatusActivity, "this$0");
        applicationStatusActivity.M1();
    }

    /* access modifiers changed from: private */
    public static final void b2(ApplicationStatusActivity applicationStatusActivity, View view) {
        String b10;
        ld.c cVar;
        String str;
        String str2;
        cm.l.f(applicationStatusActivity, "this$0");
        if (!p.o(applicationStatusActivity.W1().b(), "901", true)) {
            applicationStatusActivity.M = applicationStatusActivity.R1().f28100c.getText().toString();
            applicationStatusActivity.N = applicationStatusActivity.R1().f28099b.getText().toString();
            String str3 = applicationStatusActivity.M;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("appNo");
                str3 = null;
            }
            if (!cm.l.a(str3, "")) {
                String str5 = applicationStatusActivity.N;
                if (str5 == null) {
                    cm.l.v("dob");
                    str5 = null;
                }
                if (!cm.l.a(str5, "")) {
                    if (!com.nic.mparivahan.dlservices.utilities.e.e(applicationStatusActivity)) {
                        return;
                    }
                    if (dd.a.f9964a.a(applicationStatusActivity)) {
                        applicationStatusActivity.r2(true);
                        hd.a aVar = applicationStatusActivity.O;
                        if (aVar == null) {
                            cm.l.v("appStatusVM");
                            aVar = null;
                        }
                        String str6 = applicationStatusActivity.M;
                        if (str6 == null) {
                            cm.l.v("appNo");
                            str6 = null;
                        }
                        String str7 = applicationStatusActivity.N;
                        if (str7 == null) {
                            cm.l.v("dob");
                        } else {
                            str4 = str7;
                        }
                        aVar.g(applicationStatusActivity, str6, str4);
                        return;
                    }
                }
                b10 = applicationStatusActivity.Q1().b("label_log_check_internet", applicationStatusActivity.getString(R.string.kindly_check_your_internet_connection));
                Toast.makeText(applicationStatusActivity, b10, 1).show();
            }
        } else if (!cm.l.a(applicationStatusActivity.R1().f28100c.getText().toString(), "")) {
            if (cm.l.a(applicationStatusActivity.R1().f28099b.getText().toString(), "")) {
                cVar = applicationStatusActivity.Q1();
                str2 = applicationStatusActivity.getString(R.string.enter_dob);
                str = "edit_dl_serv_dob";
                b10 = cVar.b(str, str2);
                Toast.makeText(applicationStatusActivity, b10, 1).show();
            }
            if (dd.a.f9964a.a(applicationStatusActivity)) {
                Intent intent = new Intent(applicationStatusActivity, ReprintReceipt.class);
                intent.putExtra("app_no", applicationStatusActivity.R1().f28100c.getText().toString());
                intent.putExtra("app_dob", applicationStatusActivity.R1().f28099b.getText().toString());
                applicationStatusActivity.startActivity(intent);
                return;
            }
            b10 = applicationStatusActivity.Q1().b("label_log_check_internet", applicationStatusActivity.getString(R.string.kindly_check_your_internet_connection));
            Toast.makeText(applicationStatusActivity, b10, 1).show();
        }
        cVar = applicationStatusActivity.Q1();
        str = v9.f.f17510a.E();
        str2 = applicationStatusActivity.getString(R.string.enter_application_no);
        b10 = cVar.b(str, str2);
        Toast.makeText(applicationStatusActivity, b10, 1).show();
    }

    /* access modifiers changed from: private */
    public static final void c2(ApplicationStatusActivity applicationStatusActivity, View view) {
        cm.l.f(applicationStatusActivity, "this$0");
        applicationStatusActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void f2(String str, String str2) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new w(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationStatusActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = applicationStatusActivity.M;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("appNo");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append(".pdf");
            File file2 = new File(str2 + sb2.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append("/mParivahan_doc/");
            String str5 = applicationStatusActivity.M;
            if (str5 == null) {
                cm.l.v("appNo");
            } else {
                str4 = str5;
            }
            sb3.append(str4);
            sb3.append(".pdf");
            Uri g10 = FileProvider.g(applicationStatusActivity.S1(), "com.nic.mparivahan.provider", new File(sb3.toString()));
            Log.e("create pdf uri path==>", "" + g10);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            applicationStatusActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void h2(String str, String str2) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new z(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void i2(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationStatusActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = applicationStatusActivity.M;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("appNo");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append("_form.pdf");
            File file2 = new File(str2 + sb2.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append("/mParivahan_doc/");
            String str5 = applicationStatusActivity.M;
            if (str5 == null) {
                cm.l.v("appNo");
            } else {
                str4 = str5;
            }
            sb3.append(str4);
            sb3.append("_form.pdf");
            Uri g10 = FileProvider.g(applicationStatusActivity.S1(), "com.nic.mparivahan.provider", new File(sb3.toString()));
            Log.e("create pdf uri path==>", "" + g10);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            applicationStatusActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void j2(String str, String str2) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new gd.x(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void k2(Dialog dialog, ApplicationStatusActivity applicationStatusActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationStatusActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = applicationStatusActivity.M;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("appNo");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append("_slot");
            File file2 = new File(str2 + sb2.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append("/mParivahan_doc/");
            String str5 = applicationStatusActivity.M;
            if (str5 == null) {
                cm.l.v("appNo");
            } else {
                str4 = str5;
            }
            sb3.append(str4);
            sb3.append("_slot");
            Uri g10 = FileProvider.g(applicationStatusActivity.S1(), "com.nic.mparivahan.provider", new File(sb3.toString()));
            Log.e("create pdf uri path==>", "" + g10);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            applicationStatusActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void r2(boolean z10) {
        if (z10) {
            try {
                this.X = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.X;
        if (t0Var == null) {
            return;
        }
        if (z10) {
            t0Var.b();
        } else {
            t0Var.a();
        }
    }

    public final GetApplStatusService O1() {
        GetApplStatusService getApplStatusService = this.P;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        cm.l.v("appInfoService");
        return null;
    }

    public final ld.c Q1() {
        ld.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final q R1() {
        q qVar = this.J;
        if (qVar != null) {
            return qVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context S1() {
        Context context = this.V;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final FormsInterface T1() {
        FormsInterface formsInterface = this.T;
        if (formsInterface != null) {
            return formsInterface;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final x9.d U1() {
        x9.d dVar = this.S;
        if (dVar != null) {
            return dVar;
        }
        cm.l.v("mFormsVM");
        return null;
    }

    public final ResponseBody V1() {
        ResponseBody responseBody = this.Z;
        if (responseBody != null) {
            return responseBody;
        }
        cm.l.v("respBody");
        return null;
    }

    public final f W1() {
        f fVar = this.Q;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void d2(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new a0(dialog));
        dialog.show();
    }

    public final void l2(GetApplStatusService getApplStatusService) {
        cm.l.f(getApplStatusService, "<set-?>");
        this.P = getApplStatusService;
    }

    public final void m2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void n2(q qVar) {
        cm.l.f(qVar, "<set-?>");
        this.J = qVar;
    }

    public final void o2(Context context) {
        cm.l.f(context, "<set-?>");
        this.V = context;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q c10 = q.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        n2(c10);
        setContentView((View) R1().b());
        v9.e.f17509a.H(this, R1());
        o2(this);
        t2(new f(S1()));
        m2(new ld.c(this));
        l2(GetApplStatusService.f9545a.a(S1()));
        p2(FormsInterface.f8102a.a(S1()));
        q2((x9.d) new u0((x0) this, (u0.b) new x9.c(new x9.b(T1()))).a(x9.d.class));
        this.U = (fj.q) new u0(this).a(fj.q.class);
        X1();
        Z1();
    }

    public final void p2(FormsInterface formsInterface) {
        cm.l.f(formsInterface, "<set-?>");
        this.T = formsInterface;
    }

    public final void q2(x9.d dVar) {
        cm.l.f(dVar, "<set-?>");
        this.S = dVar;
    }

    public final void s2(ResponseBody responseBody) {
        cm.l.f(responseBody, "<set-?>");
        this.Z = responseBody;
    }

    public final void t2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Y = fVar;
    }

    public final void u2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Q = fVar;
    }
}
