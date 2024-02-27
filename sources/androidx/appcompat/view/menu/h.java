package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;
import f.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: e  reason: collision with root package name */
    private g f1000e;

    /* renamed from: f  reason: collision with root package name */
    private c f1001f;

    /* renamed from: g  reason: collision with root package name */
    e f1002g;

    /* renamed from: h  reason: collision with root package name */
    private m.a f1003h;

    public h(g gVar) {
        this.f1000e = gVar;
    }

    public void a() {
        c cVar = this.f1001f;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(g gVar, boolean z10) {
        if (z10 || gVar == this.f1000e) {
            a();
        }
        m.a aVar = this.f1003h;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    public boolean c(g gVar) {
        m.a aVar = this.f1003h;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f1000e;
        c.a aVar = new c.a(gVar.w());
        e eVar = new e(aVar.b(), g.abc_list_menu_item_layout);
        this.f1002g = eVar;
        eVar.n(this);
        this.f1000e.b(this.f1002g);
        aVar.c(this.f1002g.a(), this);
        View A = gVar.A();
        if (A != null) {
            aVar.d(A);
        } else {
            aVar.e(gVar.y()).o(gVar.z());
        }
        aVar.k(this);
        c a10 = aVar.a();
        this.f1001f = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1001f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1001f.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1000e.N((i) this.f1002g.a().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1002g.b(this.f1000e, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1001f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1001f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1000e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1000e.performShortcut(i10, keyEvent, 0);
    }
}
