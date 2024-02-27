package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.u;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLWDLModel.BioObj;
import com.nic.mparivahan.Dl.DLWDLModel.DLServiceModelForRecentSear;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.ViewRcChallanActivity;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import de.hdodenhof.circleimageview.CircleImageView;
import j$.util.Base64;
import java.util.Calendar;
import ka.c;
import m8.k;
import ni.c8;
import org.json.JSONObject;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ua.a2;
import ua.b2;
import ua.c2;
import ua.d2;
import ua.e2;
import ua.f2;
import ua.g2;
import ua.h2;
import ua.i2;
import ua.j2;
import ua.k2;
import ua.l2;
import ua.m2;
import ua.n2;
import ua.o2;
import ua.p2;
import ua.q2;
import ua.s1;
import ua.t1;
import ua.u1;
import ua.v1;
import ua.w1;
import ua.x1;
import ua.y1;
import ua.z1;
import um.c0;
import v9.e;
import xa.a;

public final class SearchDL extends androidx.appcompat.app.d implements wa.c {
    public za.a G;
    public DlService H;
    public ProgressDialog I;
    public Context J;
    public LinearLayout K;
    public cd.a L;
    private RcImpoundService M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public LinearLayout V;
    public CircleImageView W;
    public String X;
    public String Y;
    public DatabaseHelper Z;

    /* renamed from: a0  reason: collision with root package name */
    public LinearLayout f8657a0;

    /* renamed from: b0  reason: collision with root package name */
    public LinearLayout f8658b0;

    /* renamed from: c0  reason: collision with root package name */
    private Calendar f8659c0 = Calendar.getInstance();

    /* renamed from: d0  reason: collision with root package name */
    public ld.g f8660d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f8661e0;

    /* renamed from: f0  reason: collision with root package name */
    public DldetobjX f8662f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f8663g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f8664h0;

    /* renamed from: i0  reason: collision with root package name */
    private c8 f8665i0;

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f8666j0;

    /* renamed from: k0  reason: collision with root package name */
    public v8.h f8667k0;

    /* renamed from: l0  reason: collision with root package name */
    private SignService f8668l0;

    /* renamed from: m0  reason: collision with root package name */
    private Dialog f8669m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f8670n0;

    /* renamed from: o0  reason: collision with root package name */
    public LinearLayout f8671o0;

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f8672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchDL f8673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f8674c;

        a(u uVar, SearchDL searchDL, String str) {
            this.f8672a = uVar;
            this.f8673b = searchDL;
            this.f8674c = str;
        }

        public void onFailure(Call call, Throwable th2) {
            cm.l.f(call, "call");
            this.f8673b.b2().dismiss();
        }

