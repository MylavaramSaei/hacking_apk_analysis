package jpEZy3U5wFkT2e9PKQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Object[] f6192lEeR5KfoEr4xU5yHH7 = new Object[0];

    public static final Object[] lEeR5KfoEr4xU5yHH7(Collection collection) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f6192lEeR5KfoEr4xU5yHH7;
    }

    public static final Object[] s3fjYDxWOUexjjVgyA(Collection collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
