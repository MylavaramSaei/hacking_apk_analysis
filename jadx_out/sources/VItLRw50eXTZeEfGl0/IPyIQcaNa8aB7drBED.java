package VItLRw50eXTZeEfGl0;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED {

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f1798lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f1799s3fjYDxWOUexjjVgyA;
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public char f1800lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final float[] f1801s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(char c, float[] fArr) {
            this.f1800lEeR5KfoEr4xU5yHH7 = c;
            this.f1801s3fjYDxWOUexjjVgyA = fArr;
        }

        public static void KYHag8HRDlnO3X9zmZ(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = ((-f) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((f3 * dCos) + (d11 * dSin)) / d6;
            double d13 = (((-f3) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                KYHag8HRDlnO3X9zmZ(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan22 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            husNiw3snxdgZPAGJm(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan22);
        }

        public static void TCyPEKSzIyweCN5yp1(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, Path path) {
            IPyIQcaNa8aB7drBED.IPyIQcaNa8aB7drBED(s3fjydxwouexjjvgyaArr, path);
        }

        public static void husNiw3snxdgZPAGJm(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / iCeil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < iCeil) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                dSin = dSin;
                d21 = d25;
                d15 = d15;
                dCos = dCos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                iCeil = iCeil;
                d22 = d26;
                d10 = d3;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void zZKhbgvUfsK4AEX3r0(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            boolean z = false;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c4 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i3 = i4;
                        int i5 = i3 + 2;
                        int i6 = i3 + 3;
                        int i7 = i3 + 4;
                        int i8 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8]);
                        f15 = fArr2[i7];
                        float f19 = fArr2[i8];
                        float f20 = fArr2[i5];
                        float f21 = fArr2[i6];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i3 = i4;
                        path.lineTo(fArr2[i3], f16);
                        f15 = fArr2[i3];
                    } else if (c3 == 'Q') {
                        i3 = i4;
                        int i9 = i3 + 1;
                        int i10 = i3 + 2;
                        int i11 = i3 + 3;
                        path.quadTo(fArr2[i3], fArr2[i9], fArr2[i10], fArr2[i11]);
                        float f22 = fArr2[i3];
                        float f23 = fArr2[i9];
                        f15 = fArr2[i10];
                        f16 = fArr2[i11];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i3 = i4;
                        path.lineTo(f15, fArr2[i3]);
                        f16 = fArr2[i3];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                path.rLineTo(fArr2[i4], 0.0f);
                                f15 += fArr2[i4];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i4]);
                                    f4 = fArr2[i4];
                                } else if (c3 == 'L') {
                                    int i12 = i4 + 1;
                                    path.lineTo(fArr2[i4], fArr2[i12]);
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i12];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i4 + 1];
                                    if (i4 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    float f25 = f15;
                                    int i13 = i4 + 1;
                                    int i14 = i4 + 2;
                                    int i15 = i4 + 3;
                                    path.cubicTo(f25, f24, fArr2[i4], fArr2[i13], fArr2[i14], fArr2[i15]);
                                    f = fArr2[i4];
                                    f2 = fArr2[i13];
                                    f15 = fArr2[i14];
                                    f16 = fArr2[i15];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i16 = i4 + 1;
                                    path.quadTo(f15, f16, fArr2[i4], fArr2[i16]);
                                    i3 = i4;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = fArr2[i4];
                                    f16 = fArr2[i16];
                                } else if (c3 == 'l') {
                                    int i17 = i4 + 1;
                                    path.rLineTo(fArr2[i4], fArr2[i17]);
                                    f15 += fArr2[i4];
                                    f4 = fArr2[i17];
                                } else if (c3 == 'm') {
                                    float f26 = fArr2[i4];
                                    f15 += f26;
                                    float f27 = fArr2[i4 + 1];
                                    f16 += f27;
                                    if (i4 > 0) {
                                        path.rLineTo(f26, f27);
                                    } else {
                                        path.rMoveTo(f26, f27);
                                        i3 = i4;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        float f28 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f28;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i18 = i4 + 1;
                                    int i19 = i4 + 2;
                                    int i20 = i4 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i4], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f = fArr2[i4] + f15;
                                    f2 = fArr2[i18] + f16;
                                    f15 += fArr2[i19];
                                    f3 = fArr2[i20];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i21 = i4 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i4], fArr2[i21]);
                                    float f29 = f7 + f15;
                                    float f30 = f8 + f16;
                                    f15 += fArr2[i4];
                                    f16 += fArr2[i21];
                                    f12 = f30;
                                    f11 = f29;
                                }
                                f16 += f4;
                            } else {
                                int i22 = i4 + 1;
                                int i23 = i4 + 2;
                                int i24 = i4 + 3;
                                path.rQuadTo(fArr2[i4], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f = fArr2[i4] + f15;
                                f2 = fArr2[i22] + f16;
                                f15 += fArr2[i23];
                                f3 = fArr2[i24];
                            }
                            i3 = i4;
                        } else {
                            int i25 = i4 + 2;
                            int i26 = i4 + 3;
                            int i27 = i4 + 4;
                            int i28 = i4 + 5;
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                            f = fArr2[i25] + f15;
                            f2 = fArr2[i26] + f16;
                            f15 += fArr2[i27];
                            f3 = fArr2[i28];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i3 = i4;
                    } else {
                        int i29 = i4 + 5;
                        int i30 = i4 + 6;
                        i3 = i4;
                        KYHag8HRDlnO3X9zmZ(path, f15, f16, fArr2[i29] + f15, fArr2[i30] + f16, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f15 += fArr2[i29];
                        f16 += fArr2[i30];
                    }
                    i4 = i3 + i2;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    i3 = i4;
                    int i31 = i3 + 5;
                    int i32 = i3 + 6;
                    KYHag8HRDlnO3X9zmZ(path, f15, f16, fArr2[i31], fArr2[i32], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f15 = fArr2[i31];
                    f16 = fArr2[i32];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }
    }

    public static s3fjYDxWOUexjjVgyA[] HJFh0TGMpafqLE9haL(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(str, i2);
            String strTrim = str.substring(i, iTCyPEKSzIyweCN5yp1).trim();
            if (!strTrim.isEmpty()) {
                lEeR5KfoEr4xU5yHH7(arrayList, strTrim.charAt(0), KYHag8HRDlnO3X9zmZ(strTrim));
            }
            i = iTCyPEKSzIyweCN5yp1;
            i2 = iTCyPEKSzIyweCN5yp1 + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            lEeR5KfoEr4xU5yHH7(arrayList, str.charAt(i), new float[0]);
        }
        return (s3fjYDxWOUexjjVgyA[]) arrayList.toArray(new s3fjYDxWOUexjjVgyA[0]);
    }

    public static void IPyIQcaNa8aB7drBED(s3fjYDxWOUexjjVgyA[] s3fjydxwouexjjvgyaArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya : s3fjydxwouexjjvgyaArr) {
            s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(path, fArr, c, s3fjydxwouexjjvgya.f1800lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.f1801s3fjYDxWOUexjjVgyA);
            c = s3fjydxwouexjjvgya.f1800lEeR5KfoEr4xU5yHH7;
        }
    }

    public static float[] KYHag8HRDlnO3X9zmZ(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                husNiw3snxdgZPAGJm(str, i, leer5kfoer4xu5yhh7);
                int i3 = leer5kfoer4xu5yhh7.f1798lEeR5KfoEr4xU5yHH7;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = leer5kfoer4xu5yhh7.f1799s3fjYDxWOUexjjVgyA ? i3 : i3 + 1;
            }
            return s3fjYDxWOUexjjVgyA(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    public static int TCyPEKSzIyweCN5yp1(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[LOOP:0: B:3:0x0007->B:24:0x0037, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void husNiw3snxdgZPAGJm(java.lang.String r8, int r9, VItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7 r10) {
        /*
            r0 = 0
            r10.f1799s3fjYDxWOUexjjVgyA = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3a
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L34
        L27:
            r10.f1799s3fjYDxWOUexjjVgyA = r7
        L29:
            r2 = r0
            r4 = r7
            goto L34
        L2c:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            goto L27
        L31:
            r2 = r0
            goto L34
        L33:
            r2 = r7
        L34:
            if (r4 == 0) goto L37
            goto L3a
        L37:
            int r1 = r1 + 1
            goto L7
        L3a:
            r10.f1798lEeR5KfoEr4xU5yHH7 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: VItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm(java.lang.String, int, VItLRw50eXTZeEfGl0.IPyIQcaNa8aB7drBED$lEeR5KfoEr4xU5yHH7):void");
    }

    public static void lEeR5KfoEr4xU5yHH7(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new s3fjYDxWOUexjjVgyA(c, fArr));
    }

    public static float[] s3fjYDxWOUexjjVgyA(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static Path zZKhbgvUfsK4AEX3r0(String str) {
        Path path = new Path();
        try {
            s3fjYDxWOUexjjVgyA.TCyPEKSzIyweCN5yp1(HJFh0TGMpafqLE9haL(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }
}
