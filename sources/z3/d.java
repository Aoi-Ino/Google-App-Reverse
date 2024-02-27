package z3;

import android.os.IBinder;
import java.lang.reflect.Field;
import s3.o;
import z3.b;

public final class d extends b.a {

    /* renamed from: b  reason: collision with root package name */
    private final Object f18876b;

    private d(Object obj) {
        this.f18876b = obj;
    }

    public static Object j(b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f18876b;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            o.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static b l0(Object obj) {
        return new d(obj);
    }
}
