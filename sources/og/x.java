package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import java.util.ArrayList;

public final class x extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30090e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f30091f;

    public x(Context context, ArrayList arrayList) {
        l.f(arrayList, "state");
        this.f30090e = context;
        this.f30091f = arrayList;
    }

    public int getCount() {
        ArrayList arrayList = this.f30091f;
        l.c(arrayList);
        return arrayList.size();
    }

    public Object getItem(int i10) {
        ArrayList arrayList = this.f30091f;
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
            view = LayoutInflater.from(this.f30090e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(((HTPModleItem) this.f30091f.get(i10)).getHp_type_descr().toString());
        return view;
    }
}
