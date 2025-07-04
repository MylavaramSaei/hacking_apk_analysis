package cni9M1Tt0N7bwq7oSh;

/* loaded from: classes.dex */
public abstract class husNiw3snxdgZPAGJm extends zZKhbgvUfsK4AEX3r0 {
    public static int HJFh0TGMpafqLE9haL(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static HJFh0TGMpafqLE9haL husNiw3snxdgZPAGJm(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? HJFh0TGMpafqLE9haL.f4710husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7() : new HJFh0TGMpafqLE9haL(i, i2 - 1);
    }

    public static int lEeR5KfoEr4xU5yHH7(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int s3fjYDxWOUexjjVgyA(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(int i, int i2) {
        return lEeR5KfoEr4xU5yHH7.f4711zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(i, i2, -1);
    }
}
