package ep;

import java.lang.reflect.Constructor;
import jp.b;

class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final jp.a f23197a = new b();

    private class a implements e1 {

        /* renamed from: a  reason: collision with root package name */
        private Object f23198a;

        /* renamed from: b  reason: collision with root package name */
        private Class f23199b;

        public a(Class cls) {
            this.f23199b = cls;
        }

        public boolean a() {
            return false;
        }

        public Object b(Object obj) {
            this.f23198a = obj;
            return obj;
        }

        public Object c() {
            if (this.f23198a == null) {
                this.f23198a = f1.this.b(this.f23199b);
            }
            return this.f23198a;
        }

        public Class getType() {
            return this.f23199b;
        }
    }

    public e1 a(Class cls) {
        return new a(cls);
    }

    /* access modifiers changed from: protected */
    public Object b(Class cls) {
        Constructor constructor = (Constructor) this.f23197a.b(cls);
        if (constructor == null) {
            constructor = cls.getDeclaredConstructor(new Class[0]);
            if (!constructor.isAccessible()) {
                constructor.setAccessible(true);
            }
            this.f23197a.a(cls, constructor);
        }
        return constructor.newInstance(new Object[0]);
    }
}
