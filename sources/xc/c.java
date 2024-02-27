package xc;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18258a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void c(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        public final void b(Context context, ArrayList arrayList, ArrayList arrayList2) {
            l.f(context, "context");
            u uVar = new u();
            Dialog dialog = new Dialog(context);
            uVar.f20234e = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) uVar.f20234e).setContentView(R.layout.activity_alert_box_without_button);
            Window window = ((Dialog) uVar.f20234e).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            RecyclerView recyclerView = (RecyclerView) ((Dialog) uVar.f20234e).findViewById(R.id.impound_list_alert);
            a aVar = new a(context, arrayList, arrayList2);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(aVar);
            ((AppCompatImageView) ((Dialog) uVar.f20234e).findViewById(R.id.btnClose)).setOnClickListener(new b(uVar));
            ((Dialog) uVar.f20234e).show();
        }
    }
}
