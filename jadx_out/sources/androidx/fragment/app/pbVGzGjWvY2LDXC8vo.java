package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 f3635lEeR5KfoEr4xU5yHH7 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();

    public static Class HJFh0TGMpafqLE9haL(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = f3635lEeR5KfoEr4xU5yHH7;
        Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = (Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1) tCyPEKSzIyweCN5yp1.get(classLoader);
        if (tCyPEKSzIyweCN5yp12 == null) {
            tCyPEKSzIyweCN5yp12 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();
            tCyPEKSzIyweCN5yp1.put(classLoader, tCyPEKSzIyweCN5yp12);
        }
        Class cls = (Class) tCyPEKSzIyweCN5yp12.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        tCyPEKSzIyweCN5yp12.put(str, cls2);
        return cls2;
    }

    public static boolean s3fjYDxWOUexjjVgyA(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(HJFh0TGMpafqLE9haL(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public abstract Fragment lEeR5KfoEr4xU5yHH7(ClassLoader classLoader, String str);
}
