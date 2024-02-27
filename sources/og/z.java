package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;

public final class z extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30094e;

    /* renamed from: f  reason: collision with root package name */
    private RtoNameModle f30095f;

    public z(Context context, RtoNameModle rtoNameModle) {
        l.f(rtoNameModle, "state");
        this.f30094e = context;
        this.f30095f = rtoNameModle;
    }

    public int getCount() {
        RtoNameModle rtoNameModle = this.f30095f;
        l.c(rtoNameModle);
        return rtoNameModle.size();
    }

    public Object getItem(int i10) {
        RtoNameModle rtoNameModle = this.f30095f;
        l.c(rtoNameModle);
        Object obj = rtoNameModle.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30094e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(((RtoNameModleItem) this.f30095f.get(i10)).getOff_name().toString());
        return view;
    }
}
