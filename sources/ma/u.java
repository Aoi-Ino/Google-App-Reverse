package ma;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.ui.Home.VehicleServiceSectionView;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadAppoinmentScreen;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadFormHomeScreen;
import com.nic.mparivahan.VahanServices.DownloadAppoinForms.DownloadNocHomeScreen;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DuplicateFitnessCertificateDownload;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanVerifyPendingTransaction;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerBuyerSelectionActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanDownloadReceiptActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
import java.util.ArrayList;
import ld.c;
import ld.h;
import v9.e;

public final class u extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13964d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13965e;

    /* renamed from: f  reason: collision with root package name */
    private String f13966f;

    /* renamed from: g  reason: collision with root package name */
    private String f13967g = "T";

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13968y;

        /* renamed from: z  reason: collision with root package name */
        private final LinearLayout f13969z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.es_sarathi_service_name);
            l.e(findViewById, "findViewById(...)");
            this.f13968y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.layout_es_sarathi);
            l.e(findViewById2, "findViewById(...)");
            this.f13969z = (LinearLayout) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.es_image);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final ImageView O() {
            return this.A;
        }

        public final TextView P() {
            return this.f13968y;
        }

        public final LinearLayout Q() {
            return this.f13969z;
        }
    }

    public u(ArrayList arrayList, Context context, String str) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(str, "State_code");
        this.f13964d = arrayList;
        this.f13965e = context;
        this.f13966f = str;
    }

    /* access modifiers changed from: private */
    public static final void C(int i10, u uVar, Enabledservice enabledservice, View view) {
        l.f(uVar, "this$0");
        l.f(enabledservice, "$mModel");
        if (i10 == 3) {
            Intent intent = new Intent(uVar.f13965e, VehicleServiceSectionView.class);
            intent.putExtra("state_code", uVar.f13966f);
            uVar.f13965e.startActivity(intent);
            return;
        }
        uVar.E(enabledservice.getServCode(), uVar.f13965e, uVar.f13966f);
    }

    /* renamed from: B */
    public void p(a aVar, int i10) {
        l.f(aVar, "holder");
        c cVar = new c(this.f13965e);
        Object obj = this.f13964d.get(i10);
        l.e(obj, "get(...)");
        Enabledservice enabledservice = (Enabledservice) obj;
        aVar.P().setText(e.f17509a.T(this.f13965e, enabledservice.getServCode(), enabledservice.getServName()));
        if (l.a(this.f13967g, "T") && i10 == 3) {
            aVar.P().setText(cVar.b("label_view_more", "View More"));
            enabledservice.setServCode("0");
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.ic_view));
        }
        F(enabledservice.getServCode(), aVar);
        aVar.Q().setOnClickListener(new t(i10, this, enabledservice));
    }

    /* renamed from: D */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.es_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void E(String str, Context context, String str2) {
        Intent intent;
        l.f(str, "service_code");
        l.f(context, "context");
        l.f(str2, "service_name");
        Class<VahanMainViewScreen> cls = VahanMainViewScreen.class;
        if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
            new h(context).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            new h(context).h(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            new h(context).h(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            new h(context).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            new h(context).h(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            new h(context).h(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals(VContant.NOC_PURPOSE_CODE)) {
            new h(context).h(VContant.NOC, VContant.NOC_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals("901")) {
            try {
                Intent intent2 = new Intent(this.f13965e, VahanDownloadReceiptActivity.class);
                intent2.putExtra("service_name", e.f17509a.T(this.f13965e, str, str2));
                this.f13965e.startActivity(intent2);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else if (str.equals("902")) {
            this.f13965e.startActivity(new Intent(this.f13965e, VahanVerifyPendingTransaction.class));
            return;
        } else if (str.equals("903")) {
            Intent intent3 = new Intent(this.f13965e, DownloadFormHomeScreen.class);
            intent3.putExtra("service_name", str2);
            this.f13965e.startActivity(intent3);
            return;
        } else if (str.equals("907")) {
            Intent intent4 = new Intent(this.f13965e, DownloadNocHomeScreen.class);
            intent4.putExtra("service_name", str2);
            this.f13965e.startActivity(intent4);
            return;
        } else if (str.equals("910")) {
            Intent intent5 = new Intent(this.f13965e, DuplicateFitnessCertificateDownload.class);
            intent5.putExtra("service_name", str2);
            this.f13965e.startActivity(intent5);
            return;
        } else if (str.equals(VContant.Tax_PURPOSE_CODE) || str.equals("101")) {
            new h(context).h(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
            intent = new Intent(context, cls);
        } else if (str.equals("906")) {
            new h(context).h(VContant.PAY_TAXASS, VContant.PAY_TAX_ASS_CODE);
            intent = new Intent(context, cls);
        } else {
            if (str.equals("102")) {
                try {
                    NaxpToKenService.f9438k.a(context);
                } catch (Exception unused) {
                }
                intent = new Intent(context, VahanWithdraw.class);
            } else if (str.equals("103")) {
                try {
                    NaxpToKenService.f9438k.a(context);
                } catch (Exception unused2) {
                }
                intent = new Intent(context, VahanApplication.class);
            } else if (str.equals("104")) {
                try {
                    NaxpToKenService.f9438k.a(context);
                } catch (Exception unused3) {
                }
                intent = new Intent(context, VahanUpdateMobiActivity.class);
            } else if (str.equals(VContant.RC_CACELLATION_PURPOSE_CODE)) {
                new h(context).h(VContant.RC_CANCALATION, VContant.RC_CANCELLATION_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.RC_SURRENDER_PURPOSE_CODE)) {
                new h(context).h(VContant.RC_SURRENDER, VContant.RC_SURRENDER_RC_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.RC_RELEASE_PURPOSE_CODE)) {
                new h(context).h(VContant.RC_RELEASE, VContant.RC_RELEASE_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.DUPLICATE_PERMIT_PURPOSE_CODE)) {
                new h(context).h(VContant.DUPLICATE_PERMIT, VContant.DUPLICATE_PERMIT_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE)) {
                new h(context).h(VContant.DUPLICATE_FITNESS, VContant.DUPLICATE_FITNESS_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.TempPermit_PURPOSE_CODE)) {
                new h(context).h(VContant.Temp_Permit, VContant.TEMPERMIT_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.RenewalNpAuthorization_CODE)) {
                new h(context).h(VContant.NP_Permit, VContant.NP_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                new h(context).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
                intent = new Intent(context, SellerBuyerSelectionActivity.class);
            } else if (str.equals(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE)) {
                new h(context).h(VContant.PERMIT_RENEWAL, VContant.PERMIT_RENEWAL_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE)) {
                new h(context).h(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.NOMINEE_PURPOSE_CODE)) {
                new h(context).h(VContant.Nominee_Addition, VContant.Nominee_CODE);
                intent = new Intent(context, NomineeMainViewScreen.class);
            } else if (str.equals(VContant.MISELL_PURPOSE_CODE)) {
                new h(context).h(VContant.MISELL_PAYMENT, VContant.MISELL_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.ALTERATION_PURPOSE_CODE)) {
                new h(context).h(VContant.ALTERATION, VContant.ALTERATION_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals("904")) {
                intent = new Intent(context, DownloadAppoinmentScreen.class);
                intent.putExtra("service_name", str2);
            } else if (str.equals(VContant.UPDATE_MOBILE_PURPOSE_CODE)) {
                new h(context).h(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
                intent = new Intent(context, cls);
            } else if (str.equals(VContant.MULTISERVICE_PURPOSE_CODE)) {
                new h(context).h(VContant.MULTI_SELECT_SERVICE, VContant.MULTI_SELECT_SERVICE_CODE);
                intent = new Intent(context, cls);
            } else {
                return;
            }
            context.startActivity(intent);
        }
        intent.putExtra("state_code", this.f13966f);
        context.startActivity(intent);
    }

    public final void F(String str, a aVar) {
        ImageView O;
        Resources resources;
        int i10;
        Drawable drawable;
        l.f(str, "service_code");
        l.f(aVar, "holder");
        if (str.equals(VContant.DUPLICATE_RC_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.duplicate_rc));
        }
        if (str.equals(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
        }
        if (str.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.addition));
        }
        if (str.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.term));
        }
        if (str.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.ic_con));
        }
        if (str.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.rc_partucalar));
        }
        if (str.equals(VContant.NOC_PURPOSE_CODE)) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.duplicate_rc));
        }
        if (str.equals(VContant.Tax_PURPOSE_CODE) || str.equals("101")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.bill));
        }
        if (str.equals("102")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.vahan_dispose));
        }
        if (str.equals("103")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.vahan_app_status));
        }
        if (str.equals("104")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.smartphone));
        }
        if (str.equals("901")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.print_rece));
        }
        if (str.equals("902")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.vahan_verify_payment));
        }
        if (str.equals("903")) {
            aVar.O().setImageDrawable(this.f13965e.getResources().getDrawable(R.drawable.downloadforms));
        }
        if (str.equals("904")) {
            O = aVar.O();
            resources = this.f13965e.getResources();
            i10 = R.drawable.ackslip;
        } else {
            boolean equals = str.equals(VContant.RC_CACELLATION_PURPOSE_CODE);
            int i11 = R.drawable.rc_release;
            if (!equals && !str.equals(VContant.RC_SURRENDER_PURPOSE_CODE) && !str.equals(VContant.RC_RELEASE_PURPOSE_CODE)) {
                if (str.equals(VContant.DUPLICATE_PERMIT_PURPOSE_CODE)) {
                    O = aVar.O();
                    resources = this.f13965e.getResources();
                    i10 = R.drawable.duplicatepermit;
                } else if (str.equals(VContant.DUPLICATE_FITNESS_PURPOSE_CODE)) {
                    O = aVar.O();
                    resources = this.f13965e.getResources();
                    i10 = R.drawable.duplicatefitness;
                } else {
                    boolean equals2 = str.equals(VContant.TempPermit_PURPOSE_CODE);
                    i11 = R.drawable.renewalpermit;
                    if (!equals2 && !str.equals(VContant.RenewalNpAuthorization_CODE)) {
                        if (str.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                            O = aVar.O();
                            resources = this.f13965e.getResources();
                            i10 = R.drawable.transferofowner;
                        } else if (str.equals(VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE)) {
                            O = aVar.O();
                            resources = this.f13965e.getResources();
                            i10 = R.drawable.permit_renewal;
                        } else {
                            boolean equals3 = str.equals(VContant.VAHAN_COMPOUNDFEE_PURPOSE_CODE);
                            i11 = R.drawable.hand;
                            if (!equals3) {
                                if (str.equals(VContant.NOMINEE_PURPOSE_CODE)) {
                                    O = aVar.O();
                                    resources = this.f13965e.getResources();
                                    i10 = R.drawable.nominee;
                                } else if (!str.equals(VContant.MISELL_PURPOSE_CODE)) {
                                    if (str.equals(VContant.ALTERATION_PURPOSE_CODE)) {
                                        O = aVar.O();
                                        resources = this.f13965e.getResources();
                                        i10 = R.drawable.altration;
                                    } else if (str.equals("906")) {
                                        O = aVar.O();
                                        resources = this.f13965e.getResources();
                                        i10 = R.drawable.tax_assasment;
                                    } else if (str.equals("907")) {
                                        O = aVar.O();
                                        resources = this.f13965e.getResources();
                                        i10 = R.drawable.download_noc;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            O = aVar.O();
            drawable = this.f13965e.getResources().getDrawable(i11);
            O.setImageDrawable(drawable);
        }
        drawable = resources.getDrawable(i10);
        O.setImageDrawable(drawable);
    }

    public int e() {
        if (this.f13964d.size() > 3) {
            this.f13967g = "T";
            return 4;
        }
        this.f13967g = "F";
        return this.f13964d.size();
    }
}
