package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.VItLRw50eXTZeEfGl0;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA implements Parcelable {
    public static final Parcelable.Creator<s3fjYDxWOUexjjVgyA> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final int f3636Acstmh57AKoSEkEFNJ;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int[] f3637HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final int f3638IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final String f3639KYHag8HRDlnO3X9zmZ;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public final ArrayList f3640T9PhQIpGRhE4yZDm1C;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final int f3641TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final CharSequence f3642Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final ArrayList f3643e54J8UWNHWALQNixXM;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public final boolean f3644hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f3645husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final int[] f3646lEeR5KfoEr4xU5yHH7;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final CharSequence f3647pbVGzGjWvY2LDXC8vo;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ArrayList f3648s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int[] f3649zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public s3fjYDxWOUexjjVgyA createFromParcel(Parcel parcel) {
            return new s3fjYDxWOUexjjVgyA(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public s3fjYDxWOUexjjVgyA[] newArray(int i) {
            return new s3fjYDxWOUexjjVgyA[i];
        }
    }

    public s3fjYDxWOUexjjVgyA(Parcel parcel) {
        this.f3646lEeR5KfoEr4xU5yHH7 = parcel.createIntArray();
        this.f3648s3fjYDxWOUexjjVgyA = parcel.createStringArrayList();
        this.f3637HJFh0TGMpafqLE9haL = parcel.createIntArray();
        this.f3649zZKhbgvUfsK4AEX3r0 = parcel.createIntArray();
        this.f3645husNiw3snxdgZPAGJm = parcel.readInt();
        this.f3639KYHag8HRDlnO3X9zmZ = parcel.readString();
        this.f3641TCyPEKSzIyweCN5yp1 = parcel.readInt();
        this.f3638IPyIQcaNa8aB7drBED = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3647pbVGzGjWvY2LDXC8vo = (CharSequence) creator.createFromParcel(parcel);
        this.f3636Acstmh57AKoSEkEFNJ = parcel.readInt();
        this.f3642Z9WdNiOsPR0y54zHW4 = (CharSequence) creator.createFromParcel(parcel);
        this.f3643e54J8UWNHWALQNixXM = parcel.createStringArrayList();
        this.f3640T9PhQIpGRhE4yZDm1C = parcel.createStringArrayList();
        this.f3644hoXrIDAFrSwfShk8da = parcel.readInt() != 0;
    }

    public final void HJFh0TGMpafqLE9haL(androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f3646lEeR5KfoEr4xU5yHH7.length) {
                leer5kfoer4xu5yhh7.f3531IPyIQcaNa8aB7drBED = this.f3645husNiw3snxdgZPAGJm;
                leer5kfoer4xu5yhh7.f3537Z9WdNiOsPR0y54zHW4 = this.f3639KYHag8HRDlnO3X9zmZ;
                leer5kfoer4xu5yhh7.f3543pbVGzGjWvY2LDXC8vo = true;
                leer5kfoer4xu5yhh7.f3539e54J8UWNHWALQNixXM = this.f3638IPyIQcaNa8aB7drBED;
                leer5kfoer4xu5yhh7.f3534T9PhQIpGRhE4yZDm1C = this.f3647pbVGzGjWvY2LDXC8vo;
                leer5kfoer4xu5yhh7.f3540hoXrIDAFrSwfShk8da = this.f3636Acstmh57AKoSEkEFNJ;
                leer5kfoer4xu5yhh7.f3538aPyGSIylzVNKPT1Bls = this.f3642Z9WdNiOsPR0y54zHW4;
                leer5kfoer4xu5yhh7.f3533OANkd3mP6AYvwbNLJM = this.f3643e54J8UWNHWALQNixXM;
                leer5kfoer4xu5yhh7.f3547zaq8hOURtfwbcX17cG = this.f3640T9PhQIpGRhE4yZDm1C;
                leer5kfoer4xu5yhh7.f3545sTkWmhpZ5b1ArQIw4K = this.f3644hoXrIDAFrSwfShk8da;
                return;
            }
            VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7();
            int i3 = i + 1;
            leer5kfoer4xu5yhh72.f3553lEeR5KfoEr4xU5yHH7 = this.f3646lEeR5KfoEr4xU5yHH7[i];
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Instantiate " + leer5kfoer4xu5yhh7 + " op #" + i2 + " base fragment #" + this.f3646lEeR5KfoEr4xU5yHH7[i3]);
            }
            leer5kfoer4xu5yhh72.f3549IPyIQcaNa8aB7drBED = KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.values()[this.f3637HJFh0TGMpafqLE9haL[i2]];
            leer5kfoer4xu5yhh72.f3554pbVGzGjWvY2LDXC8vo = KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.values()[this.f3649zZKhbgvUfsK4AEX3r0[i2]];
            int[] iArr = this.f3646lEeR5KfoEr4xU5yHH7;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            leer5kfoer4xu5yhh72.f3548HJFh0TGMpafqLE9haL = z;
            int i5 = iArr[i4];
            leer5kfoer4xu5yhh72.f3556zZKhbgvUfsK4AEX3r0 = i5;
            int i6 = iArr[i + 3];
            leer5kfoer4xu5yhh72.f3552husNiw3snxdgZPAGJm = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            leer5kfoer4xu5yhh72.f3550KYHag8HRDlnO3X9zmZ = i8;
            i += 6;
            int i9 = iArr[i7];
            leer5kfoer4xu5yhh72.f3551TCyPEKSzIyweCN5yp1 = i9;
            leer5kfoer4xu5yhh7.f3546zZKhbgvUfsK4AEX3r0 = i5;
            leer5kfoer4xu5yhh7.f3541husNiw3snxdgZPAGJm = i6;
            leer5kfoer4xu5yhh7.f3532KYHag8HRDlnO3X9zmZ = i8;
            leer5kfoer4xu5yhh7.f3535TCyPEKSzIyweCN5yp1 = i9;
            leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(leer5kfoer4xu5yhh72);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3646lEeR5KfoEr4xU5yHH7);
        parcel.writeStringList(this.f3648s3fjYDxWOUexjjVgyA);
        parcel.writeIntArray(this.f3637HJFh0TGMpafqLE9haL);
        parcel.writeIntArray(this.f3649zZKhbgvUfsK4AEX3r0);
        parcel.writeInt(this.f3645husNiw3snxdgZPAGJm);
        parcel.writeString(this.f3639KYHag8HRDlnO3X9zmZ);
        parcel.writeInt(this.f3641TCyPEKSzIyweCN5yp1);
        parcel.writeInt(this.f3638IPyIQcaNa8aB7drBED);
        TextUtils.writeToParcel(this.f3647pbVGzGjWvY2LDXC8vo, parcel, 0);
        parcel.writeInt(this.f3636Acstmh57AKoSEkEFNJ);
        TextUtils.writeToParcel(this.f3642Z9WdNiOsPR0y54zHW4, parcel, 0);
        parcel.writeStringList(this.f3643e54J8UWNHWALQNixXM);
        parcel.writeStringList(this.f3640T9PhQIpGRhE4yZDm1C);
        parcel.writeInt(this.f3644hoXrIDAFrSwfShk8da ? 1 : 0);
    }

    public androidx.fragment.app.lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg) {
        androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new androidx.fragment.app.lEeR5KfoEr4xU5yHH7(zaq8hourtfwbcx17cg);
        HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7);
        leer5kfoer4xu5yhh7.f3634xHA29AmDt6y96AnB3t = this.f3641TCyPEKSzIyweCN5yp1;
        for (int i = 0; i < this.f3648s3fjYDxWOUexjjVgyA.size(); i++) {
            String str = (String) this.f3648s3fjYDxWOUexjjVgyA.get(i);
            if (str != null) {
                ((VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh7.f3530HJFh0TGMpafqLE9haL.get(i)).f3555s3fjYDxWOUexjjVgyA = zaq8hourtfwbcx17cg.oocVJL811qFf0j0XXZ(str);
            }
        }
        leer5kfoer4xu5yhh7.aPyGSIylzVNKPT1Bls(1);
        return leer5kfoer4xu5yhh7;
    }

    public s3fjYDxWOUexjjVgyA(androidx.fragment.app.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        int size = leer5kfoer4xu5yhh7.f3530HJFh0TGMpafqLE9haL.size();
        this.f3646lEeR5KfoEr4xU5yHH7 = new int[size * 6];
        if (!leer5kfoer4xu5yhh7.f3543pbVGzGjWvY2LDXC8vo) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3648s3fjYDxWOUexjjVgyA = new ArrayList(size);
        this.f3637HJFh0TGMpafqLE9haL = new int[size];
        this.f3649zZKhbgvUfsK4AEX3r0 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = (VItLRw50eXTZeEfGl0.lEeR5KfoEr4xU5yHH7) leer5kfoer4xu5yhh7.f3530HJFh0TGMpafqLE9haL.get(i2);
            int i3 = i + 1;
            this.f3646lEeR5KfoEr4xU5yHH7[i] = leer5kfoer4xu5yhh72.f3553lEeR5KfoEr4xU5yHH7;
            ArrayList arrayList = this.f3648s3fjYDxWOUexjjVgyA;
            Fragment fragment = leer5kfoer4xu5yhh72.f3555s3fjYDxWOUexjjVgyA;
            arrayList.add(fragment != null ? fragment.f3437husNiw3snxdgZPAGJm : null);
            int[] iArr = this.f3646lEeR5KfoEr4xU5yHH7;
            iArr[i3] = leer5kfoer4xu5yhh72.f3548HJFh0TGMpafqLE9haL ? 1 : 0;
            iArr[i + 2] = leer5kfoer4xu5yhh72.f3556zZKhbgvUfsK4AEX3r0;
            iArr[i + 3] = leer5kfoer4xu5yhh72.f3552husNiw3snxdgZPAGJm;
            int i4 = i + 5;
            iArr[i + 4] = leer5kfoer4xu5yhh72.f3550KYHag8HRDlnO3X9zmZ;
            i += 6;
            iArr[i4] = leer5kfoer4xu5yhh72.f3551TCyPEKSzIyweCN5yp1;
            this.f3637HJFh0TGMpafqLE9haL[i2] = leer5kfoer4xu5yhh72.f3549IPyIQcaNa8aB7drBED.ordinal();
            this.f3649zZKhbgvUfsK4AEX3r0[i2] = leer5kfoer4xu5yhh72.f3554pbVGzGjWvY2LDXC8vo.ordinal();
        }
        this.f3645husNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7.f3531IPyIQcaNa8aB7drBED;
        this.f3639KYHag8HRDlnO3X9zmZ = leer5kfoer4xu5yhh7.f3537Z9WdNiOsPR0y54zHW4;
        this.f3641TCyPEKSzIyweCN5yp1 = leer5kfoer4xu5yhh7.f3634xHA29AmDt6y96AnB3t;
        this.f3638IPyIQcaNa8aB7drBED = leer5kfoer4xu5yhh7.f3539e54J8UWNHWALQNixXM;
        this.f3647pbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh7.f3534T9PhQIpGRhE4yZDm1C;
        this.f3636Acstmh57AKoSEkEFNJ = leer5kfoer4xu5yhh7.f3540hoXrIDAFrSwfShk8da;
        this.f3642Z9WdNiOsPR0y54zHW4 = leer5kfoer4xu5yhh7.f3538aPyGSIylzVNKPT1Bls;
        this.f3643e54J8UWNHWALQNixXM = leer5kfoer4xu5yhh7.f3533OANkd3mP6AYvwbNLJM;
        this.f3640T9PhQIpGRhE4yZDm1C = leer5kfoer4xu5yhh7.f3547zaq8hOURtfwbcX17cG;
        this.f3644hoXrIDAFrSwfShk8da = leer5kfoer4xu5yhh7.f3545sTkWmhpZ5b1ArQIw4K;
    }
}
