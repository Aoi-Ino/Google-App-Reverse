package kk;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.utilities.e;
import gl.t;

public final class c {
    /* access modifiers changed from: private */
    public static final void d(PopupWindow popupWindow, View view) {
        l.f(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    public static final boolean e(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        l.f(popupWindow, "$popupWindow");
        popupWindow.dismiss();
        return true;
    }

    public final void c(View view, String str, String str2) {
        l.f(view, "view");
        l.f(str, "imgUrl");
        l.f(str2, "base64");
        Object systemService = view.getContext().getSystemService("layout_inflater");
        l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dl_renewal_custom_popup_image_display, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
        popupWindow.showAtLocation(view, 17, 0, 0);
        View findViewById = inflate.findViewById(R.id.picture_of_doc);
        l.e(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        if (str.length() > 0) {
            t.p(view.getContext()).k(str).c(imageView);
        } else {
            imageView.setImageBitmap(e.c(str2));
        }
        ((Button) inflate.findViewById(R.id.messageButton)).setOnClickListener(new a(popupWindow));
        inflate.setOnTouchListener(new b(popupWindow));
    }
}
