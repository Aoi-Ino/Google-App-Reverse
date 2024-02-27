package t5;

final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m f16532f;

    f(m mVar) {
        this.f16532f = mVar;
    }

    public final void a() {
        m mVar = this.f16532f;
        if (mVar.f16552n != null) {
            mVar.f16540b.d("Unbind from service.", new Object[0]);
            m mVar2 = this.f16532f;
            mVar2.f16539a.unbindService(mVar2.f16551m);
            this.f16532f.f16545g = false;
            this.f16532f.f16552n = null;
            this.f16532f.f16551m = null;
        }
        this.f16532f.u();
    }
}
