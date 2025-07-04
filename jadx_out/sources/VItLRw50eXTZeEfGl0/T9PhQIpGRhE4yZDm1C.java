package VItLRw50eXTZeEfGl0;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class T9PhQIpGRhE4yZDm1C extends e54J8UWNHWALQNixXM {
    @Override // VItLRw50eXTZeEfGl0.e54J8UWNHWALQNixXM
    public Method G7AC3DWIx9i9fdanjk(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // VItLRw50eXTZeEfGl0.e54J8UWNHWALQNixXM
    public Typeface pbVGzGjWvY2LDXC8vo(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f1817TCyPEKSzIyweCN5yp1, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1816T9PhQIpGRhE4yZDm1C.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
