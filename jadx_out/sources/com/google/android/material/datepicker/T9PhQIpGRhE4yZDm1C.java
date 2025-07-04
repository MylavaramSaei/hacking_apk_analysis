package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class T9PhQIpGRhE4yZDm1C implements Comparable, Parcelable {
    public static final Parcelable.Creator<T9PhQIpGRhE4yZDm1C> CREATOR = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f5108HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final long f5109KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public String f5110TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f5111husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Calendar f5112lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final int f5113s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f5114zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: merged with bridge method [inline-methods] */
        public T9PhQIpGRhE4yZDm1C createFromParcel(Parcel parcel) {
            return T9PhQIpGRhE4yZDm1C.zZKhbgvUfsK4AEX3r0(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public T9PhQIpGRhE4yZDm1C[] newArray(int i) {
            return new T9PhQIpGRhE4yZDm1C[i];
        }
    }

    public T9PhQIpGRhE4yZDm1C(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarHJFh0TGMpafqLE9haL = R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(calendar);
        this.f5112lEeR5KfoEr4xU5yHH7 = calendarHJFh0TGMpafqLE9haL;
        this.f5113s3fjYDxWOUexjjVgyA = calendarHJFh0TGMpafqLE9haL.get(2);
        this.f5108HJFh0TGMpafqLE9haL = calendarHJFh0TGMpafqLE9haL.get(1);
        this.f5114zZKhbgvUfsK4AEX3r0 = calendarHJFh0TGMpafqLE9haL.getMaximum(7);
        this.f5111husNiw3snxdgZPAGJm = calendarHJFh0TGMpafqLE9haL.getActualMaximum(5);
        this.f5109KYHag8HRDlnO3X9zmZ = calendarHJFh0TGMpafqLE9haL.getTimeInMillis();
    }

    public static T9PhQIpGRhE4yZDm1C KYHag8HRDlnO3X9zmZ() {
        return new T9PhQIpGRhE4yZDm1C(R9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1());
    }

    public static T9PhQIpGRhE4yZDm1C husNiw3snxdgZPAGJm(long j) {
        Calendar calendarPbVGzGjWvY2LDXC8vo = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        calendarPbVGzGjWvY2LDXC8vo.setTimeInMillis(j);
        return new T9PhQIpGRhE4yZDm1C(calendarPbVGzGjWvY2LDXC8vo);
    }

    public static T9PhQIpGRhE4yZDm1C zZKhbgvUfsK4AEX3r0(int i, int i2) {
        Calendar calendarPbVGzGjWvY2LDXC8vo = R9SAhYMerGybF9OAjL.pbVGzGjWvY2LDXC8vo();
        calendarPbVGzGjWvY2LDXC8vo.set(1, i);
        calendarPbVGzGjWvY2LDXC8vo.set(2, i2);
        return new T9PhQIpGRhE4yZDm1C(calendarPbVGzGjWvY2LDXC8vo);
    }

    public String Acstmh57AKoSEkEFNJ() {
        if (this.f5110TCyPEKSzIyweCN5yp1 == null) {
            this.f5110TCyPEKSzIyweCN5yp1 = husNiw3snxdgZPAGJm.KYHag8HRDlnO3X9zmZ(this.f5112lEeR5KfoEr4xU5yHH7.getTimeInMillis());
        }
        return this.f5110TCyPEKSzIyweCN5yp1;
    }

    @Override // java.lang.Comparable
    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public int compareTo(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        return this.f5112lEeR5KfoEr4xU5yHH7.compareTo(t9PhQIpGRhE4yZDm1C.f5112lEeR5KfoEr4xU5yHH7);
    }

    public long IPyIQcaNa8aB7drBED(int i) {
        Calendar calendarHJFh0TGMpafqLE9haL = R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(this.f5112lEeR5KfoEr4xU5yHH7);
        calendarHJFh0TGMpafqLE9haL.set(5, i);
        return calendarHJFh0TGMpafqLE9haL.getTimeInMillis();
    }

    public int T9PhQIpGRhE4yZDm1C(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        if (this.f5112lEeR5KfoEr4xU5yHH7 instanceof GregorianCalendar) {
            return ((t9PhQIpGRhE4yZDm1C.f5108HJFh0TGMpafqLE9haL - this.f5108HJFh0TGMpafqLE9haL) * 12) + (t9PhQIpGRhE4yZDm1C.f5113s3fjYDxWOUexjjVgyA - this.f5113s3fjYDxWOUexjjVgyA);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int TCyPEKSzIyweCN5yp1(int i) {
        int i2 = this.f5112lEeR5KfoEr4xU5yHH7.get(7);
        if (i <= 0) {
            i = this.f5112lEeR5KfoEr4xU5yHH7.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.f5114zZKhbgvUfsK4AEX3r0 : i3;
    }

    public long Z9WdNiOsPR0y54zHW4() {
        return this.f5112lEeR5KfoEr4xU5yHH7.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public T9PhQIpGRhE4yZDm1C e54J8UWNHWALQNixXM(int i) {
        Calendar calendarHJFh0TGMpafqLE9haL = R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(this.f5112lEeR5KfoEr4xU5yHH7);
        calendarHJFh0TGMpafqLE9haL.add(2, i);
        return new T9PhQIpGRhE4yZDm1C(calendarHJFh0TGMpafqLE9haL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9PhQIpGRhE4yZDm1C)) {
            return false;
        }
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C = (T9PhQIpGRhE4yZDm1C) obj;
        return this.f5113s3fjYDxWOUexjjVgyA == t9PhQIpGRhE4yZDm1C.f5113s3fjYDxWOUexjjVgyA && this.f5108HJFh0TGMpafqLE9haL == t9PhQIpGRhE4yZDm1C.f5108HJFh0TGMpafqLE9haL;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5113s3fjYDxWOUexjjVgyA), Integer.valueOf(this.f5108HJFh0TGMpafqLE9haL)});
    }

    public int pbVGzGjWvY2LDXC8vo(long j) {
        Calendar calendarHJFh0TGMpafqLE9haL = R9SAhYMerGybF9OAjL.HJFh0TGMpafqLE9haL(this.f5112lEeR5KfoEr4xU5yHH7);
        calendarHJFh0TGMpafqLE9haL.setTimeInMillis(j);
        return calendarHJFh0TGMpafqLE9haL.get(5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5108HJFh0TGMpafqLE9haL);
        parcel.writeInt(this.f5113s3fjYDxWOUexjjVgyA);
    }
}
