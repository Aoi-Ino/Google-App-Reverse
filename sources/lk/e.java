package lk;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.s;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.DrivingLicenceTransactionDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.SarathiLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ld.c;
import v9.f;

public final class e extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f24914d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f24915e;

    /* renamed from: f  reason: collision with root package name */
    private final mk.a f24916f;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final LinearLayout F;
        private final TextView G;
        private final TextView H;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f24917y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f24918z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vahan_number);
            l.e(findViewById, "findViewById(...)");
            this.f24917y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.vahan_app_no);
            l.e(findViewById2, "findViewById(...)");
            this.f24918z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.vahan_app_date);
            l.e(findViewById3, "findViewById(...)");
            this.A = (TextView) findViewById3;
            View findViewById4 = this.f3622e.findViewById(R.id.vahan_rcpt_no);
            l.e(findViewById4, "findViewById(...)");
            this.B = (TextView) findViewById4;
            View findViewById5 = this.f3622e.findViewById(R.id.vahan_amount);
            l.e(findViewById5, "findViewById(...)");
            this.C = (TextView) findViewById5;
            View findViewById6 = this.f3622e.findViewById(R.id.vahan_rcp_date);
            l.e(findViewById6, "findViewById(...)");
            this.D = (TextView) findViewById6;
            View findViewById7 = this.f3622e.findViewById(R.id.vahan_rcp_tm);
            l.e(findViewById7, "findViewById(...)");
            this.E = (TextView) findViewById7;
            View findViewById8 = this.f3622e.findViewById(R.id.vahan_option_menu);
            l.e(findViewById8, "findViewById(...)");
            this.F = (LinearLayout) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.challan_number);
            l.e(findViewById9, "findViewById(...)");
            this.G = (TextView) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.chlln_status);
            l.e(findViewById10, "findViewById(...)");
            this.H = (TextView) findViewById10;
        }

        public final TextView O() {
            return this.G;
        }

        public final TextView P() {
            return this.H;
        }

        public final LinearLayout Q() {
            return this.F;
        }

        public final TextView R() {
            return this.C;
        }

        public final TextView S() {
            return this.A;
        }

        public final TextView T() {
            return this.f24918z;
        }

        public final TextView U() {
            return this.f24917y;
        }

        public final TextView V() {
            return this.D;
        }

        public final TextView W() {
            return this.E;
        }

        public final TextView X() {
            return this.B;
        }
    }

    public e(ArrayList arrayList, Context context, mk.a aVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(aVar, "mDltSarInterface");
        this.f24914d = arrayList;
        this.f24915e = context;
        this.f24916f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void G(e eVar, a aVar, c cVar, SarathiLog sarathiLog, int i10, View view) {
        l.f(eVar, "this$0");
        l.f(aVar, "$holder");
        l.f(cVar, "$langSession");
        l.f(sarathiLog, "$mModel");
        PopupMenu popupMenu = new PopupMenu(eVar.f24915e, aVar.Q());
        popupMenu.inflate(R.menu.menu_sar_tran);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.status);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.view);
        l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem3, "findItem(...)");
        MenuItem findItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        l.e(findItem4, "findItem(...)");
        findItem.setTitle(cVar.b("btn_challan_status", "Status"));
        findItem2.setTitle(cVar.b("label_view", "View"));
        findItem3.setTitle(cVar.b("label_share", "Share"));
        findItem4.setTitle(cVar.b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new b(eVar, aVar, sarathiLog, cVar, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean H(e eVar, a aVar, SarathiLog sarathiLog, c cVar, int i10, MenuItem menuItem) {
        String str;
        l.f(eVar, "this$0");
        l.f(aVar, "$holder");
        l.f(sarathiLog, "$mModel");
        l.f(cVar, "$langSession");
        switch (menuItem.getItemId()) {
            case R.id.menu2:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", aVar.U().getText() + "\nApplication No. : " + aVar.T().getText() + "\nApplication Date : " + aVar.S().getText() + "\nTransaction Name : " + aVar.W().getText());
                intent.setType("text/plain");
                eVar.f24915e.startActivity(Intent.createChooser(intent, "Share"));
                break;
            case R.id.menu4:
                s sVar = new s();
                sVar.f20232e = sarathiLog.getSarlogRecordId();
                Context context = eVar.f24915e;
                l.c(context);
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.confirmation_dialog);
                Window window = dialog.getWindow();
                l.c(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View findViewById = dialog.findViewById(R.id.pop_up_msg);
                l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
                l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
                l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) findViewById3;
                View findViewById4 = dialog.findViewById(R.id.tv_title);
                l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
                ((TextView) findViewById).setText(cVar.b(f.f17510a.z0(), "Are you sure, You want to delete ?"));
                textView.setText(cVar.b("radio_dl_serv_yes", "Yes"));
                textView2.setText(cVar.b("radio_dl_serv_no", "No"));
                textView2.setOnClickListener(new c(dialog));
                textView.setOnClickListener(new d(dialog, eVar, sVar, i10));
                dialog.show();
                break;
            case R.id.status:
                Intent intent2 = new Intent(eVar.f24915e, ApplicationDetailsActivity.class);
                intent2.putExtra("app_no", aVar.T().getText());
                intent2.putExtra("dob", sarathiLog.getSarlogDlDob());
                intent2.putExtra("statusAdapter", "1");
                ld.f fVar = new ld.f(eVar.f24915e);
                String b10 = cVar.b("label_application_status", "Application Status");
                l.c(b10);
                fVar.r(b10, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                eVar.f24915e.startActivity(intent2);
                break;
            case R.id.view:
                try {
                    Intent intent3 = new Intent(eVar.f24915e, DrivingLicenceTransactionDetails.class);
                    intent3.putExtra("ApplicationNo", aVar.T().getText());
                    intent3.putExtra("ApplicationDate", aVar.S().getText());
                    intent3.putExtra("ReceiptNo", aVar.X().getText());
                    intent3.putExtra("ReceiptDate", aVar.V().getText());
                    intent3.putExtra("TransactionName", aVar.W().getText());
                    intent3.putExtra("Amount", aVar.R().getText());
                    intent3.putExtra("sarlogDlNumber", sarathiLog.getSarlogDlNumber());
                    String sarlogFeeDate = sarathiLog.getSarlogFeeDate();
                    if (sarlogFeeDate != null) {
                        if (sarlogFeeDate.length() != 0) {
                            str = sarathiLog.getSarlogFeeDate();
                            intent3.putExtra("sarlogFeeDate", str);
                            eVar.f24915e.startActivity(intent3);
                            break;
                        }
                    }
                    str = "NA";
                    intent3.putExtra("sarlogFeeDate", str);
                    eVar.f24915e.startActivity(intent3);
                } catch (Exception unused) {
                    break;
                }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J(Dialog dialog, e eVar, s sVar, int i10, View view) {
        l.f(dialog, "$d");
        l.f(eVar, "this$0");
        l.f(sVar, "$recordId");
        dialog.dismiss();
        eVar.f24916f.D(Integer.valueOf(sVar.f20232e), i10);
    }

    public final String E(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0083 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008b A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a4 A[SYNTHETIC, Splitter:B:16:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b3 A[Catch:{ Exception -> 0x0152 }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(lk.e.a r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "NA"
            java.lang.String r1 = "holder"
            cm.l.f(r10, r1)
            java.util.ArrayList r1 = r9.f24914d     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = "get(...)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0152 }
            r7 = r1
            com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.SarathiLog r7 = (com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.SarathiLog) r7     // Catch:{ Exception -> 0x0152 }
            android.widget.TextView r1 = r10.U()     // Catch:{ Exception -> 0x0152 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0152 }
            r2.<init>()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r3 = "DL No. : "
            r2.append(r3)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r3 = r7.getSarlogDlNumber()     // Catch:{ Exception -> 0x0152 }
            r2.append(r3)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r2)     // Catch:{ Exception -> 0x0152 }
            ld.c r6 = new ld.c     // Catch:{ Exception -> 0x0152 }
            android.content.Context r1 = r9.f24915e     // Catch:{ Exception -> 0x0152 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0152 }
            android.widget.TextView r1 = r10.V()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r7.getSarlogApplDate()     // Catch:{ Exception -> 0x0152 }
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r7.getSarlogApplDate()     // Catch:{ Exception -> 0x0152 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0152 }
            if (r1 != 0) goto L_0x0050
            goto L_0x0060
        L_0x0050:
            android.widget.TextView r1 = r10.S()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = r7.getSarlogApplDate()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = r9.E(r2)     // Catch:{ Exception -> 0x0152 }
            r1.setText(r2)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0067
        L_0x0060:
            android.widget.TextView r1 = r10.S()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0152 }
        L_0x0067:
            android.widget.TextView r1 = r10.T()     // Catch:{ Exception -> 0x0152 }
            long r2 = r7.getSarlogApplNo()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0152 }
            r1.setText(r2)     // Catch:{ Exception -> 0x0152 }
            android.widget.TextView r1 = r10.X()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r1 = r7.getSarlogFeeAmt()     // Catch:{ Exception -> 0x0152 }
            if (r1 != 0) goto L_0x008b
            android.widget.TextView r1 = r10.R()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0152 }
            goto L_0x009a
        L_0x008b:
            android.widget.TextView r1 = r10.R()     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r2 = r7.getSarlogFeeAmt()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r2)     // Catch:{ Exception -> 0x0152 }
        L_0x009a:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r2 = 515(0x203, float:7.22E-43)
            java.lang.String r3 = "check_dl_serv_change_addr"
            if (r1 != r2) goto L_0x00b3
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "Change of Address in DL"
        L_0x00aa:
            java.lang.String r1 = r6.b(r3, r1)     // Catch:{ Exception -> 0x0152 }
        L_0x00ae:
            r0.setText(r1)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0120
        L_0x00b3:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r2 = 516(0x204, float:7.23E-43)
            if (r1 != r2) goto L_0x00c8
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "check_dl_serv_replacement_dl"
            java.lang.String r2 = "Replacement of DL"
        L_0x00c3:
            java.lang.String r1 = r6.b(r1, r2)     // Catch:{ Exception -> 0x0152 }
            goto L_0x00ae
        L_0x00c8:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r2 = 523(0x20b, float:7.33E-43)
            if (r1 != r2) goto L_0x00d9
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "check_dl_serv_extract_dl"
            java.lang.String r2 = "DL Extract"
            goto L_0x00c3
        L_0x00d9:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r2 = 513(0x201, float:7.19E-43)
            if (r1 != r2) goto L_0x00e8
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "Issue of Duplicate DL"
            goto L_0x00aa
        L_0x00e8:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r3 = 514(0x202, float:7.2E-43)
            if (r1 != r3) goto L_0x00f9
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "check_dl_serv_renewal_dl"
            java.lang.String r2 = "Renewal of DL"
            goto L_0x00c3
        L_0x00f9:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            r3 = 525(0x20d, float:7.36E-43)
            if (r1 != r3) goto L_0x010a
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "check_dl_serv_intern_dl_perm"
            java.lang.String r2 = "International Driving Permit"
            goto L_0x00c3
        L_0x010a:
            int r1 = r7.getSarlogPurCd()     // Catch:{ Exception -> 0x0152 }
            if (r1 != r2) goto L_0x0119
            android.widget.TextView r0 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = "check_dl_serv_dupl_dl"
            java.lang.String r2 = "Issue of Dulicate DL"
            goto L_0x00c3
        L_0x0119:
            android.widget.TextView r1 = r10.W()     // Catch:{ Exception -> 0x0152 }
            r1.setText(r0)     // Catch:{ Exception -> 0x0152 }
        L_0x0120:
            android.widget.TextView r0 = r10.O()     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r7.getSarlogDlNumber()     // Catch:{ Exception -> 0x0152 }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0152 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0152 }
            android.widget.TextView r0 = r10.P()     // Catch:{ Exception -> 0x0152 }
            android.widget.TextView r1 = r10.W()     // Catch:{ Exception -> 0x0152 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x0152 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0152 }
            android.widget.LinearLayout r0 = r10.Q()     // Catch:{ Exception -> 0x0152 }
            lk.a r1 = new lk.a     // Catch:{ Exception -> 0x0152 }
            r3 = r1
            r4 = r9
            r5 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0152 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x0152 }
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.e.p(lk.e$a, int):void");
    }

    /* renamed from: K */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fetch_sarathi_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void L(int i10) {
        this.f24914d.remove(i10);
        n(i10);
        m(i10, this.f24914d.size());
    }

    public int e() {
        return this.f24914d.size();
    }
}
