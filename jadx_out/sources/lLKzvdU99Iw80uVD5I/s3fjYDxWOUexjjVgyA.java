package lLKzvdU99Iw80uVD5I;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {

    public static class HJFh0TGMpafqLE9haL implements Comparator {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final boolean f6540HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Rect f6541lEeR5KfoEr4xU5yHH7 = new Rect();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final Rect f6542s3fjYDxWOUexjjVgyA = new Rect();

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final lEeR5KfoEr4xU5yHH7 f6543zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(boolean z, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f6540HJFh0TGMpafqLE9haL = z;
            this.f6543zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f6541lEeR5KfoEr4xU5yHH7;
            Rect rect2 = this.f6542s3fjYDxWOUexjjVgyA;
            this.f6543zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(obj, rect);
            this.f6543zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f6540HJFh0TGMpafqLE9haL ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f6540HJFh0TGMpafqLE9haL ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f6540HJFh0TGMpafqLE9haL ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f6540HJFh0TGMpafqLE9haL ? -1 : 1;
            }
            return 0;
        }
    }

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(Object obj, Rect rect);
    }

    /* renamed from: lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public interface InterfaceC0101s3fjYDxWOUexjjVgyA {
        int lEeR5KfoEr4xU5yHH7(Object obj);

        Object s3fjYDxWOUexjjVgyA(Object obj, int i);
    }

    public static boolean Acstmh57AKoSEkEFNJ(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object HJFh0TGMpafqLE9haL(java.lang.Object r7, lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA.InterfaceC0101s3fjYDxWOUexjjVgyA r8, lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L3b
            r1 = 33
            if (r12 == r1) goto L34
            r1 = 66
            if (r12 == r1) goto L29
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L21
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
        L1d:
            r0.offset(r2, r1)
            goto L42
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L29:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
        L30:
            r0.offset(r1, r2)
            goto L42
        L34:
            int r1 = r11.height()
            int r1 = r1 + 1
            goto L1d
        L3b:
            int r1 = r11.width()
            int r1 = r1 + 1
            goto L30
        L42:
            int r1 = r8.lEeR5KfoEr4xU5yHH7(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L4c:
            if (r2 >= r1) goto L65
            java.lang.Object r5 = r8.s3fjYDxWOUexjjVgyA(r7, r2)
            if (r5 != r10) goto L55
            goto L62
        L55:
            r9.lEeR5KfoEr4xU5yHH7(r5, r3)
            boolean r6 = IPyIQcaNa8aB7drBED(r12, r11, r3, r0)
            if (r6 == 0) goto L62
            r0.set(r3)
            r4 = r5
        L62:
            int r2 = r2 + 1
            goto L4c
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(java.lang.Object, lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA$lEeR5KfoEr4xU5yHH7, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static boolean IPyIQcaNa8aB7drBED(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!pbVGzGjWvY2LDXC8vo(rect, rect2, i)) {
            return false;
        }
        if (pbVGzGjWvY2LDXC8vo(rect, rect3, i) && !lEeR5KfoEr4xU5yHH7(i, rect, rect2, rect3)) {
            return !lEeR5KfoEr4xU5yHH7(i, rect, rect3, rect2) && TCyPEKSzIyweCN5yp1(Z9WdNiOsPR0y54zHW4(i, rect, rect2), aPyGSIylzVNKPT1Bls(i, rect, rect2)) < TCyPEKSzIyweCN5yp1(Z9WdNiOsPR0y54zHW4(i, rect, rect3), aPyGSIylzVNKPT1Bls(i, rect, rect3));
        }
        return true;
    }

    public static Object KYHag8HRDlnO3X9zmZ(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int T9PhQIpGRhE4yZDm1C(int i, Rect rect, Rect rect2) {
        return Math.max(1, hoXrIDAFrSwfShk8da(i, rect, rect2));
    }

    public static int TCyPEKSzIyweCN5yp1(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static int Z9WdNiOsPR0y54zHW4(int i, Rect rect, Rect rect2) {
        return Math.max(0, e54J8UWNHWALQNixXM(i, rect, rect2));
    }

    public static int aPyGSIylzVNKPT1Bls(int i, Rect rect, Rect rect2) {
        int iHeight;
        int i2;
        int iHeight2;
        if (i == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i2 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = rect.top + (rect.height() / 2);
                i2 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - (i2 + (iHeight2 / 2)));
    }

    public static int e54J8UWNHWALQNixXM(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static int hoXrIDAFrSwfShk8da(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    public static Object husNiw3snxdgZPAGJm(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static boolean lEeR5KfoEr4xU5yHH7(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean zS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(i, rect, rect2);
        if (s3fjYDxWOUexjjVgyA(i, rect, rect3) || !zS3fjYDxWOUexjjVgyA) {
            return false;
        }
        return !Acstmh57AKoSEkEFNJ(i, rect, rect3) || i == 17 || i == 66 || Z9WdNiOsPR0y54zHW4(i, rect, rect2) < T9PhQIpGRhE4yZDm1C(i, rect, rect3);
    }

    public static boolean pbVGzGjWvY2LDXC8vo(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean s3fjYDxWOUexjjVgyA(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Object zZKhbgvUfsK4AEX3r0(Object obj, InterfaceC0101s3fjYDxWOUexjjVgyA interfaceC0101s3fjYDxWOUexjjVgyA, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Object obj2, int i, boolean z, boolean z2) {
        int iLEeR5KfoEr4xU5yHH7 = interfaceC0101s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(obj);
        ArrayList arrayList = new ArrayList(iLEeR5KfoEr4xU5yHH7);
        for (int i2 = 0; i2 < iLEeR5KfoEr4xU5yHH7; i2++) {
            arrayList.add(interfaceC0101s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA(obj, i2));
        }
        Collections.sort(arrayList, new HJFh0TGMpafqLE9haL(z, leer5kfoer4xu5yhh7));
        if (i == 1) {
            return KYHag8HRDlnO3X9zmZ(obj2, arrayList, z2);
        }
        if (i == 2) {
            return husNiw3snxdgZPAGJm(obj2, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }
}
