package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.CreateVirtualDocModle;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ni.p6;
import ua.e1;
import ua.f1;
import ua.g1;
import ua.h1;
import ua.i1;
import ua.j1;
import ua.k1;
import ua.l1;
import ua.m1;
import ua.n1;
import ua.o0;
import ua.o1;
import ua.p1;
import ua.q1;
import ua.z0;
import v9.e;
import z9.a;

public final class NewDlSearch extends androidx.appcompat.app.d {
    public za.a G;
    public DlService H;
    public ProgressDialog I;
    public Context J;
    public EditText K;
    public LinearLayout L;
    public EditText M;
    public EditText N;
    public EditText O;
    private String P;
    private Dialog Q;
    private Calendar R = Calendar.getInstance();
    public ld.g S;
    public String T;
    public DldetobjX U;
    public DatabaseHelper V;
    public LinearLayout W;
    public RecyclerView X;
    public ImageView Y;
    public ImageView Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.c f8618a0;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public p6 f8619b0;

    /* renamed from: c0  reason: collision with root package name */
    public cd.c f8620c0;

    /* renamed from: d0  reason: collision with root package name */
    public RcService f8621d0;

    /* renamed from: e0  reason: collision with root package name */
    public v8.h f8622e0;

    /* renamed from: f0  reason: collision with root package name */
    private SignService f8623f0;

    public static final class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8624e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n f8625f;

