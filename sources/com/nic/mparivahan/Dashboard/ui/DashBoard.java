package com.nic.mparivahan.Dashboard.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.google.android.material.navigation.NavigationView;
import com.nic.mparivahan.AbtCntctTerms.ComplaintActivity;
import com.nic.mparivahan.Account.Model.LogoutModle;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Language.SettingActivity;
import com.nic.mparivahan.NearByPlaces.NearByPlaces;
import com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;
import com.nic.mparivahan.PushNoti.NotViews.NotificationView;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.SosHomeScreen;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import ld.e;
import ld.g;
import org.json.JSONObject;
import pl.x;
import sa.a0;
import sa.p;
import sa.q;
import sa.r;
import sa.s;
import sa.t;
import sa.u;
import sa.v;
import sa.w;
import sa.y;
import sa.z;
import t0.k;
import v8.h;
import w0.d;

public final class DashBoard extends androidx.appcompat.app.d {
    private w0.d G;
    private Toolbar H;
    private DrawerLayout I;
    private NavigationView J;
    public g K;
    private LinearLayout L;
    private LinearLayout M;
    private LinearLayout N;
    private LinearLayout O;
    public ImageView P;
    public DatabaseHelper Q;
    private LinearLayout R;
    private LinearLayout S;
    private LinearLayout T;
    public qc.b U;
    public UserBloodDetails V;
    private CircleImageView W;
    public ProgressDialog X;
    public h Y;
    private SignService Z;

    /* renamed from: a0  reason: collision with root package name */
    private Dialog f8404a0;

    /* renamed from: b0  reason: collision with root package name */
    public TextView f8405b0;

    /* renamed from: c0  reason: collision with root package name */
    private ld.c f8406c0;

    /* renamed from: d0  reason: collision with root package name */
    private TextView f8407d0;

    /* renamed from: e0  reason: collision with root package name */
    private TextView f8408e0;

    /* renamed from: f0  reason: collision with root package name */
    private TextView f8409f0;

    /* renamed from: g0  reason: collision with root package name */
    private TextView f8410g0;

    /* renamed from: h0  reason: collision with root package name */
    private TextView f8411h0;

    public static final class a extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f8412e = new a();

        public a() {
            super(0);
        }

