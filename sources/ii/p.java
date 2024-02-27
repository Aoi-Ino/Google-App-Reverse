package ii;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.R;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24363a = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void d(u uVar, View view) {
            l.f(uVar, "$dialog");
            ((Dialog) uVar.f20234e).dismiss();
        }

        /* access modifiers changed from: private */
        public static final void e(u uVar, Context context, View view) {
            l.f(uVar, "$dialog");
            l.f(context, "$context");
            ((Dialog) uVar.f20234e).dismiss();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.nic.mparivahan")));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public final void c(Context context) {
            l.f(context, "context");
            u uVar = new u();
            Dialog dialog = new Dialog(context);
            uVar.f20234e = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) uVar.f20234e).setContentView(R.layout.version_update);
            Window window = ((Dialog) uVar.f20234e).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.close)).setOnClickListener(new n(uVar));
            ((TextView) ((Dialog) uVar.f20234e).findViewById(R.id.update)).setOnClickListener(new o(uVar, context));
            ((Dialog) uVar.f20234e).show();
        }
    }
}
