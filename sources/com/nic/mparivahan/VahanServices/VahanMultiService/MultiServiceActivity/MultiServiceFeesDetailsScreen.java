package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.Feelist;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.Fees;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeesResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.FessMultiModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanMultiServicePayment;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.util.ArrayList;
import java.util.List;
import ld.c;
import ni.ac;
import pg.g;
import sg.a;
import tg.a2;
import tg.o1;
import tg.p1;
import tg.q1;
import tg.r1;

public final class MultiServiceFeesDetailsScreen extends d {
    public h G;
    public VahanProService H;
    public ProgressDialog I;
    private ChaangeOfAddressStatus J;
    public ac K;
    public MultiServiceBeforePaymentRequest L;
    private boolean M;
    private String N = "0.0";
    public MultiSelectionViewModel O;
    public MultiService P;
    public String Q;
    public String R;
    public NrvDetails S;
    public c T;
    private ArrayList U = new ArrayList();
    private MultiServiceDraft V;

    /* access modifiers changed from: private */
    public static final void H1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        Intent intent = new Intent(multiServiceFeesDetailsScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", multiServiceFeesDetailsScreen.D1().getRc_regn_no());
        intent.putExtra("RcDetails", multiServiceFeesDetailsScreen.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, multiServiceFeesDetailsScreen.M);
        intent.putExtra(VContant.NEXGEN_addahar_name, multiServiceFeesDetailsScreen.w1());
        intent.putExtra(VContant.NEXGEN_addahar_address, multiServiceFeesDetailsScreen.v1());
        multiServiceFeesDetailsScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        try {
            g.f30363a.e(multiServiceFeesDetailsScreen, multiServiceFeesDetailsScreen.U);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        multiServiceFeesDetailsScreen.Q1();
    }

    /* access modifiers changed from: private */
    public static final void K1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, FeesResponse feesResponse) {
        FessMultiModel fessMultiModel;
        MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen2 = multiServiceFeesDetailsScreen;
        l.f(multiServiceFeesDetailsScreen2, "this$0");
        multiServiceFeesDetailsScreen.B1().dismiss();
        try {
            multiServiceFeesDetailsScreen.x1().f25336l.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            ArrayList<ArrayList<Fees>> feesList = feesResponse.getFeesList();
            Log.e("DATA", String.valueOf(feesList));
            String str = " ";
            l.c(feesList);
            int size = feesList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (feesList.get(i10).size() > 1) {
                    int size2 = feesList.get(i10).size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        } else if (VContant.Companion.F(String.valueOf(((Fees) feesList.get(i10).get(i11)).getPurCd()))) {
                            str = String.valueOf(((Fees) feesList.get(i10).get(i11)).getFeeHeadDescr());
                            break;
                        } else {
                            i11++;
                        }
                    }
                    ArrayList<Fees> arrayList2 = feesList.get(i10);
                    l.e(arrayList2, "get(...)");
                    fessMultiModel = new FessMultiModel(str, arrayList2);
                } else if (!ka.c.f13158a.m(((Fees) feesList.get(i10).get(0)).getServicecharge())) {
                    String servicecharge = ((Fees) feesList.get(i10).get(0)).getServicecharge();
                    Integer valueOf = servicecharge != null ? Integer.valueOf(Integer.parseInt(servicecharge)) : null;
                    l.c(valueOf);
                    if (valueOf.intValue() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(feesList.get(i10));
                        Object obj = feesList.get(i10).get(0);
                        l.e(obj, "get(...)");
                        Fees fees = (Fees) obj;
                        String servicecharge2 = fees.getServicecharge();
                        l.c(servicecharge2);
                        arrayList3.add(Fees.copy$default(fees, Integer.parseInt(servicecharge2), "Service Charge", 0, 0, (String) null, 0, 52, (Object) null));
                        arrayList.add(new FessMultiModel(String.valueOf(((Fees) feesList.get(i10).get(0)).getFeeHeadDescr()), arrayList3));
                    } else {
                        String valueOf2 = String.valueOf(((Fees) feesList.get(i10).get(0)).getFeeHeadDescr());
                        ArrayList<Fees> arrayList4 = feesList.get(i10);
                        l.e(arrayList4, "get(...)");
                        fessMultiModel = new FessMultiModel(valueOf2, arrayList4);
                    }
                } else {
                    String valueOf3 = String.valueOf(((Fees) feesList.get(i10).get(0)).getFeeHeadDescr());
                    ArrayList<Fees> arrayList5 = feesList.get(i10);
                    l.e(arrayList5, "get(...)");
                    fessMultiModel = new FessMultiModel(valueOf3, arrayList5);
                }
                arrayList.add(fessMultiModel);
            }
            multiServiceFeesDetailsScreen.x1().f25344t.setVisibility(0);
            multiServiceFeesDetailsScreen.x1().f25333i.setVisibility(0);
            multiServiceFeesDetailsScreen.x1().B.setText(String.valueOf(feesResponse.getTotalAmount()));
            multiServiceFeesDetailsScreen.x1().f25332h.setAdapter(new a(arrayList, multiServiceFeesDetailsScreen2));
        } catch (Exception e10) {
            e10.printStackTrace();
            multiServiceFeesDetailsScreen.x1().f25336l.setVisibility(8);
            multiServiceFeesDetailsScreen2.e2(multiServiceFeesDetailsScreen2, "Unable to get the fee details, Please try after some time!");
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, String str) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        multiServiceFeesDetailsScreen.B1().dismiss();
        multiServiceFeesDetailsScreen.e2(multiServiceFeesDetailsScreen, "Unable to get the fee details, Please try after some time!");
    }

    /* access modifiers changed from: private */
    public static final void M1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        MultiSelectionViewModel G1;
        MultiServiceBeforePaymentRequest C1;
        MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen2 = multiServiceFeesDetailsScreen;
        l.f(multiServiceFeesDetailsScreen2, "this$0");
        try {
            ld.h hVar = new ld.h(multiServiceFeesDetailsScreen2);
            new ArrayList();
            VContant.Companion companion = VContant.Companion;
            MultiServiceDto multiServiceDto = new MultiServiceDto((ArrayList<ArrayList<com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.Fees>>) null, companion.j(multiServiceFeesDetailsScreen2.U), multiServiceFeesDetailsScreen.D1().getRc_regn_no(), multiServiceFeesDetailsScreen.D1().getState_cd(), 0);
            multiServiceFeesDetailsScreen.B1().show();
            if (multiServiceFeesDetailsScreen2.M) {
                String a10 = hVar.a();
                MultiServiceDraft multiServiceDraft = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft);
                String valueOf = String.valueOf(multiServiceDraft.getApplNo());
                MultiServiceDraft multiServiceDraft2 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft2);
                ChanngeOfAdressDto channgeOfAdressDto = multiServiceDraft2.getChanngeOfAdressDto();
                String valueOf2 = String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_chasi_no());
                MultiServiceDraft multiServiceDraft3 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft3);
                Durcdto durcdto = multiServiceDraft3.getDurcdto();
                MultiServiceDraft multiServiceDraft4 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft4);
                HpaDto hpaDto = multiServiceDraft4.getHpaDto();
                MultiServiceDraft multiServiceDraft5 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft5);
                HptDto hptDto = multiServiceDraft5.getHptDto();
                String rc_off_cd = multiServiceFeesDetailsScreen.D1().getRc_off_cd();
                l.c(rc_off_cd);
                int parseInt = Integer.parseInt(rc_off_cd);
                String m10 = v9.d.f17494a.m();
                ArrayList j10 = companion.j(multiServiceFeesDetailsScreen2.U);
                int parseInt2 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                String valueOf3 = String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_regn_no());
                String valueOf4 = String.valueOf(multiServiceFeesDetailsScreen.D1().getState_cd());
                MultiServiceDraft multiServiceDraft6 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft6);
                TransferOwnershipDto transferOwnershipDto = multiServiceDraft6.getTransferOwnershipDto();
                String rc_vh_class_cd = multiServiceFeesDetailsScreen.D1().getRc_vh_class_cd();
                MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = r3;
                MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest2 = new MultiServiceBeforePaymentRequest(a10, "A", valueOf, true, channgeOfAdressDto, valueOf2, 22, durcdto, (List<Feelist>) null, "", "", false, hpaDto, hptDto, 0, "", 1, "", false, "", multiServiceDto, false, parseInt, m10, "", "", j10, parseInt2, "", "", 0, 0, valueOf3, 0, valueOf4, "", "", "L", transferOwnershipDto, rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null);
                multiServiceFeesDetailsScreen2.X1(multiServiceBeforePaymentRequest);
                G1 = multiServiceFeesDetailsScreen.G1();
                C1 = multiServiceFeesDetailsScreen.C1();
            } else {
                String a11 = hVar.a();
                MultiServiceDraft multiServiceDraft7 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft7);
                String valueOf5 = String.valueOf(multiServiceDraft7.getApplNo());
                MultiServiceDraft multiServiceDraft8 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft8);
                ChanngeOfAdressDto channgeOfAdressDto2 = multiServiceDraft8.getChanngeOfAdressDto();
                String valueOf6 = String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_chasi_no());
                MultiServiceDraft multiServiceDraft9 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft9);
                Durcdto durcdto2 = multiServiceDraft9.getDurcdto();
                MultiServiceDraft multiServiceDraft10 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft10);
                HpaDto hpaDto2 = multiServiceDraft10.getHpaDto();
                MultiServiceDraft multiServiceDraft11 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft11);
                HptDto hptDto2 = multiServiceDraft11.getHptDto();
                String rc_off_cd2 = multiServiceFeesDetailsScreen.D1().getRc_off_cd();
                l.c(rc_off_cd2);
                int parseInt3 = Integer.parseInt(rc_off_cd2);
                String m11 = v9.d.f17494a.m();
                ArrayList j11 = companion.j(multiServiceFeesDetailsScreen2.U);
                int parseInt4 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                String valueOf7 = String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_regn_no());
                String valueOf8 = String.valueOf(multiServiceFeesDetailsScreen.D1().getState_cd());
                MultiServiceDraft multiServiceDraft12 = multiServiceFeesDetailsScreen2.V;
                l.c(multiServiceDraft12);
                TransferOwnershipDto transferOwnershipDto2 = multiServiceDraft12.getTransferOwnershipDto();
                String rc_vh_class_cd2 = multiServiceFeesDetailsScreen.D1().getRc_vh_class_cd();
                MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest3 = r3;
                MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest4 = new MultiServiceBeforePaymentRequest(a11, "M", valueOf5, true, channgeOfAdressDto2, valueOf6, 22, durcdto2, (List<Feelist>) null, "", "", false, hpaDto2, hptDto2, 0, "", 1, "", false, "", multiServiceDto, false, parseInt3, m11, "", "", j11, parseInt4, "", "", 0, 0, valueOf7, 0, valueOf8, "", "", "L", transferOwnershipDto2, rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null);
                multiServiceFeesDetailsScreen2.X1(multiServiceBeforePaymentRequest3);
                G1 = multiServiceFeesDetailsScreen.G1();
                C1 = multiServiceFeesDetailsScreen.C1();
            }
            G1.g(C1);
        } catch (Exception e10) {
            multiServiceFeesDetailsScreen.B1().dismiss();
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, MultiBeforePaymentResponse multiBeforePaymentResponse) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        multiServiceFeesDetailsScreen.B1().dismiss();
        String returnUrl = multiBeforePaymentResponse.getReturnUrl();
        if (returnUrl != null && returnUrl.length() != 0) {
            try {
                Intent intent = new Intent(multiServiceFeesDetailsScreen, VahanMultiServicePayment.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, multiServiceFeesDetailsScreen.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                intent.putExtra(VContant.NEXGEN_isFACELESS, multiServiceFeesDetailsScreen.M);
                intent.putExtra("state_code", multiServiceFeesDetailsScreen.D1().getState_cd());
                intent.putExtra("rc_number", multiServiceFeesDetailsScreen.D1().getRc_regn_no());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.MULTISERVICE_PURPOSE_CODE);
                intent.putExtra("URL", multiBeforePaymentResponse.getReturnUrl());
                intent.putExtra(VContant.FINAL_SUBMIT, multiServiceFeesDetailsScreen.C1());
                intent.putExtra("RC", multiServiceFeesDetailsScreen.D1().getRc_regn_no());
                intent.putExtra("RcDetails", multiServiceFeesDetailsScreen.D1());
                intent.putExtra(VContant.NEXGEN_addahar_name, multiServiceFeesDetailsScreen.w1());
                intent.putExtra(VContant.NEXGEN_addahar_address, multiServiceFeesDetailsScreen.v1());
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, multiServiceFeesDetailsScreen.U);
                multiServiceFeesDetailsScreen.startActivity(intent);
                multiServiceFeesDetailsScreen.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, String str) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        multiServiceFeesDetailsScreen.B1().dismiss();
        if (str.equals("Error")) {
            str = multiServiceFeesDetailsScreen.getString(R.string.service_unavable_please_try);
        }
        multiServiceFeesDetailsScreen.c2(multiServiceFeesDetailsScreen, str);
    }

    /* access modifiers changed from: private */
    public static final void P1(MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, DistictModle distictModle) {
        l.f(multiServiceFeesDetailsScreen, "this$0");
        multiServiceFeesDetailsScreen.B1().dismiss();
        try {
            l.c(distictModle);
            int size = distictModle.size();
            for (int i10 = 0; i10 < size; i10++) {
                String valueOf = String.valueOf(((DistictModleItem) distictModle.get(i10)).getDist_cd());
                ChaangeOfAddressStatus chaangeOfAddressStatus = multiServiceFeesDetailsScreen.J;
                l.c(chaangeOfAddressStatus);
                if (p.o(valueOf, chaangeOfAddressStatus.getC_district().toString(), true)) {
                    StringBuilder sb2 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus2 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus2);
                    sb2.append(chaangeOfAddressStatus2.getC_add1());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus3 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus3);
                    sb2.append(chaangeOfAddressStatus3.getC_add2());
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus4 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus4);
                    sb2.append(chaangeOfAddressStatus4.getC_add3());
                    sb2.append(", ");
                    sb2.append(((DistictModleItem) distictModle.get(i10)).getDescr());
                    sb2.append(", ");
                    VContant.Companion companion = VContant.Companion;
                    sb2.append(companion.k(String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_c_state())));
                    sb2.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus5 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus5);
                    sb2.append(chaangeOfAddressStatus5.getC_pincode());
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    ChaangeOfAddressStatus chaangeOfAddressStatus6 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus6);
                    sb4.append(chaangeOfAddressStatus6.getP_add1());
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus7 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus7);
                    sb4.append(chaangeOfAddressStatus7.getP_add2());
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus8 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus8);
                    sb4.append(chaangeOfAddressStatus8.getP_add3());
                    sb4.append(", ");
                    sb4.append(((DistictModleItem) distictModle.get(i10)).getDescr());
                    sb4.append(", ");
                    sb4.append(companion.k(String.valueOf(multiServiceFeesDetailsScreen.D1().getRc_c_state())));
                    sb4.append(", ");
                    ChaangeOfAddressStatus chaangeOfAddressStatus9 = multiServiceFeesDetailsScreen.J;
                    l.c(chaangeOfAddressStatus9);
                    sb4.append(chaangeOfAddressStatus9.getP_pincode());
                    String sb5 = sb4.toString();
                    multiServiceFeesDetailsScreen.x1().f25327c.setText(sb3.toString());
                    multiServiceFeesDetailsScreen.x1().f25339o.setText(sb5.toString());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            StringBuilder sb6 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus10 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus10);
            sb6.append(chaangeOfAddressStatus10.getC_add1());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus11 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus11);
            sb6.append(chaangeOfAddressStatus11.getC_add2());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus12 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus12);
            sb6.append(chaangeOfAddressStatus12.getC_add3());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus13 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus13);
            sb6.append(chaangeOfAddressStatus13.getC_district());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus14 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus14);
            sb6.append(chaangeOfAddressStatus14.getC_state());
            sb6.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus15 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus15);
            sb6.append(chaangeOfAddressStatus15.getC_pincode());
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            ChaangeOfAddressStatus chaangeOfAddressStatus16 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus16);
            sb8.append(chaangeOfAddressStatus16.getP_add1());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus17 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus17);
            sb8.append(chaangeOfAddressStatus17.getP_add2());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus18 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus18);
            sb8.append(chaangeOfAddressStatus18.getP_add3());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus19 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus19);
            sb8.append(chaangeOfAddressStatus19.getP_district());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus20 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus20);
            sb8.append(chaangeOfAddressStatus20.getP_state());
            sb8.append(", ");
            ChaangeOfAddressStatus chaangeOfAddressStatus21 = multiServiceFeesDetailsScreen.J;
            l.c(chaangeOfAddressStatus21);
            sb8.append(chaangeOfAddressStatus21.getP_pincode());
            String sb9 = sb8.toString();
            multiServiceFeesDetailsScreen.x1().f25327c.setText(sb7.toString());
            multiServiceFeesDetailsScreen.x1().f25339o.setText(sb9.toString());
        }
    }

    private final void Q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(Dialog dialog, MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(dialog, "$d");
        l.f(multiServiceFeesDetailsScreen, "this$0");
        dialog.dismiss();
        multiServiceFeesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void f2(Dialog dialog, MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(dialog, "$dialog");
        l.f(multiServiceFeesDetailsScreen, "this$0");
        dialog.dismiss();
        multiServiceFeesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, MultiServiceFeesDetailsScreen multiServiceFeesDetailsScreen, View view) {
        l.f(dialog, "$d");
        l.f(multiServiceFeesDetailsScreen, "this$0");
        dialog.dismiss();
        multiServiceFeesDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        l.c(arrayList);
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                l.e(obj, "get(...)");
                arrayList2.add(VContant.Companion.A(this, (String) obj));
            }
        }
        return y.d0(arrayList2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null);
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final MultiServiceBeforePaymentRequest C1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.L;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        l.v("paymentRequest");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.S;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService E1() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h F1() {
        h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final MultiSelectionViewModel G1() {
        MultiSelectionViewModel multiSelectionViewModel = this.O;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModelMulti");
        return null;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void T1(ac acVar) {
        l.f(acVar, "<set-?>");
        this.K = acVar;
    }

    public final void U1(c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void V1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.P = multiService;
    }

    public final void W1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void X1(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        l.f(multiServiceBeforePaymentRequest, "<set-?>");
        this.L = multiServiceBeforePaymentRequest;
    }

    public final void Y1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.S = nrvDetails;
    }

    public final void Z1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final void a2(h hVar) {
        l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final void b2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.O = multiSelectionViewModel;
    }

    public final void c2(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new r1(dialog, this));
        dialog.show();
    }

    public final void e2(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new q1(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        s1(this, y1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 2131558908(0x7f0d01fc, float:1.8743145E38)
            r4.setContentView((int) r5)
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            ni.ac r5 = ni.ac.c(r5)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r5, r0)
            r4.T1(r5)
            ni.ac r5 = r4.x1()
            android.widget.LinearLayout r5 = r5.b()
            r4.setContentView((android.view.View) r5)
            v9.e$a r5 = v9.e.f17509a
            ni.ac r0 = r4.x1()
            r5.P0(r4, r0)
            ld.c r5 = new ld.c
            r5.<init>(r4)
            r4.U1(r5)
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r5 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r5 = r5.b(r4)
            r4.Z1(r5)
            android.app.ProgressDialog r5 = new android.app.ProgressDialog
            r5.<init>(r4)
            r4.W1(r5)
            android.app.ProgressDialog r5 = r4.B1()
            java.lang.String r0 = "Please wait..."
            r5.setMessage(r0)
            android.app.ProgressDialog r5 = r4.B1()
            r0 = 0
            r5.setCancelable(r0)
            android.app.ProgressDialog r5 = r4.B1()
            r5.setCanceledOnTouchOutside(r0)
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            bi.g r1 = new bi.g
            wg.d r2 = new wg.d
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r3 = r4.E1()
            r2.<init>(r3)
            r1.<init>(r2)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<bi.h> r1 = bi.h.class
            androidx.lifecycle.t0 r5 = r5.a(r1)
            bi.h r5 = (bi.h) r5
            r4.a2(r5)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService$a r5 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiService.f21070a
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r5 = r5.b(r4)
            r4.V1(r5)
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            com.nic.mparivahan.VahanServices.VahanMultiService.d r1 = new com.nic.mparivahan.VahanServices.VahanMultiService.d
            com.nic.mparivahan.VahanServices.VahanMultiService.b r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.b
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r3 = r4.z1()
            r2.<init>(r3)
            r1.<init>(r2)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel> r1 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel.class
            androidx.lifecycle.t0 r5 = r5.a(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = (com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel) r5
            r4.b2(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "MULTIDRAFT"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft"
            cm.l.d(r5, r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft r5 = (com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft) r5
            r4.V = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "MULTIARRAY"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.U = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "Face_Less_Staus"
            boolean r5 = r5.getBooleanExtra(r1, r0)
            r4.M = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "aadhaarName"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.S1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "aadhaarAddress"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.R1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "RcDetails"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r5, r1)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r5
            r4.Y1(r5)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            r5.<init>(r4)
            ni.ac r1 = r4.x1()
            androidx.recyclerview.widget.RecyclerView r1 = r1.f25332h
            r1.setLayoutManager(r5)
            ni.ac r5 = r4.x1()
            androidx.recyclerview.widget.RecyclerView r5 = r5.f25332h
            r1 = 1
            r5.setHasFixedSize(r1)
            ni.ac r5 = r4.x1()
            ni.qd r5 = r5.f25350z
            android.widget.TextView r5 = r5.f28304e
            r5.setVisibility(r0)
            android.text.SpannableString r5 = new android.text.SpannableString
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r2 = r4.D1()
            java.lang.String r2 = r2.getRc_regn_no()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.<init>(r2)
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            int r3 = r5.length()
            r5.setSpan(r2, r0, r3, r0)
            ni.ac r2 = r4.x1()
            ni.qd r2 = r2.f25350z
            android.widget.TextView r2 = r2.f28304e
            r2.setText(r5)
            java.util.ArrayList r5 = r4.U
            if (r5 == 0) goto L_0x016b
            java.lang.String r2 = "5"
            boolean r5 = r5.contains(r2)
            if (r5 != r1) goto L_0x016b
            ni.ac r5 = r4.x1()
            ni.qd r5 = r5.f25350z
            android.widget.TextView r5 = r5.f28308i
            java.lang.String r0 = "Transfer of OwnerShip \n(Buyer)"
        L_0x0167:
            r5.setText(r0)
            goto L_0x01b3
        L_0x016b:
            java.util.ArrayList r5 = r4.U
            cm.l.c(r5)
            int r5 = r5.size()
            if (r5 <= r1) goto L_0x01a4
            android.text.SpannableString r5 = new android.text.SpannableString
            ld.c r1 = r4.y1()
            r2 = 2132018902(0x7f1406d6, float:1.9676124E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "rcServices"
            java.lang.String r1 = r1.b(r3, r2)
            r5.<init>(r1)
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r2 = r5.length()
            r5.setSpan(r1, r0, r2, r0)
            ni.ac r0 = r4.x1()
            ni.qd r0 = r0.f25350z
            android.widget.TextView r0 = r0.f28308i
            r0.setText(r5)
            goto L_0x01b3
        L_0x01a4:
            ni.ac r5 = r4.x1()
            ni.qd r5 = r5.f25350z
            android.widget.TextView r5 = r5.f28308i
            java.util.ArrayList r0 = r4.U
            java.lang.String r0 = r4.A1(r0)
            goto L_0x0167
        L_0x01b3:
            boolean r5 = r4.M
            if (r5 == 0) goto L_0x01c4
            ni.ac r5 = r4.x1()
            ni.gb r5 = r5.f25343s
            android.widget.LinearLayout r5 = r5.f26532e
            r0 = 1077936128(0x40400000, float:3.0)
            r5.setWeightSum(r0)
        L_0x01c4:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r5 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            boolean r0 = r4.M
            ni.ac r1 = r4.x1()
            ni.gb r1 = r1.f25343s
            android.widget.LinearLayout r1 = r1.f26529b
            java.lang.String r2 = "appMent"
            cm.l.e(r1, r2)
            r5.J(r0, r1)
            ni.ac r5 = r4.x1()     // Catch:{ Exception -> 0x020e }
            android.widget.TextView r5 = r5.H     // Catch:{ Exception -> 0x020e }
            ni.ac r0 = r4.x1()     // Catch:{ Exception -> 0x020e }
            android.widget.TextView r0 = r0.H     // Catch:{ Exception -> 0x020e }
            int r0 = r0.getPaintFlags()     // Catch:{ Exception -> 0x020e }
            r0 = r0 | 8
            r5.setPaintFlags(r0)     // Catch:{ Exception -> 0x020e }
            ni.ac r5 = r4.x1()     // Catch:{ Exception -> 0x020e }
            ni.qd r5 = r5.f25350z     // Catch:{ Exception -> 0x020e }
            android.widget.TextView r5 = r5.f28304e     // Catch:{ Exception -> 0x020e }
            tg.s1 r0 = new tg.s1     // Catch:{ Exception -> 0x020e }
            r0.<init>(r4)     // Catch:{ Exception -> 0x020e }
            r5.setOnClickListener(r0)     // Catch:{ Exception -> 0x020e }
            ni.ac r5 = r4.x1()     // Catch:{ Exception -> 0x020e }
            ni.qd r5 = r5.f25350z     // Catch:{ Exception -> 0x020e }
            android.widget.TextView r5 = r5.f28308i     // Catch:{ Exception -> 0x020e }
            tg.t1 r0 = new tg.t1     // Catch:{ Exception -> 0x020e }
            r0.<init>(r4)     // Catch:{ Exception -> 0x020e }
            r5.setOnClickListener(r0)     // Catch:{ Exception -> 0x020e }
            goto L_0x0212
        L_0x020e:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0212:
            ni.ac r5 = r4.x1()
            ni.qd r5 = r5.f25350z
            android.widget.RelativeLayout r5 = r5.f28306g
            tg.u1 r0 = new tg.u1
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            android.app.ProgressDialog r5 = r4.B1()
            r5.show()
            com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeeRequest r5 = new com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeeRequest
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r0 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            java.util.ArrayList r1 = r4.U
            java.util.ArrayList r0 = r0.j(r1)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r4.D1()
            java.lang.String r1 = r1.getRc_regn_no()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r2 = r4.D1()
            java.lang.String r2 = r2.getState_cd()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.<init>(r0, r1, r2)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r4.G1()
            r0.r(r5)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.G1()
            androidx.lifecycle.a0 r5 = r5.h()
            tg.v1 r0 = new tg.v1
            r0.<init>(r4)
            r5.g(r4, r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.G1()
            androidx.lifecycle.a0 r5 = r5.i()
            tg.w1 r0 = new tg.w1
            r0.<init>(r4)
            r5.g(r4, r0)
            ni.ac r5 = r4.x1()
            android.widget.TextView r5 = r5.f25349y
            tg.x1 r0 = new tg.x1
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.G1()
            androidx.lifecycle.a0 r5 = r5.p()
            tg.y1 r0 = new tg.y1
            r0.<init>(r4)
            r5.g(r4, r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.G1()
            androidx.lifecycle.a0 r5 = r5.q()
            tg.z1 r0 = new tg.z1
            r0.<init>(r4)
            r5.g(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.MultiServiceFeesDetailsScreen.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        s1(this, y1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        F1().F().g(this, new o1(this));
    }

    public final void s1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        c cVar = new c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new a2(dialog, this));
        textView2.setOnClickListener(new p1(dialog));
        dialog.show();
    }

    public final String v1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String w1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final ac x1() {
        ac acVar = this.K;
        if (acVar != null) {
            return acVar;
        }
        l.v("binding");
        return null;
    }

    public final c y1() {
        c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final MultiService z1() {
        MultiService multiService = this.P;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }
}
