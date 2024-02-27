package f3;

public abstract class b {
    public static Object a(int i10, Object obj, a aVar, c cVar) {
        Object apply;
        if (i10 < 1) {
            return aVar.apply(obj);
        }
        do {
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            if (obj == null || i10 - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(obj);
            obj = cVar.a(obj, apply);
            break;
        } while (i10 - 1 < 1);
        return apply;
    }
}
