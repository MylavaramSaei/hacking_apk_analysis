package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.zaq8hOURtfwbcX17cG;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y43RdunnpKgpbny0lE implements Parcelable {
    public static final Parcelable.Creator<Y43RdunnpKgpbny0lE> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public s3fjYDxWOUexjjVgyA[] f3588HJFh0TGMpafqLE9haL;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public ArrayList f3589IPyIQcaNa8aB7drBED;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public ArrayList f3590KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public ArrayList f3591TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public String f3592husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public ArrayList f3593lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public ArrayList f3594s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f3595zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public Y43RdunnpKgpbny0lE createFromParcel(Parcel parcel) {
            return new Y43RdunnpKgpbny0lE(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public Y43RdunnpKgpbny0lE[] newArray(int i) {
            return new Y43RdunnpKgpbny0lE[i];
        }
    }

    public Y43RdunnpKgpbny0lE() {
        this.f3592husNiw3snxdgZPAGJm = null;
        this.f3590KYHag8HRDlnO3X9zmZ = new ArrayList();
        this.f3591TCyPEKSzIyweCN5yp1 = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3593lEeR5KfoEr4xU5yHH7);
        parcel.writeStringList(this.f3594s3fjYDxWOUexjjVgyA);
        parcel.writeTypedArray(this.f3588HJFh0TGMpafqLE9haL, i);
        parcel.writeInt(this.f3595zZKhbgvUfsK4AEX3r0);
        parcel.writeString(this.f3592husNiw3snxdgZPAGJm);
        parcel.writeStringList(this.f3590KYHag8HRDlnO3X9zmZ);
        parcel.writeTypedList(this.f3591TCyPEKSzIyweCN5yp1);
        parcel.writeTypedList(this.f3589IPyIQcaNa8aB7drBED);
    }

    public Y43RdunnpKgpbny0lE(Parcel parcel) {
        this.f3592husNiw3snxdgZPAGJm = null;
        this.f3590KYHag8HRDlnO3X9zmZ = new ArrayList();
        this.f3591TCyPEKSzIyweCN5yp1 = new ArrayList();
        this.f3593lEeR5KfoEr4xU5yHH7 = parcel.createStringArrayList();
        this.f3594s3fjYDxWOUexjjVgyA = parcel.createStringArrayList();
        this.f3588HJFh0TGMpafqLE9haL = (s3fjYDxWOUexjjVgyA[]) parcel.createTypedArray(s3fjYDxWOUexjjVgyA.CREATOR);
        this.f3595zZKhbgvUfsK4AEX3r0 = parcel.readInt();
        this.f3592husNiw3snxdgZPAGJm = parcel.readString();
        this.f3590KYHag8HRDlnO3X9zmZ = parcel.createStringArrayList();
        this.f3591TCyPEKSzIyweCN5yp1 = parcel.createTypedArrayList(HJFh0TGMpafqLE9haL.CREATOR);
        this.f3589IPyIQcaNa8aB7drBED = parcel.createTypedArrayList(zaq8hOURtfwbcX17cG.TCyPEKSzIyweCN5yp1.CREATOR);
    }
}
