package z7;

public abstract class e {
    public static e a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new a(cls.getSimpleName()) : new d(cls.getSimpleName());
    }

    public abstract void b(String str);
}
