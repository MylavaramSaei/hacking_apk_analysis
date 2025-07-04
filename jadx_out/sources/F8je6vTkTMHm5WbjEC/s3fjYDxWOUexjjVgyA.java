package F8je6vTkTMHm5WbjEC;

import java.util.List;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends F8je6vTkTMHm5WbjEC.lEeR5KfoEr4xU5yHH7 implements List {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f132lEeR5KfoEr4xU5yHH7 = new lEeR5KfoEr4xU5yHH7(null);

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public final void HJFh0TGMpafqLE9haL(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final void lEeR5KfoEr4xU5yHH7(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void s3fjYDxWOUexjjVgyA(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final int zZKhbgvUfsK4AEX3r0(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }
}
