package gS59iOkCM8TpW4A2ew;

import F8je6vTkTMHm5WbjEC.IPyIQcaNa8aB7drBED;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: gS59iOkCM8TpW4A2ew.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static final class C0093lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public static final Method f5964HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final C0093lEeR5KfoEr4xU5yHH7 f5965lEeR5KfoEr4xU5yHH7 = new C0093lEeR5KfoEr4xU5yHH7();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final Method f5966s3fjYDxWOUexjjVgyA;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(parameterTypes, "getParameterTypes(...)");
                    if (pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(IPyIQcaNa8aB7drBED.IPyIQcaNa8aB7drBED(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            f5966s3fjYDxWOUexjjVgyA = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f5964HJFh0TGMpafqLE9haL = method;
        }
    }

    public void lEeR5KfoEr4xU5yHH7(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(th, "cause");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(th2, "exception");
        Method method = C0093lEeR5KfoEr4xU5yHH7.f5966s3fjYDxWOUexjjVgyA;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
