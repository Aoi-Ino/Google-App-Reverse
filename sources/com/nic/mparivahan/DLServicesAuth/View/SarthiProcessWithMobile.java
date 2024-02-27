package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.u;
import cm.y;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.mobileupdate.SarathiMobileUpdateActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import ni.uc;
import pl.x;

public final class SarthiProcessWithMobile extends oi.g {
    public uc J;
    public ba.b K;
    public DlServiceInt L;
    private String M;
    private String N;
    private String O;
    public EditText P;
    public Button Q;
    public DldetobjX R;
    public ProgressDialog S;
    public LinearLayout T;
    public ld.g U;
    private HashMap V = new HashMap();
    public ld.f W;
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f8170a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f8171b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f8172c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f8173d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    public ProgressBar f8174e0;

    /* renamed from: f0  reason: collision with root package name */
    public ProgressBar f8175f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f8176g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f8177h0;

    /* renamed from: i0  reason: collision with root package name */
    private String f8178i0 = "allowAddrChange";

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f8179j0;

    /* renamed from: k0  reason: collision with root package name */
    public ArrayList f8180k0;

    /* renamed from: l0  reason: collision with root package name */
    public ArrayList f8181l0;

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f8182m0;

    /* renamed from: n0  reason: collision with root package name */
    private String f8183n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private boolean f8184o0;

    /* renamed from: p0  reason: collision with root package name */
    public w9.c f8185p0;

    /* renamed from: q0  reason: collision with root package name */
    public FromEligCheck f8186q0;

    /* renamed from: r0  reason: collision with root package name */
    public Context f8187r0;

    /* renamed from: s0  reason: collision with root package name */
    public CustomWegetLayout f8188s0;

    /* renamed from: t0  reason: collision with root package name */
    private String f8189t0 = "valid";

    /* renamed from: u0  reason: collision with root package name */
    private String f8190u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    public ArrayList f8191v0;

    public final class a extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f8192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8193e;

        /* renamed from: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile$a$a  reason: collision with other inner class name */
        public final class C0114a extends RecyclerView.d0 {
            private final ImageView A;
            private final LinearLayout B;
            final /* synthetic */ a C;

            /* renamed from: y  reason: collision with root package name */
            private final CheckBox f8194y;

            /* renamed from: z  reason: collision with root package name */
            private final TextView f8195z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0114a(a aVar, View view) {
                super(view);
                cm.l.f(view, "ItemView");
                this.C = aVar;
                View findViewById = this.f3622e.findViewById(R.id.service_check_box);
                cm.l.e(findViewById, "findViewById(...)");
                this.f8194y = (CheckBox) findViewById;
                View findViewById2 = this.f3622e.findViewById(R.id.service_txt);
                cm.l.e(findViewById2, "findViewById(...)");
                this.f8195z = (TextView) findViewById2;
                View findViewById3 = this.f3622e.findViewById(R.id.rightStatePin);
                cm.l.e(findViewById3, "findViewById(...)");
                this.A = (ImageView) findViewById3;
                View findViewById4 = this.f3622e.findViewById(R.id.multi_layout);
                cm.l.e(findViewById4, "findViewById(...)");
                this.B = (LinearLayout) findViewById4;
            }

            public final LinearLayout O() {
                return this.B;
            }

            public final ImageView P() {
                return this.A;
            }

            public final TextView Q() {
                return this.f8195z;
            }
        }

        public a(SarthiProcessWithMobile sarthiProcessWithMobile, ArrayList arrayList) {
            cm.l.f(arrayList, "mList");
            this.f8193e = sarthiProcessWithMobile;
            this.f8192d = arrayList;
        }

