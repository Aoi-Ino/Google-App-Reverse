package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;
import t5.o0;
import w5.p;

abstract class k extends o0 {

    /* renamed from: b  reason: collision with root package name */
    final p f6763b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f6764c;

    k(s sVar, p pVar) {
        this.f6764c = sVar;
        this.f6763b = pVar;
    }

    public final void D(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    public final void M(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onRemoveModule()", new Object[0]);
    }

    public void O(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6875e.s(this.f6763b);
        s.f6869g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public void R(Bundle bundle) {
        this.f6764c.f6874d.s(this.f6763b);
        int i10 = bundle.getInt("error_code");
        s.f6869g.b("onError(%d)", Integer.valueOf(i10));
        this.f6763b.d(new a(i10));
    }

    public void T(int i10, Bundle bundle) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onStartDownload(%d)", Integer.valueOf(i10));
    }

    public final void a(Bundle bundle) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onCancelDownloads()", new Object[0]);
    }

    public final void a0(int i10, Bundle bundle) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    public void d0(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onRequestDownloadInfo()", new Object[0]);
    }

    public final void f(int i10, Bundle bundle) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    public final void k0(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    public void p(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    public void t(List list) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onGetSessionStates", new Object[0]);
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        this.f6764c.f6874d.s(this.f6763b);
        s.f6869g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }
}
