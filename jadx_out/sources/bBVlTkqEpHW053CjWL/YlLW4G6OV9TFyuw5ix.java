package bBVlTkqEpHW053CjWL;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class YlLW4G6OV9TFyuw5ix extends SQLiteOpenHelper {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4636Acstmh57AKoSEkEFNJ;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4637IPyIQcaNa8aB7drBED;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4639TCyPEKSzIyweCN5yp1;

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4640Z9WdNiOsPR0y54zHW4;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public static final List f4641e54J8UWNHWALQNixXM;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f4643pbVGzGjWvY2LDXC8vo;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f4644HJFh0TGMpafqLE9haL;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f4645zZKhbgvUfsK4AEX3r0;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final String f4642husNiw3snxdgZPAGJm = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public static int f4638KYHag8HRDlnO3X9zmZ = 5;

    public interface lEeR5KfoEr4xU5yHH7 {
        void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase);
    }

    static {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7() { // from class: bBVlTkqEpHW053CjWL.lLKzvdU99Iw80uVD5I
            @Override // bBVlTkqEpHW053CjWL.YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase) throws SQLException {
                YlLW4G6OV9TFyuw5ix.OANkd3mP6AYvwbNLJM(sQLiteDatabase);
            }
        };
        f4639TCyPEKSzIyweCN5yp1 = leer5kfoer4xu5yhh7;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new lEeR5KfoEr4xU5yHH7() { // from class: bBVlTkqEpHW053CjWL.ToH8yzk8U1nKT0PUfY
            @Override // bBVlTkqEpHW053CjWL.YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase) throws SQLException {
                YlLW4G6OV9TFyuw5ix.zaq8hOURtfwbcX17cG(sQLiteDatabase);
            }
        };
        f4637IPyIQcaNa8aB7drBED = leer5kfoer4xu5yhh72;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh73 = new lEeR5KfoEr4xU5yHH7() { // from class: bBVlTkqEpHW053CjWL.XdzLv4NdAtTYoEzVzB
            @Override // bBVlTkqEpHW053CjWL.YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase) throws SQLException {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f4643pbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh73;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh74 = new lEeR5KfoEr4xU5yHH7() { // from class: bBVlTkqEpHW053CjWL.LU0fFDMACqnfIfA1AZ
            @Override // bBVlTkqEpHW053CjWL.YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase) throws SQLException {
                YlLW4G6OV9TFyuw5ix.Y43RdunnpKgpbny0lE(sQLiteDatabase);
            }
        };
        f4636Acstmh57AKoSEkEFNJ = leer5kfoer4xu5yhh74;
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh75 = new lEeR5KfoEr4xU5yHH7() { // from class: bBVlTkqEpHW053CjWL.zcy2NNbtVXgoGQbfuq
            @Override // bBVlTkqEpHW053CjWL.YlLW4G6OV9TFyuw5ix.lEeR5KfoEr4xU5yHH7
            public final void lEeR5KfoEr4xU5yHH7(SQLiteDatabase sQLiteDatabase) throws SQLException {
                YlLW4G6OV9TFyuw5ix.R9SAhYMerGybF9OAjL(sQLiteDatabase);
            }
        };
        f4640Z9WdNiOsPR0y54zHW4 = leer5kfoer4xu5yhh75;
        f4641e54J8UWNHWALQNixXM = Arrays.asList(leer5kfoer4xu5yhh7, leer5kfoer4xu5yhh72, leer5kfoer4xu5yhh73, leer5kfoer4xu5yhh74, leer5kfoer4xu5yhh75);
    }

    public YlLW4G6OV9TFyuw5ix(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f4645zZKhbgvUfsK4AEX3r0 = false;
        this.f4644HJFh0TGMpafqLE9haL = i;
    }

    public static /* synthetic */ void OANkd3mP6AYvwbNLJM(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void R9SAhYMerGybF9OAjL(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f4642husNiw3snxdgZPAGJm);
    }

    public static /* synthetic */ void Y43RdunnpKgpbny0lE(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void zaq8hOURtfwbcX17cG(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public final void G7AC3DWIx9i9fdanjk(SQLiteDatabase sQLiteDatabase, int i) {
        aPyGSIylzVNKPT1Bls(sQLiteDatabase);
        xHA29AmDt6y96AnB3t(sQLiteDatabase, 0, i);
    }

    public final void aPyGSIylzVNKPT1Bls(SQLiteDatabase sQLiteDatabase) {
        if (this.f4645zZKhbgvUfsK4AEX3r0) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f4645zZKhbgvUfsK4AEX3r0 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        G7AC3DWIx9i9fdanjk(sQLiteDatabase, this.f4644HJFh0TGMpafqLE9haL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        G7AC3DWIx9i9fdanjk(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        aPyGSIylzVNKPT1Bls(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        aPyGSIylzVNKPT1Bls(sQLiteDatabase);
        xHA29AmDt6y96AnB3t(sQLiteDatabase, i, i2);
    }

    public final void xHA29AmDt6y96AnB3t(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = f4641e54J8UWNHWALQNixXM;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((lEeR5KfoEr4xU5yHH7) f4641e54J8UWNHWALQNixXM.get(i)).lEeR5KfoEr4xU5yHH7(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
