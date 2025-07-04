package androidx.recyclerview.widget;

import OqIo5QF00RDxUQb4qq.A49QRPHynYLCBN0SqP;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.aPyGSIylzVNKPT1Bls implements RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public int f4217A49QRPHynYLCBN0SqP;

    /* renamed from: DfpieXfdYs58yZAiXY, reason: collision with root package name */
    public int f4218DfpieXfdYs58yZAiXY;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f4219G7AC3DWIx9i9fdanjk;

    /* renamed from: GyWRxpdt1T8mEJXPoD, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f4220GyWRxpdt1T8mEJXPoD;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public int f4222LIMtzhnLwQyigzK0KO;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public boolean f4224OqIo5QF00RDxUQb4qq;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public KYHag8HRDlnO3X9zmZ[] f4226R9SAhYMerGybF9OAjL;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public final androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ f4229VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public boolean f4230W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public BitSet f4235ao3wqKm5CXFuvC0q47;

    /* renamed from: lLKzvdU99Iw80uVD5I, reason: collision with root package name */
    public int[] f4238lLKzvdU99Iw80uVD5I;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f4240xHA29AmDt6y96AnB3t;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f4233Y43RdunnpKgpbny0lE = -1;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f4231WWC27LAMFqFFBzfbNw = false;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public boolean f4227THTDvPxsHqMeGb512f = false;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public int f4223OUd9THiLjZndMj0qdF = -1;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public int f4237jCtUeU2YI1poCxWcjm = Integer.MIN_VALUE;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f4232XzJ1BS7H9Ilbkv4eVM = new zZKhbgvUfsK4AEX3r0();

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public int f4239tXWeW0sqVddf7ZBflq = 2;

    /* renamed from: e2F9F6h8YJxTHwLCa0, reason: collision with root package name */
    public final Rect f4236e2F9F6h8YJxTHwLCa0 = new Rect();

    /* renamed from: KqgKJKIWne3kz1AdHk, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f4221KqgKJKIWne3kz1AdHk = new s3fjYDxWOUexjjVgyA();

    /* renamed from: PPkm9uUfOJHHYveeLT, reason: collision with root package name */
    public boolean f4225PPkm9uUfOJHHYveeLT = false;

    /* renamed from: aAp6BD79BhftLCnuvf, reason: collision with root package name */
    public boolean f4234aAp6BD79BhftLCnuvf = true;

    /* renamed from: ToH8yzk8U1nKT0PUfY, reason: collision with root package name */
    public final Runnable f4228ToH8yzk8U1nKT0PUfY = new lEeR5KfoEr4xU5yHH7();

    public static class HJFh0TGMpafqLE9haL extends RecyclerView.OANkd3mP6AYvwbNLJM {

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f4241KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public KYHag8HRDlnO3X9zmZ f4242husNiw3snxdgZPAGJm;

        public HJFh0TGMpafqLE9haL(int i, int i2) {
            super(i, i2);
        }

        public boolean KYHag8HRDlnO3X9zmZ() {
            return this.f4241KYHag8HRDlnO3X9zmZ;
        }

        public final int husNiw3snxdgZPAGJm() {
            KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4242husNiw3snxdgZPAGJm;
            if (kYHag8HRDlnO3X9zmZ == null) {
                return -1;
            }
            return kYHag8HRDlnO3X9zmZ.f4245husNiw3snxdgZPAGJm;
        }

        public HJFh0TGMpafqLE9haL(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public HJFh0TGMpafqLE9haL(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public HJFh0TGMpafqLE9haL(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class KYHag8HRDlnO3X9zmZ {

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final int f4245husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public ArrayList f4246lEeR5KfoEr4xU5yHH7 = new ArrayList();

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f4248zZKhbgvUfsK4AEX3r0 = 0;

        public KYHag8HRDlnO3X9zmZ(int i) {
            this.f4245husNiw3snxdgZPAGJm = i;
        }

        public int Acstmh57AKoSEkEFNJ() {
            return this.f4248zZKhbgvUfsK4AEX3r0;
        }

        public void G7AC3DWIx9i9fdanjk(View view) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4242husNiw3snxdgZPAGJm = this;
            this.f4246lEeR5KfoEr4xU5yHH7.add(0, view);
            this.f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
            if (this.f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                this.f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
            }
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL() || hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA()) {
                this.f4248zZKhbgvUfsK4AEX3r0 += StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(view);
            }
        }

        public void HJFh0TGMpafqLE9haL() {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
            ArrayList arrayList = this.f4246lEeR5KfoEr4xU5yHH7;
            View view = (View) arrayList.get(arrayList.size() - 1);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            this.f4243HJFh0TGMpafqLE9haL = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(view);
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4241KYHag8HRDlnO3X9zmZ && (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = StaggeredGridLayoutManager.this.f4232XzJ1BS7H9Ilbkv4eVM.KYHag8HRDlnO3X9zmZ(hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7())) != null && leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ.f4271s3fjYDxWOUexjjVgyA == 1) {
                this.f4243HJFh0TGMpafqLE9haL += leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this.f4245husNiw3snxdgZPAGJm);
            }
        }

        public int IPyIQcaNa8aB7drBED(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iT9PhQIpGRhE4yZDm1C = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
            int iPbVGzGjWvY2LDXC8vo = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f4246lEeR5KfoEr4xU5yHH7.get(i);
                int iTCyPEKSzIyweCN5yp1 = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(view);
                int iZZKhbgvUfsK4AEX3r0 = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iTCyPEKSzIyweCN5yp1 >= iPbVGzGjWvY2LDXC8vo : iTCyPEKSzIyweCN5yp1 > iPbVGzGjWvY2LDXC8vo;
                if (!z3 ? iZZKhbgvUfsK4AEX3r0 > iT9PhQIpGRhE4yZDm1C : iZZKhbgvUfsK4AEX3r0 >= iT9PhQIpGRhE4yZDm1C) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iTCyPEKSzIyweCN5yp1 >= iT9PhQIpGRhE4yZDm1C && iZZKhbgvUfsK4AEX3r0 <= iPbVGzGjWvY2LDXC8vo) {
                            return StaggeredGridLayoutManager.this.FtYx4GXtxwA8al5hBy(view);
                        }
                    } else if (z2 || iTCyPEKSzIyweCN5yp1 < iT9PhQIpGRhE4yZDm1C || iZZKhbgvUfsK4AEX3r0 > iPbVGzGjWvY2LDXC8vo) {
                        return StaggeredGridLayoutManager.this.FtYx4GXtxwA8al5hBy(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public int KYHag8HRDlnO3X9zmZ() {
            return StaggeredGridLayoutManager.this.f4231WWC27LAMFqFFBzfbNw ? pbVGzGjWvY2LDXC8vo(this.f4246lEeR5KfoEr4xU5yHH7.size() - 1, -1, true) : pbVGzGjWvY2LDXC8vo(0, this.f4246lEeR5KfoEr4xU5yHH7.size(), true);
        }

        public int OANkd3mP6AYvwbNLJM(int i) {
            int i2 = this.f4247s3fjYDxWOUexjjVgyA;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4246lEeR5KfoEr4xU5yHH7.size() == 0) {
                return i;
            }
            zZKhbgvUfsK4AEX3r0();
            return this.f4247s3fjYDxWOUexjjVgyA;
        }

        public void R9SAhYMerGybF9OAjL() {
            View view = (View) this.f4246lEeR5KfoEr4xU5yHH7.remove(0);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4242husNiw3snxdgZPAGJm = null;
            if (this.f4246lEeR5KfoEr4xU5yHH7.size() == 0) {
                this.f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
            }
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL() || hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA()) {
                this.f4248zZKhbgvUfsK4AEX3r0 -= StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(view);
            }
            this.f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
        }

        public View T9PhQIpGRhE4yZDm1C(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4246lEeR5KfoEr4xU5yHH7.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f4246lEeR5KfoEr4xU5yHH7.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4231WWC27LAMFqFFBzfbNw && staggeredGridLayoutManager.FtYx4GXtxwA8al5hBy(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4231WWC27LAMFqFFBzfbNw && staggeredGridLayoutManager2.FtYx4GXtxwA8al5hBy(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4246lEeR5KfoEr4xU5yHH7.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f4246lEeR5KfoEr4xU5yHH7.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4231WWC27LAMFqFFBzfbNw && staggeredGridLayoutManager3.FtYx4GXtxwA8al5hBy(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4231WWC27LAMFqFFBzfbNw && staggeredGridLayoutManager4.FtYx4GXtxwA8al5hBy(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public int TCyPEKSzIyweCN5yp1() {
            return StaggeredGridLayoutManager.this.f4231WWC27LAMFqFFBzfbNw ? pbVGzGjWvY2LDXC8vo(0, this.f4246lEeR5KfoEr4xU5yHH7.size(), true) : pbVGzGjWvY2LDXC8vo(this.f4246lEeR5KfoEr4xU5yHH7.size() - 1, -1, true);
        }

        public void Y43RdunnpKgpbny0lE() {
            int size = this.f4246lEeR5KfoEr4xU5yHH7.size();
            View view = (View) this.f4246lEeR5KfoEr4xU5yHH7.remove(size - 1);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4242husNiw3snxdgZPAGJm = null;
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL() || hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA()) {
                this.f4248zZKhbgvUfsK4AEX3r0 -= StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(view);
            }
            if (size == 1) {
                this.f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
            }
            this.f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
        }

        public int Z9WdNiOsPR0y54zHW4() {
            int i = this.f4243HJFh0TGMpafqLE9haL;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            HJFh0TGMpafqLE9haL();
            return this.f4243HJFh0TGMpafqLE9haL;
        }

        public int aPyGSIylzVNKPT1Bls() {
            int i = this.f4247s3fjYDxWOUexjjVgyA;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            zZKhbgvUfsK4AEX3r0();
            return this.f4247s3fjYDxWOUexjjVgyA;
        }

        public int e54J8UWNHWALQNixXM(int i) {
            int i2 = this.f4243HJFh0TGMpafqLE9haL;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4246lEeR5KfoEr4xU5yHH7.size() == 0) {
                return i;
            }
            HJFh0TGMpafqLE9haL();
            return this.f4243HJFh0TGMpafqLE9haL;
        }

        public HJFh0TGMpafqLE9haL hoXrIDAFrSwfShk8da(View view) {
            return (HJFh0TGMpafqLE9haL) view.getLayoutParams();
        }

        public void husNiw3snxdgZPAGJm() {
            this.f4246lEeR5KfoEr4xU5yHH7.clear();
            zaq8hOURtfwbcX17cG();
            this.f4248zZKhbgvUfsK4AEX3r0 = 0;
        }

        public void lEeR5KfoEr4xU5yHH7(View view) {
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4242husNiw3snxdgZPAGJm = this;
            this.f4246lEeR5KfoEr4xU5yHH7.add(view);
            this.f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
            if (this.f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                this.f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
            }
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL() || hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA()) {
                this.f4248zZKhbgvUfsK4AEX3r0 += StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(view);
            }
        }

        public int pbVGzGjWvY2LDXC8vo(int i, int i2, boolean z) {
            return IPyIQcaNa8aB7drBED(i, i2, false, false, z);
        }

        public void s3fjYDxWOUexjjVgyA(boolean z, int i) {
            int iE54J8UWNHWALQNixXM = z ? e54J8UWNHWALQNixXM(Integer.MIN_VALUE) : OANkd3mP6AYvwbNLJM(Integer.MIN_VALUE);
            husNiw3snxdgZPAGJm();
            if (iE54J8UWNHWALQNixXM == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iE54J8UWNHWALQNixXM >= StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo()) {
                if (z || iE54J8UWNHWALQNixXM <= StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) {
                    if (i != Integer.MIN_VALUE) {
                        iE54J8UWNHWALQNixXM += i;
                    }
                    this.f4243HJFh0TGMpafqLE9haL = iE54J8UWNHWALQNixXM;
                    this.f4247s3fjYDxWOUexjjVgyA = iE54J8UWNHWALQNixXM;
                }
            }
        }

        public void sTkWmhpZ5b1ArQIw4K(int i) {
            int i2 = this.f4247s3fjYDxWOUexjjVgyA;
            if (i2 != Integer.MIN_VALUE) {
                this.f4247s3fjYDxWOUexjjVgyA = i2 + i;
            }
            int i3 = this.f4243HJFh0TGMpafqLE9haL;
            if (i3 != Integer.MIN_VALUE) {
                this.f4243HJFh0TGMpafqLE9haL = i3 + i;
            }
        }

        public void xHA29AmDt6y96AnB3t(int i) {
            this.f4247s3fjYDxWOUexjjVgyA = i;
            this.f4243HJFh0TGMpafqLE9haL = i;
        }

        public void zZKhbgvUfsK4AEX3r0() {
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ;
            View view = (View) this.f4246lEeR5KfoEr4xU5yHH7.get(0);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(view);
            this.f4247s3fjYDxWOUexjjVgyA = StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(view);
            if (hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.f4241KYHag8HRDlnO3X9zmZ && (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = StaggeredGridLayoutManager.this.f4232XzJ1BS7H9Ilbkv4eVM.KYHag8HRDlnO3X9zmZ(hJFh0TGMpafqLE9haLHoXrIDAFrSwfShk8da.lEeR5KfoEr4xU5yHH7())) != null && leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ.f4271s3fjYDxWOUexjjVgyA == -1) {
                this.f4247s3fjYDxWOUexjjVgyA -= leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this.f4245husNiw3snxdgZPAGJm);
            }
        }

        public void zaq8hOURtfwbcX17cG() {
            this.f4247s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
            this.f4243HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
        }
    }

    public static class husNiw3snxdgZPAGJm implements Parcelable {
        public static final Parcelable.Creator<husNiw3snxdgZPAGJm> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public boolean f4249Acstmh57AKoSEkEFNJ;

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f4250HJFh0TGMpafqLE9haL;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public boolean f4251IPyIQcaNa8aB7drBED;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int[] f4252KYHag8HRDlnO3X9zmZ;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public List f4253TCyPEKSzIyweCN5yp1;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f4254husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4255lEeR5KfoEr4xU5yHH7;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public boolean f4256pbVGzGjWvY2LDXC8vo;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4257s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int[] f4258zZKhbgvUfsK4AEX3r0;

        public static class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public husNiw3snxdgZPAGJm createFromParcel(Parcel parcel) {
                return new husNiw3snxdgZPAGJm(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public husNiw3snxdgZPAGJm[] newArray(int i) {
                return new husNiw3snxdgZPAGJm[i];
            }
        }

        public husNiw3snxdgZPAGJm() {
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f4258zZKhbgvUfsK4AEX3r0 = null;
            this.f4250HJFh0TGMpafqLE9haL = 0;
            this.f4255lEeR5KfoEr4xU5yHH7 = -1;
            this.f4257s3fjYDxWOUexjjVgyA = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4255lEeR5KfoEr4xU5yHH7);
            parcel.writeInt(this.f4257s3fjYDxWOUexjjVgyA);
            parcel.writeInt(this.f4250HJFh0TGMpafqLE9haL);
            if (this.f4250HJFh0TGMpafqLE9haL > 0) {
                parcel.writeIntArray(this.f4258zZKhbgvUfsK4AEX3r0);
            }
            parcel.writeInt(this.f4254husNiw3snxdgZPAGJm);
            if (this.f4254husNiw3snxdgZPAGJm > 0) {
                parcel.writeIntArray(this.f4252KYHag8HRDlnO3X9zmZ);
            }
            parcel.writeInt(this.f4251IPyIQcaNa8aB7drBED ? 1 : 0);
            parcel.writeInt(this.f4256pbVGzGjWvY2LDXC8vo ? 1 : 0);
            parcel.writeInt(this.f4249Acstmh57AKoSEkEFNJ ? 1 : 0);
            parcel.writeList(this.f4253TCyPEKSzIyweCN5yp1);
        }

        public void zZKhbgvUfsK4AEX3r0() {
            this.f4258zZKhbgvUfsK4AEX3r0 = null;
            this.f4250HJFh0TGMpafqLE9haL = 0;
            this.f4254husNiw3snxdgZPAGJm = 0;
            this.f4252KYHag8HRDlnO3X9zmZ = null;
            this.f4253TCyPEKSzIyweCN5yp1 = null;
        }

        public husNiw3snxdgZPAGJm(Parcel parcel) {
            this.f4255lEeR5KfoEr4xU5yHH7 = parcel.readInt();
            this.f4257s3fjYDxWOUexjjVgyA = parcel.readInt();
            int i = parcel.readInt();
            this.f4250HJFh0TGMpafqLE9haL = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f4258zZKhbgvUfsK4AEX3r0 = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f4254husNiw3snxdgZPAGJm = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f4252KYHag8HRDlnO3X9zmZ = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4251IPyIQcaNa8aB7drBED = parcel.readInt() == 1;
            this.f4256pbVGzGjWvY2LDXC8vo = parcel.readInt() == 1;
            this.f4249Acstmh57AKoSEkEFNJ = parcel.readInt() == 1;
            this.f4253TCyPEKSzIyweCN5yp1 = parcel.readArrayList(zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7.class.getClassLoader());
        }

        public husNiw3snxdgZPAGJm(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this.f4250HJFh0TGMpafqLE9haL = husniw3snxdgzpagjm.f4250HJFh0TGMpafqLE9haL;
            this.f4255lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm.f4255lEeR5KfoEr4xU5yHH7;
            this.f4257s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm.f4257s3fjYDxWOUexjjVgyA;
            this.f4258zZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjm.f4258zZKhbgvUfsK4AEX3r0;
            this.f4254husNiw3snxdgZPAGJm = husniw3snxdgzpagjm.f4254husNiw3snxdgZPAGJm;
            this.f4252KYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm.f4252KYHag8HRDlnO3X9zmZ;
            this.f4251IPyIQcaNa8aB7drBED = husniw3snxdgzpagjm.f4251IPyIQcaNa8aB7drBED;
            this.f4256pbVGzGjWvY2LDXC8vo = husniw3snxdgzpagjm.f4256pbVGzGjWvY2LDXC8vo;
            this.f4249Acstmh57AKoSEkEFNJ = husniw3snxdgzpagjm.f4249Acstmh57AKoSEkEFNJ;
            this.f4253TCyPEKSzIyweCN5yp1 = husniw3snxdgzpagjm.f4253TCyPEKSzIyweCN5yp1;
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.h3D8MhcyLuC2SOP1fB();
        }
    }

    public class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f4260HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int[] f4261KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f4263husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4264lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4265s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f4266zZKhbgvUfsK4AEX3r0;

        public s3fjYDxWOUexjjVgyA() {
            HJFh0TGMpafqLE9haL();
        }

        public void HJFh0TGMpafqLE9haL() {
            this.f4264lEeR5KfoEr4xU5yHH7 = -1;
            this.f4265s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
            this.f4260HJFh0TGMpafqLE9haL = false;
            this.f4266zZKhbgvUfsK4AEX3r0 = false;
            this.f4263husNiw3snxdgZPAGJm = false;
            int[] iArr = this.f4261KYHag8HRDlnO3X9zmZ;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void lEeR5KfoEr4xU5yHH7() {
            this.f4265s3fjYDxWOUexjjVgyA = this.f4260HJFh0TGMpafqLE9haL ? StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() : StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        }

        public void s3fjYDxWOUexjjVgyA(int i) {
            this.f4265s3fjYDxWOUexjjVgyA = this.f4260HJFh0TGMpafqLE9haL ? StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - i : StaggeredGridLayoutManager.this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() + i;
        }

        public void zZKhbgvUfsK4AEX3r0(KYHag8HRDlnO3X9zmZ[] kYHag8HRDlnO3X9zmZArr) {
            int length = kYHag8HRDlnO3X9zmZArr.length;
            int[] iArr = this.f4261KYHag8HRDlnO3X9zmZ;
            if (iArr == null || iArr.length < length) {
                this.f4261KYHag8HRDlnO3X9zmZ = new int[StaggeredGridLayoutManager.this.f4226R9SAhYMerGybF9OAjL.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4261KYHag8HRDlnO3X9zmZ[i] = kYHag8HRDlnO3X9zmZArr[i].OANkd3mP6AYvwbNLJM(Integer.MIN_VALUE);
            }
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int[] f4267lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public List f4268s3fjYDxWOUexjjVgyA;

        public static class lEeR5KfoEr4xU5yHH7 implements Parcelable {
            public static final Parcelable.Creator<lEeR5KfoEr4xU5yHH7> CREATOR = new C0051lEeR5KfoEr4xU5yHH7();

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public int[] f4269HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public int f4270lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public int f4271s3fjYDxWOUexjjVgyA;

            /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
            public boolean f4272zZKhbgvUfsK4AEX3r0;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
            public static class C0051lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
                public lEeR5KfoEr4xU5yHH7 createFromParcel(Parcel parcel) {
                    return new lEeR5KfoEr4xU5yHH7(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
                public lEeR5KfoEr4xU5yHH7[] newArray(int i) {
                    return new lEeR5KfoEr4xU5yHH7[i];
                }
            }

            public lEeR5KfoEr4xU5yHH7() {
            }

            public int HJFh0TGMpafqLE9haL(int i) {
                int[] iArr = this.f4269HJFh0TGMpafqLE9haL;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4270lEeR5KfoEr4xU5yHH7 + ", mGapDir=" + this.f4271s3fjYDxWOUexjjVgyA + ", mHasUnwantedGapAfter=" + this.f4272zZKhbgvUfsK4AEX3r0 + ", mGapPerSpan=" + Arrays.toString(this.f4269HJFh0TGMpafqLE9haL) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4270lEeR5KfoEr4xU5yHH7);
                parcel.writeInt(this.f4271s3fjYDxWOUexjjVgyA);
                parcel.writeInt(this.f4272zZKhbgvUfsK4AEX3r0 ? 1 : 0);
                int[] iArr = this.f4269HJFh0TGMpafqLE9haL;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4269HJFh0TGMpafqLE9haL);
                }
            }

            public lEeR5KfoEr4xU5yHH7(Parcel parcel) {
                this.f4270lEeR5KfoEr4xU5yHH7 = parcel.readInt();
                this.f4271s3fjYDxWOUexjjVgyA = parcel.readInt();
                this.f4272zZKhbgvUfsK4AEX3r0 = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f4269HJFh0TGMpafqLE9haL = iArr;
                    parcel.readIntArray(iArr);
                }
            }
        }

        public void Acstmh57AKoSEkEFNJ(int i, int i2) {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            HJFh0TGMpafqLE9haL(i3);
            int[] iArr2 = this.f4267lEeR5KfoEr4xU5yHH7;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f4267lEeR5KfoEr4xU5yHH7, i, i3, -1);
            e54J8UWNHWALQNixXM(i, i2);
        }

        public void HJFh0TGMpafqLE9haL(int i) {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f4267lEeR5KfoEr4xU5yHH7 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[aPyGSIylzVNKPT1Bls(i)];
                this.f4267lEeR5KfoEr4xU5yHH7 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4267lEeR5KfoEr4xU5yHH7;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int IPyIQcaNa8aB7drBED(int i) {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(i);
            if (iPbVGzGjWvY2LDXC8vo == -1) {
                int[] iArr2 = this.f4267lEeR5KfoEr4xU5yHH7;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4267lEeR5KfoEr4xU5yHH7.length;
            }
            int i2 = iPbVGzGjWvY2LDXC8vo + 1;
            Arrays.fill(this.f4267lEeR5KfoEr4xU5yHH7, i, i2, -1);
            return i2;
        }

        public lEeR5KfoEr4xU5yHH7 KYHag8HRDlnO3X9zmZ(int i) {
            List list = this.f4268s3fjYDxWOUexjjVgyA;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(size);
                if (leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7 == i) {
                    return leer5kfoer4xu5yhh7;
                }
            }
            return null;
        }

        public final void T9PhQIpGRhE4yZDm1C(int i, int i2) {
            List list = this.f4268s3fjYDxWOUexjjVgyA;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(size);
                int i4 = leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f4268s3fjYDxWOUexjjVgyA.remove(size);
                    } else {
                        leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7 = i4 - i2;
                    }
                }
            }
        }

        public int TCyPEKSzIyweCN5yp1(int i) {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public void Z9WdNiOsPR0y54zHW4(int i, int i2) {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            HJFh0TGMpafqLE9haL(i3);
            int[] iArr2 = this.f4267lEeR5KfoEr4xU5yHH7;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f4267lEeR5KfoEr4xU5yHH7;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            T9PhQIpGRhE4yZDm1C(i, i2);
        }

        public int aPyGSIylzVNKPT1Bls(int i) {
            int length = this.f4267lEeR5KfoEr4xU5yHH7.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public final void e54J8UWNHWALQNixXM(int i, int i2) {
            List list = this.f4268s3fjYDxWOUexjjVgyA;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(size);
                int i3 = leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7;
                if (i3 >= i) {
                    leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7 = i3 + i2;
                }
            }
        }

        public void hoXrIDAFrSwfShk8da(int i, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
            HJFh0TGMpafqLE9haL(i);
            this.f4267lEeR5KfoEr4xU5yHH7[i] = kYHag8HRDlnO3X9zmZ.f4245husNiw3snxdgZPAGJm;
        }

        public lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(int i, int i2, int i3, boolean z) {
            List list = this.f4268s3fjYDxWOUexjjVgyA;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(i4);
                int i5 = leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || leer5kfoer4xu5yhh7.f4271s3fjYDxWOUexjjVgyA == i3 || (z && leer5kfoer4xu5yhh7.f4272zZKhbgvUfsK4AEX3r0))) {
                    return leer5kfoer4xu5yhh7;
                }
            }
            return null;
        }

        public void lEeR5KfoEr4xU5yHH7(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            if (this.f4268s3fjYDxWOUexjjVgyA == null) {
                this.f4268s3fjYDxWOUexjjVgyA = new ArrayList();
            }
            int size = this.f4268s3fjYDxWOUexjjVgyA.size();
            for (int i = 0; i < size; i++) {
                lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(i);
                if (leer5kfoer4xu5yhh72.f4270lEeR5KfoEr4xU5yHH7 == leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7) {
                    this.f4268s3fjYDxWOUexjjVgyA.remove(i);
                }
                if (leer5kfoer4xu5yhh72.f4270lEeR5KfoEr4xU5yHH7 >= leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7) {
                    this.f4268s3fjYDxWOUexjjVgyA.add(i, leer5kfoer4xu5yhh7);
                    return;
                }
            }
            this.f4268s3fjYDxWOUexjjVgyA.add(leer5kfoer4xu5yhh7);
        }

        public final int pbVGzGjWvY2LDXC8vo(int i) {
            if (this.f4268s3fjYDxWOUexjjVgyA == null) {
                return -1;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i);
            if (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ != null) {
                this.f4268s3fjYDxWOUexjjVgyA.remove(leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ);
            }
            int size = this.f4268s3fjYDxWOUexjjVgyA.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(i2)).f4270lEeR5KfoEr4xU5yHH7 >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(i2);
            this.f4268s3fjYDxWOUexjjVgyA.remove(i2);
            return leer5kfoer4xu5yhh7.f4270lEeR5KfoEr4xU5yHH7;
        }

        public void s3fjYDxWOUexjjVgyA() {
            int[] iArr = this.f4267lEeR5KfoEr4xU5yHH7;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4268s3fjYDxWOUexjjVgyA = null;
        }

        public int zZKhbgvUfsK4AEX3r0(int i) {
            List list = this.f4268s3fjYDxWOUexjjVgyA;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((lEeR5KfoEr4xU5yHH7) this.f4268s3fjYDxWOUexjjVgyA.get(size)).f4270lEeR5KfoEr4xU5yHH7 >= i) {
                        this.f4268s3fjYDxWOUexjjVgyA.remove(size);
                    }
                }
            }
            return IPyIQcaNa8aB7drBED(i);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T = RecyclerView.aPyGSIylzVNKPT1Bls.ayduHasC7VpxsVXE0T(context, attributeSet, i, i2);
        ngyAMEcy385jHG8YEQ(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4193lEeR5KfoEr4xU5yHH7);
        MfX5YxttElJdOx4uDl(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4194s3fjYDxWOUexjjVgyA);
        INlqdFKQnSaOPxk27m(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4192HJFh0TGMpafqLE9haL);
        this.f4229VItLRw50eXTZeEfGl0 = new androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ();
        ADbagDwlO3sAb2p0ry();
    }

    private int RkBK3rbmyPvWiHUrac(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        return e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(wWC27LAMFqFFBzfbNw, this.f4219G7AC3DWIx9i9fdanjk, uWxB7TH05HzXzGqLIZ(!this.f4234aAp6BD79BhftLCnuvf), EgmJdc4h5OU4spuEKW(!this.f4234aAp6BD79BhftLCnuvf), this, this.f4234aAp6BD79BhftLCnuvf);
    }

    private void UViYrxCuj6kEgG2Mva(View view, int i, int i2, boolean z) {
        aPyGSIylzVNKPT1Bls(view, this.f4236e2F9F6h8YJxTHwLCa0);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).leftMargin;
        Rect rect = this.f4236e2F9F6h8YJxTHwLCa0;
        int iLHPkE93Dmy5iD2yQiG = lHPkE93Dmy5iD2yQiG(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).topMargin;
        Rect rect2 = this.f4236e2F9F6h8YJxTHwLCa0;
        int iLHPkE93Dmy5iD2yQiG2 = lHPkE93Dmy5iD2yQiG(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).bottomMargin + rect2.bottom);
        if (z ? X3J0rTi7qZISiATDQK(view, iLHPkE93Dmy5iD2yQiG, iLHPkE93Dmy5iD2yQiG2, hJFh0TGMpafqLE9haL) : SF66oTSCsXABfwyWiU(view, iLHPkE93Dmy5iD2yQiG, iLHPkE93Dmy5iD2yQiG2, hJFh0TGMpafqLE9haL)) {
            view.measure(iLHPkE93Dmy5iD2yQiG, iLHPkE93Dmy5iD2yQiG2);
        }
    }

    private int cni9M1Tt0N7bwq7oSh(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        return e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(wWC27LAMFqFFBzfbNw, this.f4219G7AC3DWIx9i9fdanjk, uWxB7TH05HzXzGqLIZ(!this.f4234aAp6BD79BhftLCnuvf), EgmJdc4h5OU4spuEKW(!this.f4234aAp6BD79BhftLCnuvf), this, this.f4234aAp6BD79BhftLCnuvf);
    }

    private int jpEZy3U5wFkT2e9PKQ(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        return e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA(wWC27LAMFqFFBzfbNw, this.f4219G7AC3DWIx9i9fdanjk, uWxB7TH05HzXzGqLIZ(!this.f4234aAp6BD79BhftLCnuvf), EgmJdc4h5OU4spuEKW(!this.f4234aAp6BD79BhftLCnuvf), this, this.f4234aAp6BD79BhftLCnuvf, this.f4227THTDvPxsHqMeGb512f);
    }

    private int ndQwlXNek6Yo5ZBYrV(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4222LIMtzhnLwQyigzK0KO == 1) ? 1 : Integer.MIN_VALUE : this.f4222LIMtzhnLwQyigzK0KO == 0 ? 1 : Integer.MIN_VALUE : this.f4222LIMtzhnLwQyigzK0KO == 1 ? -1 : Integer.MIN_VALUE : this.f4222LIMtzhnLwQyigzK0KO == 0 ? -1 : Integer.MIN_VALUE : (this.f4222LIMtzhnLwQyigzK0KO != 1 && iiJlEZjcw2pMDvSjYw()) ? -1 : 1 : (this.f4222LIMtzhnLwQyigzK0KO != 1 && iiJlEZjcw2pMDvSjYw()) ? 1 : -1;
    }

    private void qKqI9idaJHL0sOqyD4() {
        this.f4227THTDvPxsHqMeGb512f = (this.f4222LIMtzhnLwQyigzK0KO == 1 || !iiJlEZjcw2pMDvSjYw()) ? this.f4231WWC27LAMFqFFBzfbNw : !this.f4231WWC27LAMFqFFBzfbNw;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int A49QRPHynYLCBN0SqP(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return cni9M1Tt0N7bwq7oSh(wWC27LAMFqFFBzfbNw);
    }

    public final void ADbagDwlO3sAb2p0ry() {
        this.f4219G7AC3DWIx9i9fdanjk = pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(this, this.f4222LIMtzhnLwQyigzK0KO);
        this.f4240xHA29AmDt6y96AnB3t = pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(this, 1 - this.f4222LIMtzhnLwQyigzK0KO);
    }

    public int BzLnH9Ew63rlrNW23o(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0 || i == 0) {
            return 0;
        }
        YiiZd9BUnxc5tLzouk(i, wWC27LAMFqFFBzfbNw);
        int iNjV42vQJoqlfw05NNQ = njV42vQJoqlfw05NNQ(g7AC3DWIx9i9fdanjk, this.f4229VItLRw50eXTZeEfGl0, wWC27LAMFqFFBzfbNw);
        if (this.f4229VItLRw50eXTZeEfGl0.f3968s3fjYDxWOUexjjVgyA >= iNjV42vQJoqlfw05NNQ) {
            i = i < 0 ? -iNjV42vQJoqlfw05NNQ : iNjV42vQJoqlfw05NNQ;
        }
        this.f4219G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(-i);
        this.f4230W3RZ2dTDKrKpS5Mxdk = this.f4227THTDvPxsHqMeGb512f;
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA = 0;
        hNwHJdfN8Sg5H67aR5(g7AC3DWIx9i9fdanjk, kYHag8HRDlnO3X9zmZ);
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CPvkPRvSu1JpqPqzvl(androidx.recyclerview.widget.RecyclerView.G7AC3DWIx9i9fdanjk r9, androidx.recyclerview.widget.RecyclerView.WWC27LAMFqFFBzfbNw r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.CPvkPRvSu1JpqPqzvl(androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk, androidx.recyclerview.widget.RecyclerView$WWC27LAMFqFFBzfbNw, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM DfpieXfdYs58yZAiXY(Context context, AttributeSet attributeSet) {
        return new HJFh0TGMpafqLE9haL(context, attributeSet);
    }

    public final int DkHm7hVHmkyvDHXSjR(int i) {
        int iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[0].OANkd3mP6AYvwbNLJM(i);
        for (int i2 = 1; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            int iOANkd3mP6AYvwbNLJM2 = this.f4226R9SAhYMerGybF9OAjL[i2].OANkd3mP6AYvwbNLJM(i);
            if (iOANkd3mP6AYvwbNLJM2 > iOANkd3mP6AYvwbNLJM) {
                iOANkd3mP6AYvwbNLJM = iOANkd3mP6AYvwbNLJM2;
            }
        }
        return iOANkd3mP6AYvwbNLJM;
    }

    public View EgmJdc4h5OU4spuEKW(boolean z) {
        int iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        int iPbVGzGjWvY2LDXC8vo = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        View view = null;
        for (int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1; iLLKzvdU99Iw80uVD5I >= 0; iLLKzvdU99Iw80uVD5I--) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I);
            int iTCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf);
            int iZZKhbgvUfsK4AEX3r0 = this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf);
            if (iZZKhbgvUfsK4AEX3r0 > iT9PhQIpGRhE4yZDm1C && iTCyPEKSzIyweCN5yp1 < iPbVGzGjWvY2LDXC8vo) {
                if (iZZKhbgvUfsK4AEX3r0 <= iPbVGzGjWvY2LDXC8vo || !z) {
                    return viewAAp6BD79BhftLCnuvf;
                }
                if (view == null) {
                    view = viewAAp6BD79BhftLCnuvf;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean Er40JrQbOM51vCQI8w() {
        return this.f4239tXWeW0sqVddf7ZBflq != 0;
    }

    public final void F8je6vTkTMHm5WbjEC(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        boolean z;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f4220GyWRxpdt1T8mEJXPoD;
        int i = husniw3snxdgzpagjm.f4250HJFh0TGMpafqLE9haL;
        if (i > 0) {
            if (i == this.f4233Y43RdunnpKgpbny0lE) {
                for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
                    this.f4226R9SAhYMerGybF9OAjL[i2].husNiw3snxdgZPAGJm();
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = this.f4220GyWRxpdt1T8mEJXPoD;
                    int iPbVGzGjWvY2LDXC8vo = husniw3snxdgzpagjm2.f4258zZKhbgvUfsK4AEX3r0[i2];
                    if (iPbVGzGjWvY2LDXC8vo != Integer.MIN_VALUE) {
                        iPbVGzGjWvY2LDXC8vo += husniw3snxdgzpagjm2.f4256pbVGzGjWvY2LDXC8vo ? this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() : this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                    }
                    this.f4226R9SAhYMerGybF9OAjL[i2].xHA29AmDt6y96AnB3t(iPbVGzGjWvY2LDXC8vo);
                }
            } else {
                husniw3snxdgzpagjm.zZKhbgvUfsK4AEX3r0();
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm3 = this.f4220GyWRxpdt1T8mEJXPoD;
                husniw3snxdgzpagjm3.f4255lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm3.f4257s3fjYDxWOUexjjVgyA;
            }
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm4 = this.f4220GyWRxpdt1T8mEJXPoD;
        this.f4224OqIo5QF00RDxUQb4qq = husniw3snxdgzpagjm4.f4249Acstmh57AKoSEkEFNJ;
        INlqdFKQnSaOPxk27m(husniw3snxdgzpagjm4.f4251IPyIQcaNa8aB7drBED);
        qKqI9idaJHL0sOqyD4();
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm5 = this.f4220GyWRxpdt1T8mEJXPoD;
        int i3 = husniw3snxdgzpagjm5.f4255lEeR5KfoEr4xU5yHH7;
        if (i3 != -1) {
            this.f4223OUd9THiLjZndMj0qdF = i3;
            z = husniw3snxdgzpagjm5.f4256pbVGzGjWvY2LDXC8vo;
        } else {
            z = this.f4227THTDvPxsHqMeGb512f;
        }
        s3fjydxwouexjjvgya.f4260HJFh0TGMpafqLE9haL = z;
        if (husniw3snxdgzpagjm5.f4254husNiw3snxdgZPAGJm > 1) {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f4232XzJ1BS7H9Ilbkv4eVM;
            zzkhbgvufsk4aex3r0.f4267lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm5.f4252KYHag8HRDlnO3X9zmZ;
            zzkhbgvufsk4aex3r0.f4268s3fjYDxWOUexjjVgyA = husniw3snxdgzpagjm5.f4253TCyPEKSzIyweCN5yp1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void FI7jQXEuEg1AdcOOw7(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        CPvkPRvSu1JpqPqzvl(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, true);
    }

    public final void FK1mYOUHT5iEQP3ZJ1(View view, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, boolean z) {
        int iToH8yzk8U1nKT0PUfY;
        int iToH8yzk8U1nKT0PUfY2;
        if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
            if (this.f4222LIMtzhnLwQyigzK0KO != 1) {
                UViYrxCuj6kEgG2Mva(view, RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(O1furmptfI76BGfN0d(), iQCvttGuB7nx4r7kMP(), zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS(), ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).width, true), this.f4218DfpieXfdYs58yZAiXY, z);
                return;
            }
            iToH8yzk8U1nKT0PUfY = this.f4218DfpieXfdYs58yZAiXY;
        } else {
            if (this.f4222LIMtzhnLwQyigzK0KO != 1) {
                iToH8yzk8U1nKT0PUfY = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(O1furmptfI76BGfN0d(), iQCvttGuB7nx4r7kMP(), zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS(), ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).width, true);
                iToH8yzk8U1nKT0PUfY2 = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(this.f4217A49QRPHynYLCBN0SqP, ZJNyOIPL0usMs2xSAn(), 0, ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).height, false);
                UViYrxCuj6kEgG2Mva(view, iToH8yzk8U1nKT0PUfY, iToH8yzk8U1nKT0PUfY2, z);
            }
            iToH8yzk8U1nKT0PUfY = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(this.f4217A49QRPHynYLCBN0SqP, iQCvttGuB7nx4r7kMP(), 0, ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).width, false);
        }
        iToH8yzk8U1nKT0PUfY2 = RecyclerView.aPyGSIylzVNKPT1Bls.ToH8yzk8U1nKT0PUfY(osrHU7fvDp2EgxZPfM(), ZJNyOIPL0usMs2xSAn(), DFYiVi7zXozAjRciKa() + ctWLFN70QQINH1kyYo(), ((ViewGroup.MarginLayoutParams) hJFh0TGMpafqLE9haL).height, true);
        UViYrxCuj6kEgG2Mva(view, iToH8yzk8U1nKT0PUfY, iToH8yzk8U1nKT0PUfY2, z);
    }

    public final void GraqRgO5nDZP94CSeH(View view) {
        for (int i = this.f4233Y43RdunnpKgpbny0lE - 1; i >= 0; i--) {
            this.f4226R9SAhYMerGybF9OAjL[i].lEeR5KfoEr4xU5yHH7(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM GyWRxpdt1T8mEJXPoD() {
        return this.f4222LIMtzhnLwQyigzK0KO == 0 ? new HJFh0TGMpafqLE9haL(-2, -1) : new HJFh0TGMpafqLE9haL(-1, -2);
    }

    public void INlqdFKQnSaOPxk27m(boolean z) {
        e54J8UWNHWALQNixXM(null);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f4220GyWRxpdt1T8mEJXPoD;
        if (husniw3snxdgzpagjm != null && husniw3snxdgzpagjm.f4251IPyIQcaNa8aB7drBED != z) {
            husniw3snxdgzpagjm.f4251IPyIQcaNa8aB7drBED = z;
        }
        this.f4231WWC27LAMFqFFBzfbNw = z;
        MecTLhJ95ynyqeEob1();
    }

    public int JIhXU7AcR3dXyMdSM6() {
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        if (iLLKzvdU99Iw80uVD5I == 0) {
            return 0;
        }
        return FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int Jsouc4ileb8SxQhxbX(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4222LIMtzhnLwQyigzK0KO == 0 ? this.f4233Y43RdunnpKgpbny0lE : super.Jsouc4ileb8SxQhxbX(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public final void K3DzFKxpDGIqdlGY4t(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i) {
        while (lLKzvdU99Iw80uVD5I() > 0) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(0);
            if (this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf) > i || this.f4219G7AC3DWIx9i9fdanjk.OANkd3mP6AYvwbNLJM(viewAAp6BD79BhftLCnuvf) > i) {
                return;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) viewAAp6BD79BhftLCnuvf.getLayoutParams();
            if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
                    if (this.f4226R9SAhYMerGybF9OAjL[i2].f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4233Y43RdunnpKgpbny0lE; i3++) {
                    this.f4226R9SAhYMerGybF9OAjL[i3].R9SAhYMerGybF9OAjL();
                }
            } else if (hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                return;
            } else {
                hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.R9SAhYMerGybF9OAjL();
            }
            FXtjrf53D5B1cLsLFG(viewAAp6BD79BhftLCnuvf, g7AC3DWIx9i9fdanjk);
        }
    }

    public boolean KWpkmWKCm3jeG4AjIM() {
        int iE54J8UWNHWALQNixXM = this.f4226R9SAhYMerGybF9OAjL[0].e54J8UWNHWALQNixXM(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4233Y43RdunnpKgpbny0lE; i++) {
            if (this.f4226R9SAhYMerGybF9OAjL[i].e54J8UWNHWALQNixXM(Integer.MIN_VALUE) != iE54J8UWNHWALQNixXM) {
                return false;
            }
        }
        return true;
    }

    public final void KYIcm5hlxje4bqExkp(int i) {
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm = i;
        kYHag8HRDlnO3X9zmZ.f3969zZKhbgvUfsK4AEX3r0 = this.f4227THTDvPxsHqMeGb512f != (i == -1) ? -1 : 1;
    }

    public final void Kf6IFvVH2efp6249v2(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i) {
        for (int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1; iLLKzvdU99Iw80uVD5I >= 0; iLLKzvdU99Iw80uVD5I--) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I);
            if (this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf) < i || this.f4219G7AC3DWIx9i9fdanjk.zaq8hOURtfwbcX17cG(viewAAp6BD79BhftLCnuvf) < i) {
                return;
            }
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) viewAAp6BD79BhftLCnuvf.getLayoutParams();
            if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
                    if (this.f4226R9SAhYMerGybF9OAjL[i2].f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4233Y43RdunnpKgpbny0lE; i3++) {
                    this.f4226R9SAhYMerGybF9OAjL[i3].Y43RdunnpKgpbny0lE();
                }
            } else if (hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.f4246lEeR5KfoEr4xU5yHH7.size() == 1) {
                return;
            } else {
                hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.Y43RdunnpKgpbny0lE();
            }
            FXtjrf53D5B1cLsLFG(viewAAp6BD79BhftLCnuvf, g7AC3DWIx9i9fdanjk);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void LFGi8lLul9XOP250o9(RecyclerView recyclerView, int i, int i2) {
        nZURNaK44ts4XNCkYr(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int LIMtzhnLwQyigzK0KO(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return jpEZy3U5wFkT2e9PKQ(wWC27LAMFqFFBzfbNw);
    }

    public void MfX5YxttElJdOx4uDl(int i) {
        e54J8UWNHWALQNixXM(null);
        if (i != this.f4233Y43RdunnpKgpbny0lE) {
            exhPLopOJ5QWEzRjTU();
            this.f4233Y43RdunnpKgpbny0lE = i;
            this.f4235ao3wqKm5CXFuvC0q47 = new BitSet(this.f4233Y43RdunnpKgpbny0lE);
            this.f4226R9SAhYMerGybF9OAjL = new KYHag8HRDlnO3X9zmZ[this.f4233Y43RdunnpKgpbny0lE];
            for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
                this.f4226R9SAhYMerGybF9OAjL[i2] = new KYHag8HRDlnO3X9zmZ(i2);
            }
            MecTLhJ95ynyqeEob1();
        }
    }

    public final int N1vPC7A5f7Unhsdkgr(int i) {
        for (int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1; iLLKzvdU99Iw80uVD5I >= 0; iLLKzvdU99Iw80uVD5I--) {
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(iLLKzvdU99Iw80uVD5I));
            if (iFtYx4GXtxwA8al5hBy >= 0 && iFtYx4GXtxwA8al5hBy < i) {
                return iFtYx4GXtxwA8al5hBy;
            }
        }
        return 0;
    }

    public void NdFAAYJe0jjbk44RHZ(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        if (hV7XaowQwpA0oB6Ofm(wWC27LAMFqFFBzfbNw, s3fjydxwouexjjvgya) || QlwekCdhwU6BfwkNVu(wWC27LAMFqFFBzfbNw, s3fjydxwouexjjvgya)) {
            return;
        }
        s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
        s3fjydxwouexjjvgya.f4264lEeR5KfoEr4xU5yHH7 = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean OANkd3mP6AYvwbNLJM() {
        return this.f4222LIMtzhnLwQyigzK0KO == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void OWyIJu8lIXxQlvLhaC(RecyclerView recyclerView, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        super.OWyIJu8lIXxQlvLhaC(recyclerView, g7AC3DWIx9i9fdanjk);
        zWzrlx9vIdLp7FoEMD(this.f4228ToH8yzk8U1nKT0PUfY);
        for (int i = 0; i < this.f4233Y43RdunnpKgpbny0lE; i++) {
            this.f4226R9SAhYMerGybF9OAjL[i].husNiw3snxdgZPAGJm();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void PDw1hXOtArGjUqFgpT(RecyclerView recyclerView) {
        this.f4232XzJ1BS7H9Ilbkv4eVM.s3fjYDxWOUexjjVgyA();
        MecTLhJ95ynyqeEob1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void QW0Trt6m3nVBNaYFnP(AccessibilityEvent accessibilityEvent) {
        super.QW0Trt6m3nVBNaYFnP(accessibilityEvent);
        if (lLKzvdU99Iw80uVD5I() > 0) {
            View viewUWxB7TH05HzXzGqLIZ = uWxB7TH05HzXzGqLIZ(false);
            View viewEgmJdc4h5OU4spuEKW = EgmJdc4h5OU4spuEKW(false);
            if (viewUWxB7TH05HzXzGqLIZ == null || viewEgmJdc4h5OU4spuEKW == null) {
                return;
            }
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(viewUWxB7TH05HzXzGqLIZ);
            int iFtYx4GXtxwA8al5hBy2 = FtYx4GXtxwA8al5hBy(viewEgmJdc4h5OU4spuEKW);
            if (iFtYx4GXtxwA8al5hBy < iFtYx4GXtxwA8al5hBy2) {
                accessibilityEvent.setFromIndex(iFtYx4GXtxwA8al5hBy);
                accessibilityEvent.setToIndex(iFtYx4GXtxwA8al5hBy2);
            } else {
                accessibilityEvent.setFromIndex(iFtYx4GXtxwA8al5hBy2);
                accessibilityEvent.setToIndex(iFtYx4GXtxwA8al5hBy);
            }
        }
    }

    public final boolean QlwekCdhwU6BfwkNVu(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        boolean z = this.f4230W3RZ2dTDKrKpS5Mxdk;
        int iS3fjYDxWOUexjjVgyA = wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        s3fjydxwouexjjvgya.f4264lEeR5KfoEr4xU5yHH7 = z ? N1vPC7A5f7Unhsdkgr(iS3fjYDxWOUexjjVgyA) : mhQSzVvPFnByVGnwX9(iS3fjYDxWOUexjjVgyA);
        s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
        return true;
    }

    public final int Qqql9aLAyQK9tLp8QF(int i) {
        int iE54J8UWNHWALQNixXM = this.f4226R9SAhYMerGybF9OAjL[0].e54J8UWNHWALQNixXM(i);
        for (int i2 = 1; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            int iE54J8UWNHWALQNixXM2 = this.f4226R9SAhYMerGybF9OAjL[i2].e54J8UWNHWALQNixXM(i);
            if (iE54J8UWNHWALQNixXM2 < iE54J8UWNHWALQNixXM) {
                iE54J8UWNHWALQNixXM = iE54J8UWNHWALQNixXM2;
            }
        }
        return iE54J8UWNHWALQNixXM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void R9SAhYMerGybF9OAjL(int i, int i2, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        int iE54J8UWNHWALQNixXM;
        int iOANkd3mP6AYvwbNLJM;
        if (this.f4222LIMtzhnLwQyigzK0KO != 0) {
            i = i2;
        }
        if (lLKzvdU99Iw80uVD5I() == 0 || i == 0) {
            return;
        }
        YiiZd9BUnxc5tLzouk(i, wWC27LAMFqFFBzfbNw);
        int[] iArr = this.f4238lLKzvdU99Iw80uVD5I;
        if (iArr == null || iArr.length < this.f4233Y43RdunnpKgpbny0lE) {
            this.f4238lLKzvdU99Iw80uVD5I = new int[this.f4233Y43RdunnpKgpbny0lE];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4233Y43RdunnpKgpbny0lE; i4++) {
            androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4229VItLRw50eXTZeEfGl0;
            if (kYHag8HRDlnO3X9zmZ.f3969zZKhbgvUfsK4AEX3r0 == -1) {
                iE54J8UWNHWALQNixXM = kYHag8HRDlnO3X9zmZ.f3963KYHag8HRDlnO3X9zmZ;
                iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[i4].OANkd3mP6AYvwbNLJM(iE54J8UWNHWALQNixXM);
            } else {
                iE54J8UWNHWALQNixXM = this.f4226R9SAhYMerGybF9OAjL[i4].e54J8UWNHWALQNixXM(kYHag8HRDlnO3X9zmZ.f3964TCyPEKSzIyweCN5yp1);
                iOANkd3mP6AYvwbNLJM = this.f4229VItLRw50eXTZeEfGl0.f3964TCyPEKSzIyweCN5yp1;
            }
            int i5 = iE54J8UWNHWALQNixXM - iOANkd3mP6AYvwbNLJM;
            if (i5 >= 0) {
                this.f4238lLKzvdU99Iw80uVD5I[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f4238lLKzvdU99Iw80uVD5I, 0, i3);
        for (int i6 = 0; i6 < i3 && this.f4229VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7(wWC27LAMFqFFBzfbNw); i6++) {
            hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(this.f4229VItLRw50eXTZeEfGl0.f3961HJFh0TGMpafqLE9haL, this.f4238lLKzvdU99Iw80uVD5I[i6]);
            androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = this.f4229VItLRw50eXTZeEfGl0;
            kYHag8HRDlnO3X9zmZ2.f3961HJFh0TGMpafqLE9haL += kYHag8HRDlnO3X9zmZ2.f3969zZKhbgvUfsK4AEX3r0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int THTDvPxsHqMeGb512f(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return cni9M1Tt0N7bwq7oSh(wWC27LAMFqFFBzfbNw);
    }

    public final boolean TToLdubKjN4ASlJwWv(int i) {
        if (this.f4222LIMtzhnLwQyigzK0KO == 0) {
            return (i == -1) != this.f4227THTDvPxsHqMeGb512f;
        }
        return ((i == -1) == this.f4227THTDvPxsHqMeGb512f) == iiJlEZjcw2pMDvSjYw();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void Tn7MuV14fPMb1UrB5h(RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(recyclerView.getContext());
        tCyPEKSzIyweCN5yp1.OANkd3mP6AYvwbNLJM(i);
        yuvys90eVmNOCmVGXw(tCyPEKSzIyweCN5yp1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int VItLRw50eXTZeEfGl0(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return RkBK3rbmyPvWiHUrac(wWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int WWC27LAMFqFFBzfbNw(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return jpEZy3U5wFkT2e9PKQ(wWC27LAMFqFFBzfbNw);
    }

    public int XfvA8xAblLUDzfjNL9() {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        return FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void YIIWDMF3jHAs3E0PkN(Parcelable parcelable) {
        if (parcelable instanceof husNiw3snxdgZPAGJm) {
            this.f4220GyWRxpdt1T8mEJXPoD = (husNiw3snxdgZPAGJm) parcelable;
            MecTLhJ95ynyqeEob1();
        }
    }

    public final zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 YUDx3zHgOZWWxq2Qgs(int i) {
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
        leer5kfoer4xu5yhh7.f4269HJFh0TGMpafqLE9haL = new int[this.f4233Y43RdunnpKgpbny0lE];
        for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            leer5kfoer4xu5yhh7.f4269HJFh0TGMpafqLE9haL[i2] = i - this.f4226R9SAhYMerGybF9OAjL[i2].e54J8UWNHWALQNixXM(i);
        }
        return leer5kfoer4xu5yhh7;
    }

    public void YiiZd9BUnxc5tLzouk(int i, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int iXfvA8xAblLUDzfjNL9;
        int i2;
        if (i > 0) {
            iXfvA8xAblLUDzfjNL9 = JIhXU7AcR3dXyMdSM6();
            i2 = 1;
        } else {
            iXfvA8xAblLUDzfjNL9 = XfvA8xAblLUDzfjNL9();
            i2 = -1;
        }
        this.f4229VItLRw50eXTZeEfGl0.f3966lEeR5KfoEr4xU5yHH7 = true;
        njvkblNMI9Su0OX3PB(iXfvA8xAblLUDzfjNL9, wWC27LAMFqFFBzfbNw);
        KYIcm5hlxje4bqExkp(i2);
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ.f3961HJFh0TGMpafqLE9haL = iXfvA8xAblLUDzfjNL9 + kYHag8HRDlnO3X9zmZ.f3969zZKhbgvUfsK4AEX3r0;
        kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void cr99CPXhoiknALiHbq(RecyclerView recyclerView, int i, int i2, Object obj) {
        nZURNaK44ts4XNCkYr(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM e2F9F6h8YJxTHwLCa0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new HJFh0TGMpafqLE9haL((ViewGroup.MarginLayoutParams) layoutParams) : new HJFh0TGMpafqLE9haL(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void e54J8UWNHWALQNixXM(String str) {
        if (this.f4220GyWRxpdt1T8mEJXPoD == null) {
            super.e54J8UWNHWALQNixXM(str);
        }
    }

    public void exhPLopOJ5QWEzRjTU() {
        this.f4232XzJ1BS7H9Ilbkv4eVM.s3fjYDxWOUexjjVgyA();
        MecTLhJ95ynyqeEob1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void fB1XGht2x9XoIgekQ8(Rect rect, int i, int i2) {
        int iY43RdunnpKgpbny0lE;
        int iY43RdunnpKgpbny0lE2;
        int iZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel() + eWK41qw3g36LVd4UnS();
        int iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa() + ctWLFN70QQINH1kyYo();
        if (this.f4222LIMtzhnLwQyigzK0KO == 1) {
            iY43RdunnpKgpbny0lE2 = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i2, rect.height() + iDFYiVi7zXozAjRciKa, Kh0uC90qEEhuLdpgB9());
            iY43RdunnpKgpbny0lE = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i, (this.f4217A49QRPHynYLCBN0SqP * this.f4233Y43RdunnpKgpbny0lE) + iZXY7dgnTfw9Pd9RXel, Pum9NZyDBKoCnecvlx());
        } else {
            iY43RdunnpKgpbny0lE = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i, rect.width() + iZXY7dgnTfw9Pd9RXel, Pum9NZyDBKoCnecvlx());
            iY43RdunnpKgpbny0lE2 = RecyclerView.aPyGSIylzVNKPT1Bls.Y43RdunnpKgpbny0lE(i2, (this.f4217A49QRPHynYLCBN0SqP * this.f4233Y43RdunnpKgpbny0lE) + iDFYiVi7zXozAjRciKa, Kh0uC90qEEhuLdpgB9());
        }
        sKvjC8bExN3ISwwWsb(iY43RdunnpKgpbny0lE, iY43RdunnpKgpbny0lE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public Parcelable fBZDmBPlAHk1Liuf1T() {
        int iOANkd3mP6AYvwbNLJM;
        int iT9PhQIpGRhE4yZDm1C;
        int[] iArr;
        if (this.f4220GyWRxpdt1T8mEJXPoD != null) {
            return new husNiw3snxdgZPAGJm(this.f4220GyWRxpdt1T8mEJXPoD);
        }
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = new husNiw3snxdgZPAGJm();
        husniw3snxdgzpagjm.f4251IPyIQcaNa8aB7drBED = this.f4231WWC27LAMFqFFBzfbNw;
        husniw3snxdgzpagjm.f4256pbVGzGjWvY2LDXC8vo = this.f4230W3RZ2dTDKrKpS5Mxdk;
        husniw3snxdgzpagjm.f4249Acstmh57AKoSEkEFNJ = this.f4224OqIo5QF00RDxUQb4qq;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f4232XzJ1BS7H9Ilbkv4eVM;
        if (zzkhbgvufsk4aex3r0 == null || (iArr = zzkhbgvufsk4aex3r0.f4267lEeR5KfoEr4xU5yHH7) == null) {
            husniw3snxdgzpagjm.f4254husNiw3snxdgZPAGJm = 0;
        } else {
            husniw3snxdgzpagjm.f4252KYHag8HRDlnO3X9zmZ = iArr;
            husniw3snxdgzpagjm.f4254husNiw3snxdgZPAGJm = iArr.length;
            husniw3snxdgzpagjm.f4253TCyPEKSzIyweCN5yp1 = zzkhbgvufsk4aex3r0.f4268s3fjYDxWOUexjjVgyA;
        }
        if (lLKzvdU99Iw80uVD5I() > 0) {
            husniw3snxdgzpagjm.f4255lEeR5KfoEr4xU5yHH7 = this.f4230W3RZ2dTDKrKpS5Mxdk ? JIhXU7AcR3dXyMdSM6() : XfvA8xAblLUDzfjNL9();
            husniw3snxdgzpagjm.f4257s3fjYDxWOUexjjVgyA = oyZAo7y5frVexNxTMd();
            int i = this.f4233Y43RdunnpKgpbny0lE;
            husniw3snxdgzpagjm.f4250HJFh0TGMpafqLE9haL = i;
            husniw3snxdgzpagjm.f4258zZKhbgvUfsK4AEX3r0 = new int[i];
            for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
                if (this.f4230W3RZ2dTDKrKpS5Mxdk) {
                    iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[i2].e54J8UWNHWALQNixXM(Integer.MIN_VALUE);
                    if (iOANkd3mP6AYvwbNLJM != Integer.MIN_VALUE) {
                        iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
                        iOANkd3mP6AYvwbNLJM -= iT9PhQIpGRhE4yZDm1C;
                    }
                } else {
                    iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[i2].OANkd3mP6AYvwbNLJM(Integer.MIN_VALUE);
                    if (iOANkd3mP6AYvwbNLJM != Integer.MIN_VALUE) {
                        iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                        iOANkd3mP6AYvwbNLJM -= iT9PhQIpGRhE4yZDm1C;
                    }
                }
                husniw3snxdgzpagjm.f4258zZKhbgvUfsK4AEX3r0[i2] = iOANkd3mP6AYvwbNLJM;
            }
        } else {
            husniw3snxdgzpagjm.f4255lEeR5KfoEr4xU5yHH7 = -1;
            husniw3snxdgzpagjm.f4257s3fjYDxWOUexjjVgyA = -1;
            husniw3snxdgzpagjm.f4250HJFh0TGMpafqLE9haL = 0;
        }
        return husniw3snxdgzpagjm;
    }

    public final void fGfZ0eiHdNE5vUmzRo(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, int i, int i2) {
        int iAcstmh57AKoSEkEFNJ = kYHag8HRDlnO3X9zmZ.Acstmh57AKoSEkEFNJ();
        if (i == -1) {
            if (kYHag8HRDlnO3X9zmZ.aPyGSIylzVNKPT1Bls() + iAcstmh57AKoSEkEFNJ > i2) {
                return;
            }
        } else if (kYHag8HRDlnO3X9zmZ.Z9WdNiOsPR0y54zHW4() - iAcstmh57AKoSEkEFNJ < i2) {
            return;
        }
        this.f4235ao3wqKm5CXFuvC0q47.set(kYHag8HRDlnO3X9zmZ.f4245husNiw3snxdgZPAGJm, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void g0OBkYSIvp0JYnHPjC(RecyclerView recyclerView, int i, int i2) {
        nZURNaK44ts4XNCkYr(i, i2, 1);
    }

    public boolean gS59iOkCM8TpW4A2ew() {
        int iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[0].OANkd3mP6AYvwbNLJM(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4233Y43RdunnpKgpbny0lE; i++) {
            if (this.f4226R9SAhYMerGybF9OAjL[i].OANkd3mP6AYvwbNLJM(Integer.MIN_VALUE) != iOANkd3mP6AYvwbNLJM) {
                return false;
            }
        }
        return true;
    }

    public boolean h3D8MhcyLuC2SOP1fB() {
        int iXfvA8xAblLUDzfjNL9;
        int iJIhXU7AcR3dXyMdSM6;
        if (lLKzvdU99Iw80uVD5I() == 0 || this.f4239tXWeW0sqVddf7ZBflq == 0 || !Fo9071MN8vwEWamAUX()) {
            return false;
        }
        if (this.f4227THTDvPxsHqMeGb512f) {
            iXfvA8xAblLUDzfjNL9 = JIhXU7AcR3dXyMdSM6();
            iJIhXU7AcR3dXyMdSM6 = XfvA8xAblLUDzfjNL9();
        } else {
            iXfvA8xAblLUDzfjNL9 = XfvA8xAblLUDzfjNL9();
            iJIhXU7AcR3dXyMdSM6 = JIhXU7AcR3dXyMdSM6();
        }
        if (iXfvA8xAblLUDzfjNL9 == 0 && suHivzALoCSfNps0XP() != null) {
            this.f4232XzJ1BS7H9Ilbkv4eVM.s3fjYDxWOUexjjVgyA();
        } else {
            if (!this.f4225PPkm9uUfOJHHYveeLT) {
                return false;
            }
            int i = this.f4227THTDvPxsHqMeGb512f ? -1 : 1;
            int i2 = iJIhXU7AcR3dXyMdSM6 + 1;
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm = this.f4232XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm(iXfvA8xAblLUDzfjNL9, i2, i, true);
            if (leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm == null) {
                this.f4225PPkm9uUfOJHHYveeLT = false;
                this.f4232XzJ1BS7H9Ilbkv4eVM.zZKhbgvUfsK4AEX3r0(i2);
                return false;
            }
            zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm2 = this.f4232XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm(iXfvA8xAblLUDzfjNL9, leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm.f4270lEeR5KfoEr4xU5yHH7, i * (-1), true);
            if (leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm2 == null) {
                this.f4232XzJ1BS7H9Ilbkv4eVM.zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm.f4270lEeR5KfoEr4xU5yHH7);
            } else {
                this.f4232XzJ1BS7H9Ilbkv4eVM.zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh7HusNiw3snxdgZPAGJm2.f4270lEeR5KfoEr4xU5yHH7 + 1);
            }
        }
        Nm04cZudeGY9NQf1y2();
        MecTLhJ95ynyqeEob1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h6NrAcYSuIyiU1qV6F(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        super.h6NrAcYSuIyiU1qV6F(wWC27LAMFqFFBzfbNw);
        this.f4223OUd9THiLjZndMj0qdF = -1;
        this.f4237jCtUeU2YI1poCxWcjm = Integer.MIN_VALUE;
        this.f4220GyWRxpdt1T8mEJXPoD = null;
        this.f4221KqgKJKIWne3kz1AdHk.HJFh0TGMpafqLE9haL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h7m69eGbRk1hyaVt28(RecyclerView recyclerView, int i, int i2, int i3) {
        nZURNaK44ts4XNCkYr(i, i2, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f3965husNiw3snxdgZPAGJm == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hNwHJdfN8Sg5H67aR5(androidx.recyclerview.widget.RecyclerView.G7AC3DWIx9i9fdanjk r3, androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3966lEeR5KfoEr4xU5yHH7
            if (r0 == 0) goto L4d
            boolean r0 = r4.f3967pbVGzGjWvY2LDXC8vo
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f3968s3fjYDxWOUexjjVgyA
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f3965husNiw3snxdgZPAGJm
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f3964TCyPEKSzIyweCN5yp1
        L14:
            r2.Kf6IFvVH2efp6249v2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f3963KYHag8HRDlnO3X9zmZ
        L1a:
            r2.K3DzFKxpDGIqdlGY4t(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f3965husNiw3snxdgZPAGJm
            if (r0 != r1) goto L37
            int r0 = r4.f3963KYHag8HRDlnO3X9zmZ
            int r1 = r2.DkHm7hVHmkyvDHXSjR(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f3964TCyPEKSzIyweCN5yp1
            int r4 = r4.f3968s3fjYDxWOUexjjVgyA
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f3964TCyPEKSzIyweCN5yp1
            int r0 = r2.Qqql9aLAyQK9tLp8QF(r0)
            int r1 = r4.f3964TCyPEKSzIyweCN5yp1
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f3963KYHag8HRDlnO3X9zmZ
            int r4 = r4.f3968s3fjYDxWOUexjjVgyA
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.hNwHJdfN8Sg5H67aR5(androidx.recyclerview.widget.RecyclerView$G7AC3DWIx9i9fdanjk, androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ):void");
    }

    public boolean hV7XaowQwpA0oB6Ofm(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i;
        int iT9PhQIpGRhE4yZDm1C;
        int iTCyPEKSzIyweCN5yp1;
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm() && (i = this.f4223OUd9THiLjZndMj0qdF) != -1) {
            if (i >= 0 && i < wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA()) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f4220GyWRxpdt1T8mEJXPoD;
                if (husniw3snxdgzpagjm == null || husniw3snxdgzpagjm.f4255lEeR5KfoEr4xU5yHH7 == -1 || husniw3snxdgzpagjm.f4250HJFh0TGMpafqLE9haL < 1) {
                    View viewOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(this.f4223OUd9THiLjZndMj0qdF);
                    if (viewOqIo5QF00RDxUQb4qq != null) {
                        s3fjydxwouexjjvgya.f4264lEeR5KfoEr4xU5yHH7 = this.f4227THTDvPxsHqMeGb512f ? JIhXU7AcR3dXyMdSM6() : XfvA8xAblLUDzfjNL9();
                        if (this.f4237jCtUeU2YI1poCxWcjm != Integer.MIN_VALUE) {
                            if (s3fjydxwouexjjvgya.f4260HJFh0TGMpafqLE9haL) {
                                iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f4237jCtUeU2YI1poCxWcjm;
                                iTCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewOqIo5QF00RDxUQb4qq);
                            } else {
                                iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() + this.f4237jCtUeU2YI1poCxWcjm;
                                iTCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewOqIo5QF00RDxUQb4qq);
                            }
                            s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = iT9PhQIpGRhE4yZDm1C - iTCyPEKSzIyweCN5yp1;
                            return true;
                        }
                        if (this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(viewOqIo5QF00RDxUQb4qq) > this.f4219G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da()) {
                            s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya.f4260HJFh0TGMpafqLE9haL ? this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() : this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                            return true;
                        }
                        int iTCyPEKSzIyweCN5yp12 = this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewOqIo5QF00RDxUQb4qq) - this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                        if (iTCyPEKSzIyweCN5yp12 < 0) {
                            s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = -iTCyPEKSzIyweCN5yp12;
                            return true;
                        }
                        int iPbVGzGjWvY2LDXC8vo = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewOqIo5QF00RDxUQb4qq);
                        if (iPbVGzGjWvY2LDXC8vo < 0) {
                            s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = iPbVGzGjWvY2LDXC8vo;
                            return true;
                        }
                        s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.f4223OUd9THiLjZndMj0qdF;
                        s3fjydxwouexjjvgya.f4264lEeR5KfoEr4xU5yHH7 = i2;
                        int i3 = this.f4237jCtUeU2YI1poCxWcjm;
                        if (i3 == Integer.MIN_VALUE) {
                            s3fjydxwouexjjvgya.f4260HJFh0TGMpafqLE9haL = pifLUtPYGKkyBx85TF(i2) == 1;
                            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
                        } else {
                            s3fjydxwouexjjvgya.s3fjYDxWOUexjjVgyA(i3);
                        }
                        s3fjydxwouexjjvgya.f4266zZKhbgvUfsK4AEX3r0 = true;
                    }
                } else {
                    s3fjydxwouexjjvgya.f4265s3fjYDxWOUexjjVgyA = Integer.MIN_VALUE;
                    s3fjydxwouexjjvgya.f4264lEeR5KfoEr4xU5yHH7 = this.f4223OUd9THiLjZndMj0qdF;
                }
                return true;
            }
            this.f4223OUd9THiLjZndMj0qdF = -1;
            this.f4237jCtUeU2YI1poCxWcjm = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void hgxXdWVkE1CPHCTwpz(int i) {
        if (i == 0) {
            h3D8MhcyLuC2SOP1fB();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA
    public PointF husNiw3snxdgZPAGJm(int i) {
        int iPifLUtPYGKkyBx85TF = pifLUtPYGKkyBx85TF(i);
        PointF pointF = new PointF();
        if (iPifLUtPYGKkyBx85TF == 0) {
            return null;
        }
        if (this.f4222LIMtzhnLwQyigzK0KO == 0) {
            pointF.x = iPifLUtPYGKkyBx85TF;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iPifLUtPYGKkyBx85TF;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void i8aHOwH04efS6lZ3Oa(int i) {
        super.i8aHOwH04efS6lZ3Oa(i);
        for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            this.f4226R9SAhYMerGybF9OAjL[i2].sTkWmhpZ5b1ArQIw4K(i);
        }
    }

    public boolean iiJlEZjcw2pMDvSjYw() {
        return Tu4WCh2gEwj8E4oHbP() == 1;
    }

    public final void jLObTZifvCGJKb1uVO(View view) {
        for (int i = this.f4233Y43RdunnpKgpbny0lE - 1; i >= 0; i--) {
            this.f4226R9SAhYMerGybF9OAjL[i].G7AC3DWIx9i9fdanjk(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void jsjSYEu4NPZjZxcfmI(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, View view, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP) {
        int iHusNiw3snxdgZPAGJm;
        int i;
        boolean z;
        boolean z2;
        int iHusNiw3snxdgZPAGJm2;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof HJFh0TGMpafqLE9haL)) {
            super.tmIBXGVvBsrJ7i63G2(view, a49QRPHynYLCBN0SqP);
            return;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) layoutParams;
        if (this.f4222LIMtzhnLwQyigzK0KO == 0) {
            iHusNiw3snxdgZPAGJm2 = hJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm();
            i2 = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? this.f4233Y43RdunnpKgpbny0lE : 1;
            z = false;
            z2 = false;
            iHusNiw3snxdgZPAGJm = -1;
            i = -1;
        } else {
            iHusNiw3snxdgZPAGJm = hJFh0TGMpafqLE9haL.husNiw3snxdgZPAGJm();
            i = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? this.f4233Y43RdunnpKgpbny0lE : 1;
            z = false;
            z2 = false;
            iHusNiw3snxdgZPAGJm2 = -1;
            i2 = -1;
        }
        a49QRPHynYLCBN0SqP.DFYiVi7zXozAjRciKa(A49QRPHynYLCBN0SqP.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(iHusNiw3snxdgZPAGJm2, i2, iHusNiw3snxdgZPAGJm, i, z, z2));
    }

    public final int lHPkE93Dmy5iD2yQiG(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int mhQSzVvPFnByVGnwX9(int i) {
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        for (int i2 = 0; i2 < iLLKzvdU99Iw80uVD5I; i2++) {
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(i2));
            if (iFtYx4GXtxwA8al5hBy >= 0 && iFtYx4GXtxwA8al5hBy < i) {
                return iFtYx4GXtxwA8al5hBy;
            }
        }
        return 0;
    }

    public final int msljfiu2GA8S2iWtz0(int i) {
        int iE54J8UWNHWALQNixXM = this.f4226R9SAhYMerGybF9OAjL[0].e54J8UWNHWALQNixXM(i);
        for (int i2 = 1; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            int iE54J8UWNHWALQNixXM2 = this.f4226R9SAhYMerGybF9OAjL[i2].e54J8UWNHWALQNixXM(i);
            if (iE54J8UWNHWALQNixXM2 > iE54J8UWNHWALQNixXM) {
                iE54J8UWNHWALQNixXM = iE54J8UWNHWALQNixXM2;
            }
        }
        return iE54J8UWNHWALQNixXM;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nZURNaK44ts4XNCkYr(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4227THTDvPxsHqMeGb512f
            if (r0 == 0) goto L9
            int r0 = r6.JIhXU7AcR3dXyMdSM6()
            goto Ld
        L9:
            int r0 = r6.XfvA8xAblLUDzfjNL9()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0 r4 = r6.f4232XzJ1BS7H9Ilbkv4eVM
            r4.IPyIQcaNa8aB7drBED(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0 r9 = r6.f4232XzJ1BS7H9Ilbkv4eVM
            r9.Z9WdNiOsPR0y54zHW4(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0 r7 = r6.f4232XzJ1BS7H9Ilbkv4eVM
            r7.Acstmh57AKoSEkEFNJ(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0 r9 = r6.f4232XzJ1BS7H9Ilbkv4eVM
            r9.Z9WdNiOsPR0y54zHW4(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$zZKhbgvUfsK4AEX3r0 r9 = r6.f4232XzJ1BS7H9Ilbkv4eVM
            r9.Acstmh57AKoSEkEFNJ(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f4227THTDvPxsHqMeGb512f
            if (r7 == 0) goto L4e
            int r7 = r6.XfvA8xAblLUDzfjNL9()
            goto L52
        L4e:
            int r7 = r6.JIhXU7AcR3dXyMdSM6()
        L52:
            if (r3 > r7) goto L57
            r6.MecTLhJ95ynyqeEob1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.nZURNaK44ts4XNCkYr(int, int, int):void");
    }

    public void ngyAMEcy385jHG8YEQ(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        e54J8UWNHWALQNixXM(null);
        if (i == this.f4222LIMtzhnLwQyigzK0KO) {
            return;
        }
        this.f4222LIMtzhnLwQyigzK0KO = i;
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f4219G7AC3DWIx9i9fdanjk;
        this.f4219G7AC3DWIx9i9fdanjk = this.f4240xHA29AmDt6y96AnB3t;
        this.f4240xHA29AmDt6y96AnB3t = pbvgzgjwvy2ldxc8vo;
        MecTLhJ95ynyqeEob1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int njV42vQJoqlfw05NNQ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZQ0O8WPjPHflNoINQ2T;
        int iHusNiw3snxdgZPAGJm;
        int i;
        int iHusNiw3snxdgZPAGJm2;
        int iHusNiw3snxdgZPAGJm3;
        RecyclerView.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls;
        View view;
        int i2;
        int i3;
        boolean z;
        ?? r9 = 0;
        this.f4235ao3wqKm5CXFuvC0q47.set(0, this.f4233Y43RdunnpKgpbny0lE, true);
        int i4 = this.f4229VItLRw50eXTZeEfGl0.f3967pbVGzGjWvY2LDXC8vo ? kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1 ? kYHag8HRDlnO3X9zmZ.f3964TCyPEKSzIyweCN5yp1 + kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA : kYHag8HRDlnO3X9zmZ.f3963KYHag8HRDlnO3X9zmZ - kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA;
        sFPmpDxgppcnCCjn0l(kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm, i4);
        int iPbVGzGjWvY2LDXC8vo = this.f4227THTDvPxsHqMeGb512f ? this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() : this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        boolean z2 = false;
        while (kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(wWC27LAMFqFFBzfbNw) && (this.f4229VItLRw50eXTZeEfGl0.f3967pbVGzGjWvY2LDXC8vo || !this.f4235ao3wqKm5CXFuvC0q47.isEmpty())) {
            View viewS3fjYDxWOUexjjVgyA = kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(g7AC3DWIx9i9fdanjk);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) viewS3fjYDxWOUexjjVgyA.getLayoutParams();
            int iLEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            int iTCyPEKSzIyweCN5yp1 = this.f4232XzJ1BS7H9Ilbkv4eVM.TCyPEKSzIyweCN5yp1(iLEeR5KfoEr4xU5yHH7);
            boolean z3 = iTCyPEKSzIyweCN5yp1 == -1 ? true : r9;
            if (z3) {
                kYHag8HRDlnO3X9zmZQ0O8WPjPHflNoINQ2T = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? this.f4226R9SAhYMerGybF9OAjL[r9] : q0O8WPjPHflNoINQ2T(kYHag8HRDlnO3X9zmZ);
                this.f4232XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(iLEeR5KfoEr4xU5yHH7, kYHag8HRDlnO3X9zmZQ0O8WPjPHflNoINQ2T);
            } else {
                kYHag8HRDlnO3X9zmZQ0O8WPjPHflNoINQ2T = this.f4226R9SAhYMerGybF9OAjL[iTCyPEKSzIyweCN5yp1];
            }
            KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = kYHag8HRDlnO3X9zmZQ0O8WPjPHflNoINQ2T;
            hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm = kYHag8HRDlnO3X9zmZ2;
            if (kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1) {
                pbVGzGjWvY2LDXC8vo(viewS3fjYDxWOUexjjVgyA);
            } else {
                Acstmh57AKoSEkEFNJ(viewS3fjYDxWOUexjjVgyA, r9);
            }
            FK1mYOUHT5iEQP3ZJ1(viewS3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL, r9);
            if (kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1) {
                int iMsljfiu2GA8S2iWtz0 = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? msljfiu2GA8S2iWtz0(iPbVGzGjWvY2LDXC8vo) : kYHag8HRDlnO3X9zmZ2.e54J8UWNHWALQNixXM(iPbVGzGjWvY2LDXC8vo);
                int iHusNiw3snxdgZPAGJm4 = this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(viewS3fjYDxWOUexjjVgyA) + iMsljfiu2GA8S2iWtz0;
                if (z3 && hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                    zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7YUDx3zHgOZWWxq2Qgs = YUDx3zHgOZWWxq2Qgs(iMsljfiu2GA8S2iWtz0);
                    leer5kfoer4xu5yhh7YUDx3zHgOZWWxq2Qgs.f4271s3fjYDxWOUexjjVgyA = -1;
                    leer5kfoer4xu5yhh7YUDx3zHgOZWWxq2Qgs.f4270lEeR5KfoEr4xU5yHH7 = iLEeR5KfoEr4xU5yHH7;
                    this.f4232XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7YUDx3zHgOZWWxq2Qgs);
                }
                i = iHusNiw3snxdgZPAGJm4;
                iHusNiw3snxdgZPAGJm = iMsljfiu2GA8S2iWtz0;
            } else {
                int iVzXHdKiCTh4zilt9z1 = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? vzXHdKiCTh4zilt9z1(iPbVGzGjWvY2LDXC8vo) : kYHag8HRDlnO3X9zmZ2.OANkd3mP6AYvwbNLJM(iPbVGzGjWvY2LDXC8vo);
                iHusNiw3snxdgZPAGJm = iVzXHdKiCTh4zilt9z1 - this.f4219G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(viewS3fjYDxWOUexjjVgyA);
                if (z3 && hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                    zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7Pjij9fAFhRRn230kOs = pjij9fAFhRRn230kOs(iVzXHdKiCTh4zilt9z1);
                    leer5kfoer4xu5yhh7Pjij9fAFhRRn230kOs.f4271s3fjYDxWOUexjjVgyA = 1;
                    leer5kfoer4xu5yhh7Pjij9fAFhRRn230kOs.f4270lEeR5KfoEr4xU5yHH7 = iLEeR5KfoEr4xU5yHH7;
                    this.f4232XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7Pjij9fAFhRRn230kOs);
                }
                i = iVzXHdKiCTh4zilt9z1;
            }
            if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ && kYHag8HRDlnO3X9zmZ.f3969zZKhbgvUfsK4AEX3r0 == -1) {
                if (z3) {
                    this.f4225PPkm9uUfOJHHYveeLT = true;
                } else {
                    if (!(kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1 ? KWpkmWKCm3jeG4AjIM() : gS59iOkCM8TpW4A2ew())) {
                        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ = this.f4232XzJ1BS7H9Ilbkv4eVM.KYHag8HRDlnO3X9zmZ(iLEeR5KfoEr4xU5yHH7);
                        if (leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ != null) {
                            leer5kfoer4xu5yhh7KYHag8HRDlnO3X9zmZ.f4272zZKhbgvUfsK4AEX3r0 = true;
                        }
                        this.f4225PPkm9uUfOJHHYveeLT = true;
                    }
                }
            }
            t1ob1jctq87uSyCpeM(viewS3fjYDxWOUexjjVgyA, hJFh0TGMpafqLE9haL, kYHag8HRDlnO3X9zmZ);
            if (iiJlEZjcw2pMDvSjYw() && this.f4222LIMtzhnLwQyigzK0KO == 1) {
                int iPbVGzGjWvY2LDXC8vo2 = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? this.f4240xHA29AmDt6y96AnB3t.pbVGzGjWvY2LDXC8vo() : this.f4240xHA29AmDt6y96AnB3t.pbVGzGjWvY2LDXC8vo() - (((this.f4233Y43RdunnpKgpbny0lE - 1) - kYHag8HRDlnO3X9zmZ2.f4245husNiw3snxdgZPAGJm) * this.f4217A49QRPHynYLCBN0SqP);
                iHusNiw3snxdgZPAGJm3 = iPbVGzGjWvY2LDXC8vo2;
                iHusNiw3snxdgZPAGJm2 = iPbVGzGjWvY2LDXC8vo2 - this.f4240xHA29AmDt6y96AnB3t.husNiw3snxdgZPAGJm(viewS3fjYDxWOUexjjVgyA);
            } else {
                int iT9PhQIpGRhE4yZDm1C = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ ? this.f4240xHA29AmDt6y96AnB3t.T9PhQIpGRhE4yZDm1C() : (kYHag8HRDlnO3X9zmZ2.f4245husNiw3snxdgZPAGJm * this.f4217A49QRPHynYLCBN0SqP) + this.f4240xHA29AmDt6y96AnB3t.T9PhQIpGRhE4yZDm1C();
                iHusNiw3snxdgZPAGJm2 = iT9PhQIpGRhE4yZDm1C;
                iHusNiw3snxdgZPAGJm3 = this.f4240xHA29AmDt6y96AnB3t.husNiw3snxdgZPAGJm(viewS3fjYDxWOUexjjVgyA) + iT9PhQIpGRhE4yZDm1C;
            }
            if (this.f4222LIMtzhnLwQyigzK0KO == 1) {
                apygsiylzvnkpt1bls = this;
                view = viewS3fjYDxWOUexjjVgyA;
                i2 = iHusNiw3snxdgZPAGJm2;
                iHusNiw3snxdgZPAGJm2 = iHusNiw3snxdgZPAGJm;
                i3 = iHusNiw3snxdgZPAGJm3;
            } else {
                apygsiylzvnkpt1bls = this;
                view = viewS3fjYDxWOUexjjVgyA;
                i2 = iHusNiw3snxdgZPAGJm;
                i3 = i;
                i = iHusNiw3snxdgZPAGJm3;
            }
            apygsiylzvnkpt1bls.Bc5OTyAfOKVCQb8CEz(view, i2, iHusNiw3snxdgZPAGJm2, i3, i);
            if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                sFPmpDxgppcnCCjn0l(this.f4229VItLRw50eXTZeEfGl0.f3965husNiw3snxdgZPAGJm, i4);
            } else {
                fGfZ0eiHdNE5vUmzRo(kYHag8HRDlnO3X9zmZ2, this.f4229VItLRw50eXTZeEfGl0.f3965husNiw3snxdgZPAGJm, i4);
            }
            hNwHJdfN8Sg5H67aR5(g7AC3DWIx9i9fdanjk, this.f4229VItLRw50eXTZeEfGl0);
            if (!this.f4229VItLRw50eXTZeEfGl0.f3962IPyIQcaNa8aB7drBED || !viewS3fjYDxWOUexjjVgyA.hasFocusable()) {
                z = false;
            } else if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                this.f4235ao3wqKm5CXFuvC0q47.clear();
                z = false;
            } else {
                z = false;
                this.f4235ao3wqKm5CXFuvC0q47.set(kYHag8HRDlnO3X9zmZ2.f4245husNiw3snxdgZPAGJm, false);
            }
            r9 = z;
            z2 = true;
        }
        int i5 = r9;
        if (!z2) {
            hNwHJdfN8Sg5H67aR5(g7AC3DWIx9i9fdanjk, this.f4229VItLRw50eXTZeEfGl0);
        }
        int iT9PhQIpGRhE4yZDm1C2 = this.f4229VItLRw50eXTZeEfGl0.f3965husNiw3snxdgZPAGJm == -1 ? this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() - vzXHdKiCTh4zilt9z1(this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) : msljfiu2GA8S2iWtz0(this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo()) - this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        return iT9PhQIpGRhE4yZDm1C2 > 0 ? Math.min(kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA, iT9PhQIpGRhE4yZDm1C2) : i5;
    }

    public final void njvkblNMI9Su0OX3PB(int i, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int iHoXrIDAFrSwfShk8da;
        int iHoXrIDAFrSwfShk8da2;
        int iHJFh0TGMpafqLE9haL;
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = this.f4229VItLRw50eXTZeEfGl0;
        boolean z = false;
        kYHag8HRDlnO3X9zmZ.f3968s3fjYDxWOUexjjVgyA = 0;
        kYHag8HRDlnO3X9zmZ.f3961HJFh0TGMpafqLE9haL = i;
        if (!HR5vAalpgOKVm2T0Gq() || (iHJFh0TGMpafqLE9haL = wWC27LAMFqFFBzfbNw.HJFh0TGMpafqLE9haL()) == -1) {
            iHoXrIDAFrSwfShk8da = 0;
            iHoXrIDAFrSwfShk8da2 = 0;
        } else {
            if (this.f4227THTDvPxsHqMeGb512f == (iHJFh0TGMpafqLE9haL < i)) {
                iHoXrIDAFrSwfShk8da = this.f4219G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da();
                iHoXrIDAFrSwfShk8da2 = 0;
            } else {
                iHoXrIDAFrSwfShk8da2 = this.f4219G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da();
                iHoXrIDAFrSwfShk8da = 0;
            }
        }
        if (LU0fFDMACqnfIfA1AZ()) {
            this.f4229VItLRw50eXTZeEfGl0.f3963KYHag8HRDlnO3X9zmZ = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() - iHoXrIDAFrSwfShk8da2;
            this.f4229VItLRw50eXTZeEfGl0.f3964TCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() + iHoXrIDAFrSwfShk8da;
        } else {
            this.f4229VItLRw50eXTZeEfGl0.f3964TCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.IPyIQcaNa8aB7drBED() + iHoXrIDAFrSwfShk8da;
            this.f4229VItLRw50eXTZeEfGl0.f3963KYHag8HRDlnO3X9zmZ = -iHoXrIDAFrSwfShk8da2;
        }
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ2.f3962IPyIQcaNa8aB7drBED = false;
        kYHag8HRDlnO3X9zmZ2.f3966lEeR5KfoEr4xU5yHH7 = true;
        if (this.f4219G7AC3DWIx9i9fdanjk.Z9WdNiOsPR0y54zHW4() == 0 && this.f4219G7AC3DWIx9i9fdanjk.IPyIQcaNa8aB7drBED() == 0) {
            z = true;
        }
        kYHag8HRDlnO3X9zmZ2.f3967pbVGzGjWvY2LDXC8vo = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public View oOMFI1Dcqcg1BSVNty(View view, int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        View viewW3RZ2dTDKrKpS5Mxdk;
        View viewT9PhQIpGRhE4yZDm1C;
        if (lLKzvdU99Iw80uVD5I() == 0 || (viewW3RZ2dTDKrKpS5Mxdk = W3RZ2dTDKrKpS5Mxdk(view)) == null) {
            return null;
        }
        qKqI9idaJHL0sOqyD4();
        int iNdQwlXNek6Yo5ZBYrV = ndQwlXNek6Yo5ZBYrV(i);
        if (iNdQwlXNek6Yo5ZBYrV == Integer.MIN_VALUE) {
            return null;
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) viewW3RZ2dTDKrKpS5Mxdk.getLayoutParams();
        boolean z = hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ;
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm;
        int iJIhXU7AcR3dXyMdSM6 = iNdQwlXNek6Yo5ZBYrV == 1 ? JIhXU7AcR3dXyMdSM6() : XfvA8xAblLUDzfjNL9();
        njvkblNMI9Su0OX3PB(iJIhXU7AcR3dXyMdSM6, wWC27LAMFqFFBzfbNw);
        KYIcm5hlxje4bqExkp(iNdQwlXNek6Yo5ZBYrV);
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ2.f3961HJFh0TGMpafqLE9haL = kYHag8HRDlnO3X9zmZ2.f3969zZKhbgvUfsK4AEX3r0 + iJIhXU7AcR3dXyMdSM6;
        kYHag8HRDlnO3X9zmZ2.f3968s3fjYDxWOUexjjVgyA = (int) (this.f4219G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da() * 0.33333334f);
        androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ3 = this.f4229VItLRw50eXTZeEfGl0;
        kYHag8HRDlnO3X9zmZ3.f3962IPyIQcaNa8aB7drBED = true;
        kYHag8HRDlnO3X9zmZ3.f3966lEeR5KfoEr4xU5yHH7 = false;
        njV42vQJoqlfw05NNQ(g7AC3DWIx9i9fdanjk, kYHag8HRDlnO3X9zmZ3, wWC27LAMFqFFBzfbNw);
        this.f4230W3RZ2dTDKrKpS5Mxdk = this.f4227THTDvPxsHqMeGb512f;
        if (!z && (viewT9PhQIpGRhE4yZDm1C = kYHag8HRDlnO3X9zmZ.T9PhQIpGRhE4yZDm1C(iJIhXU7AcR3dXyMdSM6, iNdQwlXNek6Yo5ZBYrV)) != null && viewT9PhQIpGRhE4yZDm1C != viewW3RZ2dTDKrKpS5Mxdk) {
            return viewT9PhQIpGRhE4yZDm1C;
        }
        if (TToLdubKjN4ASlJwWv(iNdQwlXNek6Yo5ZBYrV)) {
            for (int i2 = this.f4233Y43RdunnpKgpbny0lE - 1; i2 >= 0; i2--) {
                View viewT9PhQIpGRhE4yZDm1C2 = this.f4226R9SAhYMerGybF9OAjL[i2].T9PhQIpGRhE4yZDm1C(iJIhXU7AcR3dXyMdSM6, iNdQwlXNek6Yo5ZBYrV);
                if (viewT9PhQIpGRhE4yZDm1C2 != null && viewT9PhQIpGRhE4yZDm1C2 != viewW3RZ2dTDKrKpS5Mxdk) {
                    return viewT9PhQIpGRhE4yZDm1C2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f4233Y43RdunnpKgpbny0lE; i3++) {
                View viewT9PhQIpGRhE4yZDm1C3 = this.f4226R9SAhYMerGybF9OAjL[i3].T9PhQIpGRhE4yZDm1C(iJIhXU7AcR3dXyMdSM6, iNdQwlXNek6Yo5ZBYrV);
                if (viewT9PhQIpGRhE4yZDm1C3 != null && viewT9PhQIpGRhE4yZDm1C3 != viewW3RZ2dTDKrKpS5Mxdk) {
                    return viewT9PhQIpGRhE4yZDm1C3;
                }
            }
        }
        boolean z2 = (this.f4231WWC27LAMFqFFBzfbNw ^ true) == (iNdQwlXNek6Yo5ZBYrV == -1);
        if (!z) {
            View viewOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(z2 ? kYHag8HRDlnO3X9zmZ.KYHag8HRDlnO3X9zmZ() : kYHag8HRDlnO3X9zmZ.TCyPEKSzIyweCN5yp1());
            if (viewOqIo5QF00RDxUQb4qq != null && viewOqIo5QF00RDxUQb4qq != viewW3RZ2dTDKrKpS5Mxdk) {
                return viewOqIo5QF00RDxUQb4qq;
            }
        }
        if (TToLdubKjN4ASlJwWv(iNdQwlXNek6Yo5ZBYrV)) {
            for (int i4 = this.f4233Y43RdunnpKgpbny0lE - 1; i4 >= 0; i4--) {
                if (i4 != kYHag8HRDlnO3X9zmZ.f4245husNiw3snxdgZPAGJm) {
                    KYHag8HRDlnO3X9zmZ[] kYHag8HRDlnO3X9zmZArr = this.f4226R9SAhYMerGybF9OAjL;
                    View viewOqIo5QF00RDxUQb4qq2 = OqIo5QF00RDxUQb4qq(z2 ? kYHag8HRDlnO3X9zmZArr[i4].KYHag8HRDlnO3X9zmZ() : kYHag8HRDlnO3X9zmZArr[i4].TCyPEKSzIyweCN5yp1());
                    if (viewOqIo5QF00RDxUQb4qq2 != null && viewOqIo5QF00RDxUQb4qq2 != viewW3RZ2dTDKrKpS5Mxdk) {
                        return viewOqIo5QF00RDxUQb4qq2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f4233Y43RdunnpKgpbny0lE; i5++) {
                KYHag8HRDlnO3X9zmZ[] kYHag8HRDlnO3X9zmZArr2 = this.f4226R9SAhYMerGybF9OAjL;
                View viewOqIo5QF00RDxUQb4qq3 = OqIo5QF00RDxUQb4qq(z2 ? kYHag8HRDlnO3X9zmZArr2[i5].KYHag8HRDlnO3X9zmZ() : kYHag8HRDlnO3X9zmZArr2[i5].TCyPEKSzIyweCN5yp1());
                if (viewOqIo5QF00RDxUQb4qq3 != null && viewOqIo5QF00RDxUQb4qq3 != viewW3RZ2dTDKrKpS5Mxdk) {
                    return viewOqIo5QF00RDxUQb4qq3;
                }
            }
        }
        return null;
    }

    public int oyZAo7y5frVexNxTMd() {
        View viewEgmJdc4h5OU4spuEKW = this.f4227THTDvPxsHqMeGb512f ? EgmJdc4h5OU4spuEKW(true) : uWxB7TH05HzXzGqLIZ(true);
        if (viewEgmJdc4h5OU4spuEKW == null) {
            return -1;
        }
        return FtYx4GXtxwA8al5hBy(viewEgmJdc4h5OU4spuEKW);
    }

    public final int pifLUtPYGKkyBx85TF(int i) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return this.f4227THTDvPxsHqMeGb512f ? 1 : -1;
        }
        return (i < XfvA8xAblLUDzfjNL9()) != this.f4227THTDvPxsHqMeGb512f ? -1 : 1;
    }

    public final zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 pjij9fAFhRRn230kOs(int i) {
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
        leer5kfoer4xu5yhh7.f4269HJFh0TGMpafqLE9haL = new int[this.f4233Y43RdunnpKgpbny0lE];
        for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            leer5kfoer4xu5yhh7.f4269HJFh0TGMpafqLE9haL[i2] = this.f4226R9SAhYMerGybF9OAjL[i2].OANkd3mP6AYvwbNLJM(i) - i;
        }
        return leer5kfoer4xu5yhh7;
    }

    public final KYHag8HRDlnO3X9zmZ q0O8WPjPHflNoINQ2T(androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        int i;
        int i2;
        int i3;
        if (TToLdubKjN4ASlJwWv(kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm)) {
            i2 = this.f4233Y43RdunnpKgpbny0lE - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f4233Y43RdunnpKgpbny0lE;
            i2 = 0;
            i3 = 1;
        }
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ2 = null;
        if (kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1) {
            int iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ3 = this.f4226R9SAhYMerGybF9OAjL[i2];
                int iE54J8UWNHWALQNixXM = kYHag8HRDlnO3X9zmZ3.e54J8UWNHWALQNixXM(iT9PhQIpGRhE4yZDm1C);
                if (iE54J8UWNHWALQNixXM < i4) {
                    kYHag8HRDlnO3X9zmZ2 = kYHag8HRDlnO3X9zmZ3;
                    i4 = iE54J8UWNHWALQNixXM;
                }
                i2 += i3;
            }
            return kYHag8HRDlnO3X9zmZ2;
        }
        int iPbVGzGjWvY2LDXC8vo = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ4 = this.f4226R9SAhYMerGybF9OAjL[i2];
            int iOANkd3mP6AYvwbNLJM = kYHag8HRDlnO3X9zmZ4.OANkd3mP6AYvwbNLJM(iPbVGzGjWvY2LDXC8vo);
            if (iOANkd3mP6AYvwbNLJM > i5) {
                kYHag8HRDlnO3X9zmZ2 = kYHag8HRDlnO3X9zmZ4;
                i5 = iOANkd3mP6AYvwbNLJM;
            }
            i2 += i3;
        }
        return kYHag8HRDlnO3X9zmZ2;
    }

    public final void qnb0B0kp1U5mzuoCqH(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, boolean z) {
        int iT9PhQIpGRhE4yZDm1C;
        int iVzXHdKiCTh4zilt9z1 = vzXHdKiCTh4zilt9z1(Integer.MAX_VALUE);
        if (iVzXHdKiCTh4zilt9z1 != Integer.MAX_VALUE && (iT9PhQIpGRhE4yZDm1C = iVzXHdKiCTh4zilt9z1 - this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) > 0) {
            int iBzLnH9Ew63rlrNW23o = iT9PhQIpGRhE4yZDm1C - BzLnH9Ew63rlrNW23o(iT9PhQIpGRhE4yZDm1C, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
            if (!z || iBzLnH9Ew63rlrNW23o <= 0) {
                return;
            }
            this.f4219G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(-iBzLnH9Ew63rlrNW23o);
        }
    }

    public final void sFPmpDxgppcnCCjn0l(int i, int i2) {
        for (int i3 = 0; i3 < this.f4233Y43RdunnpKgpbny0lE; i3++) {
            if (!this.f4226R9SAhYMerGybF9OAjL[i3].f4246lEeR5KfoEr4xU5yHH7.isEmpty()) {
                fGfZ0eiHdNE5vUmzRo(this.f4226R9SAhYMerGybF9OAjL[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean sTkWmhpZ5b1ArQIw4K(RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM) {
        return oANkd3mP6AYvwbNLJM instanceof HJFh0TGMpafqLE9haL;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View suHivzALoCSfNps0XP() {
        /*
            r12 = this;
            int r0 = r12.lLKzvdU99Iw80uVD5I()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4233Y43RdunnpKgpbny0lE
            r2.<init>(r3)
            int r3 = r12.f4233Y43RdunnpKgpbny0lE
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f4222LIMtzhnLwQyigzK0KO
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.iiJlEZjcw2pMDvSjYw()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f4227THTDvPxsHqMeGb512f
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.aAp6BD79BhftLCnuvf(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$HJFh0TGMpafqLE9haL r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.HJFh0TGMpafqLE9haL) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$KYHag8HRDlnO3X9zmZ r9 = r8.f4242husNiw3snxdgZPAGJm
            int r9 = r9.f4245husNiw3snxdgZPAGJm
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$KYHag8HRDlnO3X9zmZ r9 = r8.f4242husNiw3snxdgZPAGJm
            boolean r9 = r12.vcruDMeiXYQeTlT3OI(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$KYHag8HRDlnO3X9zmZ r9 = r8.f4242husNiw3snxdgZPAGJm
            int r9 = r9.f4245husNiw3snxdgZPAGJm
            r2.clear(r9)
        L52:
            boolean r9 = r8.f4241KYHag8HRDlnO3X9zmZ
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.aAp6BD79BhftLCnuvf(r9)
            boolean r10 = r12.f4227THTDvPxsHqMeGb512f
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo r10 = r12.f4219G7AC3DWIx9i9fdanjk
            int r10 = r10.zZKhbgvUfsK4AEX3r0(r7)
            androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo r11 = r12.f4219G7AC3DWIx9i9fdanjk
            int r11 = r11.zZKhbgvUfsK4AEX3r0(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo r10 = r12.f4219G7AC3DWIx9i9fdanjk
            int r10 = r10.TCyPEKSzIyweCN5yp1(r7)
            androidx.recyclerview.widget.pbVGzGjWvY2LDXC8vo r11 = r12.f4219G7AC3DWIx9i9fdanjk
            int r11 = r11.TCyPEKSzIyweCN5yp1(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$HJFh0TGMpafqLE9haL r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.HJFh0TGMpafqLE9haL) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$KYHag8HRDlnO3X9zmZ r8 = r8.f4242husNiw3snxdgZPAGJm
            int r8 = r8.f4245husNiw3snxdgZPAGJm
            androidx.recyclerview.widget.StaggeredGridLayoutManager$KYHag8HRDlnO3X9zmZ r9 = r9.f4242husNiw3snxdgZPAGJm
            int r9 = r9.f4245husNiw3snxdgZPAGJm
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.suHivzALoCSfNps0XP():android.view.View");
    }

    public final void t1ob1jctq87uSyCpeM(View view, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, androidx.recyclerview.widget.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        if (kYHag8HRDlnO3X9zmZ.f3965husNiw3snxdgZPAGJm == 1) {
            if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                GraqRgO5nDZP94CSeH(view);
                return;
            } else {
                hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(view);
                return;
            }
        }
        if (hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
            jLObTZifvCGJKb1uVO(view);
        } else {
            hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.G7AC3DWIx9i9fdanjk(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int tGGjvtdOhUewv2twsg(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return BzLnH9Ew63rlrNW23o(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public final void tf0nfuAZUJWo4SN5He() {
        if (this.f4240xHA29AmDt6y96AnB3t.Z9WdNiOsPR0y54zHW4() == 1073741824) {
            return;
        }
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        float fMax = 0.0f;
        for (int i = 0; i < iLLKzvdU99Iw80uVD5I; i++) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
            float fHusNiw3snxdgZPAGJm = this.f4240xHA29AmDt6y96AnB3t.husNiw3snxdgZPAGJm(viewAAp6BD79BhftLCnuvf);
            if (fHusNiw3snxdgZPAGJm >= fMax) {
                if (((HJFh0TGMpafqLE9haL) viewAAp6BD79BhftLCnuvf.getLayoutParams()).KYHag8HRDlnO3X9zmZ()) {
                    fHusNiw3snxdgZPAGJm = (fHusNiw3snxdgZPAGJm * 1.0f) / this.f4233Y43RdunnpKgpbny0lE;
                }
                fMax = Math.max(fMax, fHusNiw3snxdgZPAGJm);
            }
        }
        int i2 = this.f4217A49QRPHynYLCBN0SqP;
        int iRound = Math.round(fMax * this.f4233Y43RdunnpKgpbny0lE);
        if (this.f4240xHA29AmDt6y96AnB3t.Z9WdNiOsPR0y54zHW4() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f4240xHA29AmDt6y96AnB3t.hoXrIDAFrSwfShk8da());
        }
        xDm0kltYAUFsNtkWXq(iRound);
        if (this.f4217A49QRPHynYLCBN0SqP == i2) {
            return;
        }
        for (int i3 = 0; i3 < iLLKzvdU99Iw80uVD5I; i3++) {
            View viewAAp6BD79BhftLCnuvf2 = aAp6BD79BhftLCnuvf(i3);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = (HJFh0TGMpafqLE9haL) viewAAp6BD79BhftLCnuvf2.getLayoutParams();
            if (!hJFh0TGMpafqLE9haL.f4241KYHag8HRDlnO3X9zmZ) {
                if (iiJlEZjcw2pMDvSjYw() && this.f4222LIMtzhnLwQyigzK0KO == 1) {
                    int i4 = this.f4233Y43RdunnpKgpbny0lE;
                    int i5 = hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.f4245husNiw3snxdgZPAGJm;
                    viewAAp6BD79BhftLCnuvf2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f4217A49QRPHynYLCBN0SqP) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = hJFh0TGMpafqLE9haL.f4242husNiw3snxdgZPAGJm.f4245husNiw3snxdgZPAGJm;
                    int i7 = this.f4222LIMtzhnLwQyigzK0KO;
                    int i8 = (this.f4217A49QRPHynYLCBN0SqP * i6) - (i6 * i2);
                    if (i7 == 1) {
                        viewAAp6BD79BhftLCnuvf2.offsetLeftAndRight(i8);
                    } else {
                        viewAAp6BD79BhftLCnuvf2.offsetTopAndBottom(i8);
                    }
                }
            }
        }
    }

    public View uWxB7TH05HzXzGqLIZ(boolean z) {
        int iT9PhQIpGRhE4yZDm1C = this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        int iPbVGzGjWvY2LDXC8vo = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        View view = null;
        for (int i = 0; i < iLLKzvdU99Iw80uVD5I; i++) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i);
            int iTCyPEKSzIyweCN5yp1 = this.f4219G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf);
            if (this.f4219G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf) > iT9PhQIpGRhE4yZDm1C && iTCyPEKSzIyweCN5yp1 < iPbVGzGjWvY2LDXC8vo) {
                if (iTCyPEKSzIyweCN5yp1 >= iT9PhQIpGRhE4yZDm1C || !z) {
                    return viewAAp6BD79BhftLCnuvf;
                }
                if (view == null) {
                    view = viewAAp6BD79BhftLCnuvf;
                }
            }
        }
        return view;
    }

    public final boolean vcruDMeiXYQeTlT3OI(KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        if (this.f4227THTDvPxsHqMeGb512f) {
            if (kYHag8HRDlnO3X9zmZ.Z9WdNiOsPR0y54zHW4() < this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo()) {
                ArrayList arrayList = kYHag8HRDlnO3X9zmZ.f4246lEeR5KfoEr4xU5yHH7;
                return !kYHag8HRDlnO3X9zmZ.hoXrIDAFrSwfShk8da((View) arrayList.get(arrayList.size() - 1)).f4241KYHag8HRDlnO3X9zmZ;
            }
        } else if (kYHag8HRDlnO3X9zmZ.aPyGSIylzVNKPT1Bls() > this.f4219G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) {
            return !kYHag8HRDlnO3X9zmZ.hoXrIDAFrSwfShk8da((View) kYHag8HRDlnO3X9zmZ.f4246lEeR5KfoEr4xU5yHH7.get(0)).f4241KYHag8HRDlnO3X9zmZ;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void vlBaBOcZ1q1ndWVoXn(int i) {
        super.vlBaBOcZ1q1ndWVoXn(i);
        for (int i2 = 0; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            this.f4226R9SAhYMerGybF9OAjL[i2].sTkWmhpZ5b1ArQIw4K(i);
        }
    }

    public final int vzXHdKiCTh4zilt9z1(int i) {
        int iOANkd3mP6AYvwbNLJM = this.f4226R9SAhYMerGybF9OAjL[0].OANkd3mP6AYvwbNLJM(i);
        for (int i2 = 1; i2 < this.f4233Y43RdunnpKgpbny0lE; i2++) {
            int iOANkd3mP6AYvwbNLJM2 = this.f4226R9SAhYMerGybF9OAjL[i2].OANkd3mP6AYvwbNLJM(i);
            if (iOANkd3mP6AYvwbNLJM2 < iOANkd3mP6AYvwbNLJM) {
                iOANkd3mP6AYvwbNLJM = iOANkd3mP6AYvwbNLJM2;
            }
        }
        return iOANkd3mP6AYvwbNLJM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean w9kKjxxNBwNcD4xB6O() {
        return this.f4220GyWRxpdt1T8mEJXPoD == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int wUKf1mNArSjssthGmN(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return BzLnH9Ew63rlrNW23o(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public void xDm0kltYAUFsNtkWXq(int i) {
        this.f4217A49QRPHynYLCBN0SqP = i / this.f4233Y43RdunnpKgpbny0lE;
        this.f4218DfpieXfdYs58yZAiXY = View.MeasureSpec.makeMeasureSpec(i, this.f4240xHA29AmDt6y96AnB3t.Z9WdNiOsPR0y54zHW4());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int xHA29AmDt6y96AnB3t(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return RkBK3rbmyPvWiHUrac(wWC27LAMFqFFBzfbNw);
    }

    public final void xtQ8QaNqF3hKvhL94g(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, boolean z) {
        int iPbVGzGjWvY2LDXC8vo;
        int iMsljfiu2GA8S2iWtz0 = msljfiu2GA8S2iWtz0(Integer.MIN_VALUE);
        if (iMsljfiu2GA8S2iWtz0 != Integer.MIN_VALUE && (iPbVGzGjWvY2LDXC8vo = this.f4219G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - iMsljfiu2GA8S2iWtz0) > 0) {
            int i = iPbVGzGjWvY2LDXC8vo - (-BzLnH9Ew63rlrNW23o(-iPbVGzGjWvY2LDXC8vo, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw));
            if (!z || i <= 0) {
                return;
            }
            this.f4219G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void zQjb36M22TWHJmh54i(int i) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f4220GyWRxpdt1T8mEJXPoD;
        if (husniw3snxdgzpagjm != null && husniw3snxdgzpagjm.f4255lEeR5KfoEr4xU5yHH7 != i) {
            husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL();
        }
        this.f4223OUd9THiLjZndMj0qdF = i;
        this.f4237jCtUeU2YI1poCxWcjm = Integer.MIN_VALUE;
        MecTLhJ95ynyqeEob1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean zaq8hOURtfwbcX17cG() {
        return this.f4222LIMtzhnLwQyigzK0KO == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int zcy2NNbtVXgoGQbfuq(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f4222LIMtzhnLwQyigzK0KO == 1 ? this.f4233Y43RdunnpKgpbny0lE : super.zcy2NNbtVXgoGQbfuq(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }
}
