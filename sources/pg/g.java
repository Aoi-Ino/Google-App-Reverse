package pg;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.h;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ld.c;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30363a = new a((cm.g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void f(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        /* access modifiers changed from: private */
        public static final void g(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        /* access modifiers changed from: private */
        public static final void i(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        /* access modifiers changed from: private */
        public static final void j(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        public final void e(Context context, ArrayList arrayList) {
            l.f(context, "context");
            u uVar = new u();
            Dialog dialog = new Dialog(context);
            uVar.f20234e = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) uVar.f20234e).setContentView(R.layout.activity_my_custom_alert_diaolg);
            Window window = ((Dialog) uVar.f20234e).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            RecyclerView recyclerView = (RecyclerView) ((Dialog) uVar.f20234e).findViewById(R.id.service_list);
            c cVar = new c(context);
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.rc_service)).setText(cVar.b("rcServices", context.getString(R.string.rc_service)));
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.okbuttontextview)).setText(cVar.b("btn_ok", context.getString(R.string.ok_text)));
            a aVar = new a(context, arrayList);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(aVar);
            ((AppCompatImageView) ((Dialog) uVar.f20234e).findViewById(R.id.btnClose)).setOnClickListener(new e(uVar));
            ((LinearLayout) ((Dialog) uVar.f20234e).findViewById(R.id.okbuttondismiss)).setOnClickListener(new f(uVar));
            ((Dialog) uVar.f20234e).show();
        }

        public final void h(Context context, ArrayList arrayList, h hVar) {
            l.f(context, "context");
            l.f(hVar, "viewModelAddMob");
            u uVar = new u();
            Dialog dialog = new Dialog(context);
            uVar.f20234e = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) uVar.f20234e).setContentView(R.layout.viewdoclist);
            Window window = ((Dialog) uVar.f20234e).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            RecyclerView recyclerView = (RecyclerView) ((Dialog) uVar.f20234e).findViewById(R.id.service_list);
            c cVar = new c(context);
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.rc_service)).setText(cVar.b("rcServices", context.getString(R.string.rc_service)));
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.okbuttontextview)).setText(cVar.b("btn_ok", context.getString(R.string.ok_text)));
            b bVar = new b(context, arrayList);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(bVar);
            ((AppCompatImageView) ((Dialog) uVar.f20234e).findViewById(R.id.btnClose)).setOnClickListener(new c(uVar));
            ((LinearLayout) ((Dialog) uVar.f20234e).findViewById(R.id.okbuttondismiss)).setOnClickListener(new d(uVar));
            ((Dialog) uVar.f20234e).show();
        }
    }
}
