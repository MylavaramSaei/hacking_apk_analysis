package LFGi8lLul9XOP250o9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class TCyPEKSzIyweCN5yp1 extends KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public int f909lEeR5KfoEr4xU5yHH7 = 0;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static final int[] f908s3fjYDxWOUexjjVgyA = {1};

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final int[] f907HJFh0TGMpafqLE9haL = {1, 0};

    @Override // LFGi8lLul9XOP250o9.KYHag8HRDlnO3X9zmZ
    public com.google.android.material.carousel.s3fjYDxWOUexjjVgyA HJFh0TGMpafqLE9haL(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, View view) {
        float fZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.zZKhbgvUfsK4AEX3r0();
        if (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ()) {
            fZZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
        }
        RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).topMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ()) {
            f = ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).leftMargin + ((ViewGroup.MarginLayoutParams) oANkd3mP6AYvwbNLJM).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float fIPyIQcaNa8aB7drBED = com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(view.getContext()) + f2;
        float fTCyPEKSzIyweCN5yp1 = com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view.getContext()) + f2;
        float fMin = Math.min(measuredHeight + f2, fZZKhbgvUfsK4AEX3r0);
        float fLEeR5KfoEr4xU5yHH7 = ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7((measuredHeight / 3.0f) + f2, com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(view.getContext()) + f2, com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view.getContext()) + f2);
        float f3 = (fMin + fLEeR5KfoEr4xU5yHH7) / 2.0f;
        int[] iArrLEeR5KfoEr4xU5yHH7 = f908s3fjYDxWOUexjjVgyA;
        if (fZZKhbgvUfsK4AEX3r0 < 2.0f * fIPyIQcaNa8aB7drBED) {
            iArrLEeR5KfoEr4xU5yHH7 = new int[]{0};
        }
        int[] iArrLEeR5KfoEr4xU5yHH72 = f907HJFh0TGMpafqLE9haL;
        if (s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL() == 1) {
            iArrLEeR5KfoEr4xU5yHH7 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(iArrLEeR5KfoEr4xU5yHH7);
            iArrLEeR5KfoEr4xU5yHH72 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(iArrLEeR5KfoEr4xU5yHH72);
        }
        int[] iArr = iArrLEeR5KfoEr4xU5yHH7;
        int[] iArr2 = iArrLEeR5KfoEr4xU5yHH72;
        int iMax = (int) Math.max(1.0d, Math.floor(((fZZKhbgvUfsK4AEX3r0 - (com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(iArr2) * f3)) - (com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(iArr) * fTCyPEKSzIyweCN5yp1)) / fMin));
        int iCeil = (int) Math.ceil(fZZKhbgvUfsK4AEX3r0 / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL = lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(fZZKhbgvUfsK4AEX3r0, fLEeR5KfoEr4xU5yHH7, fIPyIQcaNa8aB7drBED, fTCyPEKSzIyweCN5yp1, iArr, f3, iArr2, fMin, iArr3);
        this.f909lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm();
        if (husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA())) {
            leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL = lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(fZZKhbgvUfsK4AEX3r0, fLEeR5KfoEr4xU5yHH7, fIPyIQcaNa8aB7drBED, fTCyPEKSzIyweCN5yp1, new int[]{leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.f913HJFh0TGMpafqLE9haL}, f3, new int[]{leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.f920zZKhbgvUfsK4AEX3r0}, fMin, new int[]{leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL.f916TCyPEKSzIyweCN5yp1});
        }
        return com.google.android.material.carousel.lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view.getContext(), f2, fZZKhbgvUfsK4AEX3r0, leer5kfoer4xu5yhh7HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya.HJFh0TGMpafqLE9haL());
    }

    public boolean husNiw3snxdgZPAGJm(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        int iHusNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm() - i;
        boolean z = iHusNiw3snxdgZPAGJm > 0 && (leer5kfoer4xu5yhh7.f913HJFh0TGMpafqLE9haL > 0 || leer5kfoer4xu5yhh7.f920zZKhbgvUfsK4AEX3r0 > 1);
        while (iHusNiw3snxdgZPAGJm > 0) {
            int i2 = leer5kfoer4xu5yhh7.f913HJFh0TGMpafqLE9haL;
            if (i2 > 0) {
                leer5kfoer4xu5yhh7.f913HJFh0TGMpafqLE9haL = i2 - 1;
            } else {
                int i3 = leer5kfoer4xu5yhh7.f920zZKhbgvUfsK4AEX3r0;
                if (i3 > 1) {
                    leer5kfoer4xu5yhh7.f920zZKhbgvUfsK4AEX3r0 = i3 - 1;
                }
            }
            iHusNiw3snxdgZPAGJm--;
        }
        return z;
    }

    @Override // LFGi8lLul9XOP250o9.KYHag8HRDlnO3X9zmZ
    public boolean zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, int i) {
        return (i < this.f909lEeR5KfoEr4xU5yHH7 && s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA() >= this.f909lEeR5KfoEr4xU5yHH7) || (i >= this.f909lEeR5KfoEr4xU5yHH7 && s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA() < this.f909lEeR5KfoEr4xU5yHH7);
    }
}
