package w7;

import mn.a;
import mn.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static /* synthetic */ Throwable f17951a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ e f17952b = null;

    static {
        try {
            f17952b = new e();
        } catch (Throwable th2) {
            f17951a = th2;
        }
    }

    public static e b() {
        e eVar = f17952b;
        if (eVar != null) {
            return eVar;
        }
        throw new b("com.googlecode.mp4parser.RequiresParseDetailAspect", f17951a);
    }

    public void c(a aVar) {
        if (!(aVar.getTarget() instanceof a)) {
            throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
        } else if (!((a) aVar.getTarget()).j()) {
            ((a) aVar.getTarget()).l();
        }
    }
}
