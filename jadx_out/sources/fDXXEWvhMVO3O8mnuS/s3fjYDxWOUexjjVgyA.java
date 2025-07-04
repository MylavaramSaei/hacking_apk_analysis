package fDXXEWvhMVO3O8mnuS;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {
    public static boolean lEeR5KfoEr4xU5yHH7(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s3fjYDxWOUexjjVgyA(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!HR5vAalpgOKVm2T0Gq.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(objArr[i], obj)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }
}
