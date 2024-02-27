package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.g;
import cm.l;
import com.nic.mparivahan.R;
import ia.m0;
import java.util.ArrayList;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0115a f8403a = new C0115a((g) null);

    /* renamed from: com.nic.mparivahan.Dashboard.a$a  reason: collision with other inner class name */
    public static final class C0115a {
        private C0115a() {
        }

        public /* synthetic */ C0115a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void e(Dialog dialog, View view) {
            l.f(dialog, "$d");
            dialog.dismiss();
        }

        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActive", (Object) "1");
            jSONObject.put("s4Enabled", (Object) "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparState", (Object) jSONObject);
            return jSONObject2;
        }

        public final JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActive", (Object) "1");
            jSONObject.put("v4Enabled", (Object) "1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparState", (Object) jSONObject);
            return jSONObject2;
        }

        public final void d(Context context, ArrayList arrayList) {
            l.f(context, "context");
            l.f(arrayList, "list");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.pop_vahan_sarthi_statelist);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.state_list);
            l.d(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.cross_button);
            l.d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
            ((LinearLayout) findViewById2).setOnClickListener(new m0(dialog));
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.setAdapter(new ja.a(arrayList, context));
            dialog.show();
        }
    }
}
