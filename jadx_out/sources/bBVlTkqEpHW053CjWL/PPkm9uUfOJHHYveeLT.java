package bBVlTkqEpHW053CjWL;

import FtYx4GXtxwA8al5hBy.HJFh0TGMpafqLE9haL;
import FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import yvdWWG9COQQotjfedH.s3fjYDxWOUexjjVgyA;

/* loaded from: classes.dex */
public class PPkm9uUfOJHHYveeLT implements bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0, yvdWWG9COQQotjfedH.s3fjYDxWOUexjjVgyA, bBVlTkqEpHW053CjWL.HJFh0TGMpafqLE9haL {

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL f4617IPyIQcaNa8aB7drBED = ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("proto");

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final YlLW4G6OV9TFyuw5ix f4618HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f4619KYHag8HRDlnO3X9zmZ;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 f4620TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f4621husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f4622zZKhbgvUfsK4AEX3r0;

    public static class HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final String f4623lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final String f4624s3fjYDxWOUexjjVgyA;

        public HJFh0TGMpafqLE9haL(String str, String str2) {
            this.f4623lEeR5KfoEr4xU5yHH7 = str;
            this.f4624s3fjYDxWOUexjjVgyA = str2;
        }
    }

    public interface s3fjYDxWOUexjjVgyA {
        Object lEeR5KfoEr4xU5yHH7(Object obj);
    }

    public interface zZKhbgvUfsK4AEX3r0 {
        Object lEeR5KfoEr4xU5yHH7();
    }

    public PPkm9uUfOJHHYveeLT(O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, husNiw3snxdgZPAGJm husniw3snxdgzpagjm, YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix, w9kKjxxNBwNcD4xB6O.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73) {
        this.f4618HJFh0TGMpafqLE9haL = ylLW4G6OV9TFyuw5ix;
        this.f4622zZKhbgvUfsK4AEX3r0 = leer5kfoer4xu5yhh7;
        this.f4621husNiw3snxdgZPAGJm = leer5kfoer4xu5yhh72;
        this.f4619KYHag8HRDlnO3X9zmZ = husniw3snxdgzpagjm;
        this.f4620TCyPEKSzIyweCN5yp1 = leer5kfoer4xu5yhh73;
    }

    public static String Bc5OTyAfOKVCQb8CEz(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((Z9WdNiOsPR0y54zHW4) it.next()).HJFh0TGMpafqLE9haL());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ Kh0uC90qEEhuLdpgB9(long j, Cursor cursor) {
        cursor.moveToNext();
        return FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL().HJFh0TGMpafqLE9haL(cursor.getLong(0)).s3fjYDxWOUexjjVgyA(j).lEeR5KfoEr4xU5yHH7();
    }

    public static /* synthetic */ Boolean O1furmptfI76BGfN0d(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ Pum9NZyDBKoCnecvlx(final long j, SQLiteDatabase sQLiteDatabase) {
        return (FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ) aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.jCtUeU2YI1poCxWcjm
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.Kh0uC90qEEhuLdpgB9(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ SQLiteDatabase Tu4WCh2gEwj8E4oHbP(Throwable th) {
        throw new yvdWWG9COQQotjfedH.lEeR5KfoEr4xU5yHH7("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object ZJNyOIPL0usMs2xSAn(Throwable th) {
        throw new yvdWWG9COQQotjfedH.lEeR5KfoEr4xU5yHH7("Timed out while trying to acquire the lock.", th);
    }

    public static Object aUn6Hqsqw2PVM8685Z(Cursor cursor, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        try {
            return s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Long ctWLFN70QQINH1kyYo(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List eWK41qw3g36LVd4UnS(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(cursor.getString(1)).zZKhbgvUfsK4AEX3r0(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(cursor.getInt(2))).HJFh0TGMpafqLE9haL(f2zPq7MOnQrtOlZ1Zg(cursor.getString(3))).lEeR5KfoEr4xU5yHH7());
        }
        return arrayList;
    }

    public static byte[] f2zPq7MOnQrtOlZ1Zg(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ byte[] fLSSbwbzFBVpwBH5FM(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Object iQCvttGuB7nx4r7kMP(String str, HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, long j, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (((Boolean) aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7())}), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.xHA29AmDt6y96AnB3t
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.O1furmptfI76BGfN0d((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Long k0CbjZvfUz23r8IN6W(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    public static /* synthetic */ Object osrHU7fvDp2EgxZPfM(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL pgB7Gmjz55y9NQYnAD(String str) {
        return str == null ? f4617IPyIQcaNa8aB7drBED : ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(str);
    }

    public static /* synthetic */ Object xMfAHy6F7qK0zhxhKG(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new HJFh0TGMpafqLE9haL(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Object yL2E9nlEZpg8ZZx8XE(long j, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA(), String.valueOf(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0()))}) < 1) {
            contentValues.put("backend_name", apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA());
            contentValues.put("priority", Integer.valueOf(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ List zXY7dgnTfw9Pd9RXel(SQLiteDatabase sQLiteDatabase) {
        return (List) aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.DfpieXfdYs58yZAiXY
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.eWK41qw3g36LVd4UnS((Cursor) obj);
            }
        });
    }

    @Override // bBVlTkqEpHW053CjWL.HJFh0TGMpafqLE9haL
    public void Acstmh57AKoSEkEFNJ(final long j, final HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, final String str) {
        cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.OANkd3mP6AYvwbNLJM
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.iQCvttGuB7nx4r7kMP(str, s3fjydxwouexjjvgya, j, (SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ Integer CSih7GetOUab1dYQjM(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.zaq8hOURtfwbcX17cG
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4681lEeR5KfoEr4xU5yHH7.Uj8rPa1EWADtk6Oe0S((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public final /* synthetic */ FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7 DFYiVi7zXozAjRciKa(Map map, lEeR5KfoEr4xU5yHH7.C0006lEeR5KfoEr4xU5yHH7 c0006lEeR5KfoEr4xU5yHH7, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaPPkm9uUfOJHHYveeLT = PPkm9uUfOJHHYveeLT(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(FtYx4GXtxwA8al5hBy.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL().HJFh0TGMpafqLE9haL(s3fjydxwouexjjvgyaPPkm9uUfOJHHYveeLT).s3fjYDxWOUexjjVgyA(j).lEeR5KfoEr4xU5yHH7());
        }
        HZ4bptRS9XIcK1CV95(c0006lEeR5KfoEr4xU5yHH7, map);
        c0006lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(oocVJL811qFf0j0XXZ());
        c0006lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(LU0fFDMACqnfIfA1AZ());
        c0006lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL((String) this.f4620TCyPEKSzIyweCN5yp1.get());
        return c0006lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
    }

    public final List Er40JrQbOM51vCQI8w(SQLiteDatabase sQLiteDatabase, final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lUdcVtCzLTM1Loe9KrX = udcVtCzLTM1Loe9KrX(sQLiteDatabase, apygsiylzvnkpt1bls);
        if (lUdcVtCzLTM1Loe9KrX == null) {
            return arrayList;
        }
        aUn6Hqsqw2PVM8685Z(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lUdcVtCzLTM1Loe9KrX.toString()}, null, null, null, String.valueOf(i)), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.G7AC3DWIx9i9fdanjk
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4606lEeR5KfoEr4xU5yHH7.ayduHasC7VpxsVXE0T(arrayList, apygsiylzvnkpt1bls, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final /* synthetic */ Object Fo9071MN8vwEWamAUX(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f4622zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7()).execute();
        return null;
    }

    public final /* synthetic */ FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7 FtYx4GXtxwA8al5hBy(String str, final Map map, final lEeR5KfoEr4xU5yHH7.C0006lEeR5KfoEr4xU5yHH7 c0006lEeR5KfoEr4xU5yHH7, SQLiteDatabase sQLiteDatabase) {
        return (FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7) aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery(str, new String[0]), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.THTDvPxsHqMeGb512f
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4630lEeR5KfoEr4xU5yHH7.DFYiVi7zXozAjRciKa(map, c0006lEeR5KfoEr4xU5yHH7, (Cursor) obj);
            }
        });
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public long HJFh0TGMpafqLE9haL(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return ((Long) aUn6Hqsqw2PVM8685Z(XdzLv4NdAtTYoEzVzB().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA(), String.valueOf(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0()))}), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.OqIo5QF00RDxUQb4qq
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.k0CbjZvfUz23r8IN6W((Cursor) obj);
            }
        })).longValue();
    }

    public final Object HR5vAalpgOKVm2T0Gq(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        long jLEeR5KfoEr4xU5yHH7 = this.f4621husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7();
        while (true) {
            try {
                return zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f4621husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7() >= this.f4619KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA() + jLEeR5KfoEr4xU5yHH7) {
                    return s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void HZ4bptRS9XIcK1CV95(lEeR5KfoEr4xU5yHH7.C0006lEeR5KfoEr4xU5yHH7 c0006lEeR5KfoEr4xU5yHH7, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0006lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(FtYx4GXtxwA8al5hBy.zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL().HJFh0TGMpafqLE9haL((String) entry.getKey()).s3fjYDxWOUexjjVgyA((List) entry.getValue()).lEeR5KfoEr4xU5yHH7());
        }
    }

    @Override // bBVlTkqEpHW053CjWL.HJFh0TGMpafqLE9haL
    public FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7 IPyIQcaNa8aB7drBED() {
        final lEeR5KfoEr4xU5yHH7.C0006lEeR5KfoEr4xU5yHH7 c0006lEeR5KfoEr4xU5yHH7HusNiw3snxdgZPAGJm = FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (FtYx4GXtxwA8al5hBy.lEeR5KfoEr4xU5yHH7) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.sTkWmhpZ5b1ArQIw4K
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4678lEeR5KfoEr4xU5yHH7.FtYx4GXtxwA8al5hBy(str, map, c0006lEeR5KfoEr4xU5yHH7HusNiw3snxdgZPAGJm, (SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ Long Jsouc4ileb8SxQhxbX(eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, SQLiteDatabase sQLiteDatabase) {
        if (hUNBy66ZO1wVLJGW3l()) {
            Acstmh57AKoSEkEFNJ(1L, HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.CACHE_FULL, pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ());
            return -1L;
        }
        long jLLKzvdU99Iw80uVD5I = lLKzvdU99Iw80uVD5I(sQLiteDatabase, apygsiylzvnkpt1bls);
        int iHusNiw3snxdgZPAGJm = this.f4619KYHag8HRDlnO3X9zmZ.husNiw3snxdgZPAGJm();
        byte[] bArrLEeR5KfoEr4xU5yHH7 = pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7();
        boolean z = bArrLEeR5KfoEr4xU5yHH7.length <= iHusNiw3snxdgZPAGJm;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jLLKzvdU99Iw80uVD5I));
        contentValues.put("transport_name", pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ());
        contentValues.put("timestamp_ms", Long.valueOf(pbvgzgjwvy2ldxc8vo.KYHag8HRDlnO3X9zmZ()));
        contentValues.put("uptime_ms", Long.valueOf(pbvgzgjwvy2ldxc8vo.Z9WdNiOsPR0y54zHW4()));
        contentValues.put("payload_encoding", pbvgzgjwvy2ldxc8vo.husNiw3snxdgZPAGJm().s3fjYDxWOUexjjVgyA().lEeR5KfoEr4xU5yHH7());
        contentValues.put("code", pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrLEeR5KfoEr4xU5yHH7 : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(bArrLEeR5KfoEr4xU5yHH7.length / iHusNiw3snxdgZPAGJm);
            for (int i = 1; i <= iCeil; i++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrLEeR5KfoEr4xU5yHH7, (i - 1) * iHusNiw3snxdgZPAGJm, Math.min(i * iHusNiw3snxdgZPAGJm, bArrLEeR5KfoEr4xU5yHH7.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : pbvgzgjwvy2ldxc8vo.pbVGzGjWvY2LDXC8vo().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public boolean KYHag8HRDlnO3X9zmZ(final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return ((Boolean) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.T9PhQIpGRhE4yZDm1C
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4626lEeR5KfoEr4xU5yHH7.jocVUfxESVhVJU8LoH(apygsiylzvnkpt1bls, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    public final FtYx4GXtxwA8al5hBy.s3fjYDxWOUexjjVgyA LU0fFDMACqnfIfA1AZ() {
        return FtYx4GXtxwA8al5hBy.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(FtYx4GXtxwA8al5hBy.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL().s3fjYDxWOUexjjVgyA(ToH8yzk8U1nKT0PUfY()).HJFh0TGMpafqLE9haL(husNiw3snxdgZPAGJm.f4658lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ()).lEeR5KfoEr4xU5yHH7()).lEeR5KfoEr4xU5yHH7();
    }

    public final HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA PPkm9uUfOJHHYveeLT(int i) {
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.REASON_UNKNOWN;
        if (i == s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.MESSAGE_TOO_OLD;
        if (i == s3fjydxwouexjjvgya2.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya2;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya3 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.CACHE_FULL;
        if (i == s3fjydxwouexjjvgya3.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya3;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya4 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.PAYLOAD_TOO_BIG;
        if (i == s3fjydxwouexjjvgya4.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya4;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya5 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.MAX_RETRIES_REACHED;
        if (i == s3fjydxwouexjjvgya5.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya5;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya6 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.INVALID_PAYLOD;
        if (i == s3fjydxwouexjjvgya6.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya6;
        }
        HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya7 = HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.SERVER_ERROR;
        if (i == s3fjydxwouexjjvgya7.lEeR5KfoEr4xU5yHH7()) {
            return s3fjydxwouexjjvgya7;
        }
        ayduHasC7VpxsVXE0T.lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return s3fjydxwouexjjvgya;
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public Iterable T9PhQIpGRhE4yZDm1C() {
        return (Iterable) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.W3RZ2dTDKrKpS5Mxdk
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.zXY7dgnTfw9Pd9RXel((SQLiteDatabase) obj);
            }
        });
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public Iterable TCyPEKSzIyweCN5yp1(final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        return (Iterable) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.KqgKJKIWne3kz1AdHk
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4611lEeR5KfoEr4xU5yHH7.evSiTWao80SbJUZk9E(apygsiylzvnkpt1bls, (SQLiteDatabase) obj);
            }
        });
    }

    public long ToH8yzk8U1nKT0PUfY() {
        return zcy2NNbtVXgoGQbfuq() * YlLW4G6OV9TFyuw5ix();
    }

    public final /* synthetic */ Object Uj8rPa1EWADtk6Oe0S(Cursor cursor) {
        while (cursor.moveToNext()) {
            Acstmh57AKoSEkEFNJ(cursor.getInt(0), HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public SQLiteDatabase XdzLv4NdAtTYoEzVzB() {
        final YlLW4G6OV9TFyuw5ix ylLW4G6OV9TFyuw5ix = this.f4618HJFh0TGMpafqLE9haL;
        Objects.requireNonNull(ylLW4G6OV9TFyuw5ix);
        return (SQLiteDatabase) HR5vAalpgOKVm2T0Gq(new zZKhbgvUfsK4AEX3r0() { // from class: bBVlTkqEpHW053CjWL.XzJ1BS7H9Ilbkv4eVM
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.zZKhbgvUfsK4AEX3r0
            public final Object lEeR5KfoEr4xU5yHH7() {
                return ylLW4G6OV9TFyuw5ix.getWritableDatabase();
            }
        }, new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.tXWeW0sqVddf7ZBflq
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.Tu4WCh2gEwj8E4oHbP((Throwable) obj);
            }
        });
    }

    public final long YlLW4G6OV9TFyuw5ix() {
        return XdzLv4NdAtTYoEzVzB().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final Map Ywqw2A0s86HeuFkDt0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((Z9WdNiOsPR0y54zHW4) list.get(i)).HJFh0TGMpafqLE9haL());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        aUn6Hqsqw2PVM8685Z(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.A49QRPHynYLCBN0SqP
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.xMfAHy6F7qK0zhxhKG(map, (Cursor) obj);
            }
        });
        return map;
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public Z9WdNiOsPR0y54zHW4 Z9WdNiOsPR0y54zHW4(final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, final eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        ayduHasC7VpxsVXE0T.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0(), pbvgzgjwvy2ldxc8vo.Acstmh57AKoSEkEFNJ(), apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA());
        long jLongValue = ((Long) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.WWC27LAMFqFFBzfbNw
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4633lEeR5KfoEr4xU5yHH7.Jsouc4ileb8SxQhxbX(pbvgzgjwvy2ldxc8vo, apygsiylzvnkpt1bls, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(jLongValue, apygsiylzvnkpt1bls, pbvgzgjwvy2ldxc8vo);
    }

    public final void aAp6BD79BhftLCnuvf(final SQLiteDatabase sQLiteDatabase) {
        HR5vAalpgOKVm2T0Gq(new zZKhbgvUfsK4AEX3r0() { // from class: bBVlTkqEpHW053CjWL.e54J8UWNHWALQNixXM
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.zZKhbgvUfsK4AEX3r0
            public final Object lEeR5KfoEr4xU5yHH7() {
                return PPkm9uUfOJHHYveeLT.osrHU7fvDp2EgxZPfM(sQLiteDatabase);
            }
        }, new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.LIMtzhnLwQyigzK0KO
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.ZJNyOIPL0usMs2xSAn((Throwable) obj);
            }
        });
    }

    public final byte[] aRQ2M7vtRaPDEyvpdv(long j) {
        return (byte[]) aUn6Hqsqw2PVM8685Z(XdzLv4NdAtTYoEzVzB().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.ao3wqKm5CXFuvC0q47
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.fLSSbwbzFBVpwBH5FM((Cursor) obj);
            }
        });
    }

    public final /* synthetic */ Object ayduHasC7VpxsVXE0T(List list, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7Z9WdNiOsPR0y54zHW4 = eWK41qw3g36LVd4UnS.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7().Acstmh57AKoSEkEFNJ(cursor.getString(1)).pbVGzGjWvY2LDXC8vo(cursor.getLong(2)).Z9WdNiOsPR0y54zHW4(cursor.getLong(3));
            leer5kfoer4xu5yhh7Z9WdNiOsPR0y54zHW4.IPyIQcaNa8aB7drBED(z ? new eWK41qw3g36LVd4UnS.IPyIQcaNa8aB7drBED(pgB7Gmjz55y9NQYnAD(cursor.getString(4)), cursor.getBlob(5)) : new eWK41qw3g36LVd4UnS.IPyIQcaNa8aB7drBED(pgB7Gmjz55y9NQYnAD(cursor.getString(4)), aRQ2M7vtRaPDEyvpdv(j)));
            if (!cursor.isNull(6)) {
                leer5kfoer4xu5yhh7Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(j, apygsiylzvnkpt1bls, leer5kfoer4xu5yhh7Z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0()));
        }
        return null;
    }

    public final /* synthetic */ Object bBVlTkqEpHW053CjWL(Cursor cursor) {
        while (cursor.moveToNext()) {
            Acstmh57AKoSEkEFNJ(cursor.getInt(0), HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final List bMSdooljgH14Jgudph(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4 = (Z9WdNiOsPR0y54zHW4) listIterator.next();
            if (map.containsKey(Long.valueOf(z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL()))) {
                pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7E54J8UWNHWALQNixXM = z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA().e54J8UWNHWALQNixXM();
                for (HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL : (Set) map.get(Long.valueOf(z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL()))) {
                    leer5kfoer4xu5yhh7E54J8UWNHWALQNixXM.HJFh0TGMpafqLE9haL(hJFh0TGMpafqLE9haL.f4623lEeR5KfoEr4xU5yHH7, hJFh0TGMpafqLE9haL.f4624s3fjYDxWOUexjjVgyA);
                }
                listIterator.set(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(z9WdNiOsPR0y54zHW4.HJFh0TGMpafqLE9haL(), z9WdNiOsPR0y54zHW4.zZKhbgvUfsK4AEX3r0(), leer5kfoer4xu5yhh7E54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0()));
            }
        }
        return list;
    }

    public Object cT5Hs3CQpLK8NvlZAw(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        SQLiteDatabase sQLiteDatabaseXdzLv4NdAtTYoEzVzB = XdzLv4NdAtTYoEzVzB();
        sQLiteDatabaseXdzLv4NdAtTYoEzVzB.beginTransaction();
        try {
            Object objLEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya.lEeR5KfoEr4xU5yHH7(sQLiteDatabaseXdzLv4NdAtTYoEzVzB);
            sQLiteDatabaseXdzLv4NdAtTYoEzVzB.setTransactionSuccessful();
            return objLEeR5KfoEr4xU5yHH7;
        } finally {
            sQLiteDatabaseXdzLv4NdAtTYoEzVzB.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4618HJFh0TGMpafqLE9haL.close();
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public void e54J8UWNHWALQNixXM(final eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, final long j) {
        cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.hoXrIDAFrSwfShk8da
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.yL2E9nlEZpg8ZZx8XE(j, apygsiylzvnkpt1bls, (SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ List evSiTWao80SbJUZk9E(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, SQLiteDatabase sQLiteDatabase) {
        List listEr40JrQbOM51vCQI8w = Er40JrQbOM51vCQI8w(sQLiteDatabase, apygsiylzvnkpt1bls, this.f4619KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0());
        for (ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm husniw3snxdgzpagjm : ctWLFN70QQINH1kyYo.husNiw3snxdgZPAGJm.values()) {
            if (husniw3snxdgzpagjm != apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0()) {
                int iZZKhbgvUfsK4AEX3r0 = this.f4619KYHag8HRDlnO3X9zmZ.zZKhbgvUfsK4AEX3r0() - listEr40JrQbOM51vCQI8w.size();
                if (iZZKhbgvUfsK4AEX3r0 <= 0) {
                    break;
                }
                listEr40JrQbOM51vCQI8w.addAll(Er40JrQbOM51vCQI8w(sQLiteDatabase, apygsiylzvnkpt1bls.KYHag8HRDlnO3X9zmZ(husniw3snxdgzpagjm), iZZKhbgvUfsK4AEX3r0));
            }
        }
        return bMSdooljgH14Jgudph(listEr40JrQbOM51vCQI8w, Ywqw2A0s86HeuFkDt0(sQLiteDatabase, listEr40JrQbOM51vCQI8w));
    }

    public final boolean hUNBy66ZO1wVLJGW3l() {
        return zcy2NNbtVXgoGQbfuq() * YlLW4G6OV9TFyuw5ix() >= this.f4619KYHag8HRDlnO3X9zmZ.KYHag8HRDlnO3X9zmZ();
    }

    @Override // yvdWWG9COQQotjfedH.s3fjYDxWOUexjjVgyA
    public Object husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        SQLiteDatabase sQLiteDatabaseXdzLv4NdAtTYoEzVzB = XdzLv4NdAtTYoEzVzB();
        aAp6BD79BhftLCnuvf(sQLiteDatabaseXdzLv4NdAtTYoEzVzB);
        try {
            Object objLEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7();
            sQLiteDatabaseXdzLv4NdAtTYoEzVzB.setTransactionSuccessful();
            return objLEeR5KfoEr4xU5yHH7;
        } finally {
            sQLiteDatabaseXdzLv4NdAtTYoEzVzB.endTransaction();
        }
    }

    public final /* synthetic */ Boolean jocVUfxESVhVJU8LoH(eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, SQLiteDatabase sQLiteDatabase) {
        Long lUdcVtCzLTM1Loe9KrX = udcVtCzLTM1Loe9KrX(sQLiteDatabase, apygsiylzvnkpt1bls);
        return lUdcVtCzLTM1Loe9KrX == null ? Boolean.FALSE : (Boolean) aUn6Hqsqw2PVM8685Z(XdzLv4NdAtTYoEzVzB().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lUdcVtCzLTM1Loe9KrX.toString()}), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.Y43RdunnpKgpbny0lE
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public int lEeR5KfoEr4xU5yHH7() {
        final long jLEeR5KfoEr4xU5yHH7 = this.f4622zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7() - this.f4619KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL();
        return ((Integer) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.GyWRxpdt1T8mEJXPoD
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4608lEeR5KfoEr4xU5yHH7.CSih7GetOUab1dYQjM(jLEeR5KfoEr4xU5yHH7, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public final long lLKzvdU99Iw80uVD5I(SQLiteDatabase sQLiteDatabase, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        Long lUdcVtCzLTM1Loe9KrX = udcVtCzLTM1Loe9KrX(sQLiteDatabase, apygsiylzvnkpt1bls);
        if (lUdcVtCzLTM1Loe9KrX != null) {
            return lUdcVtCzLTM1Loe9KrX.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA());
        contentValues.put("priority", Integer.valueOf(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL() != null) {
            contentValues.put("extras", Base64.encodeToString(apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public final FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ oocVJL811qFf0j0XXZ() {
        final long jLEeR5KfoEr4xU5yHH7 = this.f4622zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
        return (FtYx4GXtxwA8al5hBy.KYHag8HRDlnO3X9zmZ) cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.OUd9THiLjZndMj0qdF
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.Pum9NZyDBKoCnecvlx(jLEeR5KfoEr4xU5yHH7, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public void pbVGzGjWvY2LDXC8vo(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Bc5OTyAfOKVCQb8CEz(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.e2F9F6h8YJxTHwLCa0
                @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
                public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                    return this.f4653lEeR5KfoEr4xU5yHH7.yvdWWG9COQQotjfedH(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // bBVlTkqEpHW053CjWL.zZKhbgvUfsK4AEX3r0
    public void s3fjYDxWOUexjjVgyA(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            XdzLv4NdAtTYoEzVzB().compileStatement("DELETE FROM events WHERE _id in " + Bc5OTyAfOKVCQb8CEz(iterable)).execute();
        }
    }

    public final Long udcVtCzLTM1Loe9KrX(SQLiteDatabase sQLiteDatabase, eWK41qw3g36LVd4UnS.aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(apygsiylzvnkpt1bls.s3fjYDxWOUexjjVgyA(), String.valueOf(iQCvttGuB7nx4r7kMP.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(apygsiylzvnkpt1bls.zZKhbgvUfsK4AEX3r0()))));
        if (apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(apygsiylzvnkpt1bls.HJFh0TGMpafqLE9haL(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) aUn6Hqsqw2PVM8685Z(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.VItLRw50eXTZeEfGl0
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return PPkm9uUfOJHHYveeLT.ctWLFN70QQINH1kyYo((Cursor) obj);
            }
        });
    }

    public final /* synthetic */ Object yvdWWG9COQQotjfedH(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        aUn6Hqsqw2PVM8685Z(sQLiteDatabase.rawQuery(str2, null), new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.R9SAhYMerGybF9OAjL
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4625lEeR5KfoEr4xU5yHH7.bBVlTkqEpHW053CjWL((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // bBVlTkqEpHW053CjWL.HJFh0TGMpafqLE9haL
    public void zZKhbgvUfsK4AEX3r0() {
        cT5Hs3CQpLK8NvlZAw(new s3fjYDxWOUexjjVgyA() { // from class: bBVlTkqEpHW053CjWL.aPyGSIylzVNKPT1Bls
            @Override // bBVlTkqEpHW053CjWL.PPkm9uUfOJHHYveeLT.s3fjYDxWOUexjjVgyA
            public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                return this.f4651lEeR5KfoEr4xU5yHH7.Fo9071MN8vwEWamAUX((SQLiteDatabase) obj);
            }
        });
    }

    public final long zcy2NNbtVXgoGQbfuq() {
        return XdzLv4NdAtTYoEzVzB().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }
}
