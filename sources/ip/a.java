package ip;

class a implements z {

    /* renamed from: a  reason: collision with root package name */
    private final z f24516a;

    public a(z zVar) {
        this.f24516a = zVar;
    }

    private g0 b(Class cls) {
        g0 a10 = this.f24516a.a(cls);
        if (a10 == null) {
            return null;
        }
        return new b(a10, cls);
    }

    public g0 a(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType == Character.TYPE) {
            return new i(componentType);
        }
        if (componentType == Character.class) {
            return new i(componentType);
        }
        return componentType == String.class ? new d0() : b(componentType);
    }
}
