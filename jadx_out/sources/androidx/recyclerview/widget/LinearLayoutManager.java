package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.aPyGSIylzVNKPT1Bls implements RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA {

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public boolean f3970A49QRPHynYLCBN0SqP;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public pbVGzGjWvY2LDXC8vo f3971G7AC3DWIx9i9fdanjk;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f3972LIMtzhnLwQyigzK0KO;

    /* renamed from: OUd9THiLjZndMj0qdF, reason: collision with root package name */
    public boolean f3973OUd9THiLjZndMj0qdF;

    /* renamed from: OqIo5QF00RDxUQb4qq, reason: collision with root package name */
    public int[] f3974OqIo5QF00RDxUQb4qq;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public HJFh0TGMpafqLE9haL f3975R9SAhYMerGybF9OAjL;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public int f3976THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public boolean f3977VItLRw50eXTZeEfGl0;

    /* renamed from: W3RZ2dTDKrKpS5Mxdk, reason: collision with root package name */
    public int f3978W3RZ2dTDKrKpS5Mxdk;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f3979WWC27LAMFqFFBzfbNw;

    /* renamed from: XzJ1BS7H9Ilbkv4eVM, reason: collision with root package name */
    public final lEeR5KfoEr4xU5yHH7 f3980XzJ1BS7H9Ilbkv4eVM;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public int f3981Y43RdunnpKgpbny0lE;

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public int f3982ao3wqKm5CXFuvC0q47;

    /* renamed from: jCtUeU2YI1poCxWcjm, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f3983jCtUeU2YI1poCxWcjm;

    /* renamed from: tXWeW0sqVddf7ZBflq, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f3984tXWeW0sqVddf7ZBflq;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f3985xHA29AmDt6y96AnB3t;

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3987HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public int f3989KYHag8HRDlnO3X9zmZ;

        /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
        public boolean f3990T9PhQIpGRhE4yZDm1C;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public int f3991TCyPEKSzIyweCN5yp1;

        /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
        public int f3992Z9WdNiOsPR0y54zHW4;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public int f3994husNiw3snxdgZPAGJm;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f3997s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public int f3998zZKhbgvUfsK4AEX3r0;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public boolean f3995lEeR5KfoEr4xU5yHH7 = true;

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public int f3988IPyIQcaNa8aB7drBED = 0;

        /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
        public int f3996pbVGzGjWvY2LDXC8vo = 0;

        /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
        public boolean f3986Acstmh57AKoSEkEFNJ = false;

        /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
        public List f3993e54J8UWNHWALQNixXM = null;

        public boolean HJFh0TGMpafqLE9haL(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            int i = this.f3998zZKhbgvUfsK4AEX3r0;
            return i >= 0 && i < wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        }

        public View KYHag8HRDlnO3X9zmZ(View view) {
            int iLEeR5KfoEr4xU5yHH7;
            int size = this.f3993e54J8UWNHWALQNixXM.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.OUd9THiLjZndMj0qdF) this.f3993e54J8UWNHWALQNixXM.get(i2)).f4125lEeR5KfoEr4xU5yHH7;
                RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view3.getLayoutParams();
                if (view3 != view && !oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() && (iLEeR5KfoEr4xU5yHH7 = (oANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7() - this.f3998zZKhbgvUfsK4AEX3r0) * this.f3994husNiw3snxdgZPAGJm) >= 0 && iLEeR5KfoEr4xU5yHH7 < i) {
                    view2 = view3;
                    if (iLEeR5KfoEr4xU5yHH7 == 0) {
                        break;
                    }
                    i = iLEeR5KfoEr4xU5yHH7;
                }
            }
            return view2;
        }

        public final View husNiw3snxdgZPAGJm() {
            int size = this.f3993e54J8UWNHWALQNixXM.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.OUd9THiLjZndMj0qdF) this.f3993e54J8UWNHWALQNixXM.get(i)).f4125lEeR5KfoEr4xU5yHH7;
                RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
                if (!oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() && this.f3998zZKhbgvUfsK4AEX3r0 == oANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7()) {
                    s3fjYDxWOUexjjVgyA(view);
                    return view;
                }
            }
            return null;
        }

        public void lEeR5KfoEr4xU5yHH7() {
            s3fjYDxWOUexjjVgyA(null);
        }

        public void s3fjYDxWOUexjjVgyA(View view) {
            View viewKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(view);
            this.f3998zZKhbgvUfsK4AEX3r0 = viewKYHag8HRDlnO3X9zmZ == null ? -1 : ((RecyclerView.OANkd3mP6AYvwbNLJM) viewKYHag8HRDlnO3X9zmZ.getLayoutParams()).lEeR5KfoEr4xU5yHH7();
        }

        public View zZKhbgvUfsK4AEX3r0(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
            if (this.f3993e54J8UWNHWALQNixXM != null) {
                return husNiw3snxdgZPAGJm();
            }
            View viewAPyGSIylzVNKPT1Bls = g7AC3DWIx9i9fdanjk.aPyGSIylzVNKPT1Bls(this.f3998zZKhbgvUfsK4AEX3r0);
            this.f3998zZKhbgvUfsK4AEX3r0 += this.f3994husNiw3snxdgZPAGJm;
            return viewAPyGSIylzVNKPT1Bls;
        }
    }

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public int f3999HJFh0TGMpafqLE9haL;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public boolean f4000husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public pbVGzGjWvY2LDXC8vo f4001lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4002s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f4003zZKhbgvUfsK4AEX3r0;

        public lEeR5KfoEr4xU5yHH7() {
            husNiw3snxdgZPAGJm();
        }

        public void HJFh0TGMpafqLE9haL(View view, int i) {
            int iAPyGSIylzVNKPT1Bls = this.f4001lEeR5KfoEr4xU5yHH7.aPyGSIylzVNKPT1Bls();
            if (iAPyGSIylzVNKPT1Bls >= 0) {
                s3fjYDxWOUexjjVgyA(view, i);
                return;
            }
            this.f4002s3fjYDxWOUexjjVgyA = i;
            if (this.f4003zZKhbgvUfsK4AEX3r0) {
                int iPbVGzGjWvY2LDXC8vo = (this.f4001lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo() - iAPyGSIylzVNKPT1Bls) - this.f4001lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view);
                this.f3999HJFh0TGMpafqLE9haL = this.f4001lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo() - iPbVGzGjWvY2LDXC8vo;
                if (iPbVGzGjWvY2LDXC8vo > 0) {
                    int iHusNiw3snxdgZPAGJm = this.f3999HJFh0TGMpafqLE9haL - this.f4001lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(view);
                    int iT9PhQIpGRhE4yZDm1C = this.f4001lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C();
                    int iMin = iHusNiw3snxdgZPAGJm - (iT9PhQIpGRhE4yZDm1C + Math.min(this.f4001lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view) - iT9PhQIpGRhE4yZDm1C, 0));
                    if (iMin < 0) {
                        this.f3999HJFh0TGMpafqLE9haL += Math.min(iPbVGzGjWvY2LDXC8vo, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iTCyPEKSzIyweCN5yp1 = this.f4001lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view);
            int iT9PhQIpGRhE4yZDm1C2 = iTCyPEKSzIyweCN5yp1 - this.f4001lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C();
            this.f3999HJFh0TGMpafqLE9haL = iTCyPEKSzIyweCN5yp1;
            if (iT9PhQIpGRhE4yZDm1C2 > 0) {
                int iPbVGzGjWvY2LDXC8vo2 = (this.f4001lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo() - Math.min(0, (this.f4001lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo() - iAPyGSIylzVNKPT1Bls) - this.f4001lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view))) - (iTCyPEKSzIyweCN5yp1 + this.f4001lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(view));
                if (iPbVGzGjWvY2LDXC8vo2 < 0) {
                    this.f3999HJFh0TGMpafqLE9haL -= Math.min(iT9PhQIpGRhE4yZDm1C2, -iPbVGzGjWvY2LDXC8vo2);
                }
            }
        }

        public void husNiw3snxdgZPAGJm() {
            this.f4002s3fjYDxWOUexjjVgyA = -1;
            this.f3999HJFh0TGMpafqLE9haL = Integer.MIN_VALUE;
            this.f4003zZKhbgvUfsK4AEX3r0 = false;
            this.f4000husNiw3snxdgZPAGJm = false;
        }

        public void lEeR5KfoEr4xU5yHH7() {
            this.f3999HJFh0TGMpafqLE9haL = this.f4003zZKhbgvUfsK4AEX3r0 ? this.f4001lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo() : this.f4001lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C();
        }

        public void s3fjYDxWOUexjjVgyA(View view, int i) {
            this.f3999HJFh0TGMpafqLE9haL = this.f4003zZKhbgvUfsK4AEX3r0 ? this.f4001lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(view) + this.f4001lEeR5KfoEr4xU5yHH7.aPyGSIylzVNKPT1Bls() : this.f4001lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(view);
            this.f4002s3fjYDxWOUexjjVgyA = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4002s3fjYDxWOUexjjVgyA + ", mCoordinate=" + this.f3999HJFh0TGMpafqLE9haL + ", mLayoutFromEnd=" + this.f4003zZKhbgvUfsK4AEX3r0 + ", mValid=" + this.f4000husNiw3snxdgZPAGJm + '}';
        }

        public boolean zZKhbgvUfsK4AEX3r0(View view, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
            RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) view.getLayoutParams();
            return !oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() && oANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7() >= 0 && oANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7() < wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        }
    }

    public static class s3fjYDxWOUexjjVgyA {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f4004HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4005lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public boolean f4006s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public boolean f4007zZKhbgvUfsK4AEX3r0;

        public void lEeR5KfoEr4xU5yHH7() {
            this.f4005lEeR5KfoEr4xU5yHH7 = 0;
            this.f4006s3fjYDxWOUexjjVgyA = false;
            this.f4004HJFh0TGMpafqLE9haL = false;
            this.f4007zZKhbgvUfsK4AEX3r0 = false;
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 implements Parcelable {
        public static final Parcelable.Creator<zZKhbgvUfsK4AEX3r0> CREATOR = new lEeR5KfoEr4xU5yHH7();

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public boolean f4008HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public int f4009lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public int f4010s3fjYDxWOUexjjVgyA;

        public static class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
            public zZKhbgvUfsK4AEX3r0 createFromParcel(Parcel parcel) {
                return new zZKhbgvUfsK4AEX3r0(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
            public zZKhbgvUfsK4AEX3r0[] newArray(int i) {
                return new zZKhbgvUfsK4AEX3r0[i];
            }
        }

        public zZKhbgvUfsK4AEX3r0() {
        }

        public boolean HJFh0TGMpafqLE9haL() {
            return this.f4009lEeR5KfoEr4xU5yHH7 >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4009lEeR5KfoEr4xU5yHH7);
            parcel.writeInt(this.f4010s3fjYDxWOUexjjVgyA);
            parcel.writeInt(this.f4008HJFh0TGMpafqLE9haL ? 1 : 0);
        }

        public void zZKhbgvUfsK4AEX3r0() {
            this.f4009lEeR5KfoEr4xU5yHH7 = -1;
        }

        public zZKhbgvUfsK4AEX3r0(Parcel parcel) {
            this.f4009lEeR5KfoEr4xU5yHH7 = parcel.readInt();
            this.f4010s3fjYDxWOUexjjVgyA = parcel.readInt();
            this.f4008HJFh0TGMpafqLE9haL = parcel.readInt() == 1;
        }

        public zZKhbgvUfsK4AEX3r0(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f4009lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0.f4009lEeR5KfoEr4xU5yHH7;
            this.f4010s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0.f4010s3fjYDxWOUexjjVgyA;
            this.f4008HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r0.f4008HJFh0TGMpafqLE9haL;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3981Y43RdunnpKgpbny0lE = 1;
        this.f3972LIMtzhnLwQyigzK0KO = false;
        this.f3970A49QRPHynYLCBN0SqP = false;
        this.f3977VItLRw50eXTZeEfGl0 = false;
        this.f3979WWC27LAMFqFFBzfbNw = true;
        this.f3976THTDvPxsHqMeGb512f = -1;
        this.f3982ao3wqKm5CXFuvC0q47 = Integer.MIN_VALUE;
        this.f3983jCtUeU2YI1poCxWcjm = null;
        this.f3980XzJ1BS7H9Ilbkv4eVM = new lEeR5KfoEr4xU5yHH7();
        this.f3984tXWeW0sqVddf7ZBflq = new s3fjYDxWOUexjjVgyA();
        this.f3978W3RZ2dTDKrKpS5Mxdk = 2;
        this.f3974OqIo5QF00RDxUQb4qq = new int[2];
        K3DzFKxpDGIqdlGY4t(i);
        tf0nfuAZUJWo4SN5He(z);
    }

    private View DkHm7hVHmkyvDHXSjR() {
        return aAp6BD79BhftLCnuvf(this.f3970A49QRPHynYLCBN0SqP ? 0 : lLKzvdU99Iw80uVD5I() - 1);
    }

    private View Qqql9aLAyQK9tLp8QF() {
        return aAp6BD79BhftLCnuvf(this.f3970A49QRPHynYLCBN0SqP ? lLKzvdU99Iw80uVD5I() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int A49QRPHynYLCBN0SqP(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return t1ob1jctq87uSyCpeM(wWC27LAMFqFFBzfbNw);
    }

    public final View ADbagDwlO3sAb2p0ry() {
        return EgmJdc4h5OU4spuEKW(lLKzvdU99Iw80uVD5I() - 1, -1);
    }

    public final boolean BzLnH9Ew63rlrNW23o(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return false;
        }
        View viewCSih7GetOUab1dYQjM = CSih7GetOUab1dYQjM();
        if (viewCSih7GetOUab1dYQjM != null && leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(viewCSih7GetOUab1dYQjM, wWC27LAMFqFFBzfbNw)) {
            leer5kfoer4xu5yhh7.HJFh0TGMpafqLE9haL(viewCSih7GetOUab1dYQjM, FtYx4GXtxwA8al5hBy(viewCSih7GetOUab1dYQjM));
            return true;
        }
        if (this.f3985xHA29AmDt6y96AnB3t != this.f3977VItLRw50eXTZeEfGl0) {
            return false;
        }
        View viewQnb0B0kp1U5mzuoCqH = leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 ? qnb0B0kp1U5mzuoCqH(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw) : XfvA8xAblLUDzfjNL9(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        if (viewQnb0B0kp1U5mzuoCqH == null) {
            return false;
        }
        leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(viewQnb0B0kp1U5mzuoCqH, FtYx4GXtxwA8al5hBy(viewQnb0B0kp1U5mzuoCqH));
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm() && w9kKjxxNBwNcD4xB6O() && (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewQnb0B0kp1U5mzuoCqH) >= this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() || this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewQnb0B0kp1U5mzuoCqH) < this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C())) {
            leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 ? this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() : this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        }
        return true;
    }

    public final void CPvkPRvSu1JpqPqzvl(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                dvmHGYHwlE2ean7ktb(i, g7AC3DWIx9i9fdanjk);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                dvmHGYHwlE2ean7ktb(i3, g7AC3DWIx9i9fdanjk);
            }
        }
    }

    public View EgmJdc4h5OU4spuEKW(int i, int i2) {
        int i3;
        int i4;
        vcruDMeiXYQeTlT3OI();
        if (i2 <= i && i2 >= i) {
            return aAp6BD79BhftLCnuvf(i);
        }
        if (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(aAp6BD79BhftLCnuvf(i)) < this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f3981Y43RdunnpKgpbny0lE == 0 ? this.f4183husNiw3snxdgZPAGJm : this.f4175KYHag8HRDlnO3X9zmZ).lEeR5KfoEr4xU5yHH7(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean Er40JrQbOM51vCQI8w() {
        return true;
    }

    public void F8je6vTkTMHm5WbjEC(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2) {
        int i = hJFh0TGMpafqLE9haL.f3998zZKhbgvUfsK4AEX3r0;
        if (i < 0 || i >= wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA()) {
            return;
        }
        hJFh0TGMpafqLE9haL2.lEeR5KfoEr4xU5yHH7(i, Math.max(0, hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void FI7jQXEuEg1AdcOOw7(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int i;
        int i2;
        int i3;
        int i4;
        int iJIhXU7AcR3dXyMdSM6;
        int i5;
        View viewOqIo5QF00RDxUQb4qq;
        int iTCyPEKSzIyweCN5yp1;
        int iPbVGzGjWvY2LDXC8vo;
        int i6 = -1;
        if (!(this.f3983jCtUeU2YI1poCxWcjm == null && this.f3976THTDvPxsHqMeGb512f == -1) && wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() == 0) {
            gpnYwZkFpQwu7zi2gb(g7AC3DWIx9i9fdanjk);
            return;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3983jCtUeU2YI1poCxWcjm;
        if (zzkhbgvufsk4aex3r0 != null && zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL()) {
            this.f3976THTDvPxsHqMeGb512f = this.f3983jCtUeU2YI1poCxWcjm.f4009lEeR5KfoEr4xU5yHH7;
        }
        vcruDMeiXYQeTlT3OI();
        this.f3975R9SAhYMerGybF9OAjL.f3995lEeR5KfoEr4xU5yHH7 = false;
        hNwHJdfN8Sg5H67aR5();
        View viewCSih7GetOUab1dYQjM = CSih7GetOUab1dYQjM();
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f3980XzJ1BS7H9Ilbkv4eVM;
        if (!leer5kfoer4xu5yhh7.f4000husNiw3snxdgZPAGJm || this.f3976THTDvPxsHqMeGb512f != -1 || this.f3983jCtUeU2YI1poCxWcjm != null) {
            leer5kfoer4xu5yhh7.husNiw3snxdgZPAGJm();
            lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = this.f3980XzJ1BS7H9Ilbkv4eVM;
            leer5kfoer4xu5yhh72.f4003zZKhbgvUfsK4AEX3r0 = this.f3970A49QRPHynYLCBN0SqP ^ this.f3977VItLRw50eXTZeEfGl0;
            ngyAMEcy385jHG8YEQ(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh72);
            this.f3980XzJ1BS7H9Ilbkv4eVM.f4000husNiw3snxdgZPAGJm = true;
        } else if (viewCSih7GetOUab1dYQjM != null && (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewCSih7GetOUab1dYQjM) >= this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() || this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewCSih7GetOUab1dYQjM) <= this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C())) {
            this.f3980XzJ1BS7H9Ilbkv4eVM.HJFh0TGMpafqLE9haL(viewCSih7GetOUab1dYQjM, FtYx4GXtxwA8al5hBy(viewCSih7GetOUab1dYQjM));
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ = hJFh0TGMpafqLE9haL.f3992Z9WdNiOsPR0y54zHW4 >= 0 ? 1 : -1;
        int[] iArr = this.f3974OqIo5QF00RDxUQb4qq;
        iArr[0] = 0;
        iArr[1] = 0;
        GraqRgO5nDZP94CSeH(wWC27LAMFqFFBzfbNw, iArr);
        int iMax = Math.max(0, this.f3974OqIo5QF00RDxUQb4qq[0]) + this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        int iMax2 = Math.max(0, this.f3974OqIo5QF00RDxUQb4qq[1]) + this.f3971G7AC3DWIx9i9fdanjk.Acstmh57AKoSEkEFNJ();
        if (wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm() && (i5 = this.f3976THTDvPxsHqMeGb512f) != -1 && this.f3982ao3wqKm5CXFuvC0q47 != Integer.MIN_VALUE && (viewOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(i5)) != null) {
            if (this.f3970A49QRPHynYLCBN0SqP) {
                iPbVGzGjWvY2LDXC8vo = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewOqIo5QF00RDxUQb4qq);
                iTCyPEKSzIyweCN5yp1 = this.f3982ao3wqKm5CXFuvC0q47;
            } else {
                iTCyPEKSzIyweCN5yp1 = this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewOqIo5QF00RDxUQb4qq) - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                iPbVGzGjWvY2LDXC8vo = this.f3982ao3wqKm5CXFuvC0q47;
            }
            int i7 = iPbVGzGjWvY2LDXC8vo - iTCyPEKSzIyweCN5yp1;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = this.f3980XzJ1BS7H9Ilbkv4eVM;
        if (!leer5kfoer4xu5yhh73.f4003zZKhbgvUfsK4AEX3r0 ? !this.f3970A49QRPHynYLCBN0SqP : this.f3970A49QRPHynYLCBN0SqP) {
            i6 = 1;
        }
        UViYrxCuj6kEgG2Mva(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh73, i6);
        ao3wqKm5CXFuvC0q47(g7AC3DWIx9i9fdanjk);
        this.f3975R9SAhYMerGybF9OAjL.f3990T9PhQIpGRhE4yZDm1C = jLObTZifvCGJKb1uVO();
        this.f3975R9SAhYMerGybF9OAjL.f3986Acstmh57AKoSEkEFNJ = wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm();
        this.f3975R9SAhYMerGybF9OAjL.f3996pbVGzGjWvY2LDXC8vo = 0;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh74 = this.f3980XzJ1BS7H9Ilbkv4eVM;
        if (leer5kfoer4xu5yhh74.f4003zZKhbgvUfsK4AEX3r0) {
            hV7XaowQwpA0oB6Ofm(leer5kfoer4xu5yhh74);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL2.f3988IPyIQcaNa8aB7drBED = iMax;
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL2, wWC27LAMFqFFBzfbNw, false);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = this.f3975R9SAhYMerGybF9OAjL;
            i2 = hJFh0TGMpafqLE9haL3.f3997s3fjYDxWOUexjjVgyA;
            int i8 = hJFh0TGMpafqLE9haL3.f3998zZKhbgvUfsK4AEX3r0;
            int i9 = hJFh0TGMpafqLE9haL3.f3987HJFh0TGMpafqLE9haL;
            if (i9 > 0) {
                iMax2 += i9;
            }
            sFPmpDxgppcnCCjn0l(this.f3980XzJ1BS7H9Ilbkv4eVM);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL4.f3988IPyIQcaNa8aB7drBED = iMax2;
            hJFh0TGMpafqLE9haL4.f3998zZKhbgvUfsK4AEX3r0 += hJFh0TGMpafqLE9haL4.f3994husNiw3snxdgZPAGJm;
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL4, wWC27LAMFqFFBzfbNw, false);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL5 = this.f3975R9SAhYMerGybF9OAjL;
            i = hJFh0TGMpafqLE9haL5.f3997s3fjYDxWOUexjjVgyA;
            int i10 = hJFh0TGMpafqLE9haL5.f3987HJFh0TGMpafqLE9haL;
            if (i10 > 0) {
                QlwekCdhwU6BfwkNVu(i8, i2);
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL6 = this.f3975R9SAhYMerGybF9OAjL;
                hJFh0TGMpafqLE9haL6.f3988IPyIQcaNa8aB7drBED = i10;
                RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL6, wWC27LAMFqFFBzfbNw, false);
                i2 = this.f3975R9SAhYMerGybF9OAjL.f3997s3fjYDxWOUexjjVgyA;
            }
        } else {
            sFPmpDxgppcnCCjn0l(leer5kfoer4xu5yhh74);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL7 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL7.f3988IPyIQcaNa8aB7drBED = iMax2;
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL7, wWC27LAMFqFFBzfbNw, false);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL8 = this.f3975R9SAhYMerGybF9OAjL;
            i = hJFh0TGMpafqLE9haL8.f3997s3fjYDxWOUexjjVgyA;
            int i11 = hJFh0TGMpafqLE9haL8.f3998zZKhbgvUfsK4AEX3r0;
            int i12 = hJFh0TGMpafqLE9haL8.f3987HJFh0TGMpafqLE9haL;
            if (i12 > 0) {
                iMax += i12;
            }
            hV7XaowQwpA0oB6Ofm(this.f3980XzJ1BS7H9Ilbkv4eVM);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL9 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL9.f3988IPyIQcaNa8aB7drBED = iMax;
            hJFh0TGMpafqLE9haL9.f3998zZKhbgvUfsK4AEX3r0 += hJFh0TGMpafqLE9haL9.f3994husNiw3snxdgZPAGJm;
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL9, wWC27LAMFqFFBzfbNw, false);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL10 = this.f3975R9SAhYMerGybF9OAjL;
            i2 = hJFh0TGMpafqLE9haL10.f3997s3fjYDxWOUexjjVgyA;
            int i13 = hJFh0TGMpafqLE9haL10.f3987HJFh0TGMpafqLE9haL;
            if (i13 > 0) {
                MfX5YxttElJdOx4uDl(i11, i);
                HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL11 = this.f3975R9SAhYMerGybF9OAjL;
                hJFh0TGMpafqLE9haL11.f3988IPyIQcaNa8aB7drBED = i13;
                RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL11, wWC27LAMFqFFBzfbNw, false);
                i = this.f3975R9SAhYMerGybF9OAjL.f3997s3fjYDxWOUexjjVgyA;
            }
        }
        if (lLKzvdU99Iw80uVD5I() > 0) {
            if (this.f3970A49QRPHynYLCBN0SqP ^ this.f3977VItLRw50eXTZeEfGl0) {
                int iJIhXU7AcR3dXyMdSM62 = JIhXU7AcR3dXyMdSM6(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, true);
                i3 = i2 + iJIhXU7AcR3dXyMdSM62;
                i4 = i + iJIhXU7AcR3dXyMdSM62;
                iJIhXU7AcR3dXyMdSM6 = msljfiu2GA8S2iWtz0(i3, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, false);
            } else {
                int iMsljfiu2GA8S2iWtz0 = msljfiu2GA8S2iWtz0(i2, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, true);
                i3 = i2 + iMsljfiu2GA8S2iWtz0;
                i4 = i + iMsljfiu2GA8S2iWtz0;
                iJIhXU7AcR3dXyMdSM6 = JIhXU7AcR3dXyMdSM6(i4, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, false);
            }
            i2 = i3 + iJIhXU7AcR3dXyMdSM6;
            i = i4 + iJIhXU7AcR3dXyMdSM6;
        }
        iiJlEZjcw2pMDvSjYw(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, i2, i);
        if (wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
            this.f3980XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm();
        } else {
            this.f3971G7AC3DWIx9i9fdanjk.Y43RdunnpKgpbny0lE();
        }
        this.f3985xHA29AmDt6y96AnB3t = this.f3977VItLRw50eXTZeEfGl0;
    }

    public final void FK1mYOUHT5iEQP3ZJ1(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        if (!hJFh0TGMpafqLE9haL.f3995lEeR5KfoEr4xU5yHH7 || hJFh0TGMpafqLE9haL.f3990T9PhQIpGRhE4yZDm1C) {
            return;
        }
        int i = hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1;
        int i2 = hJFh0TGMpafqLE9haL.f3996pbVGzGjWvY2LDXC8vo;
        if (hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ == -1) {
            TToLdubKjN4ASlJwWv(g7AC3DWIx9i9fdanjk, i, i2);
        } else {
            YiiZd9BUnxc5tLzouk(g7AC3DWIx9i9fdanjk, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void G7AC3DWIx9i9fdanjk(int i, RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        boolean z;
        int i2;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3983jCtUeU2YI1poCxWcjm;
        if (zzkhbgvufsk4aex3r0 == null || !zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL()) {
            hNwHJdfN8Sg5H67aR5();
            z = this.f3970A49QRPHynYLCBN0SqP;
            i2 = this.f3976THTDvPxsHqMeGb512f;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02 = this.f3983jCtUeU2YI1poCxWcjm;
            z = zzkhbgvufsk4aex3r02.f4008HJFh0TGMpafqLE9haL;
            i2 = zzkhbgvufsk4aex3r02.f4009lEeR5KfoEr4xU5yHH7;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f3978W3RZ2dTDKrKpS5Mxdk && i2 >= 0 && i2 < i; i4++) {
            hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(i2, 0);
            i2 += i3;
        }
    }

    public void GraqRgO5nDZP94CSeH(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int[] iArr) {
        int i;
        int iVzXHdKiCTh4zilt9z1 = vzXHdKiCTh4zilt9z1(wWC27LAMFqFFBzfbNw);
        if (this.f3975R9SAhYMerGybF9OAjL.f3989KYHag8HRDlnO3X9zmZ == -1) {
            i = 0;
        } else {
            i = iVzXHdKiCTh4zilt9z1;
            iVzXHdKiCTh4zilt9z1 = 0;
        }
        iArr[0] = iVzXHdKiCTh4zilt9z1;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public RecyclerView.OANkd3mP6AYvwbNLJM GyWRxpdt1T8mEJXPoD() {
        return new RecyclerView.OANkd3mP6AYvwbNLJM(-2, -2);
    }

    public final void INlqdFKQnSaOPxk27m(int i, int i2, boolean z, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int iT9PhQIpGRhE4yZDm1C;
        this.f3975R9SAhYMerGybF9OAjL.f3990T9PhQIpGRhE4yZDm1C = jLObTZifvCGJKb1uVO();
        this.f3975R9SAhYMerGybF9OAjL.f3989KYHag8HRDlnO3X9zmZ = i;
        int[] iArr = this.f3974OqIo5QF00RDxUQb4qq;
        iArr[0] = 0;
        iArr[1] = 0;
        GraqRgO5nDZP94CSeH(wWC27LAMFqFFBzfbNw, iArr);
        int iMax = Math.max(0, this.f3974OqIo5QF00RDxUQb4qq[0]);
        int iMax2 = Math.max(0, this.f3974OqIo5QF00RDxUQb4qq[1]);
        boolean z2 = i == 1;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        int i3 = z2 ? iMax2 : iMax;
        hJFh0TGMpafqLE9haL.f3988IPyIQcaNa8aB7drBED = i3;
        if (!z2) {
            iMax = iMax2;
        }
        hJFh0TGMpafqLE9haL.f3996pbVGzGjWvY2LDXC8vo = iMax;
        if (z2) {
            hJFh0TGMpafqLE9haL.f3988IPyIQcaNa8aB7drBED = i3 + this.f3971G7AC3DWIx9i9fdanjk.Acstmh57AKoSEkEFNJ();
            View viewDkHm7hVHmkyvDHXSjR = DkHm7hVHmkyvDHXSjR();
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL2.f3994husNiw3snxdgZPAGJm = this.f3970A49QRPHynYLCBN0SqP ? -1 : 1;
            int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(viewDkHm7hVHmkyvDHXSjR);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL3 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL2.f3998zZKhbgvUfsK4AEX3r0 = iFtYx4GXtxwA8al5hBy + hJFh0TGMpafqLE9haL3.f3994husNiw3snxdgZPAGJm;
            hJFh0TGMpafqLE9haL3.f3997s3fjYDxWOUexjjVgyA = this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewDkHm7hVHmkyvDHXSjR);
            iT9PhQIpGRhE4yZDm1C = this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewDkHm7hVHmkyvDHXSjR) - this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
        } else {
            View viewQqql9aLAyQK9tLp8QF = Qqql9aLAyQK9tLp8QF();
            this.f3975R9SAhYMerGybF9OAjL.f3988IPyIQcaNa8aB7drBED += this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL4 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL4.f3994husNiw3snxdgZPAGJm = this.f3970A49QRPHynYLCBN0SqP ? 1 : -1;
            int iFtYx4GXtxwA8al5hBy2 = FtYx4GXtxwA8al5hBy(viewQqql9aLAyQK9tLp8QF);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL5 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL4.f3998zZKhbgvUfsK4AEX3r0 = iFtYx4GXtxwA8al5hBy2 + hJFh0TGMpafqLE9haL5.f3994husNiw3snxdgZPAGJm;
            hJFh0TGMpafqLE9haL5.f3997s3fjYDxWOUexjjVgyA = this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewQqql9aLAyQK9tLp8QF);
            iT9PhQIpGRhE4yZDm1C = (-this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewQqql9aLAyQK9tLp8QF)) + this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        }
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL6 = this.f3975R9SAhYMerGybF9OAjL;
        hJFh0TGMpafqLE9haL6.f3987HJFh0TGMpafqLE9haL = i2;
        if (z) {
            hJFh0TGMpafqLE9haL6.f3987HJFh0TGMpafqLE9haL = i2 - iT9PhQIpGRhE4yZDm1C;
        }
        hJFh0TGMpafqLE9haL6.f3991TCyPEKSzIyweCN5yp1 = iT9PhQIpGRhE4yZDm1C;
    }

    public final int JIhXU7AcR3dXyMdSM6(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, boolean z) {
        int iPbVGzGjWvY2LDXC8vo;
        int iPbVGzGjWvY2LDXC8vo2 = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - i;
        if (iPbVGzGjWvY2LDXC8vo2 <= 0) {
            return 0;
        }
        int i2 = -Kf6IFvVH2efp6249v2(-iPbVGzGjWvY2LDXC8vo2, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        int i3 = i + i2;
        if (!z || (iPbVGzGjWvY2LDXC8vo = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - i3) <= 0) {
            return i2;
        }
        this.f3971G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(iPbVGzGjWvY2LDXC8vo);
        return iPbVGzGjWvY2LDXC8vo + i2;
    }

    public void K3DzFKxpDGIqdlGY4t(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        e54J8UWNHWALQNixXM(null);
        if (i != this.f3981Y43RdunnpKgpbny0lE || this.f3971G7AC3DWIx9i9fdanjk == null) {
            pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8voS3fjYDxWOUexjjVgyA = pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(this, i);
            this.f3971G7AC3DWIx9i9fdanjk = pbvgzgjwvy2ldxc8voS3fjYDxWOUexjjVgyA;
            this.f3980XzJ1BS7H9Ilbkv4eVM.f4001lEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8voS3fjYDxWOUexjjVgyA;
            this.f3981Y43RdunnpKgpbny0lE = i;
            MecTLhJ95ynyqeEob1();
        }
    }

    public final int KWpkmWKCm3jeG4AjIM(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        vcruDMeiXYQeTlT3OI();
        return e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(wWC27LAMFqFFBzfbNw, this.f3971G7AC3DWIx9i9fdanjk, YUDx3zHgOZWWxq2Qgs(!this.f3979WWC27LAMFqFFBzfbNw, true), ndQwlXNek6Yo5ZBYrV(!this.f3979WWC27LAMFqFFBzfbNw, true), this, this.f3979WWC27LAMFqFFBzfbNw);
    }

    public final boolean KYIcm5hlxje4bqExkp(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        int i;
        if (!wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm() && (i = this.f3976THTDvPxsHqMeGb512f) != -1) {
            if (i >= 0 && i < wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA()) {
                leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA = this.f3976THTDvPxsHqMeGb512f;
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3983jCtUeU2YI1poCxWcjm;
                if (zzkhbgvufsk4aex3r0 != null && zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL()) {
                    boolean z = this.f3983jCtUeU2YI1poCxWcjm.f4008HJFh0TGMpafqLE9haL;
                    leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 = z;
                    leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = z ? this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f3983jCtUeU2YI1poCxWcjm.f4010s3fjYDxWOUexjjVgyA : this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() + this.f3983jCtUeU2YI1poCxWcjm.f4010s3fjYDxWOUexjjVgyA;
                    return true;
                }
                if (this.f3982ao3wqKm5CXFuvC0q47 != Integer.MIN_VALUE) {
                    boolean z2 = this.f3970A49QRPHynYLCBN0SqP;
                    leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 = z2;
                    leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = z2 ? this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f3982ao3wqKm5CXFuvC0q47 : this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() + this.f3982ao3wqKm5CXFuvC0q47;
                    return true;
                }
                View viewOqIo5QF00RDxUQb4qq = OqIo5QF00RDxUQb4qq(this.f3976THTDvPxsHqMeGb512f);
                if (viewOqIo5QF00RDxUQb4qq == null) {
                    if (lLKzvdU99Iw80uVD5I() > 0) {
                        leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 = (this.f3976THTDvPxsHqMeGb512f < FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0))) == this.f3970A49QRPHynYLCBN0SqP;
                    }
                    leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
                } else {
                    if (this.f3971G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(viewOqIo5QF00RDxUQb4qq) > this.f3971G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da()) {
                        leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
                        return true;
                    }
                    if (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewOqIo5QF00RDxUQb4qq) - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C() < 0) {
                        leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
                        leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 = false;
                        return true;
                    }
                    if (this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewOqIo5QF00RDxUQb4qq) < 0) {
                        leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo();
                        leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 = true;
                        return true;
                    }
                    leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7.f4003zZKhbgvUfsK4AEX3r0 ? this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewOqIo5QF00RDxUQb4qq) + this.f3971G7AC3DWIx9i9fdanjk.aPyGSIylzVNKPT1Bls() : this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewOqIo5QF00RDxUQb4qq);
                }
                return true;
            }
            this.f3976THTDvPxsHqMeGb512f = -1;
            this.f3982ao3wqKm5CXFuvC0q47 = Integer.MIN_VALUE;
        }
        return false;
    }

    public int Kf6IFvVH2efp6249v2(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0 || i == 0) {
            return 0;
        }
        vcruDMeiXYQeTlT3OI();
        this.f3975R9SAhYMerGybF9OAjL.f3995lEeR5KfoEr4xU5yHH7 = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        INlqdFKQnSaOPxk27m(i2, iAbs, true, wWC27LAMFqFFBzfbNw);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        int iRkBK3rbmyPvWiHUrac = hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 + RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL, wWC27LAMFqFFBzfbNw, false);
        if (iRkBK3rbmyPvWiHUrac < 0) {
            return 0;
        }
        if (iAbs > iRkBK3rbmyPvWiHUrac) {
            i = i2 * iRkBK3rbmyPvWiHUrac;
        }
        this.f3971G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(-i);
        this.f3975R9SAhYMerGybF9OAjL.f3992Z9WdNiOsPR0y54zHW4 = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int LIMtzhnLwQyigzK0KO(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return gS59iOkCM8TpW4A2ew(wWC27LAMFqFFBzfbNw);
    }

    public final void MfX5YxttElJdOx4uDl(int i, int i2) {
        this.f3975R9SAhYMerGybF9OAjL.f3987HJFh0TGMpafqLE9haL = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - i2;
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        hJFh0TGMpafqLE9haL.f3994husNiw3snxdgZPAGJm = this.f3970A49QRPHynYLCBN0SqP ? -1 : 1;
        hJFh0TGMpafqLE9haL.f3998zZKhbgvUfsK4AEX3r0 = i;
        hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ = 1;
        hJFh0TGMpafqLE9haL.f3997s3fjYDxWOUexjjVgyA = i2;
        hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = Integer.MIN_VALUE;
    }

    public final View N1vPC7A5f7Unhsdkgr() {
        return this.f3970A49QRPHynYLCBN0SqP ? ADbagDwlO3sAb2p0ry() : jpEZy3U5wFkT2e9PKQ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean OANkd3mP6AYvwbNLJM() {
        return this.f3981Y43RdunnpKgpbny0lE == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void OWyIJu8lIXxQlvLhaC(RecyclerView recyclerView, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk) {
        super.OWyIJu8lIXxQlvLhaC(recyclerView, g7AC3DWIx9i9fdanjk);
        if (this.f3973OUd9THiLjZndMj0qdF) {
            gpnYwZkFpQwu7zi2gb(g7AC3DWIx9i9fdanjk);
            g7AC3DWIx9i9fdanjk.HJFh0TGMpafqLE9haL();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public View OqIo5QF00RDxUQb4qq(int i) {
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        if (iLLKzvdU99Iw80uVD5I == 0) {
            return null;
        }
        int iFtYx4GXtxwA8al5hBy = i - FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0));
        if (iFtYx4GXtxwA8al5hBy >= 0 && iFtYx4GXtxwA8al5hBy < iLLKzvdU99Iw80uVD5I) {
            View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(iFtYx4GXtxwA8al5hBy);
            if (FtYx4GXtxwA8al5hBy(viewAAp6BD79BhftLCnuvf) == i) {
                return viewAAp6BD79BhftLCnuvf;
            }
        }
        return super.OqIo5QF00RDxUQb4qq(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void QW0Trt6m3nVBNaYFnP(AccessibilityEvent accessibilityEvent) {
        super.QW0Trt6m3nVBNaYFnP(accessibilityEvent);
        if (lLKzvdU99Iw80uVD5I() > 0) {
            accessibilityEvent.setFromIndex(pjij9fAFhRRn230kOs());
            accessibilityEvent.setToIndex(mhQSzVvPFnByVGnwX9());
        }
    }

    public final void QlwekCdhwU6BfwkNVu(int i, int i2) {
        this.f3975R9SAhYMerGybF9OAjL.f3987HJFh0TGMpafqLE9haL = i2 - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        hJFh0TGMpafqLE9haL.f3998zZKhbgvUfsK4AEX3r0 = i;
        hJFh0TGMpafqLE9haL.f3994husNiw3snxdgZPAGJm = this.f3970A49QRPHynYLCBN0SqP ? 1 : -1;
        hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ = -1;
        hJFh0TGMpafqLE9haL.f3997s3fjYDxWOUexjjVgyA = i2;
        hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void R9SAhYMerGybF9OAjL(int i, int i2, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, RecyclerView.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        if (this.f3981Y43RdunnpKgpbny0lE != 0) {
            i = i2;
        }
        if (lLKzvdU99Iw80uVD5I() == 0 || i == 0) {
            return;
        }
        vcruDMeiXYQeTlT3OI();
        INlqdFKQnSaOPxk27m(i > 0 ? 1 : -1, Math.abs(i), true, wWC27LAMFqFFBzfbNw);
        F8je6vTkTMHm5WbjEC(wWC27LAMFqFFBzfbNw, this.f3975R9SAhYMerGybF9OAjL, hJFh0TGMpafqLE9haL);
    }

    public int RkBK3rbmyPvWiHUrac(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, boolean z) {
        int i = hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL;
        int i2 = hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = i2 + i;
            }
            FK1mYOUHT5iEQP3ZJ1(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL);
        }
        int i3 = hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL + hJFh0TGMpafqLE9haL.f3988IPyIQcaNa8aB7drBED;
        s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = this.f3984tXWeW0sqVddf7ZBflq;
        while (true) {
            if ((!hJFh0TGMpafqLE9haL.f3990T9PhQIpGRhE4yZDm1C && i3 <= 0) || !hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(wWC27LAMFqFFBzfbNw)) {
                break;
            }
            s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7();
            exhPLopOJ5QWEzRjTU(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, hJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya);
            if (!s3fjydxwouexjjvgya.f4006s3fjYDxWOUexjjVgyA) {
                hJFh0TGMpafqLE9haL.f3997s3fjYDxWOUexjjVgyA += s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7 * hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ;
                if (!s3fjydxwouexjjvgya.f4004HJFh0TGMpafqLE9haL || hJFh0TGMpafqLE9haL.f3993e54J8UWNHWALQNixXM != null || !wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm()) {
                    int i4 = hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL;
                    int i5 = s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7;
                    hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL = i4 - i5;
                    i3 -= i5;
                }
                int i6 = hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7;
                    hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = i7;
                    int i8 = hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL;
                    if (i8 < 0) {
                        hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = i7 + i8;
                    }
                    FK1mYOUHT5iEQP3ZJ1(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL);
                }
                if (z && s3fjydxwouexjjvgya.f4007zZKhbgvUfsK4AEX3r0) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int THTDvPxsHqMeGb512f(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return t1ob1jctq87uSyCpeM(wWC27LAMFqFFBzfbNw);
    }

    public final void TToLdubKjN4ASlJwWv(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i, int i2) {
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        if (i < 0) {
            return;
        }
        int iIPyIQcaNa8aB7drBED = (this.f3971G7AC3DWIx9i9fdanjk.IPyIQcaNa8aB7drBED() - i) + i2;
        if (this.f3970A49QRPHynYLCBN0SqP) {
            for (int i3 = 0; i3 < iLLKzvdU99Iw80uVD5I; i3++) {
                View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i3);
                if (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf) < iIPyIQcaNa8aB7drBED || this.f3971G7AC3DWIx9i9fdanjk.zaq8hOURtfwbcX17cG(viewAAp6BD79BhftLCnuvf) < iIPyIQcaNa8aB7drBED) {
                    CPvkPRvSu1JpqPqzvl(g7AC3DWIx9i9fdanjk, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = iLLKzvdU99Iw80uVD5I - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View viewAAp6BD79BhftLCnuvf2 = aAp6BD79BhftLCnuvf(i5);
            if (this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewAAp6BD79BhftLCnuvf2) < iIPyIQcaNa8aB7drBED || this.f3971G7AC3DWIx9i9fdanjk.zaq8hOURtfwbcX17cG(viewAAp6BD79BhftLCnuvf2) < iIPyIQcaNa8aB7drBED) {
                CPvkPRvSu1JpqPqzvl(g7AC3DWIx9i9fdanjk, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void Tn7MuV14fPMb1UrB5h(RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = new TCyPEKSzIyweCN5yp1(recyclerView.getContext());
        tCyPEKSzIyweCN5yp1.OANkd3mP6AYvwbNLJM(i);
        yuvys90eVmNOCmVGXw(tCyPEKSzIyweCN5yp1);
    }

    public void UViYrxCuj6kEgG2Mva(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int VItLRw50eXTZeEfGl0(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return KWpkmWKCm3jeG4AjIM(wWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int WWC27LAMFqFFBzfbNw(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return gS59iOkCM8TpW4A2ew(wWC27LAMFqFFBzfbNw);
    }

    public final View XfvA8xAblLUDzfjNL9(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3970A49QRPHynYLCBN0SqP ? njV42vQJoqlfw05NNQ(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw) : cni9M1Tt0N7bwq7oSh(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void YIIWDMF3jHAs3E0PkN(Parcelable parcelable) {
        if (parcelable instanceof zZKhbgvUfsK4AEX3r0) {
            this.f3983jCtUeU2YI1poCxWcjm = (zZKhbgvUfsK4AEX3r0) parcelable;
            MecTLhJ95ynyqeEob1();
        }
    }

    public View YUDx3zHgOZWWxq2Qgs(boolean z, boolean z2) {
        int iLLKzvdU99Iw80uVD5I;
        int iLLKzvdU99Iw80uVD5I2;
        if (this.f3970A49QRPHynYLCBN0SqP) {
            iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1;
            iLLKzvdU99Iw80uVD5I2 = -1;
        } else {
            iLLKzvdU99Iw80uVD5I = 0;
            iLLKzvdU99Iw80uVD5I2 = lLKzvdU99Iw80uVD5I();
        }
        return uWxB7TH05HzXzGqLIZ(iLLKzvdU99Iw80uVD5I, iLLKzvdU99Iw80uVD5I2, z, z2);
    }

    public final void YiiZd9BUnxc5tLzouk(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I();
        if (!this.f3970A49QRPHynYLCBN0SqP) {
            for (int i4 = 0; i4 < iLLKzvdU99Iw80uVD5I; i4++) {
                View viewAAp6BD79BhftLCnuvf = aAp6BD79BhftLCnuvf(i4);
                if (this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf) > i3 || this.f3971G7AC3DWIx9i9fdanjk.OANkd3mP6AYvwbNLJM(viewAAp6BD79BhftLCnuvf) > i3) {
                    CPvkPRvSu1JpqPqzvl(g7AC3DWIx9i9fdanjk, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iLLKzvdU99Iw80uVD5I - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewAAp6BD79BhftLCnuvf2 = aAp6BD79BhftLCnuvf(i6);
            if (this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewAAp6BD79BhftLCnuvf2) > i3 || this.f3971G7AC3DWIx9i9fdanjk.OANkd3mP6AYvwbNLJM(viewAAp6BD79BhftLCnuvf2) > i3) {
                CPvkPRvSu1JpqPqzvl(g7AC3DWIx9i9fdanjk, i5, i6);
                return;
            }
        }
    }

    public final View cni9M1Tt0N7bwq7oSh(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return xtQ8QaNqF3hKvhL94g(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, 0, lLKzvdU99Iw80uVD5I(), wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void e54J8UWNHWALQNixXM(String str) {
        if (this.f3983jCtUeU2YI1poCxWcjm == null) {
            super.e54J8UWNHWALQNixXM(str);
        }
    }

    public void exhPLopOJ5QWEzRjTU(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        int i;
        int i2;
        int i3;
        int iZXY7dgnTfw9Pd9RXel;
        int iKYHag8HRDlnO3X9zmZ;
        View viewZZKhbgvUfsK4AEX3r0 = hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(g7AC3DWIx9i9fdanjk);
        if (viewZZKhbgvUfsK4AEX3r0 == null) {
            s3fjydxwouexjjvgya.f4006s3fjYDxWOUexjjVgyA = true;
            return;
        }
        RecyclerView.OANkd3mP6AYvwbNLJM oANkd3mP6AYvwbNLJM = (RecyclerView.OANkd3mP6AYvwbNLJM) viewZZKhbgvUfsK4AEX3r0.getLayoutParams();
        if (hJFh0TGMpafqLE9haL.f3993e54J8UWNHWALQNixXM == null) {
            if (this.f3970A49QRPHynYLCBN0SqP == (hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ == -1)) {
                pbVGzGjWvY2LDXC8vo(viewZZKhbgvUfsK4AEX3r0);
            } else {
                Acstmh57AKoSEkEFNJ(viewZZKhbgvUfsK4AEX3r0, 0);
            }
        } else {
            if (this.f3970A49QRPHynYLCBN0SqP == (hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ == -1)) {
                TCyPEKSzIyweCN5yp1(viewZZKhbgvUfsK4AEX3r0);
            } else {
                IPyIQcaNa8aB7drBED(viewZZKhbgvUfsK4AEX3r0, 0);
            }
        }
        aUn6Hqsqw2PVM8685Z(viewZZKhbgvUfsK4AEX3r0, 0, 0);
        s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7 = this.f3971G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(viewZZKhbgvUfsK4AEX3r0);
        if (this.f3981Y43RdunnpKgpbny0lE == 1) {
            if (nZURNaK44ts4XNCkYr()) {
                iKYHag8HRDlnO3X9zmZ = O1furmptfI76BGfN0d() - eWK41qw3g36LVd4UnS();
                iZXY7dgnTfw9Pd9RXel = iKYHag8HRDlnO3X9zmZ - this.f3971G7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(viewZZKhbgvUfsK4AEX3r0);
            } else {
                iZXY7dgnTfw9Pd9RXel = zXY7dgnTfw9Pd9RXel();
                iKYHag8HRDlnO3X9zmZ = this.f3971G7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(viewZZKhbgvUfsK4AEX3r0) + iZXY7dgnTfw9Pd9RXel;
            }
            int i4 = hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ;
            int i5 = hJFh0TGMpafqLE9haL.f3997s3fjYDxWOUexjjVgyA;
            if (i4 == -1) {
                i3 = i5;
                i2 = iKYHag8HRDlnO3X9zmZ;
                i = i5 - s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7;
            } else {
                i = i5;
                i2 = iKYHag8HRDlnO3X9zmZ;
                i3 = s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7 + i5;
            }
        } else {
            int iDFYiVi7zXozAjRciKa = DFYiVi7zXozAjRciKa();
            int iKYHag8HRDlnO3X9zmZ2 = this.f3971G7AC3DWIx9i9fdanjk.KYHag8HRDlnO3X9zmZ(viewZZKhbgvUfsK4AEX3r0) + iDFYiVi7zXozAjRciKa;
            int i6 = hJFh0TGMpafqLE9haL.f3989KYHag8HRDlnO3X9zmZ;
            int i7 = hJFh0TGMpafqLE9haL.f3997s3fjYDxWOUexjjVgyA;
            if (i6 == -1) {
                i2 = i7;
                i = iDFYiVi7zXozAjRciKa;
                i3 = iKYHag8HRDlnO3X9zmZ2;
                iZXY7dgnTfw9Pd9RXel = i7 - s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7;
            } else {
                i = iDFYiVi7zXozAjRciKa;
                i2 = s3fjydxwouexjjvgya.f4005lEeR5KfoEr4xU5yHH7 + i7;
                i3 = iKYHag8HRDlnO3X9zmZ2;
                iZXY7dgnTfw9Pd9RXel = i7;
            }
        }
        Bc5OTyAfOKVCQb8CEz(viewZZKhbgvUfsK4AEX3r0, iZXY7dgnTfw9Pd9RXel, i, i2, i3);
        if (oANkd3mP6AYvwbNLJM.HJFh0TGMpafqLE9haL() || oANkd3mP6AYvwbNLJM.s3fjYDxWOUexjjVgyA()) {
            s3fjydxwouexjjvgya.f4004HJFh0TGMpafqLE9haL = true;
        }
        s3fjydxwouexjjvgya.f4007zZKhbgvUfsK4AEX3r0 = viewZZKhbgvUfsK4AEX3r0.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public Parcelable fBZDmBPlAHk1Liuf1T() {
        if (this.f3983jCtUeU2YI1poCxWcjm != null) {
            return new zZKhbgvUfsK4AEX3r0(this.f3983jCtUeU2YI1poCxWcjm);
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0();
        if (lLKzvdU99Iw80uVD5I() > 0) {
            vcruDMeiXYQeTlT3OI();
            boolean z = this.f3985xHA29AmDt6y96AnB3t ^ this.f3970A49QRPHynYLCBN0SqP;
            zzkhbgvufsk4aex3r0.f4008HJFh0TGMpafqLE9haL = z;
            if (z) {
                View viewDkHm7hVHmkyvDHXSjR = DkHm7hVHmkyvDHXSjR();
                zzkhbgvufsk4aex3r0.f4010s3fjYDxWOUexjjVgyA = this.f3971G7AC3DWIx9i9fdanjk.pbVGzGjWvY2LDXC8vo() - this.f3971G7AC3DWIx9i9fdanjk.zZKhbgvUfsK4AEX3r0(viewDkHm7hVHmkyvDHXSjR);
                zzkhbgvufsk4aex3r0.f4009lEeR5KfoEr4xU5yHH7 = FtYx4GXtxwA8al5hBy(viewDkHm7hVHmkyvDHXSjR);
            } else {
                View viewQqql9aLAyQK9tLp8QF = Qqql9aLAyQK9tLp8QF();
                zzkhbgvufsk4aex3r0.f4009lEeR5KfoEr4xU5yHH7 = FtYx4GXtxwA8al5hBy(viewQqql9aLAyQK9tLp8QF);
                zzkhbgvufsk4aex3r0.f4010s3fjYDxWOUexjjVgyA = this.f3971G7AC3DWIx9i9fdanjk.TCyPEKSzIyweCN5yp1(viewQqql9aLAyQK9tLp8QF) - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
            }
        } else {
            zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        }
        return zzkhbgvufsk4aex3r0;
    }

    public final int gS59iOkCM8TpW4A2ew(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        vcruDMeiXYQeTlT3OI();
        return e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA(wWC27LAMFqFFBzfbNw, this.f3971G7AC3DWIx9i9fdanjk, YUDx3zHgOZWWxq2Qgs(!this.f3979WWC27LAMFqFFBzfbNw, true), ndQwlXNek6Yo5ZBYrV(!this.f3979WWC27LAMFqFFBzfbNw, true), this, this.f3979WWC27LAMFqFFBzfbNw, this.f3970A49QRPHynYLCBN0SqP);
    }

    public HJFh0TGMpafqLE9haL h3D8MhcyLuC2SOP1fB() {
        return new HJFh0TGMpafqLE9haL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void h6NrAcYSuIyiU1qV6F(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        super.h6NrAcYSuIyiU1qV6F(wWC27LAMFqFFBzfbNw);
        this.f3983jCtUeU2YI1poCxWcjm = null;
        this.f3976THTDvPxsHqMeGb512f = -1;
        this.f3982ao3wqKm5CXFuvC0q47 = Integer.MIN_VALUE;
        this.f3980XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm();
    }

    public final void hNwHJdfN8Sg5H67aR5() {
        this.f3970A49QRPHynYLCBN0SqP = (this.f3981Y43RdunnpKgpbny0lE == 1 || !nZURNaK44ts4XNCkYr()) ? this.f3972LIMtzhnLwQyigzK0KO : !this.f3972LIMtzhnLwQyigzK0KO;
    }

    public final void hV7XaowQwpA0oB6Ofm(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        QlwekCdhwU6BfwkNVu(leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.VItLRw50eXTZeEfGl0.s3fjYDxWOUexjjVgyA
    public PointF husNiw3snxdgZPAGJm(int i) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return null;
        }
        int i2 = (i < FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0))) != this.f3970A49QRPHynYLCBN0SqP ? -1 : 1;
        return this.f3981Y43RdunnpKgpbny0lE == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void iiJlEZjcw2pMDvSjYw(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i, int i2) {
        if (!wWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1() || lLKzvdU99Iw80uVD5I() == 0 || wWC27LAMFqFFBzfbNw.husNiw3snxdgZPAGJm() || !w9kKjxxNBwNcD4xB6O()) {
            return;
        }
        List listZ9WdNiOsPR0y54zHW4 = g7AC3DWIx9i9fdanjk.Z9WdNiOsPR0y54zHW4();
        int size = listZ9WdNiOsPR0y54zHW4.size();
        int iFtYx4GXtxwA8al5hBy = FtYx4GXtxwA8al5hBy(aAp6BD79BhftLCnuvf(0));
        int iHusNiw3snxdgZPAGJm = 0;
        int iHusNiw3snxdgZPAGJm2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.OUd9THiLjZndMj0qdF oUd9THiLjZndMj0qdF = (RecyclerView.OUd9THiLjZndMj0qdF) listZ9WdNiOsPR0y54zHW4.get(i3);
            if (!oUd9THiLjZndMj0qdF.xHA29AmDt6y96AnB3t()) {
                if ((oUd9THiLjZndMj0qdF.T9PhQIpGRhE4yZDm1C() < iFtYx4GXtxwA8al5hBy) != this.f3970A49QRPHynYLCBN0SqP) {
                    iHusNiw3snxdgZPAGJm += this.f3971G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7);
                } else {
                    iHusNiw3snxdgZPAGJm2 += this.f3971G7AC3DWIx9i9fdanjk.husNiw3snxdgZPAGJm(oUd9THiLjZndMj0qdF.f4125lEeR5KfoEr4xU5yHH7);
                }
            }
        }
        this.f3975R9SAhYMerGybF9OAjL.f3993e54J8UWNHWALQNixXM = listZ9WdNiOsPR0y54zHW4;
        if (iHusNiw3snxdgZPAGJm > 0) {
            QlwekCdhwU6BfwkNVu(FtYx4GXtxwA8al5hBy(Qqql9aLAyQK9tLp8QF()), i);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL.f3988IPyIQcaNa8aB7drBED = iHusNiw3snxdgZPAGJm;
            hJFh0TGMpafqLE9haL.f3987HJFh0TGMpafqLE9haL = 0;
            hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, this.f3975R9SAhYMerGybF9OAjL, wWC27LAMFqFFBzfbNw, false);
        }
        if (iHusNiw3snxdgZPAGJm2 > 0) {
            MfX5YxttElJdOx4uDl(FtYx4GXtxwA8al5hBy(DkHm7hVHmkyvDHXSjR()), i2);
            HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL2 = this.f3975R9SAhYMerGybF9OAjL;
            hJFh0TGMpafqLE9haL2.f3988IPyIQcaNa8aB7drBED = iHusNiw3snxdgZPAGJm2;
            hJFh0TGMpafqLE9haL2.f3987HJFh0TGMpafqLE9haL = 0;
            hJFh0TGMpafqLE9haL2.lEeR5KfoEr4xU5yHH7();
            RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, this.f3975R9SAhYMerGybF9OAjL, wWC27LAMFqFFBzfbNw, false);
        }
        this.f3975R9SAhYMerGybF9OAjL.f3993e54J8UWNHWALQNixXM = null;
    }

    public boolean jLObTZifvCGJKb1uVO() {
        return this.f3971G7AC3DWIx9i9fdanjk.Z9WdNiOsPR0y54zHW4() == 0 && this.f3971G7AC3DWIx9i9fdanjk.IPyIQcaNa8aB7drBED() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean jguN4azZtOjukyvhIL() {
        return (ZJNyOIPL0usMs2xSAn() == 1073741824 || iQCvttGuB7nx4r7kMP() == 1073741824 || !yL2E9nlEZpg8ZZx8XE()) ? false : true;
    }

    public final View jpEZy3U5wFkT2e9PKQ() {
        return EgmJdc4h5OU4spuEKW(0, lLKzvdU99Iw80uVD5I());
    }

    public int mhQSzVvPFnByVGnwX9() {
        View viewUWxB7TH05HzXzGqLIZ = uWxB7TH05HzXzGqLIZ(lLKzvdU99Iw80uVD5I() - 1, -1, false, true);
        if (viewUWxB7TH05HzXzGqLIZ == null) {
            return -1;
        }
        return FtYx4GXtxwA8al5hBy(viewUWxB7TH05HzXzGqLIZ);
    }

    public final int msljfiu2GA8S2iWtz0(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, boolean z) {
        int iT9PhQIpGRhE4yZDm1C;
        int iT9PhQIpGRhE4yZDm1C2 = i - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C();
        if (iT9PhQIpGRhE4yZDm1C2 <= 0) {
            return 0;
        }
        int i2 = -Kf6IFvVH2efp6249v2(iT9PhQIpGRhE4yZDm1C2, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
        int i3 = i + i2;
        if (!z || (iT9PhQIpGRhE4yZDm1C = i3 - this.f3971G7AC3DWIx9i9fdanjk.T9PhQIpGRhE4yZDm1C()) <= 0) {
            return i2;
        }
        this.f3971G7AC3DWIx9i9fdanjk.sTkWmhpZ5b1ArQIw4K(-iT9PhQIpGRhE4yZDm1C);
        return i2 - iT9PhQIpGRhE4yZDm1C;
    }

    public boolean nZURNaK44ts4XNCkYr() {
        return Tu4WCh2gEwj8E4oHbP() == 1;
    }

    public View ndQwlXNek6Yo5ZBYrV(boolean z, boolean z2) {
        int iLLKzvdU99Iw80uVD5I;
        int iLLKzvdU99Iw80uVD5I2;
        if (this.f3970A49QRPHynYLCBN0SqP) {
            iLLKzvdU99Iw80uVD5I = 0;
            iLLKzvdU99Iw80uVD5I2 = lLKzvdU99Iw80uVD5I();
        } else {
            iLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I() - 1;
            iLLKzvdU99Iw80uVD5I2 = -1;
        }
        return uWxB7TH05HzXzGqLIZ(iLLKzvdU99Iw80uVD5I, iLLKzvdU99Iw80uVD5I2, z, z2);
    }

    public final void ngyAMEcy385jHG8YEQ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (KYIcm5hlxje4bqExkp(wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh7) || BzLnH9Ew63rlrNW23o(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, leer5kfoer4xu5yhh7)) {
            return;
        }
        leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
        leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA = this.f3977VItLRw50eXTZeEfGl0 ? wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA() - 1 : 0;
    }

    public final View njV42vQJoqlfw05NNQ(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return xtQ8QaNqF3hKvhL94g(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw, lLKzvdU99Iw80uVD5I() - 1, -1, wWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public View oOMFI1Dcqcg1BSVNty(View view, int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        int iPifLUtPYGKkyBx85TF;
        hNwHJdfN8Sg5H67aR5();
        if (lLKzvdU99Iw80uVD5I() == 0 || (iPifLUtPYGKkyBx85TF = pifLUtPYGKkyBx85TF(i)) == Integer.MIN_VALUE) {
            return null;
        }
        vcruDMeiXYQeTlT3OI();
        INlqdFKQnSaOPxk27m(iPifLUtPYGKkyBx85TF, (int) (this.f3971G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da() * 0.33333334f), false, wWC27LAMFqFFBzfbNw);
        HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = this.f3975R9SAhYMerGybF9OAjL;
        hJFh0TGMpafqLE9haL.f3991TCyPEKSzIyweCN5yp1 = Integer.MIN_VALUE;
        hJFh0TGMpafqLE9haL.f3995lEeR5KfoEr4xU5yHH7 = false;
        RkBK3rbmyPvWiHUrac(g7AC3DWIx9i9fdanjk, hJFh0TGMpafqLE9haL, wWC27LAMFqFFBzfbNw, true);
        View viewN1vPC7A5f7Unhsdkgr = iPifLUtPYGKkyBx85TF == -1 ? N1vPC7A5f7Unhsdkgr() : oyZAo7y5frVexNxTMd();
        View viewQqql9aLAyQK9tLp8QF = iPifLUtPYGKkyBx85TF == -1 ? Qqql9aLAyQK9tLp8QF() : DkHm7hVHmkyvDHXSjR();
        if (!viewQqql9aLAyQK9tLp8QF.hasFocusable()) {
            return viewN1vPC7A5f7Unhsdkgr;
        }
        if (viewN1vPC7A5f7Unhsdkgr == null) {
            return null;
        }
        return viewQqql9aLAyQK9tLp8QF;
    }

    public final View oyZAo7y5frVexNxTMd() {
        return this.f3970A49QRPHynYLCBN0SqP ? jpEZy3U5wFkT2e9PKQ() : ADbagDwlO3sAb2p0ry();
    }

    public int pifLUtPYGKkyBx85TF(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3981Y43RdunnpKgpbny0lE == 1) ? 1 : Integer.MIN_VALUE : this.f3981Y43RdunnpKgpbny0lE == 0 ? 1 : Integer.MIN_VALUE : this.f3981Y43RdunnpKgpbny0lE == 1 ? -1 : Integer.MIN_VALUE : this.f3981Y43RdunnpKgpbny0lE == 0 ? -1 : Integer.MIN_VALUE : (this.f3981Y43RdunnpKgpbny0lE != 1 && nZURNaK44ts4XNCkYr()) ? -1 : 1 : (this.f3981Y43RdunnpKgpbny0lE != 1 && nZURNaK44ts4XNCkYr()) ? 1 : -1;
    }

    public int pjij9fAFhRRn230kOs() {
        View viewUWxB7TH05HzXzGqLIZ = uWxB7TH05HzXzGqLIZ(0, lLKzvdU99Iw80uVD5I(), false, true);
        if (viewUWxB7TH05HzXzGqLIZ == null) {
            return -1;
        }
        return FtYx4GXtxwA8al5hBy(viewUWxB7TH05HzXzGqLIZ);
    }

    public int q0O8WPjPHflNoINQ2T() {
        return this.f3981Y43RdunnpKgpbny0lE;
    }

    public void qKqI9idaJHL0sOqyD4(boolean z) {
        e54J8UWNHWALQNixXM(null);
        if (this.f3977VItLRw50eXTZeEfGl0 == z) {
            return;
        }
        this.f3977VItLRw50eXTZeEfGl0 = z;
        MecTLhJ95ynyqeEob1();
    }

    public final View qnb0B0kp1U5mzuoCqH(RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return this.f3970A49QRPHynYLCBN0SqP ? cni9M1Tt0N7bwq7oSh(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw) : njV42vQJoqlfw05NNQ(g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public final void sFPmpDxgppcnCCjn0l(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        MfX5YxttElJdOx4uDl(leer5kfoer4xu5yhh7.f4002s3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7.f3999HJFh0TGMpafqLE9haL);
    }

    public boolean suHivzALoCSfNps0XP() {
        return this.f3979WWC27LAMFqFFBzfbNw;
    }

    public final int t1ob1jctq87uSyCpeM(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (lLKzvdU99Iw80uVD5I() == 0) {
            return 0;
        }
        vcruDMeiXYQeTlT3OI();
        return e54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(wWC27LAMFqFFBzfbNw, this.f3971G7AC3DWIx9i9fdanjk, YUDx3zHgOZWWxq2Qgs(!this.f3979WWC27LAMFqFFBzfbNw, true), ndQwlXNek6Yo5ZBYrV(!this.f3979WWC27LAMFqFFBzfbNw, true), this, this.f3979WWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int tGGjvtdOhUewv2twsg(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (this.f3981Y43RdunnpKgpbny0lE == 1) {
            return 0;
        }
        return Kf6IFvVH2efp6249v2(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    public void tf0nfuAZUJWo4SN5He(boolean z) {
        e54J8UWNHWALQNixXM(null);
        if (z == this.f3972LIMtzhnLwQyigzK0KO) {
            return;
        }
        this.f3972LIMtzhnLwQyigzK0KO = z;
        MecTLhJ95ynyqeEob1();
    }

    public View uWxB7TH05HzXzGqLIZ(int i, int i2, boolean z, boolean z2) {
        vcruDMeiXYQeTlT3OI();
        return (this.f3981Y43RdunnpKgpbny0lE == 0 ? this.f4183husNiw3snxdgZPAGJm : this.f4175KYHag8HRDlnO3X9zmZ).lEeR5KfoEr4xU5yHH7(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    public void vcruDMeiXYQeTlT3OI() {
        if (this.f3975R9SAhYMerGybF9OAjL == null) {
            this.f3975R9SAhYMerGybF9OAjL = h3D8MhcyLuC2SOP1fB();
        }
    }

    public int vzXHdKiCTh4zilt9z1(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (wWC27LAMFqFFBzfbNw.zZKhbgvUfsK4AEX3r0()) {
            return this.f3971G7AC3DWIx9i9fdanjk.hoXrIDAFrSwfShk8da();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean w9kKjxxNBwNcD4xB6O() {
        return this.f3983jCtUeU2YI1poCxWcjm == null && this.f3985xHA29AmDt6y96AnB3t == this.f3977VItLRw50eXTZeEfGl0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int wUKf1mNArSjssthGmN(int i, RecyclerView.G7AC3DWIx9i9fdanjk g7AC3DWIx9i9fdanjk, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        if (this.f3981Y43RdunnpKgpbny0lE == 0) {
            return 0;
        }
        return Kf6IFvVH2efp6249v2(i, g7AC3DWIx9i9fdanjk, wWC27LAMFqFFBzfbNw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public int xHA29AmDt6y96AnB3t(RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw) {
        return KWpkmWKCm3jeG4AjIM(wWC27LAMFqFFBzfbNw);
    }

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
            if (iFtYx4GXtxwA8al5hBy >= 0 && iFtYx4GXtxwA8al5hBy < i3) {
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
    public void zQjb36M22TWHJmh54i(int i) {
        this.f3976THTDvPxsHqMeGb512f = i;
        this.f3982ao3wqKm5CXFuvC0q47 = Integer.MIN_VALUE;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f3983jCtUeU2YI1poCxWcjm;
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0();
        }
        MecTLhJ95ynyqeEob1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public boolean zaq8hOURtfwbcX17cG() {
        return this.f3981Y43RdunnpKgpbny0lE == 1;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3981Y43RdunnpKgpbny0lE = 1;
        this.f3972LIMtzhnLwQyigzK0KO = false;
        this.f3970A49QRPHynYLCBN0SqP = false;
        this.f3977VItLRw50eXTZeEfGl0 = false;
        this.f3979WWC27LAMFqFFBzfbNw = true;
        this.f3976THTDvPxsHqMeGb512f = -1;
        this.f3982ao3wqKm5CXFuvC0q47 = Integer.MIN_VALUE;
        this.f3983jCtUeU2YI1poCxWcjm = null;
        this.f3980XzJ1BS7H9Ilbkv4eVM = new lEeR5KfoEr4xU5yHH7();
        this.f3984tXWeW0sqVddf7ZBflq = new s3fjYDxWOUexjjVgyA();
        this.f3978W3RZ2dTDKrKpS5Mxdk = 2;
        this.f3974OqIo5QF00RDxUQb4qq = new int[2];
        RecyclerView.aPyGSIylzVNKPT1Bls.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T = RecyclerView.aPyGSIylzVNKPT1Bls.ayduHasC7VpxsVXE0T(context, attributeSet, i, i2);
        K3DzFKxpDGIqdlGY4t(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4193lEeR5KfoEr4xU5yHH7);
        tf0nfuAZUJWo4SN5He(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4192HJFh0TGMpafqLE9haL);
        qKqI9idaJHL0sOqyD4(zzkhbgvufsk4aex3r0AyduHasC7VpxsVXE0T.f4195zZKhbgvUfsK4AEX3r0);
    }
}
