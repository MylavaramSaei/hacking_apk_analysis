package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class T9PhQIpGRhE4yZDm1C {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final T9PhQIpGRhE4yZDm1C f3814lEeR5KfoEr4xU5yHH7 = new T9PhQIpGRhE4yZDm1C();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final Map f3815s3fjYDxWOUexjjVgyA = new HashMap();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final Map f3813HJFh0TGMpafqLE9haL = new HashMap();

    public static final String HJFh0TGMpafqLE9haL(String str) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "className");
        return pjij9fAFhRRn230kOs.T9PhQIpGRhE4yZDm1C.HJFh0TGMpafqLE9haL(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(obj, "object");
        boolean z = obj instanceof pbVGzGjWvY2LDXC8vo;
        boolean z2 = obj instanceof s3fjYDxWOUexjjVgyA;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((s3fjYDxWOUexjjVgyA) obj, (pbVGzGjWvY2LDXC8vo) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((s3fjYDxWOUexjjVgyA) obj, null);
        }
        if (z) {
            return (pbVGzGjWvY2LDXC8vo) obj;
        }
        Class<?> cls = obj.getClass();
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = f3814lEeR5KfoEr4xU5yHH7;
        if (t9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f3813HJFh0TGMpafqLE9haL.get(cls);
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            t9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        int size = list.size();
        zZKhbgvUfsK4AEX3r0[] zzkhbgvufsk4aex3r0Arr = new zZKhbgvUfsK4AEX3r0[size];
        for (int i = 0; i < size; i++) {
            f3814lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7((Constructor) list.get(i), obj);
            zzkhbgvufsk4aex3r0Arr[i] = null;
        }
        return new CompositeGeneratedAdaptersObserver(zzkhbgvufsk4aex3r0Arr);
    }

    public final int TCyPEKSzIyweCN5yp1(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(cls);
        if (constructorS3fjYDxWOUexjjVgyA != null) {
            f3813HJFh0TGMpafqLE9haL.put(cls, F8je6vTkTMHm5WbjEC.Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7(constructorS3fjYDxWOUexjjVgyA));
            return 2;
        }
        if (lEeR5KfoEr4xU5yHH7.f3855HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (husNiw3snxdgZPAGJm(superclass)) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(superclass, "superclass");
            if (zZKhbgvUfsK4AEX3r0(superclass) == 1) {
                return 1;
            }
            Object obj = f3813HJFh0TGMpafqLE9haL.get(superclass);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (husNiw3snxdgZPAGJm(cls2)) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(cls2, "intrface");
                if (zZKhbgvUfsK4AEX3r0(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f3813HJFh0TGMpafqLE9haL.get(cls2);
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3813HJFh0TGMpafqLE9haL.put(cls, arrayList);
        return 2;
    }

    public final boolean husNiw3snxdgZPAGJm(Class cls) {
        return cls != null && Acstmh57AKoSEkEFNJ.class.isAssignableFrom(cls);
    }

    public final zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(objNewInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Constructor s3fjYDxWOUexjjVgyA(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(name, "fullPackage");
            if (name.length() != 0) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(canonicalName);
            if (name.length() != 0) {
                strHJFh0TGMpafqLE9haL = name + '.' + strHJFh0TGMpafqLE9haL;
            }
            Class<?> cls2 = Class.forName(strHJFh0TGMpafqLE9haL);
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int zZKhbgvUfsK4AEX3r0(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map map = f3815s3fjYDxWOUexjjVgyA;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(cls);
        map.put(cls, Integer.valueOf(iTCyPEKSzIyweCN5yp1));
        return iTCyPEKSzIyweCN5yp1;
    }
}
