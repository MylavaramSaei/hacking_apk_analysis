package jpEZy3U5wFkT2e9PKQ;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class pbVGzGjWvY2LDXC8vo {
    public static void Acstmh57AKoSEkEFNJ(String str) {
        throw ((NullPointerException) TCyPEKSzIyweCN5yp1(new NullPointerException(str)));
    }

    public static void HJFh0TGMpafqLE9haL(Object obj, String str) {
        if (obj == null) {
            Acstmh57AKoSEkEFNJ(str);
        }
    }

    public static Throwable IPyIQcaNa8aB7drBED(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static String KYHag8HRDlnO3X9zmZ(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = pbVGzGjWvY2LDXC8vo.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static Throwable TCyPEKSzIyweCN5yp1(Throwable th) {
        return IPyIQcaNa8aB7drBED(th, pbVGzGjWvY2LDXC8vo.class.getName());
    }

    public static void Z9WdNiOsPR0y54zHW4(String str) {
        throw ((NullPointerException) TCyPEKSzIyweCN5yp1(new NullPointerException(KYHag8HRDlnO3X9zmZ(str))));
    }

    public static void husNiw3snxdgZPAGJm(Object obj, String str) {
        if (obj == null) {
            Z9WdNiOsPR0y54zHW4(str);
        }
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void pbVGzGjWvY2LDXC8vo() {
        throw ((NullPointerException) TCyPEKSzIyweCN5yp1(new NullPointerException()));
    }

    public static void s3fjYDxWOUexjjVgyA(Object obj) {
        if (obj == null) {
            pbVGzGjWvY2LDXC8vo();
        }
    }

    public static void zZKhbgvUfsK4AEX3r0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) TCyPEKSzIyweCN5yp1(new NullPointerException(str + " must not be null")));
    }
}
