package v9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.app.b;
import cm.g;
import cm.l;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Welcome.SplashScreen;
import hn.a;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import ld.c;
import um.w;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17494a = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f17495b = "english";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f17496c = "Unauthorized";
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f17497d = "401";
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f17498e = "eChallan(MORTH)";
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f17499f = "IntentFlag";
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f17500g = 1;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f17501h = 2;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f17502i = "E";
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f17503j = "V";
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String f17504k = "Vahan";
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String f17505l = "NextGen";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f17506m = "Sarathi";
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String f17507n = "504";
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final String f17508o = "Connection Time Out";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void E(Dialog dialog, int i10, Context context, View view) {
            Intent intent;
            l.f(dialog, "$d");
            dialog.dismiss();
            if (i10 == 1) {
                intent = new Intent(context, SignInScreen.class);
            } else {
                ld.g gVar = new ld.g(context);
                if (gVar.t()) {
                    gVar.u();
                    DatabaseHelper A0 = DatabaseHelper.A0(context);
                    l.e(A0, "getInstance(...)");
                    A0.R();
                    A0.close();
                    new ld.a(context).e();
                    NaxpToKenService.f9438k.a(context);
                    intent = new Intent(context, SplashScreen.class);
                } else {
                    return;
                }
            }
            context.startActivity(intent);
            l.d(context, "null cannot be cast to non-null type android.app.Activity");
            b.p((Activity) context);
        }

        /* access modifiers changed from: private */
        public static final void f(Context context, DialogInterface dialogInterface, int i10) {
            Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            if (context != null) {
                context.startActivity(intent);
            }
        }

        /* access modifiers changed from: private */
        public static final void i(Context context, DialogInterface dialogInterface, int i10) {
            l.d(context, "null cannot be cast to non-null type android.app.Activity");
            b.p((Activity) context);
        }

        public final boolean A(Context context) {
            return false;
        }

        public final boolean B(String str, String str2) {
            l.f(str, "mPin");
            l.f(str2, "oldMin");
            try {
                Log.e("Calling", "1");
                return Integer.parseInt(str) == Integer.parseInt(str2);
            } catch (Exception | NumberFormatException unused) {
            }
        }

        public final boolean C(String str) {
            l.f(str, "mPin");
            StringBuilder sb2 = new StringBuilder(str);
            sb2.reverse();
            int parseInt = Integer.parseInt(str);
            String sb3 = sb2.toString();
            l.e(sb3, "toString(...)");
            return parseInt == Integer.parseInt(sb3);
        }

        public final void D(Context context, String str, int i10) {
            l.c(context);
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.msg_dialog);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.pop_up_msg);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(str);
            ((TextView) findViewById2).setOnClickListener(new a(dialog, i10, context));
            dialog.show();
        }

        public final w d() {
            return new hn.a((a.b) null, 1, (g) null).d(a.C0302a.NONE);
        }

        public final void e(Context context, String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(str).setCancelable(false).setPositiveButton("Okay", new b(context));
            AlertDialog create = builder.create();
            create.setTitle("NextGen mParivahan\n");
            create.show();
        }

        public final String g(String str) {
            l.f(str, "timeStampValue");
            try {
                long parseLong = Long.parseLong(str);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = simpleDateFormat2.parse(simpleDateFormat.format(new Date(parseLong)));
                l.d(parse, "null cannot be cast to non-null type java.util.Date");
                String format = simpleDateFormat2.format(parse);
                l.c(format);
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
                return str.toString();
            }
        }

        public final void h(Context context) {
            String str = Build.MODEL;
            String str2 = Build.PRODUCT;
            String str3 = null;
            if (str2 != null && (l.a(str2, "sdk") || q.F(str2, "_sdk", false, 2, (Object) null) || q.F(str2, "sdk_", false, 2, (Object) null))) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("It seems device is virtual, Please proceed with real device.").setCancelable(false).setPositiveButton("Okay", new c(context));
                AlertDialog create = builder.create();
                create.setTitle("Information");
                create.show();
            } else if (A(context)) {
                if (context != null) {
                    str3 = context.getString(R.string.usbdebug);
                }
                e(context, str3);
            }
        }

        public final String j() {
            return d.f17495b;
        }

        public final String k() {
            return d.f17502i;
        }

        public final String l() {
            return d.f17498e;
        }

        public final String m() {
            try {
                String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                l.e(format, "format(...)");
                return format;
            } catch (Exception e10) {
                e10.printStackTrace();
                return " ";
            }
        }

        public final int n() {
            return d.f17500g;
        }

        public final String o() {
            return d.f17499f;
        }

        public final int p() {
            return d.f17501h;
        }

        public final String q(Context context) {
            return String.valueOf(new c(context).d());
        }

        public final String r() {
            return d.f17503j;
        }

        public final String s() {
            return d.f17505l;
        }

        public final String t() {
            return d.f17506m;
        }

        public final String u() {
            return d.f17497d;
        }

        public final String v() {
            return d.f17507n;
        }

        public final String w() {
            return d.f17508o;
        }

        public final String x(String str) {
            l.f(str, "stateName");
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Andaman and Nicobar Islands", "AN");
                hashMap.put("Andhra Pradesh", "AP");
                hashMap.put("Arunachal Pradesh", "AR");
                hashMap.put("Assam", "AS");
                hashMap.put("Bihar", "BR");
                hashMap.put("Chandigarh", "CH");
                hashMap.put("Chhattisgarh", "CG");
                hashMap.put("Dadra and Nagar Haveli", "DH");
                hashMap.put("Daman and Diu", "DD");
                hashMap.put("Delhi", "DL");
                hashMap.put("New Delhi", "DL");
                hashMap.put("Goa", "GA");
                hashMap.put("Gujarat", "GJ");
                hashMap.put("Haryana", "HR");
                hashMap.put("Himachal Pradesh", "HR");
                hashMap.put("Jammu and Kashmir", "JK");
                hashMap.put("Jharkhand", "JH");
                hashMap.put("Karnataka", "KA");
                hashMap.put("Kerala", "KL");
                hashMap.put("Lakshadweep", "LD");
                hashMap.put("Madhya Pradesh", "MP");
                hashMap.put("Maharashtra", "MH");
                hashMap.put("Manipur", "MN");
                hashMap.put("Meghalaya", "ML");
                hashMap.put("Mizoram", "MZ");
                hashMap.put("Nagaland", "NL");
                hashMap.put("Odisha", "OR");
                hashMap.put("odisha", "OR");
                hashMap.put("Puducherry", "PY");
                hashMap.put("Punjab", "PB");
                hashMap.put("Rajasthan", "RJ");
                hashMap.put("Sikkim", "SK");
                hashMap.put("Tamil Nadu", "TN");
                hashMap.put("Telangana", "TS");
                hashMap.put("Tripura", "TR");
                hashMap.put("Uttarakhand", "UK");
                hashMap.put("Uttar Pradesh", "UP");
                hashMap.put("West Bengal", "WB");
                return String.valueOf(hashMap.get(str));
            } catch (Exception unused) {
                return "NA";
            }
        }

        public final String y() {
            return d.f17496c;
        }

        public final String z() {
            return d.f17504k;
        }
    }
}