        /* renamed from: b */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DashBoard f8413e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DashBoard dashBoard) {
            super(1);
            this.f8413e = dashBoard;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.getStatusCode()     // Catch:{ Exception -> 0x003d }
                java.lang.String r1 = "CTZN001"
                r2 = 1
                boolean r0 = km.p.o(r0, r1, r2)     // Catch:{ Exception -> 0x003d }
                if (r0 == 0) goto L_0x003f
                ld.a r0 = new ld.a     // Catch:{ Exception -> 0x002a }
                com.nic.mparivahan.Dashboard.ui.DashBoard r1 = r3.f8413e     // Catch:{ Exception -> 0x002a }
                r0.<init>(r1)     // Catch:{ Exception -> 0x002a }
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x002a }
                java.lang.String r2 = "dd-MM-yyyy"
                r1.<init>(r2)     // Catch:{ Exception -> 0x002a }
                java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x002a }
                r2.<init>()     // Catch:{ Exception -> 0x002a }
                java.lang.String r1 = r1.format(r2)     // Catch:{ Exception -> 0x002a }
                cm.l.c(r1)     // Catch:{ Exception -> 0x002a }
                r0.f(r1)     // Catch:{ Exception -> 0x002a }
            L_0x002a:
                com.nic.mparivahan.Dashboard.ui.DashBoard r0 = r3.f8413e     // Catch:{ Exception -> 0x003d }
                ld.g r0 = r0.w1()     // Catch:{ Exception -> 0x003d }
                java.lang.String r4 = r4.getCtzImage()     // Catch:{ Exception -> 0x003d }
                r0.B(r4)     // Catch:{ Exception -> 0x003d }
                com.nic.mparivahan.Dashboard.ui.DashBoard r4 = r3.f8413e     // Catch:{ Exception -> 0x003d }
            L_0x0039:
                r4.P1()     // Catch:{ Exception -> 0x003d }
                goto L_0x0045
            L_0x003d:
                r4 = move-exception
                goto L_0x0042
            L_0x003f:
                com.nic.mparivahan.Dashboard.ui.DashBoard r4 = r3.f8413e     // Catch:{ Exception -> 0x003d }
                goto L_0x0039
            L_0x0042:
                r4.printStackTrace()
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.DashBoard.b.b(com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FetchProfileImgResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DashBoard f8414e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DashBoard dashBoard) {
            super(1);
            this.f8414e = dashBoard;
        }

        public final void b(String str) {
            this.f8414e.P1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8415a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f8415a = lVar;
        }

        public final pl.c a() {
            return this.f8415a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8415a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(dashBoard)) {
            ld.c cVar = dashBoard.f8406c0;
            if (cVar == null) {
                cm.l.v("langSession");
                cVar = null;
            }
            Toast.makeText(dashBoard, cVar.b("label_log_check_internet", dashBoard.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (dashBoard.w1().t()) {
            dashBoard.startActivity(new Intent(dashBoard, SosHomeScreen.class));
        }
    }

    /* access modifiers changed from: private */
    public static final void B1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(dashBoard)) {
            ld.c cVar = dashBoard.f8406c0;
            if (cVar == null) {
                cm.l.v("langSession");
                cVar = null;
            }
            Toast.makeText(dashBoard, cVar.b("label_log_check_internet", dashBoard.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (dashBoard.w1().t()) {
            dashBoard.startActivity(new Intent(dashBoard, NotificationView.class));
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        Intent intent = new Intent(dashBoard, DashBoard.class);
        new e(dashBoard).h(0);
        dashBoard.startActivity(intent);
        dashBoard.finishAffinity();
    }

    /* access modifiers changed from: private */
    public static final void D1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        dashBoard.startActivity(new Intent(dashBoard, SettingActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void E1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        dashBoard.startActivity(new Intent(dashBoard, ComplaintActivity.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.drawerlayout.widget.DrawerLayout} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        cm.l.v("langSession");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        android.widget.Toast.makeText(r6, r4.b("label_log_check_internet", r6.getString(com.nic.mparivahan.R.string.kindly_check_your_internet_connection)), 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r6.startActivity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017c, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean F1(com.nic.mparivahan.Dashboard.ui.DashBoard r6, android.view.MenuItem r7) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r6, r0)
            java.lang.String r0 = "it"
            cm.l.f(r7, r0)
            int r7 = r7.getItemId()
            r0 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r1 = "label_log_check_internet"
            java.lang.String r2 = "langSession"
            java.lang.String r3 = "drawerLayout"
            r4 = 0
            r5 = 1
            switch(r7) {
                case 2131363409: goto L_0x01c0;
                case 2131363724: goto L_0x019e;
                case 2131363726: goto L_0x0195;
                case 2131363728: goto L_0x0180;
                case 2131364142: goto L_0x0125;
                case 2131364533: goto L_0x0107;
                case 2131365732: goto L_0x00f3;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r7) {
                case 2131363732: goto L_0x00b8;
                case 2131363733: goto L_0x00a0;
                case 2131363734: goto L_0x0060;
                case 2131363735: goto L_0x0039;
                case 2131363736: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r5 = 0
            goto L_0x01d5
        L_0x0022:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Dashboard.ui.DashBoard> r0 = com.nic.mparivahan.Dashboard.ui.DashBoard.class
            r7.<init>(r6, r0)
            ld.e r0 = new ld.e
            r0.<init>(r6)
            r0.h(r5)
            r6.startActivity(r7)
            r6.finishAffinity()
            goto L_0x01d5
        L_0x0039:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I     // Catch:{ Exception -> 0x01d5 }
            if (r7 != 0) goto L_0x0041
            cm.l.v(r3)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x0042
        L_0x0041:
            r4 = r7
        L_0x0042:
            r4.i()     // Catch:{ Exception -> 0x01d5 }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x01d5 }
            r7.<init>()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = "android.intent.action.SEND"
            r7.setAction(r0)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = "This app empowers citizen with instant access to various information, services and utilities related to the Transport Sector, Download mParivahan app at: https://play.google.com/store/apps/details?id=com.nic.mparivahan"
            r7.putExtra(r0, r1)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = "text/plain"
            r7.setType(r0)     // Catch:{ Exception -> 0x01d5 }
            r6.startActivity(r7)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01d5
        L_0x0060:
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            if (r7 == 0) goto L_0x0086
            ld.g r7 = r6.w1()
            boolean r7 = r7.t()
            if (r7 == 0) goto L_0x01d5
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x007a
            cm.l.v(r3)
            goto L_0x007b
        L_0x007a:
            r4 = r7
        L_0x007b:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails> r0 = com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x0086:
            ld.c r7 = r6.f8406c0
            if (r7 != 0) goto L_0x008e
        L_0x008a:
            cm.l.v(r2)
            goto L_0x008f
        L_0x008e:
            r4 = r7
        L_0x008f:
            java.lang.String r7 = r6.getString(r0)
            java.lang.String r7 = r4.b(r1, r7)
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r5)
            r6.show()
            goto L_0x01d5
        L_0x00a0:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x00a8
            cm.l.v(r3)
            goto L_0x00a9
        L_0x00a8:
            r4 = r7
        L_0x00a9:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.NearByPlaces.NearByPlaces> r0 = com.nic.mparivahan.NearByPlaces.NearByPlaces.class
            r7.<init>(r6, r0)
        L_0x00b3:
            r6.startActivity(r7)
            goto L_0x01d5
        L_0x00b8:
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            if (r7 == 0) goto L_0x00ee
            ld.g r7 = r6.w1()
            boolean r7 = r7.t()
            if (r7 == 0) goto L_0x01d5
            android.app.ProgressDialog r7 = r6.v1()
            r7.show()
            ld.g r7 = r6.w1()
            java.lang.String r7 = r7.k()
            ld.g r0 = r6.w1()
            java.lang.String r0 = r0.l()
            ld.g r1 = r6.w1()
            boolean r1 = r1.d()
            r6.U1(r7, r0, r1)
            goto L_0x01d5
        L_0x00ee:
            ld.c r7 = r6.f8406c0
            if (r7 != 0) goto L_0x008e
            goto L_0x008a
        L_0x00f3:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x00fb
            cm.l.v(r3)
            goto L_0x00fc
        L_0x00fb:
            r4 = r7
        L_0x00fc:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Dashboard.ui.VirtualDocScreen> r0 = com.nic.mparivahan.Dashboard.ui.VirtualDocScreen.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x0107:
            ld.g r7 = r6.w1()
            boolean r7 = r7.t()
            if (r7 == 0) goto L_0x01d5
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x0119
            cm.l.v(r3)
            goto L_0x011a
        L_0x0119:
            r4 = r7
        L_0x011a:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Language.SettingActivity> r0 = com.nic.mparivahan.Language.SettingActivity.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x0125:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x012d
            cm.l.v(r3)
            r7 = r4
        L_0x012d:
            r7.i()
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            if (r7 == 0) goto L_0x017a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            hc.a$a r0 = hc.a.f12073a
            java.lang.String r0 = r0.g()
            r7.append(r0)
            java.lang.String r0 = "english/mparivahan-info-privacy-policy.html"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.InformationService.InformationalWebView> r1 = com.nic.mparivahan.InformationService.InformationalWebView.class
            r0.<init>(r6, r1)
            java.lang.String r1 = "URL"
            r0.putExtra(r1, r7)
            ld.c r7 = r6.f8406c0
            if (r7 != 0) goto L_0x0163
            cm.l.v(r2)
            goto L_0x0164
        L_0x0163:
            r4 = r7
        L_0x0164:
            r7 = 2132018856(0x7f1406a8, float:1.967603E38)
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r1 = "privacy"
            java.lang.String r7 = r4.b(r1, r7)
            java.lang.String r1 = "title"
            r0.putExtra(r1, r7)
            r6.startActivity(r0)
            goto L_0x01d5
        L_0x017a:
            ld.c r7 = r6.f8406c0
            if (r7 != 0) goto L_0x008e
            goto L_0x008a
        L_0x0180:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x0188
            cm.l.v(r3)
            goto L_0x0189
        L_0x0188:
            r4 = r7
        L_0x0189:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Account.AbtCntctTerms.ContactUs> r0 = com.nic.mparivahan.Account.AbtCntctTerms.ContactUs.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x0195:
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.NewDesignActivity.MyDocActivity> r0 = com.nic.mparivahan.NewDesignActivity.MyDocActivity.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x019e:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x01a6
            cm.l.v(r3)
            r7 = r4
        L_0x01a6:
            r7.i()
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            if (r7 == 0) goto L_0x01ba
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.AbtCntctTerms.AboutUs> r0 = com.nic.mparivahan.AbtCntctTerms.AboutUs.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x01ba:
            ld.c r7 = r6.f8406c0
            if (r7 != 0) goto L_0x008e
            goto L_0x008a
        L_0x01c0:
            androidx.drawerlayout.widget.DrawerLayout r7 = r6.I
            if (r7 != 0) goto L_0x01c8
            cm.l.v(r3)
            goto L_0x01c9
        L_0x01c8:
            r4 = r7
        L_0x01c9:
            r4.i()
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<com.nic.mparivahan.Language.ChooseLanguagScreen> r0 = com.nic.mparivahan.Language.ChooseLanguagScreen.class
            r7.<init>(r6, r0)
            goto L_0x00b3
        L_0x01d5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.DashBoard.F1(com.nic.mparivahan.Dashboard.ui.DashBoard, android.view.MenuItem):boolean");
    }

    /* access modifiers changed from: private */
    public static final void G1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        dashBoard.startActivity(new Intent(dashBoard, UserDetails.class));
    }

    /* access modifiers changed from: private */
    public static final void H1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        dashBoard.startActivity(new Intent(dashBoard, NearByPlaces.class));
    }

    /* access modifiers changed from: private */
    public static final void J1(DashBoard dashBoard, View view) {
        cm.l.f(dashBoard, "this$0");
        Dialog dialog = dashBoard.f8404a0;
        cm.l.c(dialog);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void P1() {
        CircleImageView circleImageView = null;
        if (w1().p().length() <= 0 || cm.l.a(w1().p(), "0")) {
            CircleImageView circleImageView2 = this.W;
            if (circleImageView2 == null) {
                cm.l.v("userProfileImg");
            } else {
                circleImageView = circleImageView2;
            }
            circleImageView.setImageResource(R.drawable.avtar);
            return;
        }
        Bitmap c10 = com.nic.mparivahan.dlservices.utilities.e.c(w1().p());
        if (c10 != null) {
            CircleImageView circleImageView3 = this.W;
            if (circleImageView3 == null) {
                cm.l.v("userProfileImg");
            } else {
                circleImageView = circleImageView3;
            }
            circleImageView.setImageBitmap(c10);
        }
    }

    private final void U1(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", Long.parseLong(str));
            jSONObject.put("ctzMobile", (Object) str2);
            jSONObject.put("ctzMpinStatus", z10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", (Object) jSONObject);
            x1().C(jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void r1() {
        View findViewById = findViewById(R.id.txt_home);
        cm.l.e(findViewById, "findViewById(...)");
        this.f8407d0 = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txt_profile);
        cm.l.e(findViewById2, "findViewById(...)");
        this.f8408e0 = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.text_setting);
        cm.l.e(findViewById3, "findViewById(...)");
        this.f8410g0 = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.text_help);
        cm.l.e(findViewById4, "findViewById(...)");
        this.f8411h0 = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.txt_near_by);
        cm.l.e(findViewById5, "findViewById(...)");
        this.f8409f0 = (TextView) findViewById5;
        TextView textView = this.f8407d0;
        ld.c cVar = null;
        if (textView == null) {
            cm.l.v("txt_home");
            textView = null;
        }
        ld.c cVar2 = this.f8406c0;
        if (cVar2 == null) {
            cm.l.v("langSession");
            cVar2 = null;
        }
        textView.setText(cVar2.b("label_home", getString(R.string.home)));
        TextView textView2 = this.f8408e0;
        if (textView2 == null) {
            cm.l.v("txt_profile");
            textView2 = null;
        }
        ld.c cVar3 = this.f8406c0;
        if (cVar3 == null) {
            cm.l.v("langSession");
            cVar3 = null;
        }
        textView2.setText(cVar3.b("my_profile", "My Profile"));
        TextView textView3 = this.f8409f0;
        if (textView3 == null) {
            cm.l.v("txt_near_by");
            textView3 = null;
        }
        ld.c cVar4 = this.f8406c0;
        if (cVar4 == null) {
            cm.l.v("langSession");
            cVar4 = null;
        }
        textView3.setText(cVar4.b("label_near_by", "Near By"));
        TextView textView4 = this.f8410g0;
        if (textView4 == null) {
            cm.l.v("text_setting");
            textView4 = null;
        }
        ld.c cVar5 = this.f8406c0;
        if (cVar5 == null) {
            cm.l.v("langSession");
            cVar5 = null;
        }
        textView4.setText(cVar5.b("label_setting", "Settings"));
        TextView textView5 = this.f8411h0;
        if (textView5 == null) {
            cm.l.v("text_help");
            textView5 = null;
        }
        ld.c cVar6 = this.f8406c0;
        if (cVar6 == null) {
            cm.l.v("langSession");
        } else {
            cVar = cVar6;
        }
        textView5.setText(cVar.b("help", "Help"));
    }

    /* access modifiers changed from: private */
    public static final void y1(DashBoard dashBoard, LogoutModle logoutModle) {
        cm.l.f(dashBoard, "this$0");
        ld.c cVar = null;
        try {
            dashBoard.v1().dismiss();
            if (p.o(logoutModle.getStatusCode(), "CTZN001", true)) {
                ld.c cVar2 = dashBoard.f8406c0;
                if (cVar2 == null) {
                    cm.l.v("langSession");
                    cVar2 = null;
                }
                dashBoard.I1(dashBoard, cVar2.b("logout_success", "You have been Successfully Logout"));
                dashBoard.startActivity(new Intent(dashBoard, SignInScreen.class));
                dashBoard.finish();
                try {
                    NaxpToKenService.f9438k.a(dashBoard);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else {
                ld.c cVar3 = dashBoard.f8406c0;
                if (cVar3 == null) {
                    cm.l.v("langSession");
                    cVar3 = null;
                }
                dashBoard.I1(dashBoard, cVar3.b("label_went_wrong", "Unable to Logout, Please try after some time"));
            }
        } catch (Exception unused) {
            ld.c cVar4 = dashBoard.f8406c0;
            if (cVar4 == null) {
                cm.l.v("langSession");
            } else {
                cVar = cVar4;
            }
            dashBoard.I1(dashBoard, cVar.b("label_went_wrong", "Unable to Logout, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(DashBoard dashBoard, String str) {
        cm.l.f(dashBoard, "this$0");
        dashBoard.v1().dismiss();
        Log.e("Logout Error", str.toString());
        ld.c cVar = dashBoard.f8406c0;
        if (cVar == null) {
            cm.l.v("langSession");
            cVar = null;
        }
        dashBoard.I1(dashBoard, cVar.b("label_went_wrong", "Unable to Logout, Please try after some time"));
    }

    public final void I1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        this.f8404a0 = dialog;
        cm.l.c(dialog);
        dialog.setContentView(R.layout.msg_dialog);
        Dialog dialog2 = this.f8404a0;
        cm.l.c(dialog2);
        Window window = dialog2.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog3 = this.f8404a0;
        cm.l.c(dialog3);
        View findViewById = dialog3.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        Dialog dialog4 = this.f8404a0;
        cm.l.c(dialog4);
        View findViewById2 = dialog4.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        Dialog dialog5 = this.f8404a0;
        cm.l.c(dialog5);
        View findViewById3 = dialog5.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById3;
        ld.c cVar = this.f8406c0;
        ld.c cVar2 = null;
        if (cVar == null) {
            cm.l.v("langSession");
            cVar = null;
        }
        textView3.setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        ld.c cVar3 = this.f8406c0;
        if (cVar3 == null) {
            cm.l.v("langSession");
        } else {
            cVar2 = cVar3;
        }
        textView2.setText(cVar2.b("btn_ok", "OK"));
        textView.setText(str);
        textView2.setOnClickListener(new q(this));
        Dialog dialog6 = this.f8404a0;
        cm.l.c(dialog6);
        dialog6.show();
    }

    public final void K1(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.Q = databaseHelper;
    }

    public final void L1(qc.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.U = bVar;
    }

    public final void M1(UserBloodDetails userBloodDetails) {
        cm.l.f(userBloodDetails, "<set-?>");
        this.V = userBloodDetails;
    }

    public final void N1(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8405b0 = textView;
    }

    public final void O1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.X = progressDialog;
    }

    public final void Q1(g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.K = gVar;
    }

    public final void R1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.Y = hVar;
    }

    public final void S1(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.P = imageView;
    }

    public final void T1(Context context) {
        cm.l.f(context, "context");
        Intent intent = new Intent(context, DashBoard.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public boolean Z0() {
        k a10 = t0.a.a(this, R.id.nav_host_fragment);
        w0.d dVar = this.G;
        if (dVar == null) {
            cm.l.v("appBarConfiguration");
            dVar = null;
        }
        return w0.e.a(a10, dVar) || super.Z0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        k kVar;
        LinearLayout linearLayout;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dash_board);
        getWindow().addFlags(128);
        v9.d.f17494a.h(this);
        Q1(new g(this));
        this.f8406c0 = new ld.c(this);
        View findViewById = findViewById(R.id.toolbar);
        cm.l.e(findViewById, "findViewById(...)");
        this.H = (Toolbar) findViewById;
        View findViewById2 = findViewById(R.id.virtual_doc);
        cm.l.e(findViewById2, "findViewById(...)");
        this.L = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.home_layout);
        cm.l.e(findViewById3, "findViewById(...)");
        this.M = (LinearLayout) findViewById3;
        r1();
        View findViewById4 = findViewById(R.id.ll_payment_bottom);
        cm.l.e(findViewById4, "findViewById(...)");
        this.N = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.ll_setting);
        cm.l.e(findViewById5, "findViewById(...)");
        this.O = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.v_rc);
        cm.l.e(findViewById6, "findViewById(...)");
        S1((ImageView) findViewById6);
        View findViewById7 = findViewById(R.id.sos);
        cm.l.e(findViewById7, "findViewById(...)");
        this.R = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(R.id.notification);
        cm.l.e(findViewById8, "findViewById(...)");
        this.S = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(R.id.help);
        cm.l.e(findViewById9, "findViewById(...)");
        this.T = (LinearLayout) findViewById9;
        O1(new ProgressDialog(this));
        ProgressDialog v12 = v1();
        ld.c cVar = this.f8406c0;
        if (cVar == null) {
            cm.l.v("langSession");
            cVar = null;
        }
        v12.setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        M1(UserBloodDetails.f9372a.c(this));
        this.Z = SignService.f7644a.c(this);
        SignService signService = this.Z;
        if (signService == null) {
            cm.l.v("retrofitService");
            signService = null;
        }
        R1((h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(h.class));
        Toolbar toolbar = this.H;
        if (toolbar == null) {
            cm.l.v("toolbar");
            toolbar = null;
        }
        b1(toolbar);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            try {
                new SimpleDateFormat("dd-MM-yyyy").format(new Date()).equals(new ld.a(this).a());
            } catch (Exception unused) {
            }
        }
        L1((qc.b) new u0((x0) this, (u0.b) new qc.a(new pc.a(t1()))).a(qc.b.class));
        View findViewById10 = findViewById(R.id.tv_version);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById10).setText(getString(R.string.app_version));
        View findViewById11 = findViewById(R.id.nav_view);
        cm.l.d(findViewById11, "null cannot be cast to non-null type com.google.android.material.navigation.NavigationView");
        this.J = (NavigationView) findViewById11;
        View findViewById12 = findViewById(R.id.drawer_layout);
        cm.l.e(findViewById12, "findViewById(...)");
        this.I = (DrawerLayout) findViewById12;
        k a10 = t0.a.a(this, R.id.nav_host_fragment);
        NavigationView navigationView = this.J;
        if (navigationView == null) {
            cm.l.v("navigationView");
            navigationView = null;
        }
        Menu menu = navigationView.getMenu();
        cm.l.e(menu, "getMenu(...)");
        MenuItem findItem = menu.findItem(R.id.nav_profile);
        cm.l.e(findItem, "findItem(...)");
        MenuItem findItem2 = menu.findItem(R.id.nav_ts);
        cm.l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = menu.findItem(R.id.nav_docs);
        cm.l.e(findItem3, "findItem(...)");
        MenuItem findItem4 = menu.findItem(R.id.virtual_docs);
        cm.l.e(findItem4, "findItem(...)");
        MenuItem findItem5 = menu.findItem(R.id.nav_near);
        cm.l.e(findItem5, "findItem(...)");
        MenuItem findItem6 = menu.findItem(R.id.nav_help);
        cm.l.e(findItem6, "findItem(...)");
        String str = "findViewById(...)";
        MenuItem findItem7 = menu.findItem(R.id.nav_share);
        cm.l.e(findItem7, "findItem(...)");
        String str2 = "null cannot be cast to non-null type android.widget.TextView";
        MenuItem findItem8 = menu.findItem(R.id.nav_about);
        cm.l.e(findItem8, "findItem(...)");
        String str3 = "toolbar";
        MenuItem findItem9 = menu.findItem(R.id.setting);
        cm.l.e(findItem9, "findItem(...)");
        String str4 = "navigationView";
        MenuItem findItem10 = menu.findItem(R.id.nav_logout);
        cm.l.e(findItem10, "findItem(...)");
        k kVar2 = a10;
        MenuItem findItem11 = menu.findItem(R.id.language);
        cm.l.e(findItem11, "findItem(...)");
        MenuItem findItem12 = menu.findItem(R.id.privacy_policy);
        cm.l.e(findItem12, "findItem(...)");
        ld.c cVar2 = this.f8406c0;
        if (cVar2 == null) {
            cm.l.v("langSession");
            cVar2 = null;
        }
        MenuItem menuItem = findItem11;
        findItem.setTitle(cVar2.b("my_profile", "My Profile"));
        ld.c cVar3 = this.f8406c0;
        if (cVar3 == null) {
            cm.l.v("langSession");
            cVar3 = null;
        }
        findItem2.setTitle(cVar3.b("label_transport_services", getString(R.string.transport_service)));
        ld.c cVar4 = this.f8406c0;
        if (cVar4 == null) {
            cm.l.v("langSession");
            cVar4 = null;
        }
        findItem3.setTitle(cVar4.b("txt_md", getString(R.string.txt_md)));
        ld.c cVar5 = this.f8406c0;
        if (cVar5 == null) {
            cm.l.v("langSession");
            cVar5 = null;
        }
        findItem4.setTitle(cVar5.b("label_virtual_documents", getString(R.string.virtual_documents)));
        ld.c cVar6 = this.f8406c0;
        if (cVar6 == null) {
            cm.l.v("langSession");
            cVar6 = null;
        }
        findItem5.setTitle(cVar6.b("near_by", getString(R.string.near_by)));
        ld.c cVar7 = this.f8406c0;
        if (cVar7 == null) {
            cm.l.v("langSession");
            cVar7 = null;
        }
        findItem6.setTitle(cVar7.b("label_help_support", getString(R.string.menu_help)));
        ld.c cVar8 = this.f8406c0;
        if (cVar8 == null) {
            cm.l.v("langSession");
            cVar8 = null;
        }
        findItem7.setTitle(cVar8.b("label_share", getString(R.string.menu_share)));
        ld.c cVar9 = this.f8406c0;
        if (cVar9 == null) {
            cm.l.v("langSession");
            cVar9 = null;
        }
        findItem8.setTitle(cVar9.b("label_about_us", getString(R.string.about)));
        ld.c cVar10 = this.f8406c0;
        if (cVar10 == null) {
            cm.l.v("langSession");
            cVar10 = null;
        }
        findItem9.setTitle(cVar10.b("label_setting", getString(R.string.settings)));
        ld.c cVar11 = this.f8406c0;
        if (cVar11 == null) {
            cm.l.v("langSession");
            cVar11 = null;
        }
        findItem12.setTitle(cVar11.b("privacy", getString(R.string.privacy)));
        ld.c cVar12 = this.f8406c0;
        if (cVar12 == null) {
            cm.l.v("langSession");
            cVar12 = null;
        }
        findItem10.setTitle(cVar12.b("log_out", getString(R.string.log_out)));
        ld.c cVar13 = this.f8406c0;
        if (cVar13 == null) {
            cm.l.v("langSession");
            cVar13 = null;
        }
        menuItem.setTitle(cVar13.b("language", "Language"));
        Set g10 = q0.g(Integer.valueOf(R.id.nav_home), Integer.valueOf(R.id.nav_profile), Integer.valueOf(R.id.nav_ts), Integer.valueOf(R.id.nav_docs), Integer.valueOf(R.id.virtual_docs), Integer.valueOf(R.id.nav_near), Integer.valueOf(R.id.nav_help), Integer.valueOf(R.id.nav_share), Integer.valueOf(R.id.nav_about), Integer.valueOf(R.id.language), Integer.valueOf(R.id.setting), Integer.valueOf(R.id.privacy_policy), Integer.valueOf(R.id.nav_logout));
        DrawerLayout drawerLayout = this.I;
        if (drawerLayout == null) {
            cm.l.v("drawerLayout");
            drawerLayout = null;
        }
        w0.d a11 = new d.a(g10).c(drawerLayout).b(new a0(a.f8412e)).a();
        this.G = a11;
        if (a11 == null) {
            cm.l.v("appBarConfiguration");
            kVar = kVar2;
            a11 = null;
        } else {
            kVar = kVar2;
        }
        w0.c.a(this, kVar, a11);
        NavigationView navigationView2 = this.J;
        if (navigationView2 == null) {
            cm.l.v(str4);
            navigationView2 = null;
        }
        w0.h.a(navigationView2, kVar);
        Toolbar toolbar2 = this.H;
        if (toolbar2 == null) {
            cm.l.v(str3);
            toolbar2 = null;
        }
        toolbar2.setNavigationIcon((int) R.drawable.side_menu);
        Drawable e10 = androidx.core.content.a.e(getApplicationContext(), R.drawable.mvvm_alarm);
        Toolbar toolbar3 = this.H;
        if (toolbar3 == null) {
            cm.l.v(str3);
            toolbar3 = null;
        }
        toolbar3.setOverflowIcon(e10);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        K1(A0);
        NavigationView navigationView3 = this.J;
        if (navigationView3 == null) {
            cm.l.v(str4);
            navigationView3 = null;
        }
        View m10 = navigationView3.m(0);
        cm.l.e(m10, "getHeaderView(...)");
        View findViewById13 = m10.findViewById(R.id.full_name);
        String str5 = str2;
        cm.l.d(findViewById13, str5);
        TextView textView = (TextView) findViewById13;
        View findViewById14 = m10.findViewById(R.id.mobile_number);
        cm.l.d(findViewById14, str5);
        N1((TextView) findViewById14);
        View findViewById15 = m10.findViewById(R.id.imageView);
        cm.l.e(findViewById15, str);
        this.W = (CircleImageView) findViewById15;
        if (getApplicationContext() != null) {
            s1().k().g(this, new d(new b(this)));
            x xVar = x.f30437a;
        }
        if (getApplicationContext() != null) {
            s1().h().g(this, new d(new c(this)));
            x xVar2 = x.f30437a;
        }
        if (w1().t()) {
            if (w1().l().toString() != null) {
                textView.setText("+91 " + w1().l());
            }
            if (w1().n().toString() != null) {
                u1().setText(w1().n().toString());
            }
        }
        LinearLayout linearLayout2 = this.R;
        if (linearLayout2 == null) {
            cm.l.v("sos");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new p(this));
        LinearLayout linearLayout3 = this.S;
        if (linearLayout3 == null) {
            cm.l.v("notification");
            linearLayout3 = null;
        }
        linearLayout3.setOnClickListener(new r(this));
        LinearLayout linearLayout4 = this.M;
        if (linearLayout4 == null) {
            cm.l.v("home_layout");
            linearLayout4 = null;
        }
        linearLayout4.setOnClickListener(new s(this));
        LinearLayout linearLayout5 = this.O;
        if (linearLayout5 == null) {
            cm.l.v("ll_setting");
            linearLayout5 = null;
        }
        linearLayout5.setOnClickListener(new t(this));
        LinearLayout linearLayout6 = this.T;
        if (linearLayout6 == null) {
            cm.l.v("help");
            linearLayout6 = null;
        }
        linearLayout6.setOnClickListener(new u(this));
        NavigationView navigationView4 = this.J;
        if (navigationView4 == null) {
            cm.l.v(str4);
            navigationView4 = null;
        }
        navigationView4.setNavigationItemSelectedListener(new v(this));
        LinearLayout linearLayout7 = this.L;
        if (linearLayout7 == null) {
            cm.l.v("virtual_doc");
            linearLayout7 = null;
        }
        linearLayout7.setOnClickListener(new w(this));
        LinearLayout linearLayout8 = this.N;
        if (linearLayout8 == null) {
            cm.l.v("ll_payment_bottom");
            linearLayout = null;
        } else {
            linearLayout = linearLayout8;
        }
        linearLayout.setOnClickListener(new sa.x(this));
        x1().E().g(this, new y(this));
        x1().D().g(this, new z(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Dialog dialog = this.f8404a0;
        if (dialog != null) {
            cm.l.c(dialog);
            if (dialog.isShowing()) {
                Dialog dialog2 = this.f8404a0;
                cm.l.c(dialog2);
                dialog2.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                NaxpToKenService.f9438k.a(this);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (w1().n().toString() != null) {
            u1().setText(w1().n().toString());
        }
        if (!ka.c.f13158a.m(w1().p()) && !cm.l.a(w1().p(), "0")) {
            P1();
        }
    }

    public final qc.b s1() {
        qc.b bVar = this.U;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails t1() {
        UserBloodDetails userBloodDetails = this.V;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        cm.l.v("mUserService");
        return null;
    }

    public final TextView u1() {
        TextView textView = this.f8405b0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("mobile_number");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.X;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final g w1() {
        g gVar = this.K;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("Sessionmanger");
        return null;
    }

    public final h x1() {
        h hVar = this.Y;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
