package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import ld.c;
import ni.y9;
import og.b0;
import pg.g;
import tg.f;
import tg.i;
import tg.j;
import tg.k;
import tg.m;
import tg.n;
import tg.o;
import tg.p;
import tg.q;
import tg.r;
import tg.s;
import tg.t;
import v9.e;

public final class ChangeOfAddressMultiService extends d {
    public String G;
    public NrvDetails H;
    public y9 I;
    public h J;
    public VahanProService K;
    public ProgressDialog L;
    private Calendar M = Calendar.getInstance();
    private String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    private boolean S;
    public c T;
    private ArrayList U = new ArrayList();
    private MultiServiceDraft V;
    private MultiServiceDraft W;
    public MultiSelectionViewModel X;
    public MultiService Y;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressMultiService f21074e;

        a(ChangeOfAddressMultiService changeOfAddressMultiService) {
            this.f21074e = changeOfAddressMultiService;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21074e.E1().K.getSelectedItemPosition() != 0) {
                this.f21074e.J1().show();
                Object selectedItem = this.f21074e.E1().K.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21074e.O1().h1(this.f21074e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressMultiService f21075e;

        b(ChangeOfAddressMultiService changeOfAddressMultiService) {
            this.f21075e = changeOfAddressMultiService;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21075e.E1().E.getSelectedItemPosition() != 0) {
                this.f21075e.J1().show();
                Object selectedItem = this.f21075e.E1().E.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21075e.O1().i1(this.f21075e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(Dialog dialog, ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        l.f(dialog, "$d");
        l.f(changeOfAddressMultiService, "this$0");
        dialog.dismiss();
        changeOfAddressMultiService.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Q1(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        l.f(changeOfAddressMultiService, "this$0");
        try {
            g.f30363a.e(changeOfAddressMultiService, changeOfAddressMultiService.U);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void R1(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        l.f(changeOfAddressMultiService, "this$0");
        Intent intent = new Intent(changeOfAddressMultiService, VahanVehicleDetailsService.class);
        intent.putExtra("RC", changeOfAddressMultiService.K1());
        intent.putExtra("RcDetails", changeOfAddressMultiService.L1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, changeOfAddressMultiService.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, changeOfAddressMultiService.D1());
        intent.putExtra(VContant.NEXGEN_addahar_address, changeOfAddressMultiService.C1());
        changeOfAddressMultiService.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void S1(ChangeOfAddressMultiService changeOfAddressMultiService, String str) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T1(ChangeOfAddressMultiService changeOfAddressMultiService, DistictModle distictModle) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            changeOfAddressMultiService.E1().D.setAdapter(new og.g(changeOfAddressMultiService, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(ChangeOfAddressMultiService changeOfAddressMultiService, String str) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void V1(ChangeOfAddressMultiService changeOfAddressMultiService, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.M.set(1, i10);
        changeOfAddressMultiService.M.set(2, i11);
        changeOfAddressMultiService.M.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", changeOfAddressMultiService.M.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", changeOfAddressMultiService.M.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", changeOfAddressMultiService.M.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        changeOfAddressMultiService.m2(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        changeOfAddressMultiService.E1().R.setText(simpleDateFormat.format(changeOfAddressMultiService.M.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void W1(ChangeOfAddressMultiService changeOfAddressMultiService, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(changeOfAddressMultiService, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(changeOfAddressMultiService, onDateSetListener, changeOfAddressMultiService.M.get(1), changeOfAddressMultiService.M.get(2), changeOfAddressMultiService.M.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void X1(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        String str;
        String str2;
        Toast makeText;
        ChangeOfAddressMultiService changeOfAddressMultiService2 = changeOfAddressMultiService;
        l.f(changeOfAddressMultiService2, "this$0");
        String obj = changeOfAddressMultiService.E1().f29532g.getText().toString();
        String obj2 = changeOfAddressMultiService.E1().f29533h.getText().toString();
        String obj3 = changeOfAddressMultiService.E1().f29535j.getText().toString();
        String obj4 = changeOfAddressMultiService.E1().f29534i.getText().toString();
        String obj5 = changeOfAddressMultiService.E1().f29550y.getText().toString();
        String obj6 = changeOfAddressMultiService.E1().f29551z.getText().toString();
        String obj7 = changeOfAddressMultiService.E1().B.getText().toString();
        String obj8 = changeOfAddressMultiService.E1().A.getText().toString();
        if (changeOfAddressMultiService.E1().R.getText().length() < 2) {
            str2 = "Please select the date";
        } else {
            if (obj.length() >= 2) {
                if (obj3.length() >= 3) {
                    if (obj2.length() >= 3) {
                        if (changeOfAddressMultiService.E1().K.getSelectedItemPosition() == 0) {
                            str2 = "Please select the new current address state";
                        } else if (changeOfAddressMultiService.E1().f29531f.getSelectedItemPosition() == 0) {
                            str2 = "Please select the new current address district";
                        } else {
                            if (obj4.length() >= 6) {
                                if (obj5.length() >= 3) {
                                    if (obj6.length() >= 3) {
                                        if (obj7.length() >= 3) {
                                            if (changeOfAddressMultiService.E1().E.getSelectedItemPosition() == 0) {
                                                str2 = "Please select the new permanent address state";
                                            } else if (changeOfAddressMultiService.E1().D.getSelectedItemPosition() == 0) {
                                                str2 = "Please select the new permanent address district";
                                            } else if (obj8.length() >= 6) {
                                                try {
                                                    Object selectedItem = changeOfAddressMultiService.E1().K.getSelectedItem();
                                                    l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                                                    Object selectedItem2 = changeOfAddressMultiService.E1().E.getSelectedItem();
                                                    l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                                                    Object selectedItem3 = changeOfAddressMultiService.E1().f29531f.getSelectedItem();
                                                    l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                                                    Object selectedItem4 = changeOfAddressMultiService.E1().D.getSelectedItem();
                                                    l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                                                    int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
                                                    int parseInt = Integer.parseInt(obj4);
                                                    String str3 = ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString();
                                                    String F1 = changeOfAddressMultiService.F1();
                                                    String rc_off_cd = changeOfAddressMultiService.L1().getRc_off_cd();
                                                    l.c(rc_off_cd);
                                                    ChanngeOfAdressDto channgeOfAdressDto = new ChanngeOfAdressDto(40005, 40005, "", obj, obj3, obj2, dist_cd, parseInt, str3, "", 3, F1, "", Integer.parseInt(rc_off_cd), "", obj5, obj7, obj6, ((DistictModleItem) selectedItem4).getDist_cd(), Integer.parseInt(obj4), ((String) ((VahanStateModleSubList) selectedItem2).get(0)).toString(), Integer.parseInt(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE), changeOfAddressMultiService.K1(), String.valueOf(changeOfAddressMultiService.L1().getState_cd()), changeOfAddressMultiService.I1());
                                                    MultiServiceDraft multiServiceDraft = changeOfAddressMultiService2.V;
                                                    l.c(multiServiceDraft);
                                                    changeOfAddressMultiService2.W = MultiServiceDraft.copy$default(multiServiceDraft, (String) null, channgeOfAdressDto, (Durcdto) null, (HpaDto) null, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2045, (Object) null);
                                                    VContant.Companion companion = VContant.Companion;
                                                    if (p.o(companion.r(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, changeOfAddressMultiService2.U), VContant.REDIRECT, true)) {
                                                        changeOfAddressMultiService.J1().show();
                                                        MultiSelectionViewModel P1 = changeOfAddressMultiService.P1();
                                                        MultiServiceDraft multiServiceDraft2 = changeOfAddressMultiService2.W;
                                                        l.c(multiServiceDraft2);
                                                        P1.v(multiServiceDraft2);
                                                        return;
                                                    }
                                                    Intent intent = new Intent();
                                                    if (companion.u(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, changeOfAddressMultiService2.U)) {
                                                        str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.r(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, changeOfAddressMultiService2.U);
                                                    } else {
                                                        str = "com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.r(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, changeOfAddressMultiService2.U);
                                                    }
                                                    intent.setClass(changeOfAddressMultiService2, Class.forName(str));
                                                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, changeOfAddressMultiService2.U);
                                                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, changeOfAddressMultiService2.W);
                                                    intent.putExtra("RC", changeOfAddressMultiService.K1());
                                                    intent.putExtra("RcDetails", changeOfAddressMultiService.L1());
                                                    intent.putExtra("off_code", changeOfAddressMultiService.I1());
                                                    intent.putExtra(VContant.NEXGEN_isFACELESS, changeOfAddressMultiService2.S);
                                                    intent.putExtra(VContant.NEXGEN_addahar_name, changeOfAddressMultiService.D1());
                                                    intent.putExtra(VContant.NEXGEN_addahar_address, changeOfAddressMultiService.C1());
                                                    changeOfAddressMultiService2.startActivity(intent);
                                                    changeOfAddressMultiService.finish();
                                                    return;
                                                } catch (Exception unused) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            makeText = Toast.makeText(changeOfAddressMultiService2, "Please enter the valid PinCode", 0);
                            makeText.show();
                        }
                    }
                    makeText = Toast.makeText(changeOfAddressMultiService2, "Please enter the valid landmark", 0);
                    makeText.show();
                }
                makeText = Toast.makeText(changeOfAddressMultiService2, "Please enter the Village/Town/City", 0);
                makeText.show();
            }
            makeText = Toast.makeText(changeOfAddressMultiService2, "Please enter the valid house no", 0);
            makeText.show();
        }
        makeText = Toast.makeText(changeOfAddressMultiService2, str2, 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(ChangeOfAddressMultiService changeOfAddressMultiService, DraftResponse draftResponse) {
        ChangeOfAddressMultiService changeOfAddressMultiService2 = changeOfAddressMultiService;
        l.f(changeOfAddressMultiService2, "this$0");
        changeOfAddressMultiService.J1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage != null && apiMessage.getStatusCode() == 200) {
            Data data = draftResponse.getData();
            MultiServiceDraft multiServiceDraft = null;
            String valueOf = String.valueOf(data != null ? data.getApplNo() : null);
            Data data2 = draftResponse.getData();
            if (data2 != null) {
                data2.getTransferOwnershipDto();
            }
            Data data3 = draftResponse.getData();
            ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
            Data data4 = draftResponse.getData();
            HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
            Data data5 = draftResponse.getData();
            HptDto hptDto = data5 != null ? data5.getHptDto() : null;
            Data data6 = draftResponse.getData();
            Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
            MultiServiceDraft multiServiceDraft2 = changeOfAddressMultiService2.V;
            if (multiServiceDraft2 != null) {
                multiServiceDraft = MultiServiceDraft.copy$default(multiServiceDraft2, valueOf, channgeOfAdressDto, durcdto, hpaDto, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2016, (Object) null);
            }
            Intent intent = new Intent(changeOfAddressMultiService2, VahanMultiServiceConfirmationScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, changeOfAddressMultiService2.U);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
            intent.putExtra("RcDetails", changeOfAddressMultiService.L1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, changeOfAddressMultiService2.S);
            intent.putExtra(VContant.NEXGEN_addahar_name, changeOfAddressMultiService.D1());
            intent.putExtra(VContant.NEXGEN_addahar_address, changeOfAddressMultiService.C1());
            changeOfAddressMultiService2.startActivity(intent);
            changeOfAddressMultiService.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void Z1(ChangeOfAddressMultiService changeOfAddressMultiService, String str) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
        VContant.Companion.K(changeOfAddressMultiService, str);
    }

    /* access modifiers changed from: private */
    public static final void a2(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.z1(changeOfAddressMultiService, changeOfAddressMultiService.G1().b("are_you_sure_you_want_to_leave", changeOfAddressMultiService.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void b2(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.i2();
    }

    /* access modifiers changed from: private */
    public static final void c2(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        ImageView imageView;
        int i10;
        l.f(changeOfAddressMultiService, "this$0");
        if (changeOfAddressMultiService.E1().f29529d.getVisibility() == 0) {
            changeOfAddressMultiService.E1().f29529d.setVisibility(8);
            imageView = changeOfAddressMultiService.E1().f29538m;
            i10 = R.drawable.ic_arrow_down;
        } else {
            changeOfAddressMultiService.E1().f29529d.setVisibility(0);
            imageView = changeOfAddressMultiService.E1().f29538m;
            i10 = R.drawable.ic_arrow_up;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void d2(ChangeOfAddressMultiService changeOfAddressMultiService, View view) {
        ImageView imageView;
        int i10;
        l.f(changeOfAddressMultiService, "this$0");
        if (changeOfAddressMultiService.E1().f29547v.getVisibility() == 0) {
            changeOfAddressMultiService.E1().f29547v.setVisibility(8);
            imageView = changeOfAddressMultiService.E1().f29539n;
            i10 = R.drawable.ic_arrow_down;
        } else {
            changeOfAddressMultiService.E1().f29547v.setVisibility(0);
            imageView = changeOfAddressMultiService.E1().f29539n;
            i10 = R.drawable.ic_arrow_up;
        }
        imageView.setImageResource(i10);
    }

    /* access modifiers changed from: private */
    public static final void e2(ChangeOfAddressMultiService changeOfAddressMultiService, CompoundButton compoundButton, boolean z10) {
        l.f(changeOfAddressMultiService, "this$0");
        if (z10) {
            String obj = changeOfAddressMultiService.E1().f29532g.getText().toString();
            String obj2 = changeOfAddressMultiService.E1().f29533h.getText().toString();
            String obj3 = changeOfAddressMultiService.E1().f29535j.getText().toString();
            String obj4 = changeOfAddressMultiService.E1().f29534i.getText().toString();
            if (!(obj == null || obj.length() == 0)) {
                changeOfAddressMultiService.E1().f29550y.setText(obj);
            }
            if (!(obj2 == null || obj2.length() == 0)) {
                changeOfAddressMultiService.E1().f29551z.setText(obj2);
            }
            if (!(obj3 == null || obj3.length() == 0)) {
                changeOfAddressMultiService.E1().B.setText(obj3);
            }
            if (!(obj4 == null || obj4.length() == 0)) {
                changeOfAddressMultiService.E1().A.setText(obj4);
            }
            if (changeOfAddressMultiService.E1().f29531f.getSelectedItemPosition() > 0) {
                changeOfAddressMultiService.E1().D.setSelection(changeOfAddressMultiService.E1().f29531f.getSelectedItemPosition());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(ChangeOfAddressMultiService changeOfAddressMultiService, VahanStateModle vahanStateModle) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            changeOfAddressMultiService.E1().K.setAdapter(new b0(changeOfAddressMultiService, vahanStateModle));
            try {
                int N1 = changeOfAddressMultiService.N1(String.valueOf(changeOfAddressMultiService.L1().getState_cd()), vahanStateModle);
                changeOfAddressMultiService.E1().K.setSelection(N1);
                changeOfAddressMultiService.E1().K.setEnabled(false);
                changeOfAddressMultiService.E1().E.setAdapter(new b0(changeOfAddressMultiService, vahanStateModle));
                changeOfAddressMultiService.E1().E.setSelection(N1);
                changeOfAddressMultiService.E1().E.setEnabled(false);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void g2(ChangeOfAddressMultiService changeOfAddressMultiService, String str) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void h2(ChangeOfAddressMultiService changeOfAddressMultiService, DistictModle distictModle) {
        l.f(changeOfAddressMultiService, "this$0");
        changeOfAddressMultiService.J1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            changeOfAddressMultiService.E1().f29531f.setAdapter(new og.g(changeOfAddressMultiService, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void i2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final String C1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String D1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final y9 E1() {
        y9 y9Var = this.I;
        if (y9Var != null) {
            return y9Var;
        }
        l.v("binding");
        return null;
    }

    public final String F1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("formated_date");
        return null;
    }

    public final c G1() {
        c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final MultiService H1() {
        MultiService multiService = this.Y;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String I1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String K1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails L1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.K;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final int N1(String str, VahanStateModle vahanStateModle) {
        l.f(str, "State_code");
        l.f(vahanStateModle, "list");
        Iterator it = vahanStateModle.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (q.B0(((String) vahanStateModleSubList.get(0)).toString()).toString().equals(str)) {
                return vahanStateModle.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final h O1() {
        h hVar = this.J;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final MultiSelectionViewModel P1() {
        MultiSelectionViewModel multiSelectionViewModel = this.X;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModelMulti");
        return null;
    }

    public final void j2(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void l2(y9 y9Var) {
        l.f(y9Var, "<set-?>");
        this.I = y9Var;
    }

    public final void m2(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void n2(c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void o2(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.Y = multiService;
    }

    public void onBackPressed() {
        z1(this, G1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView((int) R.layout.changeofaddress_multi);
        y9 c10 = y9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        l2(c10);
        setContentView((View) E1().b());
        e.f17509a.t2(this, E1());
        n2(new c(this));
        t2(VahanProService.f21196b.b(this));
        q2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        v2((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(M1()))).a(h.class));
        o2(MultiService.f21070a.b(this));
        w2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(H1()))).a(MultiSelectionViewModel.class));
        r2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        s2((NrvDetails) serializableExtra);
        p2(String.valueOf(getIntent().getStringExtra("off_code")));
        k2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        j2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.S = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.V = (MultiServiceDraft) serializableExtra2;
        this.U = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        E1().P.f28304e.setVisibility(0);
        E1().P.f28304e.setText(K1());
        SpannableString spannableString = new SpannableString(K1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        E1().P.f28304e.setText(spannableString);
        ArrayList arrayList = this.U;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            c cVar = new c(this);
            textView = E1().P.f28308i;
            charSequence = cVar.b("vahan_change_of_address", getString(R.string.change_of_address));
        } else {
            SpannableString spannableString2 = new SpannableString(G1().b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            textView = E1().P.f28308i;
            charSequence = spannableString2;
        }
        textView.setText(charSequence);
        E1().P.f28308i.setOnClickListener(new tg.a(this));
        u2(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, this.U);
        if (this.S) {
            E1().I.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.S;
        LinearLayout linearLayout = E1().I.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        n2(new c(this));
        TextView textView2 = E1().T;
        textView2.setText(G1().b("vehicle_no", "Vehicle No.:") + ' ' + K1());
        E1().f29528c.setText(L1().getRc_present_address());
        E1().C.setText(L1().getRc_permanent_address());
        this.N = L1().getState_cd();
        E1().U.setText(G1().b("view_vehicle_details", "View Vehicle Details"));
        E1().U.setPaintFlags(E1().U.getPaintFlags() | 8);
        E1().P.f28304e.setOnClickListener(new t(this));
        E1().P.f28305f.setOnClickListener(new tg.b(this));
        E1().P.f28306g.setOnClickListener(new tg.c(this));
        try {
            J1().show();
            O1().V0(this);
        } catch (Exception unused) {
        }
        E1().f29538m.setOnClickListener(new tg.d(this));
        E1().f29539n.setOnClickListener(new tg.e(this));
        E1().J.setOnCheckedChangeListener(new f(this));
        Spinner spinner = E1().K;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        Spinner spinner2 = E1().E;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new b(this));
        }
        O1().U0().g(this, new tg.g(this));
        O1().W0().g(this, new tg.h(this));
        O1().D().g(this, new i(this));
        O1().E().g(this, new tg.l(this));
        O1().F().g(this, new m(this));
        O1().G().g(this, new n(this));
        E1().R.setOnClickListener(new p(this, new o(this)));
        E1().O.setOnClickListener(new q(this));
        P1().l().g(this, new r(this));
        P1().m().g(this, new s(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        z1(this, G1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void q2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void r2(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void s2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void t2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.K = vahanProService;
    }

    public final void u2(String str, ArrayList arrayList) {
        l.f(str, "purCode");
        try {
            l.c(arrayList);
            int indexOf = arrayList.indexOf(str);
            if (arrayList.size() == 4) {
                E1().N.f29783b.setVisibility(0);
                TextView textView = E1().N.f29785d;
                VContant.Companion companion = VContant.Companion;
                Object obj = arrayList.get(0);
                l.e(obj, "get(...)");
                textView.setText(companion.B(this, (String) obj));
                TextView textView2 = E1().N.f29787f;
                Object obj2 = arrayList.get(1);
                l.e(obj2, "get(...)");
                textView2.setText(companion.B(this, (String) obj2));
                TextView textView3 = E1().N.f29792k;
                Object obj3 = arrayList.get(2);
                l.e(obj3, "get(...)");
                textView3.setText(companion.B(this, (String) obj3));
                TextView textView4 = E1().N.f29795n;
                Object obj4 = arrayList.get(3);
                l.e(obj4, "get(...)");
                textView4.setText(companion.B(this, (String) obj4));
                if (indexOf == 3) {
                    E1().N.f29784c.setChecked(true);
                    E1().N.f29786e.setChecked(true);
                    E1().N.f29789h.setChecked(true);
                    E1().N.f29794m.setChecked(false);
                }
                if (indexOf == 2) {
                    E1().N.f29784c.setChecked(true);
                    E1().N.f29786e.setChecked(true);
                    E1().N.f29789h.setChecked(false);
                    E1().N.f29794m.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 1) {
                    E1().N.f29784c.setChecked(true);
                    E1().N.f29786e.setChecked(false);
                    Drawable e10 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    E1().N.f29789h.setCheckMarkDrawable(e10);
                    E1().N.f29794m.setCheckMarkDrawable(e10);
                }
                if (indexOf == 0) {
                    E1().N.f29784c.setChecked(false);
                    Drawable e11 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    E1().N.f29786e.setCheckMarkDrawable(e11);
                    E1().N.f29789h.setCheckMarkDrawable(e11);
                    E1().N.f29794m.setCheckMarkDrawable(e11);
                }
            }
            if (arrayList.size() == 3) {
                E1().N.f29802u.setVisibility(0);
                TextView textView5 = E1().N.f29807z;
                VContant.Companion companion2 = VContant.Companion;
                Object obj5 = arrayList.get(2);
                l.e(obj5, "get(...)");
                textView5.setText(companion2.B(this, (String) obj5));
                TextView textView6 = E1().N.f29804w;
                Object obj6 = arrayList.get(1);
                l.e(obj6, "get(...)");
                textView6.setText(companion2.B(this, (String) obj6));
                TextView textView7 = E1().N.f29791j;
                Object obj7 = arrayList.get(0);
                l.e(obj7, "get(...)");
                textView7.setText(companion2.B(this, (String) obj7));
                if (indexOf == 2) {
                    E1().N.f29790i.setChecked(true);
                    E1().N.f29803v.setChecked(true);
                    E1().N.f29806y.setChecked(false);
                }
                if (indexOf == 1) {
                    E1().N.f29790i.setChecked(true);
                    E1().N.f29803v.setChecked(false);
                    E1().N.f29806y.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 0) {
                    E1().N.f29790i.setChecked(false);
                    Drawable e12 = androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    E1().N.f29803v.setCheckMarkDrawable(e12);
                    E1().N.f29806y.setCheckMarkDrawable(e12);
                }
            }
            if (arrayList.size() == 2) {
                E1().N.A.setVisibility(0);
                TextView textView8 = E1().N.f29801t;
                VContant.Companion companion3 = VContant.Companion;
                Object obj8 = arrayList.get(1);
                l.e(obj8, "get(...)");
                textView8.setText(companion3.B(this, (String) obj8));
                TextView textView9 = E1().N.f29799r;
                Object obj9 = arrayList.get(0);
                l.e(obj9, "get(...)");
                textView9.setText(companion3.B(this, (String) obj9));
                if (indexOf == 1) {
                    E1().N.f29798q.setChecked(true);
                    E1().N.f29800s.setChecked(false);
                }
                if (indexOf == 0) {
                    E1().N.f29798q.setChecked(false);
                    E1().N.f29800s.setCheckMarkDrawable(androidx.core.content.res.h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public final void v2(h hVar) {
        l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    public final void w2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.X = multiSelectionViewModel;
    }

    public final void z1(Context context, String str) {
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new j(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new k(dialog));
        dialog.show();
    }
}