        public void onResponse(Call call, Response response) {
            String a10;
            cm.l.f(call, "call");
            cm.l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    k.a aVar = m8.k.f13877a;
                    String str2 = (String) this.f8672a.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    cm.l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    k.a aVar2 = m8.k.f13877a;
                    String str3 = (String) this.f8672a.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    cm.l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), DLServiceModelForRecentSear.class);
                cm.l.e(j10, "fromJson(...)");
                DLServiceModelForRecentSear dLServiceModelForRecentSear = (DLServiceModelForRecentSear) j10;
                if (dLServiceModelForRecentSear.getErrorcd() == 1) {
                    za.a Y1 = this.f8673b.Y1();
                    String str4 = this.f8674c;
                    BioObj bioObj = dLServiceModelForRecentSear.getBioObj();
                    if (bioObj != null) {
                        str = bioObj.getBioDob();
                    }
                    Y1.g(str4, String.valueOf(str), this.f8673b.W1());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8675e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchDL searchDL) {
            super(1);
            this.f8675e = searchDL;
        }

        public final void b(ResendOtp resendOtp) {
            Toast makeText;
            this.f8675e.b2().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    SearchDL searchDL = this.f8675e;
                    makeText = Toast.makeText(searchDL, searchDL.d2().b("label_log_resend_otp", "We have resent the OTP to your Mobile Number"), 1);
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    makeText = Toast.makeText(this.f8675e, resendOtp.getStatusDesc(), 1);
                } else {
                    this.f8675e.b2().dismiss();
                    SearchDL searchDL2 = this.f8675e;
                    searchDL2.N2(searchDL2, searchDL2.d2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                    return;
                }
                makeText.show();
            } catch (Exception unused) {
                this.f8675e.b2().dismiss();
                SearchDL searchDL3 = this.f8675e;
                searchDL3.N2(searchDL3, searchDL3.d2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchDL searchDL) {
            super(1);
            this.f8676e = searchDL;
        }

        public final void b(String str) {
            this.f8676e.b2().dismiss();
            SearchDL searchDL = this.f8676e;
            searchDL.N2(searchDL, searchDL.d2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8677e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchDL searchDL) {
            super(1);
            this.f8677e = searchDL;
        }

        public final void b(ImpoundDlSuccessModel impoundDlSuccessModel) {
            if (this.f8677e.b2().isShowing()) {
                this.f8677e.b2().dismiss();
            }
            try {
                int size = impoundDlSuccessModel.getResult().size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (p.o(impoundDlSuccessModel.getResult().get(i10).getImpound_type(), "document", true)) {
                        this.f8677e.o2().setVisibility(0);
                    }
                    boolean unused = p.o(impoundDlSuccessModel.getResult().get(i10).getImpound_type(), "vehicle", true);
                }
            } catch (Exception unused2) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ImpoundDlSuccessModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8678e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchDL searchDL) {
            super(1);
            this.f8678e = searchDL;
        }

        public final void b(String str) {
            if (this.f8678e.b2().isShowing()) {
                this.f8678e.b2().dismiss();
                this.f8678e.o2().setVisibility(8);
            }
            SearchDL searchDL = this.f8678e;
            searchDL.G2(searchDL, "No Vehicle or Seizure Document impound against the searched DL number.");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class f implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8679e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f8680f;

        f(SearchDL searchDL, k kVar) {
            this.f8679e = searchDL;
            this.f8680f = kVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f8679e.W1(), this.f8680f, this.f8679e.H1().get(1), this.f8679e.H1().get(2), this.f8679e.H1().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8681e;

        g(EditText editText) {
            this.f8681e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8681e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8682e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8683f;

        h(EditText editText, EditText editText2) {
            this.f8682e = editText;
            this.f8683f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8682e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8683f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 31) {
                    this.f8682e.setText("");
                }
            }
        }
    }

    public static final class i implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8684e;

        i(EditText editText) {
            this.f8684e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8684e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class j implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8685e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8686f;

        j(EditText editText, EditText editText2) {
            this.f8685e = editText;
            this.f8686f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8685e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8686f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 12) {
                    this.f8685e.setText("");
                }
            }
        }
    }

    public static final class k implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchDL f8687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f8688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f8689c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f8690d;

        k(SearchDL searchDL, EditText editText, EditText editText2, EditText editText3) {
            this.f8687a = searchDL;
            this.f8688b = editText;
            this.f8689c = editText2;
            this.f8690d = editText3;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f8687a.H1().set(1, i10);
            this.f8687a.H1().set(2, i11);
            this.f8687a.H1().set(5, i12);
            CharSequence format = DateFormat.format("dd", this.f8687a.H1().getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", this.f8687a.H1().getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", this.f8687a.H1().getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                this.f8688b.setText(str);
                this.f8689c.setText(str2);
                this.f8690d.setText(str3);
                this.f8688b.clearFocus();
                this.f8689c.clearFocus();
                this.f8690d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    public static final class l implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchDL f8691e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f8692f;

        l(SearchDL searchDL, q qVar) {
            this.f8691e = searchDL;
            this.f8692f = qVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f8691e.W1(), this.f8692f, this.f8691e.H1().get(1), this.f8691e.H1().get(2), this.f8691e.H1().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class m implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8693e;

        m(EditText editText) {
            this.f8693e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8693e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class n implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8694e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8695f;

        n(EditText editText, EditText editText2) {
            this.f8694e = editText;
            this.f8695f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8694e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8695f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 31) {
                    this.f8694e.setText("");
                }
            }
        }
    }

    public static final class o implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8696e;

        o(EditText editText) {
            this.f8696e = editText;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 2) {
                this.f8696e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class p implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8697e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8698f;

        p(EditText editText, EditText editText2) {
            this.f8697e = editText;
            this.f8698f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8697e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8698f.requestFocus();
            }
            String obj = charSequence.toString();
            int length = obj.length() - 1;
            int i13 = 0;
            boolean z10 = false;
            while (i13 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i13 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i13++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i13, length + 1).toString().length() == 2) {
                String obj2 = charSequence.toString();
                int length2 = obj2.length() - 1;
                int i14 = 0;
                boolean z12 = false;
                while (i14 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i14 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i14++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                int parseInt = Integer.parseInt(obj2.subSequence(i14, length2 + 1).toString());
                if (parseInt == 0 || parseInt > 12) {
                    this.f8697e.setText("");
                }
            }
        }
    }

    public static final class q implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchDL f8699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f8700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f8701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f8702d;

        q(SearchDL searchDL, EditText editText, EditText editText2, EditText editText3) {
            this.f8699a = searchDL;
            this.f8700b = editText;
            this.f8701c = editText2;
            this.f8702d = editText3;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f8699a.H1().set(1, i10);
            this.f8699a.H1().set(2, i11);
            this.f8699a.H1().set(5, i12);
            CharSequence format = DateFormat.format("dd", this.f8699a.H1().getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", this.f8699a.H1().getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", this.f8699a.H1().getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                this.f8700b.setText(str);
                this.f8701c.setText(str2);
                this.f8702d.setText(str3);
                this.f8700b.clearFocus();
                this.f8701c.clearFocus();
                this.f8702d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    static final class r implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8703a;

        r(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8703a = lVar;
        }

        public final pl.c a() {
            return this.f8703a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8703a.invoke(obj);
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
    public static final void A2(SearchDL searchDL, String str) {
        cm.l.f(searchDL, "this$0");
        Log.e("Test", str.toString());
        searchDL.b2().dismiss();
        Dialog dialog = searchDL.f8669m0;
        if (dialog != null) {
            cm.l.c(dialog);
            dialog.dismiss();
        }
        searchDL.N2(searchDL.W1(), searchDL.d2().b(v9.f.f17510a.J0(), "Unable to Create the Virtual DL, Please try after some time."));
    }

    /* access modifiers changed from: private */
    public static final boolean C2(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final boolean D2(EditText editText, EditText editText2, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(editText, "$dobMonth");
        cm.l.f(editText2, "$dobDate");
        if (i10 != 67 || editText.getText().length() != 0) {
            return false;
        }
        editText2.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, SearchDL searchDL, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(searchDL, "this$0");
        dialog.dismiss();
        searchDL.finish();
    }

    /* access modifiers changed from: private */
    public static final void F1(Dialog dialog, SearchDL searchDL, String str, DldetobjX dldetobjX, String str2, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(searchDL, "this$0");
        cm.l.f(dldetobjX, "$dlobj");
        dialog.dismiss();
        try {
            searchDL.J1().L0(str, dldetobjX, str2, z9.a.f18947a.g(dldetobjX.getBioObj().getBioDob().toString()));
            searchDL.startActivity(new Intent(searchDL, DLVirtualRcScreen.class));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void F2(SearchDL searchDL, EditText editText, EditText editText2, EditText editText3, Dialog dialog, View view) {
        cm.l.f(searchDL, "this$0");
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        searchDL.c3(new ProgressDialog(searchDL.W1()));
        searchDL.b2().setMessage("Please wait...");
        searchDL.b2().setCancelable(false);
        searchDL.b2().setCanceledOnTouchOutside(false);
        String obj = editText.getText().toString();
        int length = obj.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = cm.l.h(obj.charAt(!z10 ? i10 : length), 32) <= 0;
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
        if (obj.subSequence(i10, length + 1).toString().length() > 0) {
            String obj2 = editText2.getText().toString();
            int length2 = obj2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length2) {
                boolean z13 = cm.l.h(obj2.charAt(!z12 ? i11 : length2), 32) <= 0;
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
            if (obj2.subSequence(i11, length2 + 1).toString().length() > 0) {
                String obj3 = editText3.getText().toString();
                int length3 = obj3.length() - 1;
                int i12 = 0;
                boolean z14 = false;
                while (i12 <= length3) {
                    boolean z15 = cm.l.h(obj3.charAt(!z14 ? i12 : length3), 32) <= 0;
                    if (!z14) {
                        if (!z15) {
                            z14 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z15) {
                        break;
                    } else {
                        length3--;
                    }
                }
                if (obj3.subSequence(i12, length3 + 1).toString().length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String obj4 = editText.getText().toString();
                    int length4 = obj4.length() - 1;
                    int i13 = 0;
                    boolean z16 = false;
                    while (i13 <= length4) {
                        boolean z17 = cm.l.h(obj4.charAt(!z16 ? i13 : length4), 32) <= 0;
                        if (!z16) {
                            if (!z17) {
                                z16 = true;
                            } else {
                                i13++;
                            }
                        } else if (!z17) {
                            break;
                        } else {
                            length4--;
                        }
                    }
                    sb2.append(obj4.subSequence(i13, length4 + 1).toString());
                    sb2.append('-');
                    String obj5 = editText2.getText().toString();
                    int length5 = obj5.length() - 1;
                    int i14 = 0;
                    boolean z18 = false;
                    while (i14 <= length5) {
                        boolean z19 = cm.l.h(obj5.charAt(!z18 ? i14 : length5), 32) <= 0;
                        if (!z18) {
                            if (!z19) {
                                z18 = true;
                            } else {
                                i14++;
                            }
                        } else if (!z19) {
                            break;
                        } else {
                            length5--;
                        }
                    }
                    sb2.append(obj5.subSequence(i14, length5 + 1).toString());
                    sb2.append('-');
                    String obj6 = editText3.getText().toString();
                    int length6 = obj6.length() - 1;
                    int i15 = 0;
                    boolean z20 = false;
                    while (i15 <= length6) {
                        boolean z21 = cm.l.h(obj6.charAt(!z20 ? i15 : length6), 32) <= 0;
                        if (!z20) {
                            if (!z21) {
                                z20 = true;
                            } else {
                                i15++;
                            }
                        } else if (!z21) {
                            break;
                        } else {
                            length6--;
                        }
                    }
                    sb2.append(obj6.subSequence(i15, length6 + 1).toString());
                    String sb3 = sb2.toString();
                    dialog.dismiss();
                    searchDL.b2().show();
                    searchDL.Y1().k(searchDL.N1(), sb3, searchDL);
                    return;
                }
            }
        }
        Toast.makeText(searchDL, searchDL.d2().b("edit_dl_serv_dob", "Please enter the valid dob"), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final boolean J2(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final boolean K2(EditText editText, EditText editText2, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(editText, "$dobMonth");
        cm.l.f(editText2, "$dobDate");
        if (i10 != 67 || editText.getText().length() != 0) {
            return false;
        }
        editText2.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void L2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M2(String str, SearchDL searchDL, EditText editText, EditText editText2, EditText editText3, int i10, Dialog dialog, String str2, View view) {
        cm.l.f(searchDL, "this$0");
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        cm.l.f(str2, "$dl_number");
        if (str != null) {
            searchDL.c3(new ProgressDialog(searchDL.W1()));
            searchDL.b2().setMessage("Please wait...");
            searchDL.b2().setCancelable(false);
            searchDL.b2().setCanceledOnTouchOutside(false);
            String obj = editText.getText().toString();
            int length = obj.length() - 1;
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= length) {
                boolean z11 = cm.l.h(obj.charAt(!z10 ? i11 : length), 32) <= 0;
                if (!z10) {
                    if (!z11) {
                        z10 = true;
                    } else {
                        i11++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            if (obj.subSequence(i11, length + 1).toString().length() > 0) {
                String obj2 = editText2.getText().toString();
                int length2 = obj2.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length2) {
                    boolean z13 = cm.l.h(obj2.charAt(!z12 ? i12 : length2), 32) <= 0;
                    if (!z12) {
                        if (!z13) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z13) {
                        break;
                    } else {
                        length2--;
                    }
                }
                if (obj2.subSequence(i12, length2 + 1).toString().length() > 0) {
                    String obj3 = editText3.getText().toString();
                    int length3 = obj3.length() - 1;
                    int i13 = 0;
                    boolean z14 = false;
                    while (i13 <= length3) {
                        boolean z15 = cm.l.h(obj3.charAt(!z14 ? i13 : length3), 32) <= 0;
                        if (!z14) {
                            if (!z15) {
                                z14 = true;
                            } else {
                                i13++;
                            }
                        } else if (!z15) {
                            break;
                        } else {
                            length3--;
                        }
                    }
                    if (obj3.subSequence(i13, length3 + 1).toString().length() > 0) {
                        if (i10 == 1) {
                            StringBuilder sb2 = new StringBuilder();
                            String obj4 = editText.getText().toString();
                            int length4 = obj4.length() - 1;
                            int i14 = 0;
                            boolean z16 = false;
                            while (i14 <= length4) {
                                boolean z17 = cm.l.h(obj4.charAt(!z16 ? i14 : length4), 32) <= 0;
                                if (!z16) {
                                    if (!z17) {
                                        z16 = true;
                                    } else {
                                        i14++;
                                    }
                                } else if (!z17) {
                                    break;
                                } else {
                                    length4--;
                                }
                            }
                            sb2.append(obj4.subSequence(i14, length4 + 1).toString());
                            sb2.append('-');
                            String obj5 = editText2.getText().toString();
                            int length5 = obj5.length() - 1;
                            int i15 = 0;
                            boolean z18 = false;
                            while (i15 <= length5) {
                                boolean z19 = cm.l.h(obj5.charAt(!z18 ? i15 : length5), 32) <= 0;
                                if (!z18) {
                                    if (!z19) {
                                        z18 = true;
                                    } else {
                                        i15++;
                                    }
                                } else if (!z19) {
                                    break;
                                } else {
                                    length5--;
                                }
                            }
                            sb2.append(obj5.subSequence(i15, length5 + 1).toString());
                            sb2.append('-');
                            String obj6 = editText3.getText().toString();
                            int length6 = obj6.length() - 1;
                            int i16 = 0;
                            boolean z20 = false;
                            while (i16 <= length6) {
                                boolean z21 = cm.l.h(obj6.charAt(!z20 ? i16 : length6), 32) <= 0;
                                if (!z20) {
                                    if (!z21) {
                                        z20 = true;
                                    } else {
                                        i16++;
                                    }
                                } else if (!z21) {
                                    break;
                                } else {
                                    length6--;
                                }
                            }
                            sb2.append(obj6.subSequence(i16, length6 + 1).toString());
                            String sb3 = sb2.toString();
                            searchDL.Q2(z9.a.f18947a.b(q.B0(searchDL.K1()).toString()));
                            if (cm.l.a(sb3, searchDL.K1())) {
                                dialog.dismiss();
                                Intent intent = new Intent(searchDL, ViewRcChallanActivity.class);
                                intent.putExtra("rcNo", q.B0(str2).toString());
                                intent.putExtra("type", "DL");
                                searchDL.startActivity(intent);
                                return;
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            String obj7 = editText.getText().toString();
                            int length7 = obj7.length() - 1;
                            int i17 = 0;
                            boolean z22 = false;
                            while (i17 <= length7) {
                                boolean z23 = cm.l.h(obj7.charAt(!z22 ? i17 : length7), 32) <= 0;
                                if (!z22) {
                                    if (!z23) {
                                        z22 = true;
                                    } else {
                                        i17++;
                                    }
                                } else if (!z23) {
                                    break;
                                } else {
                                    length7--;
                                }
                            }
                            sb4.append(obj7.subSequence(i17, length7 + 1).toString());
                            sb4.append('-');
                            String obj8 = editText2.getText().toString();
                            int length8 = obj8.length() - 1;
                            int i18 = 0;
                            boolean z24 = false;
                            while (i18 <= length8) {
                                boolean z25 = cm.l.h(obj8.charAt(!z24 ? i18 : length8), 32) <= 0;
                                if (!z24) {
                                    if (!z25) {
                                        z24 = true;
                                    } else {
                                        i18++;
                                    }
                                } else if (!z25) {
                                    break;
                                } else {
                                    length8--;
                                }
                            }
                            sb4.append(obj8.subSequence(i18, length8 + 1).toString());
                            sb4.append('-');
                            String obj9 = editText3.getText().toString();
                            int length9 = obj9.length() - 1;
                            int i19 = 0;
                            boolean z26 = false;
                            while (i19 <= length9) {
                                boolean z27 = cm.l.h(obj9.charAt(!z26 ? i19 : length9), 32) <= 0;
                                if (!z26) {
                                    if (!z27) {
                                        z26 = true;
                                    } else {
                                        i19++;
                                    }
                                } else if (!z27) {
                                    break;
                                } else {
                                    length9--;
                                }
                            }
                            sb4.append(obj9.subSequence(i19, length9 + 1).toString());
                            String sb5 = sb4.toString();
                            searchDL.Q2(z9.a.f18947a.b(q.B0(searchDL.K1()).toString()));
                            if (cm.l.a(sb5, searchDL.K1())) {
                                dialog.dismiss();
                                searchDL.b2().show();
                                searchDL.q2().G(searchDL, searchDL.n2().l(), 2);
                                return;
                            }
                        }
                    }
                }
            }
            Toast.makeText(searchDL, searchDL.d2().b(v9.f.f17510a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void O2(Dialog dialog, SearchDL searchDL, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(searchDL, "this$0");
        dialog.dismiss();
        searchDL.finish();
    }

    private final void Q1() {
        View findViewById = findViewById(R.id.txt_dl_holder_name);
        cm.l.e(findViewById, "findViewById(...)");
        i3((TextView) findViewById);
        View findViewById2 = findViewById(R.id.txt_lic_auth);
        cm.l.e(findViewById2, "findViewById(...)");
        k3((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.txt_vehicle_class);
        cm.l.e(findViewById3, "findViewById(...)");
        n3((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.txt_lic_validity);
        cm.l.e(findViewById4, "findViewById(...)");
        m3((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.txt_lic_authority);
        cm.l.e(findViewById5, "findViewById(...)");
        l3((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.txt_dl_number);
        cm.l.e(findViewById6, "findViewById(...)");
        o3((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.txt_issue_date);
        cm.l.e(findViewById7, "findViewById(...)");
        j3((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.owner_image);
        cm.l.e(findViewById8, "findViewById(...)");
        b3((CircleImageView) findViewById8);
        View findViewById9 = findViewById(R.id.dl_layout);
        cm.l.e(findViewById9, "findViewById(...)");
        R2((LinearLayout) findViewById9);
        L1().setVisibility(4);
        View findViewById10 = findViewById(R.id.ll_create_dl);
        cm.l.e(findViewById10, "findViewById(...)");
        W2((LinearLayout) findViewById10);
        View findViewById11 = findViewById(R.id.viewChallanLl);
        cm.l.e(findViewById11, "findViewById(...)");
        r3((LinearLayout) findViewById11);
        View findViewById12 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById12, "findViewById(...)");
        a3((LinearLayout) findViewById12);
        View findViewById13 = findViewById(R.id.tv_tap_check_dl);
        cm.l.e(findViewById13, "findViewById(...)");
        f3((TextView) findViewById13);
        View findViewById14 = findViewById(R.id.vehicleImpoundLl);
        cm.l.e(findViewById14, "findViewById(...)");
        q3((LinearLayout) findViewById14);
        View findViewById15 = findViewById(R.id.transvalidity_tv);
        cm.l.e(findViewById15, "findViewById(...)");
        h3((TextView) findViewById15);
        View findViewById16 = findViewById(R.id.transport_layout);
        cm.l.e(findViewById16, "findViewById(...)");
        g3((LinearLayout) findViewById16);
        e2().setOnClickListener(new y1(this));
        Z1().setOnClickListener(new z1(this));
        V1().setOnClickListener(new a2(this));
        p2().setOnClickListener(new b2(this));
    }

    /* access modifiers changed from: private */
    public static final void R1(SearchDL searchDL, View view) {
        cm.l.f(searchDL, "this$0");
        try {
            if (searchDL.b2().isShowing()) {
                searchDL.b2().dismiss();
            }
            searchDL.b2().show();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dl_no", (Object) searchDL.M1());
            searchDL.c2().i(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void S1(SearchDL searchDL, View view) {
        cm.l.f(searchDL, "this$0");
        searchDL.finish();
    }

    /* access modifiers changed from: private */
    public static final void T1(SearchDL searchDL, View view) {
        cm.l.f(searchDL, "this$0");
        try {
            searchDL.I2(searchDL, "DL Verification", searchDL.M1(), 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(SearchDL searchDL, View view) {
        cm.l.f(searchDL, "this$0");
        try {
            String j02 = searchDL.J1().j0(searchDL.M1());
            cm.l.e(j02, "getDocIdByDL(...)");
            if (!j02.equals("0")) {
                Intent intent = new Intent(searchDL, ViewRcChallanActivity.class);
                intent.putExtra("rcNo", q.B0(searchDL.M1()).toString());
                intent.putExtra("type", "DL");
                searchDL.startActivity(intent);
                return;
            }
            searchDL.I2(searchDL, "Challan DL Verification", searchDL.M1(), 1);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0270 A[SYNTHETIC, Splitter:B:104:0x0270] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02de A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0310 A[Catch:{ Exception -> 0x03e9 }, LOOP:0: B:120:0x030e->B:121:0x0310, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0339 A[Catch:{ Exception -> 0x03e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x035f A[Catch:{ Exception -> 0x03e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0109 A[SYNTHETIC, Splitter:B:49:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0135 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a1 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b2 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01db A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ec A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0218 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0227 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0248 A[Catch:{ Exception -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r2(com.nic.mparivahan.Dl.SearchDL r14, com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel r15) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r14, r0)
            android.app.ProgressDialog r0 = r14.b2()
            r0.dismiss()
            r0 = 4
            int r1 = r15.getErrorcd()     // Catch:{ Exception -> 0x007c }
            r2 = 1
            r3 = 2
            r4 = 0
            r5 = 0
            if (r1 != r2) goto L_0x036f
            android.widget.LinearLayout r1 = r14.L1()     // Catch:{ Exception -> 0x007c }
            r1.setVisibility(r4)     // Catch:{ Exception -> 0x007c }
            android.widget.TextView r1 = r14.m2()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r2 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r2 = r2.getDlLicno()     // Catch:{ Exception -> 0x007c }
            r1.setText(r2)     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r1 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getBioDob()     // Catch:{ Exception -> 0x007c }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007c }
            r14.Q2(r1)     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getDlLicno()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007c }
            r14.S2(r1)     // Catch:{ Exception -> 0x007c }
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r2 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r2 = r2.getDlStatus()     // Catch:{ Exception -> 0x007c }
            boolean r2 = r1.m(r2)     // Catch:{ Exception -> 0x007c }
            java.lang.String r6 = "binding"
            if (r2 != 0) goto L_0x0089
            xa.a$a r2 = xa.a.f18250a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r7 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.getDlStatus()     // Catch:{ Exception -> 0x007c }
            ni.c8 r8 = r14.f8665i0     // Catch:{ Exception -> 0x007c }
            if (r8 != 0) goto L_0x007f
            cm.l.v(r6)     // Catch:{ Exception -> 0x007c }
            r8 = r5
            goto L_0x007f
        L_0x007c:
            r15 = move-exception
            goto L_0x03d8
        L_0x007f:
            android.widget.TextView r8 = r8.f25633b     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = "active"
            cm.l.e(r8, r9)     // Catch:{ Exception -> 0x007c }
            r2.d(r7, r8, r14)     // Catch:{ Exception -> 0x007c }
        L_0x0089:
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioImgObj r2 = r15.getBioImgObj()     // Catch:{ Exception -> 0x007c }
            if (r2 == 0) goto L_0x0094
            java.lang.String r2 = r2.getBiPhoto()     // Catch:{ Exception -> 0x007c }
            goto L_0x0095
        L_0x0094:
            r2 = r5
        L_0x0095:
            if (r2 == 0) goto L_0x00b6
            int r2 = r2.length()     // Catch:{ Exception -> 0x007c }
            if (r2 != 0) goto L_0x009e
            goto L_0x00b6
        L_0x009e:
            de.hdodenhof.circleimageview.CircleImageView r2 = r14.a2()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioImgObj r7 = r15.getBioImgObj()     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x00ad
            java.lang.String r7 = r7.getBiPhoto()     // Catch:{ Exception -> 0x007c }
            goto L_0x00ae
        L_0x00ad:
            r7 = r5
        L_0x00ae:
            android.graphics.Bitmap r7 = r14.G1(r7)     // Catch:{ Exception -> 0x007c }
            r2.setImageBitmap(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x00c0
        L_0x00b6:
            de.hdodenhof.circleimageview.CircleImageView r2 = r14.a2()     // Catch:{ Exception -> 0x007c }
            r7 = 2131231173(0x7f0801c5, float:1.807842E38)
            r2.setImageResource(r7)     // Catch:{ Exception -> 0x007c }
        L_0x00c0:
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r2 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            if (r2 == 0) goto L_0x00cb
            java.lang.String r2 = r2.getDlOldLicno()     // Catch:{ Exception -> 0x007c }
            goto L_0x00cc
        L_0x00cb:
            r2 = r5
        L_0x00cc:
            boolean r1 = r1.m(r2)     // Catch:{ Exception -> 0x007c }
            r2 = 8
            if (r1 != 0) goto L_0x00ee
            ni.c8 r1 = r14.f8665i0     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x00dc
            cm.l.v(r6)     // Catch:{ Exception -> 0x007c }
            r1 = r5
        L_0x00dc:
            com.nic.mparivahan.MyTextView r1 = r1.f25637f     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r7 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            if (r7 == 0) goto L_0x00e9
            java.lang.String r7 = r7.getDlOldLicno()     // Catch:{ Exception -> 0x007c }
            goto L_0x00ea
        L_0x00e9:
            r7 = r5
        L_0x00ea:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x00fb
        L_0x00ee:
            ni.c8 r1 = r14.f8665i0     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x00f6
            cm.l.v(r6)     // Catch:{ Exception -> 0x007c }
            r1 = r5
        L_0x00f6:
            android.widget.LinearLayout r1 = r1.f25635d     // Catch:{ Exception -> 0x007c }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x007c }
        L_0x00fb:
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = "bioFullName"
            boolean r1 = km.q.F(r1, r7, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = "NA"
            if (r1 == 0) goto L_0x0135
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r1 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getBioNatName()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x012d
            android.widget.TextView r1 = r14.h2()     // Catch:{ Exception -> 0x007c }
            xa.a$a r8 = xa.a.f18250a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r9 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r9.getBioNatName()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.b(r9)     // Catch:{ Exception -> 0x007c }
            r1.setText(r8)     // Catch:{ Exception -> 0x007c }
            goto L_0x013a
        L_0x012d:
            android.widget.TextView r1 = r14.h2()     // Catch:{ Exception -> 0x007c }
        L_0x0131:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x013a
        L_0x0135:
            android.widget.TextView r1 = r14.h2()     // Catch:{ Exception -> 0x007c }
            goto L_0x0131
        L_0x013a:
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = "dlRtoCode"
            boolean r1 = km.q.F(r1, r8, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0168
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getDlRtoCode()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0160
            android.widget.TextView r1 = r14.j2()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r8 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.getDlRtoCode()     // Catch:{ Exception -> 0x007c }
            r1.setText(r8)     // Catch:{ Exception -> 0x007c }
            goto L_0x016d
        L_0x0160:
            android.widget.TextView r1 = r14.j2()     // Catch:{ Exception -> 0x007c }
        L_0x0164:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x016d
        L_0x0168:
            android.widget.TextView r1 = r14.j2()     // Catch:{ Exception -> 0x007c }
            goto L_0x0164
        L_0x016d:
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = "dlIssuedt"
            boolean r1 = km.q.F(r1, r8, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x01a1
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getDlIssuedt()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0199
            android.widget.TextView r1 = r14.i2()     // Catch:{ Exception -> 0x007c }
            z9.a$a r8 = z9.a.f18947a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r9 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r9.getDlIssuedt()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.i(r9)     // Catch:{ Exception -> 0x007c }
            r1.setText(r8)     // Catch:{ Exception -> 0x007c }
            goto L_0x01a6
        L_0x0199:
            android.widget.TextView r1 = r14.i2()     // Catch:{ Exception -> 0x007c }
        L_0x019d:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x01a6
        L_0x01a1:
            android.widget.TextView r1 = r14.i2()     // Catch:{ Exception -> 0x007c }
            goto L_0x019d
        L_0x01a6:
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = "dlNtValdtoDt"
            boolean r1 = km.q.F(r1, r8, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x01db
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getDlNtValdtoDt()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x01d6
            android.widget.TextView r1 = r14.l2()     // Catch:{ Exception -> 0x007c }
            z9.a$a r7 = z9.a.f18947a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r8 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.getDlNtValdtoDt()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.i(r8)     // Catch:{ Exception -> 0x007c }
        L_0x01d2:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x01e0
        L_0x01d6:
            android.widget.TextView r1 = r14.l2()     // Catch:{ Exception -> 0x007c }
            goto L_0x01d2
        L_0x01db:
            android.widget.TextView r1 = r14.l2()     // Catch:{ Exception -> 0x007c }
            goto L_0x01d2
        L_0x01e0:
            java.lang.String r1 = r15.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = "dlTrValdtoDt"
            boolean r1 = km.q.F(r1, r7, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0218
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r1 = r1.getDlTrValdtoDt()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x0210
            android.widget.TextView r1 = r14.g2()     // Catch:{ Exception -> 0x007c }
            z9.a$a r7 = z9.a.f18947a     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r8 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.Object r8 = r8.getDlTrValdtoDt()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.i(r8)     // Catch:{ Exception -> 0x007c }
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x021d
        L_0x0210:
            android.widget.LinearLayout r1 = r14.f2()     // Catch:{ Exception -> 0x007c }
        L_0x0214:
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x007c }
            goto L_0x021d
        L_0x0218:
            android.widget.LinearLayout r1 = r14.f2()     // Catch:{ Exception -> 0x007c }
            goto L_0x0214
        L_0x021d:
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getOmRtoFullname()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x023e
            int r1 = r1.length()     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x022e
            goto L_0x023e
        L_0x022e:
            android.widget.TextView r1 = r14.k2()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r7 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.getOmRtoFullname()     // Catch:{ Exception -> 0x007c }
        L_0x023a:
            r1.setText(r7)     // Catch:{ Exception -> 0x007c }
            goto L_0x025c
        L_0x023e:
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r1 = r1.getOlaName()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x025c
            int r1 = r1.length()     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x024f
            goto L_0x025c
        L_0x024f:
            android.widget.TextView r1 = r14.k2()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r7 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.getOlaName()     // Catch:{ Exception -> 0x007c }
            goto L_0x023a
        L_0x025c:
            com.nic.mparivahan.DB.DatabaseHelper r1 = r14.J1()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r7 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r7.getDlLicno()     // Catch:{ Exception -> 0x007c }
            int r1 = r1.s(r7)     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = "yyyyMMddHHmmss"
            if (r1 != 0) goto L_0x02de
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioImgObj r1 = r15.getBioImgObj()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x007c }
            goto L_0x027c
        L_0x027b:
            r1 = r5
        L_0x027c:
            if (r1 == 0) goto L_0x02b3
            com.nic.mparivahan.DB.DatabaseHelper r8 = r14.J1()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r1 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r1.getDlLicno()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r1 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r10 = r1.getBioFullName()     // Catch:{ Exception -> 0x007c }
            java.lang.String r11 = "DL"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x007c }
            r1.<init>(r7)     // Catch:{ Exception -> 0x007c }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x007c }
            r7.<init>()     // Catch:{ Exception -> 0x007c }
            java.lang.String r12 = r1.format(r7)     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioImgObj r1 = r15.getBioImgObj()     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x02ae
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x007c }
            r13 = r1
            goto L_0x02af
        L_0x02ae:
            r13 = r5
        L_0x02af:
            r8.P0(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x007c }
            goto L_0x0303
        L_0x02b3:
            com.nic.mparivahan.DB.DatabaseHelper r1 = r14.J1()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r8 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.getDlLicno()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r9 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r9.getBioFullName()     // Catch:{ Exception -> 0x007c }
            java.lang.String r10 = "DL"
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x007c }
            r11.<init>(r7)     // Catch:{ Exception -> 0x007c }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x007c }
            r7.<init>()     // Catch:{ Exception -> 0x007c }
            java.lang.String r11 = r11.format(r7)     // Catch:{ Exception -> 0x007c }
            java.lang.String r12 = ""
            r7 = r1
            r7.P0(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x007c }
            goto L_0x0303
        L_0x02de:
            com.nic.mparivahan.DB.DatabaseHelper r1 = r14.J1()     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj r8 = r15.getDlobj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r8.getDlLicno()     // Catch:{ Exception -> 0x007c }
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x007c }
            r9.<init>(r7)     // Catch:{ Exception -> 0x007c }
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x007c }
            r7.<init>()     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = r9.format(r7)     // Catch:{ Exception -> 0x007c }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj r9 = r15.getBioObj()     // Catch:{ Exception -> 0x007c }
            java.lang.String r9 = r9.getBioFullName()     // Catch:{ Exception -> 0x007c }
            r1.K0(r8, r7, r9)     // Catch:{ Exception -> 0x007c }
        L_0x0303:
            java.lang.String r0 = ""
            java.util.List r15 = r15.getDlcovs()     // Catch:{ Exception -> 0x03e9 }
            int r1 = r15.size()     // Catch:{ Exception -> 0x03e9 }
            r7 = r4
        L_0x030e:
            if (r7 >= r1) goto L_0x0331
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e9 }
            r8.<init>()     // Catch:{ Exception -> 0x03e9 }
            r8.append(r0)     // Catch:{ Exception -> 0x03e9 }
            java.lang.Object r0 = r15.get(r7)     // Catch:{ Exception -> 0x03e9 }
            com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlcov r0 = (com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlcov) r0     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = r0.getCovabbrv()     // Catch:{ Exception -> 0x03e9 }
            r8.append(r0)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = ", "
            r8.append(r0)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x03e9 }
            int r7 = r7 + 1
            goto L_0x030e
        L_0x0331:
            ka.c$a r15 = ka.c.f13158a     // Catch:{ Exception -> 0x03e9 }
            boolean r15 = r15.m(r0)     // Catch:{ Exception -> 0x03e9 }
            if (r15 != 0) goto L_0x035f
            ni.c8 r14 = r14.f8665i0     // Catch:{ Exception -> 0x03e9 }
            if (r14 != 0) goto L_0x0341
            cm.l.v(r6)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x0342
        L_0x0341:
            r5 = r14
        L_0x0342:
            com.nic.mparivahan.MyTextView r14 = r5.L     // Catch:{ Exception -> 0x03e9 }
            java.lang.CharSequence r15 = km.q.B0(r0)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x03e9 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x03e9 }
            int r0 = r0 - r3
            java.lang.String r15 = r15.substring(r4, r0)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r15, r0)     // Catch:{ Exception -> 0x03e9 }
            r14.setText(r15)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03e9
        L_0x035f:
            ni.c8 r14 = r14.f8665i0     // Catch:{ Exception -> 0x03e9 }
            if (r14 != 0) goto L_0x0367
            cm.l.v(r6)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x0368
        L_0x0367:
            r5 = r14
        L_0x0368:
            android.widget.LinearLayout r14 = r5.G     // Catch:{ Exception -> 0x03e9 }
            r14.setVisibility(r2)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03e9
        L_0x036f:
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x007c }
            java.lang.String r6 = r15.getStatusCode()     // Catch:{ Exception -> 0x007c }
            boolean r1 = r1.m(r6)     // Catch:{ Exception -> 0x007c }
            if (r1 != 0) goto L_0x03cc
            java.lang.String r1 = r15.getStatusCode()     // Catch:{ Exception -> 0x007c }
            java.lang.String r6 = "NR090"
            boolean r1 = km.p.p(r1, r6, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x039c
            android.widget.LinearLayout r1 = r14.L1()     // Catch:{ Exception -> 0x007c }
            r1.setVisibility(r0)     // Catch:{ Exception -> 0x007c }
            v9.d$a r1 = v9.d.f17494a     // Catch:{ Exception -> 0x007c }
            android.content.Context r3 = r14.W1()     // Catch:{ Exception -> 0x007c }
            java.lang.String r15 = r15.getStatusDesc()     // Catch:{ Exception -> 0x007c }
            r1.D(r3, r15, r2)     // Catch:{ Exception -> 0x007c }
            goto L_0x03e9
        L_0x039c:
            java.lang.String r1 = r15.getStatusCode()     // Catch:{ Exception -> 0x007c }
            java.lang.String r2 = "NR091"
            boolean r1 = km.p.p(r1, r2, r4, r3, r5)     // Catch:{ Exception -> 0x007c }
            if (r1 == 0) goto L_0x03bd
            android.widget.LinearLayout r1 = r14.L1()     // Catch:{ Exception -> 0x007c }
            r1.setVisibility(r0)     // Catch:{ Exception -> 0x007c }
            v9.d$a r1 = v9.d.f17494a     // Catch:{ Exception -> 0x007c }
            android.content.Context r2 = r14.W1()     // Catch:{ Exception -> 0x007c }
            java.lang.String r15 = r15.getStatusDesc()     // Catch:{ Exception -> 0x007c }
            r1.D(r2, r15, r3)     // Catch:{ Exception -> 0x007c }
            goto L_0x03e9
        L_0x03bd:
            android.widget.LinearLayout r15 = r14.L1()     // Catch:{ Exception -> 0x007c }
            r15.setVisibility(r0)     // Catch:{ Exception -> 0x007c }
            java.lang.String r15 = r14.N1()     // Catch:{ Exception -> 0x007c }
        L_0x03c8:
            r14.B2(r14, r15)     // Catch:{ Exception -> 0x007c }
            goto L_0x03e9
        L_0x03cc:
            android.widget.LinearLayout r15 = r14.L1()     // Catch:{ Exception -> 0x007c }
            r15.setVisibility(r0)     // Catch:{ Exception -> 0x007c }
            java.lang.String r15 = r14.N1()     // Catch:{ Exception -> 0x007c }
            goto L_0x03c8
        L_0x03d8:
            r15.printStackTrace()
            android.widget.LinearLayout r15 = r14.L1()
            r15.setVisibility(r0)
            java.lang.String r15 = r14.N1()
            r14.B2(r14, r15)
        L_0x03e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.SearchDL.r2(com.nic.mparivahan.Dl.SearchDL, com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel):void");
    }

    /* access modifiers changed from: private */
    public static final void s2(SearchDL searchDL, String str) {
        cm.l.f(searchDL, "this$0");
        searchDL.b2().dismiss();
        searchDL.L1().setVisibility(4);
        searchDL.B2(searchDL, searchDL.N1());
    }

    /* access modifiers changed from: private */
    public static final void t2(SearchDL searchDL, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        cm.l.f(searchDL, "this$0");
        searchDL.b2().dismiss();
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                searchDL.U2(dLServiceResponseModleV1.getDldetobj().get(0));
                searchDL.E1(searchDL.W1(), searchDL.d2().b(v9.f.f17510a.k(), "Virtual DL Successfully Created!"), searchDL.M1(), searchDL.O1(), searchDL.P1());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            searchDL.L1().setVisibility(4);
            searchDL.N2(searchDL.W1(), searchDL.d2().b("no_details", "No Details are available."));
        }
    }

    /* access modifiers changed from: private */
    public static final void u2(SearchDL searchDL, String str) {
        cm.l.f(searchDL, "this$0");
        searchDL.b2().dismiss();
        searchDL.L1().setVisibility(4);
        searchDL.N2(searchDL.W1(), searchDL.d2().b("no_details", "No Details are available."));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00de A[SYNTHETIC, Splitter:B:23:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011e A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012f A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0165 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0176 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b2 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01c3 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0200 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0219 A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x024e A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x028a A[SYNTHETIC, Splitter:B:70:0x028a] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0338 A[Catch:{ Exception -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v2(com.nic.mparivahan.Dl.SearchDL r13, com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1 r14) {
        /*
            java.lang.String r0 = "No Details are available."
            java.lang.String r1 = "no_details"
            java.lang.String r2 = "this$0"
            cm.l.f(r13, r2)
            android.app.ProgressDialog r2 = r13.b2()
            r2.dismiss()
            r2 = 4
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            int r3 = r3.getErrorcd()     // Catch:{ Exception -> 0x0096 }
            if (r3 != 0) goto L_0x0372
            android.widget.LinearLayout r3 = r13.L1()     // Catch:{ Exception -> 0x0096 }
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x0096 }
            android.widget.TextView r3 = r13.m2()     // Catch:{ Exception -> 0x0096 }
            java.util.List r5 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = (com.nic.mparivahan.Dl.Model.DldetobjX) r5     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = r5.getDlLicno()     // Catch:{ Exception -> 0x0096 }
            r3.setText(r5)     // Catch:{ Exception -> 0x0096 }
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getBioDob()     // Catch:{ Exception -> 0x0096 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0096 }
            r13.Q2(r3)     // Catch:{ Exception -> 0x0096 }
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getDlLicno()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0096 }
            r13.S2(r3)     // Catch:{ Exception -> 0x0096 }
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r3 = r3.getBioImgObj()     // Catch:{ Exception -> 0x0096 }
            r5 = 0
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = r3.getBiPhoto()     // Catch:{ Exception -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r14 = move-exception
            goto L_0x03ab
        L_0x0099:
            r3 = r5
        L_0x009a:
            if (r3 == 0) goto L_0x00c5
            int r3 = r3.length()     // Catch:{ Exception -> 0x0096 }
            if (r3 != 0) goto L_0x00a3
            goto L_0x00c5
        L_0x00a3:
            de.hdodenhof.circleimageview.CircleImageView r3 = r13.a2()     // Catch:{ Exception -> 0x0096 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r6 = r6.getBioImgObj()     // Catch:{ Exception -> 0x0096 }
            if (r6 == 0) goto L_0x00bc
            java.lang.String r6 = r6.getBiPhoto()     // Catch:{ Exception -> 0x0096 }
            goto L_0x00bd
        L_0x00bc:
            r6 = r5
        L_0x00bd:
            android.graphics.Bitmap r6 = r13.G1(r6)     // Catch:{ Exception -> 0x0096 }
            r3.setImageBitmap(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x00cf
        L_0x00c5:
            de.hdodenhof.circleimageview.CircleImageView r3 = r13.a2()     // Catch:{ Exception -> 0x0096 }
            r6 = 2131231173(0x7f0801c5, float:1.807842E38)
            r3.setImageResource(r6)     // Catch:{ Exception -> 0x0096 }
        L_0x00cf:
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "bioFullName"
            r7 = 2
            boolean r3 = km.q.F(r3, r6, r4, r7, r5)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "NA"
            if (r3 == 0) goto L_0x011e
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getBioNatName()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x0116
            android.widget.TextView r3 = r13.h2()     // Catch:{ Exception -> 0x0096 }
            xa.a$a r8 = xa.a.f18250a     // Catch:{ Exception -> 0x0096 }
            java.util.List r9 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = (com.nic.mparivahan.Dl.Model.DldetobjX) r9     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r9 = r9.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r9.getBioNatName()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = r8.b(r9)     // Catch:{ Exception -> 0x0096 }
            r3.setText(r8)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0123
        L_0x0116:
            android.widget.TextView r3 = r13.h2()     // Catch:{ Exception -> 0x0096 }
        L_0x011a:
            r3.setText(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0123
        L_0x011e:
            android.widget.TextView r3 = r13.h2()     // Catch:{ Exception -> 0x0096 }
            goto L_0x011a
        L_0x0123:
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = "dlRtoCode"
            boolean r3 = km.q.F(r3, r8, r4, r7, r5)     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x0165
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getDlRtoCode()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x015d
            android.widget.TextView r3 = r13.j2()     // Catch:{ Exception -> 0x0096 }
            java.util.List r8 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r8 = (com.nic.mparivahan.Dl.Model.DldetobjX) r8     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r8 = r8.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = r8.getDlRtoCode()     // Catch:{ Exception -> 0x0096 }
            r3.setText(r8)     // Catch:{ Exception -> 0x0096 }
            goto L_0x016a
        L_0x015d:
            android.widget.TextView r3 = r13.j2()     // Catch:{ Exception -> 0x0096 }
        L_0x0161:
            r3.setText(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x016a
        L_0x0165:
            android.widget.TextView r3 = r13.j2()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0161
        L_0x016a:
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = "dlIssuedt"
            boolean r3 = km.q.F(r3, r8, r4, r7, r5)     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x01b2
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getDlIssuedt()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x01aa
            android.widget.TextView r3 = r13.i2()     // Catch:{ Exception -> 0x0096 }
            z9.a$a r8 = z9.a.f18947a     // Catch:{ Exception -> 0x0096 }
            java.util.List r9 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r9 = r9.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = (com.nic.mparivahan.Dl.Model.DldetobjX) r9     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r9.getDlIssuedt()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = r8.i(r9)     // Catch:{ Exception -> 0x0096 }
            r3.setText(r8)     // Catch:{ Exception -> 0x0096 }
            goto L_0x01b7
        L_0x01aa:
            android.widget.TextView r3 = r13.i2()     // Catch:{ Exception -> 0x0096 }
        L_0x01ae:
            r3.setText(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x01b7
        L_0x01b2:
            android.widget.TextView r3 = r13.i2()     // Catch:{ Exception -> 0x0096 }
            goto L_0x01ae
        L_0x01b7:
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = "dlNtValdtoDt"
            boolean r3 = km.q.F(r3, r8, r4, r7, r5)     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x0200
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x01fb
            android.widget.TextView r3 = r13.l2()     // Catch:{ Exception -> 0x0096 }
            z9.a$a r6 = z9.a.f18947a     // Catch:{ Exception -> 0x0096 }
            java.util.List r7 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r7 = (com.nic.mparivahan.Dl.Model.DldetobjX) r7     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r7 = r7.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = r7.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = r6.i(r7)     // Catch:{ Exception -> 0x0096 }
        L_0x01f7:
            r3.setText(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0205
        L_0x01fb:
            android.widget.TextView r3 = r13.l2()     // Catch:{ Exception -> 0x0096 }
            goto L_0x01f7
        L_0x0200:
            android.widget.TextView r3 = r13.l2()     // Catch:{ Exception -> 0x0096 }
            goto L_0x01f7
        L_0x0205:
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getOmRtoFullname()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x023a
            int r3 = r3.length()     // Catch:{ Exception -> 0x0096 }
            if (r3 != 0) goto L_0x0220
            goto L_0x023a
        L_0x0220:
            android.widget.TextView r3 = r13.k2()     // Catch:{ Exception -> 0x0096 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = r6.getOmRtoFullname()     // Catch:{ Exception -> 0x0096 }
        L_0x0236:
            r3.setText(r6)     // Catch:{ Exception -> 0x0096 }
            goto L_0x026c
        L_0x023a:
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.getOlaName()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x026c
            int r3 = r3.length()     // Catch:{ Exception -> 0x0096 }
            if (r3 != 0) goto L_0x0255
            goto L_0x026c
        L_0x0255:
            android.widget.TextView r3 = r13.k2()     // Catch:{ Exception -> 0x0096 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = r6.getOlaName()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0236
        L_0x026c:
            com.nic.mparivahan.DB.DatabaseHelper r3 = r13.J1()     // Catch:{ Exception -> 0x0096 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r6.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = r6.getBioDlno()     // Catch:{ Exception -> 0x0096 }
            int r3 = r3.s(r6)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = "yyyyMMddHHmmss"
            if (r3 != 0) goto L_0x0338
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r3 = r3.getBioImgObj()     // Catch:{ Exception -> 0x0096 }
            if (r3 == 0) goto L_0x029f
            java.lang.String r3 = r3.getBiPhoto()     // Catch:{ Exception -> 0x0096 }
            goto L_0x02a0
        L_0x029f:
            r3 = r5
        L_0x02a0:
            if (r3 == 0) goto L_0x02f4
            com.nic.mparivahan.DB.DatabaseHelper r7 = r13.J1()     // Catch:{ Exception -> 0x0096 }
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = r3.getBioDlno()     // Catch:{ Exception -> 0x0096 }
            java.util.List r3 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = r3.getBioFullName()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r10 = "DL"
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0096 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0096 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0096 }
            r6.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r11 = r3.format(r6)     // Catch:{ Exception -> 0x0096 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r14 = r14.getBioImgObj()     // Catch:{ Exception -> 0x0096 }
            if (r14 == 0) goto L_0x02ee
            java.lang.String r5 = r14.getBiPhoto()     // Catch:{ Exception -> 0x0096 }
        L_0x02ee:
            r12 = r5
            r7.P0(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0096 }
            goto L_0x03c4
        L_0x02f4:
            com.nic.mparivahan.DB.DatabaseHelper r3 = r13.J1()     // Catch:{ Exception -> 0x0096 }
            java.util.List r5 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = (com.nic.mparivahan.Dl.Model.DldetobjX) r5     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r5.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = r5.getBioDlno()     // Catch:{ Exception -> 0x0096 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r14 = r14.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r14 = r14.getBioFullName()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "DL"
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0096 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0096 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0096 }
            r6.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r8 = r4.format(r6)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r9 = ""
            r4 = r5
            r5 = r14
            r6 = r7
            r7 = r8
            r8 = r9
            r3.P0(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0096 }
            goto L_0x03c4
        L_0x0338:
            com.nic.mparivahan.DB.DatabaseHelper r3 = r13.J1()     // Catch:{ Exception -> 0x0096 }
            java.util.List r5 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = (com.nic.mparivahan.Dl.Model.DldetobjX) r5     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r5.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = r5.getBioDlno()     // Catch:{ Exception -> 0x0096 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0096 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0096 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0096 }
            r6.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r6 = r7.format(r6)     // Catch:{ Exception -> 0x0096 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.BioObjX r14 = r14.getBioObj()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r14 = r14.getBioFullName()     // Catch:{ Exception -> 0x0096 }
            r3.K0(r5, r6, r14)     // Catch:{ Exception -> 0x0096 }
            goto L_0x03c4
        L_0x0372:
            android.widget.LinearLayout r3 = r13.L1()     // Catch:{ Exception -> 0x0096 }
            r3.setVisibility(r2)     // Catch:{ Exception -> 0x0096 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r14 = r14.get(r4)     // Catch:{ Exception -> 0x0096 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0096 }
            int r14 = r14.getErrorcd()     // Catch:{ Exception -> 0x0096 }
            r3 = -2
            if (r14 != r3) goto L_0x039e
            android.content.Context r14 = r13.W1()     // Catch:{ Exception -> 0x0096 }
            ld.c r3 = r13.d2()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r4 = "kindly_etner_correct_details"
            java.lang.String r5 = "Kindly enter correct details"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0096 }
        L_0x039a:
            r13.N2(r14, r3)     // Catch:{ Exception -> 0x0096 }
            goto L_0x03c4
        L_0x039e:
            android.content.Context r14 = r13.W1()     // Catch:{ Exception -> 0x0096 }
            ld.c r3 = r13.d2()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r3 = r3.b(r1, r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x039a
        L_0x03ab:
            r14.printStackTrace()
            android.widget.LinearLayout r14 = r13.L1()
            r14.setVisibility(r2)
            android.content.Context r14 = r13.W1()
            ld.c r2 = r13.d2()
            java.lang.String r0 = r2.b(r1, r0)
            r13.N2(r14, r0)
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.SearchDL.v2(com.nic.mparivahan.Dl.SearchDL, com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1):void");
    }

    /* access modifiers changed from: private */
    public static final void w2(SearchDL searchDL, String str) {
        cm.l.f(searchDL, "this$0");
        searchDL.b2().dismiss();
        searchDL.L1().setVisibility(4);
        searchDL.N2(searchDL.W1(), searchDL.d2().b("no_details", "No Details are available."));
    }

    /* access modifiers changed from: private */
    public static final void x2(SearchDL searchDL, SendOtpResult sendOtpResult) {
        cm.l.f(searchDL, "this$0");
        try {
            searchDL.b2().dismiss();
            if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                SearchDL searchDL2 = searchDL;
                SearchDL searchDL3 = searchDL;
                searchDL.f8669m0 = yc.i.f18692a.m(searchDL2, searchDL3, new ld.g(searchDL).l(), searchDL.q2(), String.valueOf(sendOtpResult.getRecordId()), q.B0(searchDL.m2().getText().toString()).toString(), "DL", searchDL.K1(), searchDL.b2());
            } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                searchDL.N2(searchDL, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            searchDL.b2().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(SearchDL searchDL, String str) {
        cm.l.f(searchDL, "this$0");
        searchDL.b2().dismiss();
        searchDL.N2(searchDL, searchDL.d2().b(v9.f.f17510a.K0(), "Unable to create the virtual RC, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void z2(SearchDL searchDL, CitzValidDoc citzValidDoc) {
        cm.l.f(searchDL, "this$0");
        try {
            Long l10 = null;
            if (p.p(citzValidDoc.getStatusCode(), "AL001", false, 2, (Object) null)) {
                Dialog dialog = searchDL.f8669m0;
                if (dialog != null) {
                    cm.l.c(dialog);
                    dialog.dismiss();
                    searchDL.b2().dismiss();
                }
                c.a aVar = ka.c.f13158a;
                if (aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog2 = searchDL.f8669m0;
                    if (dialog2 != null) {
                        cm.l.c(dialog2);
                        dialog2.dismiss();
                    }
                    CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                    if (citizenDocInfo != null) {
                        l10 = citizenDocInfo.getDocId();
                    }
                    searchDL.V2(String.valueOf(l10));
                    searchDL.Y1().g(searchDL.M1(), searchDL.K1().toString(), searchDL);
                    return;
                }
                if (searchDL.b2().isShowing()) {
                    searchDL.b2().dismiss();
                }
                if (!aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog3 = searchDL.f8669m0;
                    if (dialog3 != null) {
                        cm.l.c(dialog3);
                        dialog3.dismiss();
                    }
                    searchDL.N2(searchDL, citzValidDoc.getParam());
                    return;
                }
                Dialog dialog4 = searchDL.f8669m0;
                if (dialog4 != null) {
                    cm.l.c(dialog4);
                    dialog4.dismiss();
                }
                searchDL.N2(searchDL.W1(), searchDL.d2().b(v9.f.f17510a.J0(), "Unable to Create the Virtual DL, Please try after some time."));
                return;
            }
            searchDL.b2().dismiss();
            Toast.makeText(searchDL, citzValidDoc.getStatusDesc(), 1).show();
        } catch (Exception unused) {
            if (searchDL.b2().isShowing()) {
                searchDL.b2().dismiss();
            }
            Dialog dialog5 = searchDL.f8669m0;
            if (dialog5 != null) {
                cm.l.c(dialog5);
                dialog5.dismiss();
            }
            searchDL.N2(searchDL.W1(), searchDL.d2().b(v9.f.f17510a.J0(), "Unable to Create the Virtual DL, Please try after some time."));
        }
    }

    public final void B2(Context context, String str) {
        cm.l.f(str, "dl_number");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        cm.l.c(window2);
        window2.setLayout(-1, -2);
        View findViewById = dialog.findViewById(R.id.verify_card);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById2 = dialog.findViewById(R.id.cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById3 = dialog.findViewById(R.id.applicant_year);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.applicant_month);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.applicant_date);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText3 = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.dob_cal);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById7 = dialog.findViewById(R.id.head);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.verify_text_view);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById9 = dialog.findViewById(R.id.cancle_txt);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById7).setText(d2().b(v9.f.f17510a.W0(), "Verify your DL"));
        ((TextView) findViewById8).setText(d2().b("vahan_btn_verify", "Verify"));
        ((TextView) findViewById9).setText(d2().b("button_cancel", "Cancel"));
        View findViewById10 = dialog.findViewById(R.id.dob_badge);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById10).setText(d2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) findViewById6).setOnClickListener(new f(this, new k(this, editText3, editText2, editText)));
        editText3.setOnEditorActionListener(new u1());
        editText3.addTextChangedListener(new g(editText2));
        editText3.addTextChangedListener(new h(editText3, editText2));
        editText2.addTextChangedListener(new i(editText));
        editText2.setOnKeyListener(new v1(editText2, editText3));
        editText2.addTextChangedListener(new j(editText2, editText));
        ((CardView) findViewById2).setOnClickListener(new w1(dialog, this));
        ((CardView) findViewById).setOnClickListener(new x1(this, editText, editText2, editText3, dialog));
        dialog.show();
    }

    public final void E1(Context context, String str, String str2, DldetobjX dldetobjX, String str3) {
        cm.l.f(dldetobjX, "dlobj");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
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
        ((TextView) findViewById3).setText(d2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(d2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new e2(dialog, this, str2, dldetobjX, str3));
        dialog.show();
    }

    public void G(String str) {
    }

    public final Bitmap G1(String str) {
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void G2(Context context, String str) {
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
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(d2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(d2().b("btn_ok", "OK"));
        textView.setOnClickListener(new c2(dialog));
        dialog.show();
    }

    public final Calendar H1() {
        return this.f8659c0;
    }

    public final void I1(String str) {
        cm.l.f(str, "dl");
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        ld.g gVar = new ld.g(this);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        DlService c10 = DlService.f8615a.c(W1());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        a.C0238a aVar2 = xa.a.f18250a;
        Context W1 = W1();
        cm.l.c(string);
        String jSONObject = aVar2.c(str, (String) null, W1, string, gVar.l()).toString();
        cm.l.e(jSONObject, "toString(...)");
        c10.getDlDetailsForRecentSearch(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this, str));
    }

    public final void I2(Context context, String str, String str2, int i10) {
        String str3 = str2;
        cm.l.f(str3, "dl_number");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        cm.l.c(window2);
        window2.setLayout(-1, -2);
        View findViewById = dialog.findViewById(R.id.verify_card);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById2 = dialog.findViewById(R.id.cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById3 = dialog.findViewById(R.id.applicant_year);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.applicant_month);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText2 = (EditText) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.applicant_date);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText3 = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.dob_cal);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById7 = dialog.findViewById(R.id.head);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.verify_text_view);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById9 = dialog.findViewById(R.id.cancle_txt);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById7).setText(d2().b(v9.f.f17510a.W0(), "Verify your DL"));
        ((TextView) findViewById8).setText(d2().b("vahan_btn_verify", "Verify"));
        ((TextView) findViewById9).setText(d2().b("button_cancel", "Cancel"));
        View findViewById10 = dialog.findViewById(R.id.dob_badge);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById10).setText(d2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) findViewById6).setOnClickListener(new l(this, new q(this, editText3, editText2, editText)));
        editText3.setOnEditorActionListener(new f2());
        editText3.addTextChangedListener(new m(editText2));
        editText3.addTextChangedListener(new n(editText3, editText2));
        editText2.addTextChangedListener(new o(editText));
        editText2.setOnKeyListener(new g2(editText2, editText3));
        editText2.addTextChangedListener(new p(editText2, editText));
        ((CardView) findViewById2).setOnClickListener(new h2(dialog));
        ((CardView) findViewById).setOnClickListener(new i2(str, this, editText, editText2, editText3, i10, dialog, str3));
        dialog.show();
    }

    public final DatabaseHelper J1() {
        DatabaseHelper databaseHelper = this.Z;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final String K1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("dateValeMain");
        return null;
    }

    public final LinearLayout L1() {
        LinearLayout linearLayout = this.V;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("dl_layout");
        return null;
    }

    public final String M1() {
        String str = this.f8661e0;
        if (str != null) {
            return str;
        }
        cm.l.v("dl_number");
        return null;
    }

    public final String N1() {
        String str = this.f8664h0;
        if (str != null) {
            return str;
        }
        cm.l.v("dl_number_intent");
        return null;
    }

    public final void N2(Context context, String str) {
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
        ((TextView) findViewById3).setText(d2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(d2().b("btn_ok", "OK"));
        textView.setOnClickListener(new t1(dialog, this));
        dialog.show();
    }

    public final DldetobjX O1() {
        DldetobjX dldetobjX = this.f8662f0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlobjx");
        return null;
    }

    public final String P1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("doc_id");
        return null;
    }

    public final void P2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.Z = databaseHelper;
    }

    public final void Q2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void R2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.V = linearLayout;
    }

    public final void S2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8661e0 = str;
    }

    public final void T2(String str) {
        cm.l.f(str, "<set-?>");
        this.f8664h0 = str;
    }

    public final void U2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f8662f0 = dldetobjX;
    }

    public final LinearLayout V1() {
        LinearLayout linearLayout = this.f8657a0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("ll_create_dl");
        return null;
    }

    public final void V2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final Context W1() {
        Context context = this.J;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void W2(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8657a0 = linearLayout;
    }

    public final DlService X1() {
        DlService dlService = this.H;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final void X2(Context context) {
        cm.l.f(context, "<set-?>");
        this.J = context;
    }

    public final za.a Y1() {
        za.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }

    public final void Y2(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.H = dlService;
    }

    public final LinearLayout Z1() {
        LinearLayout linearLayout = this.f8663g0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final void Z2(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public final CircleImageView a2() {
        CircleImageView circleImageView = this.W;
        if (circleImageView != null) {
            return circleImageView;
        }
        cm.l.v("owner_image");
        return null;
    }

    public final void a3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8663g0 = linearLayout;
    }

    public final ProgressDialog b2() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void b3(CircleImageView circleImageView) {
        cm.l.f(circleImageView, "<set-?>");
        this.W = circleImageView;
    }

    public final cd.a c2() {
        cd.a aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("rcImpoundModel");
        return null;
    }

    public final void c3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final ld.c d2() {
        ld.c cVar = this.f8666j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void d3(cd.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.L = aVar;
    }

    public final TextView e2() {
        TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        cm.l.v("tap_to_dl_impound");
        return null;
    }

    public final void e3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8666j0 = cVar;
    }

    public final LinearLayout f2() {
        LinearLayout linearLayout = this.f8671o0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("transport_layout");
        return null;
    }

    public final void f3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.T = textView;
    }

    public final TextView g2() {
        TextView textView = this.f8670n0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("transvalidity_tv");
        return null;
    }

    public final void g3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8671o0 = linearLayout;
    }

    public final TextView h2() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtDlHolderName");
        return null;
    }

    public final void h3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8670n0 = textView;
    }

    public final TextView i2() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtIssueDate");
        return null;
    }

    public final void i3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final TextView j2() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicAuthCode");
        return null;
    }

    public final void j3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final TextView k2() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicAuthority");
        return null;
    }

    public final void k3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.O = textView;
    }

    public final TextView l2() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicValidityCode");
        return null;
    }

    public final void l3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final TextView m2() {
        TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_dl_number");
        return null;
    }

    public final void m3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final ld.g n2() {
        ld.g gVar = this.f8660d0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("userSessionManager");
        return null;
    }

    public final void n3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final LinearLayout o2() {
        LinearLayout linearLayout = this.K;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("vehicleImpoundLl");
        return null;
    }

    public final void o3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.U = textView;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c8 c10 = c8.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8665i0 = c10;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        c8 c8Var = this.f8665i0;
        if (c8Var == null) {
            cm.l.v("binding");
            c8Var = null;
        }
        aVar.I1(this, c8Var);
        X2(this);
        e3(new ld.c(W1()));
        p3(new ld.g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(W1());
        cm.l.e(A0, "getInstance(...)");
        P2(A0);
        Y2(DlService.f8615a.c(W1()));
        this.M = RcImpoundService.f9481a.b(W1());
        T2(String.valueOf(getIntent().getStringExtra("DLNumber")));
        Q1();
        c3(new ProgressDialog(W1()));
        b2().setMessage(d2().b("label_challan_please_wait", "Please wait..."));
        b2().setCancelable(false);
        b2().setCanceledOnTouchOutside(false);
        this.f8668l0 = SignService.f7644a.c(this);
        Z2((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(X1()))).a(za.a.class));
        RcImpoundService rcImpoundService = this.M;
        if (rcImpoundService == null) {
            cm.l.v("rcImpoundService");
            rcImpoundService = null;
        }
        d3((cd.a) new u0((x0) this, (u0.b) new cd.b(new bd.a(rcImpoundService))).a(cd.a.class));
        SignService signService = this.f8668l0;
        if (signService == null) {
            cm.l.v("retrofitService");
            signService = null;
        }
        s3((v8.h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(v8.h.class));
        String N1 = N1();
        if (!(N1 == null || N1.length() == 0)) {
            b2().show();
            Y1().D(N1(), (String) null, W1());
        }
        Y1().z().g(this, new s1(this));
        Y1().A().g(this, new d2(this));
        Y1().v().g(this, new j2(this));
        Y1().w().g(this, new k2(this));
        Y1().t().g(this, new l2(this));
        Y1().u().g(this, new m2(this));
        c2().h().g(this, new r(new d(this)));
        c2().g().g(this, new r(new e(this)));
        q2().s().g(this, new n2(this));
        q2().r().g(this, new o2(this));
        q2().v().g(this, new p2(this));
        q2().i().g(this, new q2(this));
        q2().y().g(this, new r(new b(this)));
        q2().x().g(this, new r(new c(this)));
    }

    public final LinearLayout p2() {
        LinearLayout linearLayout = this.f8658b0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("viewChallanLl");
        return null;
    }

    public final void p3(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f8660d0 = gVar;
    }

    public final v8.h q2() {
        v8.h hVar = this.f8667k0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void q3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.K = linearLayout;
    }

    public final void r3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8658b0 = linearLayout;
    }

    public void s(String str) {
        if (str != null) {
            b2().show();
            I1(str);
        }
    }

    public final void s3(v8.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f8667k0 = hVar;
    }
}
