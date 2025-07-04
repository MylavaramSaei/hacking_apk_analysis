package A49QRPHynYLCBN0SqP;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final float[][] f34lEeR5KfoEr4xU5yHH7 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final float[][] f35s3fjYDxWOUexjjVgyA = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final float[] f33HJFh0TGMpafqLE9haL = {95.047f, 100.0f, 108.883f};

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final float[][] f36zZKhbgvUfsK4AEX3r0 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static float HJFh0TGMpafqLE9haL(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float IPyIQcaNa8aB7drBED(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }

    public static void KYHag8HRDlnO3X9zmZ(int i, float[] fArr) {
        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(Color.red(i));
        float fHusNiw3snxdgZPAGJm2 = husNiw3snxdgZPAGJm(Color.green(i));
        float fHusNiw3snxdgZPAGJm3 = husNiw3snxdgZPAGJm(Color.blue(i));
        float[][] fArr2 = f36zZKhbgvUfsK4AEX3r0;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fHusNiw3snxdgZPAGJm) + (fArr3[1] * fHusNiw3snxdgZPAGJm2) + (fArr3[2] * fHusNiw3snxdgZPAGJm3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fHusNiw3snxdgZPAGJm) + (fArr4[1] * fHusNiw3snxdgZPAGJm2) + (fArr4[2] * fHusNiw3snxdgZPAGJm3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fHusNiw3snxdgZPAGJm * fArr5[0]) + (fHusNiw3snxdgZPAGJm2 * fArr5[1]) + (fHusNiw3snxdgZPAGJm3 * fArr5[2]);
    }

    public static float TCyPEKSzIyweCN5yp1(int i) {
        float fHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(Color.red(i));
        float fHusNiw3snxdgZPAGJm2 = husNiw3snxdgZPAGJm(Color.green(i));
        float fHusNiw3snxdgZPAGJm3 = husNiw3snxdgZPAGJm(Color.blue(i));
        float[] fArr = f36zZKhbgvUfsK4AEX3r0[1];
        return (fHusNiw3snxdgZPAGJm * fArr[0]) + (fHusNiw3snxdgZPAGJm2 * fArr[1]) + (fHusNiw3snxdgZPAGJm3 * fArr[2]);
    }

    public static float husNiw3snxdgZPAGJm(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static int lEeR5KfoEr4xU5yHH7(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f33HJFh0TGMpafqLE9haL;
        return VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float s3fjYDxWOUexjjVgyA(int i) {
        return HJFh0TGMpafqLE9haL(TCyPEKSzIyweCN5yp1(i));
    }

    public static float zZKhbgvUfsK4AEX3r0(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }
}
