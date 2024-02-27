package ka;

import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import java.util.function.Predicate;
import ka.c;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13157a;

    public /* synthetic */ b(String str) {
        this.f13157a = str;
    }

    public final boolean test(Object obj) {
        return c.a.h(this.f13157a, (Enabledservice) obj);
    }
}
