package t1ob1jctq87uSyCpeM;

import java.lang.reflect.InvocationTargetException;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 extends gS59iOkCM8TpW4A2ew.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: t1ob1jctq87uSyCpeM.lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
    public static final class C0105lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final C0105lEeR5KfoEr4xU5yHH7 f6830lEeR5KfoEr4xU5yHH7 = new C0105lEeR5KfoEr4xU5yHH7();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final Integer f6831s3fjYDxWOUexjjVgyA;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f6831s3fjYDxWOUexjjVgyA = num;
        }
    }

    @Override // gS59iOkCM8TpW4A2ew.lEeR5KfoEr4xU5yHH7
    public void lEeR5KfoEr4xU5yHH7(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(th, "cause");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(th2, "exception");
        if (s3fjYDxWOUexjjVgyA(19)) {
            th.addSuppressed(th2);
        } else {
            super.lEeR5KfoEr4xU5yHH7(th, th2);
        }
    }

    public final boolean s3fjYDxWOUexjjVgyA(int i) {
        Integer num = C0105lEeR5KfoEr4xU5yHH7.f6831s3fjYDxWOUexjjVgyA;
        return num == null || num.intValue() >= i;
    }
}