        a(NewDlSearch newDlSearch, n nVar) {
            this.f8624e = newDlSearch;
            this.f8625f = nVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f8624e.o2(), this.f8625f, this.f8624e.O1().get(1), this.f8624e.O1().get(2), this.f8624e.O1().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NewDlSearch newDlSearch) {
            super(1);
            this.f8626e = newDlSearch;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            try {
                this.f8626e.v2().dismiss();
                this.f8626e.P1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                NewDlSearch newDlSearch = this.f8626e;
                newDlSearch.Q2(newDlSearch, newDlSearch.y2().b(v9.f.f17510a.l(), "Virtual DL successfully updated!"));
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f8626e.v2().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return pl.x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8627e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NewDlSearch newDlSearch) {
            super(1);
            this.f8627e = newDlSearch;
        }

        public final void b(String str) {
            try {
                this.f8627e.v2().dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8628e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NewDlSearch newDlSearch) {
            super(1);
            this.f8628e = newDlSearch;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ni.p6} */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.RC.Model.MyRcDeletResponse r8) {
            /*
                r7 = this;
                java.lang.String r0 = "getDLDetailsList(...)"
                com.nic.mparivahan.Dl.NewDlSearch r1 = r7.f8628e
                android.app.ProgressDialog r1 = r1.v2()
                r1.dismiss()
                java.lang.String r1 = r8.getStatusCode()
                java.lang.String r2 = "VTLD001"
                r3 = 1
                boolean r1 = km.p.o(r1, r2, r3)
                if (r1 == 0) goto L_0x0119
                ka.c$a r1 = ka.c.f13158a
                java.lang.String r8 = r8.getStatusDesc()
                boolean r8 = r1.m(r8)
                if (r8 != 0) goto L_0x0039
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                ld.c r1 = r8.y2()
                v9.f$a r2 = v9.f.f17510a
                java.lang.String r2 = r2.Z0()
                java.lang.String r3 = "Virtual DL successfully deleted!"
                java.lang.String r1 = r1.b(r2, r3)
                r8.Q2(r8, r1)
            L_0x0039:
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                com.nic.mparivahan.DB.DatabaseHelper r8 = r8.P1()
                r8.E()
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                com.nic.mparivahan.DB.DatabaseHelper r8 = r8.P1()
                java.util.ArrayList r8 = r8.c0()
                r1 = 8
                java.lang.String r2 = "binding"
                r3 = 0
                if (r8 == 0) goto L_0x00f5
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                ni.p6 r8 = r8.f8619b0     // Catch:{ Exception -> 0x0060 }
                if (r8 != 0) goto L_0x0063
                cm.l.v(r2)     // Catch:{ Exception -> 0x0060 }
                r8 = r3
                goto L_0x0063
            L_0x0060:
                r8 = move-exception
                goto L_0x00f1
            L_0x0063:
                com.nic.mparivahan.MyTextView r8 = r8.f27953t     // Catch:{ Exception -> 0x0060 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                androidx.recyclerview.widget.RecyclerView r8 = r8.w2()     // Catch:{ Exception -> 0x0060 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.DB.DatabaseHelper r8 = r8.P1()     // Catch:{ Exception -> 0x0060 }
                java.util.ArrayList r8 = r8.c0()     // Catch:{ Exception -> 0x0060 }
                cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r1 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                androidx.recyclerview.widget.RecyclerView r1 = r1.w2()     // Catch:{ Exception -> 0x0060 }
                androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r5 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                r6 = 0
                r4.<init>(r5, r6, r6)     // Catch:{ Exception -> 0x0060 }
                r1.setLayoutManager(r4)     // Catch:{ Exception -> 0x0060 }
                va.e r1 = new va.e     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r4 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                r1.<init>(r4, r8)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                androidx.recyclerview.widget.RecyclerView r8 = r8.w2()     // Catch:{ Exception -> 0x0060 }
                r8.setAdapter(r1)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.DB.DatabaseHelper r8 = r8.P1()     // Catch:{ Exception -> 0x0060 }
                java.util.ArrayList r8 = r8.c0()     // Catch:{ Exception -> 0x0060 }
                cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0060 }
                java.lang.Object r0 = r8.get(r6)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x0060 }
                if (r0 == 0) goto L_0x014e
                com.nic.mparivahan.Dl.NewDlSearch r0 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                ni.p6 r0 = r0.f8619b0     // Catch:{ Exception -> 0x0060 }
                if (r0 != 0) goto L_0x00c4
                cm.l.v(r2)     // Catch:{ Exception -> 0x0060 }
                r0 = r3
            L_0x00c4:
                android.widget.LinearLayout r0 = r0.B     // Catch:{ Exception -> 0x0060 }
                r0.setVisibility(r6)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.NewDlSearch r0 = r7.f8628e     // Catch:{ Exception -> 0x0060 }
                ni.p6 r0 = r0.f8619b0     // Catch:{ Exception -> 0x0060 }
                if (r0 != 0) goto L_0x00d5
                cm.l.v(r2)     // Catch:{ Exception -> 0x0060 }
                r0 = r3
            L_0x00d5:
                android.widget.TextView r0 = r0.f27950q     // Catch:{ Exception -> 0x0060 }
                java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.Model.DLDocument r8 = (com.nic.mparivahan.Dl.Model.DLDocument) r8     // Catch:{ Exception -> 0x0060 }
                com.nic.mparivahan.Dl.Model.DldetobjX r8 = r8.getDldetails()     // Catch:{ Exception -> 0x0060 }
                if (r8 == 0) goto L_0x00ed
                com.nic.mparivahan.Dl.Model.DlobjX r8 = r8.getDlobj()     // Catch:{ Exception -> 0x0060 }
                if (r8 == 0) goto L_0x00ed
                java.lang.String r3 = r8.getDlLicno()     // Catch:{ Exception -> 0x0060 }
            L_0x00ed:
                r0.setText(r3)     // Catch:{ Exception -> 0x0060 }
                goto L_0x014e
            L_0x00f1:
                r8.printStackTrace()
                goto L_0x014e
            L_0x00f5:
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                ni.p6 r8 = r8.f8619b0
                if (r8 != 0) goto L_0x0101
                cm.l.v(r2)
                r8 = r3
            L_0x0101:
                com.nic.mparivahan.MyTextView r8 = r8.f27953t
                r8.setVisibility(r1)
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                ni.p6 r8 = r8.f8619b0
                if (r8 != 0) goto L_0x0112
                cm.l.v(r2)
                goto L_0x0113
            L_0x0112:
                r3 = r8
            L_0x0113:
                android.widget.LinearLayout r8 = r3.B
                r8.setVisibility(r1)
                goto L_0x014e
            L_0x0119:
                java.lang.String r0 = r8.getStatusCode()
                java.lang.String r1 = "VTLD099"
                boolean r0 = km.p.o(r0, r1, r3)
                if (r0 == 0) goto L_0x0138
            L_0x0125:
                com.nic.mparivahan.Dl.NewDlSearch r0 = r7.f8628e
                android.app.ProgressDialog r0 = r0.v2()
                r0.dismiss()
                com.nic.mparivahan.Dl.NewDlSearch r0 = r7.f8628e
                java.lang.String r8 = r8.getStatusDesc()
                r0.Q2(r0, r8)
                goto L_0x014e
            L_0x0138:
                ka.c$a r0 = ka.c.f13158a
                java.lang.String r1 = r8.getStatusDesc()
                boolean r0 = r0.m(r1)
                if (r0 != 0) goto L_0x0145
                goto L_0x0125
            L_0x0145:
                com.nic.mparivahan.Dl.NewDlSearch r8 = r7.f8628e
                android.app.ProgressDialog r8 = r8.v2()
                r8.dismiss()
            L_0x014e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.d.b(com.nic.mparivahan.RC.Model.MyRcDeletResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8629e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NewDlSearch newDlSearch) {
            super(1);
            this.f8629e = newDlSearch;
        }

        public final void b(String str) {
            this.f8629e.v2().dismiss();
            NewDlSearch newDlSearch = this.f8629e;
            newDlSearch.Q2(newDlSearch, newDlSearch.y2().b(v9.f.f17510a.E0(), "Unable to delete the virtual DL, Please try after some time"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8630e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(NewDlSearch newDlSearch) {
            super(1);
            this.f8630e = newDlSearch;
        }

        public final void b(ResendOtp resendOtp) {
            Toast makeText;
            this.f8630e.v2().dismiss();
            try {
                if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                    NewDlSearch newDlSearch = this.f8630e;
                    makeText = Toast.makeText(newDlSearch, newDlSearch.y2().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"), 1);
                } else if (!ka.c.f13158a.m(resendOtp.getStatusDesc())) {
                    makeText = Toast.makeText(this.f8630e, resendOtp.getStatusDesc(), 1);
                } else {
                    this.f8630e.v2().dismiss();
                    NewDlSearch newDlSearch2 = this.f8630e;
                    newDlSearch2.Q2(newDlSearch2, newDlSearch2.y2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                    return;
                }
                makeText.show();
            } catch (Exception unused) {
                this.f8630e.v2().dismiss();
                NewDlSearch newDlSearch3 = this.f8630e;
                newDlSearch3.Q2(newDlSearch3, newDlSearch3.y2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ResendOtp) obj);
            return pl.x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8631e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(NewDlSearch newDlSearch) {
            super(1);
            this.f8631e = newDlSearch;
        }

        public final void b(String str) {
            this.f8631e.v2().dismiss();
            NewDlSearch newDlSearch = this.f8631e;
            newDlSearch.Q2(newDlSearch, newDlSearch.y2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    public static final class h implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8632e;

        h(NewDlSearch newDlSearch) {
            this.f8632e = newDlSearch;
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
                this.f8632e.U1().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class i implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8633e;

        i(NewDlSearch newDlSearch) {
            this.f8633e = newDlSearch;
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
                this.f8633e.V1().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class j implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8634e;

        j(NewDlSearch newDlSearch) {
            this.f8634e = newDlSearch;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8634e.T1().requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8634e.U1().requestFocus();
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
                    this.f8634e.T1().setText("");
                }
            }
        }
    }

    public static final class k implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8635e;

        k(NewDlSearch newDlSearch) {
            this.f8635e = newDlSearch;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8635e.U1().requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8635e.V1().requestFocus();
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
                    this.f8635e.U1().setText("");
                }
            }
        }
    }

    public static final class l implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8636e;

        l(NewDlSearch newDlSearch) {
            this.f8636e = newDlSearch;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
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
            if (obj.subSequence(i13, length + 1).toString().length() == 4) {
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
                if (parseInt == 0 || parseInt < 1900) {
                    this.f8636e.V1().setText("");
                }
            }
        }
    }

    public static final class m implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8637a;

        m(NewDlSearch newDlSearch) {
            this.f8637a = newDlSearch;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f8637a.O1().set(1, i10);
            this.f8637a.O1().set(2, i11);
            this.f8637a.O1().set(5, i12);
            this.f8637a.p3();
        }
    }

    public static final class n implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8638a;

        n(NewDlSearch newDlSearch) {
            this.f8638a = newDlSearch;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f8638a.O1().set(1, i10);
            this.f8638a.O1().set(2, i11);
            this.f8638a.O1().set(5, i12);
            CharSequence format = DateFormat.format("dd", this.f8638a.O1().getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", this.f8638a.O1().getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", this.f8638a.O1().getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                p6 J1 = this.f8638a.f8619b0;
                if (J1 == null) {
                    cm.l.v("binding");
                    J1 = null;
                }
                TextView textView = J1.f27936c;
                textView.setText(str + '-' + str2 + '-' + str3);
                NewDlSearch newDlSearch = this.f8638a;
                newDlSearch.U2(str3 + '-' + str2 + '-' + str);
            } catch (Exception unused) {
            }
        }
    }

    static final class o extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8639e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(NewDlSearch newDlSearch) {
            super(1);
            this.f8639e = newDlSearch;
        }

        public final void b(String str) {
            this.f8639e.v2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class p extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8640e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(NewDlSearch newDlSearch) {
            super(1);
            this.f8640e = newDlSearch;
        }

        public final void b(GetVirtualDocDetails getVirtualDocDetails) {
            if (!p.o(getVirtualDocDetails.getStatusCode(), "VTLD005", true) && p.o(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                int size = getVirtualDocDetails.getMparCitizenDocInfo().size();
                String str = null;
                for (int i10 = 0; i10 < size; i10++) {
                    if (p.o(q.B0(getVirtualDocDetails.getMparCitizenDocInfo().get(i10).getDocType()).toString(), "DL", true)) {
                        str = String.valueOf(getVirtualDocDetails.getMparCitizenDocInfo().get(i10).getDocId());
                    }
                }
                if (str != null) {
                    this.f8640e.s2().g(str, this.f8640e);
                    return;
                }
                return;
            }
            this.f8640e.v2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetVirtualDocDetails) obj);
            return pl.x.f30437a;
        }
    }

    static final class q extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8641e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(NewDlSearch newDlSearch) {
            super(1);
            this.f8641e = newDlSearch;
        }

        public final void b(String str) {
            this.f8641e.v2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return pl.x.f30437a;
        }
    }

    static final class r extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NewDlSearch f8642e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(NewDlSearch newDlSearch) {
            super(1);
            this.f8642e = newDlSearch;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                    NewDlSearch newDlSearch = this.f8642e;
                    newDlSearch.Q2(newDlSearch, myRcDeletResponse.getStatusDesc());
                }
                this.f8642e.S1().getDlobj().getDlLicno();
                this.f8642e.P1().E();
                NewDlSearch newDlSearch2 = this.f8642e;
                a.C0251a aVar = z9.a.f18947a;
                String Q1 = newDlSearch2.Q1();
                cm.l.c(Q1);
                newDlSearch2.U2(aVar.b(q.B0(Q1).toString()));
                v8.h A2 = this.f8642e.A2();
                NewDlSearch newDlSearch3 = this.f8642e;
                A2.G(newDlSearch3, newDlSearch3.z2().l(), 2);
            } else if (!ka.c.f13158a.m(myRcDeletResponse.getStatusDesc())) {
                NewDlSearch newDlSearch4 = this.f8642e;
                newDlSearch4.Q2(newDlSearch4, myRcDeletResponse.getStatusDesc());
            } else {
                this.f8642e.v2().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return pl.x.f30437a;
        }
    }

    public static final class s implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f8643e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ x f8644f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ cm.u f8645g;

        s(Context context, x xVar, cm.u uVar) {
            this.f8643e = context;
            this.f8644f = xVar;
            this.f8645g = uVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.f8643e, this.f8644f, ((Calendar) this.f8645g.f20234e).get(1), ((Calendar) this.f8645g.f20234e).get(2), ((Calendar) this.f8645g.f20234e).get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class t implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8646e;

        t(EditText editText) {
            this.f8646e = editText;
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
                this.f8646e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class u implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8647e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8648f;

        u(EditText editText, EditText editText2) {
            this.f8647e = editText;
            this.f8648f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8647e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8648f.requestFocus();
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
                    this.f8647e.setText("");
                }
            }
        }
    }

    public static final class v implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8649e;

        v(EditText editText) {
            this.f8649e = editText;
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
                this.f8649e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class w implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8650e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8651f;

        w(EditText editText, EditText editText2) {
            this.f8650e = editText;
            this.f8651f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8650e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8651f.requestFocus();
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
                    this.f8650e.setText("");
                }
            }
        }
    }

    public static final class x implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cm.u f8652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f8653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f8654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f8655d;

        x(cm.u uVar, EditText editText, EditText editText2, EditText editText3) {
            this.f8652a = uVar;
            this.f8653b = editText;
            this.f8654c = editText2;
            this.f8655d = editText3;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            ((Calendar) this.f8652a.f20234e).set(1, i10);
            ((Calendar) this.f8652a.f20234e).set(2, i11);
            ((Calendar) this.f8652a.f20234e).set(5, i12);
            CharSequence format = DateFormat.format("dd", ((Calendar) this.f8652a.f20234e).getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", ((Calendar) this.f8652a.f20234e).getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", ((Calendar) this.f8652a.f20234e).getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                this.f8653b.setText(str);
                this.f8654c.setText(str2);
                this.f8655d.setText(str3);
                this.f8653b.clearFocus();
                this.f8654c.clearFocus();
                this.f8655d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    static final class y implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8656a;

        y(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8656a = lVar;
        }

        public final pl.c a() {
            return this.f8656a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8656a.invoke(obj);
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
    public static final void B2(NewDlSearch newDlSearch, CreateVirtualDocModle createVirtualDocModle) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.v2().dismiss();
        if (!p.o(createVirtualDocModle.getStatusCode(), "VTLD005", true)) {
            if (p.o(createVirtualDocModle.getStatusCode(), "VTLD001", true)) {
                newDlSearch.M1(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.k(), "Virtual DL Successfully Created!"), createVirtualDocModle.getCitizenDocInfo().getDocNumber().toString(), String.valueOf(createVirtualDocModle.getCitizenDocInfo().getDocId()), newDlSearch.S1());
                return;
            } else if (p.o(createVirtualDocModle.getStatusCode(), "VTLD014", true)) {
                if (newDlSearch.P1().c0() == null) {
                    try {
                        newDlSearch.v2().show();
                        newDlSearch.s2().X(newDlSearch.z2().k(), newDlSearch);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            } else if (ka.c.f13158a.m(createVirtualDocModle.getStatusDesc())) {
                newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to Create the Virtual DL, Please try after some time."));
                return;
            }
        }
        newDlSearch.Q2(newDlSearch.o2(), createVirtualDocModle.getStatusDesc().toString());
    }

    /* access modifiers changed from: private */
    public static final void C2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.v2().dismiss();
        newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to Create the Virtual DL, Please try after some time."));
    }

    /* access modifiers changed from: private */
    public static final void D2(NewDlSearch newDlSearch, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        Context o22;
        String b10;
        cm.l.f(newDlSearch, "this$0");
        try {
            if (!ka.c.f13158a.m(dLServiceResponseModleV1.getStatusCode())) {
                newDlSearch.v2().dismiss();
                if (p.p(dLServiceResponseModleV1.getStatusCode(), "NR090", false, 2, (Object) null)) {
                    newDlSearch.v2().dismiss();
                    v9.d.f17494a.D(newDlSearch.o2(), dLServiceResponseModleV1.getStatusDesc(), 1);
                } else if (p.p(dLServiceResponseModleV1.getStatusCode(), "NR091", false, 2, (Object) null)) {
                    newDlSearch.v2().dismiss();
                    v9.d.f17494a.D(newDlSearch.o2(), dLServiceResponseModleV1.getStatusDesc(), 2);
                }
            } else if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                newDlSearch.W2(dLServiceResponseModleV1.getDldetobj().get(0));
                newDlSearch.S1().getDlobj().getDlLicno();
                newDlSearch.S1().getDlobj().getDlLicno();
                a.C0251a aVar = z9.a.f18947a;
                String str = newDlSearch.P;
                cm.l.c(str);
                newDlSearch.P = aVar.b(q.B0(str).toString());
                newDlSearch.A2().G(newDlSearch, newDlSearch.z2().l(), 2);
            } else {
                newDlSearch.v2().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == -2) {
                    o22 = newDlSearch.o2();
                    b10 = newDlSearch.y2().b("kindly_etner_correct_details", "Kindly enter correct details");
                } else {
                    o22 = newDlSearch.o2();
                    b10 = newDlSearch.y2().b("no_details", "No Details are available.");
                }
                newDlSearch.Q2(o22, b10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            newDlSearch.v2().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.v2().dismiss();
        newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b("no_details", "No Details are available."));
    }

    /* access modifiers changed from: private */
    public static final void F2(NewDlSearch newDlSearch, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        cm.l.f(newDlSearch, "this$0");
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                newDlSearch.W2(dLServiceResponseModleV1.getDldetobj().get(0));
                newDlSearch.S1().getDlobj().getDlLicno();
                String dlLicno = newDlSearch.S1().getDlobj().getDlLicno();
                String j02 = newDlSearch.P1().j0(dlLicno);
                if (j02.equals("0")) {
                    j02 = newDlSearch.P1().j0(new km.f("\\s").b(dlLicno, ""));
                }
                if (j02 == null) {
                    return;
                }
                if (j02.length() != 0) {
                    cd.c s22 = newDlSearch.s2();
                    cm.l.c(j02);
                    s22.g(j02, newDlSearch);
                    return;
                }
                return;
            }
            newDlSearch.v2().dismiss();
            dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.v2().dismiss();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r3 = r3.getDlobj();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H2(com.nic.mparivahan.Dl.NewDlSearch r2, android.view.View r3) {
        /*
            java.lang.String r3 = "this$0"
            cm.l.f(r2, r3)
            com.nic.mparivahan.DB.DatabaseHelper r3 = r2.P1()     // Catch:{ Exception -> 0x0049 }
            java.util.ArrayList r3 = r3.c0()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r0 = "getDLDetailsList(...)"
            cm.l.e(r3, r0)     // Catch:{ Exception -> 0x0049 }
            r0 = 0
            java.lang.Object r1 = r3.get(r0)     // Catch:{ Exception -> 0x0049 }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x0049 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.getDldetails()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            ka.c$a r1 = ka.c.f13158a     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x0049 }
            com.nic.mparivahan.Dl.Model.DLDocument r3 = (com.nic.mparivahan.Dl.Model.DLDocument) r3     // Catch:{ Exception -> 0x0049 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r3.getDldetails()     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x0038
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r3.getDlobj()     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.getDlLicno()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            boolean r3 = r1.m(r3)     // Catch:{ Exception -> 0x0049 }
            if (r3 != 0) goto L_0x0049
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0049 }
            java.lang.Class<com.nic.mparivahan.Dl.DLVirtualRcScreen> r0 = com.nic.mparivahan.Dl.DLVirtualRcScreen.class
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x0049 }
            r2.startActivity(r3)     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.H2(com.nic.mparivahan.Dl.NewDlSearch, android.view.View):void");
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

    private final boolean L1(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '-') {
                i10++;
            }
        }
        return i10 <= 4;
    }

    /* access modifiers changed from: private */
    public static final void L2(NewDlSearch newDlSearch, Dialog dialog, View view) {
        cm.l.f(newDlSearch, "this$0");
        cm.l.f(dialog, "$d");
        p6 p6Var = newDlSearch.f8619b0;
        if (p6Var == null) {
            cm.l.v("binding");
            p6Var = null;
        }
        p6Var.f27941h.setVisibility(0);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M2(EditText editText, EditText editText2, EditText editText3, Dialog dialog, NewDlSearch newDlSearch, String str, View view) {
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        cm.l.f(newDlSearch, "this$0");
        cm.l.f(str, "$dl_number");
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
                    p6 p6Var = newDlSearch.f8619b0;
                    p6 p6Var2 = null;
                    if (p6Var == null) {
                        cm.l.v("binding");
                        p6Var = null;
                    }
                    p6Var.f27941h.setVisibility(8);
                    p6 p6Var3 = newDlSearch.f8619b0;
                    if (p6Var3 == null) {
                        cm.l.v("binding");
                    } else {
                        p6Var2 = p6Var3;
                    }
                    p6Var2.f27948o.setVisibility(0);
                    newDlSearch.q2().h(str, sb3, newDlSearch);
                    return;
                }
            }
        }
        Toast.makeText(newDlSearch, newDlSearch.y2().b("edit_dl_serv_dob", "Please enter the valid dob"), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, NewDlSearch newDlSearch, DldetobjX dldetobjX, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(newDlSearch, "this$0");
        cm.l.f(dldetobjX, "$dlobj");
        dialog.dismiss();
        try {
            p6 p6Var = newDlSearch.f8619b0;
            p6 p6Var2 = null;
            if (p6Var == null) {
                cm.l.v("binding");
                p6Var = null;
            }
            p6Var.f27942i.setText("");
            p6 p6Var3 = newDlSearch.f8619b0;
            if (p6Var3 == null) {
                cm.l.v("binding");
                p6Var3 = null;
            }
            p6Var3.f27936c.setText("");
            p6 p6Var4 = newDlSearch.f8619b0;
            if (p6Var4 == null) {
                cm.l.v("binding");
            } else {
                p6Var2 = p6Var4;
            }
            p6Var2.f27936c.setHint("DD - MM - YYYY");
            newDlSearch.P1().L0(dldetobjX.getDlobj().getDlLicno(), dldetobjX, str, dldetobjX.getBioObj().getBioDob().toString());
            newDlSearch.o3();
        } catch (Exception e10) {
            Log.d("new_design", String.valueOf(e10.getMessage()));
        }
    }

    private final void N2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(y2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y2().b("button_proceed", "Proceed"));
        textView2.setText(y2().b("button_cancel", "Cancel"));
        textView2.setOnClickListener(new i1(dialog));
        textView.setOnClickListener(new j1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void O2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void P2(Dialog dialog, NewDlSearch newDlSearch, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(newDlSearch, "this$0");
        dialog.dismiss();
        p6 p6Var = newDlSearch.f8619b0;
        p6 p6Var2 = null;
        if (p6Var == null) {
            cm.l.v("binding");
            p6Var = null;
        }
        String obj = p6Var.f27950q.getText().toString();
        if (obj != null && obj.length() != 0) {
            try {
                newDlSearch.v2().show();
                p6 p6Var3 = newDlSearch.f8619b0;
                if (p6Var3 == null) {
                    cm.l.v("binding");
                    p6Var3 = null;
                }
                String obj2 = q.B0(p6Var3.f27950q.getText().toString()).toString();
                Log.e("Catch - ", obj2);
                String j02 = newDlSearch.P1().j0(obj2);
                if (j02.equals("0")) {
                    DatabaseHelper P1 = newDlSearch.P1();
                    p6 p6Var4 = newDlSearch.f8619b0;
                    if (p6Var4 == null) {
                        cm.l.v("binding");
                    } else {
                        p6Var2 = p6Var4;
                    }
                    j02 = P1.j0(new km.f("\\s").b(p6Var2.f27950q.getText().toString(), ""));
                }
                if (j02 == null) {
                    return;
                }
                if (j02.length() != 0) {
                    cd.c s22 = newDlSearch.s2();
                    cm.l.c(j02);
                    s22.h(j02, newDlSearch);
                }
            } catch (Exception e10) {
                newDlSearch.v2().dismiss();
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void R2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01bc, code lost:
        r1 = r1.getDlobj();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void X1() {
        /*
            r8 = this;
            java.lang.String r0 = "getDLDetailsListDoc(...)"
            r1 = 2131362938(0x7f0a047a, float:1.834567E38)
            android.view.View r1 = r8.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            cm.l.e(r1, r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.a3(r1)
            r1 = 2131363527(0x7f0a06c7, float:1.8346865E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r8.b3(r1)
            r1 = 2131362693(0x7f0a0385, float:1.8345174E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.X2(r1)
            r1 = 2131362694(0x7f0a0386, float:1.8345176E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.Y2(r1)
            r1 = 2131362697(0x7f0a0389, float:1.8345182E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r8.Z2(r1)
            r1 = 2131364218(0x7f0a097a, float:1.8348267E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r8.j3(r1)
            r1 = 2131362483(0x7f0a02b3, float:1.8344748E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r8.V2(r1)
            r1 = 2131364274(0x7f0a09b2, float:1.834838E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r8.k3(r1)
            com.nic.mparivahan.DB.DatabaseHelper r1 = com.nic.mparivahan.DB.DatabaseHelper.A0(r8)
            java.lang.String r3 = "getInstance(...)"
            cm.l.e(r1, r3)
            r8.T2(r1)
            r1 = 2131363787(0x7f0a07cb, float:1.8347393E38)
            android.view.View r1 = r8.findViewById(r1)
            cm.l.e(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r8.h3(r1)
            android.widget.LinearLayout r1 = r8.t2()
            ua.r1 r2 = new ua.r1
            r2.<init>(r8)
            r1.setOnClickListener(r2)
            android.widget.EditText r1 = r8.T1()
            ua.u0 r2 = new ua.u0
            r2.<init>()
            r1.setOnEditorActionListener(r2)
            android.widget.EditText r1 = r8.T1()
            com.nic.mparivahan.Dl.NewDlSearch$h r2 = new com.nic.mparivahan.Dl.NewDlSearch$h
            r2.<init>(r8)
            r1.addTextChangedListener(r2)
            android.widget.EditText r1 = r8.U1()
            com.nic.mparivahan.Dl.NewDlSearch$i r2 = new com.nic.mparivahan.Dl.NewDlSearch$i
            r2.<init>(r8)
            r1.addTextChangedListener(r2)
            android.widget.EditText r1 = r8.T1()
            com.nic.mparivahan.Dl.NewDlSearch$j r2 = new com.nic.mparivahan.Dl.NewDlSearch$j
            r2.<init>(r8)
            r1.addTextChangedListener(r2)
            android.widget.EditText r1 = r8.U1()
            ua.v0 r2 = new ua.v0
            r2.<init>(r8)
            r1.setOnKeyListener(r2)
            android.widget.EditText r1 = r8.U1()
            com.nic.mparivahan.Dl.NewDlSearch$k r2 = new com.nic.mparivahan.Dl.NewDlSearch$k
            r2.<init>(r8)
            r1.addTextChangedListener(r2)
            android.widget.EditText r1 = r8.V1()
            ua.w0 r2 = new ua.w0
            r2.<init>(r8)
            r1.setOnKeyListener(r2)
            android.widget.EditText r1 = r8.V1()
            com.nic.mparivahan.Dl.NewDlSearch$l r2 = new com.nic.mparivahan.Dl.NewDlSearch$l
            r2.<init>(r8)
            r1.addTextChangedListener(r2)
            com.nic.mparivahan.Dl.NewDlSearch$m r1 = new com.nic.mparivahan.Dl.NewDlSearch$m
            r1.<init>(r8)
            android.widget.LinearLayout r1 = r8.n2()
            ua.x0 r2 = new ua.x0
            r2.<init>(r8)
            r1.setOnClickListener(r2)
            com.nic.mparivahan.DB.DatabaseHelper r1 = r8.P1()
            java.util.ArrayList r1 = r1.i0()
            r2 = 8
            java.lang.String r3 = "binding"
            r4 = 0
            if (r1 == 0) goto L_0x0215
            ni.p6 r1 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r1 != 0) goto L_0x012f
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r1 = r4
            goto L_0x012f
        L_0x012c:
            r0 = move-exception
            goto L_0x0211
        L_0x012f:
            com.nic.mparivahan.MyTextView r1 = r1.f27953t     // Catch:{ Exception -> 0x012c }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x012c }
            androidx.recyclerview.widget.RecyclerView r1 = r8.w2()     // Catch:{ Exception -> 0x012c }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.DB.DatabaseHelper r1 = r8.P1()     // Catch:{ Exception -> 0x012c }
            java.util.ArrayList r1 = r1.i0()     // Catch:{ Exception -> 0x012c }
            cm.l.e(r1, r0)     // Catch:{ Exception -> 0x012c }
            androidx.recyclerview.widget.RecyclerView r5 = r8.w2()     // Catch:{ Exception -> 0x012c }
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x012c }
            r7 = 0
            r6.<init>(r8, r7, r7)     // Catch:{ Exception -> 0x012c }
            r5.setLayoutManager(r6)     // Catch:{ Exception -> 0x012c }
            va.e r5 = new va.e     // Catch:{ Exception -> 0x012c }
            r5.<init>(r8, r1)     // Catch:{ Exception -> 0x012c }
            androidx.recyclerview.widget.RecyclerView r1 = r8.w2()     // Catch:{ Exception -> 0x012c }
            r1.setAdapter(r5)     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.DB.DatabaseHelper r1 = r8.P1()     // Catch:{ Exception -> 0x012c }
            java.util.ArrayList r1 = r1.i0()     // Catch:{ Exception -> 0x012c }
            cm.l.e(r1, r0)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x0172
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x0172:
            android.widget.TextView r0 = r0.f27950q     // Catch:{ Exception -> 0x012c }
            java.lang.Object r5 = r1.get(r7)     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5     // Catch:{ Exception -> 0x012c }
            java.lang.String r5 = r5.getDocnumber()     // Catch:{ Exception -> 0x012c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x012c }
            java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x012c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x012c }
            r0.setText(r5)     // Catch:{ Exception -> 0x012c }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x01cc
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01a1
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01a1:
            android.widget.LinearLayout r0 = r0.B     // Catch:{ Exception -> 0x012c }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01ae
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01ae:
            android.widget.TextView r0 = r0.f27950q     // Catch:{ Exception -> 0x012c }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x012c }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.getDldetails()     // Catch:{ Exception -> 0x012c }
            if (r1 == 0) goto L_0x01c7
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x012c }
            if (r1 == 0) goto L_0x01c7
            java.lang.String r1 = r1.getDlLicno()     // Catch:{ Exception -> 0x012c }
            goto L_0x01c8
        L_0x01c7:
            r1 = r4
        L_0x01c8:
            r0.setText(r1)     // Catch:{ Exception -> 0x012c }
            goto L_0x022f
        L_0x01cc:
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01d4
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01d4:
            android.widget.LinearLayout r0 = r0.B     // Catch:{ Exception -> 0x012c }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01e1
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01e1:
            android.widget.ImageView r0 = r0.f27941h     // Catch:{ Exception -> 0x012c }
            r0.setVisibility(r7)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01ee
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01ee:
            android.widget.LinearLayout r0 = r0.f27937d     // Catch:{ Exception -> 0x012c }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x01fb
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x01fb:
            android.widget.TextView r0 = r0.A     // Catch:{ Exception -> 0x012c }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x012c }
            ni.p6 r0 = r8.f8619b0     // Catch:{ Exception -> 0x012c }
            if (r0 != 0) goto L_0x0208
            cm.l.v(r3)     // Catch:{ Exception -> 0x012c }
            r0 = r4
        L_0x0208:
            android.widget.LinearLayout r0 = r0.f27943j     // Catch:{ Exception -> 0x012c }
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setAlpha(r1)     // Catch:{ Exception -> 0x012c }
            goto L_0x022f
        L_0x0211:
            r0.printStackTrace()
            goto L_0x022f
        L_0x0215:
            ni.p6 r0 = r8.f8619b0
            if (r0 != 0) goto L_0x021d
            cm.l.v(r3)
            r0 = r4
        L_0x021d:
            com.nic.mparivahan.MyTextView r0 = r0.f27953t
            r0.setVisibility(r2)
            ni.p6 r0 = r8.f8619b0
            if (r0 != 0) goto L_0x022a
            cm.l.v(r3)
            r0 = r4
        L_0x022a:
            android.widget.LinearLayout r0 = r0.B
            r0.setVisibility(r2)
        L_0x022f:
            com.nic.mparivahan.Dl.NewDlSearch$n r0 = new com.nic.mparivahan.Dl.NewDlSearch$n
            r0.<init>(r8)
            android.widget.ImageView r1 = r8.R1()
            com.nic.mparivahan.Dl.NewDlSearch$a r2 = new com.nic.mparivahan.Dl.NewDlSearch$a
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
            ni.p6 r1 = r8.f8619b0
            if (r1 != 0) goto L_0x0248
            cm.l.v(r3)
            r1 = r4
        L_0x0248:
            android.widget.TextView r1 = r1.f27936c
            ua.y0 r2 = new ua.y0
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
            ni.p6 r0 = r8.f8619b0
            if (r0 != 0) goto L_0x025a
            cm.l.v(r3)
            r0 = r4
        L_0x025a:
            android.widget.LinearLayout r0 = r0.f27937d
            ua.a1 r1 = new ua.a1
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r8.x2()
            ua.b1 r1 = new ua.b1
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            za.a r0 = r8.q2()
            androidx.lifecycle.a0 r0 = r0.n()
            com.nic.mparivahan.Dl.NewDlSearch$b r1 = new com.nic.mparivahan.Dl.NewDlSearch$b
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            za.a r0 = r8.q2()
            androidx.lifecycle.a0 r0 = r0.o()
            com.nic.mparivahan.Dl.NewDlSearch$c r1 = new com.nic.mparivahan.Dl.NewDlSearch$c
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            cd.c r0 = r8.s2()
            androidx.lifecycle.a0 r0 = r0.v()
            com.nic.mparivahan.Dl.NewDlSearch$d r1 = new com.nic.mparivahan.Dl.NewDlSearch$d
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            cd.c r0 = r8.s2()
            androidx.lifecycle.a0 r0 = r0.w()
            com.nic.mparivahan.Dl.NewDlSearch$e r1 = new com.nic.mparivahan.Dl.NewDlSearch$e
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            ni.p6 r0 = r8.f8619b0
            if (r0 != 0) goto L_0x02cc
            cm.l.v(r3)
            goto L_0x02cd
        L_0x02cc:
            r4 = r0
        L_0x02cd:
            android.widget.ImageView r0 = r4.f27941h
            ua.c1 r1 = new ua.c1
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            za.a r0 = r8.q2()
            androidx.lifecycle.a0 r0 = r0.l()
            ua.d1 r1 = new ua.d1
            r1.<init>(r8)
            r0.g(r8, r1)
            za.a r0 = r8.q2()
            androidx.lifecycle.a0 r0 = r0.m()
            ua.p0 r1 = new ua.p0
            r1.<init>(r8)
            r0.g(r8, r1)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.s()
            ua.q0 r1 = new ua.q0
            r1.<init>(r8)
            r0.g(r8, r1)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.r()
            ua.r0 r1 = new ua.r0
            r1.<init>(r8)
            r0.g(r8, r1)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.v()
            ua.s0 r1 = new ua.s0
            r1.<init>(r8)
            r0.g(r8, r1)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.i()
            ua.t0 r1 = new ua.t0
            r1.<init>(r8)
            r0.g(r8, r1)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.y()
            com.nic.mparivahan.Dl.NewDlSearch$f r1 = new com.nic.mparivahan.Dl.NewDlSearch$f
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            v8.h r0 = r8.A2()
            androidx.lifecycle.a0 r0 = r0.x()
            com.nic.mparivahan.Dl.NewDlSearch$g r1 = new com.nic.mparivahan.Dl.NewDlSearch$g
            r1.<init>(r8)
            com.nic.mparivahan.Dl.NewDlSearch$y r2 = new com.nic.mparivahan.Dl.NewDlSearch$y
            r2.<init>(r1)
            r0.g(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.X1():void");
    }

    /* access modifiers changed from: private */
    public static final boolean Y1(NewDlSearch newDlSearch, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(newDlSearch, "this$0");
        if (i10 != 67 || newDlSearch.V1().getText().length() != 0) {
            return false;
        }
        newDlSearch.U1().requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Z1(com.nic.mparivahan.Dl.NewDlSearch r9, android.view.View r10) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r9, r0)
            android.widget.EditText r0 = r9.W1()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x001a:
            r6 = 32
            if (r4 > r1) goto L_0x003f
            if (r5 != 0) goto L_0x0022
            r7 = r4
            goto L_0x0023
        L_0x0022:
            r7 = r1
        L_0x0023:
            char r7 = r0.charAt(r7)
            int r7 = cm.l.h(r7, r6)
            if (r7 > 0) goto L_0x002f
            r7 = r2
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            if (r5 != 0) goto L_0x0039
            if (r7 != 0) goto L_0x0036
            r5 = r2
            goto L_0x001a
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0039:
            if (r7 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            int r1 = r1 + -1
            goto L_0x001a
        L_0x003f:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r1 = "this as java.lang.String).toUpperCase()"
            cm.l.e(r0, r1)
            android.widget.EditText r1 = r9.W1()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r4 = 10
            if (r1 >= r4) goto L_0x007a
            android.content.Context r10 = r9.o2()
            ld.c r0 = r9.y2()
            java.lang.String r1 = "dl_validation_msg"
            java.lang.String r2 = "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"
        L_0x0071:
            java.lang.String r0 = r0.b(r1, r2)
            r9.Q2(r10, r0)
            goto L_0x0194
        L_0x007a:
            android.widget.EditText r1 = r9.W1()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            if (r1 < r4) goto L_0x0194
            android.widget.EditText r1 = r9.W1()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            int r4 = r4 - r2
            r5 = r3
            r7 = r5
        L_0x009f:
            if (r5 > r4) goto L_0x00c2
            if (r7 != 0) goto L_0x00a5
            r8 = r5
            goto L_0x00a6
        L_0x00a5:
            r8 = r4
        L_0x00a6:
            char r8 = r1.charAt(r8)
            int r8 = cm.l.h(r8, r6)
            if (r8 > 0) goto L_0x00b2
            r8 = r2
            goto L_0x00b3
        L_0x00b2:
            r8 = r3
        L_0x00b3:
            if (r7 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00b9
            r7 = r2
            goto L_0x009f
        L_0x00b9:
            int r5 = r5 + 1
            goto L_0x009f
        L_0x00bc:
            if (r8 != 0) goto L_0x00bf
            goto L_0x00c2
        L_0x00bf:
            int r4 = r4 + -1
            goto L_0x009f
        L_0x00c2:
            int r4 = r4 + r2
            java.lang.CharSequence r1 = r1.subSequence(r5, r4)
            java.lang.String r1 = r1.toString()
            boolean r1 = r9.L1(r1)
            if (r1 == 0) goto L_0x0194
            android.widget.EditText r1 = r9.W1()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            int r4 = r4 - r2
            r5 = r3
            r7 = r5
        L_0x00e4:
            if (r5 > r4) goto L_0x0107
            if (r7 != 0) goto L_0x00ea
            r8 = r5
            goto L_0x00eb
        L_0x00ea:
            r8 = r4
        L_0x00eb:
            char r8 = r1.charAt(r8)
            int r8 = cm.l.h(r8, r6)
            if (r8 > 0) goto L_0x00f7
            r8 = r2
            goto L_0x00f8
        L_0x00f7:
            r8 = r3
        L_0x00f8:
            if (r7 != 0) goto L_0x0101
            if (r8 != 0) goto L_0x00fe
            r7 = r2
            goto L_0x00e4
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x0101:
            if (r8 != 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            int r4 = r4 + -1
            goto L_0x00e4
        L_0x0107:
            int r4 = r4 + r2
            java.lang.CharSequence r1 = r1.subSequence(r5, r4)
            java.lang.String r1 = r1.toString()
            android.widget.EditText r2 = r9.W1()
            cm.l.c(r10)
            boolean r10 = r9.u2(r1, r2, r10)
            if (r10 != 0) goto L_0x0194
            r10 = 2
            r1 = 3
            java.lang.String r2 = r0.substring(r10, r1)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r2, r4)
            java.lang.String r5 = "-"
            r6 = 0
            boolean r2 = km.q.F(r2, r5, r3, r10, r6)
            java.lang.String r7 = " "
            if (r2 != 0) goto L_0x0145
            java.lang.String r1 = r0.substring(r10, r1)
            cm.l.e(r1, r4)
            boolean r10 = km.q.F(r1, r7, r3, r10, r6)
            if (r10 == 0) goto L_0x0141
            goto L_0x0145
        L_0x0141:
            r9.S2(r0)
            goto L_0x015c
        L_0x0145:
            km.f r10 = new km.f
            r10.<init>((java.lang.String) r5)
            java.lang.String r1 = ""
            java.lang.String r10 = r10.c(r0, r1)
            km.f r0 = new km.f
            r0.<init>((java.lang.String) r7)
            java.lang.String r10 = r0.c(r10, r1)
            r9.S2(r10)
        L_0x015c:
            ka.c$a r10 = ka.c.f13158a
            java.lang.String r0 = r9.P
            boolean r10 = r10.m(r0)
            if (r10 == 0) goto L_0x0174
            android.content.Context r10 = r9.o2()
            ld.c r0 = r9.y2()
            java.lang.String r1 = "edit_dl_serv_dob"
            java.lang.String r2 = "Please enter the dob"
            goto L_0x0071
        L_0x0174:
            android.app.ProgressDialog r10 = r9.v2()
            r10.show()
            za.a r10 = r9.q2()
            android.widget.EditText r0 = r9.W1()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r9.P
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.i(r0, r1, r9)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.Z1(com.nic.mparivahan.Dl.NewDlSearch, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void a2(NewDlSearch newDlSearch, n nVar, View view) {
        cm.l.f(newDlSearch, "this$0");
        cm.l.f(nVar, "$dateSetListenerDialog");
        DatePickerDialog datePickerDialog = new DatePickerDialog(newDlSearch.o2(), nVar, newDlSearch.R.get(1), newDlSearch.R.get(2), newDlSearch.R.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    public static final void b2(NewDlSearch newDlSearch, View view) {
        cm.l.f(newDlSearch, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(newDlSearch)) {
            newDlSearch.N2(newDlSearch, newDlSearch.y2().b(v9.f.f17510a.z0(), "Are you sure, You want to delete ?"));
        } else {
            Toast.makeText(newDlSearch, newDlSearch.y2().b("label_log_check_internet", newDlSearch.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r5 = r5.getBioObj();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c2(com.nic.mparivahan.Dl.NewDlSearch r4, android.view.View r5) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            android.app.ProgressDialog r5 = r4.v2()     // Catch:{ Exception -> 0x004d }
            r5.show()     // Catch:{ Exception -> 0x004d }
            com.nic.mparivahan.DB.DatabaseHelper r5 = r4.P1()     // Catch:{ Exception -> 0x004d }
            java.util.ArrayList r5 = r5.i0()     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "getDLDetailsListDoc(...)"
            cm.l.e(r5, r0)     // Catch:{ Exception -> 0x004d }
            r0 = 0
            java.lang.Object r1 = r5.get(r0)     // Catch:{ Exception -> 0x004d }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = r1.getDocnumber()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004d }
            za.a r2 = r4.q2()     // Catch:{ Exception -> 0x004d }
            z9.a$a r3 = z9.a.f18947a     // Catch:{ Exception -> 0x004d }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x004d }
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5     // Catch:{ Exception -> 0x004d }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r5.getDldetails()     // Catch:{ Exception -> 0x004d }
            if (r5 == 0) goto L_0x004f
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r5.getBioObj()     // Catch:{ Exception -> 0x004d }
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = r5.getBioDob()     // Catch:{ Exception -> 0x004d }
            goto L_0x0050
        L_0x004d:
            r4 = move-exception
            goto L_0x0064
        L_0x004f:
            r5 = 0
        L_0x0050:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x004d }
            java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = r3.b(r5)     // Catch:{ Exception -> 0x004d }
            r2.j(r1, r5, r4)     // Catch:{ Exception -> 0x004d }
            goto L_0x0067
        L_0x0064:
            r4.printStackTrace()
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.c2(com.nic.mparivahan.Dl.NewDlSearch, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void d2(NewDlSearch newDlSearch, View view) {
        cm.l.f(newDlSearch, "this$0");
        p6 p6Var = newDlSearch.f8619b0;
        p6 p6Var2 = null;
        if (p6Var == null) {
            cm.l.v("binding");
            p6Var = null;
        }
        p6Var.f27941h.setVisibility(8);
        p6 p6Var3 = newDlSearch.f8619b0;
        if (p6Var3 == null) {
            cm.l.v("binding");
        } else {
            p6Var2 = p6Var3;
        }
        newDlSearch.I2(newDlSearch, q.B0(p6Var2.f27950q.getText().toString()).toString());
    }

    /* access modifiers changed from: private */
    public static final void e2(NewDlSearch newDlSearch, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        ImageView imageView;
        cm.l.f(newDlSearch, "this$0");
        p6 p6Var = null;
        try {
            p6 p6Var2 = newDlSearch.f8619b0;
            if (p6Var2 == null) {
                cm.l.v("binding");
                p6Var2 = null;
            }
            p6Var2.f27948o.setVisibility(8);
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                p6 p6Var3 = newDlSearch.f8619b0;
                if (p6Var3 == null) {
                    cm.l.v("binding");
                    p6Var3 = null;
                }
                p6Var3.f27941h.setVisibility(8);
                p6 p6Var4 = newDlSearch.f8619b0;
                if (p6Var4 == null) {
                    cm.l.v("binding");
                    p6Var4 = null;
                }
                p6Var4.f27937d.setVisibility(0);
                p6 p6Var5 = newDlSearch.f8619b0;
                if (p6Var5 == null) {
                    cm.l.v("binding");
                    p6Var5 = null;
                }
                p6Var5.A.setVisibility(0);
                p6 p6Var6 = newDlSearch.f8619b0;
                if (p6Var6 == null) {
                    cm.l.v("binding");
                    p6Var6 = null;
                }
                p6Var6.f27943j.setAlpha(1.0f);
                newDlSearch.P1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                return;
            }
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == -2) {
                p6 p6Var7 = newDlSearch.f8619b0;
                if (p6Var7 == null) {
                    cm.l.v("binding");
                    p6Var7 = null;
                }
                imageView = p6Var7.f27941h;
            } else {
                p6 p6Var8 = newDlSearch.f8619b0;
                if (p6Var8 == null) {
                    cm.l.v("binding");
                    p6Var8 = null;
                }
                imageView = p6Var8.f27941h;
            }
            imageView.setVisibility(0);
        } catch (Exception e10) {
            p6 p6Var9 = newDlSearch.f8619b0;
            if (p6Var9 == null) {
                cm.l.v("binding");
                p6Var9 = null;
            }
            p6Var9.f27948o.setVisibility(8);
            p6 p6Var10 = newDlSearch.f8619b0;
            if (p6Var10 == null) {
                cm.l.v("binding");
            } else {
                p6Var = p6Var10;
            }
            p6Var.f27941h.setVisibility(0);
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        p6 p6Var = newDlSearch.f8619b0;
        p6 p6Var2 = null;
        if (p6Var == null) {
            cm.l.v("binding");
            p6Var = null;
        }
        p6Var.f27948o.setVisibility(8);
        p6 p6Var3 = newDlSearch.f8619b0;
        if (p6Var3 == null) {
            cm.l.v("binding");
        } else {
            p6Var2 = p6Var3;
        }
        p6Var2.f27941h.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void g2(NewDlSearch newDlSearch, SendOtpResult sendOtpResult) {
        cm.l.f(newDlSearch, "this$0");
        try {
            newDlSearch.v2().dismiss();
            if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                NewDlSearch newDlSearch2 = newDlSearch;
                NewDlSearch newDlSearch3 = newDlSearch;
                newDlSearch.Q = yc.i.f18692a.m(newDlSearch2, newDlSearch3, new ld.g(newDlSearch).l(), newDlSearch.A2(), String.valueOf(sendOtpResult.getRecordId()), q.B0(newDlSearch.S1().getDlobj().getDlLicno().toString()).toString(), "DL", newDlSearch.S1().getBioObj().getBioDob().toString(), newDlSearch.v2());
            } else if (!ka.c.f13158a.m(sendOtpResult.getStatusDesc())) {
                newDlSearch.Q2(newDlSearch, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            newDlSearch.v2().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.v2().dismiss();
        newDlSearch.Q2(newDlSearch, newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to create the virtual DL, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void i2(NewDlSearch newDlSearch, CitzValidDoc citzValidDoc) {
        cm.l.f(newDlSearch, "this$0");
        try {
            Long l10 = null;
            if (p.p(citzValidDoc.getStatusCode(), "AL001", false, 2, (Object) null)) {
                Dialog dialog = newDlSearch.Q;
                if (dialog != null) {
                    cm.l.c(dialog);
                    dialog.dismiss();
                    newDlSearch.v2().dismiss();
                }
                c.a aVar = ka.c.f13158a;
                if (aVar.m(citzValidDoc.getParam())) {
                    Context o22 = newDlSearch.o2();
                    String b10 = newDlSearch.y2().b(v9.f.f17510a.k(), "Virtual DL successfully created.");
                    CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                    String valueOf = String.valueOf(citizenDocInfo != null ? citizenDocInfo.getDocNumber() : null);
                    CitizenDocInfoX citizenDocInfo2 = citzValidDoc.getCitizenDocInfo();
                    if (citizenDocInfo2 != null) {
                        l10 = citizenDocInfo2.getDocId();
                    }
                    newDlSearch.M1(o22, b10, valueOf, String.valueOf(l10), newDlSearch.S1());
                    return;
                }
                if (newDlSearch.v2().isShowing()) {
                    newDlSearch.v2().dismiss();
                }
                if (!aVar.m(citzValidDoc.getParam())) {
                    Dialog dialog2 = newDlSearch.Q;
                    if (dialog2 != null) {
                        cm.l.c(dialog2);
                        dialog2.dismiss();
                    }
                    newDlSearch.Q2(newDlSearch, citzValidDoc.getParam());
                    return;
                }
                Dialog dialog3 = newDlSearch.Q;
                if (dialog3 != null) {
                    cm.l.c(dialog3);
                    dialog3.dismiss();
                }
                newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to add Virtual DL, Try after some time"));
                return;
            }
            newDlSearch.v2().dismiss();
            Toast.makeText(newDlSearch, citzValidDoc.getStatusDesc(), 1).show();
        } catch (Exception unused) {
            if (newDlSearch.v2().isShowing()) {
                newDlSearch.v2().dismiss();
            }
            Dialog dialog4 = newDlSearch.Q;
            if (dialog4 != null) {
                cm.l.c(dialog4);
                dialog4.dismiss();
            }
            newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to add Virtual DL, Try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(NewDlSearch newDlSearch, String str) {
        cm.l.f(newDlSearch, "this$0");
        Log.e("Test", str.toString());
        newDlSearch.v2().dismiss();
        Dialog dialog = newDlSearch.Q;
        if (dialog != null) {
            cm.l.c(dialog);
            dialog.dismiss();
        }
        newDlSearch.Q2(newDlSearch.o2(), newDlSearch.y2().b(v9.f.f17510a.J0(), "Unable to add Virtual DL, Try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void k2(NewDlSearch newDlSearch, View view) {
        cm.l.f(newDlSearch, "this$0");
        newDlSearch.finish();
    }

    /* access modifiers changed from: private */
    public static final boolean l2(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final boolean m2(NewDlSearch newDlSearch, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(newDlSearch, "this$0");
        if (i10 != 67) {
            return false;
        }
        Editable text = newDlSearch.U1().getText();
        cm.l.e(text, "getText(...)");
        if (text.length() != 0) {
            return false;
        }
        newDlSearch.T1().requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public final void p3() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", this.R.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", this.R.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", this.R.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        CharSequence format4 = DateFormat.format("dd", this.R.getTime());
        cm.l.d(format4, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) format4;
        CharSequence format5 = DateFormat.format("MM", this.R.getTime());
        cm.l.d(format5, "null cannot be cast to non-null type kotlin.String");
        String str5 = (String) format5;
        CharSequence format6 = DateFormat.format("yyyy", this.R.getTime());
        cm.l.d(format6, "null cannot be cast to non-null type kotlin.String");
        String str6 = (String) format6;
        try {
            T1().setText(str4);
            U1().setText(str5);
            V1().setText(str6);
        } catch (Exception unused) {
        }
    }

    public final v8.h A2() {
        v8.h hVar = this.f8622e0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final void I2(Context context, String str) {
        Context context2 = context;
        cm.l.f(str, "dl_number");
        cm.l.c(context);
        Dialog dialog = new Dialog(context2);
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
        cm.u uVar = new cm.u();
        uVar.f20234e = Calendar.getInstance();
        View findViewById7 = dialog.findViewById(R.id.head);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.verify_text_view);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById9 = dialog.findViewById(R.id.cancle_txt);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById7).setText(y2().b(v9.f.f17510a.W0(), "Verify your DL"));
        ((TextView) findViewById8).setText(y2().b("vahan_btn_verify", "Verify"));
        ((TextView) findViewById9).setText(y2().b("button_cancel", "Cancel"));
        View findViewById10 = dialog.findViewById(R.id.dob_badge);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById10).setText(y2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) findViewById6).setOnClickListener(new s(context2, new x(uVar, editText3, editText2, editText), uVar));
        editText3.setOnEditorActionListener(new e1());
        editText3.addTextChangedListener(new t(editText2));
        editText3.addTextChangedListener(new u(editText3, editText2));
        editText2.addTextChangedListener(new v(editText));
        editText2.setOnKeyListener(new f1(editText2, editText3));
        editText2.addTextChangedListener(new w(editText2, editText));
        ((CardView) findViewById2).setOnClickListener(new g1(this, dialog));
        ((CardView) findViewById).setOnClickListener(new h1(editText, editText2, editText3, dialog, this, str));
        dialog.show();
    }

    public final void M1(Context context, String str, String str2, String str3, DldetobjX dldetobjX) {
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
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(y2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y2().b("btn_ok", "OK"));
        textView.setOnClickListener(new q1(dialog, this, dldetobjX, str3));
        dialog.show();
    }

    public final Calendar O1() {
        return this.R;
    }

    public final DatabaseHelper P1() {
        DatabaseHelper databaseHelper = this.V;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final String Q1() {
        return this.P;
    }

    public final void Q2(Context context, String str) {
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
        ((TextView) findViewById3).setText(y2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new p1(dialog));
        dialog.show();
    }

    public final ImageView R1() {
        ImageView imageView = this.Y;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("date_img");
        return null;
    }

    public final DldetobjX S1() {
        DldetobjX dldetobjX = this.U;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlobj");
        return null;
    }

    public final void S2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final EditText T1() {
        EditText editText = this.M;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobDateMain");
        return null;
    }

    public final void T2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.V = databaseHelper;
    }

    public final EditText U1() {
        EditText editText = this.N;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobMonthMain");
        return null;
    }

    public final void U2(String str) {
        this.P = str;
    }

    public final EditText V1() {
        EditText editText = this.O;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobYearMain");
        return null;
    }

    public final void V2(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.Y = imageView;
    }

    public final EditText W1() {
        EditText editText = this.K;
        if (editText != null) {
            return editText;
        }
        cm.l.v("etSearchDL");
        return null;
    }

    public final void W2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.U = dldetobjX;
    }

    public final void X2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.M = editText;
    }

    public final void Y2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.N = editText;
    }

    public final void Z2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.O = editText;
    }

    public final void a3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.K = editText;
    }

    public final void b3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.L = linearLayout;
    }

    public final void c3(Context context) {
        cm.l.f(context, "<set-?>");
        this.J = context;
    }

    public final void d3(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.H = dlService;
    }

    public final void e3(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public final void f3(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.f8621d0 = rcService;
    }

    public final void g3(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8620c0 = cVar;
    }

    public final void h3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.W = linearLayout;
    }

    public final void i3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void j3(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.X = recyclerView;
    }

    public final void k3(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.Z = imageView;
    }

    public final void l3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8618a0 = cVar;
    }

    public final void m3(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.S = gVar;
    }

    public final LinearLayout n2() {
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("llSearchDL");
        return null;
    }

    public final void n3(v8.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f8622e0 = hVar;
    }

    public final Context o2() {
        Context context = this.J;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ni.p6} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o3() {
        /*
            r7 = this;
            java.lang.String r0 = "getDLDetailsList(...)"
            com.nic.mparivahan.DB.DatabaseHelper r1 = r7.P1()
            java.util.ArrayList r1 = r1.c0()
            r2 = 8
            java.lang.String r3 = "binding"
            r4 = 0
            if (r1 == 0) goto L_0x0099
            ni.p6 r1 = r7.f8619b0     // Catch:{ Exception -> 0x001a }
            if (r1 != 0) goto L_0x001d
            cm.l.v(r3)     // Catch:{ Exception -> 0x001a }
            r1 = r4
            goto L_0x001d
        L_0x001a:
            r0 = move-exception
            goto L_0x0095
        L_0x001d:
            com.nic.mparivahan.MyTextView r1 = r1.f27953t     // Catch:{ Exception -> 0x001a }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x001a }
            androidx.recyclerview.widget.RecyclerView r1 = r7.w2()     // Catch:{ Exception -> 0x001a }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.DB.DatabaseHelper r1 = r7.P1()     // Catch:{ Exception -> 0x001a }
            java.util.ArrayList r1 = r1.c0()     // Catch:{ Exception -> 0x001a }
            cm.l.e(r1, r0)     // Catch:{ Exception -> 0x001a }
            androidx.recyclerview.widget.RecyclerView r2 = r7.w2()     // Catch:{ Exception -> 0x001a }
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x001a }
            r6 = 0
            r5.<init>(r7, r6, r6)     // Catch:{ Exception -> 0x001a }
            r2.setLayoutManager(r5)     // Catch:{ Exception -> 0x001a }
            va.e r2 = new va.e     // Catch:{ Exception -> 0x001a }
            r2.<init>(r7, r1)     // Catch:{ Exception -> 0x001a }
            androidx.recyclerview.widget.RecyclerView r1 = r7.w2()     // Catch:{ Exception -> 0x001a }
            r1.setAdapter(r2)     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.DB.DatabaseHelper r1 = r7.P1()     // Catch:{ Exception -> 0x001a }
            java.util.ArrayList r1 = r1.c0()     // Catch:{ Exception -> 0x001a }
            cm.l.e(r1, r0)     // Catch:{ Exception -> 0x001a }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x00b4
            ni.p6 r0 = r7.f8619b0     // Catch:{ Exception -> 0x001a }
            if (r0 != 0) goto L_0x006c
            cm.l.v(r3)     // Catch:{ Exception -> 0x001a }
            r0 = r4
        L_0x006c:
            android.widget.LinearLayout r0 = r0.B     // Catch:{ Exception -> 0x001a }
            r0.setVisibility(r6)     // Catch:{ Exception -> 0x001a }
            ni.p6 r0 = r7.f8619b0     // Catch:{ Exception -> 0x001a }
            if (r0 != 0) goto L_0x0079
            cm.l.v(r3)     // Catch:{ Exception -> 0x001a }
            r0 = r4
        L_0x0079:
            android.widget.TextView r0 = r0.f27950q     // Catch:{ Exception -> 0x001a }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x001a }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.getDldetails()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0091
            com.nic.mparivahan.Dl.Model.DlobjX r1 = r1.getDlobj()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x0091
            java.lang.String r4 = r1.getDlLicno()     // Catch:{ Exception -> 0x001a }
        L_0x0091:
            r0.setText(r4)     // Catch:{ Exception -> 0x001a }
            goto L_0x00b4
        L_0x0095:
            r0.printStackTrace()
            goto L_0x00b4
        L_0x0099:
            ni.p6 r0 = r7.f8619b0
            if (r0 != 0) goto L_0x00a1
            cm.l.v(r3)
            r0 = r4
        L_0x00a1:
            com.nic.mparivahan.MyTextView r0 = r0.f27953t
            r0.setVisibility(r2)
            ni.p6 r0 = r7.f8619b0
            if (r0 != 0) goto L_0x00ae
            cm.l.v(r3)
            goto L_0x00af
        L_0x00ae:
            r4 = r0
        L_0x00af:
            android.widget.LinearLayout r0 = r4.B
            r0.setVisibility(r2)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.o3():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p6 c10 = p6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.f8619b0 = c10;
        p6 p6Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        p6 p6Var2 = this.f8619b0;
        if (p6Var2 == null) {
            cm.l.v("binding");
            p6Var2 = null;
        }
        aVar.v1(this, p6Var2);
        l3(new ld.c(this));
        c3(this);
        d3(DlService.f8615a.c(this));
        m3(new ld.g(this));
        DatabaseHelper A0 = DatabaseHelper.A0(o2());
        cm.l.e(A0, "getInstance(...)");
        T2(A0);
        i3(new ProgressDialog(o2()));
        v2().setMessage("Please wait...");
        v2().setCancelable(true);
        v2().setCanceledOnTouchOutside(true);
        f3(RcService.f9484a.c(this));
        this.f8623f0 = SignService.f7644a.c(this);
        g3((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(r2()))).a(cd.c.class));
        SignService signService = this.f8623f0;
        if (signService == null) {
            cm.l.v("retrofitService");
            signService = null;
        }
        n3((v8.h) new u0((x0) this, (u0.b) new v8.g(new s8.b(signService))).a(v8.h.class));
        e3((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(p2()))).a(za.a.class));
        X1();
        q2().B().g(this, new o0(this));
        q2().C().g(this, new z0(this));
        q2().r().g(this, new k1(this));
        q2().s().g(this, new l1(this));
        q2().p().g(this, new m1(this));
        q2().q().g(this, new n1(this));
        s2().L().g(this, new y(new p(this)));
        s2().M().g(this, new y(new q(this)));
        s2().x().g(this, new y(new r(this)));
        s2().y().g(this, new y(new o(this)));
        p6 p6Var3 = this.f8619b0;
        if (p6Var3 == null) {
            cm.l.v("binding");
        } else {
            p6Var = p6Var3;
        }
        p6Var.A.setOnClickListener(new o1(this));
    }

    public final DlService p2() {
        DlService dlService = this.H;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final za.a q2() {
        za.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }

    public final RcService r2() {
        RcService rcService = this.f8621d0;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final cd.c s2() {
        cd.c cVar = this.f8620c0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final LinearLayout t2() {
        LinearLayout linearLayout = this.W;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final boolean u2(String str, EditText editText, View view) {
        cm.l.f(str, "str");
        cm.l.f(editText, "editText");
        cm.l.f(view, "mView");
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
                    editText.requestFocus();
                    Q2(o2(), y2().b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"));
                    return true;
                }
            }
        }
        return false;
    }

    public final ProgressDialog v2() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final RecyclerView w2() {
        RecyclerView recyclerView = this.X;
        if (recyclerView != null) {
            return recyclerView;
        }
        cm.l.v("recyclerList");
        return null;
    }

    public final ImageView x2() {
        ImageView imageView = this.Z;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("refresh");
        return null;
    }

    public final ld.c y2() {
        ld.c cVar = this.f8618a0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g z2() {
        ld.g gVar = this.S;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("userSessionManager");
        return null;
    }
}
