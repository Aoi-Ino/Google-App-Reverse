package s3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class g1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h1 f15975a;

    /* synthetic */ g1(h1 h1Var, f1 f1Var) {
        this.f15975a = h1Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f15975a.f15976f) {
                try {
                    c1 c1Var = (c1) message.obj;
                    e1 e1Var = (e1) this.f15975a.f15976f.get(c1Var);
                    if (e1Var != null && e1Var.i()) {
                        if (e1Var.j()) {
                            e1Var.g("GmsClientSupervisor");
                        }
                        this.f15975a.f15976f.remove(c1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f15975a.f15976f) {
                try {
                    c1 c1Var2 = (c1) message.obj;
                    e1 e1Var2 = (e1) this.f15975a.f15976f.get(c1Var2);
                    if (e1Var2 != null && e1Var2.a() == 3) {
                        String valueOf = String.valueOf(c1Var2);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                        ComponentName b10 = e1Var2.b();
                        if (b10 == null) {
                            b10 = c1Var2.b();
                        }
                        if (b10 == null) {
                            String d10 = c1Var2.d();
                            o.i(d10);
                            b10 = new ComponentName(d10, "unknown");
                        }
                        e1Var2.onServiceDisconnected(b10);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }
}
