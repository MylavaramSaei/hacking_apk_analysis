package androidx.recyclerview.widget;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public int f3894DfpieXfdYs58yZAiXY;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public boolean f3895GyWRxpdt1T8mEJXPoD;

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public View[] f3896KqgKJKIWne3kz1AdHk;

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public final SparseIntArray f3897PPkm9uUfOJHHYveeLT;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public final Rect f3898ToH8yzk8U1nKT0PUfY;

    /* renamed from: XdzLv4NdAtTYoEzVzB, reason: collision with root package name */
    public boolean f3899XdzLv4NdAtTYoEzVzB;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public final SparseIntArray f3900aAp6BD79BhftLCnuvf;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public int[] f3901e2F9F6h8YJxTHwLCa0;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f3902lLKzvdU99Iw80uVD5I;

    public static abstract class HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final SparseIntArray f3904lEeR5KfoEr4xU5yHH7 = new SparseIntArray();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final SparseIntArray f3905s3fjYDxWOUexjjVgyA = new SparseIntArray();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f3903HJFh0TGMpafqLE9haL = false;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f3906zZKhbgvUfsK4AEX3r0 = false;

        public static int lEeR5KfoEr4xU5yHH7(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int HJFh0TGMpafqLE9haL(int i, int i2) {
            if (!this.f3903HJFh0TGMpafqLE9haL) {
                return husNiw3snxdgZPAGJm(i, i2);
            }
            int i3 = this.f3904lEeR5KfoEr4xU5yHH7.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(i, i2);
            this.f3904lEeR5KfoEr4xU5yHH7.put(i, iHusNiw3snxdgZPAGJm);
            return iHusNiw3snxdgZPAGJm;
        }

        public void IPyIQcaNa8aB7drBED() {
            this.f3904lEeR5KfoEr4xU5yHH7.clear();
        }

        public abstract int KYHag8HRDlnO3X9zmZ(int i);

        public void TCyPEKSzIyweCN5yp1() {
            this.f3905s3fjYDxWOUexjjVgyA.clear();
        }

        public abstract int husNiw3snxdgZPAGJm(int i, int i2);

        public int s3fjYDxWOUexjjVgyA(int i, int i2) {
            if (!this.f3906zZKhbgvUfsK4AEX3r0) {
                return zZKhbgvUfsK4AEX3r0(i, i2);
            }
            int i3 = this.f3905s3fjYDxWOUexjjVgyA.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(i, i2);
            this.f3905s3fjYDxWOUexjjVgyA.put(i, iZZKhbgvUfsK4AEX3r0);
            return iZZKhbgvUfsK4AEX3r0;
        }

        public int zZKhbgvUfsK4AEX3r0(int i, int i2) {
            int i3;
            int i4;
            int iHJFh0TGMpafqLE9haL;
            int iLEeR5KfoEr4xU5yHH7;
            if (!this.f3906zZKhbgvUfsK4AEX3r0 || (iLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(this.f3905s3fjYDxWOUexjjVgyA, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iHJFh0TGMpafqLE9haL = 0;
            } else {
                i3 = this.f3905s3fjYDxWOUexjjVgyA.get(iLEeR5KfoEr4xU5yHH7);
                i4 = iLEeR5KfoEr4xU5yHH7 + 1;
                iHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(iLEeR5KfoEr4xU5yHH7, i2) + KYHag8HRDlnO3X9zmZ(iLEeR5KfoEr4xU5yHH7);
                if (iHJFh0TGMpafqLE9haL == i2) {
                    i3++;
                    iHJFh0TGMpafqLE9haL = 0;
                }
            }
            int iKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i);
            while (i4 < i) {
                int iKYHag8HRDlnO3X9zmZ2 = KYHag8HRDlnO3X9zmZ(i4);
                iHJFh0TGMpafqLE9haL += iKYHag8HRDlnO3X9zmZ2;
                if (iHJFh0TGMpafqLE9haL == i2) {
                    i3++;
                    iHJFh0TGMpafqLE9haL = 0;
                } else if (iHJFh0TGMpafqLE9haL > i2) {
                    i3++;
                    iHJFh0TGMpafqLE9haL = iKYHag8HRDlnO3X9zmZ2;
                }
                i4++;
            }
            return iHJFh0TGMpafqLE9haL + iKYHag8HRDlnO3X9zmZ > i2 ? i3 + 1 : i3;
        }
    }

    public static final class lEeR5KfoEr4xU5yHH7 extends HJFh0TGMpafqLE9haL {
        @Override // androidx.recyclerview.widget.GridLayoutManager.HJFh0TGMpafqLE9haL
        public int KYHag8HRDlnO3X9zmZ(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.HJFh0TGMpafqLE9haL
        public int husNiw3snxdgZPAGJm(int i, int i2) {
            return i % i2;
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends RecyclerView.OANkd3mP6AYvwbNLJM {

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3907KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3908husNiw3snxdgZPAGJm;

        public s3fjYDxWOUexjjVgyA(int i, int i2) {
            super(i, i2);
            this.f3908husNiw3snxdgZPAGJm = -1;
            this.f3907KYHag8HRDlnO3X9zmZ = 0;
        }

        public int KYHag8HRDlnO3X9zmZ() {
            return this.f3907KYHag8HRDlnO3X9zmZ;
        }

        public int husNiw3snxdgZPAGJm() {
            return this.f3908husNiw3snxdgZPAGJm;
        }

        public s3fjYDxWOUexjjVgyA(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3908husNiw3snxdgZPAGJm = -1;
            this.f3907KYHag8HRDlnO3X9zmZ = 0;
        }

        public s3fjYDxWOUexjjVgyA(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3908husNiw3snxdgZPAGJm = -1;
            this.f3907KYHag8HRDlnO3X9zmZ = 0;
        }

        public s3fjYDxWOUexjjVgyA(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3908husNiw3snxdgZPAGJm = -1;
            this.f3907KYHag8HRDlnO3X9zmZ = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f3895GyWRxpdt1T8mEJXPoD = false;
        this.f3894DfpieXfdYs58yZAiXY = -1;
        this.f3897PPkm9uUfOJHHYveeLT = new SparseIntArray();
        this.f3900aAp6BD79BhftLCnuvf = new SparseIntArray();
        this.f3902lLKzvdU99Iw80uVD5I = new lEeR5KfoEr4xU5yHH7();
        this.f3898ToH8yzk8U1nKT0PUfY = new Rect();
        xGjHHD7pi4zU9rqB8A(i);
    }

    public static int[] fGfZ0eiHdNE5vUmzRo(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int A49QRPHynYLCBN0SqP(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3899XdzLv4NdAtTYoEzVzB ? DwIp64xtieSWO01xCu(wWC27LAMFqFFBzfbNw) : super.A49QRPHynYLCBN0SqP(wWC27LAMFqFFBzfbNw);
    }

    public final void C62krJOvNMwygyPVIe(View view, int i, int i2, boolean z) {
        RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
        if (z ? X3J0rTi7qZISiATDQK(view, i, i2, oANkd3mP6AYvwbNLJM) : SF66oTSCsXABfwyWiU(view, i, i2, oANkd3mP6AYvwbNLJM)) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM DfpieXfdYs58yZAiXY(Context context, AttributeSet attributeSet) {
        return new s3fjYDxWOUexjjVgyA(context, attributeSet);
    }

    public final int DwIp64xtieSWO01xCu(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() != 0 && wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() != 0) {
            vcruDMeiXYQeTlT3OI();
            View viewYUDx3zHgOZWWxq2Qgs = YUDx3zHgOZWWxq2Qgs(!suHivzALoCSfNps0XP(), true);
            View viewNdQwlXNek6Yo5ZBYrV = ndQwlXNek6Yo5ZBYrV(!suHivzALoCSfNps0XP(), true);
            if (viewYUDx3zHgOZWWxq2Qgs != null && viewNdQwlXNek6Yo5ZBYrV != null) {
                if (!suHivzALoCSfNps0XP()) {
                    return this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1, this.f3894DfpieXfdYs58yZAiXY) + 1;
                }
                int iZZKhbgvUfsK4AEX3r0 = this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewNdQwlXNek6Yo5ZBYrV) - this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewYUDx3zHgOZWWxq2Qgs);
                int iS3fjYDxWOUexjjVgyA = this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewYUDx3zHgOZWWxq2Qgs), this.f3894DfpieXfdYs58yZAiXY);
                return (int) ((iZZKhbgvUfsK4AEX3r0 / ((this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewNdQwlXNek6Yo5ZBYrV), this.f3894DfpieXfdYs58yZAiXY) - iS3fjYDxWOUexjjVgyA) + 1)) * (this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1, this.f3894DfpieXfdYs58yZAiXY) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void F8je6vTkTMHm5WbjEC(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, LinearLayoutManager.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
        int iKYHag8HRDlnO3X9zmZ = this.f3894DfpieXfdYs58yZAiXY;
        for (int i = 0; i < this.f3894DfpieXfdYs58yZAiXY && hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(wWC27LAMFqFFBzfbNw) && iKYHag8HRDlnO3X9zmZ > 0; i++) {
            int i2 = hJFh0TGMpafqLE9haL.f3998zZKhbgvUfsK4AEX3r0;
            hJFh0TGMpafqLE9haL2.lEeR5KfoEr4xU5yHH7(i2, Math.max(0, hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1));
            iKYHag8HRDlnO3X9zmZ -= this.f3902lLKzvdU99Iw80uVD5I.KYHag8HRDlnO3X9zmZ(i2);
            hJFh0TGMpafqLE9haL.f3998zZKhbgvUfsK4AEX3r0 += hJFh0TGMpafqLE9haL.f3994husNiw3snxdgZPAGJm;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void FI7jQXEuEg1AdcOOw7(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            njvkblNMI9Su0OX3PB();
        }
        super.FI7jQXEuEg1AdcOOw7(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        lHPkE93Dmy5iD2yQiG();
    }

    public final void Gnb8bi4OxTs9mCdjrR(float f, int i) {
        xDm0kltYAUFsNtkWXq(Math.max(Math.round(f * this.f3894DfpieXfdYs58yZAiXY), i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM GyWRxpdt1T8mEJXPoD() {
        return this.f3981Y43RdunnpKgpbny0lE == 0 ? new s3fjYDxWOUexjjVgyA(-2, -1) : new s3fjYDxWOUexjjVgyA(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int Jsouc4ileb8SxQhxbX(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (this.f3981Y43RdunnpKgpbny0lE == 0) {
            return this.f3894DfpieXfdYs58yZAiXY;
        }
        if (wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() < 1) {
            return 0;
        }
        return kzG5RrnKOV1EP7vx2N(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void LFGi8lLul9XOP250o9(RecyclerView recyclerView, int i, int i2) {
        this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
        this.f3902lLKzvdU99Iw80uVD5I.TCyPEKSzIyweCN5yp1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int LIMtzhnLwQyigzK0KO(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3899XdzLv4NdAtTYoEzVzB ? zs2YiFzB4StuiwN4LM(wWC27LAMFqFFBzfbNw) : super.LIMtzhnLwQyigzK0KO(wWC27LAMFqFFBzfbNw);
    }

    public final void N27OfAwH2fXszkWQey(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, LinearLayoutManager.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        boolean z = i == 1;
        int iZAfxdc0isDwDy8tX48 = ZAfxdc0isDwDy8tX48(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA);
        if (z) {
            while (iZAfxdc0isDwDy8tX48 > 0) {
                int i2 = leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA = i3;
                iZAfxdc0isDwDy8tX48 = ZAfxdc0isDwDy8tX48(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, i3);
            }
            return;
        }
        int iS3fjYDxWOUexjjVgyA = wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1;
        int i4 = leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA;
        while (i4 < iS3fjYDxWOUexjjVgyA) {
            int i5 = i4 + 1;
            int iZAfxdc0isDwDy8tX482 = ZAfxdc0isDwDy8tX48(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, i5);
            if (iZAfxdc0isDwDy8tX482 <= iZAfxdc0isDwDy8tX48) {
                break;
            }
            i4 = i5;
            iZAfxdc0isDwDy8tX48 = iZAfxdc0isDwDy8tX482;
        }
        leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA = i4;
    }

    public final void NdFAAYJe0jjbk44RHZ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f3896KqgKJKIWne3kz1AdHk[i2];
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) view.getLayoutParams();
            int iOqMDEsH1NXmNdC67iZ = OqMDEsH1NXmNdC67iZ(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, FtYx4GXtxwA8al5hBy(view));
            s3fjydxwouexjjvgya.f3907KYHag8HRDlnO3X9zmZ = iOqMDEsH1NXmNdC67iZ;
            s3fjydxwouexjjvgya.f3908husNiw3snxdgZPAGJm = i5;
            i5 += iOqMDEsH1NXmNdC67iZ;
            i2 += i4;
        }
    }

    public final int OqMDEsH1NXmNdC67iZ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            return this.f3902lLKzvdU99Iw80uVD5I.KYHag8HRDlnO3X9zmZ(i);
        }
        int i2 = this.f3897PPkm9uUfOJHHYveeLT.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iKYHag8HRDlnO3X9zmZ = g7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(i);
        if (iKYHag8HRDlnO3X9zmZ != -1) {
            return this.f3902lLKzvdU99Iw80uVD5I.KYHag8HRDlnO3X9zmZ(iKYHag8HRDlnO3X9zmZ);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void PDw1hXOtArGjUqFgpT(RecyclerView recyclerView) {
        this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
        this.f3902lLKzvdU99Iw80uVD5I.TCyPEKSzIyweCN5yp1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int THTDvPxsHqMeGb512f(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3899XdzLv4NdAtTYoEzVzB ? DwIp64xtieSWO01xCu(wWC27LAMFqFFBzfbNw) : super.THTDvPxsHqMeGb512f(wWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void UViYrxCuj6kEgG2Mva(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, LinearLayoutManager.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
        super.UViYrxCuj6kEgG2Mva(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh7, i);
        doS7eJXXKhNrHhkj53();
        if (wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() > 0 && !wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            N27OfAwH2fXszkWQey(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh7, i);
        }
        tZWbH1G760JdqEQ2Q5();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int WWC27LAMFqFFBzfbNw(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3899XdzLv4NdAtTYoEzVzB ? zs2YiFzB4StuiwN4LM(wWC27LAMFqFFBzfbNw) : super.WWC27LAMFqFFBzfbNw(wWC27LAMFqFFBzfbNw);
    }

    public final int ZAfxdc0isDwDy8tX48(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            return this.f3902lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL(i, this.f3894DfpieXfdYs58yZAiXY);
        }
        int i2 = this.f3900aAp6BD79BhftLCnuvf.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iKYHag8HRDlnO3X9zmZ = g7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(i);
        if (iKYHag8HRDlnO3X9zmZ != -1) {
            return this.f3902lLKzvdU99Iw80uVD5I.HJFh0TGMpafqLE9haL(iKYHag8HRDlnO3X9zmZ, this.f3894DfpieXfdYs58yZAiXY);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void cr99CPXhoiknALiHbq(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
        this.f3902lLKzvdU99Iw80uVD5I.TCyPEKSzIyweCN5yp1();
    }

    public final void doS7eJXXKhNrHhkj53() {
        int iOsrHU7fvDp2EgxZPfM;
        int iDFYiVi7zXozAjRciKa;
        if (q0O8WPjPHflNoINQ2T() == 1) {
            iOsrHU7fvDp2EgxZPfM = O1furmptfI76BGfN0d() - eWK41qw3g36LVd4UnS();
            iDFYiVi7zXozAjRciKa = zXY7dgnTfw9Pd9RXel();
        } else {
            iOsrHU7fvDp2EgxZPfM = osrHU7fvDp2EgxZPfM() - ctWLFN70QQINH1kyYo();
            iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa();
        }
        xDm0kltYAUFsNtkWXq(iOsrHU7fvDp2EgxZPfM - iDFYiVi7zXozAjRciKa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM e2F9F6h8YJxTHwLCa0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new s3fjYDxWOUexjjVgyA((ViewGroup.MarginLayoutParams) layoutParams) : new s3fjYDxWOUexjjVgyA(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void exhPLopOJ5QWEzRjTU(androidx.recyclerview.widget.RecyclerView.G7AC3DWIx9i9fdanjk r18, androidx.recyclerview.widget.RecyclerView.WWC27LAMFqFFBzfbNw r19, androidx.recyclerview.widget.LinearLayoutManager.HJFh0TGMpafqLE9haL r20, androidx.recyclerview.widget.LinearLayoutManager.s3fjYDxWOUexjjVgyA r21) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.exhPLopOJ5QWEzRjTU(androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk, androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw, androidx.recyclerview.widget.LinearLayoutManager$HJFh0TGMpafqLE9haL, androidx.recyclerview.widget.LinearLayoutManager$s3fjYDxWOUexjjVgyA):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void fB1XGht2x9XoIgekQ8(Rect rect, int i, int i2) {
        int iY43RdunnpKgpbny0lE;
        int iY43RdunnpKgpbny0lE2;
        if (this.f3901e2F9F6h8YJxTHwLCa0 == null) {
            super.fB1XGht2x9XoIgekQ8(rect, i, i2);
        }
        int iZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS();
        int iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa() + ctWLFN70QQINH1kyYo();
        if (this.f3981Y43RdunnpKgpbny0lE == 1) {
            iY43RdunnpKgpbny0lE2 = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i2, rect.height() + iDFYiVi7zXozAjRciKa, Kh0uC90qEEhuLdpgB9());
            int[] iArr = this.f3901e2F9F6h8YJxTHwLCa0;
            iY43RdunnpKgpbny0lE = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i, iArr[iArr.length - 1] + iZXY7dgnTfw9Pd9RXel, Pum9NZyDBKoCnecvlx());
        } else {
            iY43RdunnpKgpbny0lE = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i, rect.width() + iZXY7dgnTfw9Pd9RXel, Pum9NZyDBKoCnecvlx());
            int[] iArr2 = this.f3901e2F9F6h8YJxTHwLCa0;
            iY43RdunnpKgpbny0lE2 = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i2, iArr2[iArr2.length - 1] + iDFYiVi7zXozAjRciKa, Kh0uC90qEEhuLdpgB9());
        }
        sKvjC8bExN3ISwwWsb(iY43RdunnpKgpbny0lE, iY43RdunnpKgpbny0lE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void g0OBkYSIvp0JYnHPjC(RecyclerView recyclerView, int i, int i2) {
        this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
        this.f3902lLKzvdU99Iw80uVD5I.TCyPEKSzIyweCN5yp1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h6NrAcYSuIyiU1qV6F(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        super.h6NrAcYSuIyiU1qV6F(wWC27LAMFqFFBzfbNw);
        this.f3895GyWRxpdt1T8mEJXPoD = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h7m69eGbRk1hyaVt28(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
        this.f3902lLKzvdU99Iw80uVD5I.TCyPEKSzIyweCN5yp1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void jsjSYEu4NPZjZxcfmI(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        int iHusNiw3snxdgZPAGJm;
        int iKYHag8HRDlnO3X9zmZ;
        boolean z;
        boolean z2;
        int iKYHag8HRDlnO3X9zmZ2;
        int iHusNiw3snxdgZPAGJm2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s3fjYDxWOUexjjVgyA)) {
            super.tmIBXGVvBsrJ7i63G2(view, a49QRPHynYLCBN0SqP);
            return;
        }
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) layoutParams;
        int iKzG5RrnKOV1EP7vx2N = kzG5RrnKOV1EP7vx2N(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7());
        if (this.f3981Y43RdunnpKgpbny0lE == 0) {
            iHusNiw3snxdgZPAGJm2 = s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm();
            iKYHag8HRDlnO3X9zmZ2 = s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ();
            z = false;
            z2 = false;
            iKYHag8HRDlnO3X9zmZ = 1;
            iHusNiw3snxdgZPAGJm = iKzG5RrnKOV1EP7vx2N;
        } else {
            iHusNiw3snxdgZPAGJm = s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm();
            iKYHag8HRDlnO3X9zmZ = s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ();
            z = false;
            z2 = false;
            iKYHag8HRDlnO3X9zmZ2 = 1;
            iHusNiw3snxdgZPAGJm2 = iKzG5RrnKOV1EP7vx2N;
        }
        a49QRPHynYLCBN0SqP.DFYiVi7zXozAjRciKa(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(iHusNiw3snxdgZPAGJm2, iKYHag8HRDlnO3X9zmZ2, iHusNiw3snxdgZPAGJm, iKYHag8HRDlnO3X9zmZ, z, z2));
    }

    public final int kzG5RrnKOV1EP7vx2N(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            return this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(i, this.f3894DfpieXfdYs58yZAiXY);
        }
        int iKYHag8HRDlnO3X9zmZ = g7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(i);
        if (iKYHag8HRDlnO3X9zmZ != -1) {
            return this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(iKYHag8HRDlnO3X9zmZ, this.f3894DfpieXfdYs58yZAiXY);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final void lHPkE93Dmy5iD2yQiG() {
        this.f3897PPkm9uUfOJHHYveeLT.clear();
        this.f3900aAp6BD79BhftLCnuvf.clear();
    }

    public final void lt7h1o1AOZnumGhu4A(View view, int i, boolean z) {
        int iToH8yzk8U1nKT0PUfY;
        int iToH8yzk8U1nKT0PUfY2;
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) view.getLayoutParams();
        Rect rect = s3fjydxwouexjjvgya.f4110s3fjYDxWOUexjjVgyA;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).topMargin + ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).leftMargin + ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).rightMargin;
        int iME1LtznhpIx0fyYau1 = mE1LtznhpIx0fyYau1(s3fjydxwouexjjvgya.f3908husNiw3snxdgZPAGJm, s3fjydxwouexjjvgya.f3907KYHag8HRDlnO3X9zmZ);
        if (this.f3981Y43RdunnpKgpbny0lE == 1) {
            iToH8yzk8U1nKT0PUfY2 = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(iME1LtznhpIx0fyYau1, i, i3, ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).width, false);
            iToH8yzk8U1nKT0PUfY = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(this.f3971G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da(), ZJNyOIPL0usMs2xSAn(), i2, ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).height, true);
        } else {
            int iToH8yzk8U1nKT0PUfY3 = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(iME1LtznhpIx0fyYau1, i, i2, ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).height, false);
            int iToH8yzk8U1nKT0PUfY4 = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(this.f3971G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da(), iQCvttGuB7nx4r7kMP(), i3, ((ViewGroup.MarginLayoutParams) s3fjydxwouexjjvgya).width, true);
            iToH8yzk8U1nKT0PUfY = iToH8yzk8U1nKT0PUfY3;
            iToH8yzk8U1nKT0PUfY2 = iToH8yzk8U1nKT0PUfY4;
        }
        C62krJOvNMwygyPVIe(view, iToH8yzk8U1nKT0PUfY2, iToH8yzk8U1nKT0PUfY, z);
    }

    public int mE1LtznhpIx0fyYau1(int i, int i2) {
        if (this.f3981Y43RdunnpKgpbny0lE != 1 || !nZURNaK44ts4XNCkYr()) {
            int[] iArr = this.f3901e2F9F6h8YJxTHwLCa0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3901e2F9F6h8YJxTHwLCa0;
        int i3 = this.f3894DfpieXfdYs58yZAiXY;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final void njvkblNMI9Su0OX3PB() {
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        for (int i = 0; i < iLLKzvdU99Iw80uVD5I; i++) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = (s3fjYDxWOUexjjVgyA) aAp6BD79BhftLCnuvf(i).getLayoutParams();
            int iLEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
            this.f3897PPkm9uUfOJHHYveeLT.put(iLEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.KYHag8HRDlnO3X9zmZ());
            this.f3900aAp6BD79BhftLCnuvf.put(iLEeR5KfoEr4xU5yHH7, s3fjydxwouexjjvgya.husNiw3snxdgZPAGJm());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View oOMFI1Dcqcg1BSVNty(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.G7AC3DWIx9i9fdanjk r26, androidx.recyclerview.widget.RecyclerView.WWC27LAMFqFFBzfbNw r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.oOMFI1Dcqcg1BSVNty(android.view.View, int, androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk, androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void qKqI9idaJHL0sOqyD4(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.qKqI9idaJHL0sOqyD4(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean sTkWmhpZ5b1ArQIw4K(RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        return oANkd3mP6AYvwbNLJM instanceof s3fjYDxWOUexjjVgyA;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int tGGjvtdOhUewv2twsg(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        doS7eJXXKhNrHhkj53();
        tZWbH1G760JdqEQ2Q5();
        return super.tGGjvtdOhUewv2twsg(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public final void tZWbH1G760JdqEQ2Q5() {
        View[] viewArr = this.f3896KqgKJKIWne3kz1AdHk;
        if (viewArr == null || viewArr.length != this.f3894DfpieXfdYs58yZAiXY) {
            this.f3896KqgKJKIWne3kz1AdHk = new View[this.f3894DfpieXfdYs58yZAiXY];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean w9kKjxxNBwNcD4xB6O() {
        return this.f3983jCtUeU2YI1poCxWcjm == null && !this.f3895GyWRxpdt1T8mEJXPoD;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int wUKf1mNArSjssthGmN(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        doS7eJXXKhNrHhkj53();
        tZWbH1G760JdqEQ2Q5();
        return super.wUKf1mNArSjssthGmN(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public final void xDm0kltYAUFsNtkWXq(int i) {
        this.f3901e2F9F6h8YJxTHwLCa0 = fGfZ0eiHdNE5vUmzRo(this.f3901e2F9F6h8YJxTHwLCa0, this.f3894DfpieXfdYs58yZAiXY, i);
    }

    public void xGjHHD7pi4zU9rqB8A(int i) {
        if (i == this.f3894DfpieXfdYs58yZAiXY) {
            return;
        }
        this.f3895GyWRxpdt1T8mEJXPoD = true;
        if (i >= 1) {
            this.f3894DfpieXfdYs58yZAiXY = i;
            this.f3902lLKzvdU99Iw80uVD5I.IPyIQcaNa8aB7drBED();
            MecTLhJ95ynyqeEob1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View xtQ8QaNqF3hKvhL94g(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, int i2, int i3) {
        vcruDMeiXYQeTlT3OI();
        int iT9PhQIpGRhE4yZDm1C = this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        int iPbVGzGjWvY2LDXC8vo = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(viewAAp6BD79BhftLCnuvf);
            if (iFtYx4GXtxwA8al5hBy >= 0 && iFtYx4GXtxwA8al5hBy < i3 && ZAfxdc0isDwDy8tX48(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, iFtYx4GXtxwA8al5hBy) == 0) {
                if (((RecyclerView.OANkd3mP6AYvwbNLJM) viewAAp6BD79BhftLCnuvf.getLayoutParams()).HJFh0TGMpafqLE9haL()) {
                    if (view2 == null) {
                        view2 = viewAAp6BD79BhftLCnuvf;
                    }
                } else {
                    if (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf) < iPbVGzGjWvY2LDXC8vo && this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf) >= iT9PhQIpGRhE4yZDm1C) {
                        return viewAAp6BD79BhftLCnuvf;
                    }
                    if (view == null) {
                        view = viewAAp6BD79BhftLCnuvf;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int zcy2NNbtVXgoGQbfuq(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (this.f3981Y43RdunnpKgpbny0lE == 1) {
            return this.f3894DfpieXfdYs58yZAiXY;
        }
        if (wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() < 1) {
            return 0;
        }
        return kzG5RrnKOV1EP7vx2N(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1) + 1;
    }

    public final int zs2YiFzB4StuiwN4LM(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() != 0 && wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() != 0) {
            vcruDMeiXYQeTlT3OI();
            boolean zSuHivzALoCSfNps0XP = suHivzALoCSfNps0XP();
            View viewYUDx3zHgOZWWxq2Qgs = YUDx3zHgOZWWxq2Qgs(!zSuHivzALoCSfNps0XP, true);
            View viewNdQwlXNek6Yo5ZBYrV = ndQwlXNek6Yo5ZBYrV(!zSuHivzALoCSfNps0XP, true);
            if (viewYUDx3zHgOZWWxq2Qgs != null && viewNdQwlXNek6Yo5ZBYrV != null) {
                int iS3fjYDxWOUexjjVgyA = this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewYUDx3zHgOZWWxq2Qgs), this.f3894DfpieXfdYs58yZAiXY);
                int iS3fjYDxWOUexjjVgyA2 = this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewNdQwlXNek6Yo5ZBYrV), this.f3894DfpieXfdYs58yZAiXY);
                int iMax = this.f3970A49QRPHynYLCBN0SqP ? Math.max(0, ((this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1, this.f3894DfpieXfdYs58yZAiXY) + 1) - Math.max(iS3fjYDxWOUexjjVgyA, iS3fjYDxWOUexjjVgyA2)) - 1) : Math.max(0, Math.min(iS3fjYDxWOUexjjVgyA, iS3fjYDxWOUexjjVgyA2));
                if (zSuHivzALoCSfNps0XP) {
                    return Math.round((iMax * (Math.abs(this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewNdQwlXNek6Yo5ZBYrV) - this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewYUDx3zHgOZWWxq2Qgs)) / ((this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewNdQwlXNek6Yo5ZBYrV), this.f3894DfpieXfdYs58yZAiXY) - this.f3902lLKzvdU99Iw80uVD5I.s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy(viewYUDx3zHgOZWWxq2Qgs), this.f3894DfpieXfdYs58yZAiXY)) + 1))) + (this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() - this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewYUDx3zHgOZWWxq2Qgs)));
                }
                return iMax;
            }
        }
        return 0;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3895GyWRxpdt1T8mEJXPoD = false;
        this.f3894DfpieXfdYs58yZAiXY = -1;
        this.f3897PPkm9uUfOJHHYveeLT = new SparseIntArray();
        this.f3900aAp6BD79BhftLCnuvf = new SparseIntArray();
        this.f3902lLKzvdU99Iw80uVD5I = new lEeR5KfoEr4xU5yHH7();
        this.f3898ToH8yzk8U1nKT0PUfY = new Rect();
        xGjHHD7pi4zU9rqB8A(RecyclerView.aPyGSIylzVNKPT1Bls.ayduHasC7VpxsVXE0T(context, attributeSet, i, i2).f4194s3fjYDxWOUexjjVgyA);
    }
}
