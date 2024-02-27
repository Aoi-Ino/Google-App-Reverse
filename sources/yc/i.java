package yc;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import km.f;
import ld.c;
import v8.h;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18692a = new a((g) null);

    public static final class a {

        /* renamed from: yc.i$a$a  reason: collision with other inner class name */
        public static final class C0246a extends CountDownTimer {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f18693a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f18694b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f18695c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ TextView f18696d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0246a(TextView textView, u uVar, Context context, TextView textView2) {
                super(30000, 1000);
                this.f18693a = textView;
                this.f18694b = uVar;
                this.f18695c = context;
                this.f18696d = textView2;
            }

            public void onFinish() {
                this.f18696d.setVisibility(0);
                this.f18693a.setText("0");
                this.f18693a.setVisibility(8);
            }

            public void onTick(long j10) {
                TextView textView = this.f18693a;
                textView.setText(((c) this.f18694b.f20234e).b("time_remaining", this.f18695c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
                this.f18696d.setVisibility(8);
                this.f18693a.setVisibility(0);
            }
        }

        public static final class b extends CountDownTimer {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TextView f18697a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f18698b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f18699c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ TextView f18700d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(TextView textView, u uVar, Context context, TextView textView2) {
                super(30000, 1000);
                this.f18697a = textView;
                this.f18698b = uVar;
                this.f18699c = context;
                this.f18700d = textView2;
            }

            public void onFinish() {
                this.f18700d.setVisibility(0);
                this.f18697a.setText("0");
                this.f18697a.setVisibility(8);
            }

            public void onTick(long j10) {
                TextView textView = this.f18697a;
                textView.setText(((c) this.f18698b.f20234e).b("time_remaining", this.f18699c.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
                this.f18700d.setVisibility(8);
                this.f18697a.setVisibility(0);
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void j(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void k(Dialog dialog, Context context, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
            context.startActivity(new Intent(context, VahanUpdateMobiActivity.class));
        }

        /* access modifiers changed from: private */
        public static final void n(EditText editText, ImageView imageView, View view) {
            TransformationMethod instance;
            l.f(editText, "$enterOtp");
            l.f(imageView, "$shownPin");
            if (editText.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                imageView.setImageResource(R.drawable.pass_visible);
                instance = HideReturnsTransformationMethod.getInstance();
            } else {
                imageView.setImageResource(R.drawable.mvvm_visibility);
                instance = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(instance);
        }

        /* access modifiers changed from: private */
        public static final void o(ProgressDialog progressDialog, h hVar, String str, TextView textView, u uVar, Context context, TextView textView2, View view) {
            l.f(progressDialog, "$pDialog");
            l.f(hVar, "$viewModel");
            l.f(str, "$otpid");
            l.f(textView, "$time_text");
            l.f(uVar, "$langSession");
            l.f(context, "$context");
            l.f(textView2, "$resendOtp");
            new b(textView, uVar, context, textView2).start();
            progressDialog.show();
            hVar.w(str);
        }

        /* access modifiers changed from: private */
        public static final void p(EditText editText, Context context, u uVar, Activity activity, ProgressDialog progressDialog, h hVar, String str, String str2, String str3, String str4, View view) {
            String b10;
            Context context2 = context;
            u uVar2 = uVar;
            Activity activity2 = activity;
            EditText editText2 = editText;
            l.f(editText, "$enterOtp");
            l.f(context, "$context");
            l.f(uVar, "$langSession");
            l.f(activity2, "$activity");
            l.f(progressDialog, "$pDialog");
            l.f(hVar, "$viewModel");
            l.f(str, "$otpid");
            l.f(str2, "$rc");
            l.f(str3, "$docType");
            l.f(str4, "$dob");
            String obj = editText.getText().toString();
            if (obj.length() == 0) {
                b10 = ((c) uVar2.f20234e).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp));
            } else if (obj.length() < 6) {
                b10 = ((c) uVar2.f20234e).b("label_log_entr_val_otp", "Please enter the valid OTP");
            } else {
                ka.c.f13158a.l(activity2);
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
                progressDialog.show();
                hVar.F(obj, str, str2, str3, str4, context);
                return;
            }
            Toast.makeText(context, b10, 0).show();
        }

        /* access modifiers changed from: private */
        public static final void q(EditText editText, View view) {
            l.f(editText, "$enterOtp");
            editText.setText("");
        }

        /* access modifiers changed from: private */
        public static final void r(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        /* access modifiers changed from: private */
        public static final void s(Dialog dialog, Context context, View view) {
            l.f(dialog, "$d");
            l.f(context, "$context");
            dialog.dismiss();
            context.startActivity(new Intent(context, VahanUpdateMobiActivity.class));
        }

        public final void i(Context context, String str) {
            l.c(context);
            Dialog dialog = new Dialog(context);
            c cVar = new c(context);
            dialog.setContentView(R.layout.messagedig);
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.pop_up_msg);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = dialog.findViewById(R.id.close);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById3;
            View findViewById4 = dialog.findViewById(R.id.tv_title);
            l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            textView.setText(cVar.b("update_Mobile_No", "Update Mobile No"));
            textView2.setText(cVar.b("btn_dl_serv_close", "Close"));
            ((TextView) findViewById).setText(str);
            textView2.setOnClickListener(new a(dialog));
            textView.setOnClickListener(new b(dialog, context));
            dialog.show();
        }

        public final int l(Context context, NrvDetails nrvDetails) {
            l.f(context, "context");
            l.f(nrvDetails, "searchNrvDetails");
            try {
                DatabaseHelper A0 = DatabaseHelper.A0(context);
                l.e(A0, "getInstance(...)");
                NrvDetails C0 = A0.C0(nrvDetails.getRc_regn_no());
                l.e(C0, "getRCDetails(...)");
                String rc_tax_upto = nrvDetails.getRc_tax_upto();
                String rc_insurance_upto = nrvDetails.getRc_insurance_upto();
                NrvDetails nrvDetails2 = C0;
                NrvDetails copy$default = NrvDetails.copy$default(nrvDetails2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, nrvDetails.getRc_fit_upto(), (String) null, (String) null, (String) null, (String) null, (String) null, rc_insurance_upto, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, nrvDetails.getRc_np_upto(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, nrvDetails.getRc_permit_valid_upto(), (String) null, (String) null, nrvDetails.getRc_pucc_upto(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, rc_tax_upto, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -133121, -33591305, 3, (Object) null);
                int R0 = A0.R0(copy$default.getRc_regn_no(), copy$default);
                if (R0 > 0) {
                    return R0;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        public final Dialog m(Activity activity, Context context, String str, h hVar, String str2, String str3, String str4, String str5, ProgressDialog progressDialog) {
            Context context2 = context;
            String str6 = str;
            String str7 = str4;
            l.f(activity, "activity");
            l.f(context2, "context");
            l.f(str6, "mobile_no");
            l.f(hVar, "viewModel");
            l.f(str2, "otpid");
            l.f(str3, "rc");
            l.f(str7, "docType");
            l.f(str5, "dob");
            l.f(progressDialog, "pDialog");
            Dialog dialog = new Dialog(context2);
            u uVar = new u();
            uVar.f20234e = new c(context2);
            dialog.setContentView(R.layout.validateforotpscreen);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.show();
            View findViewById = dialog.findViewById(R.id.pop_up_close);
            l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View findViewById2 = dialog.findViewById(R.id.resendOtp);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = dialog.findViewById(R.id.showmpin);
            l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
            View findViewById4 = dialog.findViewById(R.id.submitOtp);
            l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById4;
            ImageView imageView = (ImageView) findViewById;
            View findViewById5 = dialog.findViewById(R.id.enterOtp);
            l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
            EditText editText = (EditText) findViewById5;
            View findViewById6 = dialog.findViewById(R.id.time_text);
            l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById7 = dialog.findViewById(R.id.txt_reset);
            l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) findViewById7;
            View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
            l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView4 = (TextView) findViewById8;
            View findViewById9 = dialog.findViewById(R.id.disPlay);
            l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById10 = dialog.findViewById(R.id.enter_otp_txt);
            l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById11 = dialog.findViewById(R.id.update_mob);
            l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView5 = (TextView) findViewById11;
            ImageView imageView2 = (ImageView) findViewById3;
            View findViewById12 = dialog.findViewById(R.id.note_text);
            l.d(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView6 = (TextView) findViewById12;
            Dialog dialog2 = dialog;
            TextView textView7 = (TextView) findViewById6;
            ((TextView) findViewById10).setText(((c) uVar.f20234e).b("edit_enter_otp", context2.getString(R.string.enter_otp)));
            ((TextView) findViewById9).setText(((c) uVar.f20234e).b("otp_verification", context2.getString(R.string.otp_verification)));
            textView2.setText(((c) uVar.f20234e).b("vahan_btn_submit", context2.getString(R.string.submit)));
            textView3.setText(((c) uVar.f20234e).b("btn_reset", context2.getString(R.string.reset)));
            textView.setText(((c) uVar.f20234e).b("label_resend_otp", context2.getString(R.string.resend_otp)));
            editText.setHint(((c) uVar.f20234e).b("edit_enter_otp", context2.getString(R.string.enter_otp)));
            if (str7.equals("RC")) {
                textView5.setText(((c) uVar.f20234e).b("update_Mobile_No", context2.getString(R.string.update2)));
                textView6.setText(((c) uVar.f20234e).b("mobile_number_is_added", context2.getString(R.string.mobile_correct_added)));
            } else {
                textView5.setVisibility(8);
                textView6.setVisibility(8);
            }
            int length = str.length();
            String str8 = "";
            for (int i10 = 0; i10 < length; i10++) {
                str6.charAt(i10);
                str8 = new f("\\d(?=\\d{4})").b(new f("[^0-9]").b(str6, ""), "X");
            }
            textView4.setText(((c) uVar.f20234e).b("label_otp_sent_to_mobile", context2.getString(R.string.otp_sent)) + "\n+91 " + str8);
            TextView textView8 = textView7;
            new C0246a(textView8, uVar, context2, textView).start();
            ImageView imageView3 = imageView2;
            imageView3.setOnClickListener(new c(editText, imageView3));
            TextView textView9 = textView;
            ImageView imageView4 = imageView;
            TextView textView10 = textView5;
            Dialog dialog3 = dialog2;
            textView9.setOnClickListener(new d(progressDialog, hVar, str2, textView8, uVar, context, textView9));
            ImageView imageView5 = imageView4;
            TextView textView11 = textView3;
            textView2.setOnClickListener(new e(editText, context, uVar, activity, progressDialog, hVar, str2, str3, str4, str5));
            textView11.setOnClickListener(new f(editText));
            imageView5.setOnClickListener(new g(dialog3));
            textView10.setOnClickListener(new h(dialog3, context));
            return dialog3;
        }
    }
}
