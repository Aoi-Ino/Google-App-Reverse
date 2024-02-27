package og;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem;

public final class y extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private Context f30092e;

    /* renamed from: f  reason: collision with root package name */
    private NocReasonModle f30093f;

    public y(Context context, NocReasonModle nocReasonModle) {
        l.f(nocReasonModle, "state");
        this.f30092e = context;
        this.f30093f = nocReasonModle;
    }

    public int getCount() {
        NocReasonModle nocReasonModle = this.f30093f;
        l.c(nocReasonModle);
        return nocReasonModle.size();
    }

    public Object getItem(int i10) {
        NocReasonModle nocReasonModle = this.f30093f;
        l.c(nocReasonModle);
        Object obj = nocReasonModle.get(i10);
        l.c(obj);
        return obj;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        l.f(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.f30092e).inflate(R.layout.coustome_spinner1, viewGroup, false);
        }
        l.c(view);
        View findViewById = view.findViewById(R.id.text_blood);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(((NocReasonModleItem) this.f30093f.get(i10)).getDescr());
        return view;
    }
}
