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
import android.text.Html;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.m;
import cm.y;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import ni.tc;
import pl.x;

public final class SarthiProcessWithAdhar extends oi.g {
    private String A0 = "valid";
    private String B0 = "";
    public ArrayList C0;
    public ArrayList D0;
    public Aadarkyc.DOEkyc E0;
    public tc J;
    public ld.f K;
    public ld.g L;
    public ld.c M;
    private String N = "";
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T;
    private String U;
    private String V;
    private String W = "NA";
    private String X = "NA";
    public DldetobjX Y;
    private HashMap Z = new HashMap();

    /* renamed from: a0  reason: collision with root package name */
    public Context f8129a0;

    /* renamed from: b0  reason: collision with root package name */
    public ProgressDialog f8130b0;

    /* renamed from: c0  reason: collision with root package name */
    public ca.c f8131c0;

    /* renamed from: d0  reason: collision with root package name */
    public EkYCService f8132d0;

    /* renamed from: e0  reason: collision with root package name */
    public da.c f8133e0;

    /* renamed from: f0  reason: collision with root package name */
    public ea.a f8134f0;

    /* renamed from: g0  reason: collision with root package name */
    public AadharInterface f8135g0;

    /* renamed from: h0  reason: collision with root package name */
    public AdrInterface f8136h0;

    /* renamed from: i0  reason: collision with root package name */
    private String f8137i0 = "allowAddrChange";

    /* renamed from: j0  reason: collision with root package name */
    public ba.b f8138j0;

    /* renamed from: k0  reason: collision with root package name */
    public DlServiceInt f8139k0;

    /* renamed from: l0  reason: collision with root package name */
    private String f8140l0 = "A";

    /* renamed from: m0  reason: collision with root package name */
    private String f8141m0 = "NA";

    /* renamed from: n0  reason: collision with root package name */
    private String f8142n0 = "NA";

    /* renamed from: o0  reason: collision with root package name */
    private String f8143o0 = "NA";

    /* renamed from: p0  reason: collision with root package name */
    private int f8144p0;

    /* renamed from: q0  reason: collision with root package name */
    public VahanProService f8145q0;

    /* renamed from: r0  reason: collision with root package name */
    public bi.h f8146r0;

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList f8147s0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f8148t0;

    /* renamed from: u0  reason: collision with root package name */
    public ArrayList f8149u0;

    /* renamed from: v0  reason: collision with root package name */
    private String f8150v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private boolean f8151w0;

    /* renamed from: x0  reason: collision with root package name */
    public w9.c f8152x0;

    /* renamed from: y0  reason: collision with root package name */
    public FromEligCheck f8153y0;

    /* renamed from: z0  reason: collision with root package name */
    public CustomWegetLayout f8154z0;

    public final class a extends RecyclerView.h {

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f8155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8156e;

        /* renamed from: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar$a$a  reason: collision with other inner class name */
        public final class C0113a extends RecyclerView.d0 {
            private final ImageView A;
            private final LinearLayout B;
            final /* synthetic */ a C;

            /* renamed from: y  reason: collision with root package name */
            private final CheckBox f8157y;

            /* renamed from: z  reason: collision with root package name */
            private final TextView f8158z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0113a(a aVar, View view) {
                super(view);
                l.f(view, "ItemView");
                this.C = aVar;
                View findViewById = this.f3622e.findViewById(R.id.service_check_box);
                l.e(findViewById, "findViewById(...)");
                this.f8157y = (CheckBox) findViewById;
                View findViewById2 = this.f3622e.findViewById(R.id.service_txt);
                l.e(findViewById2, "findViewById(...)");
                this.f8158z = (TextView) findViewById2;
                View findViewById3 = this.f3622e.findViewById(R.id.rightStatePin);
                l.e(findViewById3, "findViewById(...)");
                this.A = (ImageView) findViewById3;
                View findViewById4 = this.f3622e.findViewById(R.id.multi_layout);
                l.e(findViewById4, "findViewById(...)");
                this.B = (LinearLayout) findViewById4;
            }

            public final LinearLayout O() {
                return this.B;
            }

            public final ImageView P() {
                return this.A;
            }

            public final TextView Q() {
                return this.f8158z;
            }
        }

        public a(SarthiProcessWithAdhar sarthiProcessWithAdhar, ArrayList arrayList) {
            l.f(arrayList, "mList");
            this.f8156e = sarthiProcessWithAdhar;
            this.f8155d = arrayList;
        }