        /* access modifiers changed from: private */
        public static final void C(SarthiProcessWithMobile sarthiProcessWithMobile, C0114a aVar, a aVar2, String str, View view) {
            C0114a aVar3;
            ArrayList r22;
            String str2;
            ArrayList r23;
            String str3;
            StringBuilder sb2;
            SarthiProcessWithMobile sarthiProcessWithMobile2 = sarthiProcessWithMobile;
            C0114a aVar4 = aVar;
            a aVar5 = aVar2;
            String str4 = str;
            cm.l.f(sarthiProcessWithMobile2, "this$0");
            cm.l.f(aVar4, "$holder");
            cm.l.f(aVar5, "this$1");
            cm.l.f(str4, "$mModel");
            Log.d("values", sarthiProcessWithMobile.g2() + '-' + sarthiProcessWithMobile.e2());
            if (cm.l.a(sarthiProcessWithMobile.p2(), aVar.Q().getText())) {
                sb2 = new StringBuilder();
            } else if (!cm.l.a(sarthiProcessWithMobile.A2(), "differ") || !cm.l.a(aVar.Q().getText(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                if (!sarthiProcessWithMobile.l2().contains(aVar.Q().getText().toString())) {
                    sarthiProcessWithMobile.l2().add(aVar.Q().getText().toString());
                } else if (!cm.l.a(sarthiProcessWithMobile.g2(), "S") || !cm.l.a(sarthiProcessWithMobile.e2(), "Y") || !cm.l.a(aVar.Q().getText(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    sarthiProcessWithMobile.l2().remove(aVar.Q().getText().toString());
                } else {
                    sarthiProcessWithMobile2.n3(aVar.Q().getCurrentTextColor() == -1 ? "0" : "1");
                }
                Object obj = "Y";
                Object obj2 = "S";
                Object obj3 = "515";
                if (!sarthiProcessWithMobile.s2().contains(aVar.Q().getText().toString())) {
                    aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                    aVar.Q().setTextColor(-1);
                    aVar.P().setImageDrawable((Drawable) null);
                    aVar5.E(str4, aVar4);
                    sarthiProcessWithMobile.s2().add(aVar.Q().getText().toString());
                    if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        sarthiProcessWithMobile.r2().add("513");
                        return;
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        sarthiProcessWithMobile.r2().add("514");
                        return;
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        sarthiProcessWithMobile.r2().add("537");
                        return;
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        sarthiProcessWithMobile.r2().add(obj3);
                        return;
                    } else {
                        if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                            r23 = sarthiProcessWithMobile.r2();
                            str3 = "516";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            r23 = sarthiProcessWithMobile.r2();
                            str3 = "523";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                            r23 = sarthiProcessWithMobile.r2();
                            str3 = "524";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("change_name_dl", "Change of Name in DL"))) {
                            r23 = sarthiProcessWithMobile.r2();
                            str3 = "526";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            r23 = sarthiProcessWithMobile.r2();
                            str3 = "548";
                        } else {
                            return;
                        }
                        r23.add(str3);
                        return;
                    }
                } else {
                    Object obj4 = obj3;
                    if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        sarthiProcessWithMobile.r2().remove("513");
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        sarthiProcessWithMobile.r2().remove("514");
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        sarthiProcessWithMobile.r2().remove("537");
                    } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        sarthiProcessWithMobile.r2().remove(obj4);
                    } else {
                        if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                            r22 = sarthiProcessWithMobile.r2();
                            str2 = "516";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            r22 = sarthiProcessWithMobile.r2();
                            str2 = "523";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                            r22 = sarthiProcessWithMobile.r2();
                            str2 = "524";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("change_name_dl", "Change of Name in DL"))) {
                            r22 = sarthiProcessWithMobile.r2();
                            str2 = "526";
                        } else if (cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            r22 = sarthiProcessWithMobile.r2();
                            str2 = "548";
                        }
                        r22.remove(str2);
                    }
                    if (!cm.l.a(sarthiProcessWithMobile.g2(), obj2) || !cm.l.a(sarthiProcessWithMobile.e2(), obj) || !y.R(sarthiProcessWithMobile.s2(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL")) || !cm.l.a(aVar.Q().getText().toString(), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        aVar3 = aVar;
                        sarthiProcessWithMobile.s2().remove(aVar.Q().getText().toString());
                        aVar.O().setBackgroundResource(R.drawable.multi_serv_background);
                        aVar.Q().setTextColor(-16777216);
                        aVar.P().setImageDrawable((Drawable) null);
                    } else if (aVar.Q().getCurrentTextColor() == -1) {
                        aVar.O().setBackgroundResource(R.drawable.multi_serv_background);
                        aVar.Q().setTextColor(-16777216);
                        aVar.P().setImageDrawable((Drawable) null);
                        aVar3 = aVar;
                    } else {
                        aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                        aVar.Q().setTextColor(-1);
                        aVar.P().setImageDrawable((Drawable) null);
                        aVar5.E(str4, aVar);
                        return;
                    }
                    aVar5.F(str4, aVar3);
                    return;
                }
            } else {
                sarthiProcessWithMobile2.k3(true);
                sb2 = new StringBuilder();
            }
            sb2.append("You can not deselect the ");
            sb2.append(aVar.Q().getText());
            sb2.append(" Service");
            Toast.makeText(sarthiProcessWithMobile2, sb2.toString(), 1).show();
        }

        private final void E(String str, C0114a aVar) {
            ImageView P;
            Resources resources;
            int i10;
            Drawable drawable;
            if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_change_addr", "Issue of Duplicate DL"))) {
                P = aVar.P();
                resources = this.f8193e.m2().getResources();
                i10 = R.drawable.icdlmulti;
            } else if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                P = aVar.P();
                resources = this.f8193e.m2().getResources();
                i10 = R.drawable.renmulti;
            } else {
                if (!cm.l.a(str, this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        P = aVar.P();
                        resources = this.f8193e.m2().getResources();
                        i10 = R.drawable.coamulti;
                    } else if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_replacement_dl", "Replacement of DL")) || cm.l.a(str, this.f8193e.k2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        P = aVar.P();
                        drawable = this.f8193e.m2().getResources().getDrawable(R.drawable.icrepmulti);
                        P.setImageDrawable(drawable);
                    } else if (cm.l.a(str, this.f8193e.k2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        P = aVar.P();
                        resources = this.f8193e.m2().getResources();
                        i10 = R.drawable.endormulti;
                    } else if (!cm.l.a(str, this.f8193e.k2().b("change_name_dl", "Change of Name in DL"))) {
                        if (cm.l.a(str, this.f8193e.k2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            P = aVar.P();
                            resources = this.f8193e.m2().getResources();
                            i10 = R.drawable.dobmulti;
                        } else {
                            return;
                        }
                    }
                }
                P = aVar.P();
                drawable = this.f8193e.m2().getResources().getDrawable(R.drawable.iclearnermulti);
                P.setImageDrawable(drawable);
            }
            drawable = resources.getDrawable(i10);
            P.setImageDrawable(drawable);
        }

        private final void F(String str, C0114a aVar) {
            ImageView P;
            Resources resources;
            int i10;
            Drawable drawable;
            if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                P = aVar.P();
                resources = this.f8193e.m2().getResources();
                i10 = R.drawable.ic_newdriving;
            } else {
                boolean a10 = cm.l.a(str, this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"));
                int i11 = R.drawable.ic_learnerr;
                if (!a10 && !cm.l.a(str, this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    boolean a11 = cm.l.a(str, this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                    i11 = R.drawable.mvvm_ic_addres;
                    if (!a11) {
                        if (cm.l.a(str, this.f8193e.k2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                            P = aVar.P();
                            resources = this.f8193e.m2().getResources();
                            i10 = R.drawable.ic_exxtract;
                        } else if (!cm.l.a(str, this.f8193e.k2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            if (cm.l.a(str, this.f8193e.k2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                P = aVar.P();
                                resources = this.f8193e.m2().getResources();
                                i10 = R.drawable.endorsedl;
                            } else if (cm.l.a(str, this.f8193e.k2().b("change_name_dl", "Change of Name in DL"))) {
                                P = aVar.P();
                                resources = this.f8193e.m2().getResources();
                                i10 = R.drawable.coname;
                            } else if (cm.l.a(str, this.f8193e.k2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                P = aVar.P();
                                resources = this.f8193e.m2().getResources();
                                i10 = R.drawable.codob;
                            } else {
                                return;
                            }
                        }
                    }
                }
                P = aVar.P();
                drawable = this.f8193e.m2().getResources().getDrawable(i11);
                P.setImageDrawable(drawable);
            }
            drawable = resources.getDrawable(i10);
            P.setImageDrawable(drawable);
        }

        /* renamed from: B */
        public void p(C0114a aVar, int i10) {
            cm.l.f(aVar, "holder");
            Object obj = this.f8192d.get(i10);
            cm.l.e(obj, "get(...)");
            String str = (String) obj;
            F(str, aVar);
            aVar.Q().setText(str);
            if (cm.l.a(this.f8193e.p2(), aVar.Q().getText())) {
                aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                aVar.Q().setTextColor(-1);
                aVar.P().setImageDrawable((Drawable) null);
                if (cm.l.a(this.f8193e.p2(), this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    aVar.P().setImageDrawable(this.f8193e.m2().getResources().getDrawable(R.drawable.renmulti));
                    if (!y.R(this.f8193e.r2(), this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        this.f8193e.r2().add("514");
                    }
                    if (!y.R(this.f8193e.s2(), this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        ArrayList s22 = this.f8193e.s2();
                        String b10 = this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        cm.l.c(b10);
                        s22.add(b10);
                        ArrayList l22 = this.f8193e.l2();
                        String b11 = this.f8193e.k2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        cm.l.c(b11);
                        l22.add(b11);
                    }
                }
                if (cm.l.a(this.f8193e.p2(), this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    aVar.P().setImageDrawable(this.f8193e.m2().getResources().getDrawable(R.drawable.iclearnermulti));
                    if (!y.R(this.f8193e.r2(), this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        this.f8193e.r2().add("537");
                    }
                    if (!y.R(this.f8193e.s2(), this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        ArrayList s23 = this.f8193e.s2();
                        String b12 = this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        cm.l.c(b12);
                        s23.add(b12);
                        ArrayList l23 = this.f8193e.l2();
                        String b13 = this.f8193e.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        cm.l.c(b13);
                        l23.add(b13);
                    }
                }
            }
            if (cm.l.a(this.f8193e.A2(), "differ") && cm.l.a(aVar.Q().getText(), this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this.f8193e.k3(true);
                this.f8193e.s2().add(str);
                this.f8193e.l2().add(str);
                aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                aVar.Q().setTextColor(-1);
                aVar.P().setImageDrawable((Drawable) null);
                if (!y.R(this.f8193e.r2(), this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this.f8193e.r2().add("515");
                }
                E(str, aVar);
            }
            if (cm.l.a(this.f8193e.g2(), "S") && cm.l.a(this.f8193e.e2(), "Y") && cm.l.a(aVar.Q().getText(), this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL")) && !this.f8193e.h2()) {
                ArrayList s24 = this.f8193e.s2();
                String b14 = this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL");
                cm.l.c(b14);
                s24.add(b14);
                ArrayList l24 = this.f8193e.l2();
                String b15 = this.f8193e.k2().b("check_dl_serv_change_addr", "Change of Address in DL");
                cm.l.c(b15);
                l24.add(b15);
                this.f8193e.n3("0");
            }
            aVar.O().setOnClickListener(new h3(this.f8193e, aVar, this, str));
        }

        /* renamed from: D */
        public C0114a r(ViewGroup viewGroup, int i10) {
            cm.l.f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_service, viewGroup, false);
            cm.l.c(inflate);
            return new C0114a(this, inflate);
        }

        public int e() {
            return this.f8192d.size();
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final b f8196e = new b();

        b() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8197e;

        c(SarthiProcessWithMobile sarthiProcessWithMobile) {
            this.f8197e = sarthiProcessWithMobile;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            AppCompatButton appCompatButton;
            float f10;
            cm.l.f(charSequence, "s");
            if (charSequence.length() >= 10) {
                SarthiProcessWithMobile sarthiProcessWithMobile = this.f8197e;
                sarthiProcessWithMobile.u3(String.valueOf(sarthiProcessWithMobile.f2().f28878n.getText()));
                appCompatButton = this.f8197e.f2().f28872h;
                f10 = 1.0f;
            } else {
                appCompatButton = this.f8197e.f2().f28872h;
                f10 = 0.6f;
            }
            appCompatButton.setAlpha(f10);
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final d f8198e = new d();

        d() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f8199e = new e();

        e() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8200e;

        static final class a extends cm.m implements bm.l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f8201e = new a();

            a() {
                super(1);
            }

            public final void b(String str) {
                cm.l.f(str, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((String) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SarthiProcessWithMobile sarthiProcessWithMobile) {
            super(1);
            this.f8200e = sarthiProcessWithMobile;
        }

        public final void b(SendOtpResult sendOtpResult) {
            this.f8200e.u2().setVisibility(8);
            this.f8200e.f2().f28884t.setAlpha(1.0f);
            this.f8200e.f2().f28872h.setAlpha(1.0f);
            this.f8200e.f2().f28872h.setClickable(true);
            this.f8200e.f2().f28884t.setClickable(true);
            try {
                if (p.o(sendOtpResult.getStatusCode(), "AL001", true)) {
                    this.f8200e.D3(String.valueOf(sendOtpResult.getRecordId()));
                    SarthiProcessWithMobile sarthiProcessWithMobile = this.f8200e;
                    sarthiProcessWithMobile.K3(sarthiProcessWithMobile, String.valueOf(sarthiProcessWithMobile.f2().f28878n.getText()));
                } else if (p.o(sendOtpResult.getStatusCode(), "AL099", true)) {
                    t8.c.f16582a.c(this.f8200e, sendOtpResult.getStatusDesc());
                } else {
                    SarthiProcessWithMobile sarthiProcessWithMobile2 = this.f8200e;
                    String b10 = sarthiProcessWithMobile2.k2().b("nex_parivahan", this.f8200e.getString(R.string.app_name));
                    cm.l.c(b10);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String b11 = this.f8200e.k2().b("btn_ok", this.f8200e.getString(R.string.ok_txt));
                    cm.l.c(b11);
                    oi.g.n1(sarthiProcessWithMobile2, b10, statusDesc, 1, b11, (String) null, a.f8201e, 16, (Object) null);
                }
            } catch (Exception unused) {
                this.f8200e.u2().setVisibility(8);
                this.f8200e.f2().f28884t.setAlpha(1.0f);
                this.f8200e.f2().f28872h.setAlpha(1.0f);
                this.f8200e.f2().f28872h.setClickable(true);
                this.f8200e.f2().f28884t.setClickable(true);
                SarthiProcessWithMobile sarthiProcessWithMobile3 = this.f8200e;
                String b12 = sarthiProcessWithMobile3.k2().b("label_went_wrong", this.f8200e.getString(R.string.something_please_try_after_some_time));
                cm.l.c(b12);
                sarthiProcessWithMobile3.b3(b12);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SendOtpResult) obj);
            return x.f30437a;
        }
    }

    public static final class g extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8202a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SarthiProcessWithMobile sarthiProcessWithMobile) {
            super(30000, 1000);
            this.f8202a = sarthiProcessWithMobile;
        }

        public void onFinish() {
            this.f8202a.f2().f28883s.setVisibility(0);
            this.f8202a.f2().f28881q.setText("0");
            this.f8202a.f2().f28881q.setVisibility(8);
        }

        public void onTick(long j10) {
            AppCompatTextView appCompatTextView = this.f8202a.f2().f28881q;
            appCompatTextView.setText(this.f8202a.k2().b("time_remaining", this.f8202a.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            this.f8202a.f2().f28883s.setVisibility(8);
            this.f8202a.f2().f28881q.setVisibility(0);
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final h f8203e = new h();

        h() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final i f8204e = new i();

        i() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final j f8205e = new j();

        j() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final k f8206e = new k();

        k() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class l implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8207a;

        l(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f8207a = lVar;
        }

        public final pl.c a() {
            return this.f8207a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8207a.invoke(obj);
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

    public static final class m extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f8210c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(TextView textView, SarthiProcessWithMobile sarthiProcessWithMobile, u uVar) {
            super(30000, 1000);
            this.f8208a = textView;
            this.f8209b = sarthiProcessWithMobile;
            this.f8210c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f8210c.f20234e).setVisibility(0);
            this.f8208a.setText("0");
            this.f8208a.setVisibility(8);
        }

        public void onTick(long j10) {
            Log.e("calling", "321");
            TextView textView = this.f8208a;
            textView.setText(this.f8209b.k2().b("time_remaining", this.f8209b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f8210c.f20234e).setVisibility(8);
            this.f8208a.setVisibility(0);
        }
    }

    public static final class n extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithMobile f8212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f8213c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(TextView textView, SarthiProcessWithMobile sarthiProcessWithMobile, u uVar) {
            super(30000, 1000);
            this.f8211a = textView;
            this.f8212b = sarthiProcessWithMobile;
            this.f8213c = uVar;
        }

        public void onFinish() {
            ((TextView) this.f8213c.f20234e).setVisibility(0);
            this.f8211a.setText("0");
            this.f8211a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8211a;
            textView.setText(this.f8212b.k2().b("time_remaining", this.f8212b.getString(R.string.time_remaining)) + " : " + (j10 / ((long) 1000)));
            ((TextView) this.f8213c.f20234e).setVisibility(8);
            this.f8211a.setVisibility(0);
        }
    }

    private final void D2(Intent intent, String str, String str2, String str3) {
        y2().o("NA", "N", "NA", "NA");
        try {
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", i2());
            intent.putExtra("Mobile_no", this.f8173d0);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.Y);
            intent.putExtra("lastEndorseStateCode", this.Z);
            intent.putExtra("whatServiceRequired", this.V);
            intent.putExtra("state_value", this.f8172c0);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", this.X);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.f8178i0);
            intent.putExtra("eKYCId", "NA");
            intent.putExtra("eKYCOpted", "N");
            intent.putExtra("eKYCGender", "NA");
            intent.putExtra("eKYCapplicantPhoto", "NA");
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void E2(Intent intent, String str, String str2, String str3, ArrayList arrayList, int i10) {
        if (r2().size() > 1) {
            ld.f y22 = y2();
            String b10 = k2().b("dl_services", getString(R.string.dl_services));
            cm.l.c(b10);
            y22.r(b10, VContant.MULTISERVICE_PURPOSE_CODE);
        }
        y2().o("NA", "N", "NA", "NA");
        try {
            intent.putExtra("DL", this.M);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", i2());
            intent.putExtra("Mobile_no", this.f8173d0);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.Y);
            intent.putExtra("lastEndorseStateCode", this.Z);
            intent.putExtra("whatServiceRequired", this.V);
            intent.putExtra("state_value", this.f8172c0);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", this.X);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.f8178i0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("serialNo", i10);
            intent.putExtra("COA", this.f8184o0);
            intent.putExtra("metaflag", this.f8190u0);
            intent.putExtra("listHeaderSteps", l2());
            intent.putExtra("eKYCId", "NA");
            intent.putExtra("eKYCOpted", "N");
            intent.putExtra("eKYCGender", "NA");
            intent.putExtra("eKYCapplicantPhoto", "NA");
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void F2(SarthiProcessWithMobile sarthiProcessWithMobile, CustomState customState) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        try {
            if (p.o(customState.getStatus_code(), "00", true)) {
                sarthiProcessWithMobile.f8178i0 = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
            sarthiProcessWithMobile.b3(sarthiProcessWithMobile.getString(R.string.something_please_try_after_some_time));
        }
    }

    /* access modifiers changed from: private */
    public static final void G2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        Toast makeText;
        String b10;
        String b11;
        int i10;
        String b12;
        String str;
        bm.l lVar;
        cm.l.f(sarthiProcessWithMobile, "this$0");
        if (!com.nic.mparivahan.a.f9624a.a(sarthiProcessWithMobile)) {
            makeText = Toast.makeText(sarthiProcessWithMobile.getApplicationContext(), sarthiProcessWithMobile.k2().b("label_log_check_internet", sarthiProcessWithMobile.getString(R.string.kindly_check_your_internet_connection)), 0);
        } else if (sarthiProcessWithMobile.f2().f28872h.getAlpha() != 1.0f) {
            return;
        } else {
            if (sarthiProcessWithMobile.f2().f28873i.isChecked()) {
                if (sarthiProcessWithMobile.f8173d0.length() < 10) {
                    b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
                    cm.l.c(b10);
                    b11 = sarthiProcessWithMobile.k2().b("label_log_entr_vali_mobno", sarthiProcessWithMobile.getString(R.string.enter_mobile_no));
                    cm.l.c(b11);
                    i10 = 1;
                    b12 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
                    cm.l.c(b12);
                    str = null;
                    lVar = d.f8198e;
                } else if (!t8.c.f16582a.q(sarthiProcessWithMobile.f8173d0)) {
                    b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
                    cm.l.c(b10);
                    b11 = sarthiProcessWithMobile.k2().b("label_log_entr_vali_mobno", sarthiProcessWithMobile.getString(R.string.enter_mobile_no));
                    cm.l.c(b11);
                    i10 = 1;
                    b12 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
                    cm.l.c(b12);
                    str = null;
                    lVar = e.f8199e;
                } else {
                    sarthiProcessWithMobile.f2().f28884t.setAlpha(0.5f);
                    sarthiProcessWithMobile.f2().f28872h.setAlpha(0.5f);
                    sarthiProcessWithMobile.f2().f28872h.setClickable(false);
                    sarthiProcessWithMobile.f2().f28884t.setClickable(false);
                    sarthiProcessWithMobile.u2().setVisibility(0);
                    sarthiProcessWithMobile.j2().F(sarthiProcessWithMobile, sarthiProcessWithMobile.f8173d0, sarthiProcessWithMobile.z2().k().toString());
                    return;
                }
                oi.g.n1(sarthiProcessWithMobile, b10, b11, i10, b12, str, lVar, 16, (Object) null);
                return;
            }
            makeText = Toast.makeText(sarthiProcessWithMobile, sarthiProcessWithMobile.k2().b("plz_accept_term_conditions", sarthiProcessWithMobile.getString(R.string.pls_enter_term_conditions)), 0);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void H2(SarthiProcessWithMobile sarthiProcessWithMobile, String str) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.d2();
        String b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = sarthiProcessWithMobile.k2().b("label_log_unbl_veri_otp", sarthiProcessWithMobile.getString(R.string.unable_verifiy_otp));
        cm.l.c(b11);
        String b12 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
        cm.l.c(b12);
        oi.g.n1(sarthiProcessWithMobile, b10, b11, 1, b12, (String) null, b.f8196e, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void I2(SarthiProcessWithMobile sarthiProcessWithMobile, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        Intent intent;
        String str;
        String str2;
        Intent intent2;
        String str3;
        String str4;
        Intent intent3;
        String str5;
        String str6;
        SarthiProcessWithMobile sarthiProcessWithMobile2 = sarthiProcessWithMobile;
        String str7 = "524";
        cm.l.f(sarthiProcessWithMobile2, "this$0");
        sarthiProcessWithMobile.d2();
        if (cm.l.a(sarthiProcessWithMobile.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            sarthiProcessWithMobile.d3();
            return;
        }
        try {
            if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && dlLastRtoDetailsDto.getResult() != null) {
                Class<RenewalOfDLActivity> cls = RenewalOfDLActivity.class;
                String str8 = "525";
                Class<ChangeOfAddressActivity> cls2 = ChangeOfAddressActivity.class;
                String str9 = "523";
                if (p.p((String) sarthiProcessWithMobile2.V.get("537"), "RE-VALIDATION OF EXPIRED DL", false, 2, (Object) null)) {
                    if (!p.o(sarthiProcessWithMobile2.f8172c0, "same", true)) {
                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                        intent3 = sarthiProcessWithMobile.getIntent();
                        cm.l.e(intent3, "getIntent(...)");
                        str5 = sarthiProcessWithMobile2.f8171b0;
                        str6 = sarthiProcessWithMobile2.f8170a0;
                    } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls));
                        intent3 = sarthiProcessWithMobile.getIntent();
                        cm.l.e(intent3, "getIntent(...)");
                        str5 = sarthiProcessWithMobile2.f8171b0;
                        str6 = sarthiProcessWithMobile2.f8170a0;
                    } else {
                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                        intent3 = sarthiProcessWithMobile.getIntent();
                        cm.l.e(intent3, "getIntent(...)");
                        str5 = sarthiProcessWithMobile2.f8171b0;
                        str6 = sarthiProcessWithMobile2.f8170a0;
                    }
                    sarthiProcessWithMobile2.D2(intent3, str5, str6, "537");
                } else {
                    String str10 = "515";
                    String str11 = "516";
                    String str12 = "513";
                    if (p.p((String) sarthiProcessWithMobile2.V.get("526"), "Change of Name in DL", false, 2, (Object) null)) {
                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, ChangeOfName.class));
                        Intent intent4 = sarthiProcessWithMobile.getIntent();
                        cm.l.e(intent4, "getIntent(...)");
                        sarthiProcessWithMobile2.D2(intent4, sarthiProcessWithMobile2.f8171b0, sarthiProcessWithMobile2.f8170a0, "526");
                    } else if (p.p((String) sarthiProcessWithMobile2.V.get("548"), "Change of Date of Birth in DL", false, 2, (Object) null)) {
                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, DobChangeActivity.class));
                        Intent intent5 = sarthiProcessWithMobile.getIntent();
                        cm.l.e(intent5, "getIntent(...)");
                        sarthiProcessWithMobile2.D2(intent5, sarthiProcessWithMobile2.f8171b0, sarthiProcessWithMobile2.f8170a0, "548");
                    } else {
                        if (p.p((String) sarthiProcessWithMobile2.V.get(str7), "Endorsement to Drive in Hill Region", false, 2, (Object) null)) {
                            sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, HillReligion.class));
                            intent = sarthiProcessWithMobile.getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = sarthiProcessWithMobile2.f8171b0;
                            str2 = sarthiProcessWithMobile2.f8170a0;
                        } else if (p.p((String) sarthiProcessWithMobile2.V.get("514"), "Renewal of DL", false, 2, (Object) null)) {
                            if (!p.o(sarthiProcessWithMobile2.f8172c0, "same", true)) {
                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                intent2 = sarthiProcessWithMobile.getIntent();
                                cm.l.e(intent2, "getIntent(...)");
                                str3 = sarthiProcessWithMobile2.f8171b0;
                                str4 = sarthiProcessWithMobile2.f8170a0;
                            } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls));
                                intent2 = sarthiProcessWithMobile.getIntent();
                                cm.l.e(intent2, "getIntent(...)");
                                str3 = sarthiProcessWithMobile2.f8171b0;
                                str4 = sarthiProcessWithMobile2.f8170a0;
                            } else {
                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                intent2 = sarthiProcessWithMobile.getIntent();
                                cm.l.e(intent2, "getIntent(...)");
                                str3 = sarthiProcessWithMobile2.f8171b0;
                                str4 = sarthiProcessWithMobile2.f8170a0;
                            }
                            sarthiProcessWithMobile2.D2(intent2, str3, str4, "514");
                        } else {
                            str7 = str10;
                            if (p.p((String) sarthiProcessWithMobile2.V.get(str7), "Change of Address in DL", false, 2, (Object) null)) {
                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                intent = sarthiProcessWithMobile.getIntent();
                                cm.l.e(intent, "getIntent(...)");
                                str = sarthiProcessWithMobile2.f8171b0;
                                str2 = sarthiProcessWithMobile2.f8170a0;
                            } else {
                                str7 = str12;
                                if (!p.p((String) sarthiProcessWithMobile2.V.get(str7), "Issue of Duplicate DL", false, 2, (Object) null)) {
                                    str7 = str11;
                                    if (!p.p((String) sarthiProcessWithMobile2.V.get(str7), "Replacement of DL", false, 2, (Object) null)) {
                                        str7 = str9;
                                        if (!p.p((String) sarthiProcessWithMobile2.V.get(str7), "DL Extract", false, 2, (Object) null)) {
                                            str7 = str8;
                                            if (!p.p((String) sarthiProcessWithMobile2.V.get(str7), "International Driving Permit", false, 2, (Object) null)) {
                                                sarthiProcessWithMobile2.r1(sarthiProcessWithMobile.k2().b("service_is_not_present", sarthiProcessWithMobile2.getString(R.string.unable_to_get_details)), sarthiProcessWithMobile.f2().b());
                                                return;
                                            } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, DLIdpActivity.class));
                                                intent = sarthiProcessWithMobile.getIntent();
                                                cm.l.e(intent, "getIntent(...)");
                                                str = sarthiProcessWithMobile2.f8171b0;
                                                str2 = sarthiProcessWithMobile2.f8170a0;
                                            } else {
                                                sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                                intent = sarthiProcessWithMobile.getIntent();
                                                cm.l.e(intent, "getIntent(...)");
                                                str = sarthiProcessWithMobile2.f8171b0;
                                                str2 = sarthiProcessWithMobile2.f8170a0;
                                            }
                                        } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                                            sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, DLExtractActivity.class));
                                            intent = sarthiProcessWithMobile.getIntent();
                                            cm.l.e(intent, "getIntent(...)");
                                            str = sarthiProcessWithMobile2.f8171b0;
                                            str2 = sarthiProcessWithMobile2.f8170a0;
                                        } else {
                                            sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                            intent = sarthiProcessWithMobile.getIntent();
                                            cm.l.e(intent, "getIntent(...)");
                                            str = sarthiProcessWithMobile2.f8171b0;
                                            str2 = sarthiProcessWithMobile2.f8170a0;
                                        }
                                    } else if (!p.o(sarthiProcessWithMobile2.f8172c0, "same", true)) {
                                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                        intent = sarthiProcessWithMobile.getIntent();
                                        cm.l.e(intent, "getIntent(...)");
                                        str = sarthiProcessWithMobile2.f8171b0;
                                        str2 = sarthiProcessWithMobile2.f8170a0;
                                    } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, DLReplecementActivity.class));
                                        intent = sarthiProcessWithMobile.getIntent();
                                        cm.l.e(intent, "getIntent(...)");
                                        str = sarthiProcessWithMobile2.f8171b0;
                                        str2 = sarthiProcessWithMobile2.f8170a0;
                                    } else {
                                        sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                        intent = sarthiProcessWithMobile.getIntent();
                                        cm.l.e(intent, "getIntent(...)");
                                        str = sarthiProcessWithMobile2.f8171b0;
                                        str2 = sarthiProcessWithMobile2.f8170a0;
                                    }
                                } else if (!p.o(sarthiProcessWithMobile2.f8172c0, "same", true)) {
                                    sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile2.f8171b0;
                                    str2 = sarthiProcessWithMobile2.f8170a0;
                                } else if (!p.o(sarthiProcessWithMobile2.X, "S", true) || !p.o(sarthiProcessWithMobile2.f8178i0, "Y", true)) {
                                    sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, DLDuplicateActivity.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile2.f8171b0;
                                    str2 = sarthiProcessWithMobile2.f8170a0;
                                } else {
                                    sarthiProcessWithMobile2.setIntent(new Intent(sarthiProcessWithMobile2, cls2));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile2.f8171b0;
                                    str2 = sarthiProcessWithMobile2.f8170a0;
                                }
                            }
                        }
                        sarthiProcessWithMobile2.D2(intent, str, str2, str7);
                    }
                }
                sarthiProcessWithMobile.finish();
            }
        } catch (Exception unused) {
            sarthiProcessWithMobile.d2();
            String b10 = sarthiProcessWithMobile.k2().b("label_went_wrong", sarthiProcessWithMobile2.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            sarthiProcessWithMobile2.b3(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void J2(SarthiProcessWithMobile sarthiProcessWithMobile, String str) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.d2();
        String b10 = sarthiProcessWithMobile.k2().b("label_went_wrong", sarthiProcessWithMobile.getString(R.string.something_please_try_after_some_time));
        cm.l.c(b10);
        sarthiProcessWithMobile.b3(b10);
    }

    /* access modifiers changed from: private */
    public static final void K2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(sarthiProcessWithMobile)) {
            SarathiMobileUpdateActivity sarathiMobileUpdateActivity = new SarathiMobileUpdateActivity();
            sarthiProcessWithMobile.i2().getBioObj().setBioDob(sarthiProcessWithMobile.c2(sarthiProcessWithMobile.i2().getBioObj().getBioDob()));
            sarathiMobileUpdateActivity.N1(sarthiProcessWithMobile, sarthiProcessWithMobile.i2());
            return;
        }
        Toast.makeText(sarthiProcessWithMobile.getApplicationContext(), sarthiProcessWithMobile.k2().b("label_log_check_internet", sarthiProcessWithMobile.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void L2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        if (cm.l.a(sarthiProcessWithMobile.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Dialog dialog = new Dialog(sarthiProcessWithMobile);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                cm.l.c(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View findViewById = dialog.findViewById(R.id.service_label_cross);
                cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(R.id.service_label_list);
                cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById5 = dialog.findViewById(R.id.dl_services);
                cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                textView.setText(sarthiProcessWithMobile.k2().b("btn_ok", "OK"));
                ((TextView) findViewById5).setText(sarthiProcessWithMobile.k2().b("title_dl_services", "Driving Licence Services"));
                ((ImageView) findViewById).setOnClickListener(new i2(dialog));
                ((TextView) findViewById4).setText(R.string.multi_string_serial);
                ((TextView) findViewById3).setText(sarthiProcessWithMobile.k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + sarthiProcessWithMobile.k2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + sarthiProcessWithMobile.k2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + sarthiProcessWithMobile.k2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + sarthiProcessWithMobile.k2().b("change_name_dl", "Change of Name in DL") + 10 + sarthiProcessWithMobile.k2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + sarthiProcessWithMobile.k2().b("label_international_driv_permit", "International Driving Permit"));
                textView.setOnClickListener(new j2(dialog));
                Window window2 = dialog.getWindow();
                cm.l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void L3(EditText editText, ImageView imageView, View view) {
        TransformationMethod instance;
        cm.l.f(editText, "$enterOtp");
        cm.l.f(imageView, "$shownPin");
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
    public static final void M2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M3(SarthiProcessWithMobile sarthiProcessWithMobile, TextView textView, u uVar, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        cm.l.f(textView, "$time_text");
        cm.l.f(uVar, "$resendOtp");
        sarthiProcessWithMobile.z3(new ProgressDialog(sarthiProcessWithMobile));
        sarthiProcessWithMobile.t2().setMessage(sarthiProcessWithMobile.k2().b("label_challan_please_wait", sarthiProcessWithMobile.getString(R.string.please_wait)));
        sarthiProcessWithMobile.t2().setCancelable(false);
        sarthiProcessWithMobile.t2().setCanceledOnTouchOutside(false);
        sarthiProcessWithMobile.j2().D(sarthiProcessWithMobile, String.valueOf(sarthiProcessWithMobile.O));
        new n(textView, sarthiProcessWithMobile, uVar).start();
    }

    /* access modifiers changed from: private */
    public static final void N2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N3(SarthiProcessWithMobile sarthiProcessWithMobile, EditText editText, View view) {
        Toast makeText;
        ld.c k22;
        String string;
        String str;
        cm.l.f(sarthiProcessWithMobile, "this$0");
        cm.l.f(editText, "$enterOtp");
        if (com.nic.mparivahan.a.f9624a.a(sarthiProcessWithMobile)) {
            Editable text = editText.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                k22 = sarthiProcessWithMobile.k2();
                string = sarthiProcessWithMobile.getString(R.string.pls_enter_otp);
                str = "label_log_entr_otp";
            } else {
                Editable text2 = editText.getText();
                cm.l.c(text2);
                if (text2.length() < 6) {
                    k22 = sarthiProcessWithMobile.k2();
                    string = sarthiProcessWithMobile.getString(R.string.pls_enter_valid_otp);
                    str = "label_log_entr_val_otp";
                } else {
                    sarthiProcessWithMobile.B2().setAlpha(0.5f);
                    sarthiProcessWithMobile.C2().setAlpha(0.5f);
                    sarthiProcessWithMobile.B2().setClickable(false);
                    sarthiProcessWithMobile.C2().setClickable(false);
                    sarthiProcessWithMobile.v2().setVisibility(0);
                    ba.b j22 = sarthiProcessWithMobile.j2();
                    String obj = editText.getText().toString();
                    String str2 = sarthiProcessWithMobile.O;
                    cm.l.c(str2);
                    j22.G(sarthiProcessWithMobile, obj, str2);
                    return;
                }
            }
            makeText = Toast.makeText(sarthiProcessWithMobile, k22.b(str, string), 0);
        } else {
            makeText = Toast.makeText(sarthiProcessWithMobile.getApplicationContext(), sarthiProcessWithMobile.k2().b("label_log_check_internet", sarthiProcessWithMobile.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void O2(SarthiProcessWithMobile sarthiProcessWithMobile, ServiceCheckPojo serviceCheckPojo) {
        Intent intent;
        String str;
        String str2;
        String str3;
        ArrayList s22;
        Intent intent2;
        String str4;
        String str5;
        String str6;
        ArrayList s23;
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.w2().c(false);
        try {
            if (cm.l.a(serviceCheckPojo.getStatus_code(), "00")) {
                ArrayList s24 = sarthiProcessWithMobile.s2();
                if (s24 != null) {
                    if (!s24.isEmpty()) {
                        if (sarthiProcessWithMobile.s2().size() != 0) {
                            if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, DLDuplicateActivity.class));
                                intent = sarthiProcessWithMobile.getIntent();
                                cm.l.e(intent, "getIntent(...)");
                                str = sarthiProcessWithMobile.f8171b0;
                                str2 = sarthiProcessWithMobile.f8170a0;
                                str3 = "513";
                                s22 = sarthiProcessWithMobile.s2();
                            } else {
                                Class<RenewalOfDLActivity> cls = RenewalOfDLActivity.class;
                                if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, cls));
                                    intent2 = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent2, "getIntent(...)");
                                    str4 = sarthiProcessWithMobile.f8171b0;
                                    str5 = sarthiProcessWithMobile.f8170a0;
                                    str6 = "514";
                                    s23 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, cls));
                                    intent2 = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent2, "getIntent(...)");
                                    str4 = sarthiProcessWithMobile.f8171b0;
                                    str5 = sarthiProcessWithMobile.f8170a0;
                                    str6 = "537";
                                    s23 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                    if (cm.l.a(sarthiProcessWithMobile.f8190u0, "0")) {
                                        ArrayList l22 = sarthiProcessWithMobile.l2();
                                        y.a(l22).remove(sarthiProcessWithMobile.k2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                                    }
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, ChangeOfAddressActivity.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile.f8171b0;
                                    str2 = sarthiProcessWithMobile.f8170a0;
                                    str3 = "515";
                                    s22 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, DLReplecementActivity.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile.f8171b0;
                                    str2 = sarthiProcessWithMobile.f8170a0;
                                    str3 = "516";
                                    s22 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, HillReligion.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile.f8171b0;
                                    str2 = sarthiProcessWithMobile.f8170a0;
                                    str3 = "524";
                                    s22 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("change_name_dl", "Change of Name in DL"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, ChangeOfName.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile.f8171b0;
                                    str2 = sarthiProcessWithMobile.f8170a0;
                                    str3 = "526";
                                    s22 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, DobChangeActivity.class));
                                    intent = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithMobile.f8171b0;
                                    str2 = sarthiProcessWithMobile.f8170a0;
                                    str3 = "548";
                                    s22 = sarthiProcessWithMobile.s2();
                                } else if (cm.l.a(sarthiProcessWithMobile.s2().get(0), sarthiProcessWithMobile.k2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                    sarthiProcessWithMobile.setIntent(new Intent(sarthiProcessWithMobile, DLExtractActivity.class));
                                    Intent intent3 = sarthiProcessWithMobile.getIntent();
                                    cm.l.e(intent3, "getIntent(...)");
                                    sarthiProcessWithMobile.E2(intent3, sarthiProcessWithMobile.f8171b0, sarthiProcessWithMobile.f8170a0, "523", sarthiProcessWithMobile.s2(), 1);
                                    return;
                                } else {
                                    return;
                                }
                                sarthiProcessWithMobile.E2(intent2, str4, str5, str6, s23, 1);
                                sarthiProcessWithMobile.finish();
                                return;
                            }
                            sarthiProcessWithMobile.E2(intent, str, str2, str3, s22, 1);
                            sarthiProcessWithMobile.finish();
                            return;
                        }
                    }
                }
                Toast.makeText(sarthiProcessWithMobile, "Please select at least one service", 1).show();
                return;
            }
            sarthiProcessWithMobile.b3(serviceCheckPojo.getResult());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void O3(EditText editText, View view) {
        cm.l.f(editText, "$enterOtp");
        editText.setText("");
    }

    /* access modifiers changed from: private */
    public static final void P2(SarthiProcessWithMobile sarthiProcessWithMobile, String str) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        Toast.makeText(sarthiProcessWithMobile, "hello", 0).show();
        sarthiProcessWithMobile.w2().c(false);
        sarthiProcessWithMobile.b3(sarthiProcessWithMobile.k2().b("service_is_not_present", sarthiProcessWithMobile.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void P3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Q2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void R2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        Dialog dialog = new Dialog(sarthiProcessWithMobile);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View findViewById = dialog.findViewById(R.id.cancelIv);
        cm.l.e(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.termConditionWv);
        cm.l.e(findViewById2, "findViewById(...)");
        ((ImageView) findViewById).setOnClickListener(new l2(dialog));
        ((WebView) findViewById2).loadUrl(hc.a.f12073a.g() + sarthiProcessWithMobile.k2().d() + "/mparivahan-info-terms-of-use.html");
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S2(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T2(SarthiProcessWithMobile sarthiProcessWithMobile, String str) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.u2().setVisibility(8);
        sarthiProcessWithMobile.f2().f28884t.setAlpha(1.0f);
        sarthiProcessWithMobile.f2().f28872h.setAlpha(1.0f);
        sarthiProcessWithMobile.f2().f28872h.setClickable(true);
        sarthiProcessWithMobile.f2().f28884t.setClickable(true);
        String b10 = sarthiProcessWithMobile.k2().b("label_went_wrong", sarthiProcessWithMobile.getString(R.string.something_please_try_after_some_time));
        cm.l.c(b10);
        sarthiProcessWithMobile.b3(b10);
    }

    /* access modifiers changed from: private */
    public static final void U2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.v2().setVisibility(0);
        sarthiProcessWithMobile.j2().D(sarthiProcessWithMobile, String.valueOf(sarthiProcessWithMobile.O));
        new g(sarthiProcessWithMobile).start();
    }

    /* access modifiers changed from: private */
    public static final void V2(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.f2().f28873i.setChecked(false);
    }

    /* access modifiers changed from: private */
    public static final void W2(SarthiProcessWithMobile sarthiProcessWithMobile, OtpVerifyResult otpVerifyResult) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        Log.e("sub", otpVerifyResult.toString());
        try {
            if (p.o(otpVerifyResult.getStatusCode(), "AL001", true)) {
                ba.b j22 = sarthiProcessWithMobile.j2();
                String str = sarthiProcessWithMobile.M;
                cm.l.c(str);
                j22.x(sarthiProcessWithMobile, str, sarthiProcessWithMobile.i2().getBioObj().getBioDob());
                return;
            }
            sarthiProcessWithMobile.d2();
            sarthiProcessWithMobile.b3(otpVerifyResult.getStatusDesc());
        } catch (Exception unused) {
            sarthiProcessWithMobile.d2();
            String b10 = sarthiProcessWithMobile.k2().b("label_went_wrong", sarthiProcessWithMobile.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            sarthiProcessWithMobile.b3(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void X2(SarthiProcessWithMobile sarthiProcessWithMobile, ResendOtp resendOtp) {
        String b10;
        String statusDesc;
        int i10;
        String b11;
        String str;
        bm.l lVar;
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.d2();
        try {
            if (p.o(resendOtp.getStatusCode(), "AL001", true)) {
                b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = sarthiProcessWithMobile.k2().b("otp_resent", sarthiProcessWithMobile.getString(R.string.otp_resent));
                cm.l.c(statusDesc);
                i10 = 1;
                b11 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = h.f8203e;
            } else if (p.o(resendOtp.getStatusCode(), "AL002", true)) {
                b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = resendOtp.getStatusDesc();
                i10 = 1;
                b11 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = i.f8204e;
            } else {
                b10 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
                cm.l.c(b10);
                statusDesc = resendOtp.getStatusDesc();
                i10 = 1;
                b11 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
                cm.l.c(b11);
                str = null;
                lVar = j.f8205e;
            }
            oi.g.n1(sarthiProcessWithMobile, b10, statusDesc, i10, b11, str, lVar, 16, (Object) null);
        } catch (Exception unused) {
            sarthiProcessWithMobile.d2();
            String b12 = sarthiProcessWithMobile.k2().b("nex_parivahan", sarthiProcessWithMobile.getString(R.string.app_name));
            cm.l.c(b12);
            String b13 = sarthiProcessWithMobile.k2().b("label_log_unbl_veri_otp", sarthiProcessWithMobile.getString(R.string.unable_verifiy_otp));
            cm.l.c(b13);
            String b14 = sarthiProcessWithMobile.k2().b("btn_ok", sarthiProcessWithMobile.getString(R.string.ok_txt));
            cm.l.c(b14);
            oi.g.n1(sarthiProcessWithMobile, b12, b13, 1, b14, (String) null, k.f8206e, 16, (Object) null);
        }
    }

    private final void Y2() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_multi);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.service_label_cross);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.service_label_list);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById5 = dialog.findViewById(R.id.dl_services);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(k2().b("btn_ok", "OK"));
        ((TextView) findViewById5).setText(k2().b("title_dl_services", "Driving Licence Services"));
        ((ImageView) findViewById).setOnClickListener(new y2(dialog));
        ((TextView) findViewById3).setText(k2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + k2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + k2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + k2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + k2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + k2().b("change_name_dl", "Change of Name in DL") + 10 + k2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + k2().b("label_international_driv_permit", "International Driving Permit"));
        ((TextView) findViewById4).setText(R.string.multi_string_serial);
        textView.setOnClickListener(new z2(dialog));
        Window window2 = dialog.getWindow();
        cm.l.c(window2);
        window2.setGravity(48);
        window2.setLayout(-2, -2);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Z2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void b3(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(k2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(k2().b("btn_ok", "OK"));
        textView.setOnClickListener(new k2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void c3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void d2() {
        B2().setAlpha(1.0f);
        C2().setAlpha(1.0f);
        v2().setVisibility(4);
        B2().setClickable(true);
        C2().setClickable(true);
    }

    private final void d3() {
        Dialog dialog = new Dialog(this, 16973834);
        dialog.setContentView(R.layout.service_selection);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(-1));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.service_selection);
        cm.l.d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        cm.l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        C3((CustomWegetLayout) findViewById2);
        w2().setText(k2().b("button_proceed", getString(R.string.proceed)));
        View findViewById3 = dialog.findViewById(R.id.dl_number_new);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.cancelIv);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById5 = dialog.findViewById(R.id.pop_up_reset);
        cm.l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) findViewById5;
        customWegetLayout.setText(k2().b("button_cancel", getString(R.string.cancel)));
        customWegetLayout.setOnClickListener(new n2(dialog));
        View findViewById6 = dialog.findViewById(R.id.select_Service_apply);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(k2().b("select_service_to_apply", "Select the service to apply"));
        View findViewById7 = dialog.findViewById(R.id.service_label);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.service_label_dl);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById8;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setText(q.B0(String.valueOf(this.M)).toString());
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new o2(this));
        textView2.setOnClickListener(new p2(this));
        ((ImageView) findViewById4).setOnClickListener(new q2(dialog, this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k2().b("dl_no", "DL No. : "));
        sb2.append(' ');
        String str = this.M;
        cm.l.c(str);
        sb2.append(q.B0(str).toString());
        ((TextView) findViewById3).setText(sb2.toString());
        w2().setOnClickListener(new r2(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter((RecyclerView.h) null);
        u.u(q2());
        recyclerView.setAdapter(new a(this, q2()));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void e3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void f3(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.Y2();
    }

    /* access modifiers changed from: private */
    public static final void g3(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        try {
            Intent intent = new Intent(sarthiProcessWithMobile, DlServiceDetailsActivity.class);
            intent.putExtra("DL", sarthiProcessWithMobile.M);
            intent.putExtra("dob", sarthiProcessWithMobile.N);
            intent.putExtra("DLDetails", sarthiProcessWithMobile.i2());
            intent.putExtra("Mobile_no", sarthiProcessWithMobile.z2().l());
            intent.putExtra("lastEndorsedRTO", sarthiProcessWithMobile.f8171b0);
            intent.putExtra("lastEndorsedState", sarthiProcessWithMobile.f8170a0);
            intent.putExtra("lastEndorsedRTOCode", sarthiProcessWithMobile.f8171b0);
            intent.putExtra("lastEndorseStateCode", sarthiProcessWithMobile.Z);
            intent.putExtra("whatServiceRequired", sarthiProcessWithMobile.V);
            intent.putExtra("multiList", sarthiProcessWithMobile.s2());
            sarthiProcessWithMobile.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void h3(Dialog dialog, SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(sarthiProcessWithMobile, "this$0");
        dialog.dismiss();
        sarthiProcessWithMobile.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(SarthiProcessWithMobile sarthiProcessWithMobile, View view) {
        cm.l.f(sarthiProcessWithMobile, "this$0");
        sarthiProcessWithMobile.w2().c(true);
        sarthiProcessWithMobile.n2().m(sarthiProcessWithMobile.r2(), sarthiProcessWithMobile.y2().l());
    }

    public final String A2() {
        return this.f8172c0;
    }

    public final void A3(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.f8174e0 = progressBar;
    }

    public final TextView B2() {
        TextView textView = this.f8177h0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("submitOtp");
        return null;
    }

    public final void B3(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.f8175f0 = progressBar;
    }

    public final TextView C2() {
        TextView textView = this.f8176g0;
        if (textView != null) {
            return textView;
        }
        cm.l.v("txt_reset");
        return null;
    }

    public final void C3(CustomWegetLayout customWegetLayout) {
        cm.l.f(customWegetLayout, "<set-?>");
        this.f8188s0 = customWegetLayout;
    }

    public final void D3(String str) {
        this.O = str;
    }

    public final void E3(Button button) {
        cm.l.f(button, "<set-?>");
        this.Q = button;
    }

    public final void F3(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.L = dlServiceInt;
    }

    public final void G3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.W = fVar;
    }

    public final void H3(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.U = gVar;
    }

    public final void I3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8177h0 = textView;
    }

    public final void J3(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.f8176g0 = textView;
    }

    public final void K3(Context context, String str) {
        String b10;
        cm.l.f(context, "context");
        cm.l.f(str, "mobile_no");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pr_pwm);
        cm.l.e(findViewById, "findViewById(...)");
        B3((ProgressBar) findViewById);
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById2;
        u uVar = new u();
        View findViewById3 = dialog.findViewById(R.id.resendOtp);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        uVar.f20234e = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.showmpin);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.submitOtp);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        I3((TextView) findViewById5);
        View findViewById6 = dialog.findViewById(R.id.enterOtp);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.time_text);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.txt_reset);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        J3((TextView) findViewById8);
        View findViewById9 = dialog.findViewById(R.id.disPlay_mobile);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById9;
        View findViewById10 = dialog.findViewById(R.id.disPlay);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById11 = dialog.findViewById(R.id.enter_otp_txt);
        cm.l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById10).setText(k2().b("otp_verification", getString(R.string.otp_verification)));
        B2().setText(k2().b("vahan_btn_submit", getString(R.string.submit)));
        C2().setText(k2().b("btn_reset", getString(R.string.reset)));
        ((TextView) uVar.f20234e).setText(k2().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(k2().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) findViewById11).setText(k2().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (str.length() == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb2.append("\n+91 - XXXXXX");
                String substring = str.substring(6, 10);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                b10 = sb2.toString();
            } else {
                b10 = k2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent));
            }
            textView2.setText(b10);
        } catch (Exception unused) {
            textView2.setText(k2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new m(textView, this, uVar).start();
        imageView2.setOnClickListener(new s2(editText, imageView2));
        ((TextView) uVar.f20234e).setOnClickListener(new t2(this, textView, uVar));
        B2().setOnClickListener(new u2(this, editText));
        C2().setOnClickListener(new v2(editText));
        imageView.setOnClickListener(new w2(dialog));
        dialog.show();
    }

    public final String c2(String str) {
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            String format = simpleDateFormat2.format(parse);
            cm.l.e(format, "format(...)");
            return format;
        } catch (Exception unused) {
            return str;
        }
    }

    public final String e2() {
        return this.f8178i0;
    }

    public final uc f2() {
        uc ucVar = this.J;
        if (ucVar != null) {
            return ucVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final String g2() {
        return this.X;
    }

    public final boolean h2() {
        return this.f8184o0;
    }

    public final DldetobjX i2() {
        DldetobjX dldetobjX = this.R;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ba.b j2() {
        ba.b bVar = this.K;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final void j3(uc ucVar) {
        cm.l.f(ucVar, "<set-?>");
        this.J = ucVar;
    }

    public final ld.c k2() {
        ld.c cVar = this.f8179j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void k3(boolean z10) {
        this.f8184o0 = z10;
    }

    public final ArrayList l2() {
        ArrayList arrayList = this.f8191v0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final void l3(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.R = dldetobjX;
    }

    public final Context m2() {
        Context context = this.f8187r0;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void m3(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.K = bVar;
    }

    public final w9.c n2() {
        w9.c cVar = this.f8185p0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFormEligVM");
        return null;
    }

    public final void n3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8190u0 = str;
    }

    public final FromEligCheck o2() {
        FromEligCheck fromEligCheck = this.f8186q0;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final void o3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8179j0 = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        uc c10 = uc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        j3(c10);
        setContentView((View) f2().b());
        v9.e.f17509a.s0(this, f2());
        r3(this);
        F3(DlServiceInt.f21675a.a(this));
        G3(new ld.f(this));
        H3(new ld.g(this));
        o3(new ld.c(this));
        y3(new ArrayList());
        p3(new ArrayList());
        x3(new ArrayList());
        t3(FromEligCheck.f8099a.b(this));
        s3((w9.c) new u0((x0) this, (u0.b) new w9.b(new w9.a(o2()))).a(w9.c.class));
        y2().o("NA", "N", "NA", "NA");
        if (getIntent() != null) {
            this.X = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
            this.Y = String.valueOf(getIntent().getStringExtra("lastEndorsedRTOCode"));
            this.Z = String.valueOf(getIntent().getStringExtra("lastEndorseStateCode"));
            this.f8170a0 = String.valueOf(getIntent().getStringExtra("lastEndorsedState"));
            this.f8171b0 = String.valueOf(getIntent().getStringExtra("lastEndorsedRTO"));
            this.f8172c0 = String.valueOf(getIntent().getStringExtra("state_value"));
            this.N = String.valueOf(getIntent().getStringExtra("dob"));
            this.M = String.valueOf(getIntent().getStringExtra("DL"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            l3((DldetobjX) serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
            cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
            this.V = (HashMap) serializableExtra2;
            Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
            cm.l.d(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            w3((ArrayList) serializableExtra3);
            this.f8189t0 = String.valueOf(getIntent().getStringExtra("multiCheck"));
        }
        View findViewById = findViewById(R.id.mob_number);
        cm.l.e(findViewById, "findViewById(...)");
        v3((EditText) findViewById);
        View findViewById2 = findViewById(R.id.reset_button);
        cm.l.e(findViewById2, "findViewById(...)");
        E3((Button) findViewById2);
        View findViewById3 = findViewById(R.id.pb_pwm);
        cm.l.e(findViewById3, "findViewById(...)");
        A3((ProgressBar) findViewById3);
        View findViewById4 = findViewById(R.id.ll_home);
        cm.l.e(findViewById4, "findViewById(...)");
        q3((LinearLayout) findViewById4);
        f2().f28866b.setPaintFlags(f2().f28866b.getPaintFlags() | 8);
        try {
            AppCompatEditText appCompatEditText = f2().f28878n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("XXXXXX");
            String substring = i2().getBioObj().getBioMobileNo().substring(6, 10);
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            appCompatEditText.setText(sb2.toString());
            this.f8173d0 = i2().getBioObj().getBioMobileNo();
            f2().f28872h.setAlpha(1.0f);
        } catch (Exception unused) {
            f2().f28878n.setText((CharSequence) null);
        }
        m3((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(x2(), this))).a(ba.b.class));
        try {
            f2().f28870f.setText(this.M);
            TextView textView = f2().f28869e;
            textView.setText(k2().b("dl_no", "DL No.") + this.M);
        } catch (Exception unused2) {
        }
        j2().j(this, this.Z);
        j2().C().g(this, new b2(this));
        f2().f28872h.setOnClickListener(new e3(this));
        f2().f28866b.setOnClickListener(new f3(this));
        j2().u().g(this, new l(new f(this)));
        j2().t().g(this, new g3(this));
        f2().f28883s.setOnClickListener(new c2(this));
        f2().f28884t.setOnClickListener(new d2(this));
        j2().E().g(this, new e2(this));
        j2().w().g(this, new f2(this));
        j2().v().g(this, new g2(this));
        j2().l().g(this, new h2(this));
        j2().m().g(this, new m2(this));
        f2().f28878n.addTextChangedListener(new c(this));
        if (cm.l.a(y2().l(), "MH")) {
            f2().A.setVisibility(8);
        } else {
            f2().A.setVisibility(0);
        }
        f2().A.setOnClickListener(new x2(this));
        f2().f28879o.f29581h.setVisibility(8);
        if (cm.l.a(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView2 = f2().f28879o.f29580g;
            String b10 = k2().b("dl_services", getString(R.string.dl_services));
            cm.l.c(b10);
            textView2.setText(b10);
            f2().f28879o.f29579f.setVisibility(8);
            f2().f28879o.f29580g.setPaintFlags(f2().f28879o.f29580g.getPaintFlags() | 8);
        } else {
            f2().f28879o.f29580g.setText(y2().i());
            f2().f28879o.f29579f.setVisibility(8);
        }
        f2().f28879o.f29580g.setOnClickListener(new a3(this));
        n2().k().g(this, new b3(this));
        n2().i().g(this, new c3(this));
        f2().f28879o.f29577d.setOnClickListener(new d3(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        f2().f28878n.setFocusable(String.valueOf(f2().f28878n.getText()).length() <= 5);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        i7.d dVar = new i7.d();
        CombineReq combineReq = (CombineReq) dVar.j(defaultSharedPreferences.getString("MultiService", ""), CombineReq.class);
        CombineReq combineReq2 = new CombineReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 1023, (cm.g) null);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putString("MultiService", dVar.t(combineReq2));
        edit.commit();
        SharedPreferences.Editor edit2 = getSharedPreferences("MultiService", 0).edit();
        edit2.clear();
        edit2.apply();
    }

    public final String p2() {
        return this.f8189t0;
    }

    public final void p3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8191v0 = arrayList;
    }

    public final ArrayList q2() {
        ArrayList arrayList = this.f8180k0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiList");
        return null;
    }

    public final void q3(LinearLayout linearLayout) {
        cm.l.f(linearLayout, "<set-?>");
        this.T = linearLayout;
    }

    public final ArrayList r2() {
        ArrayList arrayList = this.f8182m0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListCode");
        return null;
    }

    public final void r3(Context context) {
        cm.l.f(context, "<set-?>");
        this.f8187r0 = context;
    }

    public final ArrayList s2() {
        ArrayList arrayList = this.f8181l0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final void s3(w9.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f8185p0 = cVar;
    }

    public final ProgressDialog t2() {
        ProgressDialog progressDialog = this.S;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void t3(FromEligCheck fromEligCheck) {
        cm.l.f(fromEligCheck, "<set-?>");
        this.f8186q0 = fromEligCheck;
    }

    public final ProgressBar u2() {
        ProgressBar progressBar = this.f8174e0;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("pb_pwm");
        return null;
    }

    public final void u3(String str) {
        cm.l.f(str, "<set-?>");
        this.f8173d0 = str;
    }

    public final ProgressBar v2() {
        ProgressBar progressBar = this.f8175f0;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("pr_pwm");
        return null;
    }

    public final void v3(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.P = editText;
    }

    public final CustomWegetLayout w2() {
        CustomWegetLayout customWegetLayout = this.f8188s0;
        if (customWegetLayout != null) {
            return customWegetLayout;
        }
        cm.l.v("Proceed");
        return null;
    }

    public final void w3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8180k0 = arrayList;
    }

    public final DlServiceInt x2() {
        DlServiceInt dlServiceInt = this.L;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final void x3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8182m0 = arrayList;
    }

    public final ld.f y2() {
        ld.f fVar = this.W;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void y3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f8181l0 = arrayList;
    }

    public final ld.g z2() {
        ld.g gVar = this.U;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final void z3(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.S = progressDialog;
    }
}
