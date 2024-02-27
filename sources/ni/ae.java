package ni;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.R;
import k1.a;

public final class ae {
    public final AppCompatTextView A;
    public final TextView B;
    public final AppCompatTextView C;
    public final TextView D;
    public final TextView E;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollView f25360a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f25361b;

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatTextView f25362c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25363d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatTextView f25364e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f25365f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f25366g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f25367h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextView f25368i;

    /* renamed from: j  reason: collision with root package name */
    public final dc f25369j;

    /* renamed from: k  reason: collision with root package name */
    public final Spinner f25370k;

    /* renamed from: l  reason: collision with root package name */
    public final AppCompatTextView f25371l;

    /* renamed from: m  reason: collision with root package name */
    public final EditText f25372m;

    /* renamed from: n  reason: collision with root package name */
    public final AppCompatTextView f25373n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f25374o;

    /* renamed from: p  reason: collision with root package name */
    public final Spinner f25375p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f25376q;

    /* renamed from: r  reason: collision with root package name */
    public final EditText f25377r;

    /* renamed from: s  reason: collision with root package name */
    public final AppCompatTextView f25378s;

    /* renamed from: t  reason: collision with root package name */
    public final Spinner f25379t;

    /* renamed from: u  reason: collision with root package name */
    public final AppCompatTextView f25380u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f25381v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f25382w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f25383x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f25384y;

    /* renamed from: z  reason: collision with root package name */
    public final EditText f25385z;

    private ae(ScrollView scrollView, EditText editText, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, EditText editText2, AppCompatTextView appCompatTextView3, EditText editText3, AppCompatTextView appCompatTextView4, dc dcVar, Spinner spinner, AppCompatTextView appCompatTextView5, EditText editText4, AppCompatTextView appCompatTextView6, TextView textView2, Spinner spinner2, AppCompatTextView appCompatTextView7, EditText editText5, AppCompatTextView appCompatTextView8, Spinner spinner3, AppCompatTextView appCompatTextView9, TextView textView3, ImageView imageView, ImageView imageView2, ImageView imageView3, EditText editText6, AppCompatTextView appCompatTextView10, TextView textView4, AppCompatTextView appCompatTextView11, TextView textView5, TextView textView6) {
        this.f25360a = scrollView;
        this.f25361b = editText;
        this.f25362c = appCompatTextView;
        this.f25363d = textView;
        this.f25364e = appCompatTextView2;
        this.f25365f = editText2;
        this.f25366g = appCompatTextView3;
        this.f25367h = editText3;
        this.f25368i = appCompatTextView4;
        this.f25369j = dcVar;
        this.f25370k = spinner;
        this.f25371l = appCompatTextView5;
        this.f25372m = editText4;
        this.f25373n = appCompatTextView6;
        this.f25374o = textView2;
        this.f25375p = spinner2;
        this.f25376q = appCompatTextView7;
        this.f25377r = editText5;
        this.f25378s = appCompatTextView8;
        this.f25379t = spinner3;
        this.f25380u = appCompatTextView9;
        this.f25381v = textView3;
        this.f25382w = imageView;
        this.f25383x = imageView2;
        this.f25384y = imageView3;
        this.f25385z = editText6;
        this.A = appCompatTextView10;
        this.B = textView4;
        this.C = appCompatTextView11;
        this.D = textView5;
        this.E = textView6;
    }