        /* access modifiers changed from: private */
        public static final void C(SarthiProcessWithAdhar sarthiProcessWithAdhar, C0113a aVar, a aVar2, String str, View view) {
            C0113a aVar3;
            ArrayList I2;
            String str2;
            ArrayList I22;
            String str3;
            StringBuilder sb2;
            SarthiProcessWithAdhar sarthiProcessWithAdhar2 = sarthiProcessWithAdhar;
            C0113a aVar4 = aVar;
            a aVar5 = aVar2;
            String str4 = str;
            l.f(sarthiProcessWithAdhar2, "this$0");
            l.f(aVar4, "$holder");
            l.f(aVar5, "this$1");
            l.f(str4, "$mModel");
            Log.d("values", sarthiProcessWithAdhar.i2() + '-' + sarthiProcessWithAdhar.g2());
            if (l.a(sarthiProcessWithAdhar.G2(), aVar.Q().getText())) {
                sb2 = new StringBuilder();
            } else if (!l.a(sarthiProcessWithAdhar.S2(), "differ") || !l.a(aVar.Q().getText(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                if (!sarthiProcessWithAdhar.x2().contains(aVar.Q().getText().toString())) {
                    sarthiProcessWithAdhar.x2().add(aVar.Q().getText().toString());
                } else if (!l.a(sarthiProcessWithAdhar.i2(), "S") || !l.a(sarthiProcessWithAdhar.g2(), "Y") || !l.a(aVar.Q().getText(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    sarthiProcessWithAdhar.x2().remove(aVar.Q().getText().toString());
                } else {
                    sarthiProcessWithAdhar2.I3(aVar.Q().getCurrentTextColor() == -1 ? "0" : "1");
                }
                Object obj = "Y";
                Object obj2 = "S";
                Object obj3 = "515";
                if (!sarthiProcessWithAdhar.J2().contains(aVar.Q().getText().toString())) {
                    aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                    aVar.Q().setTextColor(-1);
                    aVar.P().setImageDrawable((Drawable) null);
                    aVar5.E(str4, aVar4);
                    sarthiProcessWithAdhar.J2().add(aVar.Q().getText().toString());
                    if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        sarthiProcessWithAdhar.I2().add("513");
                        return;
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        sarthiProcessWithAdhar.I2().add("514");
                        return;
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        sarthiProcessWithAdhar.I2().add("537");
                        return;
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        sarthiProcessWithAdhar.I2().add(obj3);
                        return;
                    } else {
                        if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                            I22 = sarthiProcessWithAdhar.I2();
                            str3 = "516";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            I22 = sarthiProcessWithAdhar.I2();
                            str3 = "523";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                            I22 = sarthiProcessWithAdhar.I2();
                            str3 = "524";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("change_name_dl", "Change of Name in DL"))) {
                            I22 = sarthiProcessWithAdhar.I2();
                            str3 = "526";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            I22 = sarthiProcessWithAdhar.I2();
                            str3 = "548";
                        } else {
                            return;
                        }
                        I22.add(str3);
                        return;
                    }
                } else {
                    Object obj4 = obj3;
                    if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        sarthiProcessWithAdhar.I2().remove("513");
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        sarthiProcessWithAdhar.I2().remove("514");
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        sarthiProcessWithAdhar.I2().remove("537");
                    } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        sarthiProcessWithAdhar.I2().remove(obj4);
                    } else {
                        if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                            I2 = sarthiProcessWithAdhar.I2();
                            str2 = "516";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            I2 = sarthiProcessWithAdhar.I2();
                            str2 = "523";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                            I2 = sarthiProcessWithAdhar.I2();
                            str2 = "524";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("change_name_dl", "Change of Name in DL"))) {
                            I2 = sarthiProcessWithAdhar.I2();
                            str2 = "526";
                        } else if (l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            I2 = sarthiProcessWithAdhar.I2();
                            str2 = "548";
                        }
                        I2.remove(str2);
                    }
                    if (!l.a(sarthiProcessWithAdhar.i2(), obj2) || !l.a(sarthiProcessWithAdhar.g2(), obj) || !y.R(sarthiProcessWithAdhar.J2(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL")) || !l.a(aVar.Q().getText().toString(), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        aVar3 = aVar;
                        sarthiProcessWithAdhar.J2().remove(aVar.Q().getText().toString());
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
                sarthiProcessWithAdhar2.B3(true);
                sb2 = new StringBuilder();
            }
            sb2.append("You can not deselect the ");
            sb2.append(aVar.Q().getText());
            sb2.append(" Service");
            Toast.makeText(sarthiProcessWithAdhar2, sb2.toString(), 1).show();
        }

        private final void E(String str, C0113a aVar) {
            ImageView P;
            Resources resources;
            int i10;
            Drawable drawable;
            if (l.a(str, this.f8156e.s2().b("check_dl_serv_change_addr", "Issue of Duplicate DL"))) {
                P = aVar.P();
                resources = this.f8156e.C2().getResources();
                i10 = R.drawable.icdlmulti;
            } else if (l.a(str, this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                P = aVar.P();
                resources = this.f8156e.C2().getResources();
                i10 = R.drawable.renmulti;
            } else {
                if (!l.a(str, this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    if (l.a(str, this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        P = aVar.P();
                        resources = this.f8156e.C2().getResources();
                        i10 = R.drawable.coamulti;
                    } else if (l.a(str, this.f8156e.s2().b("check_dl_serv_replacement_dl", "Replacement of DL")) || l.a(str, this.f8156e.s2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        P = aVar.P();
                        drawable = this.f8156e.C2().getResources().getDrawable(R.drawable.icrepmulti);
                        P.setImageDrawable(drawable);
                    } else if (l.a(str, this.f8156e.s2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        P = aVar.P();
                        resources = this.f8156e.C2().getResources();
                        i10 = R.drawable.endormulti;
                    } else if (!l.a(str, this.f8156e.s2().b("change_name_dl", "Change of Name in DL"))) {
                        if (l.a(str, this.f8156e.s2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            P = aVar.P();
                            resources = this.f8156e.C2().getResources();
                            i10 = R.drawable.dobmulti;
                        } else {
                            return;
                        }
                    }
                }
                P = aVar.P();
                drawable = this.f8156e.C2().getResources().getDrawable(R.drawable.iclearnermulti);
                P.setImageDrawable(drawable);
            }
            drawable = resources.getDrawable(i10);
            P.setImageDrawable(drawable);
        }

        private final void F(String str, C0113a aVar) {
            ImageView P;
            Resources resources;
            int i10;
            Drawable drawable;
            if (l.a(str, this.f8156e.s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                P = aVar.P();
                resources = this.f8156e.C2().getResources();
                i10 = R.drawable.ic_newdriving;
            } else {
                boolean a10 = l.a(str, this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"));
                int i11 = R.drawable.ic_learnerr;
                if (!a10 && !l.a(str, this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    boolean a11 = l.a(str, this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                    i11 = R.drawable.mvvm_ic_addres;
                    if (!a11) {
                        if (l.a(str, this.f8156e.s2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                            P = aVar.P();
                            resources = this.f8156e.C2().getResources();
                            i10 = R.drawable.ic_exxtract;
                        } else if (!l.a(str, this.f8156e.s2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            if (l.a(str, this.f8156e.s2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                P = aVar.P();
                                resources = this.f8156e.C2().getResources();
                                i10 = R.drawable.endorsedl;
                            } else if (l.a(str, this.f8156e.s2().b("change_name_dl", "Change of Name in DL"))) {
                                P = aVar.P();
                                resources = this.f8156e.C2().getResources();
                                i10 = R.drawable.coname;
                            } else if (l.a(str, this.f8156e.s2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                P = aVar.P();
                                resources = this.f8156e.C2().getResources();
                                i10 = R.drawable.codob;
                            } else {
                                return;
                            }
                        }
                    }
                }
                P = aVar.P();
                drawable = this.f8156e.C2().getResources().getDrawable(i11);
                P.setImageDrawable(drawable);
            }
            drawable = resources.getDrawable(i10);
            P.setImageDrawable(drawable);
        }

        /* renamed from: B */
        public void p(C0113a aVar, int i10) {
            l.f(aVar, "holder");
            Object obj = this.f8155d.get(i10);
            l.e(obj, "get(...)");
            String str = (String) obj;
            F(str, aVar);
            aVar.Q().setText(str);
            if (l.a(this.f8156e.G2(), aVar.Q().getText())) {
                aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                aVar.Q().setTextColor(-1);
                aVar.P().setImageDrawable((Drawable) null);
                if (l.a(this.f8156e.G2(), this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    aVar.P().setImageDrawable(this.f8156e.C2().getResources().getDrawable(R.drawable.renmulti));
                    if (!y.R(this.f8156e.I2(), this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        this.f8156e.I2().add("514");
                    }
                    if (!y.R(this.f8156e.J2(), this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        ArrayList J2 = this.f8156e.J2();
                        String b10 = this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        l.c(b10);
                        J2.add(b10);
                        ArrayList x22 = this.f8156e.x2();
                        String b11 = this.f8156e.s2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        l.c(b11);
                        x22.add(b11);
                    }
                }
                if (l.a(this.f8156e.G2(), this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    aVar.P().setImageDrawable(this.f8156e.C2().getResources().getDrawable(R.drawable.iclearnermulti));
                    if (!y.R(this.f8156e.I2(), this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        this.f8156e.I2().add("537");
                    }
                    if (!y.R(this.f8156e.J2(), this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        ArrayList J22 = this.f8156e.J2();
                        String b12 = this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        l.c(b12);
                        J22.add(b12);
                        ArrayList x23 = this.f8156e.x2();
                        String b13 = this.f8156e.s2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        l.c(b13);
                        x23.add(b13);
                    }
                }
            }
            if (l.a(this.f8156e.S2(), "differ") && l.a(aVar.Q().getText(), this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this.f8156e.B3(true);
                this.f8156e.J2().add(str);
                this.f8156e.x2().add(str);
                aVar.O().setBackgroundResource(R.drawable.sign_in_new);
                aVar.Q().setTextColor(-1);
                aVar.P().setImageDrawable((Drawable) null);
                if (!y.R(this.f8156e.I2(), this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this.f8156e.I2().add("515");
                }
                E(str, aVar);
            }
            if (l.a(this.f8156e.i2(), "S") && l.a(this.f8156e.g2(), "Y") && l.a(aVar.Q().getText(), this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL")) && !this.f8156e.j2()) {
                ArrayList J23 = this.f8156e.J2();
                String b14 = this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL");
                l.c(b14);
                J23.add(b14);
                ArrayList x24 = this.f8156e.x2();
                String b15 = this.f8156e.s2().b("check_dl_serv_change_addr", "Change of Address in DL");
                l.c(b15);
                x24.add(b15);
                this.f8156e.I3("0");
            }
            aVar.O().setOnClickListener(new a2(this.f8156e, aVar, this, str));
        }

        /* renamed from: D */
        public C0113a r(ViewGroup viewGroup, int i10) {
            l.f(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_service, viewGroup, false);
            l.c(inflate);
            return new C0113a(this, inflate);
        }

        public int e() {
            return this.f8155d.size();
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8159e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8159e = sarthiProcessWithAdhar;
        }

        public final void b(AadarkycVerify.Response response) {
            SarthiProcessWithAdhar sarthiProcessWithAdhar;
            String b10;
            AadarkycVerify.dOEkyc dOAuthOTP;
            AadarkycVerify.dOEkyc dOAuthOTP2;
            String last_four_mobile;
            AadarkycVerify.dOEkyc dOAuthOTP3;
            AadarkycVerify.dOEkyc dOAuthOTP4;
            Log.e("adhResp_kyc", response.toString());
            this.f8159e.K2().dismiss();
            AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
            String str = null;
            if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() != 0) {
                try {
                    Log.e("CCTVlOGE", "1");
                    if (!(doAadhaarResponse == null || (dOAuthOTP = doAadhaarResponse.getDOAuthOTP()) == null || !l.a(dOAuthOTP.getMobileverify(), Boolean.TRUE))) {
                        String last_four_mobile2 = (doAadhaarResponse == null || (dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP4.getLast_four_mobile();
                        if (last_four_mobile2 != null) {
                            if (last_four_mobile2.length() != 0) {
                                if (p.o((doAadhaarResponse == null || (dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP3.getStatus(), "success", true)) {
                                    Log.e("CCTVlOGE", "2");
                                    if (doAadhaarResponse != null && (dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP()) != null && (last_four_mobile = dOAuthOTP2.getLast_four_mobile()) != null && last_four_mobile.length() == 4) {
                                        this.f8159e.f4(String.valueOf(doAadhaarResponse.getTxnNo()));
                                        String T2 = this.f8159e.T2();
                                        l.c(T2);
                                        Log.d("txnNo", T2);
                                        SarthiProcessWithAdhar sarthiProcessWithAdhar2 = this.f8159e;
                                        AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                                        if (dOAuthOTP5 != null) {
                                            str = dOAuthOTP5.getLast_four_mobile();
                                        }
                                        sarthiProcessWithAdhar2.h4(sarthiProcessWithAdhar2, String.valueOf(str));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    Log.e("CCTVlOGE", VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                    if (reason != null) {
                        if (reason.length() != 0) {
                            Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                            if (p.o(String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), "Invalid Auth Xml Format.", true)) {
                                sarthiProcessWithAdhar = this.f8159e;
                                b10 = "Invalid Aadhaar No.\nPlease try again";
                                sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, b10);
                            }
                            SarthiProcessWithAdhar sarthiProcessWithAdhar3 = this.f8159e;
                            if (doAadhaarResponse != null) {
                                str = doAadhaarResponse.getReason();
                            }
                            sarthiProcessWithAdhar3.q3(sarthiProcessWithAdhar3, String.valueOf(str));
                            return;
                        }
                    }
                    sarthiProcessWithAdhar = this.f8159e;
                    b10 = sarthiProcessWithAdhar.s2().b("service_is_not_present", this.f8159e.getString(R.string.unable_to_get_details));
                    sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, b10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AadarkycVerify.Response) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8160e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8160e = sarthiProcessWithAdhar;
        }

        public final void b(String str) {
            Log.e("adhResp_kyc_err", str.toString());
            this.f8160e.K2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8161e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8161e = sarthiProcessWithAdhar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x021a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x021f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x022c A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0231 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x023e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0243 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0250 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0255 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0262 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0267 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x0274 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0279 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0286 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x028b A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0298 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x029d A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x02aa A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x02af A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x02bc A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:159:0x02c5 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x02d2 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x02d7 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x02e4 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x02e9 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x02f6 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02fb A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0308 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x030d A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x031a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x031f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x032c A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x0331 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0089 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00f6 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x010a A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x010f A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x011e A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0123 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0132 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0137 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[Catch:{ Exception -> 0x0059 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x015d A[Catch:{ Exception -> 0x0059 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r33) {
            /*
                r32 = this;
                r1 = r32
                java.lang.String r0 = "files"
                java.lang.String r2 = r33.toString()
                java.lang.String r3 = "adhResp_kyc_req"
                android.util.Log.e(r3, r2)
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DoAadhaarResponse r2 = r33.getDoAadhaarResponse()
                r3 = 0
                if (r2 == 0) goto L_0x0019
                java.lang.String r4 = r2.getStatus()
                goto L_0x001a
            L_0x0019:
                r4 = r3
            L_0x001a:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = "status_response"
                android.util.Log.d(r5, r4)
                if (r2 == 0) goto L_0x002a
                java.lang.String r4 = r2.getStatus()
                goto L_0x002b
            L_0x002a:
                r4 = r3
            L_0x002b:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0037
                goto L_0x03cf
            L_0x0037:
                if (r2 == 0) goto L_0x003e
                java.lang.String r4 = r2.getStatus()
                goto L_0x003f
            L_0x003e:
                r4 = r3
            L_0x003f:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r5 = "Y"
                r6 = 1
                boolean r4 = km.p.o(r4, r5, r6)
                if (r4 == 0) goto L_0x03cf
                if (r2 == 0) goto L_0x005c
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x005c
                java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x005d
            L_0x0059:
                r0 = move-exception
                goto L_0x03c2
            L_0x005c:
                r4 = r3
            L_0x005d:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0059 }
                int r4 = r4.length()     // Catch:{ Exception -> 0x0059 }
                if (r4 != 0) goto L_0x0068
                goto L_0x007f
            L_0x0068:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0077
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x0077
                java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0078
            L_0x0077:
                r5 = r3
            L_0x0078:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                r4.W3(r5)     // Catch:{ Exception -> 0x0059 }
            L_0x007f:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x008e
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x008e
                java.lang.String r5 = r5.getGender()     // Catch:{ Exception -> 0x0059 }
                goto L_0x008f
            L_0x008e:
                r5 = r3
            L_0x008f:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.E3(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00ad
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r5 == 0) goto L_0x00ad
                java.lang.String r5 = r5.getPht()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00ae
            L_0x00ad:
                r5 = r3
            L_0x00ae:
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.G3(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059 }
                r5.<init>()     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00d1
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r6 == 0) goto L_0x00d1
                java.lang.String r6 = r6.getHouse()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00d2
            L_0x00d1:
                r6 = r3
            L_0x00d2:
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                r6 = 32
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00e7
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x00e7
                java.lang.String r7 = r7.getStreet()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00e8
            L_0x00e7:
                r7 = r3
            L_0x00e8:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x00fb
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x00fb
                java.lang.String r7 = r7.getLocalityIfAny()     // Catch:{ Exception -> 0x0059 }
                goto L_0x00fc
            L_0x00fb:
                r7 = r3
            L_0x00fc:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x010f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x010f
                java.lang.String r7 = r7.getDist()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0110
            L_0x010f:
                r7 = r3
            L_0x0110:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0123
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r7 == 0) goto L_0x0123
                java.lang.String r7 = r7.getState()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0124
            L_0x0123:
                r7 = r3
            L_0x0124:
                r5.append(r7)     // Catch:{ Exception -> 0x0059 }
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0137
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r6 == 0) goto L_0x0137
                java.lang.String r6 = r6.getPincode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0138
            L_0x0137:
                r6 = r3
            L_0x0138:
                r5.append(r6)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0059 }
                r4.z3(r5)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "1"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x015d
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 514(0x202, float:7.2E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x015d:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "2"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x0178
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 513(0x201, float:7.19E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x0178:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "3"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x0192
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 515(0x203, float:7.22E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x0192:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "4"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01ac
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 525(0x20d, float:7.36E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01ac:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "5"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01c6
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 523(0x20b, float:7.33E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01c6:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r4 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r4 = r4.b()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = "6"
                boolean r4 = cm.l.a(r4, r5)     // Catch:{ Exception -> 0x0059 }
                if (r4 == 0) goto L_0x01e0
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                r5 = 516(0x204, float:7.23E-43)
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01f1
            L_0x01e0:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ld.f r5 = r4.P2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r5.b()     // Catch:{ Exception -> 0x0059 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0059 }
                r4.d4(r5)     // Catch:{ Exception -> 0x0059 }
            L_0x01f1:
                android.util.Log.d(r0, r0)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                da.c r4 = r0.A2()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ni.tc r0 = r0.h2()     // Catch:{ Exception -> 0x0059 }
                android.widget.EditText r0 = r0.f28739f     // Catch:{ Exception -> 0x0059 }
                android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x021f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x021f
                java.lang.String r0 = r0.getCareOf()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0220
            L_0x021f:
                r0 = r3
            L_0x0220:
                java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0231
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0231
                java.lang.String r0 = r0.getCode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0232
            L_0x0231:
                r0 = r3
            L_0x0232:
                java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0243
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0243
                java.lang.String r0 = r0.getDist()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0244
            L_0x0243:
                r0 = r3
            L_0x0244:
                java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0255
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0255
                java.lang.String r0 = r0.getDob()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0256
            L_0x0255:
                r0 = r3
            L_0x0256:
                java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0267
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0267
                java.lang.String r0 = r0.getGender()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0268
            L_0x0267:
                r0 = r3
            L_0x0268:
                java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0279
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0279
                java.lang.String r0 = r0.getHouse()     // Catch:{ Exception -> 0x0059 }
                goto L_0x027a
            L_0x0279:
                r0 = r3
            L_0x027a:
                java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x028b
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x028b
                java.lang.String r0 = r0.getLandMark()     // Catch:{ Exception -> 0x0059 }
                goto L_0x028c
            L_0x028b:
                r0 = r3
            L_0x028c:
                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x029d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x029d
                java.lang.String r0 = r0.getLocalityIfAny()     // Catch:{ Exception -> 0x0059 }
                goto L_0x029e
            L_0x029d:
                r0 = r3
            L_0x029e:
                java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02af
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02af
                java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02b0
            L_0x02af:
                r0 = r3
            L_0x02b0:
                java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02c5
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02c5
                int r0 = r0.getPhone()     // Catch:{ Exception -> 0x0059 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                goto L_0x02c6
            L_0x02c5:
                r0 = r3
            L_0x02c6:
                java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02d7
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02d7
                java.lang.String r0 = r0.getPht()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02d8
            L_0x02d7:
                r0 = r3
            L_0x02d8:
                java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02e9
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02e9
                java.lang.String r0 = r0.getPincode()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02ea
            L_0x02e9:
                r0 = r3
            L_0x02ea:
                java.lang.String r17 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x02fb
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x02fb
                java.lang.String r0 = r0.getState()     // Catch:{ Exception -> 0x0059 }
                goto L_0x02fc
            L_0x02fb:
                r0 = r3
            L_0x02fc:
                java.lang.String r18 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x030d
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x030d
                java.lang.String r0 = r0.getStatus()     // Catch:{ Exception -> 0x0059 }
                goto L_0x030e
            L_0x030d:
                r0 = r3
            L_0x030e:
                java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x031f
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x031f
                java.lang.String r0 = r0.getStreet()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0320
            L_0x031f:
                r0 = r3
            L_0x0320:
                java.lang.String r20 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0331
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0331
                java.lang.String r0 = r0.getVillageTownCity()     // Catch:{ Exception -> 0x0059 }
                goto L_0x0332
            L_0x0331:
                r0 = r3
            L_0x0332:
                java.lang.String r21 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0059 }
                if (r2 == 0) goto L_0x0342
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                if (r0 == 0) goto L_0x0342
                java.lang.String r3 = r0.getXmlUID()     // Catch:{ Exception -> 0x0059 }
            L_0x0342:
                java.lang.String r22 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                java.lang.String r23 = r0.l2()     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r23)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.k2()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r24 = r0.getBioFullName()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = r0.k2()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r3 = r3.getBioDob()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r25 = r0.e2(r3)     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r25)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.k2()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r26 = r0.getBioSwdFullName()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                int r27 = r0.Q2()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r28 = "Y"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                java.lang.String r29 = r0.T2()     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r29)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                ni.tc r0 = r0.h2()     // Catch:{ Exception -> 0x0059 }
                android.widget.EditText r0 = r0.f28739f     // Catch:{ Exception -> 0x0059 }
                android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0059 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0059 }
                java.lang.String r30 = r0.toString()     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                java.lang.String r31 = r0.u2()     // Catch:{ Exception -> 0x0059 }
                r4.m(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r2)     // Catch:{ Exception -> 0x0059 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.getDOEkyc()     // Catch:{ Exception -> 0x0059 }
                cm.l.c(r2)     // Catch:{ Exception -> 0x0059 }
                r0.y3(r2)     // Catch:{ Exception -> 0x0059 }
                goto L_0x040f
            L_0x03c2:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r1.f8161e
                android.app.ProgressDialog r2 = r2.K2()
                r2.dismiss()
                r0.printStackTrace()
                goto L_0x040f
            L_0x03cf:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e
                android.app.ProgressDialog r0 = r0.K2()
                r0.dismiss()
                if (r2 == 0) goto L_0x03df
                java.lang.String r0 = r2.getReason()
                goto L_0x03e0
            L_0x03df:
                r0 = r3
            L_0x03e0:
                if (r0 == 0) goto L_0x03f9
                int r0 = r0.length()
                if (r0 != 0) goto L_0x03e9
                goto L_0x03f9
            L_0x03e9:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e
                if (r2 == 0) goto L_0x03f1
                java.lang.String r3 = r2.getReason()
            L_0x03f1:
                java.lang.String r2 = java.lang.String.valueOf(r3)
            L_0x03f5:
                r0.q3(r0, r2)
                goto L_0x040f
            L_0x03f9:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r0 = r1.f8161e
                ld.c r2 = r0.s2()
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r1.f8161e
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "service_is_not_present"
                java.lang.String r2 = r2.b(r4, r3)
                goto L_0x03f5
            L_0x040f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar.d.b(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Aadarkyc.Response) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8162e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8162e = sarthiProcessWithAdhar;
        }

        public final void b(String str) {
            this.f8162e.K2().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8163e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8163e = sarthiProcessWithAdhar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0643, code lost:
            r3 = r17;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x063b, code lost:
            r3 = r17;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            r0.f8163e.P2().o(r3, r2, r3, r3);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0635 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.String r1 = "515"
                java.lang.String r2 = "524"
                java.lang.String r3 = "548"
                java.lang.String r4 = "526"
                java.lang.String r5 = "537"
                java.lang.String r6 = "525"
                java.lang.String r7 = "523"
                java.lang.String r8 = "N"
                java.lang.String r9 = "516"
                java.lang.String r10 = "513"
                java.lang.String r11 = "514"
                java.lang.String r12 = "NA"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r13 = r0.f8163e
                android.app.ProgressDialog r13 = r13.K2()
                r13.dismiss()
                java.lang.String r13 = "adhResp_submit"
                java.lang.String r14 = r23.toString()     // Catch:{ Exception -> 0x0654 }
                android.util.Log.e(r13, r14)     // Catch:{ Exception -> 0x0654 }
                java.lang.String r13 = r23.getStatusCode()     // Catch:{ Exception -> 0x0654 }
                java.lang.String r14 = "EKYC001"
                r15 = 1
                boolean r13 = km.p.o(r13, r14, r15)     // Catch:{ Exception -> 0x0654 }
                if (r13 == 0) goto L_0x0648
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r13 = r0.f8163e     // Catch:{ Exception -> 0x0067 }
                long r16 = r23.getEkycId()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x0067 }
                java.lang.CharSequence r14 = km.q.B0(r14)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0067 }
                r13.F3(r14)     // Catch:{ Exception -> 0x0067 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r13 = r0.f8163e     // Catch:{ Exception -> 0x0067 }
                ld.f r13 = r13.P2()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r13 = r13.b()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r14 = "950"
                boolean r13 = cm.l.a(r13, r14)     // Catch:{ Exception -> 0x0067 }
                if (r13 == 0) goto L_0x006d
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0067 }
                r1.s3()     // Catch:{ Exception -> 0x0067 }
                goto L_0x0677
            L_0x0067:
                r19 = r8
                r17 = r12
                goto L_0x0635
            L_0x006d:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r13 = r0.f8163e     // Catch:{ Exception -> 0x0067 }
                java.util.HashMap r13 = r13.U2()     // Catch:{ Exception -> 0x0067 }
                java.lang.Object r13 = r13.get(r5)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0067 }
                java.lang.String r14 = "Re-Validation of Expired DL"
                r15 = 0
                r17 = r12
                r12 = 2
                r18 = r6
                r6 = 0
                boolean r13 = km.p.p(r13, r14, r6, r12, r15)     // Catch:{ Exception -> 0x00be }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity> r14 = com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity.class
                java.lang.String r6 = "same"
                java.lang.String r12 = "S"
                java.lang.String r15 = "Y"
                if (r13 == 0) goto L_0x01fa
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r1 = r1.o2()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "M"
                java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00be }
                boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x00be }
                if (r1 == 0) goto L_0x00c2
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                ld.f r1 = r1.P2()     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = r2.p2()     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = "1"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r4 = r4.q2()     // Catch:{ Exception -> 0x00be }
            L_0x00ba:
                r1.o(r2, r15, r3, r4)     // Catch:{ Exception -> 0x00be }
                goto L_0x00d7
            L_0x00be:
                r19 = r8
                goto L_0x0635
            L_0x00c2:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                ld.f r1 = r1.P2()     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = r2.p2()     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = "2"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r4 = r4.q2()     // Catch:{ Exception -> 0x00be }
                goto L_0x00ba
            L_0x00d7:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                r2.<init>(r3, r14)     // Catch:{ Exception -> 0x00be }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "DL"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.l2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "dob"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.n2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "DLDetails"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = r3.k2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "Mobile_no"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                ld.g r3 = r3.R2()     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.l()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "lastEndorsedRTO"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "lastEndorsedState"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.w2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "lastEndorsedRTOCode"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.t2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "lastEndorseStateCode"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.u2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "whatServiceRequired"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.util.HashMap r3 = r3.U2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "state_value"
                r1.putExtra(r2, r6)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "purCode"
                r1.putExtra(r2, r5)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "bioRecGenesis"
                r1.putExtra(r2, r12)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "allowAddrChangeAtDlservReqst"
                r1.putExtra(r2, r8)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "eKYCId"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.p2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "eKYCOpted"
                r1.putExtra(r2, r15)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "eKYCGender"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.o2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r1 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "eKYCapplicantPhoto"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.lang.String r3 = r3.q2()     // Catch:{ Exception -> 0x00be }
                r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x00be }
                r1.startActivity(r2)     // Catch:{ Exception -> 0x00be }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                r1.finish()     // Catch:{ Exception -> 0x00be }
                goto L_0x0677
            L_0x01fa:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x00be }
                java.util.HashMap r5 = r5.U2()     // Catch:{ Exception -> 0x00be }
                java.lang.Object r5 = r5.get(r4)     // Catch:{ Exception -> 0x00be }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00be }
                java.lang.String r13 = "Change of Name in DL"
                r20 = r7
                r19 = r8
                r21 = r9
                r7 = 2
                r8 = 0
                r9 = 0
                boolean r5 = km.p.p(r5, r13, r9, r7, r8)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r7 = "getIntent(...)"
                if (r5 == 0) goto L_0x0246
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName> r5 = com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName.class
                r2.<init>(r3, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r5, r4)     // Catch:{ Exception -> 0x0635 }
            L_0x023f:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r1.finish()     // Catch:{ Exception -> 0x0635 }
                goto L_0x0677
            L_0x0246:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r4 = r4.U2()     // Catch:{ Exception -> 0x0635 }
                java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = "Change of Date of Birth in DL"
                r8 = 0
                r9 = 2
                r13 = 0
                boolean r4 = km.p.p(r4, r5, r13, r9, r8)     // Catch:{ Exception -> 0x0635 }
                if (r4 == 0) goto L_0x0284
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity> r5 = com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.class
                r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r4, r5, r3)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0284:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r3 = r3.U2()     // Catch:{ Exception -> 0x0635 }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = "Endorsement to Drive in Hill Region"
                r5 = 0
                r8 = 2
                r9 = 0
                boolean r3 = km.p.p(r3, r4, r9, r8, r5)     // Catch:{ Exception -> 0x0635 }
                if (r3 == 0) goto L_0x02c3
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.hillService.HillReligion> r5 = com.nic.mparivahan.dlservices.ui.hillService.HillReligion.class
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r3)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x02c3:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r2 = r2.U2()     // Catch:{ Exception -> 0x0635 }
                java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = "Renewal of DL"
                r4 = 0
                r5 = 2
                r8 = 0
                boolean r2 = km.p.p(r2, r3, r8, r5, r4)     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity> r3 = com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.class
                if (r2 == 0) goto L_0x0373
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.S2()     // Catch:{ Exception -> 0x0635 }
                r2 = 1
                boolean r1 = km.p.o(r1, r6, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x034d
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.i2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r12, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0327
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.g2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r15, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0327
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r11)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0327:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r2.<init>(r3, r14)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r11)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x034d:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r11)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0373:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r2 = r2.U2()     // Catch:{ Exception -> 0x0635 }
                java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = "Change of Address in DL"
                r5 = 0
                r8 = 2
                r9 = 0
                boolean r2 = km.p.p(r2, r4, r9, r8, r5)     // Catch:{ Exception -> 0x0635 }
                if (r2 == 0) goto L_0x03b0
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0635 }
                r2.setIntent(r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r2 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r2.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r2.W2(r3, r4, r5, r1)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x03b0:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r1 = r1.U2()     // Catch:{ Exception -> 0x0635 }
                java.lang.Object r1 = r1.get(r10)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0635 }
                java.lang.String r2 = "Issue of Duplicate DL"
                r4 = 0
                r5 = 2
                r8 = 0
                boolean r1 = km.p.p(r1, r2, r8, r5, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0460
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.S2()     // Catch:{ Exception -> 0x0635 }
                r2 = 1
                boolean r1 = km.p.o(r1, r6, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x043a
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.i2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r12, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0412
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.g2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r15, r2)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0412
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r10)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0412:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity> r4 = com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.class
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r10)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x043a:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r2)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r2 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r2, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = r3.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r2, r3, r4, r10)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0460:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r1 = r1.U2()     // Catch:{ Exception -> 0x0635 }
                r2 = r21
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = "Replacement of DL"
                r5 = 0
                r8 = 2
                r9 = 0
                boolean r1 = km.p.p(r1, r4, r9, r8, r5)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0512
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.S2()     // Catch:{ Exception -> 0x0635 }
                r4 = 1
                boolean r1 = km.p.o(r1, r6, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x04ec
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.i2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r12, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x04c4
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.g2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r15, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x04c4
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x04c4:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity> r5 = com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity.class
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r3)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x04ec:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0512:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r1 = r1.U2()     // Catch:{ Exception -> 0x0635 }
                r2 = r20
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = "DL Extract"
                r5 = 0
                r6 = 2
                r8 = 0
                boolean r1 = km.p.p(r1, r4, r8, r6, r5)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0592
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.i2()     // Catch:{ Exception -> 0x0635 }
                r4 = 1
                boolean r1 = km.p.o(r1, r12, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x056a
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.g2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r15, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x056a
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x056a:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity> r5 = com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity.class
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r3)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0592:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.util.HashMap r1 = r1.U2()     // Catch:{ Exception -> 0x0635 }
                r2 = r18
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = "International Driving Permit"
                r5 = 0
                r6 = 2
                r8 = 0
                boolean r1 = km.p.p(r1, r4, r8, r6, r5)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x0612
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.i2()     // Catch:{ Exception -> 0x0635 }
                r4 = 1
                boolean r1 = km.p.o(r1, r12, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x05ea
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r1 = r1.g2()     // Catch:{ Exception -> 0x0635 }
                boolean r1 = km.p.o(r1, r15, r4)     // Catch:{ Exception -> 0x0635 }
                if (r1 == 0) goto L_0x05ea
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r4.<init>(r5, r3)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x05ea:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.Class<com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity> r5 = com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity.class
                r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0635 }
                r1.setIntent(r3)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                android.content.Intent r3 = r1.getIntent()     // Catch:{ Exception -> 0x0635 }
                cm.l.e(r3, r7)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r4 = r4.v2()     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r5 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                java.lang.String r5 = r5.w2()     // Catch:{ Exception -> 0x0635 }
                r1.W2(r3, r4, r5, r2)     // Catch:{ Exception -> 0x0635 }
                goto L_0x023f
            L_0x0612:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                ld.c r2 = r1.s2()     // Catch:{ Exception -> 0x0635 }
                java.lang.String r3 = "service_is_not_present"
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r4 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x0635 }
                java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0635 }
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e     // Catch:{ Exception -> 0x0635 }
                ni.tc r3 = r3.h2()     // Catch:{ Exception -> 0x0635 }
                android.widget.ScrollView r3 = r3.b()     // Catch:{ Exception -> 0x0635 }
                r1.r1(r2, r3)     // Catch:{ Exception -> 0x0635 }
                goto L_0x0677
            L_0x0635:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0643 }
                ld.f r1 = r1.P2()     // Catch:{ Exception -> 0x0643 }
                r3 = r17
                r2 = r19
                r1.o(r3, r2, r3, r3)     // Catch:{ Exception -> 0x0656 }
                goto L_0x0677
            L_0x0643:
                r3 = r17
                r2 = r19
                goto L_0x0656
            L_0x0648:
                r2 = r8
                r3 = r12
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e     // Catch:{ Exception -> 0x0656 }
                java.lang.String r4 = r23.getStatusDesc()     // Catch:{ Exception -> 0x0656 }
                r1.q3(r1, r4)     // Catch:{ Exception -> 0x0656 }
                goto L_0x0677
            L_0x0654:
                r2 = r8
                r3 = r12
            L_0x0656:
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e
                ld.f r1 = r1.P2()
                r1.o(r3, r2, r3, r3)
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r1 = r0.f8163e
                ld.c r2 = r1.s2()
                com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar r3 = r0.f8163e
                r4 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "service_is_not_present"
                java.lang.String r2 = r2.b(r4, r3)
                r1.q3(r1, r2)
            L_0x0677:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar.f.b(com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitAdharApi) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SarthiProcessWithAdhar f8164e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SarthiProcessWithAdhar sarthiProcessWithAdhar) {
            super(1);
            this.f8164e = sarthiProcessWithAdhar;
        }

        public final void b(String str) {
            this.f8164e.K2().dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                SarthiProcessWithAdhar sarthiProcessWithAdhar = this.f8164e;
                sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, sarthiProcessWithAdhar.s2().b("service_is_not_present", this.f8164e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8165a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f8165a = lVar;
        }

        public final pl.c a() {
            return this.f8165a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8165a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class i extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f8167b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f8166a = textView;
            this.f8167b = textView2;
        }

        public void onFinish() {
            this.f8167b.setVisibility(0);
            this.f8166a.setText("0");
            this.f8166a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8166a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f8167b.setVisibility(8);
            this.f8166a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f8168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f8169b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TextView textView, TextView textView2) {
            super(30000, 1000);
            this.f8168a = textView;
            this.f8169b = textView2;
        }

        public void onFinish() {
            this.f8169b.setVisibility(0);
            this.f8168a.setText("0");
            this.f8168a.setVisibility(8);
        }

        public void onTick(long j10) {
            TextView textView = this.f8168a;
            textView.setText("Time remaining : " + (j10 / ((long) 1000)));
            this.f8169b.setVisibility(8);
            this.f8168a.setVisibility(0);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02ec, code lost:
        r3.add(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void V2() {
        /*
            r7 = this;
            r7.P3(r7)
            ld.g r0 = new ld.g
            r0.<init>(r7)
            r7.e4(r0)
            ld.c r0 = new ld.c
            r0.<init>(r7)
            r7.J3(r0)
            com.nic.mparivahan.VahanEkyc.EkYCService$a r0 = com.nic.mparivahan.VahanEkyc.EkYCService.f20515a
            com.nic.mparivahan.VahanEkyc.EkYCService r0 = r0.a(r7)
            r7.b4(r0)
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r0 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r0 = r0.b(r7)
            r7.a4(r0)
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r7)
            r7.X3(r0)
            android.app.ProgressDialog r0 = r7.K2()
            ld.c r1 = r7.s2()
            java.lang.String r2 = "label_challan_please_wait"
            java.lang.String r3 = "Please wait..."
            java.lang.String r1 = r1.b(r2, r3)
            r0.setMessage(r1)
            android.app.ProgressDialog r0 = r7.K2()
            r1 = 0
            r0.setCancelable(r1)
            android.app.ProgressDialog r0 = r7.K2()
            r0.setCanceledOnTouchOutside(r1)
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "1"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x0065
            r0 = 514(0x202, float:7.2E-43)
        L_0x0061:
            r7.f8144p0 = r0
            goto L_0x00d1
        L_0x0065:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "2"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x0078
            r0 = 513(0x201, float:7.19E-43)
            goto L_0x0061
        L_0x0078:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "3"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x008b
            r0 = 515(0x203, float:7.22E-43)
            goto L_0x0061
        L_0x008b:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "4"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x009e
            r0 = 525(0x20d, float:7.36E-43)
            goto L_0x0061
        L_0x009e:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "5"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x00b1
            r0 = 523(0x20b, float:7.33E-43)
            goto L_0x0061
        L_0x00b1:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "6"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x00c4
            r0 = 516(0x204, float:7.23E-43)
            goto L_0x0061
        L_0x00c4:
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0061
        L_0x00d1:
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x01a2
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "bioRecGenesis"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.N = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "lastEndorsedRTOCode"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.O = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "lastEndorseStateCode"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.P = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "lastEndorsedState"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.Q = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "lastEndorsedRTO"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.R = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "state_value"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.S = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "dob"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.U = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "DL"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.T = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "DLDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r0, r2)
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0
            r7.C3(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "whatServiceRequired"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            java.lang.String r2 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }"
            cm.l.d(r0, r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r7.Z = r0
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "multiList"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            java.lang.String r2 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }"
            cm.l.d(r0, r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r7.T3(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "multiCheck"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A0 = r0
        L_0x01a2:
            com.nic.mparivahan.dlservices.data.network.DlServiceInt$a r0 = com.nic.mparivahan.dlservices.data.network.DlServiceInt.f21675a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r0 = r0.a(r7)
            r7.Z3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            ba.a r2 = new ba.a
            y9.a r3 = new y9.a
            com.nic.mparivahan.dlservices.data.network.DlServiceInt r4 = r7.M2()
            r3.<init>(r4, r7)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<ba.b> r2 = ba.b.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            ba.b r0 = (ba.b) r0
            r7.D3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            ca.b r2 = new ca.b
            ca.a r3 = new ca.a
            com.nic.mparivahan.VahanEkyc.EkYCService r4 = r7.O2()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<ca.c> r2 = ca.c.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            ca.c r0 = (ca.c) r0
            r7.S3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            bi.g r2 = new bi.g
            wg.d r3 = new wg.d
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r4 = r7.N2()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<bi.h> r2 = bi.h.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            bi.h r0 = (bi.h) r0
            r7.g4(r0)
            com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface$a r0 = com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface.f8349a
            com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface r0 = r0.a(r7)
            r7.L3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            da.a r2 = new da.a
            da.b r3 = new da.b
            com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface r4 = r7.y2()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<da.c> r2 = da.c.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            da.c r0 = (da.c) r0
            r7.N3(r0)
            com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface$a r0 = com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface.f8352a
            com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface r0 = r0.b(r7)
            r7.M3(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            ea.b r2 = new ea.b
            ea.d r3 = new ea.d
            com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface r4 = r7.z2()
            r3.<init>(r4)
            r2.<init>(r3)
            r0.<init>((androidx.lifecycle.x0) r7, (androidx.lifecycle.u0.b) r2)
            java.lang.Class<ea.a> r2 = ea.a.class
            androidx.lifecycle.t0 r0 = r0.a(r2)
            ea.a r0 = (ea.a) r0
            r7.O3(r0)
            ni.tc r0 = r7.h2()
            android.widget.TextView r0 = r0.f28743j
            java.lang.String r2 = r7.T
            r0.setText(r2)
            ni.tc r0 = r7.h2()
            ni.dc r0 = r0.f28741h
            android.widget.TextView r0 = r0.f25961g
            ld.f r2 = r7.P2()
            java.lang.String r2 = r2.i()
            r0.setText(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.H3(r0)
            ld.f r0 = r7.P2()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "950"
            boolean r0 = cm.l.a(r0, r2)
            if (r0 == 0) goto L_0x0393
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ Exception -> 0x0393 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r2 = "enabledServiceList"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)     // Catch:{ Exception -> 0x0393 }
            i7.e r2 = new i7.e     // Catch:{ Exception -> 0x0393 }
            r2.<init>()     // Catch:{ Exception -> 0x0393 }
            i7.d r2 = r2.b()     // Catch:{ Exception -> 0x0393 }
            com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar$initFun$theList$1 r3 = new com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar$initFun$theList$1     // Catch:{ Exception -> 0x0393 }
            r3.<init>()     // Catch:{ Exception -> 0x0393 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x0393 }
            java.lang.Object r0 = r2.k(r0, r3)     // Catch:{ Exception -> 0x0393 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0393 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0393 }
            int r2 = r0.size()     // Catch:{ Exception -> 0x0393 }
        L_0x02b8:
            if (r1 >= r2) goto L_0x0393
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "get(...)"
            cm.l.e(r3, r4)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0393 }
            java.util.ArrayList r4 = r7.H2()     // Catch:{ Exception -> 0x0393 }
            boolean r4 = r4.contains(r3)     // Catch:{ Exception -> 0x0393 }
            java.lang.String r5 = "Renewal of DL"
            java.lang.String r6 = "Re-Validation of Expired DL"
            if (r4 == 0) goto L_0x0365
            int r4 = r3.hashCode()     // Catch:{ Exception -> 0x0393 }
            switch(r4) {
                case 52503: goto L_0x0355;
                case 52504: goto L_0x0344;
                case 52505: goto L_0x0334;
                case 52506: goto L_0x0324;
                case 52535: goto L_0x0314;
                case 52537: goto L_0x0304;
                case 52569: goto L_0x02f1;
                case 52601: goto L_0x02dc;
                default: goto L_0x02da;
            }     // Catch:{ Exception -> 0x0393 }
        L_0x02da:
            goto L_0x0365
        L_0x02dc:
            java.lang.String r4 = "548"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x02e6
            goto L_0x0365
        L_0x02e6:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Change of Date of Birth in DL"
        L_0x02ec:
            r3.add(r4)     // Catch:{ Exception -> 0x0393 }
            goto L_0x0365
        L_0x02f1:
            java.lang.String r4 = "537"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x02fb
            goto L_0x0365
        L_0x02fb:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            r3.add(r6)     // Catch:{ Exception -> 0x0393 }
            goto L_0x0365
        L_0x0304:
            java.lang.String r4 = "526"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x030d
            goto L_0x0365
        L_0x030d:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Change of Name in DL"
            goto L_0x02ec
        L_0x0314:
            java.lang.String r4 = "524"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x031d
            goto L_0x0365
        L_0x031d:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            goto L_0x02ec
        L_0x0324:
            java.lang.String r4 = "516"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x032d
            goto L_0x0365
        L_0x032d:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Replacement of DL"
            goto L_0x02ec
        L_0x0334:
            java.lang.String r4 = "515"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x033d
            goto L_0x0365
        L_0x033d:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Change of Address in DL"
            goto L_0x02ec
        L_0x0344:
            java.lang.String r4 = "514"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x034d
            goto L_0x0365
        L_0x034d:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            r3.add(r5)     // Catch:{ Exception -> 0x0393 }
            goto L_0x0365
        L_0x0355:
            java.lang.String r4 = "513"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x035e
            goto L_0x0365
        L_0x035e:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            java.lang.String r4 = "Issue of Duplicate DL"
            goto L_0x02ec
        L_0x0365:
            java.lang.String r3 = r7.A0     // Catch:{ Exception -> 0x0393 }
            boolean r3 = cm.l.a(r3, r6)     // Catch:{ Exception -> 0x0393 }
            if (r3 == 0) goto L_0x038f
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            boolean r3 = r3.contains(r6)     // Catch:{ Exception -> 0x0393 }
            if (r3 != 0) goto L_0x037e
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            r3.add(r6)     // Catch:{ Exception -> 0x0393 }
        L_0x037e:
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            boolean r3 = r3.contains(r5)     // Catch:{ Exception -> 0x0393 }
            if (r3 == 0) goto L_0x038f
            java.util.ArrayList r3 = r7.r2()     // Catch:{ Exception -> 0x0393 }
            r3.remove(r5)     // Catch:{ Exception -> 0x0393 }
        L_0x038f:
            int r1 = r1 + 1
            goto L_0x02b8
        L_0x0393:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithAdhar.V2():void");
    }

    /* access modifiers changed from: private */
    public final void W2(Intent intent, String str, String str2, String str3) {
        ld.f P2;
        String str4;
        String str5;
        if (l.a(this.f8143o0, q.B0("M").toString())) {
            P2 = P2();
            str4 = this.f8141m0;
            str5 = "1";
        } else {
            P2 = P2();
            str4 = this.f8141m0;
            str5 = "2";
        }
        P2.o(str4, "Y", str5, this.f8142n0);
        try {
            intent.putExtra("DL", this.T);
            intent.putExtra("dob", this.U);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", R2().l());
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            intent.putExtra("lastEndorseStateCode", this.P);
            intent.putExtra("whatServiceRequired", this.Z);
            intent.putExtra("state_value", this.S);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", this.N);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.f8137i0);
            intent.putExtra("eKYCId", this.f8141m0);
            intent.putExtra("eKYCOpted", "Y");
            intent.putExtra("eKYCGender", this.f8143o0);
            intent.putExtra("eKYCapplicantPhoto", this.f8142n0);
            intent.putExtra("aadharData", f2());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void X2(Intent intent, String str, String str2, String str3, ArrayList arrayList, int i10) {
        ld.f P2;
        String str4;
        String str5;
        if (I2().size() > 1) {
            ld.f P22 = P2();
            String b10 = s2().b("dl_services", getString(R.string.dl_services));
            l.c(b10);
            P22.r(b10, VContant.MULTISERVICE_PURPOSE_CODE);
        }
        if (l.a(this.f8143o0, q.B0("M").toString())) {
            P2 = P2();
            str4 = this.f8141m0;
            str5 = "1";
        } else {
            P2 = P2();
            str4 = this.f8141m0;
            str5 = "2";
        }
        P2.o(str4, "Y", str5, this.f8142n0);
        try {
            intent.putExtra("DL", this.T);
            intent.putExtra("dob", this.U);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", R2().l());
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            intent.putExtra("lastEndorseStateCode", this.P);
            intent.putExtra("whatServiceRequired", this.Z);
            intent.putExtra("state_value", this.S);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", this.N);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.f8137i0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("serialNo", i10);
            intent.putExtra("COA", this.f8151w0);
            intent.putExtra("metaflag", this.B0);
            intent.putExtra("listHeaderSteps", x2());
            intent.putExtra("eKYCId", this.f8141m0);
            intent.putExtra("eKYCOpted", "Y");
            intent.putExtra("eKYCGender", this.f8143o0);
            intent.putExtra("eKYCapplicantPhoto", this.f8142n0);
            intent.putExtra("aadharData", f2());
            startActivity(intent);
        } catch (Exception e10) {
            Log.d("error_gr", e10.getLocalizedMessage());
        }
    }

    private final void Y2() {
        B2().h().g(this, new h(new b(this)));
        B2().i().g(this, new h(new c(this)));
        B2().j().g(this, new h(new d(this)));
        B2().i().g(this, new h(new e(this)));
        A2().l().g(this, new h(new f(this)));
        A2().h().g(this, new h(new g(this)));
        m2().j(this, this.P);
        m2().C().g(this, new z1(this));
        F2().j().g(this, new x0(this));
        F2().i().g(this, new y0(this));
        F2().h().g(this, new z0(this));
        F2().g().g(this, new a1(this));
        D2().k().g(this, new b1(this));
        D2().i().g(this, new c1(this));
    }

    /* access modifiers changed from: private */
    public static final void Z2(SarthiProcessWithAdhar sarthiProcessWithAdhar, EkycVerifyResponse ekycVerifyResponse) {
        String str;
        DOEkyc dOEkyc;
        DOEkyc dOEkyc2;
        DOEkyc dOEkyc3;
        DOEkyc dOEkyc4;
        DOEkyc dOEkyc5;
        DOEkyc dOEkyc6;
        DOEkyc dOEkyc7;
        DOEkyc dOEkyc8;
        DOEkyc dOEkyc9;
        DOEkyc dOEkyc10;
        DOEkyc dOEkyc11;
        DOEkyc dOEkyc12;
        DOEkyc dOEkyc13;
        DOEkyc dOEkyc14;
        DOEkyc dOEkyc15;
        DOEkyc dOEkyc16;
        DOEkyc dOEkyc17;
        DOEkyc dOEkyc18;
        DOEkyc dOEkyc19;
        DOEkyc dOEkyc20;
        DOEkyc dOEkyc21;
        DOEkyc dOEkyc22;
        DOEkyc dOEkyc23;
        DOEkyc dOEkyc24;
        DOEkyc dOEkyc25;
        DOEkyc dOEkyc26;
        SarthiProcessWithAdhar sarthiProcessWithAdhar2 = sarthiProcessWithAdhar;
        l.f(sarthiProcessWithAdhar2, "this$0");
        if (ekycVerifyResponse != null) {
            try {
                Data data = ekycVerifyResponse.getData();
                String str2 = null;
                DOAadhaarResponse dOAadhaarResponse = data != null ? data.getDOAadhaarResponse() : null;
                if (String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null).length() != 0) {
                    if (p.o(String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null), "Y", true)) {
                        try {
                            ld.h hVar = new ld.h(sarthiProcessWithAdhar2);
                            String str3 = sarthiProcessWithAdhar2.V;
                            l.c(str3);
                            hVar.f(str3);
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc26 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc26.getName()).length() != 0) {
                                sarthiProcessWithAdhar2.W = String.valueOf((dOAadhaarResponse == null || (dOEkyc25 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc25.getName());
                            }
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc24 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc24.getGender()).length() != 0) {
                                sarthiProcessWithAdhar2.f8143o0 = String.valueOf((dOAadhaarResponse == null || (dOEkyc23 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc23.getGender());
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((dOAadhaarResponse == null || (dOEkyc22 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc22.getHouse());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc21 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc21.getStreet());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc20 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc20.getLocalityIfAny());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc19 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc19.getDist());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc18 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc18.getState());
                            sb2.append(' ');
                            sb2.append((dOAadhaarResponse == null || (dOEkyc17 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc17.getPincode()));
                            sarthiProcessWithAdhar2.X = sb2.toString();
                            da.c A2 = sarthiProcessWithAdhar.A2();
                            String obj = q.B0(sarthiProcessWithAdhar.h2().f28739f.getText().toString()).toString();
                            String valueOf = String.valueOf((dOAadhaarResponse == null || (dOEkyc16 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc16.getCareOf());
                            String valueOf2 = String.valueOf((dOAadhaarResponse == null || (dOEkyc15 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc15.getCode());
                            String valueOf3 = String.valueOf((dOAadhaarResponse == null || (dOEkyc14 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc14.getDist());
                            String valueOf4 = String.valueOf((dOAadhaarResponse == null || (dOEkyc13 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc13.getDob());
                            String valueOf5 = String.valueOf((dOAadhaarResponse == null || (dOEkyc12 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc12.getGender());
                            String valueOf6 = String.valueOf((dOAadhaarResponse == null || (dOEkyc11 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc11.getHouse());
                            String valueOf7 = String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getLandMark());
                            String valueOf8 = String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc9.getLocalityIfAny());
                            String valueOf9 = String.valueOf((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc8.getName());
                            String valueOf10 = String.valueOf((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc7.getPhone()));
                            String valueOf11 = String.valueOf((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc6.getPincode()));
                            String valueOf12 = String.valueOf((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getState());
                            String valueOf13 = String.valueOf((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getStatus());
                            String valueOf14 = String.valueOf((dOAadhaarResponse == null || (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc3.getStreet());
                            String valueOf15 = String.valueOf((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getVillageTownCity());
                            if (!(dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null)) {
                                str2 = dOEkyc.getXmlUID();
                            }
                            String valueOf16 = String.valueOf(str2);
                            String str4 = sarthiProcessWithAdhar2.T;
                            l.c(str4);
                            String bioFullName = sarthiProcessWithAdhar.k2().getBioObj().getBioFullName();
                            String e22 = sarthiProcessWithAdhar2.e2(sarthiProcessWithAdhar.k2().getBioObj().getBioDob());
                            l.c(e22);
                            String bioSwdFullName = sarthiProcessWithAdhar.k2().getBioObj().getBioSwdFullName();
                            int i10 = sarthiProcessWithAdhar2.f8144p0;
                            String str5 = sarthiProcessWithAdhar2.V;
                            l.c(str5);
                            A2.m(obj, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, "NA", valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, str4, bioFullName, e22, bioSwdFullName, i10, "Y", str5, q.B0(sarthiProcessWithAdhar.h2().f28739f.getText().toString()).toString(), sarthiProcessWithAdhar2.P);
                            return;
                        } catch (Exception e10) {
                            sarthiProcessWithAdhar.K2().dismiss();
                            e10.printStackTrace();
                            return;
                        }
                    }
                }
                sarthiProcessWithAdhar.K2().dismiss();
                String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
                if (reason != null) {
                    if (reason.length() != 0) {
                        if (dOAadhaarResponse != null) {
                            str2 = dOAadhaarResponse.getReason();
                        }
                        str = String.valueOf(str2);
                        sarthiProcessWithAdhar2.q3(sarthiProcessWithAdhar2, str);
                    }
                }
                str = "Unable to verify the request, Please try after some time";
                sarthiProcessWithAdhar2.q3(sarthiProcessWithAdhar2, str);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void a3(SarthiProcessWithAdhar sarthiProcessWithAdhar, String str) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.K2().dismiss();
    }

    private final void b2() {
        h2().f28744k.setOnClickListener(new x1(this));
        h2().f28745l.setOnClickListener(new y1(this));
    }

    /* access modifiers changed from: private */
    public static final void b3(SarthiProcessWithAdhar sarthiProcessWithAdhar, ServiceCheckPojo serviceCheckPojo) {
        Intent intent;
        String str;
        String str2;
        String str3;
        ArrayList J2;
        Intent intent2;
        String str4;
        String str5;
        String str6;
        ArrayList J22;
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.L2().c(false);
        try {
            if (l.a(serviceCheckPojo.getStatus_code(), "00")) {
                ArrayList J23 = sarthiProcessWithAdhar.J2();
                if (J23 != null) {
                    if (!J23.isEmpty()) {
                        if (sarthiProcessWithAdhar.J2().size() != 0) {
                            if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, DLDuplicateActivity.class));
                                intent = sarthiProcessWithAdhar.getIntent();
                                l.e(intent, "getIntent(...)");
                                str = sarthiProcessWithAdhar.R;
                                str2 = sarthiProcessWithAdhar.Q;
                                str3 = "513";
                                J2 = sarthiProcessWithAdhar.J2();
                            } else {
                                Class<RenewalOfDLActivity> cls = RenewalOfDLActivity.class;
                                if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, cls));
                                    intent2 = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent2, "getIntent(...)");
                                    str4 = sarthiProcessWithAdhar.R;
                                    str5 = sarthiProcessWithAdhar.Q;
                                    str6 = "514";
                                    J22 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_renewal_dl", "Re-Validation of Expired DL"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, cls));
                                    intent2 = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent2, "getIntent(...)");
                                    str4 = sarthiProcessWithAdhar.R;
                                    str5 = sarthiProcessWithAdhar.Q;
                                    str6 = "537";
                                    J22 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                    if (l.a(sarthiProcessWithAdhar.B0, "0")) {
                                        ArrayList x22 = sarthiProcessWithAdhar.x2();
                                        y.a(x22).remove(sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                                    }
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, ChangeOfAddressActivity.class));
                                    intent = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithAdhar.R;
                                    str2 = sarthiProcessWithAdhar.Q;
                                    str3 = "515";
                                    J2 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, DLReplecementActivity.class));
                                    intent = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithAdhar.R;
                                    str2 = sarthiProcessWithAdhar.Q;
                                    str3 = "516";
                                    J2 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, HillReligion.class));
                                    intent = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithAdhar.R;
                                    str2 = sarthiProcessWithAdhar.Q;
                                    str3 = "524";
                                    J2 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("change_name_dl", "Change of Name in DL"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, ChangeOfName.class));
                                    intent = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithAdhar.R;
                                    str2 = sarthiProcessWithAdhar.Q;
                                    str3 = "526";
                                    J2 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, DobChangeActivity.class));
                                    intent = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent, "getIntent(...)");
                                    str = sarthiProcessWithAdhar.R;
                                    str2 = sarthiProcessWithAdhar.Q;
                                    str3 = "548";
                                    J2 = sarthiProcessWithAdhar.J2();
                                } else if (l.a(sarthiProcessWithAdhar.J2().get(0), sarthiProcessWithAdhar.s2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                    sarthiProcessWithAdhar.setIntent(new Intent(sarthiProcessWithAdhar, DLExtractActivity.class));
                                    Intent intent3 = sarthiProcessWithAdhar.getIntent();
                                    l.e(intent3, "getIntent(...)");
                                    sarthiProcessWithAdhar.X2(intent3, sarthiProcessWithAdhar.R, sarthiProcessWithAdhar.Q, "523", sarthiProcessWithAdhar.J2(), 1);
                                    return;
                                } else {
                                    return;
                                }
                                sarthiProcessWithAdhar.X2(intent2, str4, str5, str6, J22, 1);
                                sarthiProcessWithAdhar.finish();
                                return;
                            }
                            sarthiProcessWithAdhar.X2(intent, str, str2, str3, J2, 1);
                            sarthiProcessWithAdhar.finish();
                            return;
                        }
                    }
                }
                Toast.makeText(sarthiProcessWithAdhar.C2(), "Please select at least one service", 1).show();
                return;
            }
            sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar.C2(), serviceCheckPojo.getResult());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.h2().f28739f.getText().clear();
    }

    /* access modifiers changed from: private */
    public static final void c3(SarthiProcessWithAdhar sarthiProcessWithAdhar, String str) {
        l.f(sarthiProcessWithAdhar, "this$0");
        Toast.makeText(sarthiProcessWithAdhar, "hello", 0).show();
        sarthiProcessWithAdhar.L2().c(false);
        sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, sarthiProcessWithAdhar.s2().b("service_is_not_present", sarthiProcessWithAdhar.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void d2(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        String str;
        l.f(sarthiProcessWithAdhar, "this$0");
        Editable text = sarthiProcessWithAdhar.h2().f28739f.getText();
        l.e(text, "getText(...)");
        if (text.length() == 0 && sarthiProcessWithAdhar.h2().f28735b.isChecked()) {
            str = "Please enter the Aadhaar Number";
        } else if ((sarthiProcessWithAdhar.h2().f28739f.getText().length() >= 12 || !sarthiProcessWithAdhar.h2().f28735b.isChecked()) && (sarthiProcessWithAdhar.h2().f28739f.getText().length() <= 12 || !sarthiProcessWithAdhar.h2().f28735b.isChecked())) {
            Editable text2 = sarthiProcessWithAdhar.h2().f28739f.getText();
            l.e(text2, "getText(...)");
            if (text2.length() == 0 && sarthiProcessWithAdhar.h2().f28746m.isChecked()) {
                str = "Please enter the Virtual Id";
            } else if (sarthiProcessWithAdhar.h2().f28739f.getText().length() < 16 && sarthiProcessWithAdhar.h2().f28746m.isChecked()) {
                str = "Please enter the valid Virtual Id";
            } else if (!sarthiProcessWithAdhar.h2().f28738e.isChecked() && sarthiProcessWithAdhar.h2().f28746m.isChecked()) {
                str = "Please agree with VID based e-KYC consent";
            } else if (sarthiProcessWithAdhar.h2().f28738e.isChecked() || !sarthiProcessWithAdhar.h2().f28735b.isChecked()) {
                sarthiProcessWithAdhar.K2().show();
                int nextInt = new Random().nextInt(1410065407);
                String obj = q.B0(sarthiProcessWithAdhar.h2().f28739f.getText().toString()).toString();
                Charset forName = Charset.forName("UTF-8");
                l.e(forName, "forName(charsetName)");
                byte[] bytes = obj.getBytes(forName);
                l.e(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                ea.a B2 = sarthiProcessWithAdhar.B2();
                l.c(encodeToString);
                B2.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
                return;
            } else {
                str = "Please agree with Aadhaar based e-KYC consent";
            }
        } else {
            sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, "Please enter the valid Aadhaar Number");
            return;
        }
        sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, str);
    }

    /* access modifiers changed from: private */
    public static final void d3(SarthiProcessWithAdhar sarthiProcessWithAdhar, CustomState customState) {
        l.f(sarthiProcessWithAdhar, "this$0");
        try {
            if (p.o(customState.getStatus_code(), "00", true)) {
                sarthiProcessWithAdhar.f8137i0 = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void e3(SarthiProcessWithAdhar sarthiProcessWithAdhar, eKycResponse ekycresponse) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.K2().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            String str = null;
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, String.valueOf(str));
                return;
            }
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data = ekycresponse.getData();
            String valueOf = String.valueOf(data != null ? data.getTxNo() : null);
            sarthiProcessWithAdhar.V = valueOf;
            l.c(valueOf);
            if (valueOf.length() > 23) {
                String str2 = sarthiProcessWithAdhar.V;
                l.c(str2);
                if (q.F(str2, "T", false, 2, (Object) null)) {
                    String str3 = sarthiProcessWithAdhar.V;
                    l.c(str3);
                    String substring = str3.substring(0, 23);
                    l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sarthiProcessWithAdhar.V = substring;
                    l.c(substring);
                    sarthiProcessWithAdhar.V = p.w(substring, "T", " ", false, 4, (Object) null);
                    Date parse = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(sarthiProcessWithAdhar.V);
                    l.d(parse, "null cannot be cast to non-null type java.util.Date");
                    String l10 = Long.toString(parse.getTime() / 1000);
                    l.c(l10);
                    String valueOf2 = String.valueOf(Long.parseLong(l10) * ((long) 1000));
                    sarthiProcessWithAdhar.V = valueOf2;
                    Log.e("time_Stamp_value", String.valueOf(valueOf2));
                }
            }
            ld.h hVar = new ld.h(sarthiProcessWithAdhar);
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            hVar.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            if (data3 != null) {
                str = data3.getLastFourMobileNumber();
            }
            sarthiProcessWithAdhar.h4(sarthiProcessWithAdhar, String.valueOf(str));
        } catch (Exception unused) {
            sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, "Unable to process the request, Please try after some time");
        }
    }

    /* access modifiers changed from: private */
    public static final void f3(SarthiProcessWithAdhar sarthiProcessWithAdhar, String str) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.K2().dismiss();
        sarthiProcessWithAdhar.q3(sarthiProcessWithAdhar, "Unable to process the request, Please try after some time");
    }

    /* access modifiers changed from: private */
    public static final void g3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.finish();
    }

    /* access modifiers changed from: private */
    public static final void h3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.finish();
    }

    /* access modifiers changed from: private */
    public static final void i3(SarthiProcessWithAdhar sarthiProcessWithAdhar, CompoundButton compoundButton, boolean z10) {
        l.f(sarthiProcessWithAdhar, "this$0");
        if (z10) {
            sarthiProcessWithAdhar.h2().f28746m.setChecked(false);
            sarthiProcessWithAdhar.h2().f28735b.setChecked(true);
            sarthiProcessWithAdhar.h2().f28739f.setHint("Enter Aadhaar Number");
            sarthiProcessWithAdhar.h2().f28739f.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            MyTextView myTextView = sarthiProcessWithAdhar.h2().f28736c;
            myTextView.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
            sarthiProcessWithAdhar.f8140l0 = "A";
        }
    }

    /* access modifiers changed from: private */
    public static final void i4(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void j3(SarthiProcessWithAdhar sarthiProcessWithAdhar, CompoundButton compoundButton, boolean z10) {
        l.f(sarthiProcessWithAdhar, "this$0");
        if (z10) {
            sarthiProcessWithAdhar.h2().f28735b.setChecked(false);
            sarthiProcessWithAdhar.h2().f28746m.setChecked(true);
            sarthiProcessWithAdhar.h2().f28739f.setHint("Enter VID Number");
            sarthiProcessWithAdhar.h2().f28739f.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            MyTextView myTextView = sarthiProcessWithAdhar.h2().f28736c;
            myTextView.setText(Html.fromHtml("I have read and agree to " + "<font color=\"#008ed8\"><b><u>VID based e-KYC consent</u></b></font>"));
            sarthiProcessWithAdhar.f8140l0 = "V";
        }
    }

    /* access modifiers changed from: private */
    public static final void j4(EditText editText, ImageView imageView, View view) {
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
    public static final void k3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        if (l.a(sarthiProcessWithAdhar.P2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Dialog dialog = new Dialog(sarthiProcessWithAdhar);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                l.c(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View findViewById = dialog.findViewById(R.id.service_label_cross);
                l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                View findViewById2 = dialog.findViewById(R.id.pop_up_close);
                l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(R.id.service_label_list);
                l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById5 = dialog.findViewById(R.id.dl_services);
                l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
                textView.setText(sarthiProcessWithAdhar.s2().b("btn_ok", "OK"));
                ((TextView) findViewById5).setText(sarthiProcessWithAdhar.s2().b("title_dl_services", "Driving Licence Services"));
                ((ImageView) findViewById).setOnClickListener(new v1(dialog));
                ((TextView) findViewById4).setText(R.string.multi_string_serial);
                ((TextView) findViewById3).setText(sarthiProcessWithAdhar.s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + sarthiProcessWithAdhar.s2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + sarthiProcessWithAdhar.s2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + sarthiProcessWithAdhar.s2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + sarthiProcessWithAdhar.s2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + sarthiProcessWithAdhar.s2().b("change_name_dl", "Change of Name in DL") + 10 + sarthiProcessWithAdhar.s2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + sarthiProcessWithAdhar.s2().b("label_international_driv_permit", "International Driving Permit"));
                textView.setOnClickListener(new w1(dialog));
                Window window2 = dialog.getWindow();
                l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void k4(SarthiProcessWithAdhar sarthiProcessWithAdhar, TextView textView, TextView textView2, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        l.f(textView, "$time_text");
        l.f(textView2, "$resendOtp");
        sarthiProcessWithAdhar.K2().show();
        new j(textView, textView2).start();
        String obj = q.B0(sarthiProcessWithAdhar.h2().f28739f.getText().toString()).toString();
        Charset forName = Charset.forName("UTF-8");
        l.e(forName, "forName(charsetName)");
        byte[] bytes = obj.getBytes(forName);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        int nextInt = new Random().nextInt(1410065407);
        ea.a B2 = sarthiProcessWithAdhar.B2();
        l.c(encodeToString);
        B2.g(encodeToString, false, false, false, true, String.valueOf(nextInt), "", "", false);
    }

    /* access modifiers changed from: private */
    public static final void l3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void l4(EditText editText, SarthiProcessWithAdhar sarthiProcessWithAdhar, TextView textView, ImageView imageView, Dialog dialog, View view) {
        ld.c s22;
        String string;
        String str;
        EditText editText2 = editText;
        SarthiProcessWithAdhar sarthiProcessWithAdhar2 = sarthiProcessWithAdhar;
        TextView textView2 = textView;
        ImageView imageView2 = imageView;
        Dialog dialog2 = dialog;
        l.f(editText2, "$enterOtp");
        l.f(sarthiProcessWithAdhar2, "this$0");
        l.f(textView2, "$txt_reset");
        l.f(imageView2, "$ok_button");
        l.f(dialog2, "$d");
        String obj = editText.getText().toString();
        if (obj.length() == 0) {
            s22 = sarthiProcessWithAdhar.s2();
            string = sarthiProcessWithAdhar2.getString(R.string.pls_enter_otp);
            str = "label_log_entr_otp";
        } else if (obj.length() < 6) {
            s22 = sarthiProcessWithAdhar.s2();
            string = sarthiProcessWithAdhar2.getString(R.string.pls_enter_valid_otp);
            str = "label_log_entr_val_otp";
        } else {
            sarthiProcessWithAdhar.K2().show();
            String obj2 = q.B0(sarthiProcessWithAdhar.h2().f28739f.getText().toString()).toString();
            Charset forName = Charset.forName("UTF-8");
            l.e(forName, "forName(charsetName)");
            byte[] bytes = obj2.getBytes(forName);
            l.e(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            ea.a B2 = sarthiProcessWithAdhar.B2();
            l.c(encodeToString);
            String str2 = sarthiProcessWithAdhar2.V;
            l.c(str2);
            B2.g(encodeToString, false, false, true, true, "987612345", str2, editText.getText().toString(), true);
            textView2.setOnClickListener(new o1(editText2));
            imageView2.setOnClickListener(new p1(dialog2));
        }
        Toast.makeText(sarthiProcessWithAdhar2, s22.b(str, string), 0).show();
        textView2.setOnClickListener(new o1(editText2));
        imageView2.setOnClickListener(new p1(dialog2));
    }

    /* access modifiers changed from: private */
    public static final void m3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void m4(EditText editText, View view) {
        l.f(editText, "$enterOtp");
        editText.setText("");
    }

    private final void n3() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_multi);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.service_label_cross);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.service_label_list);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById5 = dialog.findViewById(R.id.dl_services);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(s2().b("btn_ok", "OK"));
        ((TextView) findViewById5).setText(s2().b("title_dl_services", "Driving Licence Services"));
        ((ImageView) findViewById).setOnClickListener(new q1(dialog));
        ((TextView) findViewById3).setText(s2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + s2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + s2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + s2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + s2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + s2().b("change_name_dl", "Change of Name in DL") + 10 + s2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + s2().b("label_international_driv_permit", "International Driving Permit"));
        ((TextView) findViewById4).setText(R.string.multi_string_serial);
        textView.setOnClickListener(new r1(dialog));
        Window window2 = dialog.getWindow();
        l.c(window2);
        window2.setGravity(48);
        window2.setLayout(-2, -2);
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void n4(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void o3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void s3() {
        Dialog dialog = new Dialog(this, 16973834);
        dialog.setContentView(R.layout.service_selection);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(-1));
        dialog.setCanceledOnTouchOutside(false);
        View findViewById = dialog.findViewById(R.id.service_selection);
        l.d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        Y3((CustomWegetLayout) findViewById2);
        L2().setText(s2().b("button_proceed", getString(R.string.proceed)));
        View findViewById3 = dialog.findViewById(R.id.dl_number_new);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.cancelIv);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById5 = dialog.findViewById(R.id.pop_up_reset);
        l.d(findViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) findViewById5;
        customWegetLayout.setText(s2().b("button_cancel", getString(R.string.cancel)));
        customWegetLayout.setOnClickListener(new i1(dialog));
        View findViewById6 = dialog.findViewById(R.id.select_Service_apply);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById6).setText(s2().b("select_service_to_apply", "Select the service to apply"));
        View findViewById7 = dialog.findViewById(R.id.service_label);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.service_label_dl);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById8;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setText(q.B0(String.valueOf(this.T)).toString());
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new j1(this));
        textView2.setOnClickListener(new k1(this));
        ((ImageView) findViewById4).setOnClickListener(new l1(dialog, this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s2().b("dl_no", "DL No. : "));
        sb2.append(' ');
        String str = this.T;
        l.c(str);
        sb2.append(q.B0(str).toString());
        ((TextView) findViewById3).setText(sb2.toString());
        L2().setOnClickListener(new m1(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter((RecyclerView.h) null);
        u.u(H2());
        recyclerView.setAdapter(l.a(P2().b(), VContant.MULTISERVICE_PURPOSE_CODE) ? new a(this, r2()) : new a(this, H2()));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void t3(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void u3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.n3();
    }

    /* access modifiers changed from: private */
    public static final void v3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        try {
            Intent intent = new Intent(sarthiProcessWithAdhar, DlServiceDetailsActivity.class);
            intent.putExtra("DL", sarthiProcessWithAdhar.T);
            intent.putExtra("dob", sarthiProcessWithAdhar.U);
            intent.putExtra("DLDetails", sarthiProcessWithAdhar.k2());
            intent.putExtra("Mobile_no", sarthiProcessWithAdhar.R2().l());
            intent.putExtra("lastEndorsedRTO", sarthiProcessWithAdhar.R);
            intent.putExtra("lastEndorsedState", sarthiProcessWithAdhar.Q);
            intent.putExtra("lastEndorsedRTOCode", sarthiProcessWithAdhar.R);
            intent.putExtra("lastEndorseStateCode", sarthiProcessWithAdhar.P);
            intent.putExtra("whatServiceRequired", sarthiProcessWithAdhar.Z);
            intent.putExtra("multiList", sarthiProcessWithAdhar.J2());
            sarthiProcessWithAdhar.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void w3(Dialog dialog, SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(dialog, "$d");
        l.f(sarthiProcessWithAdhar, "this$0");
        dialog.dismiss();
        sarthiProcessWithAdhar.finish();
    }

    /* access modifiers changed from: private */
    public static final void x3(SarthiProcessWithAdhar sarthiProcessWithAdhar, View view) {
        l.f(sarthiProcessWithAdhar, "this$0");
        sarthiProcessWithAdhar.L2().c(true);
        sarthiProcessWithAdhar.D2().m(sarthiProcessWithAdhar.I2(), sarthiProcessWithAdhar.P2().l());
    }

    public final da.c A2() {
        da.c cVar = this.f8133e0;
        if (cVar != null) {
            return cVar;
        }
        l.v("mAadharViewModel");
        return null;
    }

    public final void A3(tc tcVar) {
        l.f(tcVar, "<set-?>");
        this.J = tcVar;
    }

    public final ea.a B2() {
        ea.a aVar = this.f8134f0;
        if (aVar != null) {
            return aVar;
        }
        l.v("mAadharViewModel2");
        return null;
    }

    public final void B3(boolean z10) {
        this.f8151w0 = z10;
    }

    public final Context C2() {
        Context context = this.f8129a0;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final void C3(DldetobjX dldetobjX) {
        l.f(dldetobjX, "<set-?>");
        this.Y = dldetobjX;
    }

    public final w9.c D2() {
        w9.c cVar = this.f8152x0;
        if (cVar != null) {
            return cVar;
        }
        l.v("mFormEligVM");
        return null;
    }

    public final void D3(ba.b bVar) {
        l.f(bVar, "<set-?>");
        this.f8138j0 = bVar;
    }

    public final FromEligCheck E2() {
        FromEligCheck fromEligCheck = this.f8153y0;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        l.v("mFormsInterface");
        return null;
    }

    public final void E3(String str) {
        l.f(str, "<set-?>");
        this.f8143o0 = str;
    }

    public final ca.c F2() {
        ca.c cVar = this.f8131c0;
        if (cVar != null) {
            return cVar;
        }
        l.v("mView");
        return null;
    }

    public final void F3(String str) {
        l.f(str, "<set-?>");
        this.f8141m0 = str;
    }

    public final String G2() {
        return this.A0;
    }

    public final void G3(String str) {
        l.f(str, "<set-?>");
        this.f8142n0 = str;
    }

    public final ArrayList H2() {
        ArrayList arrayList = this.f8147s0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiList");
        return null;
    }

    public final void H3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.D0 = arrayList;
    }

    public final ArrayList I2() {
        ArrayList arrayList = this.f8149u0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListCode");
        return null;
    }

    public final void I3(String str) {
        l.f(str, "<set-?>");
        this.B0 = str;
    }

    public final ArrayList J2() {
        ArrayList arrayList = this.f8148t0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("multiListName");
        return null;
    }

    public final void J3(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.M = cVar;
    }

    public final ProgressDialog K2() {
        ProgressDialog progressDialog = this.f8130b0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void K3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.C0 = arrayList;
    }

    public final CustomWegetLayout L2() {
        CustomWegetLayout customWegetLayout = this.f8154z0;
        if (customWegetLayout != null) {
            return customWegetLayout;
        }
        l.v("Proceed");
        return null;
    }

    public final void L3(AadharInterface aadharInterface) {
        l.f(aadharInterface, "<set-?>");
        this.f8135g0 = aadharInterface;
    }

    public final DlServiceInt M2() {
        DlServiceInt dlServiceInt = this.f8139k0;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        l.v("retrofitService");
        return null;
    }

    public final void M3(AdrInterface adrInterface) {
        l.f(adrInterface, "<set-?>");
        this.f8136h0 = adrInterface;
    }

    public final VahanProService N2() {
        VahanProService vahanProService = this.f8145q0;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitServiceVahan");
        return null;
    }

    public final void N3(da.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8133e0 = cVar;
    }

    public final EkYCService O2() {
        EkYCService ekYCService = this.f8132d0;
        if (ekYCService != null) {
            return ekYCService;
        }
        l.v("retrofitService_one");
        return null;
    }

    public final void O3(ea.a aVar) {
        l.f(aVar, "<set-?>");
        this.f8134f0 = aVar;
    }

    public final ld.f P2() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarthiSession");
        return null;
    }

    public final void P3(Context context) {
        l.f(context, "<set-?>");
        this.f8129a0 = context;
    }

    public final int Q2() {
        return this.f8144p0;
    }

    public final void Q3(w9.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8152x0 = cVar;
    }

    public final ld.g R2() {
        ld.g gVar = this.L;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void R3(FromEligCheck fromEligCheck) {
        l.f(fromEligCheck, "<set-?>");
        this.f8153y0 = fromEligCheck;
    }

    public final String S2() {
        return this.S;
    }

    public final void S3(ca.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8131c0 = cVar;
    }

    public final String T2() {
        return this.V;
    }

    public final void T3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f8147s0 = arrayList;
    }

    public final HashMap U2() {
        return this.Z;
    }

    public final void U3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f8149u0 = arrayList;
    }

    public final void V3(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.f8148t0 = arrayList;
    }

    public final void W3(String str) {
        l.f(str, "<set-?>");
        this.W = str;
    }

    public final void X3(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f8130b0 = progressDialog;
    }

    public final void Y3(CustomWegetLayout customWegetLayout) {
        l.f(customWegetLayout, "<set-?>");
        this.f8154z0 = customWegetLayout;
    }

    public final void Z3(DlServiceInt dlServiceInt) {
        l.f(dlServiceInt, "<set-?>");
        this.f8139k0 = dlServiceInt;
    }

    public final void a4(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.f8145q0 = vahanProService;
    }

    public final void b4(EkYCService ekYCService) {
        l.f(ekYCService, "<set-?>");
        this.f8132d0 = ekYCService;
    }

    public final void c4(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final void d4(int i10) {
        this.f8144p0 = i10;
    }

    public final String e2(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final void e4(ld.g gVar) {
        l.f(gVar, "<set-?>");
        this.L = gVar;
    }

    public final Aadarkyc.DOEkyc f2() {
        Aadarkyc.DOEkyc dOEkyc = this.E0;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        l.v("aadhaarData");
        return null;
    }

    public final void f4(String str) {
        this.V = str;
    }

    public final String g2() {
        return this.f8137i0;
    }

    public final void g4(bi.h hVar) {
        l.f(hVar, "<set-?>");
        this.f8146r0 = hVar;
    }

    public final tc h2() {
        tc tcVar = this.J;
        if (tcVar != null) {
            return tcVar;
        }
        l.v("binding");
        return null;
    }

    public final void h4(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        l.f(context2, "context");
        l.f(str2, "mobile_no");
        Dialog dialog = new Dialog(context2);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.resendOtp);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.showmpin);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.submitOtp);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.enterOtp);
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.time_text);
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.txt_reset);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById9, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById9).setOnClickListener(new d1(dialog));
        try {
            textView5.setText(s2().b("label_otp_sent_to_mobile", context2.getString(R.string.otp_sent)) + "\n+91-XXXXXX" + str2);
        } catch (Exception unused) {
            textView5.setText(s2().b("label_otp_sent_to_mobile", context2.getString(R.string.otp_sent)));
        }
        new i(textView3, textView).start();
        imageView2.setOnClickListener(new e1(editText, imageView2));
        textView.setOnClickListener(new f1(this, textView3, textView));
        textView2.setOnClickListener(new g1(editText, this, textView4, imageView, dialog));
        dialog.show();
    }

    public final String i2() {
        return this.N;
    }

    public final boolean j2() {
        return this.f8151w0;
    }

    public final DldetobjX k2() {
        DldetobjX dldetobjX = this.Y;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        l.v("dlDetails");
        return null;
    }

    public final String l2() {
        return this.T;
    }

    public final ba.b m2() {
        ba.b bVar = this.f8138j0;
        if (bVar != null) {
            return bVar;
        }
        l.v("dlServicesViewModel");
        return null;
    }

    public final String n2() {
        return this.U;
    }

    public final String o2() {
        return this.f8143o0;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tc c10 = tc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        A3(c10);
        setContentView((View) h2().b());
        c4(new ld.f(this));
        V3(new ArrayList());
        K3(new ArrayList());
        U3(new ArrayList());
        R3(FromEligCheck.f8099a.b(this));
        Q3((w9.c) new u0((x0) this, (u0.b) new w9.b(new w9.a(E2()))).a(w9.c.class));
        V2();
        b2();
        Y2();
        h2().f28741h.f25959e.setOnClickListener(new w0(this));
        h2().f28740g.f29577d.setOnClickListener(new h1(this));
        h2().f28735b.setOnCheckedChangeListener(new s1(this));
        h2().f28746m.setOnCheckedChangeListener(new t1(this));
        if (l.a(P2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView = h2().f28740g.f29580g;
            String b10 = s2().b("dl_services", getString(R.string.dl_services));
            l.c(b10);
            textView.setText(b10);
            h2().f28740g.f29579f.setVisibility(8);
            h2().f28740g.f29580g.setPaintFlags(8 | h2().f28740g.f29580g.getPaintFlags());
        } else {
            h2().f28740g.f29580g.setText(P2().i());
            h2().f28740g.f29579f.setVisibility(8);
        }
        h2().f28740g.f29580g.setOnClickListener(new u1(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
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
        return this.f8141m0;
    }

    public final String q2() {
        return this.f8142n0;
    }

    public final void q3(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new n1(dialog));
        dialog.show();
    }

    public final ArrayList r2() {
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("finalList");
        return null;
    }

    public final ld.c s2() {
        ld.c cVar = this.M;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final String t2() {
        return this.O;
    }

    public final String u2() {
        return this.P;
    }

    public final String v2() {
        return this.R;
    }

    public final String w2() {
        return this.Q;
    }

    public final ArrayList x2() {
        ArrayList arrayList = this.C0;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("listHeaderSteps");
        return null;
    }

    public final AadharInterface y2() {
        AadharInterface aadharInterface = this.f8135g0;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        l.v("mAadharInterface");
        return null;
    }

    public final void y3(Aadarkyc.DOEkyc dOEkyc) {
        l.f(dOEkyc, "<set-?>");
        this.E0 = dOEkyc;
    }

    public final AdrInterface z2() {
        AdrInterface adrInterface = this.f8136h0;
        if (adrInterface != null) {
            return adrInterface;
        }
        l.v("mAadharInterface2");
        return null;
    }

    public final void z3(String str) {
        l.f(str, "<set-?>");
        this.X = str;
    }
}
