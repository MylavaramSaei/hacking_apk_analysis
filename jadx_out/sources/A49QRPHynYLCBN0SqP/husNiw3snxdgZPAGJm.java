package A49QRPHynYLCBN0SqP;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm {
    public static int HJFh0TGMpafqLE9haL(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static int[] lEeR5KfoEr4xU5yHH7(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[HJFh0TGMpafqLE9haL(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static Object[] s3fjYDxWOUexjjVgyA(Object[] objArr, int i, Object obj) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), HJFh0TGMpafqLE9haL(i));
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }
}
