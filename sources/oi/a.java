package oi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import java.util.ArrayList;

public final class a extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30098e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f30099f;

    public a(Context context, ArrayList arrayList) {
        this.f30098e = context;
        this.f30099f = arrayList;
    }

    public int getCount() {
        ArrayList arrayList = this.f30099f;
        l.c(arrayList);
        return arrayList.size();
    }

    public Object getItem(int i10) {
        ArrayList arrayList = this.f30099f;
        l.c(arrayList);
        Object obj = arrayList.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30098e).inflate(R.layout.coustome_spinner2, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        ArrayList arrayList = this.f30099f;
        l.c(arrayList);
        AppCatPojo appCatPojo = (AppCatPojo) arrayList.get(i10);
        textView.setText(String.valueOf(appCatPojo != null ? appCatPojo.getAppDesc() : null));
        return view;
    }
}
