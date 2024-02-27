package kb;

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
import com.nic.mparivahan.FetchChallanLog.PojoChallan.MparEchallanLog;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.ChallantransactionDetails;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ld.c;
import v9.f;

public final class e extends RecyclerView.h {

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f13174d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f13175e;

    /* renamed from: f  reason: collision with root package name */
    private final lb.a f13176f;

    public static final class a extends RecyclerView.d0 {
        private final ImageView A;

        /* renamed from: y  reason: collision with root package name */
        private final TextView f13177y;

        /* renamed from: z  reason: collision with root package name */
        private final TextView f13178z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.f(view, "ItemView");
            View findViewById = this.f3622e.findViewById(R.id.challan_number);
            l.e(findViewById, "findViewById(...)");
            this.f13177y = (TextView) findViewById;
            View findViewById2 = this.f3622e.findViewById(R.id.chlln_status);
            l.e(findViewById2, "findViewById(...)");
            this.f13178z = (TextView) findViewById2;
            View findViewById3 = this.f3622e.findViewById(R.id.option_menu);
            l.e(findViewById3, "findViewById(...)");
            this.A = (ImageView) findViewById3;
        }

        public final TextView O() {
            return this.f13177y;
        }

        public final TextView P() {
            return this.f13178z;
        }

        public final ImageView Q() {
            return this.A;
        }
    }

    public e(ArrayList arrayList, Context context, lb.a aVar) {
        l.f(arrayList, "mList");
        l.f(context, "mContext");
        l.f(aVar, "mDltChllnTransaction");
        this.f13174d = arrayList;
        this.f13175e = context;
        this.f13176f = aVar;
    }

    /* access modifiers changed from: private */
    public static final void F(e eVar, a aVar, c cVar, MparEchallanLog mparEchallanLog, int i10, View view) {
        l.f(eVar, "this$0");
        l.f(aVar, "$holder");
        l.f(cVar, "$langSession");
        l.f(mparEchallanLog, "$mModel");
        PopupMenu popupMenu = new PopupMenu(eVar.f13175e, aVar.Q());
        popupMenu.inflate(R.menu.menu_transaction);
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.menu2);
        l.e(findItem, "findItem(...)");
        MenuItem findItem2 = popupMenu.getMenu().findItem(R.id.view);
        l.e(findItem2, "findItem(...)");
        MenuItem findItem3 = popupMenu.getMenu().findItem(R.id.menu4);
        l.e(findItem3, "findItem(...)");
        findItem.setTitle(cVar.b("share", "Share"));
        findItem2.setTitle(cVar.b("label_view", "View"));
        findItem3.setTitle(cVar.b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new b(eVar, mparEchallanLog, aVar, cVar, i10));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public static final boolean G(e eVar, MparEchallanLog mparEchallanLog, a aVar, c cVar, int i10, MenuItem menuItem) {
        l.f(eVar, "this$0");
        l.f(mparEchallanLog, "$mModel");
        l.f(aVar, "$holder");
        l.f(cVar, "$langSession");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu2) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", mparEchallanLog.getEchlogDocType() + "\nChallan No. : " + aVar.O().getText() + "\nChallan Date : " + mparEchallanLog.getEchlogChallanDate() + "\nReceipt No. : " + mparEchallanLog.getEchlogReceiptNo() + "\nPayment Date : " + mparEchallanLog.getEchlogPaymentDate() + "\nChallan Status : " + aVar.P().getText() + "\nAmount : " + mparEchallanLog.getChallanAmt());
                intent.setType("text/plain");
                eVar.f13175e.startActivity(Intent.createChooser(intent, "Share"));
            } catch (Exception unused) {
            }
        } else if (itemId == R.id.menu4) {
            s sVar = new s();
            sVar.f20232e = mparEchallanLog.getEchlogRecordId();
            Context context = eVar.f13175e;
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
        } else if (itemId == R.id.view) {
            Intent intent2 = new Intent(eVar.f13175e, ChallantransactionDetails.class);
            intent2.putExtra("echlogchallannumber", mparEchallanLog.getEchlogchallannumber());
            intent2.putExtra("echlogDocNumber", mparEchallanLog.getEchlogDocNumber());
            intent2.putExtra("echlogStateCd", mparEchallanLog.getEchlogStateCd());
            intent2.putExtra("echlogChallanDate", mparEchallanLog.getEchlogChallanDate());
            intent2.putExtra("challanAmt", mparEchallanLog.getChallanAmt());
            intent2.putExtra("echlogChallanStatus", mparEchallanLog.getEchlogChallanStatus());
            intent2.putExtra("echlogPaymentDate", mparEchallanLog.getEchlogPaymentDate());
            intent2.putExtra("echlogTransId", mparEchallanLog.getEchlogTransId());
            intent2.putExtra("echlogReceiptNo", mparEchallanLog.getEchlogReceiptNo());
            intent2.putExtra("doctype", mparEchallanLog.getEchlogDocType());
            eVar.f13175e.startActivity(intent2);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void H(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void I(Dialog dialog, e eVar, s sVar, int i10, View view) {
        l.f(dialog, "$d");
        l.f(eVar, "this$0");
        l.f(sVar, "$recordId");
        dialog.dismiss();
        eVar.f13176f.V(Long.valueOf((long) sVar.f20232e), i10);
    }

    /* renamed from: E */
    public void p(a aVar, int i10) {
        TextView P;
        String str;
        l.f(aVar, "holder");
        c cVar = new c(this.f13175e);
        Object obj = this.f13174d.get(i10);
        l.e(obj, "get(...)");
        MparEchallanLog mparEchallanLog = (MparEchallanLog) obj;
        aVar.O().setText(mparEchallanLog.getEchlogchallannumber());
        if (p.o(mparEchallanLog.getEchlogChallanStatus(), "disposed", true)) {
            P = aVar.P();
            str = cVar.b("tab_btn_challan_disposed", mparEchallanLog.getEchlogChallanStatus().toString());
        } else {
            P = aVar.P();
            str = mparEchallanLog.getEchlogChallanStatus().toString();
        }
        P.setText(str);
        aVar.Q().setOnClickListener(new a(this, aVar, cVar, mparEchallanLog, i10));
    }

    /* renamed from: J */
    public a r(ViewGroup viewGroup, int i10) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fetch_chlln_transactions, viewGroup, false);
        l.c(inflate);
        return new a(inflate);
    }

    public final void K(int i10) {
        this.f13174d.remove(i10);
        n(i10);
        m(i10, this.f13174d.size());
    }

    public int e() {
        return this.f13174d.size();
    }
}
