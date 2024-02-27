package nb;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.l;
import cm.s;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.VehicleTransactionDetails;
import com.nic.mparivahan.FetchVahanLog.Pojo.VahanLog;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ld.c;
import v9.f;

public final class g extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f14236d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f14237e;

    /* renamed from: f  reason: collision with root package name */
    private final mb.a f14238f;

    public static final class a extends RecyclerView.d0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final TextView D;
        private final TextView E;
        private final ImageView F;
        private final TextView G;
        private final TextView H;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f14239y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f14240z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.vahan_number);
            l.e(findViewById, "findViewById(...)");
            this.f14239y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.vahan_app_no);
            l.e(findViewById2, "findViewById(...)");
            this.f14240z = (TextView) findViewById2;
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
            this.F = (ImageView) findViewById8;
            View findViewById9 = this.f3622e.findViewById(R.id.vehiclenumner);
            l.e(findViewById9, "findViewById(...)");
            this.G = (TextView) findViewById9;
            View findViewById10 = this.f3622e.findViewById(R.id.issue);
            l.e(findViewById10, "findViewById(...)");
            this.H = (TextView) findViewById10;
        }

        public final TextView O() {
            return this.H;
        }

        public final ImageView P() {
            return this.F;
        }

        public final TextView Q() {
            return this.C;
        }

        public final TextView R() {
            return this.A;
        }

        public final TextView S() {
            return this.f14240z;
        }

        public final TextView T() {
            return this.f14239y;
        }

        public final TextView U() {
            return this.D;
        }

        public final TextView V() {
            return this.E;
        }

        public final TextView W() {
            return this.B;
        }

        public final TextView X() {
            return this.G;
        }
    }

    public g(ArrayList arrayList, Context context, mb.a aVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(aVar, "mDltVhnTrans");
        this.f14236d = arrayList;
        this.f14237e = context;
        this.f14238f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void G(g gVar, a aVar, c cVar, VahanLog vahanLog, int i10, View view) {
        l.f(gVar, "this$0");
        l.f(aVar, "$holder");
        l.f(cVar, "$langSession");
        l.f(vahanLog, "$mModel");
        PopupMenu popupMenu = new PopupMenu(gVar.f14237e, aVar.P());
        popupMenu.inflate(R.menu.vahan_log_menu);
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
        popupMenu.setOnMenuItemClickListener(new d(gVar, vahanLog, aVar, cVar, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean H(g gVar, VahanLog vahanLog, a aVar, c cVar, int i10, MenuItem menuItem) {
        l.f(gVar, "this$0");
        l.f(vahanLog, "$mModel");
        l.f(aVar, "$holder");
        l.f(cVar, "$langSession");
        switch (menuItem.getItemId()) {
            case R.id.menu2 /*2131363613*/:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", aVar.T().getText() + "\nApplication No. : " + aVar.S().getText() + "\nApplication Date : " + aVar.R().getText() + "\nReceipt No. : " + aVar.W().getText() + "\nReceipt Date : " + aVar.U().getText() + "\nTransaction Name : " + aVar.V().getText() + "\nAmount : " + aVar.Q().getText());
                intent.setType("text/plain");
                gVar.f14237e.startActivity(Intent.createChooser(intent, "Share"));
                break;
            case R.id.menu4 /*2131363615*/:
                s sVar = new s();
                sVar.f20232e = vahanLog.getVahlogRecordId();
                Context context = gVar.f14237e;
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
                ((TextView) findViewById).setText(cVar.b(f.f17510a.z0(), "Are you sure, You want to delete ?"));
                textView.setText(cVar.b("radio_dl_serv_yes", "Yes"));
                textView2.setText(cVar.b("radio_dl_serv_no", "No"));
                ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
                textView2.setOnClickListener(new e(dialog));
                textView.setOnClickListener(new f(dialog, gVar, sVar, i10));
                dialog.show();
                break;
            case R.id.status /*2131364681*/:
                mb.a aVar2 = gVar.f14238f;
                String str = vahanLog.getVahlogApplNo().toString();
                String substring = vahanLog.getVahlogApplNo().toString().substring(0, 2);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                aVar2.U(str, substring);
                break;
            case R.id.view /*2131365668*/:
                Intent intent2 = new Intent(gVar.f14237e, VehicleTransactionDetails.class);
                intent2.putExtra("vehicleno", vahanLog.getVahlogRcNumber());
                intent2.putExtra("ApplicationNo", vahanLog.getVahlogApplNo());
                intent2.putExtra("ApplicationDate", aVar.R().getText());
                intent2.putExtra("ReceiptNo", aVar.W().getText());
                intent2.putExtra("ReceiptDate", aVar.U().getText());
                intent2.putExtra("TransactionName", aVar.V().getText());
                intent2.putExtra("Amount", aVar.Q().getText());
                gVar.f14237e.startActivity(intent2);
                break;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void J(Dialog dialog, g gVar, s sVar, int i10, View view) {
        l.f(dialog, "$d");
        l.f(gVar, "this$0");
        l.f(sVar, "$recordId");
        dialog.dismiss();
        gVar.f14238f.A(Integer.valueOf(sVar.f20232e), i10);
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

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006e A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0100 A[Catch:{ Exception -> 0x01a7 }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(nb.g.a r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            cm.l.f(r9, r0)
            java.util.ArrayList r0 = r8.f14236d     // Catch:{ Exception -> 0x01a7 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "get(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x01a7 }
            r6 = r0
            com.nic.mparivahan.FetchVahanLog.Pojo.VahanLog r6 = (com.nic.mparivahan.FetchVahanLog.Pojo.VahanLog) r6     // Catch:{ Exception -> 0x01a7 }
            ld.c r5 = new ld.c     // Catch:{ Exception -> 0x01a7 }
            android.content.Context r0 = r8.f14237e     // Catch:{ Exception -> 0x01a7 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r0 = r9.T()     // Catch:{ Exception -> 0x01a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
            r1.<init>()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = "Vehicle No. : "
            r1.append(r2)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogRcNumber()     // Catch:{ Exception -> 0x01a7 }
            r1.append(r2)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r6.getVahlogReptDate()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "NA"
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r6.getVahlogReptDate()     // Catch:{ Exception -> 0x01a7 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0051
            goto L_0x0061
        L_0x0051:
            android.widget.TextView r0 = r9.U()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogReptDate()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r8.E(r2)     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r2)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0068
        L_0x0061:
            android.widget.TextView r0 = r9.U()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
        L_0x0068:
            java.lang.String r0 = r6.getVahlogApplDate()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r6.getVahlogApplDate()     // Catch:{ Exception -> 0x01a7 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0081
            goto L_0x0091
        L_0x0081:
            android.widget.TextView r0 = r9.R()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogApplDate()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r8.E(r2)     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r2)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0098
        L_0x0091:
            android.widget.TextView r0 = r9.R()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
        L_0x0098:
            android.widget.TextView r0 = r9.S()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogRcNumber()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r2)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r6.getVahlogReptNo()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = r6.getVahlogReptNo()     // Catch:{ Exception -> 0x01a7 }
            java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x00bc
            goto L_0x00c8
        L_0x00bc:
            android.widget.TextView r0 = r9.W()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogReptNo()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r2)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x00cf
        L_0x00c8:
            android.widget.TextView r0 = r9.W()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
        L_0x00cf:
            java.lang.String r0 = r6.getVahlogFeeAmt()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x00dd
            android.widget.TextView r0 = r9.Q()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x00e8
        L_0x00dd:
            android.widget.TextView r0 = r9.Q()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r6.getVahlogFeeAmt()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x00e8:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 3
            if (r0 != r2) goto L_0x0100
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "issue_of_duplicate_rc"
            java.lang.String r2 = "Issue of Duplicate RC"
        L_0x00f7:
            java.lang.String r1 = r5.b(r1, r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x00fb:
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0179
        L_0x0100:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 4
            if (r0 != r2) goto L_0x0110
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "change_of_address_in_rc2"
            java.lang.String r2 = "Change of Address in RC"
            goto L_0x00f7
        L_0x0110:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 6
            if (r0 != r2) goto L_0x0120
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "hypothecation_addition"
            java.lang.String r2 = "Hypothecation Addition"
            goto L_0x00f7
        L_0x0120:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 7
            if (r0 != r2) goto L_0x0130
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "hypothecation_termination"
            java.lang.String r2 = "Hypothecation Termination"
            goto L_0x00f7
        L_0x0130:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 8
            if (r0 != r2) goto L_0x0141
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "hypothecation_continuation"
            java.lang.String r2 = "Hypothecation Continuation"
            goto L_0x00f7
        L_0x0141:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 9
            if (r0 != r2) goto L_0x0152
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "issue_of_noc"
            java.lang.String r2 = "Issue of NOC"
            goto L_0x00f7
        L_0x0152:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 13
            if (r0 != r2) goto L_0x0163
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "rc_perticular"
            java.lang.String r2 = "RC Particulars"
            goto L_0x00f7
        L_0x0163:
            int r0 = r6.getVahlogPurCd()     // Catch:{ Exception -> 0x01a7 }
            r2 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto L_0x0174
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = "label_dispose_applicationl"
            java.lang.String r2 = "Dispose Application"
            goto L_0x00f7
        L_0x0174:
            android.widget.TextView r0 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x00fb
        L_0x0179:
            android.widget.TextView r0 = r9.X()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = r6.getVahlogRcNumber()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r0 = r9.O()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r1 = r9.V()     // Catch:{ Exception -> 0x01a7 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01a7 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01a7 }
            android.widget.ImageView r0 = r9.P()     // Catch:{ Exception -> 0x01a7 }
            nb.c r1 = new nb.c     // Catch:{ Exception -> 0x01a7 }
            r2 = r1
            r3 = r8
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01a7 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x01a7 }
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.g.p(nb.g$a, int):void");
    }

    /* renamed from: K */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vahan_log_adapter, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void L(int i10) {
        this.f14236d.remove(i10);
        n(i10);
        m(i10, this.f14236d.size());
    }

    public int e() {
        return this.f14236d.size();
    }
}
