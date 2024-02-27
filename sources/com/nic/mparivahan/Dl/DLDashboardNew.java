package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CreateVirtualDocModle;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RecentSearch;
import com.nic.mparivahan.RC.RCDashBoard;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.ViewRcChallanActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.e2;
import pl.x;
import ua.a0;
import ua.c0;
import ua.d0;
import ua.e0;
import ua.f0;
import ua.r;
import ua.s;
import ua.t;
import ua.v;
import ua.w;
import ua.y;
import ua.z;
import v9.e;
import z9.a;

public final class DLDashboardNew extends androidx.appcompat.app.d implements wa.c {
    public cd.c A0;
    public RcService B0;
    private e2 C0;
    public ld.c D0;
    public za.a G;
    public DlService H;
    public ProgressDialog I;
    public Context J;
    public EditText K;
    public LinearLayout L;
    public LinearLayout M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public LinearLayout U;
    public ImageView V;
    public ImageView W;
    public EditText X;
    public EditText Y;
    public EditText Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f8530a0;

    /* renamed from: b0  reason: collision with root package name */
    public LinearLayout f8531b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f8532c0;

    /* renamed from: d0  reason: collision with root package name */
    public RecyclerView f8533d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f8534e0;

    /* renamed from: f0  reason: collision with root package name */
    public DatabaseHelper f8535f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f8536g0;

    /* renamed from: h0  reason: collision with root package name */
    public LinearLayout f8537h0;

    /* renamed from: i0  reason: collision with root package name */
    private Calendar f8538i0 = Calendar.getInstance();

    /* renamed from: j0  reason: collision with root package name */
    public ld.g f8539j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f8540k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f8541l0;

    /* renamed from: m0  reason: collision with root package name */
    public DldetobjX f8542m0;

    /* renamed from: n0  reason: collision with root package name */
    public LinearLayout f8543n0;

    /* renamed from: o0  reason: collision with root package name */
    public LinearLayout f8544o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f8545p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f8546q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f8547r0;

    /* renamed from: s0  reason: collision with root package name */
    public TextView f8548s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f8549t0;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f8550u0;

    /* renamed from: v0  reason: collision with root package name */
    public LinearLayout f8551v0;

    /* renamed from: w0  reason: collision with root package name */
    public LinearLayout f8552w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f8553x0;

    /* renamed from: y0  reason: collision with root package name */
    public ImageView f8554y0;

    /* renamed from: z0  reason: collision with root package name */
    public DldetobjX f8555z0;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8556e;

        a(DLDashboardNew dLDashboardNew) {
            this.f8556e = dLDashboardNew;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8556e.e2().requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8556e.f2().requestFocus();
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
                    this.f8556e.e2().setText("");
                }
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8557e;

        b(DLDashboardNew dLDashboardNew) {
            this.f8557e = dLDashboardNew;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8557e.f2().requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8557e.g2().requestFocus();
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
                    this.f8557e.f2().setText("");
                }
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8558e;

