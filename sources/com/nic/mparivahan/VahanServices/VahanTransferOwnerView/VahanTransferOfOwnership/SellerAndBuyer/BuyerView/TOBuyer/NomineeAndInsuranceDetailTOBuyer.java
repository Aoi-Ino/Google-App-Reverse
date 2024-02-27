package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.ToSaveToDraftBuyerRepo.TOSaveToDraftServiceBuyerAadhar;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.Relation;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import dh.n0;
import dh.o0;
import dh.p0;
import dh.q0;
import dh.r0;
import dh.s0;
import dh.t0;
import dh.v0;
import dh.w0;
import dh.y0;
import dh.z0;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.u6;
import pl.x;

public final class NomineeAndInsuranceDetailTOBuyer extends androidx.appcompat.app.d {
    public u6 G;
    public mh.a H;
    public TOSaveToDraftServiceBuyerAadhar I;
    private Calendar J = Calendar.getInstance();
    public String K;
    public qh.a L;
    public TOCommonService M;
    public ProgressDialog N;
    public String O;
    public ld.c P;
    public String Q;
    private String R = "NA";
    private String S = "NA";
    public NrvDetails T;
    private boolean U;
    private ArrayList V = new ArrayList();
    private MultiServiceDraftTO W;
    private MultiServiceDraft X;
    private ArrayList Y = new ArrayList();

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f21368e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
            super(1);
            this.f21368e = nomineeAndInsuranceDetailTOBuyer;
        }

        public final void b(String str) {
            this.f21368e.z1().dismiss();
            if (!str.equals("Error")) {
                NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer = this.f21368e;
                nomineeAndInsuranceDetailTOBuyer.f2(nomineeAndInsuranceDetailTOBuyer, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f21369e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
            super(1);
            this.f21369e = nomineeAndInsuranceDetailTOBuyer;
        }

        public final void b(ToCommonModel2 toCommonModel2) {
            this.f21369e.z1().dismiss();
            try {
                ArrayList<Relation> relation = toCommonModel2.getData().getRelation();
                relation.add(0, new Relation(0, "Select Relation With Nominee"));
                this.f21369e.u1().f28847z.setAdapter(new hh.c(this.f21369e, relation));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ToCommonModel2) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f21370e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
            super(1);
            this.f21370e = nomineeAndInsuranceDetailTOBuyer;
        }

        public final void b(String str) {
            this.f21370e.z1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f21371e;

        d(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
            this.f21371e = nomineeAndInsuranceDetailTOBuyer;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21371e.a2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeAndInsuranceDetailTOBuyer f21372e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer) {
            super(1);
            this.f21372e = nomineeAndInsuranceDetailTOBuyer;
        }

        public final void b(SellerResponse sellerResponse) {
            Integer statusCode;
            TransferOwnershipDto transferOwnershipDto;
            this.f21372e.z1().dismiss();
            ApiMessage apiMessage = sellerResponse.getApiMessage();
            String str = null;
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer = this.f21372e;
                ApiMessage apiMessage2 = sellerResponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                nomineeAndInsuranceDetailTOBuyer.f2(nomineeAndInsuranceDetailTOBuyer, str);
                return;
            }
            try {
                NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer2 = this.f21372e;
                MultiServiceDraftTO x12 = nomineeAndInsuranceDetailTOBuyer2.x1();
                String applNo = x12 != null ? x12.getApplNo() : null;
                MultiServiceDraftTO x13 = this.f21372e.x1();
                ChanngeOfAdressDto channgeOfAdressDto = x13 != null ? x13.getChanngeOfAdressDto() : null;
                MultiServiceDraftTO x14 = this.f21372e.x1();
                Durcdto durcdto = x14 != null ? x14.getDurcdto() : null;
                MultiServiceDraftTO x15 = this.f21372e.x1();
                HpaDto hpaDto = x15 != null ? x15.getHpaDto() : null;
                MultiServiceDraftTO x16 = this.f21372e.x1();
                HptDto hptDto = x16 != null ? x16.getHptDto() : null;
                MultiServiceDraftTO x17 = this.f21372e.x1();
                Integer valueOf = x17 != null ? Integer.valueOf(x17.getOfficeCode()) : null;
                cm.l.c(valueOf);
                int intValue = valueOf.intValue();
                MultiServiceDraftTO x18 = this.f21372e.x1();
                String openDate = x18 != null ? x18.getOpenDate() : null;
                ArrayList C1 = this.f21372e.C1();
                cm.l.c(C1);
                MultiServiceDraftTO x19 = this.f21372e.x1();
                String regnNo = x19 != null ? x19.getRegnNo() : null;
                MultiServiceDraftTO x110 = this.f21372e.x1();
                String stateCode = x110 != null ? x110.getStateCode() : null;
                MultiServiceDraftTO x111 = this.f21372e.x1();
                nomineeAndInsuranceDetailTOBuyer2.W1(new MultiServiceDraft(applNo, channgeOfAdressDto, durcdto, hpaDto, hptDto, intValue, openDate, C1, regnNo, stateCode, x111 != null ? x111.getTransferOwnershipDto() : null));
                Intent intent = new Intent(this.f21372e, VahanMultiServiceConfirmationScreen.class);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, VContant.Companion.h(this.f21372e.C1()));
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this.f21372e.y1());
                intent.putExtra("RcDetails", this.f21372e.A1());
                MultiServiceDraftTO x112 = this.f21372e.x1();
                if (!(x112 == null || (transferOwnershipDto = x112.getTransferOwnershipDto()) == null)) {
                    str = transferOwnershipDto.getAuthMode();
                }
                if (p.o(str, "A", true)) {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                } else {
                    intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                }
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21372e.t1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21372e.s1());
                this.f21372e.startActivity(intent);
                this.f21372e.finishAffinity();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SellerResponse) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21373a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21373a = lVar;
        }

        public final pl.c a() {
            return this.f21373a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21373a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void H1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        Intent intent = new Intent(nomineeAndInsuranceDetailTOBuyer, VahanVehicleDetailsService.class);
        intent.putExtra("RC", nomineeAndInsuranceDetailTOBuyer.A1().getRc_regn_no());
        intent.putExtra("RcDetails", nomineeAndInsuranceDetailTOBuyer.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, nomineeAndInsuranceDetailTOBuyer.U);
        intent.putExtra(VContant.NEXGEN_addahar_name, nomineeAndInsuranceDetailTOBuyer.R);
        intent.putExtra(VContant.NEXGEN_addahar_address, nomineeAndInsuranceDetailTOBuyer.S);
        nomineeAndInsuranceDetailTOBuyer.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        nomineeAndInsuranceDetailTOBuyer.finish();
    }

    /* access modifiers changed from: private */
    public static final void J1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        nomineeAndInsuranceDetailTOBuyer.J.set(1, i10);
        nomineeAndInsuranceDetailTOBuyer.J.set(2, i11);
        nomineeAndInsuranceDetailTOBuyer.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetailTOBuyer.U1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetailTOBuyer.u1().f28834m.setText(nomineeAndInsuranceDetailTOBuyer.v1());
    }

    /* access modifiers changed from: private */
    public static final void K1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerinsuranceUpto");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetailTOBuyer, onDateSetListener, nomineeAndInsuranceDetailTOBuyer.J.get(1), nomineeAndInsuranceDetailTOBuyer.J.get(2), nomineeAndInsuranceDetailTOBuyer.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void L1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, CompoundButton compoundButton, boolean z10) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        if (z10) {
            nomineeAndInsuranceDetailTOBuyer.u1().f28825d.setChecked(false);
            nomineeAndInsuranceDetailTOBuyer.u1().f28826e.setChecked(true);
            nomineeAndInsuranceDetailTOBuyer.u1().f28841t.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, CompoundButton compoundButton, boolean z10) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        if (z10) {
            nomineeAndInsuranceDetailTOBuyer.u1().f28825d.setChecked(true);
            nomineeAndInsuranceDetailTOBuyer.u1().f28826e.setChecked(false);
            nomineeAndInsuranceDetailTOBuyer.u1().f28841t.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer r48, android.view.View r49) {
        /*
            r0 = r48
            java.lang.String r1 = "this$0"
            cm.l.f(r0, r1)
            ni.u6 r1 = r48.u1()
            android.widget.EditText r1 = r1.f28840s
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            r2 = 0
            r3 = 2
            if (r1 >= r3) goto L_0x003f
            ni.u6 r1 = r48.u1()
            android.widget.RadioButton r1 = r1.f28826e
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x003f
            ld.c r1 = r48.w1()
            r3 = 2132019259(0x7f14083b, float:1.9676848E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "to_validation_nomineeName"
        L_0x0032:
            java.lang.String r1 = r1.b(r4, r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L_0x0203
        L_0x003f:
            ni.u6 r1 = r48.u1()
            android.widget.Spinner r1 = r1.f28847z
            int r1 = r1.getSelectedItemPosition()
            if (r1 != 0) goto L_0x0065
            ni.u6 r1 = r48.u1()
            android.widget.RadioButton r1 = r1.f28826e
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0065
            ld.c r1 = r48.w1()
            r3 = 2132019260(0x7f14083c, float:1.967685E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "to_validation_nomineeRelation"
            goto L_0x0032
        L_0x0065:
            ni.u6 r1 = r48.u1()
            android.widget.TextView r1 = r1.f28838q
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            if (r1 >= r3) goto L_0x008f
            ni.u6 r1 = r48.u1()
            android.widget.RadioButton r1 = r1.f28826e
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x008f
            ld.c r1 = r48.w1()
            r3 = 2132019258(0x7f14083a, float:1.9676846E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "to_validation_nomineeDOB"
            goto L_0x0032
        L_0x008f:
            android.app.ProgressDialog r1 = r48.z1()
            r1.show()
            yh.a r1 = new yh.a
            r1.<init>(r0)
            vh.b r1 = r1.a()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r2 = r0.W
            r3 = 0
            if (r2 == 0) goto L_0x00aa
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r2 = r2.getTransferOwnershipDto()
            r4 = r2
            goto L_0x00ab
        L_0x00aa:
            r4 = r3
        L_0x00ab:
            java.lang.String r2 = r1.s()
            boolean r2 = r0.G1(r2)
            if (r2 == 0) goto L_0x0134
            if (r4 == 0) goto L_0x0130
            java.lang.String r8 = r1.c()
            java.lang.String r9 = r1.d()
            java.lang.String r10 = r1.e()
            java.lang.String r2 = r1.f()
            int r11 = java.lang.Integer.parseInt(r2)
            int r12 = r1.g()
            java.lang.String r13 = r1.h()
            java.lang.String r30 = r1.p()
            java.lang.String r31 = r1.q()
            java.lang.String r32 = r1.r()
            java.lang.String r2 = r1.s()
            cm.l.c(r2)
            int r33 = java.lang.Integer.parseInt(r2)
            java.lang.String r35 = r1.u()
            int r34 = r1.t()
            r5 = 0
            r6 = 0
            java.lang.String r7 = " "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x0114:
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = -2113929725(0xffffffff81fffe03, float:-9.4036695E-38)
            r46 = 127(0x7f, float:1.78E-43)
            r47 = 0
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r1 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x0131
        L_0x0130:
            r1 = r3
        L_0x0131:
            r19 = r1
            goto L_0x018b
        L_0x0134:
            if (r4 == 0) goto L_0x0130
            java.lang.String r8 = r1.c()
            java.lang.String r9 = r1.d()
            java.lang.String r10 = r1.e()
            java.lang.String r2 = r1.f()
            int r11 = java.lang.Integer.parseInt(r2)
            int r12 = r1.g()
            java.lang.String r13 = r1.h()
            java.lang.String r30 = r1.p()
            java.lang.String r31 = r1.q()
            java.lang.String r32 = r1.r()
            java.lang.String r35 = r1.u()
            int r34 = r1.t()
            r5 = 0
            r6 = 0
            java.lang.String r7 = " "
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r33 = 0
            goto L_0x0114
        L_0x018b:
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r1 = r0.W
            if (r1 == 0) goto L_0x0194
            java.util.ArrayList r1 = r1.getPurposeCode()
            goto L_0x0195
        L_0x0194:
            r1 = r3
        L_0x0195:
            java.util.ArrayList r2 = r0.V
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r4 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            java.util.ArrayList r2 = r4.j(r2)
            if (r1 == 0) goto L_0x01a2
            r1.addAll(r2)
        L_0x01a2:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r1)
            java.util.ArrayList r1 = r0.Y
            if (r1 == 0) goto L_0x01ae
            r1.clear()
        L_0x01ae:
            java.util.ArrayList r1 = r0.Y
            if (r1 == 0) goto L_0x01b5
            r1.addAll(r2)
        L_0x01b5:
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r4 = r0.W
            if (r4 == 0) goto L_0x01f0
            java.util.ArrayList r15 = r0.Y
            cm.l.c(r15)
            if (r19 == 0) goto L_0x01c6
            java.lang.String r1 = r19.getAuthMode()
            r6 = r1
            goto L_0x01c7
        L_0x01c6:
            r6 = r3
        L_0x01c7:
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r48.A1()
            java.lang.String r16 = r1.getRc_regn_no()
            if (r19 == 0) goto L_0x01d5
            java.lang.String r3 = r19.getMobileNo()
        L_0x01d5:
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 46069(0xb3f5, float:6.4556E-41)
            r22 = 0
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r3 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01f0:
            i7.d r1 = new i7.d
            r1.<init>()
            java.lang.String r1 = r1.t(r3)
            mh.a r0 = r48.D1()
            cm.l.c(r1)
            r0.i(r1)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer.N1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.NomineeAndInsuranceDetailTOBuyer, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void O1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        nomineeAndInsuranceDetailTOBuyer.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void P1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        nomineeAndInsuranceDetailTOBuyer.J.set(1, i10);
        nomineeAndInsuranceDetailTOBuyer.J.set(2, i11);
        nomineeAndInsuranceDetailTOBuyer.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetailTOBuyer.U1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetailTOBuyer.u1().f28838q.setText(nomineeAndInsuranceDetailTOBuyer.v1());
    }

    /* access modifiers changed from: private */
    public static final void Q1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetailTOBuyer, onDateSetListener, nomineeAndInsuranceDetailTOBuyer.J.get(1), nomineeAndInsuranceDetailTOBuyer.J.get(2), nomineeAndInsuranceDetailTOBuyer.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void R1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        nomineeAndInsuranceDetailTOBuyer.J.set(1, i10);
        nomineeAndInsuranceDetailTOBuyer.J.set(2, i11);
        nomineeAndInsuranceDetailTOBuyer.J.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", nomineeAndInsuranceDetailTOBuyer.J.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        nomineeAndInsuranceDetailTOBuyer.U1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        nomineeAndInsuranceDetailTOBuyer.u1().f28831j.setText(nomineeAndInsuranceDetailTOBuyer.v1());
    }

    /* access modifiers changed from: private */
    public static final void S1(NomineeAndInsuranceDetailTOBuyer nomineeAndInsuranceDetailTOBuyer, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(nomineeAndInsuranceDetailTOBuyer, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerinsuranceFrom");
        DatePickerDialog datePickerDialog = new DatePickerDialog(nomineeAndInsuranceDetailTOBuyer, onDateSetListener, nomineeAndInsuranceDetailTOBuyer.J.get(1), nomineeAndInsuranceDetailTOBuyer.J.get(2), nomineeAndInsuranceDetailTOBuyer.J.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.T;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final TOCommonService B1() {
        TOCommonService tOCommonService = this.M;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ArrayList C1() {
        return this.Y;
    }

    public final mh.a D1() {
        mh.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("toSaveToDraftViewModel");
        return null;
    }

    public final TOSaveToDraftServiceBuyerAadhar E1() {
        TOSaveToDraftServiceBuyerAadhar tOSaveToDraftServiceBuyerAadhar = this.I;
        if (tOSaveToDraftServiceBuyerAadhar != null) {
            return tOSaveToDraftServiceBuyerAadhar;
        }
        cm.l.v("tosavetodraftService");
        return null;
    }

    public final qh.a F1() {
        qh.a aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean G1(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void T1(u6 u6Var) {
        cm.l.f(u6Var, "<set-?>");
        this.G = u6Var;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void V1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void W1(MultiServiceDraft multiServiceDraft) {
        this.X = multiServiceDraft;
    }

    public final void X1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void Z1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.T = nrvDetails;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void b2(TOCommonService tOCommonService) {
        cm.l.f(tOCommonService, "<set-?>");
        this.M = tOCommonService;
    }

    public final void c2(mh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void d2(TOSaveToDraftServiceBuyerAadhar tOSaveToDraftServiceBuyerAadhar) {
        cm.l.f(tOSaveToDraftServiceBuyerAadhar, "<set-?>");
        this.I = tOSaveToDraftServiceBuyerAadhar;
    }

    public final void e2(qh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.L = aVar;
    }

    public final void f2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
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
        ((TextView) findViewById).setText(str);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new q0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u6 c10 = u6.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        T1(c10);
        setContentView((View) u1().b());
        V1(new ld.c(this));
        v9.e.f17509a.V1(this, u1());
        V1(new ld.c(this));
        if (new ld.h(this).b()) {
            u1().f28846y.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.U;
        LinearLayout linearLayout = u1().f28846y.f27159b;
        cm.l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        b2(TOCommonService.f21425a.b(this));
        d2(TOSaveToDraftServiceBuyerAadhar.f21416a.b(this));
        X1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.R = String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name));
        this.S = String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Z1((NrvDetails) serializableExtra);
        this.U = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.W = (MultiServiceDraftTO) serializableExtra2;
        this.V = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        u1().D.f28308i.setText(String.valueOf(w1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        u1().D.f28304e.setVisibility(0);
        u1().D.f28304e.setText(A1().getRc_regn_no());
        SpannableString spannableString = new SpannableString(A1().getRc_regn_no());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        u1().D.f28304e.setText(spannableString);
        u1().D.f28304e.setOnClickListener(new n0(this));
        Y1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        e2((qh.a) new u0((x0) this, (u0.b) new oh.b(new oh.a(B1()))).a(qh.a.class));
        c2((mh.a) new u0((x0) this, (u0.b) new nh.a(new nh.b(E1()))).a(mh.a.class));
        try {
            z1().show();
            F1().g();
        } catch (Exception unused) {
        }
        u1().D.f28305f.setOnClickListener(new t0(this));
        F1().i().g(this, new f(new b(this)));
        F1().h().g(this, new f(new c(this)));
        u1().f28826e.setOnCheckedChangeListener(new dh.u0(this));
        u1().f28825d.setOnCheckedChangeListener(new v0(this));
        u1().f28847z.setOnItemSelectedListener(new d(this));
        u1().C.setOnClickListener(new w0(this));
        D1().h().g(this, new f(new e(this)));
        D1().g().g(this, new f(new a(this)));
        u1().f28844w.setOnClickListener(new dh.x0(this));
        u1().f28838q.setOnClickListener(new z0(this, new y0(this)));
        u1().f28831j.setOnClickListener(new p0(this, new o0(this)));
        u1().f28834m.setOnClickListener(new s0(this, new r0(this)));
    }

    public final String s1() {
        return this.S;
    }

    public final String t1() {
        return this.R;
    }

    public final u6 u1() {
        u6 u6Var = this.G;
        if (u6Var != null) {
            return u6Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final String v1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c w1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final MultiServiceDraftTO x1() {
        return this.W;
    }

    public final MultiServiceDraft y1() {
        return this.X;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
