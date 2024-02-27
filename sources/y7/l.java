package y7;

import b2.c;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    protected static Logger f18613a = Logger.getLogger(l.class.getName());

    /* renamed from: b  reason: collision with root package name */
    protected static Map f18614b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet<>();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        for (Class cls : hashSet) {
            g gVar = (g) cls.getAnnotation(g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map map = (Map) f18614b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int valueOf : tags) {
                map.put(Integer.valueOf(valueOf), cls);
            }
            f18614b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b bVar;
        int l10 = c.l(byteBuffer);
        Map map = (Map) f18614b.get(Integer.valueOf(i10));
        if (map == null) {
            map = (Map) f18614b.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(l10));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = f18613a;
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(l10) + " found: " + cls);
            bVar = new o();
        } else {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e10) {
                Logger logger2 = f18613a;
                Level level = Level.SEVERE;
                logger2.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + l10, e10);
                throw new RuntimeException(e10);
            }
        }
        bVar.d(l10, byteBuffer);
        return bVar;
    }
}
