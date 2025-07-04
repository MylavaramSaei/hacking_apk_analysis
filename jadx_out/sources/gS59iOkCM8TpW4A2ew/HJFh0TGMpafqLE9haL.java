package gS59iOkCM8TpW4A2ew;

/* loaded from: classes.dex */
public abstract class HJFh0TGMpafqLE9haL {
    public static final int HJFh0TGMpafqLE9haL(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final int lEeR5KfoEr4xU5yHH7(int i, int i2, int i3) {
        return HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL(i, i3) - HJFh0TGMpafqLE9haL(i2, i3), i3);
    }

    public static final int s3fjYDxWOUexjjVgyA(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - lEeR5KfoEr4xU5yHH7(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + lEeR5KfoEr4xU5yHH7(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
