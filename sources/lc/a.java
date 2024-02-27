package lc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import java.util.ArrayList;

public final class a extends ArrayAdapter {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        l.c(context);
        l.c(arrayList);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        kc.a aVar = (kc.a) getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        l.c(aVar);
        ((TextView) findViewById).setText(aVar.a().toString());
        return view;
    }
}