    public static ae a(View view) {
        View view2 = view;
        int i10 = R.id.email_id;
        EditText editText = (EditText) a.a(view2, R.id.email_id);
        if (editText != null) {
            i10 = R.id.email_id_txt;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a.a(view2, R.id.email_id_txt);
            if (appCompatTextView != null) {
                i10 = R.id.enter_new_owner;
                TextView textView = (TextView) a.a(view2, R.id.enter_new_owner);
                if (textView != null) {
                    i10 = R.id.enter_new_owner_txt;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) a.a(view2, R.id.enter_new_owner_txt);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.father_husband_name;
                        EditText editText2 = (EditText) a.a(view2, R.id.father_husband_name);
                        if (editText2 != null) {
                            i10 = R.id.father_husband_name_txt;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) a.a(view2, R.id.father_husband_name_txt);
                            if (appCompatTextView3 != null) {
                                i10 = R.id.mobile_number;
                                EditText editText3 = (EditText) a.a(view2, R.id.mobile_number);
                                if (editText3 != null) {
                                    i10 = R.id.mobile_number_txt;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) a.a(view2, R.id.mobile_number_txt);
                                    if (appCompatTextView4 != null) {
                                        i10 = R.id.mvvHeader;
                                        View a10 = a.a(view2, R.id.mvvHeader);
                                        if (a10 != null) {
                                            dc a11 = dc.a(a10);
                                            i10 = R.id.new_owner_category;
                                            Spinner spinner = (Spinner) a.a(view2, R.id.new_owner_category);
                                            if (spinner != null) {
                                                i10 = R.id.new_owner_category_txt;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) a.a(view2, R.id.new_owner_category_txt);
                                                if (appCompatTextView5 != null) {
                                                    i10 = R.id.new_owner_name;
                                                    EditText editText4 = (EditText) a.a(view2, R.id.new_owner_name);
                                                    if (editText4 != null) {
                                                        i10 = R.id.new_owner_name_txt;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) a.a(view2, R.id.new_owner_name_txt);
                                                        if (appCompatTextView6 != null) {
                                                            i10 = R.id.nextPage;
                                                            TextView textView2 = (TextView) a.a(view2, R.id.nextPage);
                                                            if (textView2 != null) {
                                                                i10 = R.id.ownership_type;
                                                                Spinner spinner2 = (Spinner) a.a(view2, R.id.ownership_type);
                                                                if (spinner2 != null) {
                                                                    i10 = R.id.ownership_type_txt;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) a.a(view2, R.id.ownership_type_txt);
                                                                    if (appCompatTextView7 != null) {
                                                                        i10 = R.id.pan_number;
                                                                        EditText editText5 = (EditText) a.a(view2, R.id.pan_number);
                                                                        if (editText5 != null) {
                                                                            i10 = R.id.pan_number_txt;
                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) a.a(view2, R.id.pan_number_txt);
                                                                            if (appCompatTextView8 != null) {
                                                                                i10 = R.id.purpose;
                                                                                Spinner spinner3 = (Spinner) a.a(view2, R.id.purpose);
                                                                                if (spinner3 != null) {
                                                                                    i10 = R.id.purpose_txt;
                                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) a.a(view2, R.id.purpose_txt);
                                                                                    if (appCompatTextView9 != null) {
                                                                                        i10 = R.id.resetPage;
                                                                                        TextView textView3 = (TextView) a.a(view2, R.id.resetPage);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.rightLabelPin;
                                                                                            ImageView imageView = (ImageView) a.a(view2, R.id.rightLabelPin);
                                                                                            if (imageView != null) {
                                                                                                i10 = R.id.rightcategoryPin;
                                                                                                ImageView imageView2 = (ImageView) a.a(view2, R.id.rightcategoryPin);
                                                                                                if (imageView2 != null) {
                                                                                                    i10 = R.id.rightownershipPin;
                                                                                                    ImageView imageView3 = (ImageView) a.a(view2, R.id.rightownershipPin);
                                                                                                    if (imageView3 != null) {
                                                                                                        i10 = R.id.sale_amount;
                                                                                                        EditText editText6 = (EditText) a.a(view2, R.id.sale_amount);
                                                                                                        if (editText6 != null) {
                                                                                                            i10 = R.id.sale_amount_txt;
                                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) a.a(view2, R.id.sale_amount_txt);
                                                                                                            if (appCompatTextView10 != null) {
                                                                                                                i10 = R.id.sale_date;
                                                                                                                TextView textView4 = (TextView) a.a(view2, R.id.sale_date);
                                                                                                                if (textView4 != null) {
                                                                                                                    i10 = R.id.sale_date_txt;
                                                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) a.a(view2, R.id.sale_date_txt);
                                                                                                                    if (appCompatTextView11 != null) {
                                                                                                                        i10 = R.id.vehicleNumberTv;
                                                                                                                        TextView textView5 = (TextView) a.a(view2, R.id.vehicleNumberTv);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i10 = R.id.vehicle_view;
                                                                                                                            TextView textView6 = (TextView) a.a(view2, R.id.vehicle_view);
                                                                                                                            if (textView6 != null) {
                                                                                                                                return new ae((ScrollView) view2, editText, appCompatTextView, textView, appCompatTextView2, editText2, appCompatTextView3, editText3, appCompatTextView4, a11, spinner, appCompatTextView5, editText4, appCompatTextView6, textView2, spinner2, appCompatTextView7, editText5, appCompatTextView8, spinner3, appCompatTextView9, textView3, imageView, imageView2, imageView3, editText6, appCompatTextView10, textView4, appCompatTextView11, textView5, textView6);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ae c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static ae d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.vahan_transfer_ownership, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ScrollView b() {
        return this.f25360a;
    }
}
