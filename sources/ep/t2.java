package ep;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class t2 {
    private static Class a(Type type) {
        Class c10 = c(((GenericArrayType) type).getGenericComponentType());
        if (c10 != null) {
            return Array.newInstance(c10, 0).getClass();
        }
        return null;
    }

    private static Class b(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length > 0) {
            return c(actualTypeArguments[0]);
        }
        return null;
    }

    private static Class c(Type type) {
        return type instanceof Class ? (Class) type : f(type);
    }

    private static Class[] d(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            clsArr[i10] = c(actualTypeArguments[i10]);
        }
        return clsArr;
    }

    public static Class[] e(Field field) {
        ParameterizedType n10 = n(field);
        return n10 != null ? d(n10) : new Class[0];
    }

    private static Class f(Type type) {
        return type instanceof GenericArrayType ? a(type) : Object.class;
    }

    public static String g(String str) {
        if (str.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c10 = charArray[0];
        if (!o(charArray)) {
            charArray[0] = q(c10);
        }
        return new String(charArray);
    }

    public static Class h(Method method, int i10) {
        ParameterizedType j10 = j(method, i10);
        return j10 != null ? b(j10) : Object.class;
    }

    public static Class[] i(Method method, int i10) {
        ParameterizedType j10 = j(method, i10);
        return j10 != null ? d(j10) : new Class[0];
    }

    private static ParameterizedType j(Method method, int i10) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        if (genericParameterTypes.length <= i10) {
            return null;
        }
        Type type = genericParameterTypes[i10];
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        return null;
    }

    public static Class k(Method method) {
        ParameterizedType m10 = m(method);
        return m10 != null ? b(m10) : Object.class;
    }

    public static Class[] l(Method method) {
        ParameterizedType m10 = m(method);
        return m10 != null ? d(m10) : new Class[0];
    }

    private static ParameterizedType m(Method method) {
        Type genericReturnType = method.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            return (ParameterizedType) genericReturnType;
        }
        return null;
    }

    private static ParameterizedType n(Field field) {
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            return (ParameterizedType) genericType;
        }
        return null;
    }

    private static boolean o(char[] cArr) {
        if (cArr.length >= 2 && p(cArr[0])) {
            return p(cArr[1]);
        }
        return false;
    }

    private static boolean p(char c10) {
        return Character.isUpperCase(c10);
    }

    private static char q(char c10) {
        return Character.toLowerCase(c10);
    }
}
