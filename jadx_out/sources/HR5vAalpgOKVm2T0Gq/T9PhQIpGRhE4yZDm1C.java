package HR5vAalpgOKVm2T0Gq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class T9PhQIpGRhE4yZDm1C {

    public static final class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final List f356lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Object f357s3fjYDxWOUexjjVgyA;

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(Object obj, ToH8yzk8U1nKT0PUfY toH8yzk8U1nKT0PUfY) {
            hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(obj);
            this.f357s3fjYDxWOUexjjVgyA = obj;
            this.f356lEeR5KfoEr4xU5yHH7 = new ArrayList();
        }

        public lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(String str, Object obj) {
            hoXrIDAFrSwfShk8da.Acstmh57AKoSEkEFNJ(str);
            this.f356lEeR5KfoEr4xU5yHH7.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f357s3fjYDxWOUexjjVgyA.getClass().getSimpleName());
            sb.append('{');
            int size = this.f356lEeR5KfoEr4xU5yHH7.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f356lEeR5KfoEr4xU5yHH7.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(Object obj) {
        return new lEeR5KfoEr4xU5yHH7(obj, null);
    }

    public static boolean lEeR5KfoEr4xU5yHH7(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int s3fjYDxWOUexjjVgyA(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
