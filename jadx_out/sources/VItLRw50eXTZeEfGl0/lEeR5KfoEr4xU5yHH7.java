package VItLRw50eXTZeEfGl0;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class lEeR5KfoEr4xU5yHH7 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final ThreadLocal f1821lEeR5KfoEr4xU5yHH7 = new ThreadLocal();

    public static double[] Acstmh57AKoSEkEFNJ() {
        ThreadLocal threadLocal = f1821lEeR5KfoEr4xU5yHH7;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int HJFh0TGMpafqLE9haL(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static int IPyIQcaNa8aB7drBED(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static int KYHag8HRDlnO3X9zmZ(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int TCyPEKSzIyweCN5yp1(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(iAlpha2, iAlpha);
        return Color.argb(iKYHag8HRDlnO3X9zmZ, IPyIQcaNa8aB7drBED(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iKYHag8HRDlnO3X9zmZ), IPyIQcaNa8aB7drBED(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iKYHag8HRDlnO3X9zmZ), IPyIQcaNa8aB7drBED(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iKYHag8HRDlnO3X9zmZ));
    }

    public static int Z9WdNiOsPR0y54zHW4(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void husNiw3snxdgZPAGJm(int i, double[] dArr) {
        lEeR5KfoEr4xU5yHH7(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static int pbVGzGjWvY2LDXC8vo(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    public static int s3fjYDxWOUexjjVgyA(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(pbVGzGjWvY2LDXC8vo((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), pbVGzGjWvY2LDXC8vo((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), pbVGzGjWvY2LDXC8vo((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static double zZKhbgvUfsK4AEX3r0(int i) {
        double[] dArrAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ();
        husNiw3snxdgZPAGJm(i, dArrAcstmh57AKoSEkEFNJ);
        return dArrAcstmh57AKoSEkEFNJ[1] / 100.0d;
    }
}
