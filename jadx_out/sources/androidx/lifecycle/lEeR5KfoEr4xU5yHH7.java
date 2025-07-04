package androidx.lifecycle;

import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static lEeR5KfoEr4xU5yHH7 f3855HJFh0TGMpafqLE9haL = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f3856lEeR5KfoEr4xU5yHH7 = new HashMap();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f3857s3fjYDxWOUexjjVgyA = new HashMap();

    /* renamed from: androidx.lifecycle.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static class C0047lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Map f3858lEeR5KfoEr4xU5yHH7 = new HashMap();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Map f3859s3fjYDxWOUexjjVgyA;

        public C0047lEeR5KfoEr4xU5yHH7(Map map) {
            this.f3859s3fjYDxWOUexjjVgyA = map;
            for (Map.Entry entry : map.entrySet()) {
                KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7) entry.getValue();
                List arrayList = (List) this.f3858lEeR5KfoEr4xU5yHH7.get(leer5kfoer4xu5yhh7);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f3858lEeR5KfoEr4xU5yHH7.put(leer5kfoer4xu5yhh7, arrayList);
                }
                arrayList.add((s3fjYDxWOUexjjVgyA) entry.getKey());
            }
        }

        public static void s3fjYDxWOUexjjVgyA(List list, Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((s3fjYDxWOUexjjVgyA) list.get(size)).lEeR5KfoEr4xU5yHH7(z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7, obj);
                }
            }
        }

        public void lEeR5KfoEr4xU5yHH7(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            s3fjYDxWOUexjjVgyA((List) this.f3858lEeR5KfoEr4xU5yHH7.get(leer5kfoer4xu5yhh7), z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7, obj);
            s3fjYDxWOUexjjVgyA((List) this.f3858lEeR5KfoEr4xU5yHH7.get(KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_ANY), z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7, obj);
        }
    }

    public static final class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final int f3860lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Method f3861s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(int i, Method method) throws SecurityException {
            this.f3860lEeR5KfoEr4xU5yHH7 = i;
            this.f3861s3fjYDxWOUexjjVgyA = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s3fjYDxWOUexjjVgyA)) {
                return false;
            }
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) obj;
            return this.f3860lEeR5KfoEr4xU5yHH7 == s3fjydxwouexjjvgya.f3860lEeR5KfoEr4xU5yHH7 && this.f3861s3fjYDxWOUexjjVgyA.getName().equals(s3fjydxwouexjjvgya.f3861s3fjYDxWOUexjjVgyA.getName());
        }

        public int hashCode() {
            return (this.f3860lEeR5KfoEr4xU5yHH7 * 31) + this.f3861s3fjYDxWOUexjjVgyA.getName().hashCode();
        }

        public void lEeR5KfoEr4xU5yHH7(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i = this.f3860lEeR5KfoEr4xU5yHH7;
                if (i == 0) {
                    this.f3861s3fjYDxWOUexjjVgyA.invoke(obj, null);
                } else if (i == 1) {
                    this.f3861s3fjYDxWOUexjjVgyA.invoke(obj, z9WdNiOsPR0y54zHW4);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f3861s3fjYDxWOUexjjVgyA.invoke(obj, z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }

    public C0047lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(Class cls) {
        C0047lEeR5KfoEr4xU5yHH7 c0047lEeR5KfoEr4xU5yHH7 = (C0047lEeR5KfoEr4xU5yHH7) this.f3856lEeR5KfoEr4xU5yHH7.get(cls);
        return c0047lEeR5KfoEr4xU5yHH7 != null ? c0047lEeR5KfoEr4xU5yHH7 : lEeR5KfoEr4xU5yHH7(cls, null);
    }

    public final void husNiw3snxdgZPAGJm(Map map, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Class cls) {
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7) map.get(s3fjydxwouexjjvgya);
        if (leer5kfoer4xu5yhh72 == null || leer5kfoer4xu5yhh7 == leer5kfoer4xu5yhh72) {
            if (leer5kfoer4xu5yhh72 == null) {
                map.put(s3fjydxwouexjjvgya, leer5kfoer4xu5yhh7);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + s3fjydxwouexjjvgya.f3861s3fjYDxWOUexjjVgyA.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + leer5kfoer4xu5yhh72 + ", new value " + leer5kfoer4xu5yhh7);
    }

    public final C0047lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(Class cls, Method[] methodArr) {
        int i;
        C0047lEeR5KfoEr4xU5yHH7 c0047lEeR5KfoEr4xU5yHH7HJFh0TGMpafqLE9haL;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0047lEeR5KfoEr4xU5yHH7HJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(superclass)) != null) {
            map.putAll(c0047lEeR5KfoEr4xU5yHH7HJFh0TGMpafqLE9haL.f3859s3fjYDxWOUexjjVgyA);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : HJFh0TGMpafqLE9haL(cls2).f3859s3fjYDxWOUexjjVgyA.entrySet()) {
                husNiw3snxdgZPAGJm(map, (s3fjYDxWOUexjjVgyA) entry.getKey(), (KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = s3fjYDxWOUexjjVgyA(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = (zaq8hOURtfwbcX17cG) method.getAnnotation(zaq8hOURtfwbcX17cG.class);
            if (zaq8hourtfwbcx17cg != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!Z9WdNiOsPR0y54zHW4.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7Value = zaq8hourtfwbcx17cg.value();
                if (parameterTypes.length > 1) {
                    if (!KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (leer5kfoer4xu5yhh7Value != KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                husNiw3snxdgZPAGJm(map, new s3fjYDxWOUexjjVgyA(i, method), leer5kfoer4xu5yhh7Value, cls);
                z = true;
            }
        }
        C0047lEeR5KfoEr4xU5yHH7 c0047lEeR5KfoEr4xU5yHH7 = new C0047lEeR5KfoEr4xU5yHH7(map);
        this.f3856lEeR5KfoEr4xU5yHH7.put(cls, c0047lEeR5KfoEr4xU5yHH7);
        this.f3857s3fjYDxWOUexjjVgyA.put(cls, Boolean.valueOf(z));
        return c0047lEeR5KfoEr4xU5yHH7;
    }

    public final Method[] s3fjYDxWOUexjjVgyA(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public boolean zZKhbgvUfsK4AEX3r0(Class cls) {
        Boolean bool = (Boolean) this.f3857s3fjYDxWOUexjjVgyA.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(cls);
        for (Method method : methodArrS3fjYDxWOUexjjVgyA) {
            if (((zaq8hOURtfwbcX17cG) method.getAnnotation(zaq8hOURtfwbcX17cG.class)) != null) {
                lEeR5KfoEr4xU5yHH7(cls, methodArrS3fjYDxWOUexjjVgyA);
                return true;
            }
        }
        this.f3857s3fjYDxWOUexjjVgyA.put(cls, Boolean.FALSE);
        return false;
    }
}
