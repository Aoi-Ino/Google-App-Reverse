package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.content.a;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;

public final class b0 extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30016e;

    /* renamed from: f  reason: collision with root package name */
    private VahanStateModle f30017f;

    public b0(Context context, VahanStateModle vahanStateModle) {
        l.f(vahanStateModle, "state");
        this.f30016e = context;
        this.f30017f = vahanStateModle;
    }

    public int getCount() {
        VahanStateModle vahanStateModle = this.f30017f;
        l.c(vahanStateModle);
        return vahanStateModle.size();
    }

    public Object getItem(int i10) {
        VahanStateModle vahanStateModle = this.f30017f;
        l.c(vahanStateModle);
        Object obj = vahanStateModle.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30016e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        Context context = this.f30016e;
        l.c(context);
        textView.setBackgroundColor(a.c(context, 17170445));
        textView.setText(((String) ((VahanStateModleSubList) this.f30017f.get(i10)).get(1)).toString());
        return view;
    }
}
