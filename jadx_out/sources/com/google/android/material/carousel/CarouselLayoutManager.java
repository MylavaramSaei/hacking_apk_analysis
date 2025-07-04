package com.google.android.material.carousel;

import LFGi8lLul9XOP250o9.KYHag8HRDlnO3X9zmZ;
import LFGi8lLul9XOP250o9.husNiw3snxdgZPAGJm;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1;
import com.google.android.material.carousel.s3fjYDxWOUexjjVgyA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tmIBXGVvBsrJ7i63G2.Acstmh57AKoSEkEFNJ;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.aPyGSIylzVNKPT1Bls implements LFGi8lLul9XOP250o9.s3fjYDxWOUexjjVgyA, RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ f4949A49QRPHynYLCBN0SqP;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f4950G7AC3DWIx9i9fdanjk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public final HJFh0TGMpafqLE9haL f4951LIMtzhnLwQyigzK0KO;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f4952OUd9THiLjZndMj0qdF;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public int f4953R9SAhYMerGybF9OAjL;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public int f4954THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public com.google.android.material.carousel.HJFh0TGMpafqLE9haL f4955VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public int f4956W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public com.google.android.material.carousel.s3fjYDxWOUexjjVgyA f4957WWC27LAMFqFFBzfbNw;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public int f4958XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f4959Y43RdunnpKgpbny0lE;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public Map f4960ao3wqKm5CXFuvC0q47;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public final View.OnLayoutChangeListener f4961jCtUeU2YI1poCxWcjm;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public int f4962tXWeW0sqVddf7ZBflq;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f4963xHA29AmDt6y96AnB3t;

    public static class HJFh0TGMpafqLE9haL extends RecyclerView.hoXrIDAFrSwfShk8da {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final Paint f4964lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public List f4965s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL() {
            Paint paint = new Paint();
            this.f4964lEeR5KfoEr4xU5yHH7 = paint;
            this.f4965s3fjYDxWOUexjjVgyA = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void Acstmh57AKoSEkEFNJ(List list) {
            this.f4965s3fjYDxWOUexjjVgyA = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.hoXrIDAFrSwfShk8da
        public void pbVGzGjWvY2LDXC8vo(Canvas canvas, RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            float fSuHivzALoCSfNps0XP;
            float fUViYrxCuj6kEgG2Mva;
            float fExhPLopOJ5QWEzRjTU;
            float fQ0O8WPjPHflNoINQ2T;
            super.pbVGzGjWvY2LDXC8vo(canvas, recyclerView, wWC27LAMFqFFBzfbNw);
            this.f4964lEeR5KfoEr4xU5yHH7.setStrokeWidth(recyclerView.getResources().getDimension(tmIBXGVvBsrJ7i63G2.HJFh0TGMpafqLE9haL.f7026Z9WdNiOsPR0y54zHW4));
            for (s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL : this.f4965s3fjYDxWOUexjjVgyA) {
                this.f4964lEeR5KfoEr4xU5yHH7.setColor(VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(-65281, -16776961, hJFh0TGMpafqLE9haL.f4984HJFh0TGMpafqLE9haL));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).KYHag8HRDlnO3X9zmZ()) {
                    fSuHivzALoCSfNps0XP = hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA;
                    fUViYrxCuj6kEgG2Mva = ((CarouselLayoutManager) recyclerView.getLayoutManager()).UViYrxCuj6kEgG2Mva();
                    fExhPLopOJ5QWEzRjTU = hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA;
                    fQ0O8WPjPHflNoINQ2T = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q0O8WPjPHflNoINQ2T();
                } else {
                    fSuHivzALoCSfNps0XP = ((CarouselLayoutManager) recyclerView.getLayoutManager()).suHivzALoCSfNps0XP();
                    fUViYrxCuj6kEgG2Mva = hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA;
                    fExhPLopOJ5QWEzRjTU = ((CarouselLayoutManager) recyclerView.getLayoutManager()).exhPLopOJ5QWEzRjTU();
                    fQ0O8WPjPHflNoINQ2T = hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA;
                }
                canvas.drawLine(fSuHivzALoCSfNps0XP, fUViYrxCuj6kEgG2Mva, fExhPLopOJ5QWEzRjTU, fQ0O8WPjPHflNoINQ2T, this.f4964lEeR5KfoEr4xU5yHH7);
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends TCyPEKSzIyweCN5yp1 {
        public lEeR5KfoEr4xU5yHH7(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1
        public int G7AC3DWIx9i9fdanjk(View view, int i) {
            if (CarouselLayoutManager.this.f4955VItLRw50eXTZeEfGl0 == null || CarouselLayoutManager.this.KYHag8HRDlnO3X9zmZ()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.mhQSzVvPFnByVGnwX9(carouselLayoutManager.FtYx4GXtxwA8al5hBy(view));
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1
        public int R9SAhYMerGybF9OAjL(View view, int i) {
            if (CarouselLayoutManager.this.f4955VItLRw50eXTZeEfGl0 == null || !CarouselLayoutManager.this.KYHag8HRDlnO3X9zmZ()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.mhQSzVvPFnByVGnwX9(carouselLayoutManager.FtYx4GXtxwA8al5hBy(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0
        public PointF lEeR5KfoEr4xU5yHH7(int i) {
            return CarouselLayoutManager.this.husNiw3snxdgZPAGJm(i);
        }
    }

    public static final class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final float f4967HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final View f4968lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final float f4969s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final zZKhbgvUfsK4AEX3r0 f4970zZKhbgvUfsK4AEX3r0;

        public s3fjYDxWOUexjjVgyA(View view, float f, float f2, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f4968lEeR5KfoEr4xU5yHH7 = view;
            this.f4969s3fjYDxWOUexjjVgyA = f;
            this.f4967HJFh0TGMpafqLE9haL = f2;
            this.f4970zZKhbgvUfsK4AEX3r0 = zzkhbgvufsk4aex3r0;
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL f4971lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL f4972s3fjYDxWOUexjjVgyA;

        public zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
            tXWeW0sqVddf7ZBflq.TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL.f4987lEeR5KfoEr4xU5yHH7 <= hJFh0TGMpafqLE9haL2.f4987lEeR5KfoEr4xU5yHH7);
            this.f4971lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f4972s3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL2;
        }
    }

    public CarouselLayoutManager() {
        this(new LFGi8lLul9XOP250o9.TCyPEKSzIyweCN5yp1());
    }

    public static int EgmJdc4h5OU4spuEKW(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int INlqdFKQnSaOPxk27m(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0 || i == 0) {
            return 0;
        }
        if (this.f4955VItLRw50eXTZeEfGl0 == null) {
            BzLnH9Ew63rlrNW23o(g7AC3DWIx9i9fdanjk);
        }
        int iEgmJdc4h5OU4spuEKW = EgmJdc4h5OU4spuEKW(i, this.f4959Y43RdunnpKgpbny0lE, this.f4953R9SAhYMerGybF9OAjL, this.f4950G7AC3DWIx9i9fdanjk);
        this.f4959Y43RdunnpKgpbny0lE += iEgmJdc4h5OU4spuEKW;
        xDm0kltYAUFsNtkWXq(this.f4955VItLRw50eXTZeEfGl0);
        float fKYHag8HRDlnO3X9zmZ = this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ() / 2.0f;
        float fADbagDwlO3sAb2p0ry = ADbagDwlO3sAb2p0ry(FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0)));
        Rect rect = new Rect();
        float f = (YiiZd9BUnxc5tLzouk() ? this.f4957WWC27LAMFqFFBzfbNw.IPyIQcaNa8aB7drBED() : this.f4957WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7()).f4988s3fjYDxWOUexjjVgyA;
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < lLKzvdU99Iw80uVD5I(); i2++) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i2);
            float fAbs = Math.abs(f - qKqI9idaJHL0sOqyD4(viewAAp6BD79BhftLCnuvf, fADbagDwlO3sAb2p0ry, fKYHag8HRDlnO3X9zmZ, rect));
            if (viewAAp6BD79BhftLCnuvf != null && fAbs < f2) {
                this.f4962tXWeW0sqVddf7ZBflq = FtYx4GXtxwA8al5hBy(viewAAp6BD79BhftLCnuvf);
                f2 = fAbs;
            }
            fADbagDwlO3sAb2p0ry = RkBK3rbmyPvWiHUrac(fADbagDwlO3sAb2p0ry, this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ());
        }
        N1vPC7A5f7Unhsdkgr(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        return iEgmJdc4h5OU4spuEKW;
    }

    public static zZKhbgvUfsK4AEX3r0 TToLdubKjN4ASlJwWv(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL) list.get(i5);
            float f6 = z ? hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA : hJFh0TGMpafqLE9haL.f4987lEeR5KfoEr4xU5yHH7;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new zZKhbgvUfsK4AEX3r0((s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL) list.get(i), (s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL) list.get(i3));
    }

    private int oyZAo7y5frVexNxTMd(int i) {
        int iVzXHdKiCTh4zilt9z1 = vzXHdKiCTh4zilt9z1();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (iVzXHdKiCTh4zilt9z1 == 0) {
                return YiiZd9BUnxc5tLzouk() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return iVzXHdKiCTh4zilt9z1 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            if (iVzXHdKiCTh4zilt9z1 == 0) {
                return YiiZd9BUnxc5tLzouk() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 130) {
            return iVzXHdKiCTh4zilt9z1 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int A49QRPHynYLCBN0SqP(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4950G7AC3DWIx9i9fdanjk - this.f4953R9SAhYMerGybF9OAjL;
    }

    public final float ADbagDwlO3sAb2p0ry(int i) {
        return RkBK3rbmyPvWiHUrac(iiJlEZjcw2pMDvSjYw() - this.f4959Y43RdunnpKgpbny0lE, this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ() * i);
    }

    public final void BzLnH9Ew63rlrNW23o(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        View viewAPyGSIylzVNKPT1Bls = g7AC3DWIx9i9fdanjk.aPyGSIylzVNKPT1Bls(0);
        aUn6Hqsqw2PVM8685Z(viewAPyGSIylzVNKPT1Bls, 0, 0);
        com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL = this.f4949A49QRPHynYLCBN0SqP.HJFh0TGMpafqLE9haL(this, viewAPyGSIylzVNKPT1Bls);
        if (YiiZd9BUnxc5tLzouk()) {
            s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL = com.google.android.material.carousel.s3fjYDxWOUexjjVgyA.T9PhQIpGRhE4yZDm1C(s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL, XfvA8xAblLUDzfjNL9());
        }
        this.f4955VItLRw50eXTZeEfGl0 = com.google.android.material.carousel.HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(this, s3fjydxwouexjjvgyaHJFh0TGMpafqLE9haL);
    }

    public final int CPvkPRvSu1JpqPqzvl(int i, com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i2 = Integer.MAX_VALUE;
        for (s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL : s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm()) {
            float fKYHag8HRDlnO3X9zmZ = (i * s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ()) + (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ() / 2.0f);
            int iXfvA8xAblLUDzfjNL9 = (YiiZd9BUnxc5tLzouk() ? (int) ((XfvA8xAblLUDzfjNL9() - hJFh0TGMpafqLE9haL.f4987lEeR5KfoEr4xU5yHH7) - fKYHag8HRDlnO3X9zmZ) : (int) (fKYHag8HRDlnO3X9zmZ - hJFh0TGMpafqLE9haL.f4987lEeR5KfoEr4xU5yHH7)) - this.f4959Y43RdunnpKgpbny0lE;
            if (Math.abs(i2) > Math.abs(iXfvA8xAblLUDzfjNL9)) {
                i2 = iXfvA8xAblLUDzfjNL9;
            }
        }
        return i2;
    }

    public final float DkHm7hVHmkyvDHXSjR(float f, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.f4971lEeR5KfoEr4xU5yHH7;
        float f2 = hJFh0TGMpafqLE9haL.f4989zZKhbgvUfsK4AEX3r0;
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = zzkhbgvufsk4aex3r0.f4972s3fjYDxWOUexjjVgyA;
        return jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(f2, hJFh0TGMpafqLE9haL2.f4989zZKhbgvUfsK4AEX3r0, hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL2.f4988s3fjYDxWOUexjjVgyA, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void FI7jQXEuEg1AdcOOw7(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() <= 0 || XfvA8xAblLUDzfjNL9() <= 0.0f) {
            gpnYwZkFpQwu7zi2gb(g7AC3DWIx9i9fdanjk);
            this.f4954THTDvPxsHqMeGb512f = 0;
            return;
        }
        boolean zYiiZd9BUnxc5tLzouk = YiiZd9BUnxc5tLzouk();
        boolean z = this.f4955VItLRw50eXTZeEfGl0 == null;
        if (z) {
            BzLnH9Ew63rlrNW23o(g7AC3DWIx9i9fdanjk);
        }
        int iUWxB7TH05HzXzGqLIZ = uWxB7TH05HzXzGqLIZ(this.f4955VItLRw50eXTZeEfGl0);
        int iNjV42vQJoqlfw05NNQ = njV42vQJoqlfw05NNQ(wWC27LAMFqFFBzfbNw, this.f4955VItLRw50eXTZeEfGl0);
        this.f4953R9SAhYMerGybF9OAjL = zYiiZd9BUnxc5tLzouk ? iNjV42vQJoqlfw05NNQ : iUWxB7TH05HzXzGqLIZ;
        if (zYiiZd9BUnxc5tLzouk) {
            iNjV42vQJoqlfw05NNQ = iUWxB7TH05HzXzGqLIZ;
        }
        this.f4950G7AC3DWIx9i9fdanjk = iNjV42vQJoqlfw05NNQ;
        if (z) {
            this.f4959Y43RdunnpKgpbny0lE = iUWxB7TH05HzXzGqLIZ;
            this.f4960ao3wqKm5CXFuvC0q47 = this.f4955VItLRw50eXTZeEfGl0.pbVGzGjWvY2LDXC8vo(s3fjYDxWOUexjjVgyA(), this.f4953R9SAhYMerGybF9OAjL, this.f4950G7AC3DWIx9i9fdanjk, YiiZd9BUnxc5tLzouk());
            int i = this.f4962tXWeW0sqVddf7ZBflq;
            if (i != -1) {
                this.f4959Y43RdunnpKgpbny0lE = FK1mYOUHT5iEQP3ZJ1(i, msljfiu2GA8S2iWtz0(i));
            }
        }
        int i2 = this.f4959Y43RdunnpKgpbny0lE;
        this.f4959Y43RdunnpKgpbny0lE = i2 + EgmJdc4h5OU4spuEKW(0, i2, this.f4953R9SAhYMerGybF9OAjL, this.f4950G7AC3DWIx9i9fdanjk);
        this.f4954THTDvPxsHqMeGb512f = ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f4954THTDvPxsHqMeGb512f, 0, wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA());
        xDm0kltYAUFsNtkWXq(this.f4955VItLRw50eXTZeEfGl0);
        ao3wqKm5CXFuvC0q47(g7AC3DWIx9i9fdanjk);
        N1vPC7A5f7Unhsdkgr(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        this.f4958XzJ1BS7H9Ilbkv4eVM = s3fjYDxWOUexjjVgyA();
    }

    public final int FK1mYOUHT5iEQP3ZJ1(int i, com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return YiiZd9BUnxc5tLzouk() ? (int) (((XfvA8xAblLUDzfjNL9() - s3fjydxwouexjjvgya.IPyIQcaNa8aB7drBED().f4987lEeR5KfoEr4xU5yHH7) - (i * s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ())) - (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ() / 2.0f)) : (int) (((i * s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ()) - s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7().f4987lEeR5KfoEr4xU5yHH7) + (s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ() / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM GyWRxpdt1T8mEJXPoD() {
        return new RecyclerView.OANkd3mP6AYvwbNLJM(-2, -2);
    }

    @Override // LFGi8lLul9XOP250o9.s3fjYDxWOUexjjVgyA
    public int HJFh0TGMpafqLE9haL() {
        return this.f4956W3RZ2dTDKrKpS5Mxdk;
    }

    public final float JIhXU7AcR3dXyMdSM6(View view) {
        super.oocVJL811qFf0j0XXZ(view, new Rect());
        return KYHag8HRDlnO3X9zmZ() ? r0.centerX() : r0.centerY();
    }

    public final void K3DzFKxpDGIqdlGY4t() {
        if (this.f4963xHA29AmDt6y96AnB3t && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i = 0; i < lLKzvdU99Iw80uVD5I(); i++) {
                View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
                Log.d("CarouselLayoutManager", "item position " + FtYx4GXtxwA8al5hBy(viewAAp6BD79BhftLCnuvf) + ", center:" + JIhXU7AcR3dXyMdSM6(viewAAp6BD79BhftLCnuvf) + ", child index:" + i);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    @Override // LFGi8lLul9XOP250o9.s3fjYDxWOUexjjVgyA
    public boolean KYHag8HRDlnO3X9zmZ() {
        return this.f4952OUd9THiLjZndMj0qdF.f910lEeR5KfoEr4xU5yHH7 == 0;
    }

    public final void KYIcm5hlxje4bqExkp() {
        this.f4955VItLRw50eXTZeEfGl0 = null;
        MecTLhJ95ynyqeEob1();
    }

    public final /* synthetic */ void Kf6IFvVH2efp6249v2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: LFGi8lLul9XOP250o9.zZKhbgvUfsK4AEX3r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f921lEeR5KfoEr4xU5yHH7.KYIcm5hlxje4bqExkp();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void LFGi8lLul9XOP250o9(RecyclerView recyclerView, int i, int i2) {
        super.LFGi8lLul9XOP250o9(recyclerView, i, i2);
        fGfZ0eiHdNE5vUmzRo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int LIMtzhnLwQyigzK0KO(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4959Y43RdunnpKgpbny0lE;
    }

    public final void MfX5YxttElJdOx4uDl(RecyclerView recyclerView, int i) {
        if (KYHag8HRDlnO3X9zmZ()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    public final void N1vPC7A5f7Unhsdkgr(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        ngyAMEcy385jHG8YEQ(g7AC3DWIx9i9fdanjk);
        if (lLKzvdU99Iw80uVD5I() == 0) {
            YUDx3zHgOZWWxq2Qgs(g7AC3DWIx9i9fdanjk, this.f4954THTDvPxsHqMeGb512f - 1);
            ndQwlXNek6Yo5ZBYrV(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, this.f4954THTDvPxsHqMeGb512f);
        } else {
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0));
            int iFtYx4GXtxwA8al5hBy2 = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(lLKzvdU99Iw80uVD5I() - 1));
            YUDx3zHgOZWWxq2Qgs(g7AC3DWIx9i9fdanjk, iFtYx4GXtxwA8al5hBy - 1);
            ndQwlXNek6Yo5ZBYrV(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, iFtYx4GXtxwA8al5hBy2 + 1);
        }
        lHPkE93Dmy5iD2yQiG();
    }

    public void NdFAAYJe0jjbk44RHZ(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        e54J8UWNHWALQNixXM(null);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f4952OUd9THiLjZndMj0qdF;
        if (husniw3snxdgzpagjm == null || i != husniw3snxdgzpagjm.f910lEeR5KfoEr4xU5yHH7) {
            this.f4952OUd9THiLjZndMj0qdF = husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(this, i);
            KYIcm5hlxje4bqExkp();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean OANkd3mP6AYvwbNLJM() {
        return KYHag8HRDlnO3X9zmZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void OWyIJu8lIXxQlvLhaC(RecyclerView recyclerView, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        super.OWyIJu8lIXxQlvLhaC(recyclerView, g7AC3DWIx9i9fdanjk);
        recyclerView.removeOnLayoutChangeListener(this.f4961jCtUeU2YI1poCxWcjm);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void QW0Trt6m3nVBNaYFnP(AccessibilityEvent accessibilityEvent) {
        super.QW0Trt6m3nVBNaYFnP(accessibilityEvent);
        if (lLKzvdU99Iw80uVD5I() > 0) {
            accessibilityEvent.setFromIndex(FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0)));
            accessibilityEvent.setToIndex(FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(lLKzvdU99Iw80uVD5I() - 1)));
        }
    }

    public final void QlwekCdhwU6BfwkNVu(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Acstmh57AKoSEkEFNJ.f6919bMSdooljgH14Jgudph);
            sFPmpDxgppcnCCjn0l(typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.f6893Uj8rPa1EWADtk6Oe0S, 0));
            NdFAAYJe0jjbk44RHZ(typedArrayObtainStyledAttributes.getInt(Acstmh57AKoSEkEFNJ.A6ijtoDhsGiumnDCyI, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int Qqql9aLAyQK9tLp8QF(int i, com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        return FK1mYOUHT5iEQP3ZJ1(i, s3fjydxwouexjjvgya) - this.f4959Y43RdunnpKgpbny0lE;
    }

    public final float RkBK3rbmyPvWiHUrac(float f, float f2) {
        return YiiZd9BUnxc5tLzouk() ? f - f2 : f + f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int THTDvPxsHqMeGb512f(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4950G7AC3DWIx9i9fdanjk - this.f4953R9SAhYMerGybF9OAjL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void Tn7MuV14fPMb1UrB5h(RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(recyclerView.getContext());
        leer5kfoer4xu5yhh7.OANkd3mP6AYvwbNLJM(i);
        yuvys90eVmNOCmVGXw(leer5kfoer4xu5yhh7);
    }

    public final int UViYrxCuj6kEgG2Mva() {
        return this.f4952OUd9THiLjZndMj0qdF.Acstmh57AKoSEkEFNJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int VItLRw50eXTZeEfGl0(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0 || this.f4955VItLRw50eXTZeEfGl0 == null || s3fjYDxWOUexjjVgyA() <= 1) {
            return 0;
        }
        return (int) (osrHU7fvDp2EgxZPfM() * (this.f4955VItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1().KYHag8HRDlnO3X9zmZ() / THTDvPxsHqMeGb512f(wWC27LAMFqFFBzfbNw)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int WWC27LAMFqFFBzfbNw(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4959Y43RdunnpKgpbny0lE;
    }

    public final int XfvA8xAblLUDzfjNL9() {
        return KYHag8HRDlnO3X9zmZ() ? lEeR5KfoEr4xU5yHH7() : zZKhbgvUfsK4AEX3r0();
    }

    public final void YUDx3zHgOZWWxq2Qgs(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i) {
        float fADbagDwlO3sAb2p0ry = ADbagDwlO3sAb2p0ry(i);
        while (i >= 0) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He = tf0nfuAZUJWo4SN5He(g7AC3DWIx9i9fdanjk, fADbagDwlO3sAb2p0ry, i);
            if (hNwHJdfN8Sg5H67aR5(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4967HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4970zZKhbgvUfsK4AEX3r0)) {
                return;
            }
            fADbagDwlO3sAb2p0ry = jpEZy3U5wFkT2e9PKQ(fADbagDwlO3sAb2p0ry, this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ());
            if (!jLObTZifvCGJKb1uVO(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4967HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4970zZKhbgvUfsK4AEX3r0)) {
                vcruDMeiXYQeTlT3OI(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4968lEeR5KfoEr4xU5yHH7, 0, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He);
            }
            i--;
        }
    }

    public boolean YiiZd9BUnxc5tLzouk() {
        return KYHag8HRDlnO3X9zmZ() && Tu4WCh2gEwj8E4oHbP() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void aUn6Hqsqw2PVM8685Z(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void cni9M1Tt0N7bwq7oSh(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i, int i2) {
        if (i < 0 || i >= s3fjYDxWOUexjjVgyA()) {
            return;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He = tf0nfuAZUJWo4SN5He(g7AC3DWIx9i9fdanjk, ADbagDwlO3sAb2p0ry(i), i);
        vcruDMeiXYQeTlT3OI(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4968lEeR5KfoEr4xU5yHH7, i2, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He);
    }

    public final int exhPLopOJ5QWEzRjTU() {
        return this.f4952OUd9THiLjZndMj0qdF.IPyIQcaNa8aB7drBED();
    }

    public final void fGfZ0eiHdNE5vUmzRo() {
        int iS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA();
        int i = this.f4958XzJ1BS7H9Ilbkv4eVM;
        if (iS3fjYDxWOUexjjVgyA == i || this.f4955VItLRw50eXTZeEfGl0 == null) {
            return;
        }
        if (this.f4949A49QRPHynYLCBN0SqP.zZKhbgvUfsK4AEX3r0(this, i)) {
            KYIcm5hlxje4bqExkp();
        }
        this.f4958XzJ1BS7H9Ilbkv4eVM = iS3fjYDxWOUexjjVgyA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void g0OBkYSIvp0JYnHPjC(RecyclerView recyclerView, int i, int i2) {
        super.g0OBkYSIvp0JYnHPjC(recyclerView, i, i2);
        fGfZ0eiHdNE5vUmzRo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h6NrAcYSuIyiU1qV6F(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        super.h6NrAcYSuIyiU1qV6F(wWC27LAMFqFFBzfbNw);
        if (lLKzvdU99Iw80uVD5I() == 0) {
            this.f4954THTDvPxsHqMeGb512f = 0;
        } else {
            this.f4954THTDvPxsHqMeGb512f = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0));
        }
        lHPkE93Dmy5iD2yQiG();
    }

    public final boolean hNwHJdfN8Sg5H67aR5(float f, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        float fRkBK3rbmyPvWiHUrac = RkBK3rbmyPvWiHUrac(f, DkHm7hVHmkyvDHXSjR(f, zzkhbgvufsk4aex3r0) / 2.0f);
        if (YiiZd9BUnxc5tLzouk()) {
            if (fRkBK3rbmyPvWiHUrac <= XfvA8xAblLUDzfjNL9()) {
                return false;
            }
        } else if (fRkBK3rbmyPvWiHUrac >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean hUNDUI3oB5uci3ylnY(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iCPvkPRvSu1JpqPqzvl;
        if (this.f4955VItLRw50eXTZeEfGl0 == null || (iCPvkPRvSu1JpqPqzvl = CPvkPRvSu1JpqPqzvl(FtYx4GXtxwA8al5hBy(view), msljfiu2GA8S2iWtz0(FtYx4GXtxwA8al5hBy(view)))) == 0) {
            return false;
        }
        MfX5YxttElJdOx4uDl(recyclerView, CPvkPRvSu1JpqPqzvl(FtYx4GXtxwA8al5hBy(view), this.f4955VItLRw50eXTZeEfGl0.Acstmh57AKoSEkEFNJ(this.f4959Y43RdunnpKgpbny0lE + EgmJdc4h5OU4spuEKW(iCPvkPRvSu1JpqPqzvl, this.f4959Y43RdunnpKgpbny0lE, this.f4953R9SAhYMerGybF9OAjL, this.f4950G7AC3DWIx9i9fdanjk), this.f4953R9SAhYMerGybF9OAjL, this.f4950G7AC3DWIx9i9fdanjk)));
        return true;
    }

    public void hV7XaowQwpA0oB6Ofm(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this.f4949A49QRPHynYLCBN0SqP = kYHag8HRDlnO3X9zmZ;
        KYIcm5hlxje4bqExkp();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA
    public PointF husNiw3snxdgZPAGJm(int i) {
        if (this.f4955VItLRw50eXTZeEfGl0 == null) {
            return null;
        }
        int iQqql9aLAyQK9tLp8QF = Qqql9aLAyQK9tLp8QF(i, msljfiu2GA8S2iWtz0(i));
        return KYHag8HRDlnO3X9zmZ() ? new PointF(iQqql9aLAyQK9tLp8QF, 0.0f) : new PointF(0.0f, iQqql9aLAyQK9tLp8QF);
    }

    public final int iiJlEZjcw2pMDvSjYw() {
        return this.f4952OUd9THiLjZndMj0qdF.pbVGzGjWvY2LDXC8vo();
    }

    public final boolean jLObTZifvCGJKb1uVO(float f, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        float fJpEZy3U5wFkT2e9PKQ = jpEZy3U5wFkT2e9PKQ(f, DkHm7hVHmkyvDHXSjR(f, zzkhbgvufsk4aex3r0) / 2.0f);
        if (YiiZd9BUnxc5tLzouk()) {
            if (fJpEZy3U5wFkT2e9PKQ >= 0.0f) {
                return false;
            }
        } else if (fJpEZy3U5wFkT2e9PKQ <= XfvA8xAblLUDzfjNL9()) {
            return false;
        }
        return true;
    }

    public final float jpEZy3U5wFkT2e9PKQ(float f, float f2) {
        return YiiZd9BUnxc5tLzouk() ? f + f2 : f - f2;
    }

    @Override // LFGi8lLul9XOP250o9.s3fjYDxWOUexjjVgyA
    public int lEeR5KfoEr4xU5yHH7() {
        return O1furmptfI76BGfN0d();
    }

    public final void lHPkE93Dmy5iD2yQiG() {
        if (!this.f4963xHA29AmDt6y96AnB3t || lLKzvdU99Iw80uVD5I() < 1) {
            return;
        }
        int i = 0;
        while (i < lLKzvdU99Iw80uVD5I() - 1) {
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(i));
            int i2 = i + 1;
            int iFtYx4GXtxwA8al5hBy2 = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(i2));
            if (iFtYx4GXtxwA8al5hBy > iFtYx4GXtxwA8al5hBy2) {
                K3DzFKxpDGIqdlGY4t();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + iFtYx4GXtxwA8al5hBy + "] and child at index [" + i2 + "] had adapter position [" + iFtYx4GXtxwA8al5hBy2 + "].");
            }
            i = i2;
        }
    }

    public int mhQSzVvPFnByVGnwX9(int i) {
        return (int) (this.f4959Y43RdunnpKgpbny0lE - FK1mYOUHT5iEQP3ZJ1(i, msljfiu2GA8S2iWtz0(i)));
    }

    public final com.google.android.material.carousel.s3fjYDxWOUexjjVgyA msljfiu2GA8S2iWtz0(int i) {
        com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya;
        Map map = this.f4960ao3wqKm5CXFuvC0q47;
        return (map == null || (s3fjydxwouexjjvgya = (com.google.android.material.carousel.s3fjYDxWOUexjjVgyA) map.get(Integer.valueOf(ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, 0, Math.max(0, s3fjYDxWOUexjjVgyA() + (-1)))))) == null) ? this.f4955VItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1() : s3fjydxwouexjjvgya;
    }

    public final int nZURNaK44ts4XNCkYr() {
        return this.f4952OUd9THiLjZndMj0qdF.KYHag8HRDlnO3X9zmZ();
    }

    public final void ndQwlXNek6Yo5ZBYrV(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        float fADbagDwlO3sAb2p0ry = ADbagDwlO3sAb2p0ry(i);
        while (i < wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA()) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He = tf0nfuAZUJWo4SN5He(g7AC3DWIx9i9fdanjk, fADbagDwlO3sAb2p0ry, i);
            if (jLObTZifvCGJKb1uVO(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4967HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4970zZKhbgvUfsK4AEX3r0)) {
                return;
            }
            fADbagDwlO3sAb2p0ry = RkBK3rbmyPvWiHUrac(fADbagDwlO3sAb2p0ry, this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ());
            if (!hNwHJdfN8Sg5H67aR5(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4967HJFh0TGMpafqLE9haL, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4970zZKhbgvUfsK4AEX3r0)) {
                vcruDMeiXYQeTlT3OI(s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He.f4968lEeR5KfoEr4xU5yHH7, -1, s3fjydxwouexjjvgyaTf0nfuAZUJWo4SN5He);
            }
            i++;
        }
    }

    public final void ngyAMEcy385jHG8YEQ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        while (lLKzvdU99Iw80uVD5I() > 0) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(0);
            float fJIhXU7AcR3dXyMdSM6 = JIhXU7AcR3dXyMdSM6(viewAAp6BD79BhftLCnuvf);
            if (!hNwHJdfN8Sg5H67aR5(fJIhXU7AcR3dXyMdSM6, TToLdubKjN4ASlJwWv(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1(), fJIhXU7AcR3dXyMdSM6, true))) {
                break;
            } else {
                FXtjrf53D5B1cLsLFG(viewAAp6BD79BhftLCnuvf, g7AC3DWIx9i9fdanjk);
            }
        }
        while (lLKzvdU99Iw80uVD5I() - 1 >= 0) {
            View viewAAp6BD79BhftLCnuvf2 = aAp6BD79BhftLCnuvf(lLKzvdU99Iw80uVD5I() - 1);
            float fJIhXU7AcR3dXyMdSM62 = JIhXU7AcR3dXyMdSM6(viewAAp6BD79BhftLCnuvf2);
            if (!jLObTZifvCGJKb1uVO(fJIhXU7AcR3dXyMdSM62, TToLdubKjN4ASlJwWv(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1(), fJIhXU7AcR3dXyMdSM62, true))) {
                return;
            } else {
                FXtjrf53D5B1cLsLFG(viewAAp6BD79BhftLCnuvf2, g7AC3DWIx9i9fdanjk);
            }
        }
    }

    public final int njV42vQJoqlfw05NNQ(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, com.google.android.material.carousel.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        boolean zYiiZd9BUnxc5tLzouk = YiiZd9BUnxc5tLzouk();
        com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM = zYiiZd9BUnxc5tLzouk ? hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM() : hJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED();
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7 = zYiiZd9BUnxc5tLzouk ? s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7() : s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM.IPyIQcaNa8aB7drBED();
        int iS3fjYDxWOUexjjVgyA = (int) ((((((wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1) * s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ()) + jocVUfxESVhVJU8LoH()) * (zYiiZd9BUnxc5tLzouk ? -1.0f : 1.0f)) - (hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7.f4987lEeR5KfoEr4xU5yHH7 - iiJlEZjcw2pMDvSjYw())) + (nZURNaK44ts4XNCkYr() - hJFh0TGMpafqLE9haLLEeR5KfoEr4xU5yHH7.f4987lEeR5KfoEr4xU5yHH7));
        return zYiiZd9BUnxc5tLzouk ? Math.min(0, iS3fjYDxWOUexjjVgyA) : Math.max(0, iS3fjYDxWOUexjjVgyA);
    }

    public final void njvkblNMI9Su0OX3PB(View view, float f, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public View oOMFI1Dcqcg1BSVNty(View view, int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int iOyZAo7y5frVexNxTMd;
        if (lLKzvdU99Iw80uVD5I() == 0 || (iOyZAo7y5frVexNxTMd = oyZAo7y5frVexNxTMd(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(view);
        if (iOyZAo7y5frVexNxTMd == -1) {
            if (iFtYx4GXtxwA8al5hBy == 0) {
                return null;
            }
            cni9M1Tt0N7bwq7oSh(g7AC3DWIx9i9fdanjk, FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0)) - 1, 0);
            return qnb0B0kp1U5mzuoCqH();
        }
        if (iFtYx4GXtxwA8al5hBy == s3fjYDxWOUexjjVgyA() - 1) {
            return null;
        }
        cni9M1Tt0N7bwq7oSh(g7AC3DWIx9i9fdanjk, FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(lLKzvdU99Iw80uVD5I() - 1)) + 1, -1);
        return xtQ8QaNqF3hKvhL94g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void oXIAAdret8ERrYfuyf(RecyclerView recyclerView) {
        super.oXIAAdret8ERrYfuyf(recyclerView);
        KYIcm5hlxje4bqExkp();
        recyclerView.addOnLayoutChangeListener(this.f4961jCtUeU2YI1poCxWcjm);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void oocVJL811qFf0j0XXZ(View view, Rect rect) {
        super.oocVJL811qFf0j0XXZ(view, rect);
        float fCenterY = rect.centerY();
        if (KYHag8HRDlnO3X9zmZ()) {
            fCenterY = rect.centerX();
        }
        float fDkHm7hVHmkyvDHXSjR = DkHm7hVHmkyvDHXSjR(fCenterY, TToLdubKjN4ASlJwWv(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1(), fCenterY, true));
        float fWidth = KYHag8HRDlnO3X9zmZ() ? (rect.width() - fDkHm7hVHmkyvDHXSjR) / 2.0f : 0.0f;
        float fHeight = KYHag8HRDlnO3X9zmZ() ? 0.0f : (rect.height() - fDkHm7hVHmkyvDHXSjR) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public final float pjij9fAFhRRn230kOs(View view, float f, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.f4971lEeR5KfoEr4xU5yHH7;
        float f2 = hJFh0TGMpafqLE9haL.f4988s3fjYDxWOUexjjVgyA;
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = zzkhbgvufsk4aex3r0.f4972s3fjYDxWOUexjjVgyA;
        float fS3fjYDxWOUexjjVgyA = jsjSYEu4NPZjZxcfmI.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(f2, hJFh0TGMpafqLE9haL2.f4988s3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL.f4987lEeR5KfoEr4xU5yHH7, hJFh0TGMpafqLE9haL2.f4987lEeR5KfoEr4xU5yHH7, f);
        if (zzkhbgvufsk4aex3r0.f4972s3fjYDxWOUexjjVgyA != this.f4957WWC27LAMFqFFBzfbNw.HJFh0TGMpafqLE9haL() && zzkhbgvufsk4aex3r0.f4971lEeR5KfoEr4xU5yHH7 != this.f4957WWC27LAMFqFFBzfbNw.Acstmh57AKoSEkEFNJ()) {
            return fS3fjYDxWOUexjjVgyA;
        }
        float fZZKhbgvUfsK4AEX3r0 = this.f4952OUd9THiLjZndMj0qdF.zZKhbgvUfsK4AEX3r0((RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams()) / this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ();
        s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = zzkhbgvufsk4aex3r0.f4972s3fjYDxWOUexjjVgyA;
        return fS3fjYDxWOUexjjVgyA + ((f - hJFh0TGMpafqLE9haL3.f4987lEeR5KfoEr4xU5yHH7) * ((1.0f - hJFh0TGMpafqLE9haL3.f4984HJFh0TGMpafqLE9haL) + fZZKhbgvUfsK4AEX3r0));
    }

    public final int q0O8WPjPHflNoINQ2T() {
        return this.f4952OUd9THiLjZndMj0qdF.husNiw3snxdgZPAGJm();
    }

    public final float qKqI9idaJHL0sOqyD4(View view, float f, float f2, Rect rect) {
        float fRkBK3rbmyPvWiHUrac = RkBK3rbmyPvWiHUrac(f, f2);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv = TToLdubKjN4ASlJwWv(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1(), fRkBK3rbmyPvWiHUrac, false);
        float fPjij9fAFhRRn230kOs = pjij9fAFhRRn230kOs(view, fRkBK3rbmyPvWiHUrac, zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv);
        super.oocVJL811qFf0j0XXZ(view, rect);
        njvkblNMI9Su0OX3PB(view, fRkBK3rbmyPvWiHUrac, zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv);
        this.f4952OUd9THiLjZndMj0qdF.e54J8UWNHWALQNixXM(view, rect, f2, fPjij9fAFhRRn230kOs);
        return fPjij9fAFhRRn230kOs;
    }

    public final View qnb0B0kp1U5mzuoCqH() {
        return aAp6BD79BhftLCnuvf(YiiZd9BUnxc5tLzouk() ? lLKzvdU99Iw80uVD5I() - 1 : 0);
    }

    public void sFPmpDxgppcnCCjn0l(int i) {
        this.f4956W3RZ2dTDKrKpS5Mxdk = i;
        KYIcm5hlxje4bqExkp();
    }

    public final int suHivzALoCSfNps0XP() {
        return this.f4952OUd9THiLjZndMj0qdF.TCyPEKSzIyweCN5yp1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int tGGjvtdOhUewv2twsg(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (OANkd3mP6AYvwbNLJM()) {
            return INlqdFKQnSaOPxk27m(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        }
        return 0;
    }

    public final s3fjYDxWOUexjjVgyA tf0nfuAZUJWo4SN5He(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, float f, int i) {
        View viewAPyGSIylzVNKPT1Bls = g7AC3DWIx9i9fdanjk.aPyGSIylzVNKPT1Bls(i);
        aUn6Hqsqw2PVM8685Z(viewAPyGSIylzVNKPT1Bls, 0, 0);
        float fRkBK3rbmyPvWiHUrac = RkBK3rbmyPvWiHUrac(f, this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ() / 2.0f);
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv = TToLdubKjN4ASlJwWv(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1(), fRkBK3rbmyPvWiHUrac, false);
        return new s3fjYDxWOUexjjVgyA(viewAPyGSIylzVNKPT1Bls, fRkBK3rbmyPvWiHUrac, pjij9fAFhRRn230kOs(viewAPyGSIylzVNKPT1Bls, fRkBK3rbmyPvWiHUrac, zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv), zzkhbgvufsk4aex3r0TToLdubKjN4ASlJwWv);
    }

    public final int uWxB7TH05HzXzGqLIZ(com.google.android.material.carousel.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        boolean zYiiZd9BUnxc5tLzouk = YiiZd9BUnxc5tLzouk();
        com.google.android.material.carousel.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaIPyIQcaNa8aB7drBED = zYiiZd9BUnxc5tLzouk ? hJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED() : hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM();
        return (int) (((evSiTWao80SbJUZk9E() * (zYiiZd9BUnxc5tLzouk ? 1 : -1)) + iiJlEZjcw2pMDvSjYw()) - jpEZy3U5wFkT2e9PKQ((zYiiZd9BUnxc5tLzouk ? s3fjydxwouexjjvgyaIPyIQcaNa8aB7drBED.IPyIQcaNa8aB7drBED() : s3fjydxwouexjjvgyaIPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7()).f4987lEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgyaIPyIQcaNa8aB7drBED.KYHag8HRDlnO3X9zmZ() / 2.0f));
    }

    public final void vcruDMeiXYQeTlT3OI(View view, int i, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        float fKYHag8HRDlnO3X9zmZ = this.f4957WWC27LAMFqFFBzfbNw.KYHag8HRDlnO3X9zmZ() / 2.0f;
        Acstmh57AKoSEkEFNJ(view, i);
        float f = s3fjydxwouexjjvgya.f4967HJFh0TGMpafqLE9haL;
        this.f4952OUd9THiLjZndMj0qdF.Z9WdNiOsPR0y54zHW4(view, (int) (f - fKYHag8HRDlnO3X9zmZ), (int) (f + fKYHag8HRDlnO3X9zmZ));
        njvkblNMI9Su0OX3PB(view, s3fjydxwouexjjvgya.f4969s3fjYDxWOUexjjVgyA, s3fjydxwouexjjvgya.f4970zZKhbgvUfsK4AEX3r0);
    }

    public int vzXHdKiCTh4zilt9z1() {
        return this.f4952OUd9THiLjZndMj0qdF.f910lEeR5KfoEr4xU5yHH7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int wUKf1mNArSjssthGmN(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (zaq8hOURtfwbcX17cG()) {
            return INlqdFKQnSaOPxk27m(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        }
        return 0;
    }

    public final void xDm0kltYAUFsNtkWXq(com.google.android.material.carousel.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        int i = this.f4950G7AC3DWIx9i9fdanjk;
        int i2 = this.f4953R9SAhYMerGybF9OAjL;
        this.f4957WWC27LAMFqFFBzfbNw = i <= i2 ? YiiZd9BUnxc5tLzouk() ? hJFh0TGMpafqLE9haL.IPyIQcaNa8aB7drBED() : hJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM() : hJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(this.f4959Y43RdunnpKgpbny0lE, i2, i);
        this.f4951LIMtzhnLwQyigzK0KO.Acstmh57AKoSEkEFNJ(this.f4957WWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int xHA29AmDt6y96AnB3t(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0 || this.f4955VItLRw50eXTZeEfGl0 == null || s3fjYDxWOUexjjVgyA() <= 1) {
            return 0;
        }
        return (int) (O1furmptfI76BGfN0d() * (this.f4955VItLRw50eXTZeEfGl0.TCyPEKSzIyweCN5yp1().KYHag8HRDlnO3X9zmZ() / A49QRPHynYLCBN0SqP(wWC27LAMFqFFBzfbNw)));
    }

    public final View xtQ8QaNqF3hKvhL94g() {
        return aAp6BD79BhftLCnuvf(YiiZd9BUnxc5tLzouk() ? 0 : lLKzvdU99Iw80uVD5I() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void zQjb36M22TWHJmh54i(int i) {
        this.f4962tXWeW0sqVddf7ZBflq = i;
        if (this.f4955VItLRw50eXTZeEfGl0 == null) {
            return;
        }
        this.f4959Y43RdunnpKgpbny0lE = FK1mYOUHT5iEQP3ZJ1(i, msljfiu2GA8S2iWtz0(i));
        this.f4954THTDvPxsHqMeGb512f = ao3wqKm5CXFuvC0q47.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(i, 0, Math.max(0, s3fjYDxWOUexjjVgyA() - 1));
        xDm0kltYAUFsNtkWXq(this.f4955VItLRw50eXTZeEfGl0);
        MecTLhJ95ynyqeEob1();
    }

    @Override // LFGi8lLul9XOP250o9.s3fjYDxWOUexjjVgyA
    public int zZKhbgvUfsK4AEX3r0() {
        return osrHU7fvDp2EgxZPfM();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean zaq8hOURtfwbcX17cG() {
        return !KYHag8HRDlnO3X9zmZ();
    }

    public CarouselLayoutManager(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        this(kYHag8HRDlnO3X9zmZ, 0);
    }

    public CarouselLayoutManager(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i) {
        this.f4963xHA29AmDt6y96AnB3t = false;
        this.f4951LIMtzhnLwQyigzK0KO = new HJFh0TGMpafqLE9haL();
        this.f4954THTDvPxsHqMeGb512f = 0;
        this.f4961jCtUeU2YI1poCxWcjm = new View.OnLayoutChangeListener() { // from class: LFGi8lLul9XOP250o9.HJFh0TGMpafqLE9haL
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f906lEeR5KfoEr4xU5yHH7.Kf6IFvVH2efp6249v2(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f4962tXWeW0sqVddf7ZBflq = -1;
        this.f4956W3RZ2dTDKrKpS5Mxdk = 0;
        hV7XaowQwpA0oB6Ofm(kYHag8HRDlnO3X9zmZ);
        NdFAAYJe0jjbk44RHZ(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4963xHA29AmDt6y96AnB3t = false;
        this.f4951LIMtzhnLwQyigzK0KO = new HJFh0TGMpafqLE9haL();
        this.f4954THTDvPxsHqMeGb512f = 0;
        this.f4961jCtUeU2YI1poCxWcjm = new View.OnLayoutChangeListener() { // from class: LFGi8lLul9XOP250o9.HJFh0TGMpafqLE9haL
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f906lEeR5KfoEr4xU5yHH7.Kf6IFvVH2efp6249v2(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f4962tXWeW0sqVddf7ZBflq = -1;
        this.f4956W3RZ2dTDKrKpS5Mxdk = 0;
        hV7XaowQwpA0oB6Ofm(new LFGi8lLul9XOP250o9.TCyPEKSzIyweCN5yp1());
        QlwekCdhwU6BfwkNVu(context, attributeSet);
    }
}
