package wj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import java.util.ArrayList;

public final class a extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f32628e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f32629f;

    public a(Context context, ArrayList arrayList) {
        l.f(arrayList, "relationship");
        this.f32628e = context;
        this.f32629f = arrayList;
    }

    public int getCount() {
        return this.f32629f.size();
    }

    public Object getItem(int i10) {
        Object obj = this.f32629f.get(i10);
        l.e(obj, "get(...)");
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f32628e).inflate(R.layout.coustome_spinner2, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(((Relationship) this.f32629f.get(i10)).getRelationName().toString());
        return view;
    }
}