        c(DLDashboardNew dLDashboardNew) {
            this.f8558e = dLDashboardNew;
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
                    this.f8558e.g2().setText("");
                }
            }
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8559e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f8560f;

        d(DLDashboardNew dLDashboardNew, g gVar) {
            this.f8559e = dLDashboardNew;
            this.f8560f = gVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            DLDashboardNew dLDashboardNew = this.f8559e;
            new DatePickerDialog(dLDashboardNew, this.f8560f, dLDashboardNew.R1().get(1), this.f8559e.R1().get(2), this.f8559e.R1().get(5)).show();
        }
    }

    public static final class e implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8561e;

        e(DLDashboardNew dLDashboardNew) {
            this.f8561e = dLDashboardNew;
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
                this.f8561e.f2().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class f implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8562e;

        f(DLDashboardNew dLDashboardNew) {
            this.f8562e = dLDashboardNew;
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
                this.f8562e.g2().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class g implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8563a;

        g(DLDashboardNew dLDashboardNew) {
            this.f8563a = dLDashboardNew;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            this.f8563a.R1().set(1, i10);
            this.f8563a.R1().set(2, i11);
            this.f8563a.R1().set(5, i12);
            this.f8563a.s4();
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DLDashboardNew dLDashboardNew) {
            super(1);
            this.f8564e = dLDashboardNew;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            try {
                if (this.f8564e.K2().isShowing()) {
                    this.f8564e.K2().dismiss();
                }
                try {
                    this.f8564e.U1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    DLDashboardNew dLDashboardNew = this.f8564e;
                    dLDashboardNew.q4(dLDashboardNew, dLDashboardNew.P2().b(v9.f.f17510a.k(), "Virtual DL Successfully Created!"));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    DLDashboardNew dLDashboardNew2 = this.f8564e;
                    dLDashboardNew2.q4(dLDashboardNew2, dLDashboardNew2.P2().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time."));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (this.f8564e.K2().isShowing()) {
                    this.f8564e.K2().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(DLDashboardNew dLDashboardNew) {
            super(1);
            this.f8565e = dLDashboardNew;
        }

        public final void b(String str) {
            try {
                if (this.f8565e.K2().isShowing()) {
                    this.f8565e.K2().dismiss();
                }
                DLDashboardNew dLDashboardNew = this.f8565e;
                dLDashboardNew.q4(dLDashboardNew, dLDashboardNew.P2().b(v9.f.f17510a.N0(), "Unable to update the Virtual DL, Please try after some time."));
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f8565e.K2().isShowing()) {
                    this.f8565e.K2().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8566e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(DLDashboardNew dLDashboardNew) {
            super(1);
            this.f8566e = dLDashboardNew;
        }

        public final void b(MyRcDeletResponse myRcDeletResponse) {
            DLDashboardNew dLDashboardNew;
            String b10;
            try {
                this.f8566e.K2().dismiss();
                if (p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        this.f8566e.U1().E();
                        DLDashboardNew dLDashboardNew2 = this.f8566e;
                        dLDashboardNew2.q4(dLDashboardNew2, dLDashboardNew2.P2().b(v9.f.f17510a.Z0(), "Virtual DL Successfully deleted!"));
                        this.f8566e.B3();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        dLDashboardNew = this.f8566e;
                        b10 = dLDashboardNew.P2().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some time.");
                    }
                } else {
                    if (p.o(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                        dLDashboardNew = this.f8566e;
                        b10 = dLDashboardNew.P2().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some time.");
                    } else {
                        dLDashboardNew = this.f8566e;
                        b10 = dLDashboardNew.P2().b(v9.f.f17510a.E0(), "Unable to delete the Virtual DL, Please try after some time.");
                    }
                    dLDashboardNew.q4(dLDashboardNew, b10);
                }
            } catch (Exception e11) {
                if (this.f8566e.K2().isShowing()) {
                    this.f8566e.K2().dismiss();
                }
                e11.printStackTrace();
                DLDashboardNew dLDashboardNew3 = this.f8566e;
                dLDashboardNew3.q4(dLDashboardNew3, "Unable to delete the Virtual DL, Please try after some time.");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((MyRcDeletResponse) obj);
            return x.f30437a;
        }
    }

    public static final class k implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8567e;

        k(EditText editText) {
            this.f8567e = editText;
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
                this.f8567e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class l implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8568e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8569f;

        l(EditText editText, EditText editText2) {
            this.f8568e = editText;
            this.f8569f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8568e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8569f.requestFocus();
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
                    this.f8568e.setText("");
                }
            }
        }
    }

    public static final class m implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8570e;

        m(EditText editText) {
            this.f8570e = editText;
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
                this.f8570e.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class n implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ EditText f8571e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ EditText f8572f;

        n(EditText editText, EditText editText2) {
            this.f8571e = editText;
            this.f8572f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f8571e.requestFocus();
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            if (i10 == 1 && i11 == 0) {
                this.f8572f.requestFocus();
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
                    this.f8571e.setText("");
                }
            }
        }
    }

    public static final class o implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLDashboardNew f8573e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f8574f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u f8575g;

        o(DLDashboardNew dLDashboardNew, p pVar, u uVar) {
            this.f8573e = dLDashboardNew;
            this.f8574f = pVar;
            this.f8575g = uVar;
        }

        public void onClick(View view) {
            cm.l.f(view, "view");
            new DatePickerDialog(this.f8573e.z2(), this.f8574f, ((Calendar) this.f8575g.f20234e).get(1), ((Calendar) this.f8575g.f20234e).get(2), ((Calendar) this.f8575g.f20234e).get(5)).show();
        }
    }

    public static final class p implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f8576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f8577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f8578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f8579d;

        p(u uVar, EditText editText, EditText editText2, EditText editText3) {
            this.f8576a = uVar;
            this.f8577b = editText;
            this.f8578c = editText2;
            this.f8579d = editText3;
        }

        public void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
            cm.l.f(datePicker, "view");
            ((Calendar) this.f8576a.f20234e).set(1, i10);
            ((Calendar) this.f8576a.f20234e).set(2, i11);
            ((Calendar) this.f8576a.f20234e).set(5, i12);
            CharSequence format = DateFormat.format("dd", ((Calendar) this.f8576a.f20234e).getTime());
            cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
            String str = (String) format;
            CharSequence format2 = DateFormat.format("MM", ((Calendar) this.f8576a.f20234e).getTime());
            cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) format2;
            CharSequence format3 = DateFormat.format("yyyy", ((Calendar) this.f8576a.f20234e).getTime());
            cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) format3;
            try {
                this.f8577b.setText(str);
                this.f8578c.setText(str2);
                this.f8579d.setText(str3);
            } catch (Exception unused) {
            }
        }
    }

    static final class q implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8580a;

        q(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8580a = lVar;
        }

        public final pl.c a() {
            return this.f8580a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8580a.invoke(obj);
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

    private final boolean M1(String str) {
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
    public static final void O1(Dialog dialog, String str, DLDashboardNew dLDashboardNew, DldetobjX dldetobjX, String str2, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLDashboardNew, "this$0");
        cm.l.f(dldetobjX, "$dlobj");
        dialog.dismiss();
        try {
            dLDashboardNew.U1().L0(q.B0(String.valueOf(str)).toString(), dldetobjX, str2, z9.a.f18947a.g(q.B0(dldetobjX.getDlobj().getDlLicno().toString()).toString()));
            dLDashboardNew.startActivity(new Intent(dLDashboardNew, DLVirtualRcScreen.class));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9 A[SYNTHETIC, Splitter:B:23:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0119 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012a A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0171 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ad A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01be A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01fb A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x020c A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0272 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02a7 A[SYNTHETIC, Splitter:B:72:0x02a7] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0351 A[Catch:{ Exception -> 0x0091 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Y2(com.nic.mparivahan.Dl.DLDashboardNew r13, com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1 r14) {
        /*
            java.lang.String r0 = "No Details are available."
            java.lang.String r1 = "no_details"
            java.lang.String r2 = ""
            java.lang.String r3 = "this$0"
            cm.l.f(r13, r3)
            android.app.ProgressDialog r3 = r13.K2()
            r3.dismiss()
            r3 = 8
            java.util.List r4 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = (com.nic.mparivahan.Dl.Model.DldetobjX) r4     // Catch:{ Exception -> 0x0091 }
            int r4 = r4.getErrorcd()     // Catch:{ Exception -> 0x0091 }
            if (r4 != 0) goto L_0x038b
            android.widget.EditText r4 = r13.h2()     // Catch:{ Exception -> 0x0091 }
            r4.setText(r2)     // Catch:{ Exception -> 0x0091 }
            android.widget.EditText r4 = r13.e2()     // Catch:{ Exception -> 0x0091 }
            r4.setText(r2)     // Catch:{ Exception -> 0x0091 }
            android.widget.EditText r4 = r13.f2()     // Catch:{ Exception -> 0x0091 }
            r4.setText(r2)     // Catch:{ Exception -> 0x0091 }
            android.widget.EditText r4 = r13.g2()     // Catch:{ Exception -> 0x0091 }
            r4.setText(r2)     // Catch:{ Exception -> 0x0091 }
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            r13.I3(r2)     // Catch:{ Exception -> 0x0091 }
            android.widget.LinearLayout r2 = r13.b2()     // Catch:{ Exception -> 0x0091 }
            r2.setVisibility(r5)     // Catch:{ Exception -> 0x0091 }
            android.widget.TextView r2 = r13.W2()     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r13.d2()     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r4 = r4.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = r4.getDlLicno()     // Catch:{ Exception -> 0x0091 }
            r2.setText(r4)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r13.d2()     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getDlLicno()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0091 }
            r13.H3(r2)     // Catch:{ Exception -> 0x0091 }
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r2 = r2.getBioImgObj()     // Catch:{ Exception -> 0x0091 }
            r4 = 0
            if (r2 == 0) goto L_0x0094
            java.lang.String r2 = r2.getBiPhoto()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r14 = move-exception
            goto L_0x03a2
        L_0x0094:
            r2 = r4
        L_0x0095:
            if (r2 == 0) goto L_0x00c0
            int r2 = r2.length()     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            android.widget.ImageView r2 = r13.I2()     // Catch:{ Exception -> 0x0091 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r6 = r6.getBioImgObj()     // Catch:{ Exception -> 0x0091 }
            if (r6 == 0) goto L_0x00b7
            java.lang.String r6 = r6.getBiPhoto()     // Catch:{ Exception -> 0x0091 }
            goto L_0x00b8
        L_0x00b7:
            r6 = r4
        L_0x00b8:
            android.graphics.Bitmap r6 = r13.P1(r6)     // Catch:{ Exception -> 0x0091 }
            r2.setImageBitmap(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x00ca
        L_0x00c0:
            android.widget.ImageView r2 = r13.I2()     // Catch:{ Exception -> 0x0091 }
            r6 = 2131231173(0x7f0801c5, float:1.807842E38)
            r2.setImageResource(r6)     // Catch:{ Exception -> 0x0091 }
        L_0x00ca:
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "bioFullName"
            r7 = 2
            boolean r2 = km.q.F(r2, r6, r5, r7, r4)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "NA"
            if (r2 == 0) goto L_0x0119
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getBioFullName()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0111
            android.widget.TextView r2 = r13.R2()     // Catch:{ Exception -> 0x0091 }
            xa.a$a r8 = xa.a.f18250a     // Catch:{ Exception -> 0x0091 }
            java.util.List r9 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = (com.nic.mparivahan.Dl.Model.DldetobjX) r9     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r9 = r9.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = r9.getBioFullName()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r8.b(r9)     // Catch:{ Exception -> 0x0091 }
            r2.setText(r8)     // Catch:{ Exception -> 0x0091 }
            goto L_0x011e
        L_0x0111:
            android.widget.TextView r2 = r13.R2()     // Catch:{ Exception -> 0x0091 }
        L_0x0115:
            r2.setText(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x011e
        L_0x0119:
            android.widget.TextView r2 = r13.R2()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0115
        L_0x011e:
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = "dlRtoCode"
            boolean r2 = km.q.F(r2, r8, r5, r7, r4)     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0160
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getDlRtoCode()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0158
            android.widget.TextView r2 = r13.T2()     // Catch:{ Exception -> 0x0091 }
            java.util.List r8 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r8 = (com.nic.mparivahan.Dl.Model.DldetobjX) r8     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r8 = r8.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r8.getDlRtoCode()     // Catch:{ Exception -> 0x0091 }
            r2.setText(r8)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0165
        L_0x0158:
            android.widget.TextView r2 = r13.T2()     // Catch:{ Exception -> 0x0091 }
        L_0x015c:
            r2.setText(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0165
        L_0x0160:
            android.widget.TextView r2 = r13.T2()     // Catch:{ Exception -> 0x0091 }
            goto L_0x015c
        L_0x0165:
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = "dlIssuedt"
            boolean r2 = km.q.F(r2, r8, r5, r7, r4)     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x01ad
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getDlIssuedt()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x01a5
            android.widget.TextView r2 = r13.S2()     // Catch:{ Exception -> 0x0091 }
            z9.a$a r8 = z9.a.f18947a     // Catch:{ Exception -> 0x0091 }
            java.util.List r9 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r9 = (com.nic.mparivahan.Dl.Model.DldetobjX) r9     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r9 = r9.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = r9.getDlIssuedt()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r8.f(r9)     // Catch:{ Exception -> 0x0091 }
            r2.setText(r8)     // Catch:{ Exception -> 0x0091 }
            goto L_0x01b2
        L_0x01a5:
            android.widget.TextView r2 = r13.S2()     // Catch:{ Exception -> 0x0091 }
        L_0x01a9:
            r2.setText(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x01b2
        L_0x01ad:
            android.widget.TextView r2 = r13.S2()     // Catch:{ Exception -> 0x0091 }
            goto L_0x01a9
        L_0x01b2:
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = "dlNtValdtoDt"
            boolean r2 = km.q.F(r2, r8, r5, r7, r4)     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x01fb
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x01f6
            android.widget.TextView r2 = r13.V2()     // Catch:{ Exception -> 0x0091 }
            z9.a$a r6 = z9.a.f18947a     // Catch:{ Exception -> 0x0091 }
            java.util.List r8 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r8 = (com.nic.mparivahan.Dl.Model.DldetobjX) r8     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r8 = r8.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r8.getDlNtValdtoDt()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r6.f(r8)     // Catch:{ Exception -> 0x0091 }
        L_0x01f2:
            r2.setText(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0200
        L_0x01f6:
            android.widget.TextView r2 = r13.V2()     // Catch:{ Exception -> 0x0091 }
            goto L_0x01f2
        L_0x01fb:
            android.widget.TextView r2 = r13.V2()     // Catch:{ Exception -> 0x0091 }
            goto L_0x01f2
        L_0x0200:
            java.lang.String r2 = r14.toString()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "omRtoShortname"
            boolean r2 = km.q.F(r2, r6, r5, r7, r4)     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0272
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getOmRtoShortname()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x0226
            int r2 = r2.length()     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x025b
        L_0x0226:
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r2 = r2.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getOmRtoFullname()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x025b
            int r2 = r2.length()     // Catch:{ Exception -> 0x0091 }
            if (r2 != 0) goto L_0x0241
            goto L_0x025b
        L_0x0241:
            android.widget.TextView r2 = r13.U2()     // Catch:{ Exception -> 0x0091 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r6.getOmRtoFullname()     // Catch:{ Exception -> 0x0091 }
        L_0x0257:
            r2.setText(r6)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0289
        L_0x025b:
            android.widget.TextView r2 = r13.U2()     // Catch:{ Exception -> 0x0091 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r6.getOmRtoShortname()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0257
        L_0x0272:
            android.widget.TextView r2 = r13.U2()     // Catch:{ Exception -> 0x0091 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r6.getOlaName()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0257
        L_0x0289:
            com.nic.mparivahan.DB.DatabaseHelper r2 = r13.U1()     // Catch:{ Exception -> 0x0091 }
            java.util.List r6 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r6 = (com.nic.mparivahan.Dl.Model.DldetobjX) r6     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r6.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r6.getBioDlno()     // Catch:{ Exception -> 0x0091 }
            int r2 = r2.s(r6)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "yyyyMMddHHmmss"
            if (r2 != 0) goto L_0x0351
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r2 = r2.getBioImgObj()     // Catch:{ Exception -> 0x0091 }
            if (r2 == 0) goto L_0x02bc
            java.lang.String r2 = r2.getBiPhoto()     // Catch:{ Exception -> 0x0091 }
            goto L_0x02bd
        L_0x02bc:
            r2 = r4
        L_0x02bd:
            if (r2 == 0) goto L_0x0311
            com.nic.mparivahan.DB.DatabaseHelper r7 = r13.U1()     // Catch:{ Exception -> 0x0091 }
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r2.getBioDlno()     // Catch:{ Exception -> 0x0091 }
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = r2.getBioFullName()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r10 = "DL"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0091 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0091 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0091 }
            r6.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r11 = r2.format(r6)     // Catch:{ Exception -> 0x0091 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r14 = r14.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r14 = r14.getBioImgObj()     // Catch:{ Exception -> 0x0091 }
            if (r14 == 0) goto L_0x030b
            java.lang.String r4 = r14.getBiPhoto()     // Catch:{ Exception -> 0x0091 }
        L_0x030b:
            r12 = r4
            r7.P0(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0091 }
            goto L_0x03bb
        L_0x0311:
            com.nic.mparivahan.DB.DatabaseHelper r4 = r13.U1()     // Catch:{ Exception -> 0x0091 }
            java.util.List r2 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getBioDlno()     // Catch:{ Exception -> 0x0091 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r14 = r14.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r14 = r14.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r14 = r14.getBioFullName()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = "DL"
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0091 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0091 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0091 }
            r6.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r8 = r5.format(r6)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r9 = ""
            r5 = r2
            r6 = r14
            r4.P0(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0091 }
            goto L_0x03bb
        L_0x0351:
            com.nic.mparivahan.DB.DatabaseHelper r2 = r13.U1()     // Catch:{ Exception -> 0x0091 }
            java.util.List r4 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = (com.nic.mparivahan.Dl.Model.DldetobjX) r4     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r4 = r4.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = r4.getBioDlno()     // Catch:{ Exception -> 0x0091 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0091 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0091 }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0091 }
            r6.<init>()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = r7.format(r6)     // Catch:{ Exception -> 0x0091 }
            java.util.List r14 = r14.getDldetobj()     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r14 = r14.get(r5)     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.DldetobjX r14 = (com.nic.mparivahan.Dl.Model.DldetobjX) r14     // Catch:{ Exception -> 0x0091 }
            com.nic.mparivahan.Dl.Model.BioObjX r14 = r14.getBioObj()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r14 = r14.getBioFullName()     // Catch:{ Exception -> 0x0091 }
            r2.K0(r4, r6, r14)     // Catch:{ Exception -> 0x0091 }
            goto L_0x03bb
        L_0x038b:
            android.widget.LinearLayout r14 = r13.b2()     // Catch:{ Exception -> 0x0091 }
            r14.setVisibility(r3)     // Catch:{ Exception -> 0x0091 }
            android.content.Context r14 = r13.z2()     // Catch:{ Exception -> 0x0091 }
            ld.c r2 = r13.P2()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.b(r1, r0)     // Catch:{ Exception -> 0x0091 }
            r13.s3(r14, r2)     // Catch:{ Exception -> 0x0091 }
            goto L_0x03bb
        L_0x03a2:
            r14.printStackTrace()
            android.widget.LinearLayout r14 = r13.b2()
            r14.setVisibility(r3)
            android.content.Context r14 = r13.z2()
            ld.c r2 = r13.P2()
            java.lang.String r0 = r2.b(r1, r0)
            r13.s3(r14, r0)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLDashboardNew.Y2(com.nic.mparivahan.Dl.DLDashboardNew, com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1):void");
    }

    /* access modifiers changed from: private */
    public static final void Z2(DLDashboardNew dLDashboardNew, String str) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.K2().dismiss();
        dLDashboardNew.b2().setVisibility(8);
        dLDashboardNew.s3(dLDashboardNew.z2(), dLDashboardNew.P2().b("no_details", "No Details are available."));
    }

    /* access modifiers changed from: private */
    public static final void a3(DLDashboardNew dLDashboardNew, CreateVirtualDocModle createVirtualDocModle) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.K2().dismiss();
        if (p.o(createVirtualDocModle.getStatusCode(), "VTLD005", true) || p.o(createVirtualDocModle.getStatusCode(), "VTLD014", true)) {
            dLDashboardNew.s3(dLDashboardNew.z2(), createVirtualDocModle.getStatusDesc().toString());
        } else if (p.o(createVirtualDocModle.getStatusCode(), "VTLD001", true)) {
            DLDashboardNew dLDashboardNew2 = dLDashboardNew;
            dLDashboardNew2.N1(dLDashboardNew.z2(), dLDashboardNew.P2().b(v9.f.f17510a.k(), "Virtual DL Successfully Created!"), q.B0(createVirtualDocModle.getCitizenDocInfo().getDocNumber()).toString(), dLDashboardNew.d2(), String.valueOf(createVirtualDocModle.getCitizenDocInfo().getDocId()));
        } else {
            dLDashboardNew.s3(dLDashboardNew.z2(), dLDashboardNew.P2().b(v9.f.f17510a.J0(), "Unable to create the Virtual DL, Please try after some time"));
        }
    }

    /* access modifiers changed from: private */
    public static final void b3(DLDashboardNew dLDashboardNew, String str) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.K2().dismiss();
        dLDashboardNew.s3(dLDashboardNew.z2(), dLDashboardNew.P2().b(v9.f.f17510a.J0(), "Unable to create the Virtual DL, Please try after some time"));
    }

    /* access modifiers changed from: private */
    public static final void c3(DLDashboardNew dLDashboardNew, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        cm.l.f(dLDashboardNew, "this$0");
        try {
            dLDashboardNew.K2().dismiss();
            try {
                dLDashboardNew.J2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                TextView Q1 = dLDashboardNew.Q1();
                Q1.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd1() + ' ' + dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd2());
                TextView w22 = dLDashboardNew.w2();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dLDashboardNew.P2().b("issue_date", "Issue Date"));
                sb2.append(" - ");
                a.C0251a aVar = z9.a.f18947a;
                sb2.append(aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
                w22.setText(sb2.toString());
                TextView F2 = dLDashboardNew.F2();
                F2.setText(dLDashboardNew.P2().b("label_dl_serv_valid_upto", "Valid Upto") + " - " + aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt()));
                dLDashboardNew.U1().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void d3(DLDashboardNew dLDashboardNew, String str) {
        cm.l.f(dLDashboardNew, "this$0");
        try {
            dLDashboardNew.K2().dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void e3(Context context, String str) {
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
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(P2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P2().b("button_proceed", "Proceed"));
        textView2.setText(P2().b("button_cancel", "Cancel"));
        ((TextView) findViewById).setText(str);
        textView2.setOnClickListener(new ua.u(dialog));
        textView.setOnClickListener(new v(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void f3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g3(Dialog dialog, DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLDashboardNew, "this$0");
        dialog.dismiss();
        if (dLDashboardNew.Y1().getText().toString().length() > 0) {
            try {
                if (dLDashboardNew.K2().isShowing()) {
                    dLDashboardNew.K2().dismiss();
                }
                dLDashboardNew.K2().show();
                String j02 = dLDashboardNew.U1().j0(q.B0(dLDashboardNew.Y1().getText().toString()).toString());
                if (j02 == null) {
                    return;
                }
                if (j02.length() != 0) {
                    cd.c D2 = dLDashboardNew.D2();
                    cm.l.c(j02);
                    D2.g(j02, dLDashboardNew);
                }
            } catch (Exception e10) {
                if (dLDashboardNew.K2().isShowing()) {
                    dLDashboardNew.K2().dismiss();
                }
                e10.printStackTrace();
            }
        }
    }

    private final void i2() {
        View findViewById = findViewById(R.id.txt_dl_holder_name);
        cm.l.e(findViewById, "findViewById(...)");
        h4((TextView) findViewById);
        View findViewById2 = findViewById(R.id.txt_lic_auth);
        cm.l.e(findViewById2, "findViewById(...)");
        j4((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.txt_vehicle_class);
        cm.l.e(findViewById3, "findViewById(...)");
        m4((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.txt_lic_validity);
        cm.l.e(findViewById4, "findViewById(...)");
        l4((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.txt_lic_authority);
        cm.l.e(findViewById5, "findViewById(...)");
        k4((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.ll_create_dl);
        cm.l.e(findViewById6, "findViewById(...)");
        O3((LinearLayout) findViewById6);
        View findViewById7 = findViewById(R.id.et_search_dl);
        cm.l.e(findViewById7, "findViewById(...)");
        M3((EditText) findViewById7);
        View findViewById8 = findViewById(R.id.ll_search_dl);
        cm.l.e(findViewById8, "findViewById(...)");
        P3((LinearLayout) findViewById8);
        View findViewById9 = findViewById(R.id.txt_dl_number);
        cm.l.e(findViewById9, "findViewById(...)");
        n4((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.txt_issue_date);
        cm.l.e(findViewById10, "findViewById(...)");
        i4((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.owner_image);
        cm.l.e(findViewById11, "findViewById(...)");
        Z3((ImageView) findViewById11);
        View findViewById12 = findViewById(R.id.date_img);
        cm.l.e(findViewById12, "findViewById(...)");
        A3((ImageView) findViewById12);
        View findViewById13 = findViewById(R.id.dl_layout);
        cm.l.e(findViewById13, "findViewById(...)");
        G3((LinearLayout) findViewById13);
        b2().setVisibility(8);
        View findViewById14 = findViewById(R.id.dobDateMain);
        cm.l.e(findViewById14, "findViewById(...)");
        J3((EditText) findViewById14);
        View findViewById15 = findViewById(R.id.dobMonthMain);
        cm.l.e(findViewById15, "findViewById(...)");
        K3((EditText) findViewById15);
        View findViewById16 = findViewById(R.id.dobYearMain);
        cm.l.e(findViewById16, "findViewById(...)");
        L3((EditText) findViewById16);
        View findViewById17 = findViewById(R.id.dl_rec_search);
        cm.l.e(findViewById17, "findViewById(...)");
        E3((LinearLayout) findViewById17);
        View findViewById18 = findViewById(R.id.txt_clear_dl);
        cm.l.e(findViewById18, "findViewById(...)");
        v3((TextView) findViewById18);
        View findViewById19 = findViewById(R.id.rec_dl_recycler);
        cm.l.e(findViewById19, "findViewById(...)");
        c4((RecyclerView) findViewById19);
        View findViewById20 = findViewById(R.id.ll_create_dl);
        cm.l.e(findViewById20, "findViewById(...)");
        Q3((LinearLayout) findViewById20);
        View findViewById21 = findViewById(R.id.viewChallanLl);
        cm.l.e(findViewById21, "findViewById(...)");
        p4((LinearLayout) findViewById21);
        View findViewById22 = findViewById(R.id.nexgenarrow);
        cm.l.e(findViewById22, "findViewById(...)");
        W3((LinearLayout) findViewById22);
        View findViewById23 = findViewById(R.id.redirect_DashBoard);
        cm.l.e(findViewById23, "findViewById(...)");
        e4((LinearLayout) findViewById23);
        E2().setOnClickListener(new d0(this));
        N2().setOnClickListener(new ua.b(this));
        View findViewById24 = findViewById(R.id.redirect_Rcdashboard);
        cm.l.e(findViewById24, "findViewById(...)");
        f4((LinearLayout) findViewById24);
        O2().setOnClickListener(new ua.c(this));
        y2().setOnClickListener(new ua.d(this));
        X2().setOnClickListener(new ua.e(this));
        e2().setOnEditorActionListener(new ua.f());
        S1().setOnClickListener(new ua.g(this));
        e2().addTextChangedListener(new e(this));
        f2().addTextChangedListener(new f(this));
        e2().addTextChangedListener(new a(this));
        f2().setOnKeyListener(new ua.h(this));
        f2().addTextChangedListener(new b(this));
        g2().setOnKeyListener(new ua.i(this));
        g2().addTextChangedListener(new c(this));
        g gVar = new g(this);
        ImageView W1 = W1();
        cm.l.c(W1);
        W1.setOnClickListener(new d(this, gVar));
        x2().setOnClickListener(new ua.j(this));
        View findViewById25 = findViewById(R.id.ntValidUpTodate);
        cm.l.e(findViewById25, "findViewById(...)");
        X3((TextView) findViewById25);
        View findViewById26 = findViewById(R.id.trValidUpto);
        cm.l.e(findViewById26, "findViewById(...)");
        g4((TextView) findViewById26);
        View findViewById27 = findViewById(R.id.dlNo);
        cm.l.e(findViewById27, "findViewById(...)");
        D3((TextView) findViewById27);
        View findViewById28 = findViewById(R.id.owner_name);
        cm.l.e(findViewById28, "findViewById(...)");
        a4((TextView) findViewById28);
        View findViewById29 = findViewById(R.id.address);
        cm.l.e(findViewById29, "findViewById(...)");
        u3((TextView) findViewById29);
        View findViewById30 = findViewById(R.id.issue_date);
        cm.l.e(findViewById30, "findViewById(...)");
        N3((TextView) findViewById30);
        View findViewById31 = findViewById(R.id.dlHolder);
        cm.l.e(findViewById31, "findViewById(...)");
        C3((LinearLayout) findViewById31);
        View findViewById32 = findViewById(R.id.txt_create_dl);
        cm.l.e(findViewById32, "findViewById(...)");
        w3((TextView) findViewById32);
        View findViewById33 = findViewById(R.id.option_menu);
        cm.l.e(findViewById33, "findViewById(...)");
        Y3((ImageView) findViewById33);
        T1().setOnClickListener(new e0(this));
        try {
            B3();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        H2().setOnClickListener(new f0(this));
    }

    /* access modifiers changed from: private */
    public static final void i3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void j2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.n3(dLDashboardNew, "Challan DL Verification", dLDashboardNew.c2(), 1);
    }

    /* access modifiers changed from: private */
    public static final void j3(Dialog dialog, DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLDashboardNew, "this$0");
        dialog.dismiss();
        if (dLDashboardNew.U1().F0("DL") != null) {
            ArrayList F0 = dLDashboardNew.U1().F0("DL");
            cm.l.e(F0, "getRecentSearch(...)");
            dLDashboardNew.d4(F0);
            if (dLDashboardNew.M2() != null || !dLDashboardNew.M2().isEmpty()) {
                int size = dLDashboardNew.M2().size();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        dLDashboardNew.U1().Y(((RecentSearch) dLDashboardNew.M2().get(i10)).getSearchNumber(), "DL");
                    } catch (Exception unused) {
                    }
                }
                dLDashboardNew.M2().clear();
            }
            dLDashboardNew.L2().setAdapter((RecyclerView.h) null);
            dLDashboardNew.b2().setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean k2(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final void l2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.h3(dLDashboardNew.z2());
    }

    /* access modifiers changed from: private */
    public static final void l3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final boolean m2(DLDashboardNew dLDashboardNew, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(dLDashboardNew, "this$0");
        if (i10 != 67 || dLDashboardNew.f2().getText().length() != 0) {
            return false;
        }
        dLDashboardNew.e2().requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void m3(String str, DLDashboardNew dLDashboardNew, EditText editText, EditText editText2, EditText editText3, Dialog dialog, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        if (str != null) {
            dLDashboardNew.b4(new ProgressDialog(dLDashboardNew.z2()));
            dLDashboardNew.K2().setMessage(dLDashboardNew.P2().b("label_challan_please_wait", "Please wait..."));
            dLDashboardNew.K2().setCancelable(false);
            dLDashboardNew.K2().setCanceledOnTouchOutside(false);
            dLDashboardNew.K2().show();
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
            if (obj.subSequence(i10, length + 1).toString().length() != 0) {
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
                if (obj2.subSequence(i11, length2 + 1).toString().length() != 0) {
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
                    if (obj3.subSequence(i12, length3 + 1).toString().length() != 0) {
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
                        dLDashboardNew.K2().show();
                        dLDashboardNew.B2().g(str, sb3.toString(), dLDashboardNew);
                        return;
                    }
                }
            }
            Toast.makeText(dLDashboardNew, dLDashboardNew.P2().b(v9.f.f17510a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean n2(DLDashboardNew dLDashboardNew, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(dLDashboardNew, "this$0");
        if (i10 != 67 || dLDashboardNew.g2().getText().length() != 0) {
            return false;
        }
        dLDashboardNew.f2().requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o2(com.nic.mparivahan.Dl.DLDashboardNew r10, android.view.View r11) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r10, r0)
            android.widget.EditText r0 = r10.h2()
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
            android.widget.EditText r1 = r10.h2()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            r4 = 10
            if (r1 >= r4) goto L_0x007a
            android.content.Context r11 = r10.z2()
            ld.c r0 = r10.P2()
            java.lang.String r1 = "dl_validation_msg"
            java.lang.String r2 = "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"
            java.lang.String r0 = r0.b(r1, r2)
            r10.s3(r11, r0)
            goto L_0x0327
        L_0x007a:
            android.widget.EditText r1 = r10.h2()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            if (r1 < r4) goto L_0x0327
            android.widget.EditText r1 = r10.h2()
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
            boolean r1 = r10.M1(r1)
            if (r1 == 0) goto L_0x0327
            android.widget.EditText r1 = r10.h2()
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
            android.widget.EditText r4 = r10.h2()
            cm.l.c(r11)
            boolean r11 = r10.G2(r1, r4, r11)
            if (r11 != 0) goto L_0x0327
            r11 = 2
            r1 = 3
            java.lang.String r4 = r0.substring(r11, r1)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r5)
            java.lang.String r7 = "-"
            r8 = 0
            boolean r4 = km.q.F(r4, r7, r3, r11, r8)
            java.lang.String r9 = " "
            if (r4 != 0) goto L_0x0145
            java.lang.String r1 = r0.substring(r11, r1)
            cm.l.e(r1, r5)
            boolean r11 = km.q.F(r1, r9, r3, r11, r8)
            if (r11 == 0) goto L_0x0141
            goto L_0x0145
        L_0x0141:
            r10.x3(r0)
            goto L_0x015c
        L_0x0145:
            km.f r11 = new km.f
            r11.<init>((java.lang.String) r7)
            java.lang.String r1 = ""
            java.lang.String r11 = r11.c(r0, r1)
            km.f r0 = new km.f
            r0.<init>((java.lang.String) r9)
            java.lang.String r11 = r0.c(r11, r1)
            r10.x3(r11)
        L_0x015c:
            android.widget.EditText r11 = r10.g2()
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            int r0 = r11.length()
            int r0 = r0 - r2
            r1 = r3
            r4 = r1
        L_0x016f:
            if (r1 > r0) goto L_0x0192
            if (r4 != 0) goto L_0x0175
            r5 = r1
            goto L_0x0176
        L_0x0175:
            r5 = r0
        L_0x0176:
            char r5 = r11.charAt(r5)
            int r5 = cm.l.h(r5, r6)
            if (r5 > 0) goto L_0x0182
            r5 = r2
            goto L_0x0183
        L_0x0182:
            r5 = r3
        L_0x0183:
            if (r4 != 0) goto L_0x018c
            if (r5 != 0) goto L_0x0189
            r4 = r2
            goto L_0x016f
        L_0x0189:
            int r1 = r1 + 1
            goto L_0x016f
        L_0x018c:
            if (r5 != 0) goto L_0x018f
            goto L_0x0192
        L_0x018f:
            int r0 = r0 + -1
            goto L_0x016f
        L_0x0192:
            int r0 = r0 + r2
            java.lang.CharSequence r11 = r11.subSequence(r1, r0)
            java.lang.String r11 = r11.toString()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0327
            android.widget.EditText r11 = r10.f2()
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            int r0 = r11.length()
            int r0 = r0 - r2
            r1 = r3
            r4 = r1
        L_0x01b4:
            if (r1 > r0) goto L_0x01d7
            if (r4 != 0) goto L_0x01ba
            r5 = r1
            goto L_0x01bb
        L_0x01ba:
            r5 = r0
        L_0x01bb:
            char r5 = r11.charAt(r5)
            int r5 = cm.l.h(r5, r6)
            if (r5 > 0) goto L_0x01c7
            r5 = r2
            goto L_0x01c8
        L_0x01c7:
            r5 = r3
        L_0x01c8:
            if (r4 != 0) goto L_0x01d1
            if (r5 != 0) goto L_0x01ce
            r4 = r2
            goto L_0x01b4
        L_0x01ce:
            int r1 = r1 + 1
            goto L_0x01b4
        L_0x01d1:
            if (r5 != 0) goto L_0x01d4
            goto L_0x01d7
        L_0x01d4:
            int r0 = r0 + -1
            goto L_0x01b4
        L_0x01d7:
            int r0 = r0 + r2
            java.lang.CharSequence r11 = r11.subSequence(r1, r0)
            java.lang.String r11 = r11.toString()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0327
            android.widget.EditText r11 = r10.e2()
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            int r0 = r11.length()
            int r0 = r0 - r2
            r1 = r3
            r4 = r1
        L_0x01f9:
            if (r1 > r0) goto L_0x021c
            if (r4 != 0) goto L_0x01ff
            r5 = r1
            goto L_0x0200
        L_0x01ff:
            r5 = r0
        L_0x0200:
            char r5 = r11.charAt(r5)
            int r5 = cm.l.h(r5, r6)
            if (r5 > 0) goto L_0x020c
            r5 = r2
            goto L_0x020d
        L_0x020c:
            r5 = r3
        L_0x020d:
            if (r4 != 0) goto L_0x0216
            if (r5 != 0) goto L_0x0213
            r4 = r2
            goto L_0x01f9
        L_0x0213:
            int r1 = r1 + 1
            goto L_0x01f9
        L_0x0216:
            if (r5 != 0) goto L_0x0219
            goto L_0x021c
        L_0x0219:
            int r0 = r0 + -1
            goto L_0x01f9
        L_0x021c:
            int r0 = r0 + r2
            java.lang.CharSequence r11 = r11.subSequence(r1, r0)
            java.lang.String r11 = r11.toString()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0327
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            android.widget.EditText r0 = r10.g2()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            int r1 = r1 - r2
            r4 = r3
            r5 = r4
        L_0x0243:
            if (r4 > r1) goto L_0x0266
            if (r5 != 0) goto L_0x0249
            r7 = r4
            goto L_0x024a
        L_0x0249:
            r7 = r1
        L_0x024a:
            char r7 = r0.charAt(r7)
            int r7 = cm.l.h(r7, r6)
            if (r7 > 0) goto L_0x0256
            r7 = r2
            goto L_0x0257
        L_0x0256:
            r7 = r3
        L_0x0257:
            if (r5 != 0) goto L_0x0260
            if (r7 != 0) goto L_0x025d
            r5 = r2
            goto L_0x0243
        L_0x025d:
            int r4 = r4 + 1
            goto L_0x0243
        L_0x0260:
            if (r7 != 0) goto L_0x0263
            goto L_0x0266
        L_0x0263:
            int r1 = r1 + -1
            goto L_0x0243
        L_0x0266:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            r0 = 45
            r11.append(r0)
            android.widget.EditText r1 = r10.f2()
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            int r4 = r4 - r2
            r5 = r3
            r7 = r5
        L_0x028a:
            if (r5 > r4) goto L_0x02ad
            if (r7 != 0) goto L_0x0290
            r8 = r5
            goto L_0x0291
        L_0x0290:
            r8 = r4
        L_0x0291:
            char r8 = r1.charAt(r8)
            int r8 = cm.l.h(r8, r6)
            if (r8 > 0) goto L_0x029d
            r8 = r2
            goto L_0x029e
        L_0x029d:
            r8 = r3
        L_0x029e:
            if (r7 != 0) goto L_0x02a7
            if (r8 != 0) goto L_0x02a4
            r7 = r2
            goto L_0x028a
        L_0x02a4:
            int r5 = r5 + 1
            goto L_0x028a
        L_0x02a7:
            if (r8 != 0) goto L_0x02aa
            goto L_0x02ad
        L_0x02aa:
            int r4 = r4 + -1
            goto L_0x028a
        L_0x02ad:
            int r4 = r4 + r2
            java.lang.CharSequence r1 = r1.subSequence(r5, r4)
            java.lang.String r1 = r1.toString()
            r11.append(r1)
            r11.append(r0)
            android.widget.EditText r0 = r10.e2()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            int r1 = r1 - r2
            r4 = r3
            r5 = r4
        L_0x02cf:
            if (r4 > r1) goto L_0x02f2
            if (r5 != 0) goto L_0x02d5
            r7 = r4
            goto L_0x02d6
        L_0x02d5:
            r7 = r1
        L_0x02d6:
            char r7 = r0.charAt(r7)
            int r7 = cm.l.h(r7, r6)
            if (r7 > 0) goto L_0x02e2
            r7 = r2
            goto L_0x02e3
        L_0x02e2:
            r7 = r3
        L_0x02e3:
            if (r5 != 0) goto L_0x02ec
            if (r7 != 0) goto L_0x02e9
            r5 = r2
            goto L_0x02cf
        L_0x02e9:
            int r4 = r4 + 1
            goto L_0x02cf
        L_0x02ec:
            if (r7 != 0) goto L_0x02ef
            goto L_0x02f2
        L_0x02ef:
            int r1 = r1 + -1
            goto L_0x02cf
        L_0x02f2:
            int r1 = r1 + r2
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.z3(r11)
            android.app.ProgressDialog r11 = r10.K2()
            r11.show()
            za.a r11 = r10.B2()
            android.widget.EditText r0 = r10.h2()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r10.V1()
            java.lang.String r1 = r1.toString()
            r11.g(r0, r1, r10)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLDashboardNew.o2(com.nic.mparivahan.Dl.DLDashboardNew, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final boolean o3(TextView textView, int i10, KeyEvent keyEvent) {
        return i10 == 3 || i10 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    /* access modifiers changed from: private */
    public static final void p2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.finish();
    }

    /* access modifiers changed from: private */
    public static final boolean p3(EditText editText, EditText editText2, View view, int i10, KeyEvent keyEvent) {
        cm.l.f(editText, "$dobMonth");
        cm.l.f(editText2, "$dobDate");
        if (i10 != 67 || editText.getText().length() != 0) {
            return false;
        }
        editText2.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void q2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        PopupMenu popupMenu = new PopupMenu(dLDashboardNew, dLDashboardNew.H2());
        popupMenu.inflate(R.menu.dl_menu);
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new ua.p(dLDashboardNew));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final void q3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final boolean r2(DLDashboardNew dLDashboardNew, MenuItem menuItem) {
        cm.l.f(dLDashboardNew, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /*2131363612*/:
                dLDashboardNew.startActivity(new Intent(dLDashboardNew, DLVirtualRcScreen.class));
                break;
            case R.id.menu2 /*2131363613*/:
                try {
                    if (dLDashboardNew.K2().isShowing()) {
                        dLDashboardNew.K2().dismiss();
                    }
                    dLDashboardNew.K2().show();
                    DldetobjX dldetails = ((DLDocument) dLDashboardNew.U1().c0().get(0)).getDldetails();
                    cm.l.c(dldetails);
                    dLDashboardNew.F3(dldetails);
                    dLDashboardNew.B2().j(q.B0(dLDashboardNew.a2().getDlobj().getDlLicno()).toString(), z9.a.f18947a.b(q.B0(dLDashboardNew.a2().getBioObj().getBioDob()).toString()), dLDashboardNew);
                    break;
                } catch (Exception unused) {
                    if (dLDashboardNew.K2().isShowing()) {
                        dLDashboardNew.K2().dismiss();
                        break;
                    }
                }
                break;
            case R.id.menu3 /*2131363614*/:
                dLDashboardNew.e3(dLDashboardNew.z2(), dLDashboardNew.P2().b(v9.f.f17510a.z0(), "Are you sure, You want to delete ?"));
                break;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void r3(String str, DLDashboardNew dLDashboardNew, EditText editText, EditText editText2, EditText editText3, int i10, Dialog dialog, String str2, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        cm.l.f(editText, "$dobYear");
        cm.l.f(editText2, "$dobMonth");
        cm.l.f(editText3, "$dobDate");
        cm.l.f(dialog, "$d");
        cm.l.f(str2, "$dl_number");
        if (str != null) {
            dLDashboardNew.b4(new ProgressDialog(dLDashboardNew.z2()));
            dLDashboardNew.K2().setMessage("Please wait...");
            dLDashboardNew.K2().setCancelable(false);
            dLDashboardNew.K2().setCanceledOnTouchOutside(false);
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
                            dialog.dismiss();
                            Intent intent = new Intent(dLDashboardNew, ViewRcChallanActivity.class);
                            intent.putExtra("rcNo", q.B0(str2).toString());
                            intent.putExtra("type", "DL");
                            dLDashboardNew.startActivity(intent);
                            return;
                        }
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
                        if (cm.l.a(sb2.toString(), q.B0(dLDashboardNew.V1()).toString())) {
                            dialog.dismiss();
                            dLDashboardNew.K2().show();
                            q.B0(str2).toString();
                            return;
                        }
                    }
                }
            }
            Toast.makeText(dLDashboardNew, dLDashboardNew.P2().b(v9.f.f17510a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void r4(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.finish();
    }

    /* access modifiers changed from: private */
    public final void s4() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", this.f8538i0.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", this.f8538i0.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", this.f8538i0.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        CharSequence format4 = DateFormat.format("dd", this.f8538i0.getTime());
        cm.l.d(format4, "null cannot be cast to non-null type kotlin.String");
        String str4 = (String) format4;
        CharSequence format5 = DateFormat.format("MM", this.f8538i0.getTime());
        cm.l.d(format5, "null cannot be cast to non-null type kotlin.String");
        String str5 = (String) format5;
        CharSequence format6 = DateFormat.format("yyyy", this.f8538i0.getTime());
        cm.l.d(format6, "null cannot be cast to non-null type kotlin.String");
        String str6 = (String) format6;
        try {
            e2().setText(str4);
            f2().setText(str5);
            g2().setText(str6);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void t2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.finish();
    }

    /* access modifiers changed from: private */
    public static final void t3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void u2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.startActivity(new Intent(dLDashboardNew, RCDashBoard.class));
        dLDashboardNew.finish();
    }

    /* access modifiers changed from: private */
    public static final void v2(DLDashboardNew dLDashboardNew, View view) {
        cm.l.f(dLDashboardNew, "this$0");
        dLDashboardNew.n3(dLDashboardNew, "DL Verification", dLDashboardNew.c2(), 0);
    }

    public final DlService A2() {
        DlService dlService = this.H;
        if (dlService != null) {
            return dlService;
        }
        cm.l.v("mDlService");
        return null;
    }

    public final void A3(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.W = imageView;
    }

    public final za.a B2() {
        za.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("mDlViewModel");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b6, code lost:
        r1 = r1.getBioObj();
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x016e A[Catch:{ Exception -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x017a A[SYNTHETIC, Splitter:B:35:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01cc A[Catch:{ Exception -> 0x01eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B3() {
        /*
            r9 = this;
            java.lang.String r0 = "entered"
            com.nic.mparivahan.DB.DatabaseHelper r1 = r9.U1()     // Catch:{ Exception -> 0x01eb }
            java.util.ArrayList r1 = r1.c0()     // Catch:{ Exception -> 0x01eb }
            r2 = 0
            if (r1 == 0) goto L_0x01dc
            android.util.Log.d(r0, r0)     // Catch:{ Exception -> 0x01eb }
            android.widget.LinearLayout r1 = r9.X1()     // Catch:{ Exception -> 0x01eb }
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x01eb }
            android.widget.LinearLayout r1 = r9.Z1()     // Catch:{ Exception -> 0x01eb }
            r3 = 8
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.DB.DatabaseHelper r1 = r9.U1()     // Catch:{ Exception -> 0x01eb }
            java.util.ArrayList r1 = r1.c0()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = r5.getDocnumber()     // Catch:{ Exception -> 0x01eb }
            if (r5 == 0) goto L_0x01eb
            int r5 = r5.length()     // Catch:{ Exception -> 0x01eb }
            if (r5 != 0) goto L_0x0046
            goto L_0x01eb
        L_0x0046:
            java.lang.String r5 = "entered2"
            android.util.Log.d(r0, r5)     // Catch:{ Exception -> 0x01eb }
            android.widget.TextView r5 = r9.Y1()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r6 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r6 = (com.nic.mparivahan.Dl.Model.DLDocument) r6     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = r6.getDocnumber()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x01eb }
            r5.setText(r6)     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r5 = (com.nic.mparivahan.Dl.Model.DLDocument) r5     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r5.getDldetails()     // Catch:{ Exception -> 0x01eb }
            if (r5 != 0) goto L_0x00a5
            java.lang.String r3 = "entered3"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x01eb }
            android.app.ProgressDialog r0 = r9.K2()     // Catch:{ Exception -> 0x01eb }
            r0.show()     // Catch:{ Exception -> 0x01eb }
            za.a r0 = r9.B2()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r3 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r3 = (com.nic.mparivahan.Dl.Model.DLDocument) r3     // Catch:{ Exception -> 0x01eb }
            java.lang.String r3 = r3.getDocnumber()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = r1.getDob()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x01eb }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01eb }
            r0.i(r3, r1, r9)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01eb
        L_0x00a5:
            android.widget.TextView r5 = r9.J2()     // Catch:{ Exception -> 0x01eb }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r1.getDldetails()     // Catch:{ Exception -> 0x01eb }
            r2 = 0
            if (r1 == 0) goto L_0x00c1
            com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x01eb }
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r1.getBioFullName()     // Catch:{ Exception -> 0x01eb }
            goto L_0x00c2
        L_0x00c1:
            r1 = r2
        L_0x00c2:
            r5.setText(r1)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = "entered4"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x01eb }
            cm.l.c(r4)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r4.getBioObj()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = r0.getBioPermAdd2()     // Catch:{ Exception -> 0x01eb }
            r1 = 32
            if (r0 == 0) goto L_0x011e
            int r0 = r0.length()     // Catch:{ Exception -> 0x01eb }
            if (r0 != 0) goto L_0x00e0
            goto L_0x011e
        L_0x00e0:
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r4.getBioObj()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = r0.getBioPermAdd2()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = "null"
            boolean r0 = cm.l.a(r0, r5)     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x00f1
            goto L_0x011e
        L_0x00f1:
            android.widget.TextView r0 = r9.Q1()     // Catch:{ Exception -> 0x01eb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb }
            r5.<init>()     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()     // Catch:{ Exception -> 0x01eb }
            cm.l.c(r6)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = r6.getBioPermAdd1()     // Catch:{ Exception -> 0x01eb }
            r5.append(r6)     // Catch:{ Exception -> 0x01eb }
            r5.append(r1)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.BioObjX r6 = r4.getBioObj()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = r6.getBioPermAdd2()     // Catch:{ Exception -> 0x01eb }
            r5.append(r6)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01eb }
        L_0x011a:
            r0.setText(r5)     // Catch:{ Exception -> 0x01eb }
            goto L_0x012e
        L_0x011e:
            android.widget.TextView r0 = r9.Q1()     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.BioObjX r5 = r4.getBioObj()     // Catch:{ Exception -> 0x01eb }
            cm.l.c(r5)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = r5.getBioPermAdd1()     // Catch:{ Exception -> 0x01eb }
            goto L_0x011a
        L_0x012e:
            android.widget.TextView r0 = r9.w2()     // Catch:{ Exception -> 0x01eb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb }
            r5.<init>()     // Catch:{ Exception -> 0x01eb }
            ld.c r6 = r9.P2()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r7 = "issue_date"
            java.lang.String r8 = "Issue Date"
            java.lang.String r6 = r6.b(r7, r8)     // Catch:{ Exception -> 0x01eb }
            r5.append(r6)     // Catch:{ Exception -> 0x01eb }
            r5.append(r1)     // Catch:{ Exception -> 0x01eb }
            z9.a$a r1 = z9.a.f18947a     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DlobjX r6 = r4.getDlobj()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = r6.getDlIssuedt()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = r1.f(r6)     // Catch:{ Exception -> 0x01eb }
            r5.append(r6)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01eb }
            r0.setText(r5)     // Catch:{ Exception -> 0x01eb }
            android.widget.TextView r0 = r9.Q2()     // Catch:{ Exception -> 0x01eb }
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r4.getDlobj()     // Catch:{ Exception -> 0x01eb }
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = r0.getDlNtValdtoDt()     // Catch:{ Exception -> 0x01eb }
            goto L_0x0174
        L_0x0173:
            r0 = r2
        L_0x0174:
            java.lang.String r3 = "Valid Upto"
            java.lang.String r5 = "label_dl_serv_valid_upto"
            if (r0 == 0) goto L_0x01b2
            int r0 = r0.length()     // Catch:{ Exception -> 0x01eb }
            if (r0 != 0) goto L_0x0181
            goto L_0x01b2
        L_0x0181:
            android.widget.TextView r0 = r9.F2()     // Catch:{ Exception -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb }
            r6.<init>()     // Catch:{ Exception -> 0x01eb }
            ld.c r7 = r9.P2()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r3 = r7.b(r5, r3)     // Catch:{ Exception -> 0x01eb }
            r6.append(r3)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r4.getDlobj()     // Catch:{ Exception -> 0x01eb }
            if (r3 == 0) goto L_0x019f
            java.lang.String r2 = r3.getDlNtValdtoDt()     // Catch:{ Exception -> 0x01eb }
        L_0x019f:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = r1.f(r2)     // Catch:{ Exception -> 0x01eb }
            r6.append(r1)     // Catch:{ Exception -> 0x01eb }
        L_0x01aa:
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x01eb }
            r0.setText(r1)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01eb
        L_0x01b2:
            android.widget.TextView r0 = r9.F2()     // Catch:{ Exception -> 0x01eb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01eb }
            r6.<init>()     // Catch:{ Exception -> 0x01eb }
            ld.c r7 = r9.P2()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r3 = r7.b(r5, r3)     // Catch:{ Exception -> 0x01eb }
            r6.append(r3)     // Catch:{ Exception -> 0x01eb }
            com.nic.mparivahan.Dl.Model.DlobjX r3 = r4.getDlobj()     // Catch:{ Exception -> 0x01eb }
            if (r3 == 0) goto L_0x01d0
            java.lang.String r2 = r3.getDlTrValdtoDt()     // Catch:{ Exception -> 0x01eb }
        L_0x01d0:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r1 = r1.f(r2)     // Catch:{ Exception -> 0x01eb }
            r6.append(r1)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01aa
        L_0x01dc:
            android.widget.LinearLayout r0 = r9.X1()     // Catch:{ Exception -> 0x01eb }
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x01eb }
            android.widget.LinearLayout r0 = r9.Z1()     // Catch:{ Exception -> 0x01eb }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x01eb }
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.DLDashboardNew.B3():void");
    }

    public final RcService C2() {
        RcService rcService = this.B0;
        if (rcService != null) {
            return rcService;
        }
        cm.l.v("mRcService");
        return null;
    }

    public final void C3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8551v0 = linearLayout;
    }

    public final cd.c D2() {
        cd.c cVar = this.A0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mRcViewModel");
        return null;
    }

    public final void D3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8547r0 = textView;
    }

    public final LinearLayout E2() {
        LinearLayout linearLayout = this.f8544o0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("nexgenarrow");
        return null;
    }

    public final void E3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8531b0 = linearLayout;
    }

    public final TextView F2() {
        TextView textView = this.f8545p0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("ntValidUpTodate");
        return null;
    }

    public final void F3(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f8555z0 = dldetobjX;
    }

    public void G(String str) {
    }

    public final boolean G2(String str, EditText editText, View view) {
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
                    s3(z2(), P2().b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"));
                    return true;
                }
            }
        }
        return false;
    }

    public final void G3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.U = linearLayout;
    }

    public final ImageView H2() {
        ImageView imageView = this.f8554y0;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("option_menu");
        return null;
    }

    public final void H3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8540k0 = str;
    }

    public final ImageView I2() {
        ImageView imageView = this.V;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("owner_image");
        return null;
    }

    public final void I3(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f8542m0 = dldetobjX;
    }

    public final TextView J2() {
        TextView textView = this.f8548s0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("owner_name");
        return null;
    }

    public final void J3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.X = editText;
    }

    public final ProgressDialog K2() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void K3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.Y = editText;
    }

    public final RecyclerView L2() {
        RecyclerView recyclerView = this.f8533d0;
        if (recyclerView != null) {
            return recyclerView;
        }
        cm.l.v("recDlRecycler");
        return null;
    }

    public final void L3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.Z = editText;
    }

    public final ArrayList M2() {
        ArrayList arrayList = this.f8534e0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("recentSearchList");
        return null;
    }

    public final void M3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.K = editText;
    }

    public final void N1(Context context, String str, String str2, DldetobjX dldetobjX, String str3) {
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
        ((TextView) findViewById3).setText(P2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ua.m(dialog, str2, this, dldetobjX, str3));
        dialog.show();
    }

    public final LinearLayout N2() {
        LinearLayout linearLayout = this.f8552w0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("redirect_DashBoard");
        return null;
    }

    public final void N3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8549t0 = textView;
    }

    public final LinearLayout O2() {
        LinearLayout linearLayout = this.f8543n0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("redirect_Rcdashboard");
        return null;
    }

    public final void O3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.M = linearLayout;
    }

    public final Bitmap P1(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ld.c P2() {
        ld.c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final void P3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.L = linearLayout;
    }

    public final TextView Q1() {
        TextView textView = this.f8550u0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("address");
        return null;
    }

    public final TextView Q2() {
        TextView textView = this.f8546q0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("trValidUpto");
        return null;
    }

    public final void Q3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8536g0 = linearLayout;
    }

    public final Calendar R1() {
        return this.f8538i0;
    }

    public final TextView R2() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtDlHolderName");
        return null;
    }

    public final void R3(Context context) {
        cm.l.f(context, "<set-?>");
        this.J = context;
    }

    public final TextView S1() {
        TextView textView = this.f8532c0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("clrText");
        return null;
    }

    public final TextView S2() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtIssueDate");
        return null;
    }

    public final void S3(DlService dlService) {
        cm.l.f(dlService, "<set-?>");
        this.H = dlService;
    }

    public final TextView T1() {
        TextView textView = this.f8553x0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("createDl");
        return null;
    }

    public final TextView T2() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicAuthCode");
        return null;
    }

    public final void T3(za.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public final DatabaseHelper U1() {
        DatabaseHelper databaseHelper = this.f8535f0;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final TextView U2() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicAuthority");
        return null;
    }

    public final void U3(RcService rcService) {
        cm.l.f(rcService, "<set-?>");
        this.B0 = rcService;
    }

    public final String V1() {
        String str = this.f8530a0;
        if (str != null) {
            return str;
        }
        cm.l.v("dateValeMain");
        return null;
    }

    public final TextView V2() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txtLicValidityCode");
        return null;
    }

    public final void V3(cd.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.A0 = cVar;
    }

    public final ImageView W1() {
        ImageView imageView = this.W;
        if (imageView != null) {
            return imageView;
        }
        cm.l.v("date_img");
        return null;
    }

    public final TextView W2() {
        TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_dl_number");
        return null;
    }

    public final void W3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8544o0 = linearLayout;
    }

    public final LinearLayout X1() {
        LinearLayout linearLayout = this.f8551v0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("dlHolder");
        return null;
    }

    public final LinearLayout X2() {
        LinearLayout linearLayout = this.f8537h0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("viewChallanLl");
        return null;
    }

    public final void X3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8545p0 = textView;
    }

    public final TextView Y1() {
        TextView textView = this.f8547r0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dlNo");
        return null;
    }

    public final void Y3(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.f8554y0 = imageView;
    }

    public final LinearLayout Z1() {
        LinearLayout linearLayout = this.f8531b0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("dlRecentSearch");
        return null;
    }

    public final void Z3(ImageView imageView) {
        cm.l.f(imageView, "<set-?>");
        this.V = imageView;
    }

    public final DldetobjX a2() {
        DldetobjX dldetobjX = this.f8555z0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dl_data");
        return null;
    }

    public final void a4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8548s0 = textView;
    }

    public final LinearLayout b2() {
        LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("dl_layout");
        return null;
    }

    public final void b4(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final String c2() {
        String str = this.f8540k0;
        if (str != null) {
            return str;
        }
        cm.l.v("dl_number");
        return null;
    }

    public final void c4(RecyclerView recyclerView) {
        cm.l.f(recyclerView, "<set-?>");
        this.f8533d0 = recyclerView;
    }

    public final DldetobjX d2() {
        DldetobjX dldetobjX = this.f8542m0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlobjx");
        return null;
    }

    public final void d4(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8534e0 = arrayList;
    }

    public final EditText e2() {
        EditText editText = this.X;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobDateMain");
        return null;
    }

    public final void e4(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8552w0 = linearLayout;
    }

    public final EditText f2() {
        EditText editText = this.Y;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobMonthMain");
        return null;
    }

    public final void f4(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8543n0 = linearLayout;
    }

    public final EditText g2() {
        EditText editText = this.Z;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dobYearMain");
        return null;
    }

    public final void g4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8546q0 = textView;
    }

    public final EditText h2() {
        EditText editText = this.K;
        if (editText != null) {
            return editText;
        }
        cm.l.v("etSearchDL");
        return null;
    }

    public final void h3(Context context) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View findViewById2 = dialog.findViewById(R.id.ok_dlt);
        cm.l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_msg);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        ((MyTextView) findViewById).setOnClickListener(new ua.n(dialog));
        ((MyTextView) findViewById2).setOnClickListener(new ua.o(dialog, this));
        dialog.show();
    }

    public final void h4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void i4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final void j4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.O = textView;
    }

    public final void k3(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.verify_card);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById2 = dialog.findViewById(R.id.cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View findViewById3 = dialog.findViewById(R.id.applicant_year);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById4 = dialog.findViewById(R.id.applicant_month);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById5 = dialog.findViewById(R.id.applicant_date);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        View findViewById6 = dialog.findViewById(R.id.head);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById7 = dialog.findViewById(R.id.verify_text_view);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.cancle_txt);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(P2().b(v9.f.f17510a.W0(), "Verify your DL"));
        ((TextView) findViewById7).setText(P2().b("vahan_btn_verify", "Verify"));
        ((TextView) findViewById8).setText(P2().b("button_cancel", "Cancel"));
        View findViewById9 = dialog.findViewById(R.id.dob_badge);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById9).setText(P2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((CardView) findViewById2).setOnClickListener(new ua.x(dialog));
        ((CardView) findViewById).setOnClickListener(new y(str, this, (EditText) findViewById3, (EditText) findViewById4, (EditText) findViewById5, dialog));
        dialog.show();
    }

    public final void k4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void l4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void m4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void n3(Context context, String str, String str2, int i10) {
        String str3 = str2;
        cm.l.f(str3, "dl_number");
        cm.l.c(context);
        Context context2 = context;
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
        View findViewById6 = dialog.findViewById(R.id.head);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById7 = dialog.findViewById(R.id.verify_text_view);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.cancle_txt);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(P2().b(v9.f.f17510a.W0(), "Verify your DL"));
        ((TextView) findViewById7).setText(P2().b("vahan_btn_verify", "Verify"));
        ((TextView) findViewById8).setText(P2().b("button_cancel", "Cancel"));
        View findViewById9 = dialog.findViewById(R.id.dob_badge);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById9).setText(P2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        editText3.setOnEditorActionListener(new ua.q());
        editText3.addTextChangedListener(new k(editText2));
        editText3.addTextChangedListener(new l(editText3, editText2));
        editText2.addTextChangedListener(new m(editText));
        editText2.setOnKeyListener(new r(editText2, editText3));
        editText2.addTextChangedListener(new n(editText2, editText));
        View findViewById10 = dialog.findViewById(R.id.dob_cal);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.ImageView");
        u uVar = new u();
        uVar.f20234e = Calendar.getInstance();
        ((ImageView) findViewById10).setOnClickListener(new o(this, new p(uVar, editText3, editText2, editText), uVar));
        ((CardView) findViewById2).setOnClickListener(new s(dialog));
        ((CardView) findViewById).setOnClickListener(new t(str, this, editText, editText2, editText3, i10, dialog, str3));
        dialog.show();
    }

    public final void n4(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.T = textView;
    }

    public final void o4(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f8539j0 = gVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e2 c10 = e2.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.C0 = c10;
        e2 e2Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = v9.e.f17509a;
        e2 e2Var2 = this.C0;
        if (e2Var2 == null) {
            cm.l.v("binding");
        } else {
            e2Var = e2Var2;
        }
        aVar.w0(this, e2Var);
        R3(this);
        U3(RcService.f9484a.c(this));
        S3(DlService.f8615a.c(this));
        o4(new ld.g(this));
        DatabaseHelper A02 = DatabaseHelper.A0(z2());
        cm.l.e(A02, "getInstance(...)");
        y3(A02);
        b4(new ProgressDialog(z2()));
        K2().setMessage(P2().b("label_challan_please_wait", "Please wait..."));
        K2().setCancelable(false);
        K2().setCanceledOnTouchOutside(false);
        T3((za.a) new u0((x0) this, (u0.b) new za.b(new ya.a(A2()))).a(za.a.class));
        V3((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(C2()))).a(cd.c.class));
        i2();
        B2().v().g(this, new ua.a(this));
        B2().w().g(this, new ua.l(this));
        B2().B().g(this, new w(this));
        B2().C().g(this, new z(this));
        B2().n().g(this, new q(new h(this)));
        B2().o().g(this, new q(new i(this)));
        D2().x().g(this, new q(new j(this)));
        B2().r().g(this, new a0(this));
        B2().s().g(this, new ua.b0(this));
    }

    public final void p4(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.f8537h0 = linearLayout;
    }

    public final void q4(Context context, String str) {
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
        ((TextView) findViewById3).setText(P2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new c0(dialog));
        dialog.show();
    }

    public void s(String str) {
        if (str != null) {
            k3(z2(), str);
        }
    }

    public final void s3(Context context, String str) {
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
        ((TextView) findViewById3).setText(P2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new ua.k(dialog));
        dialog.show();
    }

    public final void u3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8550u0 = textView;
    }

    public final void v3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8532c0 = textView;
    }

    public final TextView w2() {
        TextView textView = this.f8549t0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("issue_date");
        return null;
    }

    public final void w3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8553x0 = textView;
    }

    public final LinearLayout x2() {
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("llSearchDL");
        return null;
    }

    public final void x3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8541l0 = str;
    }

    public final LinearLayout y2() {
        LinearLayout linearLayout = this.f8536g0;
        if (linearLayout != null) {
            return linearLayout;
        }
        cm.l.v("ll_create_dl");
        return null;
    }

    public final void y3(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.f8535f0 = databaseHelper;
    }

    public final Context z2() {
        Context context = this.J;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void z3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8530a0 = str;
    }
}
